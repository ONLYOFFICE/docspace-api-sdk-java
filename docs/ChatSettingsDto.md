

# ChatSettingsDto

The chat settings parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerId** | **Integer** | The AI provider ID. |  [optional] |
|**modelId** | **String** | The AI model ID used for chat completions. |  [optional] |
|**modelAlias** | **String** | The AI model display alias. |  [optional] |
|**prompt** | **String** | The system prompt for the chat. |  [optional] |
|**multimodal** | [**ChatMultimodalSettingsDto**](ChatMultimodalSettingsDto.md) |  |  [optional] |
|**thinking** | **Boolean** | Indicates whether the model supports extended thinking mode. |  [optional] |
|**internal** | **Boolean** | Indicates whether this is an internal AI gateway provider. |  [optional] [readonly] |



