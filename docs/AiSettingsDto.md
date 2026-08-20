

# AiSettingsDto

The AI module settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webSearchEnabled** | **Boolean** | Indicates whether web search is enabled for AI chat sessions. |  [optional] |
|**webSearchNeedReset** | **Boolean** | Indicates whether the web search API key needs to be reconfigured. |  [optional] |
|**vectorizationEnabled** | **Boolean** | Indicates whether document vectorization is enabled. |  [optional] |
|**vectorizationNeedReset** | **Boolean** | Indicates whether the embedding provider API key needs to be reconfigured. |  [optional] |
|**aiReady** | **Boolean** | Indicates whether the AI subsystem is fully configured and operational. |  [optional] |
|**aiReadyNeedReset** | **Boolean** | Indicates whether the AI provider API key needs to be reconfigured. |  [optional] |
|**portalMcpServerId** | **UUID** | The unique identifier of the portal-level MCP server, if configured. |  [optional] |
|**embeddingModel** | **String** | The name of the embedding model used for document vectorization. |  |
|**modelAliases** | **Map&lt;String, String&gt;** | Mapping of model identifiers to human-readable aliases. |  |
|**knowledgeSearchToolName** | **String** | The tool name used by the AI assistant for knowledge base search. |  |
|**webSearchToolName** | **String** | The tool name used by the AI assistant for web search. |  |
|**webCrawlingToolName** | **String** | The tool name used by the AI assistant for web page crawling. |  |
|**generateDocxToolName** | **String** | The tool name used by the AI to launch docx creation in the editor. |  |
|**generateFormToolName** | **String** | The tool name used by the AI assistant to launch form creation in the editor. |  |
|**generatePresentationToolName** | **String** | The tool name used by the AI assistant to launch presentation creation in the editor. |  |
|**systemAiEnabled** | **Boolean** | Indicates whether the system-level AI provider is enabled. |  [optional] |
|**recommendedModelForForms** | **String** | The identifier of the model recommended for form generation. |  [optional] |



