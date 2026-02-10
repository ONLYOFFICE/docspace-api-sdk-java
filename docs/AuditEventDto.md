

# AuditEventDto

The audit event parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The audit event ID. |  [optional] |
|**date** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**user** | **String** | The name of the user who triggered the audit event. |  [optional] |
|**userId** | **UUID** | The ID of the user who triggered the audit event. |  [optional] |
|**action** | **String** | The audit event action. |  [optional] |
|**actionId** | **MessageAction** |  |  [optional] |
|**ip** | **String** | The audit event IP. |  [optional] |
|**country** | **String** | The audit event country. |  [optional] |
|**city** | **String** | The audit event city. |  [optional] |
|**browser** | **String** | The audit event browser. |  [optional] |
|**platform** | **String** | The audit event platform. |  [optional] |
|**page** | **String** | The audit event page. |  [optional] |
|**actionType** | **ActionType** |  |  [optional] |
|**product** | **ProductType** |  |  [optional] |
|**location** | **LocationType** |  |  [optional] |
|**target** | **List&lt;String&gt;** | The list of target objects affected by the audit event (e.g., document ID, user account). |  [optional] |
|**entries** | **List&lt;EntryType&gt;** | The list of audit entry types (e.g., Folder, User, File). |  [optional] |
|**context** | **String** | The audit event context. |  [optional] |



