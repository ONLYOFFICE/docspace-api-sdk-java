

# FileEntryDtoInteger

The generic file entry information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The file entry title. |  [optional] |
|**access** | **FileShare** |  |  [optional] |
|**sharedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**ownedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
|**shared** | **Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
|**sharedForUser** | **Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
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
|**id** | **Integer** | The file entry ID. |  [optional] |
|**rootFolderId** | **Integer** | The root folder ID of the file entry. |  [optional] |
|**originId** | **Integer** | The origin ID of the file entry. |  [optional] |
|**originRoomId** | **Integer** | The origin room ID of the file entry. |  [optional] |
|**originTitle** | **String** | The origin title of the file entry. |  [optional] |
|**originRoomTitle** | **String** | The origin room title of the file entry. |  [optional] |
|**canShare** | **Boolean** | Specifies if the file entry can be shared or not. |  [optional] |
|**shareSettings** | [**FileEntryDtoIntegerAllOfShareSettings**](FileEntryDtoIntegerAllOfShareSettings.md) |  |  [optional] |
|**security** | [**FileEntryDtoIntegerAllOfSecurity**](FileEntryDtoIntegerAllOfSecurity.md) |  |  [optional] |
|**availableShareRights** | [**FileEntryDtoIntegerAllOfAvailableShareRights**](FileEntryDtoIntegerAllOfAvailableShareRights.md) |  |  [optional] |
|**requestToken** | **String** | The request token of the file entry. |  [optional] |
|**external** | **Boolean** | Specifies if the folder can be accessed via an external link or not. |  [optional] |
|**expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**isLinkExpired** | **Boolean** | Indicates whether the shareable link associated with the file or folder has expired. |  [optional] |



