# Add binding events concept

## Status

PROPOSED

## Context

Often a binding will need to provide notifications to users for binding specific administrative purposes. This is not linked to `Item` data, but is designed to provide users feedback on binding specific functions or alerts. Examples of this could be -:

* Alerting the user about failed joining, or a trust issue with devices joining

In general, these notifications are designed for display on an administration UI rather than a user UI, but there is of course nothing to prevent any UI from subsribing for such events.

The concept is to provide a generic binding notification that allows a binding to send a simple notification to users that can be interpretted by UIs in a standard way. This should provide enough information to allow the UI to present the notification in a standard way - showing the severity, and a notification text.

The alerting system may be as simple as real-time notifications direct to the UI. In such case, if the administrative user is not watching the UI, notifications would be lost and not persisted. An enhancement may be to run these through a registry which would allow notifications to be registered and actively dismissed once read by a user with the appropriate access level. At this point, the notification may be removed, or archived to provide an audit trail.

Further extensions to the notification system may be considered to provide images, action buttons etc are considered outside of the scope of this initial proposal.

## Decision

TBD

## Consequences

TBD
