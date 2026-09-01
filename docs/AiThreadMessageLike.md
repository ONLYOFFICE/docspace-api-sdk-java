

# AiThreadMessageLike


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Storage-assigned message id (absent on inbound drafts). |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Message author role. |  |
|**content** | [**AiThreadMessageLikeContent**](AiThreadMessageLikeContent.md) |  |  |
|**createdAt** | **String** | Creation timestamp, ISO-8601 on the wire. |  [optional] |
|**status** | [**AiThreadMessageLikeStatus**](AiThreadMessageLikeStatus.md) |  |  [optional] |
|**metadata** | **Object** | Arbitrary per-message metadata. |  [optional] |
|**attachments** | **List&lt;Object&gt;** | Attachments linked to the message. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |
| SYSTEM | &quot;system&quot; |



