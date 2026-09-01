

# AiToolsMutationResult

Outcome of an MCP-server CRUD call. Either success or a field-scoped error suitable for the settings form.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the MCP server was persisted. |  |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the MCP server was rejected. Present on failure. |  [optional] |



