

# FileEntryBaseDto

The file entry information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The file entry title. |  [optional] |
|**access** | **FileShare** |  |  [optional] |
|**sharedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**ownedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**shared** | **Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
|**sharedForUser** | **Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
|**sharedExternal** | **Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
|**parentShared** | **Boolean** | Indicates whether the parent entity is shared. |  [optional] |
|**shortWebUrl** | **URI** | The short Web URL. |  [optional] |
|**created** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**createdBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**updated** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**autoDelete** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**rootFolderType** | **FolderType** |  |  [optional] |
|**parentRoomType** | **FolderType** |  |  [optional] |
|**updatedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**providerItem** | **Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
|**providerKey** | **String** | The provider key of the file entry. |  [optional] |
|**providerId** | **Integer** | The provider ID of the file entry. |  [optional] |
|**order** | **String** | The order of the file entry. |  [optional] |
|**isFavorite** | **Boolean** | Specifies if the file is a favorite or not. |  [optional] |
|**fileEntryType** | **FileEntryType** |  |  [optional] |



