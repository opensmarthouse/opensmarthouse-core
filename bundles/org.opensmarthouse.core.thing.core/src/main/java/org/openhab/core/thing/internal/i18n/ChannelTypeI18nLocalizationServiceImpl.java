/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
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
package org.openhab.core.thing.internal.i18n;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.i18n.TranslationProvider;
import org.openhab.core.thing.i18n.ChannelTypeI18nLocalizationService;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeBuilder;
import org.openhab.core.thing.type.ChannelTypeBuilderFactory;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.thing.type.StateChannelTypeBuilder;
import org.openhab.core.thing.type.TriggerChannelTypeBuilder;
import org.openhab.core.types.CommandDescription;
import org.openhab.core.types.CommandDescriptionBuilder;
import org.openhab.core.types.CommandDescriptionBuilderFactory;
import org.openhab.core.types.CommandOption;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.openhab.core.types.StateOption;
import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Default implementation of {@link org.openhab.core.thing.i18n.ChannelGroupTypeI18nLocalizationService}.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component(service = ChannelTypeI18nLocalizationService.class)
@NonNullByDefault
public class ChannelTypeI18nLocalizationServiceImpl implements ChannelTypeI18nLocalizationService {

    private final ThingTypeI18nUtil thingTypeI18nUtil;
    private final ChannelTypeBuilderFactory channelTypeBuilderFactory;
    private final StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory;
    private final CommandDescriptionBuilderFactory commandDescriptionBuilderFactory;

    @Activate
    public ChannelTypeI18nLocalizationServiceImpl(final @Reference TranslationProvider i18nProvider,
            final @Reference ChannelTypeBuilderFactory channelTypeBuilderFactory,
            final @Reference StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory,
            final @Reference CommandDescriptionBuilderFactory commandDescriptionBuilderFactory) {
        this.thingTypeI18nUtil = new ThingTypeI18nUtil(i18nProvider);
        this.channelTypeBuilderFactory = channelTypeBuilderFactory;
        this.stateDescriptionFragmentBuilderFactory = stateDescriptionFragmentBuilderFactory;
        this.commandDescriptionBuilderFactory = commandDescriptionBuilderFactory;
    }

    @Override
    public @Nullable String createLocalizedStatePattern(final Bundle bundle, String pattern,
            final ChannelTypeUID channelTypeUID, final @Nullable Locale locale) {
        return thingTypeI18nUtil.getChannelStatePattern(bundle, channelTypeUID, pattern, locale);
    }

    @Override
    public List<StateOption> createLocalizedStateOptions(final Bundle bundle, List<StateOption> stateOptions,
            final ChannelTypeUID channelTypeUID, final @Nullable Locale locale) {
        List<StateOption> localizedOptions = new ArrayList<>();
        for (final StateOption stateOption : stateOptions) {
            String optionLabel = stateOption.getLabel();
            if (optionLabel != null) {
                optionLabel = thingTypeI18nUtil.getChannelStateOption(bundle, channelTypeUID, stateOption.getValue(),
                        optionLabel, locale);
            }
            localizedOptions.add(new StateOption(stateOption.getValue(), optionLabel));
        }
        return localizedOptions;
    }

    @Override
    public @Nullable StateDescription createLocalizedStateDescription(final Bundle bundle,
            final @Nullable StateDescription state, final ChannelTypeUID channelTypeUID,
            final @Nullable Locale locale) {
        if (state == null) {
            return null;
        }

        String localizedPattern = state.getPattern();
        if (localizedPattern != null) {
            localizedPattern = createLocalizedStatePattern(bundle, localizedPattern, channelTypeUID, locale);
        }
        List<StateOption> localizedOptions = createLocalizedStateOptions(bundle, state.getOptions(), channelTypeUID,
                locale);

        StateDescriptionFragmentBuilder builder = stateDescriptionFragmentBuilderFactory.create(state);
        if (localizedPattern != null) {
            builder.withPattern(localizedPattern);
        }
        return builder.withOptions(localizedOptions).build().toStateDescription();
    }

