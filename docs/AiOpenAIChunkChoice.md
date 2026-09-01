

# AiOpenAIChunkChoice

One choice of a streaming completion, carrying the part this chunk adds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **BigDecimal** | The zero-based position of the choice. This service emits a single choice, so always 0. |  |
|**delta** | [**AiOpenAIChoiceDelta**](AiOpenAIChoiceDelta.md) | What this chunk adds to the choice. |  |
|**finishReason** | **AiOpenAIFinishReason** | Why the completion stopped, or null while it is still streaming. |  |



