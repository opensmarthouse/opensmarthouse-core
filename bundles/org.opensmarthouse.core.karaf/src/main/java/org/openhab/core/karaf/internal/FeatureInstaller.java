/**
 * Copyright (c) 2020-2021 Contributors to the OpenSmartHouse project
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.karaf.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.karaf.features.Feature;
import org.apache.karaf.features.FeaturesService;
import org.openhab.core.config.core.ConfigurableService;
import org.openhab.core.events.Event;
import org.openhab.core.events.EventPublisher;
import org.openhab.core.extension.ExtensionEventFactory;
import org.opensmarthouse.core.OpenSmartHouse;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.ConfigurationEvent;
import org.osgi.service.cm.ConfigurationListener;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This service reads addons.cfg and installs listed add-ons (= Karaf features) and the selected package.
 * It furthermore allows configuration of the base package through the UI as well as administrating Karaf to
 * access remote repos and certain feature repos like for experimental features.
 *
 * @author Kai Kreuzer - Initial contribution
 */
@Component(name = "org.openhab.addons", service = { FeatureInstaller.class, ConfigurationListener.class })
@ConfigurableService(category = "system", label = "Add-on Management", description_uri = FeatureInstaller.CONFIG_URI)
public class FeatureInstaller implements ConfigurationListener {

    protected static final String CONFIG_URI = "system:addons";

    public static final String EXTENSION_TYPE_ACTION = "action";
    public static final String EXTENSION_TYPE_BINDING = "binding";
    public static final String EXTENSION_TYPE_MISC = "misc";
    public static final String EXTENSION_TYPE_PERSISTENCE = "persistence";
    public static final String EXTENSION_TYPE_TRANSFORMATION = "transformation";
    public static final String EXTENSION_TYPE_UI = "ui";
    public static final String EXTENSION_TYPE_VOICE = "voice";

    public static final String SIMPLE_PACKAGE = "simple";
    public static final String MINIMAL_PACKAGE = "minimal";
    private static final String CFG_REMOTE = "remote";

    private static final String PAX_URL_PID = "org.ops4j.pax.url.mvn";
    private static final String ADDONS_PID = "org.openhab.addons";
    private static final String PROPERTY_MVN_REPOS = "org.ops4j.pax.url.mvn.repositories";

    public static final String STANDARD_PACKAGE = "standard";
    public static final String PREFIX = "openhab-";
    public static final String PREFIX_PACKAGE = "package-";

    public static final String[] EXTENSION_TYPES = new String[] { EXTENSION_TYPE_ACTION, EXTENSION_TYPE_BINDING,
            EXTENSION_TYPE_MISC, EXTENSION_TYPE_PERSISTENCE, EXTENSION_TYPE_TRANSFORMATION, EXTENSION_TYPE_UI,
            EXTENSION_TYPE_VOICE };

    private final Logger logger = LoggerFactory.getLogger(FeatureInstaller.class);

    private String onlineRepoUrl = null;

    private final ConfigurationAdmin configurationAdmin;
    private final FeaturesService featuresService;
    private static EventPublisher eventPublisher;

    private ScheduledExecutorService scheduler;

    private boolean paxCfgUpdated = true; // a flag used to check whether CM has already successfully updated the pax
                                          // configuration as this must be waited for before trying to add feature repos

    private static String currentPackage = null;

    @Activate
    public FeatureInstaller(final @Reference ConfigurationAdmin configurationAdmin,
            final @Reference FeaturesService featuresService) {
        this.configurationAdmin = configurationAdmin;
        this.featuresService = featuresService;
    }

    @Reference
    protected void setEventPublisher(EventPublisher eventPublisher) {
        FeatureInstaller.eventPublisher = eventPublisher;
    }

    protected void unsetEventPublisher(EventPublisher eventPublisher) {
        FeatureInstaller.eventPublisher = null;
    }

    @Activate
    protected void activate(final Map<String, Object> config) {
        setOnlineRepoUrl();
        modified(config);
        scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleWithFixedDelay(() -> {
            logger.debug("Running scheduled sync job");
            try {
                Dictionary<String, Object> cfg = configurationAdmin.getConfiguration(ADDONS_PID).getProperties();
                final Map<String, Object> cfgMap = new HashMap<>();
                final Enumeration<String> enumeration = cfg.keys();
                while (enumeration.hasMoreElements()) {
                    final String key = enumeration.nextElement();
                    cfgMap.put(key, cfg.get(key));
                }
                modified(cfgMap);
            } catch (IOException e) {
                logger.debug("Failed to retrieve the addons configuration from configuration admin: {}",
                        e.getMessage());
            }
        }, 1, 1, TimeUnit.MINUTES);
    }

