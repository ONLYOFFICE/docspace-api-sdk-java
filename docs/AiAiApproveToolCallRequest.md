

# AiAiApproveToolCallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | **Object** |  |  |
|**allowAlways** | **Boolean** | Persist auto-approve for this tool's name. |  [optional] |
|**threadId** | **String** | Thread the assistant message belongs to. |  |
|**messageId** | **String** | Storage id of the assistant message holding the tool call. |  |
|**idx** | **BigDecimal** | Index of the tool-call content part inside `message.content`. |  |
|**message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | Snapshot of the assistant message at the time the tool call surfaced. |  |
|**actionArgs** | [**AiAiActionArgs**](AiAiActionArgs.md) |  |  [optional] |
|**entityId** | **String** |  |  [optional] |
|**profileId** | **String** |  |  [optional] |



