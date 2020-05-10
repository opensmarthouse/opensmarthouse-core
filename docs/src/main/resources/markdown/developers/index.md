---
title: Developers Guide
---

# Overview

_OpenSmartHouse_ is a Smart Building automation framework. The documentation found here aims to support developers wishing to understand the framework to add functionality to the core, or extend the functionality through bindings that interface to hardware, or those that wish to integrate the framework within a wider system.

_OpenSmartHouse_ is written in Java - this provides a portable system that can be deployed to a wide range of hardware. It is also running within an OSGi container - this provides services that allow parts of the framework to interact, and for parts of the system to be modified or upgraded.

This guide is written with the developer in mind, but understanding some of the concepts can also be useful for the user. We aim to provide information on the architecture, build environment and major APIs within the framework to allow a developer to modify and extend the system as they require. Of course we are also available to support such integration if required.

* [Fundamental Concepts](fundamentals/index.md)
* [System Architecture](architecture/index.md)
  * [OSGi Fundamentals](architecture/osgi/index.md)
* [Build System](buildsystem/index.md)
* [Discovery Services](discovery/index.md)
* [Bindings](bindings/index.md)
* [Automation Services](automation/index.md)
* [Persistence Services](persistence/index.md)
* [Audio Services](audio/index.md)
* [Transformations](transformations/index.md)
