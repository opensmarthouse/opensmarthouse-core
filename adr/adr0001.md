# Introduce Type Provider

## Status

ACCEPTED

## Context

Eclipse SmartHome defined a static type system. This may not be extended, and uses a static class `TypeParser` to create a `Type`. This limits framework modularity and extensability and is generally against OSGi principals.

The architecture is to be changed to introduce a `TypeProvider` service, and `TypeFactory` interfaces. The `TypeProvider` is implemented to provide a `Type`, or set of `Type`s to the system, and `TypeFactory` is used by users to create `Type`s. Between these is a `TypeRegistry` which consumes the `Type`s from multiple `TypeProvider`s, and supplies the `TypeFactory` interface for system users.

The standard core types are to be provided by a `CoreTypeProvider`, and the current static `TypeParser` is retained for backward compatability with ESH/OH, but is not to be used by native _OpenSmartHouse_ bundles. Instead, users requiring `TypeParser` functionality should utilise the `TypeRegistry`.

## Decision

The introduction of the `TypeRegistry` and `TypeProvider` services, and refactoring of the current types to be provided by a `CoreTypeProvider` is implemented. Existing users of `TypeParser` within the _OpenSmartHouse_ core bundles is to be refactored to use these services, and new bundles should avoid using the static `TypeParser`.

## Consequences

This ensures a more modular system without the static dependency on `TypeParser`. It also provides the ability to extend the type system with user defined custom types.

Backward compatability with ESH/OH is retained through the provision of the static `TypeParser` but this is not to be used by native _OpenSmartHouse_ bundles.
