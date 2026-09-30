

# AiModel

AI model metadata. Describes a single model available from a provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Model identifier as used by the provider API (e.g. `gpt-4o`, `claude-sonnet-4-20250514`). |  |
|**name** | **String** | Human-readable model name for display in the UI. |  |
|**provider** | [**AiProviderType**](AiProviderType.md) | Provider that offers this model. |  |
|**reasoning** | **Boolean** | Whether this model supports extended thinking / chain-of-thought reasoning. |  [optional] |
|**reasoningSupport** | [**AiReasoningSupport**](AiReasoningSupport.md) | What the model can do with extended thinking, when the provider's catalogue says so (OpenRouter and the ONLYOFFICE route report a per-model `reasoning` object). Copied onto the profile at save time; absent, the widget falls back to the provider's id-based table. |  [optional] |
|**capabilities** | **BigDecimal** | Bitmask of model capabilities (Chat, Image, Vision, Tools, etc.). Used to filter models per `ActionType`. |  [optional] |



