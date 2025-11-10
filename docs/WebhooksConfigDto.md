

# WebhooksConfigDto

The webhook configuration parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The webhook ID. |  |
|**name** | **String** | The webhook name. |  [optional] |
|**uri** | **String** | The webhook URI. |  [optional] |
|**enabled** | **Boolean** | Specifies if the webhooks are enabled or not. |  [optional] |
|**ssl** | **Boolean** | The webhook SSL verification (enabled or not). |  [optional] |
|**triggers** | **WebhookTrigger** |  |  [optional] |
|**targetId** | **String** | The webhook target ID. |  [optional] |
|**createdBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**createdOn** | **OffsetDateTime** | The date and time when the webhook was created. |  [optional] |
|**modifiedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** | The date and time when the webhook was modified. |  [optional] |
|**lastFailureOn** | **OffsetDateTime** | The date and time of the webhook last failure. |  [optional] |
|**lastFailureContent** | **String** | The webhook last failure content. |  [optional] |
|**lastSuccessOn** | **OffsetDateTime** | The date and time of the webhook last success. |  [optional] |



