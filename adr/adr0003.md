# Type System Refactoring

## Status

ACCEPTED

## Context

Many advanced features require additional information to be added to `Type`s - this could include secondary information as part of a `Command` or `State` update, or security context, `Command` source identifier, priority, etc. The type system structure inheritted from Eclipse SmartHome is difficult to extend due to the class hierarchy. A wrapper could be used around the `Command` or `State`, but this would require considerable rework of core functions.

There is no base class for a `Type` - the ESH structure defines `Type`, `Command` and `State` as interfaces and many concrete `Type`s are derived from an `enum` (eg `OnOffType`, `UpDownType` etc) while others may be derived from Java classes (eg `DecimalType`). The absence of a clear class hierarchy within the framework makes it difficult or impossible for the framework to control and extend the `Type` system - one of the fundamental building blocks of the framework.

It is proposed to rewrite the type system to introduce a clear class hierarchy. `Type`, `Command` and `State` remain as interfaces however an `AbstractBaseType` class is introduced from which all concrete `Type`s are derived. `ComplexType` and `PrimitiveType` are not generally used and are to be removed as they add unnecessary complexity. The type system should be implemented to be compatible at the basic level with the Eclipse SmartHome definitions such that backward compatability with existing bindings is not compromised.

The ESH type system derives `DecimalType` and `QuantityType` from `Number` which makes it impossible to extend the `AbstractBaseType`. To resolve this we provide the core `Number` functionality with a new `NumberType` class. This provides the same interface, but can now extend `AbstractBaseType`. This potentially means that any code within the framework that checks `instanceof Number` will now fail and such checks must instead use `instanceof NumberType`.

## Decision

This change provides a better separation between Java and OpenSmartHouse types, and most importantly allows further enhancements in functionality so is agreed to be implemented.

## Consequences

Compatability is maintained with most bundles expecting the core ESH types and functionality. The main impact that will need to be considered for heritage bundles is if code checks `instanceof Number` - such checks must instead use `instanceof NumberType`.

The `RefreshType` and `UnDefType` from ESH are in the `org.openhab.core.type` package, while all other types are in `org.openhab.core.library.type` package. To avoid unnecessary dependencies, new  `RefreshType` and `UnDefType` classes have been added to `org.openhab.core.library.type` and the existing classes deprecated. This provides backward compatability with ESH/OH where bindings may use these classes and the simple name is used in the events.

Further enhancements and functionality can be made to the type system to extend functionality following the implementation of this work.