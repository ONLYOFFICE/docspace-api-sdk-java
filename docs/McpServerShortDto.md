

# McpServerShortDto

Compact MCP server summary without sensitive details like endpoint URL or authentication headers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the MCP server. |  [optional] |
|**name** | **String** | Display name of the MCP server. |  [optional] |
|**serverType** | **ServerType** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the server is currently enabled and available for room assignment. |  [optional] |
|**icon** | [**Icon**](Icon.md) |  |  [optional] |
|**needReset** | **Boolean** | Indicates whether the server requires a configuration reset due to connectivity or credential issues. |  [optional] |



