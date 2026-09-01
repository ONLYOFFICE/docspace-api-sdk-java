

# AiOpenAIToolCallDelta

The incremental part of one tool call the model requested.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **BigDecimal** | The zero-based position of the tool call within the message. |  |
|**id** | **String** | The tool call identifier, quoted back when its result is submitted. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Always `function` - the only tool kind the API defines. |  [optional] |
|**function** | [**AiOpenAIToolCallDeltaFunction**](AiOpenAIToolCallDeltaFunction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |



