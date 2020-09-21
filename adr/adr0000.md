# Separation of API and implementation packages

## Status

Status: PROPOSED / ACCEPTED.

## Context

OpenHAB uses OSGi as a runtime.
This runtime promotes clear separation between implementation and contract (API/implementation/SPI) packages.
Once program gets launched OSGi framework such Apache Felix or Eclipse Equinox makes sure that "implementation" packages stay hidden.

On the build tool side we do not have such strong separation because many parts of project are co-developed.
Internal packages and API are in the same source root, and often functionally different elements of code are included in the same bundle.
For example, this means that the `org.openhab.core.items` package is in the same module as `org.openhab.core.items.internal`.
As a result, during compile time we have all of the dependencies together - ones which are required by `core.items` and ones used by `core.items.internal` package. 
While it might not cause major issues for this module, it might have devastating influence over callers who depend on public parts of the API.
During compilation phase they will get polluted by internal package dependencies and quite often use them.
Such approach promotes tight coupling between contract and implementation.
More over, it also promotes exposure of specific implementation classes via public API.

The natural way to deal with such things is to address them with a build tool that includes an appropriate includes/excludes mechanism for dependencies.
It would work properly, but openHAB core is a single jar which makes things even harder.
This means that quite many dependencies get unnecessarily propagated to all callers of public APIs.

openHAB utilizes Apache Karaf for provisioning of the application. 
Karaf provisioning itself is capable of verifying its "features" based on declared modules, bundles, JAR files, etc.
Currently, most of the project features depend on one of two root features, `openhab-core-base` or `openhab-runtime-base`, making no distinction on how particular parts of the framework interact with each other. 
A tiny extension (SPI) bundle that is targeted at a specific framework feature would need to resolve one of the above features, which would then lead to the activation of the entire openhab framework.

Present structure of modules / bundles is as follows:
```
[openhab thing core] <--- [openhab rest core]
```

## Decision

Since openHAB core is a framework, we need to keep strong and clear separation of API and implementation packages.
This will clarify module responsibilities and streamline development of extensions through smaller and easier to maintain modules.
There are also significant opportunities to speed up the build processes and make better use of resolution and graph analysis between framework parts.

We decided that a clear separation between API and implementation packages should be made.
This means that each service intended to be interacted with through an OSGi services API should form its own contract bundle.
New framework modules will separate `internal` package under a `core.<area>.core` bundle and have a distinct interface in a separate module. 
Additionally, functionally separate components should be placed in separate bundles to ensure that unnecessary dependencies are not pulled in to a build.

This is a big change which involves a lot of code relocations and also cleans up the project dependencies which were built up over time. 
By preserving public package names we will be able to keep backward compatibility at an affordable level.

```
[openhab thing api] <--- [openhab rest thing]
        ^
        |
[openhab thing core]
```

Ideally, such a pattern should evolve further to include a common structure used for keeping contracts and implementations separate.  

## Consequences

The major positive consequences are outlined above.
The project will declare clear architectural boundaries making customization of vendor and user builds easier (i.e. distribution with rest but without audio/sitemaps/xtext).

The drawback is a necessary move of tremendous amounts of code which directly translates to a large amount of development effort, harder migration, higher amount of modules to be activated by OSGi framework, and a larger amount of artifacts to be managed. 

By moving and separating implementation and contract, we should make it easier to change, customize and replace any of these with customized parts, if necessary.
Given that key parts of framework were tied together for past decade dissolving their public and internal part will open them for further evolution.

By providing the same package names for public APIs, we will streamline migration.
Eventual conflicts caused by direct (or indirect) use of implementation specific packages will point to places where module boundaries have broken.
These places will require manual intervention to be evicted entirely over time. 

The increased number of bundles to be activated by the OSGi framework is a double-edged sword.
On one hand, it will cause higher CPU consumption during boot and will probably have some impact on the amount of occupied memory.
On the other hand, smaller modules make it possible to utilize parallel execution of the framework and make better use of multiple CPU cores, which are nowadays common.
In cases where the CPU and memory footprint are important, the separation of modules allows for a customized build with only the required parts of the core.
A user or organization who wishes to customize OSH would be able to assemble a single large core jar from existing ones, if it better suited their needs.
Thanks to clear dependency paths it will be possible.

The management of a large list of artifacts can be streamlined with the proper use of Maven bill of material POMs.
Such POM files allow the importing of the dependency management section from one project into another.
By this way we will promote better management of dependencies in downstream projects instead of relying on one big compile pom.