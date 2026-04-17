

# CreateProviderRequestDto

Request parameters for creating a new AI provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **ProviderType** |  |  [optional] |
|**title** | **String** | The display title for the AI provider. |  |
|**url** | **String** | The API endpoint URL for the AI provider. Required for OpenAiCompatible type; optional for other types that have default URLs. |  [optional] |
|**key** | **String** | The authentication API key for the AI provider. |  |
|**modelSettings** | [**Set&lt;ModelSettingsItemDto&gt;**](ModelSettingsItemDto.md) | Optional list of model settings to configure atomically with the provider creation. |  [optional] |



