# Add ThingType versioning 

## Status

ACCEPTED

## Context

To allow the system to know if the ThingType definition has changed, a version identifier should be added to the ThingType. This will allow the system to update the thing based on the new Thing Type definition.

The `version` should be added to the `ThingType`, and provided by thing type providers such as the XML provider. This should be reflected into the instantiated `Thing` and provided in the `ThingDTO` for use in the user interface.

Thing Type XML definition -:

```
	<thing-type id="sample" version="2">
```

It shall then be possible for the user to decide to upgrade to the new definition. This functionality could be provided automatically, however this may result in unexpected changes to a users system as channels could be removed. Such updates are therefore considered to be better if manually initiated by the user.

Thing REST response (part) -:

```
{
  UID: "test:sample:505f8d7b12",
  thingTypeUID: "test:sample",
  thingTypeVersion: 2
}
```

A new REST API is to be added to allow the user to change the thing type via the UI. This uses the `/thing/{{thinguid}}/migrate` call. This migrates the specified thing to the latest version of the ThingType.

## Decision

This has minimal impact on the framework, and allows the user and UI to manage the migration of things without the user having to delete and re-add things, which is quite complex as item links also need to be re-added.  Further enhancements could be added to allow this to (optionally) be undertaken automatically.

## Consequences

There should be no impact, however the addition of the `version` attribute in the `thing-type` definition is not backward compatible with ESH definitions.
