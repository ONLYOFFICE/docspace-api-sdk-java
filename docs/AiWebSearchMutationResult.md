

# AiWebSearchMutationResult

Outcome of `WebSearchEngine.configure` — either the persisted config or a field-scoped error suitable for the settings form.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the configuration was persisted. |  |
|**config** | [**AiWebSearchConfig**](AiWebSearchConfig.md) | The persisted web-search configuration. Present on success. |  [optional] |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the configuration was rejected. Present on failure. |  [optional] |



