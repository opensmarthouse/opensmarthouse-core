# Provide Discovery Index

## Status

PROPOSED

## Context

With large bindings with many things, a ThingType and ThingHandler may not be implemented for each Thing. Instead the ThingHandler may implement dynamic definition by interrogating the device, or through a static definition via the Thing XML file. This may be implemented as a single ThingHandler for numerous different devices whose functionality is defined or discovered.  In cases where the Thing is statically defined, there will be some discovery information that is retieved from the device and used to link to the ThingType, and it is desirable for the ThingType definition and the discovery information to be defined in a single place.

Functionally, the ThingType definition, and Discovery information should be separate. The proposal here is to introduce a `DiscoveryIndex` service which provides the binding specific thing properties linked to a `ThingThypeUID`. `DiscoveryProperties` are provided by a `DiscoveryIndexProvider` which the binding can query.

The `XmlThingTypeProvider` should be modified to also implement `DiscoveryIndexProvider`, and the ThingType XML definition should be updated to introduce a `discovery-properties` section which can include the discovery information to be passed to the binding. The `discovery-properties` section is similar to the existing Thing `properties` definition, but dedicated to the `DiscoveryIndex` function.

## Decision

TBD

## Consequences

TBD