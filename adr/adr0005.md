# Differentiate thing handler and device configuration

## Status

ACCEPTED

## Context

It has long been stated in ESH that the existing Configuration Parameter API is only meant for Thing Handler configuration and not device configuration. Many bindings use this for device configuration as well as handler configuration. From discussions on ESH, the following distinction was noted -:

* Handler configuration is merely about configuration of communication parameters, like ip address/host & port, timeouts, access tokens, thing ids, etc.
* Thing configuration should describe and model the configuration of the physical device. It should not only provide a view but provide an interface to alter the thing configuration. It is the bindings responsibility to implement the read/write access to the corresponding thing.

It is proposed to keep things simple - levering off the existing configuration parameter definition that are already being used for device configuration. There should be an indication in the parameter that this is a thing configuration, and there should be a method to define device specific information that the binding can use when sending data to the device.

The proposal is to add a new `device-properties` element to the configuration description. The defines a set of properties similar to other sets of properties defines in the XML descriptions. The properties may be used by the binding to specify binding and device specific information that is interpretted by the binding when sending the configuration to the device. This is implemented in `ConfigurationParameter` with the addition of the `ParameterDeviceProperty` class which contains the binding defined properties required to configure the device. If the `ConfigurationParameter` contains more than one `ParameterDeviceProperty` it is considered to be a device parameter rather than a handler parameter.

Despite the ESH configuration definitions apparently only being for handler configuration, there is a `ConfigStatusProvider` service that allows the binding to provide configuration status via the `ConfigStatusMessage.Type` enum. This allows the binding to set status as `PENDING`, which "should be used if the transmission of the configuration parameter to the entity is pending". This should be persisted along with the `ConfigurationParameter` so that the binding is able to establish if configuration still needs to be sent to the device when it starts. Binding users wanting to provide the configuration status should extend the `ConfigStatusThingHandler`.

To allow the device property information to be utilised in the binding, a new method `getConfigParameterDescription` is added to the `BaseThingHandler` to allow the binding to retrieve the configuration description for a parameter (and hence the `ParameterDeviceProperty`)

Currently within the core, configuration changes are only persisted by the binding in the `ThingHandler`. It is therefore the bindings responsibility to manage the `PENDING` flag if it implements the `ConfigStatusProvider`. In general the binding shall set the status to `PENDING` if it updates any configuration, and update the status appropriately once the configuration in the device is confirmed. The `ConfigStatusService` will persist the state of all parameters since it does not have access to the configuration descriptions, and the binding must manage the status.

A binding may get the current persisted state of the configuration status by calling `getPersistedConfigStatusInfo`. This will return the persisted state from the previous request to `ConfigStatusProvider` and allows bindings to retrieve the state on startup.


Example XML configuration -:

```
    <parameter name="param-name">
        ...
        <device-properties>
            <property name="parameter">12</property>
            <property name="size">2</property>
        </device-properties>
    </parameter>
```

Example ThingHandler usage during initialisation -:

```
    ConfigStatusInfo configStatusInfo = getPersistedConfigStatusInfo();
    for (String parameterName : getConfig().getProperties().keySet()) {
        ConfigDescriptionParameter configDescription = getConfigParameterDescription(parameterName);
        if (configDescription.getDeviceProperties().isEmpty()) {
            // Parameter is not a remote parameter
            continue;
        }

        Collection<ConfigStatusMessage> configStatus = configStatusInfo.getConfigStatusMessages(parameterName);
        if (configStatus.isEmpty() || configStatus.iterator().next().type != Type.PENDING) {
            // Parameter update is not pending
            continue;
        }
            
        // Update the parameter as the update was PENDING when the handler was shut down
    }
```

Example ThingHandler usage during `handleConfigurationUpdate` -:

```
    Configuration configuration = editConfiguration();
    for (Entry<String, Object> configurationParameter : configurationParameters.entrySet()) {
        configuration.put(configurationParameter.getKey(), configurationParameter.getValue());

        ConfigDescriptionParameter configDescription = getConfigParameterDescription(
                configurationParameter.getKey());
        if (configDescription.getDeviceProperties().isEmpty()) {
            // Configuration to be sent to remote device
        }
    }
```

## Decision

The addition of the `ParameterDeviceProperty` allows the system to properly differentiate between handler configuration and device configuration. The persisting of `ConfigStatusMessage`s allows the binding to know on startup if `PENDING` configuration still needs to be transferred to the device. These changes have minimal impact on the wider system and allow _OpenSmartHouse_ to better support the device configuration system.

## Consequences

This change has limited impact on the core architecture. There is one exception and that is that the `Storage` interface is now a dependency of the `ConfigStatusProvider`. This should not be an issue given `Storage` is a fundamental service required throughout the framework.
