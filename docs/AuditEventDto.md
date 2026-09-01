

# AuditEventDto

The audit event parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The audit event ID. |  [optional] |
|**date** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
|**user** | **String** | The name of the user who triggered the audit event. |  [optional] |
|**userId** | **UUID** | The ID of the user who triggered the audit event. |  [optional] |
|**action** | **String** | The audit event action. |  [optional] |
|**actionId** | **MessageAction** | The event action ID. |  [optional] |
|**ip** | **String** | The audit event IP. |  [optional] |
|**country** | **String** | The audit event country. |  [optional] |
|**city** | **String** | The audit event city. |  [optional] |
|**browser** | **String** | The audit event browser. |  [optional] |
|**platform** | **String** | The audit event platform. |  [optional] |
|**page** | **String** | The audit event page. |  [optional] |
|**actionType** | **ActionType** | The type of action performed in the audit event (e.g., Create, Update, Delete). |  [optional] |
|**product** | **ProductType** | The type of product related to the audit event. |  [optional] |
|**location** | **LocationType** | The location where the audit event occurred. |  [optional] |
|**target** | **List&lt;String&gt;** | The list of target objects affected by the audit event (e.g., document ID, user account). |  [optional] |
|**entries** | **List&lt;EntryType&gt;** | The list of audit entry types (e.g., Folder, User, File). |  [optional] |
|**context** | **String** | The audit event context. |  [optional] |



