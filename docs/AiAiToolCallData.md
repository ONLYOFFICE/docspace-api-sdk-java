

# AiAiToolCallData

Identifies a pending tool call to resume — mirrors the library `ToolCallData` (its serializable fields).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threadId** | **String** | Thread the assistant message belongs to. |  |
|**messageId** | **String** | Storage id of the assistant message holding the tool call. |  |
|**idx** | **BigDecimal** | Index of the tool-call content part inside `message.content`. |  |
|**message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | Snapshot of the assistant message at the time the tool call surfaced. |  |
|**actionArgs** | [**AiAiActionArgs**](AiAiActionArgs.md) | Per-request engine options: extra tools, reasoning, prompt override. |  [optional] |
|**entityId** | **String** | Optional entity (room) scope for profile resolution. |  [optional] |
|**profileId** | **String** | Session-level profile override for this request only. |  [optional] |



