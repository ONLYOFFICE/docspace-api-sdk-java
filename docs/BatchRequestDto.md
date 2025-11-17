

# BatchRequestDto

The request parameters for copying/moving files.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnSingleOperation** | **Boolean** | Specifies whether to return only the current operation |  [optional] |
|**folderIds** | **List&lt;Integer&gt;** | The list of folder IDs to be copied/moved. |  [optional] |
|**fileIds** | **List&lt;Integer&gt;** | The list of file IDs to be copied/moved. |  [optional] |
|**destFolderId** | **Integer** |  |  [optional] |
|**conflictResolveType** | **FileConflictResolveType** |  |  [optional] |
|**deleteAfter** | **Boolean** | Specifies whether to delete the source files/folders after they are moved or copied to the destination folder. |  [optional] |
|**content** | **Boolean** | Specifies whether to copy or move the folder content or not. |  [optional] |
|**toFillOut** | **Boolean** | Specifies whether the file is copied for filling out |  [optional] |



