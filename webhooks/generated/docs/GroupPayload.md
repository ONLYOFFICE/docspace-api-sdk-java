

# GroupPayload

The group a group.* webhook is about.  The payload describes the group at the time of the event, without the list of its members. A `group.updated` delivery follows a change made through the group API - a rename, a new manager, or members added, removed, replaced or moved to another group - but does not say which of these happened: compare the payload with the previous one, and read the current members with `GET api/2.0/group/{id}` when they are needed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the group the event is about; &#x60;GET api/2.0/group/{id}&#x60; returns the group with its members by it. |  [optional] |
|**name** | **String** | The name of the group as it is shown in the portal, after a rename the new one. |  [optional] |
|**parent** | **UUID** | The parent group ID; absent for a top-level group. |  [optional] |
|**category** | **UUID** | The ID of the group category: the empty GUID for the groups members create, and one fixed category ID for the built-in system groups. |  [optional] |
|**isLDAP** | **Boolean** | Whether the group is synchronized from an LDAP directory, where its name and members are managed; &#x60;false&#x60; for a group created in the portal. |  [optional] |
|**isSystem** | **Boolean** | &#x60;true&#x60; for a built-in system group, whose members follow from the user types rather than from membership changes. Absent for every other group, never &#x60;false&#x60;. |  [optional] |
|**manager** | [**UserSummaryPayload**](UserSummaryPayload.md) |  |  [optional] |
|**membersCount** | **Integer** | How many users belong to the group at the time of the event, disabled accounts not counted; 0 for a group without members. |  [optional] |



