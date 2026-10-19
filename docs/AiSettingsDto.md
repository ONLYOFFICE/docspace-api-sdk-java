

# AiSettingsDto

The AI module settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vectorizationEnabled** | **Boolean** | Indicates whether document vectorization is enabled. |  [optional] |
|**vectorizationNeedReset** | **Boolean** | Indicates whether the embedding provider API key needs to be reconfigured. |  [optional] |
|**aiReady** | **Boolean** | Indicates whether the AI subsystem is fully configured and operational. |  [optional] |
|**embeddingModel** | **String** | The name of the embedding model used for document vectorization. |  |
|**systemAiEnabled** | **Boolean** | Indicates whether the system-level AI provider is enabled. |  [optional] |
|**recommendedModelForForms** | **String** | The identifier of the model recommended for form generation. |  [optional] |
|**toolPermissionMode** | **AiToolPermissionMode** | How tool calls made by the model are approved for the current user. The default applies while the user has stored nothing. |  [optional] |



