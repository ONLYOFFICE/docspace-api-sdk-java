

# AiImportResult

Outcome of `PromptsEngine.importBundle`. Either every entry persisted with counts, or no entries persisted plus a per-entry error report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the whole bundle was imported. |  |
|**imported** | [**AiImportResultImported**](AiImportResultImported.md) |  |  [optional] |
|**errors** | [**List&lt;AiImportError&gt;**](AiImportError.md) | What was rejected, per entry. Present on failure - and then nothing was imported. |  [optional] |



