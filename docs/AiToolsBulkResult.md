

# AiToolsBulkResult

Outcome of `ToolsEngine.replaceAllCustomServers` — either every entry persisted, or no entries persisted plus a per-key error report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when every custom MCP server was persisted. |  |
|**errors** | [**List&lt;AiToolsBulkResultErrorsInner&gt;**](AiToolsBulkResultErrorsInner.md) | What was rejected, per server. Present on failure - and then no server was persisted. |  [optional] |



