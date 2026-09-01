

# AiOpenAIStreamChunk

A chunk or the terminal error envelope emitted on a failed stream.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**created** | **BigDecimal** |  |  |
|**model** | **String** |  |  |
|**choices** | [**List&lt;AiOpenAIChunkChoice&gt;**](AiOpenAIChunkChoice.md) |  |  |
|**error** | [**AiOpenAIStreamErrorError**](AiOpenAIStreamErrorError.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CHAT_COMPLETION_CHUNK | &quot;chat.completion.chunk&quot; |



