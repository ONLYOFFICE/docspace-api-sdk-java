

# AiEditorToolsList200ResponseToolsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Tool name, as it is passed back to the call endpoint. |  |
|**description** | **String** | What the tool does, empty when the server declares nothing. |  |
|**inputSchema** | **Map&lt;String, Object&gt;** | JSON Schema of the tool arguments. |  |
|**requireApproval** | **Boolean** | Whether the editor has to ask the user before running the tool. Read-only operations arrive with this off. |  |



