

# AiErrorData

A field-scoped validation error: which form field was rejected, and why.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**FieldEnum**](#FieldEnum) | The rejected field. |  |
|**message** | **String** | The human-readable reason the field was rejected. |  |
|**code** | **AiErrorCode** | Optional: producers that know the reason set it (the prompts engine does). |  [optional] |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| KEY | &quot;key&quot; |
| URL | &quot;url&quot; |
| NAME | &quot;name&quot; |
| TEXT | &quot;text&quot; |



