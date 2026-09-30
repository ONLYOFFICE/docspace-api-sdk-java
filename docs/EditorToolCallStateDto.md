

# EditorToolCallStateDto

A generation the editor is expected to run as soon as the document opens, left behind by an AI agent that created  the file but not its content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toolName** | **String** | Which generation to run, which also decides the shape of the parameters below. |  |
|**parameters** | [**EditorToolCallParametersDto**](EditorToolCallParametersDto.md) | The arguments of the generation named above. |  |



