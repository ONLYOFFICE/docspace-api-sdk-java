

# McpServerStatusDto

MCP server status within a room, reflecting the current user's connection state for OAuth-based servers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the MCP server. |  [optional] |
|**name** | **String** | Display name of the MCP server. |  |
|**serverType** | **ServerType** |  |  [optional] |
|**connected** | **Boolean** | Indicates whether the current user has an active connection to this server. For direct-connection servers this is always true; for OAuth-based servers it reflects whether the user has completed authorization. |  [optional] |
|**icon** | [**Icon**](Icon.md) |  |  [optional] |
|**needReset** | **Boolean** | Indicates whether the server requires a configuration reset due to connectivity or credential issues. |  [optional] |