    @Override
    public List<CommandOption> createLocalizedCommandOptions(final Bundle bundle, List<CommandOption> commandOptions,
            final ChannelTypeUID channelTypeUID, final @Nullable Locale locale) {
        List<CommandOption> localizedOptions = new ArrayList<>();
        for (final CommandOption commandOption : commandOptions) {
            String optionLabel = commandOption.getLabel();
            if (optionLabel != null) {
                optionLabel = thingTypeI18nUtil.getChannelCommandOption(bundle, channelTypeUID,
                        commandOption.getCommand(), optionLabel, locale);
            }
            localizedOptions.add(new CommandOption(commandOption.getCommand(), optionLabel));
        }
        return localizedOptions;
    }

    @Override
    public @Nullable CommandDescription createLocalizedCommandDescription(final Bundle bundle,
            final @Nullable CommandDescription command, final ChannelTypeUID channelTypeUID,
            final @Nullable Locale locale) {
        if (command == null) {
            return null;
        }

        List<CommandOption> localizedOptions = createLocalizedCommandOptions(bundle, command.getCommandOptions(),
                channelTypeUID, locale);

        CommandDescriptionBuilder commandDescriptionBuilder = commandDescriptionBuilderFactory.create();
        return commandDescriptionBuilder.withCommandOptions(localizedOptions).build();
    }

    @Override
    public ChannelType createLocalizedChannelType(Bundle bundle, ChannelType channelType, @Nullable Locale locale) {
        ChannelTypeUID channelTypeUID = channelType.getUID();
        String defaultLabel = channelType.getLabel();
        String label = thingTypeI18nUtil.getChannelLabel(bundle, channelTypeUID, defaultLabel, locale);
        String description = thingTypeI18nUtil.getChannelDescription(bundle, channelTypeUID,
                channelType.getDescription(), locale);

        switch (channelType.getKind()) {
            case STATE:
                StateDescription state = createLocalizedStateDescription(bundle, channelType.getState(), channelTypeUID,
                        locale);
                CommandDescription command = createLocalizedCommandDescription(bundle,
                        channelType.getCommandDescription(), channelTypeUID, locale);

                StateChannelTypeBuilder stateBuilder = channelTypeBuilderFactory
                        .state(channelTypeUID, label == null ? defaultLabel : label, channelType.getItemType())
                        .isAdvanced(channelType.isAdvanced()).withCategory(channelType.getCategory())
                        .withConfigDescriptionURI(channelType.getConfigDescriptionURI()).withTags(channelType.getTags())
                        .withStateDescription(state).withAutoUpdatePolicy(channelType.getAutoUpdatePolicy())
                        .withCommandDescription(command);
                if (description != null) {
                    stateBuilder.withDescription(description);
                }
                return stateBuilder.build();
            case TRIGGER:
                TriggerChannelTypeBuilder triggerBuilder = channelTypeBuilderFactory
                        .trigger(channelTypeUID, label == null ? defaultLabel : label)
                        .isAdvanced(channelType.isAdvanced()).withCategory(channelType.getCategory())
                        .withConfigDescriptionURI(channelType.getConfigDescriptionURI()).withTags(channelType.getTags())
                        .withEventDescription(channelType.getEvent());
                if (description != null) {
                    triggerBuilder.withDescription(description);
                }
                return triggerBuilder.build();
            default:
                return new ChannelType(channelTypeUID, channelType.isAdvanced(), channelType.getItemType(),
                        channelType.getKind(), label == null ? defaultLabel : label, description,
                        channelType.getCategory(), channelType.getTags(), channelType.getState(),
                        channelType.getEvent(), channelType.getConfigDescriptionURI(),
                        channelType.getAutoUpdatePolicy());
        }
    }

}
