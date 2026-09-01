

# AiOpenAIChoiceDelta

The incremental part of one choice - what this chunk adds to the assistant message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | Sent on the first chunk only, always `assistant`. |  [optional] |
|**content** | **String** | The text this chunk appends. Null when the chunk carries no text. |  [optional] |
|**toolCalls** | [**List&lt;AiOpenAIToolCallDelta&gt;**](AiOpenAIToolCallDelta.md) | The tool calls the model requested, emitted in place of text. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ASSISTANT | &quot;assistant&quot; |



