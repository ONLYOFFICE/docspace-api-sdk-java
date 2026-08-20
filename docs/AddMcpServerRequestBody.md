

# AddMcpServerRequestBody

Parameters for creating a new custom MCP server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters. |  |
|**description** | **String** | Human-readable description of the server's purpose and capabilities. Maximum 255 characters. |  |
|**endpoint** | **URI** | Base URL of the MCP server endpoint. Must be a valid, reachable URL. The system will verify connectivity during registration. |  |
|**headers** | **Map&lt;String, String&gt;** | Optional HTTP headers to include with every request to the MCP server (e.g., authentication tokens or API keys). |  [optional] |
|**icon** | **String** | Optional Base64-encoded icon image for the server. Used as the visual identifier in the UI. |  [optional] |



