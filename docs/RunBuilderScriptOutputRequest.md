

# RunBuilderScriptOutputRequest

Where one produced file goes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **Integer** | The id of a portal file to store the result in as a new version, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`. |  [optional] |
|**folderId** | **Integer** | The id of a folder to save the result in as a new file, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`. |  [optional] |
|**title** | **String** | The title of the new file, when it has to differ from the name the script saved the result under. |  [optional] |



