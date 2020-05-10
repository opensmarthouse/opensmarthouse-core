---
title: Provisioning and Discovery
---

# Overview

OpenSmartHouse provides features to support provisioning and discovery of devices in support of advanced bindings that require up-front information before a device can be discovered, or to support Enterprise systems where a centralised provisioning system may be employed to manage the _Thing_ lifecycle.

# Provisioning

OpenSmartHouse provides provisioning interfaces to support _Thing_ lifecycle management. The _Provisioning Service_ provides an interface between the binding, the user, and a registry which provides provisioning data. The _Provisioning Provider_ may be a local provider, allowing the local user to enter provisioning data through a UI, or scanning a QR code on a device, or it may be backed by a remote server, providing central provisioning data.

Many modern systems require up-front data before a device can be discovered and added to a network. This data normally consists of a unique identifier, and a security key, and without this information, the user, or the binding, may not be able to detect that the device exists. This information may be provided on the box if a device is purchased through a retail outlet, or it could be provided from a central system. 

Consider the following use cases: 

* A home owner purchases a new device from their local store. They scan the QI code on the box, they plug in the device, click a button on the hub, and it is automatically installed.
* A home owner goes online to purchase a new device from their system supplier. The supplier ships the device to the consumer, and adds the provisioning information to the consumers hub. When the consumer receives the device, they plug in the device, click a button, and it is automatically installed.
* A building manager wants to install new power meters in a block of flats. They record the ID of the device for each flat in their central BMS system and the maintenance personell install the unit. The hub is provisioned with the information and the meter is automatically installed into the BMS network.

To aid these use cases, OpenSmartHouse supports the registration of multiple _Provisioning Providers_. For example, a system could have a local _Provisioning Provider_ to support devices purchased by the user, and a central _Provisioning Provider_ to allow the service provider to offer a more streamlined service for devices purchased directly from them.


![](diagrams/provisioning_overview.png)

