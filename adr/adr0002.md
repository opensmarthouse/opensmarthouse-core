# Thing Provisioning Framework

## Status

PROPOSED

## Context

Many modern systems require up-front data before a device can be discovered and added to a network. To facilitate this, a Provisioning system is to be added as part of the Discovery services, with the aim to provide the information required for devices to join the network.

Two use cases are currently forseen.

1. Users must provide device information prior to discovery. This information is managed by the binding, however a consistent way is needed to provide this data from the user, to the binding. An example of this is systems may require a cryptographic key to be provided before a device is able to be discovered.
2. Centrally administered systems may want to provision information about a device from a central repository. Thus a user could be shipped the device, plug it in, and it would automatically be discovered and added with little user interaction.

It is proposed to add a `ProvisioningService` and `ProvisioningRegistry` to act as an interface between the provisioning information (from the user, or other system) and the binding. The binding will be able to query the `ProvisioningRegistry` to retrieve information about any provisioned devices when discovery is enabled, and will be able to update the `ProvisioningRegistry` if a device is successfully discovered. Additionally, the `ProvisioningRegistry` can be queryable to allow the status of provisioned devices to be retrieved.

The provisioning information provided through the `ProvisioningRegistry` is a set of properties that are interpretted by the binding. These are linked by a `ProvisioningUID` which is used to identify the device. This is akin to a `ThingTypeUID`, however used to identify the device before it is discovered.

## Decision

TBD

## Consequences

TBD