

# EntryTemplateDto

A metadata template assigned to an entry: the template with every field of it, each field carrying its value on the entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The template ID. |  [optional] |
|**name** | **String** | The template name. |  [optional] |
|**visible** | **Boolean** | Specifies if the template is visible in the UI pickers. |  [optional] |
|**cascade** | **Boolean** | Whether the template cascades from this entry to the folders and files below it. Only a folder or a room can  cascade; on a file the value is always false. |  [optional] |
|**conflictResolveType** | **MetadataConflictResolveType** | How the cascade of this entry treats a value an entry below already holds. Null while the template does not  cascade from this entry. |  [optional] |
|**fields** | [**List&lt;EntryFieldDto&gt;**](EntryFieldDto.md) | The template fields with their values on the entry. |  [optional] |



