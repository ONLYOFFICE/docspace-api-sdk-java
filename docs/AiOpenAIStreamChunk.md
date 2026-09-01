

# AiOpenAIStreamChunk

A chunk or the terminal error envelope emitted on a failed stream.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The completion identifier, stable across every chunk of one response. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Always `chat.completion.chunk`. |  |
|**created** | **BigDecimal** | When the completion started, in Unix seconds. |  |
|**model** | **String** | The model that produced the completion - the resolved profile's model. |  |
|**choices** | [**List&lt;AiOpenAIChunkChoice&gt;**](AiOpenAIChunkChoice.md) | The choices carried by this chunk. This service emits exactly one. |  |
|**error** | [**AiOpenAIStreamErrorError**](AiOpenAIStreamErrorError.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CHAT_COMPLETION_CHUNK | &quot;chat.completion.chunk&quot; |



