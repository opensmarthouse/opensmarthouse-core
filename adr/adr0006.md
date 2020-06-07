# Add Command and State Attributes 

## Status

PROPOSED

## Context

Items currently have a single value linked to them - eg `ON` or `OFF`, or `OPEN` etc. However often there is the need to provide multiple elements of supporting information along with the `Command` or `State`. Such information may not be required for the system to run, but may be useful for rules, or advanced users where a finer level of system control is desired.

Examples of this for both `State`s and `Command`s are -:

* A `Dimmer` command to change a light level may have a "rate" associated with it to tell the device how quickly to change to the commanded state.
* An `OnOff` state for a door lock may have information such as how the door was opened, or who opened it.

Such information needs to be considered in an atomic way along side the primary item `State` or `Command` and cannot in itself be provided as a separate `Item` since this will be be correlated with a specific event. For example a dimmer may be commanded to turn on with different rates in different rooms or at different times - providing multiple items - one per dimmer could work, however the asynchonous nature of the event bus does not guarantee that a rate setting will be received by the binding prior to the command itself. Current solutions within openHAB include utilising multiple items with the resulting correlation problems and potentially to massively increase the number of items, or the approach recommended by openHAB maintainers is to use JSON encoded strings which may then not be used directly in the UI.

This ADR proposes to add the concept of `Attributes` to all `Command`s and `State`s. An `Attribute` will provide secondary information that is directly linked to the primary event and should not be used to provide data where multiple `Item`s could be used. For example, a sensor providing both temperature and humidity should provide these as separate items, even if they are received from the sensor at exactly the same time.

`Attribute`s are defined within the `CommandDescription` and `StateDescription` in a `Channel` definition. All attributes that a channel supports must be defined in the channel definition to allow the system to provide a level of consistency checking, and for user interfaces to provide the user with a list of attributes a channel may provide. The UI may elect to present these to the user in a similar way to other `Item`s, or the information may be ommitted.

Examples of the definition of attributes is provided below. It is proposed to use a similar construct, and similar data types as configuration parameters - although there is no direct re-use of code, reusing the concept will make it easier for users.

```
    <channel-type id="door_state">
        <item-type>Switch</item-type>
        <label>Door Lock State</label>
        <description>Locks and unlocks the door and maintains the lock state</description>
        <category>Door</category>
        <state>
            <options>
                <option value="0">Open</option>
                <option value="1">Closed</option>
            <options>
            <attributes>
                <attribute id="unlockmethod" type="Number">
                    <name>Unlock Method</name>
                    <description>The way in which the lock was opened</description>
                    <option value="0">Manual</option>
                    <option value="1">RFID</option>
                    <option value="2">UserCode</option>
                </attribute>
                <attribute id="userid" type="String">
                    <name>User Id</name>
                    <description>The user who opened the lock. Not provided for manual unlocking.</description>
                </attribute>
            <attributes>
        </state>
    </channel-type>
```

```
    <channel-type id="dimmer">
        <item-type>Dimmer</item-type>
        <label>Dimmer</label>
        <description>Sets the light level</description>
        <category>Light</category>
        <command>
            <attributes>
                <attribute id="transition" type="Number">
                    <name>Transition Duration</name>
                    <description>Sets the transition duration in milliseconds</description>
                    <maximum>5000</number>
                </attribute>
            <attributes>
        </command>
    </channel-type>
```

Ideally, commonly used attributes should be standardised across bindings in the same way as system channels are with channel definitions. This will improve the user experience by ensuring a unified solution no matter what binding is in use.


## Decision

TBD

## Consequences

TBD