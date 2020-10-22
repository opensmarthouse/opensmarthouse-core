# _OpenSmartHouse_ Core

This project contains core bundles of the _OpenSmartHouse_ runtime.


_OpenSmartHouse_ Core is not a product itself, but a framework on which to build a solutions. _OpenSmartHouse_ is highly modular to allow it to support systems on devices with highly constrained resources without additional bloat.

_OpenSmartHouse_ is based on a fork of Eclipse Smart Home and is designed to be kept in sync with _OpenHAB_ as much as possible. _OpenSmartHouse_ has additional features to support enterprise systems and advanced use cases that are not required within _OpenHAB_.


## Building with Maven

This project ships Maven poms and rely on use of external repositories.
By default opensmarthouse-parent pulls openHAB repositories.
If you wish to isolate and control where you get from your dependencies you can use maven mirrors.
Example file `.mvn/settings.xml` use placeholders set in `.mvn/maven.config` to override Maven central and openhab repos with custom ones.
You just need to call `mvn -s .mvn/settings.xml`.

It is recommended to use own repository manager with CI/CD builds.
Adoption is fairly easy with overriding contents of two above config files.
