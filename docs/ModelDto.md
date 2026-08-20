

# ModelDto

The AI model information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerId** | **Integer** | The unique identifier of the AI provider that offers this model. |  [optional] |
|**providerTitle** | **String** | The human-readable display name of the AI provider (e.g., OpenAI, Anthropic). |  |
|**modelId** | **String** | The model identifier as recognized by the AI provider (e.g., gpt-4o, claude-sonnet-4-20250514). |  |
|**alias** | **String** | The display name for the model. |  [optional] |
|**capabilities** | [**AiModelCapabilities**](AiModelCapabilities.md) |  |  [optional] |
|**price** | [**AiChatPrice**](AiChatPrice.md) |  |  [optional] |
|**currency** | [**CurrencyInfo**](CurrencyInfo.md) |  |  [optional] |