    @Deactivate
    protected void deactivate() {
        if (scheduler != null) {
            scheduler.shutdownNow();
            scheduler = null;
        }
    }

    @Modified
    protected void modified(final Map<String, Object> config) {
        boolean changed = false;
        boolean online = (config.get(CFG_REMOTE) == null && getOnlineStatus())
                || (config.get(CFG_REMOTE) != null && "true".equals(config.get(CFG_REMOTE).toString()));
        if (getOnlineStatus() != online) {
            changed = setOnlineStatus(online);
        }

        final boolean configChanged = changed;
        if (configChanged) {
            // let's set the flag immediately, so that we do not miss the event
            paxCfgUpdated = false;
        }

        final FeaturesService service = featuresService;
        ExecutorService scheduler = Executors.newSingleThreadExecutor();

        scheduler.execute(() -> {
            if (configChanged) {
                waitForConfigUpdateEvent();
            }
            if (installPackage(service, config)) {
                // our package selection has changed, so let's wait for the values to be available in config admin
                // which we will receive as another call to modified
                return;
            }
            installAddons(service, config);
        });
    }

    private void waitForConfigUpdateEvent() {
        int counter = 0;
        // wait up to 5 seconds for the config update event
        while (!paxCfgUpdated && counter++ < 50) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public boolean addAddon(String type, String id) {
        try {
            Configuration cfg = configurationAdmin.getConfiguration(OpenSmartHouse.ADDONS_SERVICE_PID, null);
            Dictionary<String, Object> props = cfg.getProperties();
            if (props == null) {
                // properties can be empty if PID does not exist
                props = new Hashtable<>();
            }
            String[] addonIds = Optional.of(props).map(dict -> dict.get(type)) //
                    .filter(Objects::nonNull) //
                    .map(Object::toString) //
                    .map(str -> str.split(",")) //
                    .orElse(new String[0]);
            List<String> trimmedAddonIds = Arrays.stream(addonIds).map(addonId -> addonId.trim())
                    .collect(Collectors.toList());
            if (!trimmedAddonIds.contains(id)) {
                List<String> newAddonIds = new ArrayList<>(trimmedAddonIds.size() + 1);
                newAddonIds.addAll(trimmedAddonIds);
                newAddonIds.add(id);
                props.put(type, newAddonIds.stream().collect(Collectors.joining(",")));
                cfg.update(props);
                return true;
            } else {
                // it is already contained
                return false;
            }
        } catch (IOException e) {
            logger.warn("Adding add-on 'openhab-{}-{}' failed: {}", type, id, e.getMessage());
            return false;
        }
    }

    public boolean removeAddon(String type, String id) {
        try {
            Configuration cfg = configurationAdmin.getConfiguration(OpenSmartHouse.ADDONS_SERVICE_PID, null);
            Dictionary<String, Object> props = cfg.getProperties();
            Object typeProp = props.get(type);
            String[] addonIds = typeProp != null ? typeProp.toString().split(",") : new String[0];
            List<String> trimmedAddonIds = Arrays.stream(addonIds).map(addonId -> addonId.trim())
                    .collect(Collectors.toList());
            if (trimmedAddonIds.contains(id)) {
                List<String> newAddonIds = new ArrayList<>(trimmedAddonIds);
                boolean success = newAddonIds.remove(id);
                props.put(type, newAddonIds.stream().collect(Collectors.joining(",")));
                cfg.update(props);
                return success;
            } else {
                // it is not contained, so we cannot remove it
                return false;
            }
        } catch (IOException e) {
            logger.warn("Removing add-on 'openhab-{}-{}' failed: {}", type, id, e.getMessage());
            return false;
        }
    }

    private void setOnlineRepoUrl() {
        Properties prop = new Properties();

        Path versionFilePath = Paths.get(OpenSmartHouse.getUserDataFolder(), "etc", "version.properties");
        try (FileInputStream fis = new FileInputStream(versionFilePath.toFile())) {
            prop.load(fis);
        } catch (Exception e) {
            logger.warn("Cannot determine online repo url - online repo support will be disabled. Error: {}",
                    e.getMessage());
        }

        String repo = prop.getProperty("online-repo");
        if (repo != null && !repo.trim().isEmpty()) {
            this.onlineRepoUrl = repo.trim() + "@id=openhab@snapshots";
        } else {
            logger.warn("Cannot determine online repo url - online repo support will be disabled.");
        }
    }

    private boolean getOnlineStatus() {
        if (onlineRepoUrl != null) {
            try {
                Configuration paxCfg = configurationAdmin.getConfiguration(PAX_URL_PID, null);
                Dictionary<String, Object> properties = paxCfg.getProperties();
                if (properties == null) {
                    return false;
                }
                Object repos = properties.get(PROPERTY_MVN_REPOS);
                List<String> repoCfg;
                if (repos instanceof String) {
                    repoCfg = List.of(((String) repos).split(","));
                    return repoCfg.contains(onlineRepoUrl);
                }
            } catch (IOException e) {
                logger.error("Failed getting the add-on management online/offline mode: {}", e.getMessage());
            }
        }
        return false;
    }

    private boolean setOnlineStatus(boolean status) {
        boolean changed = false;
        if (onlineRepoUrl != null) {
            try {
                Configuration paxCfg = configurationAdmin.getConfiguration(PAX_URL_PID, null);
                paxCfg.setBundleLocation("?");
                Dictionary<String, Object> properties = paxCfg.getProperties();
                if (properties == null) {
                    properties = new Hashtable<>();
                }
                List<String> repoCfg = new ArrayList<>();
                Object repos = properties.get(PROPERTY_MVN_REPOS);
                if (repos instanceof String) {
                    repoCfg = new ArrayList<>(Arrays.asList(((String) repos).split(",")));
                    repoCfg.remove("");
                }
                if (status) {
                    if (!repoCfg.contains(onlineRepoUrl)) {
                        repoCfg.add(onlineRepoUrl);
                        changed = true;
                        logger.debug("Added repo '{}' to feature repo list.", onlineRepoUrl);
                    }
                } else {
                    if (repoCfg.contains(onlineRepoUrl)) {
                        repoCfg.remove(onlineRepoUrl);
                        changed = true;
                        logger.debug("Removed repo '{}' from feature repo list.", onlineRepoUrl);
                    }
                }
                if (changed) {
                    properties.put(PROPERTY_MVN_REPOS, repoCfg.stream().collect(Collectors.joining(",")));
                    paxCfg.update(properties);
                }
            } catch (IOException e) {
                logger.error("Failed setting the add-on management online/offline mode: {}", e.getMessage());
            }
        }
        return changed;
    }

    private synchronized void installAddons(final FeaturesService service, final Map<String, Object> config) {
        final Set<String> currentAddons = new HashSet<>(); // the currently installed ones
        final Set<String> targetAddons = new HashSet<>(); // the target we want to have installed afterwards
        final Set<String> installAddons = new HashSet<>(); // the ones to be installed (the diff)

        for (String type : EXTENSION_TYPES) {
            Object install = config.get(type);
            if (install instanceof String) {
                String[] entries = ((String) install).split(",");
                try {
                    Feature[] features = service.listInstalledFeatures();
                    for (String addon : entries) {
                        if (addon != null && !addon.isEmpty()) {
                            String id = PREFIX + type + "-" + addon.trim();
                            targetAddons.add(id);
                            if (!isInstalled(features, id)) {
                                installAddons.add(id);
                            }
                        }
                    }

                    // we collect all installed addons
                    for (String addon : getAllAddonsOfType(service, type)) {
                        if (addon != null && !addon.isEmpty()) {
                            String id = PREFIX + type + "-" + addon.trim();
                            if (isInstalled(features, id)) {
                                currentAddons.add(id);
                            }
                        }
                    }
                } catch (Exception e) {
                    logger.error("Failed retrieving features: {}", e.getMessage());
                }
            }
        }

        // now calculate what we have to uninstall: all current ones that are not part of the target anymore
        Set<String> uninstallAddons = currentAddons.stream().filter(addon -> !targetAddons.contains(addon))
                .collect(Collectors.toSet());

        // do the installation
        if (!installAddons.isEmpty()) {
            installFeatures(service, installAddons);
        }

        // do the de-installation
        if (!uninstallAddons.isEmpty()) {
            uninstallFeatures(service, uninstallAddons);
        }
    }

    private Set<String> getAllAddonsOfType(FeaturesService featuresService, String type) {
        Set<String> addons = new HashSet<>();
        String prefix = FeatureInstaller.PREFIX + type + "-";
        try {
            for (Feature feature : featuresService.listFeatures()) {
                if (feature.getName().startsWith(prefix)) {
                    addons.add(feature.getName().substring(prefix.length()));
                }
            }
        } catch (Exception e) {
            logger.error("Failed retrieving features: {}", e.getMessage());
        }
        return addons;
    }

    private synchronized void installFeatures(FeaturesService featuresService, Set<String> addons) {
        try {
            if (logger.isDebugEnabled()) {
                logger.debug("Installing '{}'", addons.stream().collect(Collectors.joining(", ")));
            }
            featuresService.installFeatures(addons,
                    EnumSet.of(FeaturesService.Option.Upgrade, FeaturesService.Option.NoFailOnFeatureNotFound));
            try {
                Feature[] features = featuresService.listInstalledFeatures();
                Set<String> installed = new HashSet<>();
                Set<String> failed = new HashSet<>();

                for (String addon : addons) {
                    if (isInstalled(features, addon)) {
                        installed.add(addon);
                    } else {
                        failed.add(addon);
                    }
                }

                if (!installed.isEmpty() && logger.isDebugEnabled()) {
                    logger.debug("Installed '{}'", installed.stream().collect(Collectors.joining(", ")));
                }
                if (!failed.isEmpty()) {
                    logger.error("Failed installing '{}'", failed.stream().collect(Collectors.joining(", ")));
                }

                for (String addon : installed) {
                    postInstalledEvent(addon);
                }
            } catch (Exception e) {
                logger.error("Failed retrieving features: {}", e.getMessage());
            }
        } catch (Exception e) {
            logger.error("Failed installing '{}': {}", addons.stream().collect(Collectors.joining(", ")),
                    e.getMessage());
        }
    }

    private synchronized void uninstallFeatures(FeaturesService featuresService, Set<String> addons) {
        for (String addon : addons) {
            uninstallFeature(featuresService, addon);
        }
    }

    private synchronized boolean installFeature(FeaturesService featuresService, String name) {
        try {
            Feature[] features = featuresService.listInstalledFeatures();
            if (!isInstalled(features, name)) {
                featuresService.installFeature(name);
                features = featuresService.listInstalledFeatures();
                if (isInstalled(features, name)) {
                    logger.debug("Installed '{}'", name);
                    postInstalledEvent(name);
                    return true;
                }
            }
        } catch (Exception e) {
            logger.error("Failed installing '{}': {}", name, e.getMessage());
        }
        return false;
    }

    private synchronized boolean uninstallFeature(FeaturesService featuresService, String name) {
        try {
            Feature[] features = featuresService.listInstalledFeatures();
            if (isInstalled(features, name)) {
                featuresService.uninstallFeature(name);
                logger.debug("Uninstalled '{}'", name);
                postUninstalledEvent(name);
                return true;
            }
        } catch (Exception e) {
            logger.debug("Failed uninstalling '{}': {}", name, e.getMessage());
        }
        return false;
    }

    private synchronized boolean installPackage(FeaturesService featuresService, final Map<String, Object> config) {
        boolean configChanged = false;
        Object packageName = config.get(OpenSmartHouse.CFG_PACKAGE);
        if (packageName instanceof String) {
            currentPackage = (String) packageName;
            String fullName = PREFIX + PREFIX_PACKAGE + ((String) packageName).trim();
            if (MINIMAL_PACKAGE.equals(currentPackage)) {
                // no changes are done to the add-ons list, so the installer should proceed
                configChanged = false;
            } else {
                if (installFeature(featuresService, fullName)) {
                    configChanged = true;
                }
            }

            // uninstall all other packages
            try {
                for (Feature feature : featuresService.listFeatures()) {
                    if (feature.getName().startsWith(PREFIX + PREFIX_PACKAGE) && !feature.getName().equals(fullName)) {
                        uninstallFeature(featuresService, feature.getName());
                    }
                }
            } catch (Exception e) {
                logger.error("Failed retrieving features: {}", e.getMessage());
            }
        }
        return configChanged;
    }

    private boolean isInstalled(Feature[] features, String name) {
        try {
            for (Feature feature : features) {
                if (feature.getName().equals(name)) {
                    return true;
                }
            }
        } catch (Exception e) {
            logger.error("Failed retrieving features: {}", e.getMessage());
        }
        return false;
    }

    @Override
    public void configurationEvent(ConfigurationEvent event) {
        if (PAX_URL_PID.equals(event.getPid()) && event.getType() == ConfigurationEvent.CM_UPDATED) {
            paxCfgUpdated = true;
        }
    }

    private static void postInstalledEvent(String featureName) {
        String extensionId = featureName.substring(PREFIX.length());
        if (eventPublisher != null) {
            Event event = ExtensionEventFactory.createExtensionInstalledEvent(extensionId);
            eventPublisher.post(event);
        }
    }

    private static void postUninstalledEvent(String featureName) {
        String extensionId = featureName.substring(PREFIX.length());
        if (eventPublisher != null) {
            Event event = ExtensionEventFactory.createExtensionUninstalledEvent(extensionId);
            eventPublisher.post(event);
        }
    }

    String getCurrentPackage() {
        return currentPackage;
    }
}
