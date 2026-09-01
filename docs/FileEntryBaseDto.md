

# FileEntryBaseDto

The file entry information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The file entry title. |  [optional] |
|**access** | **FileShare** | The access rights to the file entry. |  [optional] |
|**sharedBy** | [**EmployeeDto**](EmployeeDto.md) | Provides information about the employee who shared the file or folder. |  [optional] |
|**ownedBy** | [**EmployeeDto**](EmployeeDto.md) | The information about the employee who owns the file entry. |  [optional] |
|**shared** | **Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
|**sharedForUser** | **Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
|**sharedExternal** | **Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
|**parentShared** | **Boolean** | Indicates whether the parent entity is shared. |  [optional] |
|**shortWebUrl** | **URI** | The short Web URL. |  [optional] |
|**created** | **OffsetDateTime** | The creation date and time of the file entry. |  [optional] |
|**createdBy** | [**EmployeeDto**](EmployeeDto.md) | The file entry author. |  [optional] |
|**updated** | **OffsetDateTime** | The last date and time when the file entry was updated. |  [optional] |
|**autoDelete** | **OffsetDateTime** | The date and time when the file entry will be automatically deleted. |  [optional] |
|**rootFolderType** | **FolderType** | The root folder type of the file entry. |  [optional] |
|**parentRoomType** | **FolderType** | The parent room type of the file entry. |  [optional] |
|**updatedBy** | [**EmployeeDto**](EmployeeDto.md) | The user who updated the file entry. |  [optional] |
|**providerItem** | **Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
|**providerKey** | **String** | The provider key of the file entry. |  [optional] |
|**providerId** | **Integer** | The provider ID of the file entry. |  [optional] |
|**order** | **String** | The order of the file entry. |  [optional] |
|**isFavorite** | **Boolean** | Specifies if the file is a favorite or not. |  [optional] |
|**fileEntryType** | **FileEntryType** | The file entry type. |  [optional] |



