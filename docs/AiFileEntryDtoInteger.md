

# AiFileEntryDtoInteger

The generic file entry information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The file entry title. |  [optional] |
|**access** | **AiFileShare** | The access rights to the file entry. |  [optional] |
|**sharedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | Provides information about the employee who shared the file or folder. |  [optional] |
|**ownedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The information about the employee who owns the file entry. |  [optional] |
|**shared** | **Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
|**sharedForUser** | **Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
|**sharedExternal** | **Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
|**parentShared** | **Boolean** | Indicates whether the parent entity is shared. |  [optional] |
|**shortWebUrl** | **URI** | The short Web URL. |  [optional] |
|**created** | [**AiApiDateTime**](AiApiDateTime.md) | The creation date and time of the file entry. |  [optional] |
|**createdBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The file entry author. |  [optional] |
|**updated** | [**AiApiDateTime**](AiApiDateTime.md) | The last date and time when the file entry was updated. |  [optional] |
|**autoDelete** | [**AiApiDateTime**](AiApiDateTime.md) | The date and time when the file entry will be automatically deleted. |  [optional] |
|**rootFolderType** | **AiFolderType** | The root folder type of the file entry. |  [optional] |
|**parentRoomType** | **AiFolderType** | The parent room type of the file entry. |  [optional] |
|**updatedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The user who updated the file entry. |  [optional] |
|**providerItem** | **Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
|**providerKey** | **String** | The provider key of the file entry. |  [optional] |
|**providerId** | **Integer** | The provider ID of the file entry. |  [optional] |
|**order** | **String** | The order of the file entry. |  [optional] |
|**isFavorite** | **Boolean** | Specifies if the file is a favorite or not. |  [optional] |
|**fileEntryType** | **AiFileEntryType** | The file entry type. |  [optional] |
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
|**expirationDate** | [**AiApiDateTime**](AiApiDateTime.md) | Represents the expiration date of the file entry. |  [optional] |
|**isLinkExpired** | **Boolean** | Indicates whether the shareable link associated with the file or folder has expired. |  [optional] |



