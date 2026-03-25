

# McpServerDto

Full MCP server configuration, including connection details and authentication headers. Returned for administrator-level operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the MCP server. |  [optional] |
|**name** | **String** | Display name of the MCP server. |  [optional] |
|**description** | **String** | Human-readable description of the server&#39;s purpose and capabilities. |  [optional] |
|**endpoint** | **String** | Base URL of the MCP server endpoint. |  [optional] |
|**serverType** | **ServerType** |  |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | HTTP headers sent with every request to the server (e.g., authentication tokens). |  [optional] |
|**enabled** | **Boolean** | Indicates whether the server is currently enabled and available for room assignment. |  [optional] |
|**icon** | [**Icon**](Icon.md) |  |  [optional] |
|**needReset** | **Boolean** | Indicates whether the server requires a configuration reset due to connectivity or credential issues. |  [optional] |



