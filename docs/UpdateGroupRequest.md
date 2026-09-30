

# UpdateGroupRequest

The request for updating a group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**membersToAdd** | **List&lt;UUID&gt;** | The accounts to add to the group. An account that is a guest, is disabled or does not exist is skipped  without an error, so the answer has to be read to see what was applied. |  [optional] |
|**membersToRemove** | **List&lt;UUID&gt;** | The accounts to remove from the group. Removals are applied after the additions, so an account named in both  lists ends up removed, and an ID that is not a member is skipped without an error. |  [optional] |
|**groupManager** | **UUID** | The account to make the manager of the group, which also adds it to the group. Omit it to keep the current  manager - it cannot be cleared through this operation. |  [optional] |
|**groupName** | **String** | The new name of the group, up to 128 characters. Omit it to keep the current name. |  [optional] |



