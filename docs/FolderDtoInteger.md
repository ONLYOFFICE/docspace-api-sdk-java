

# FolderDtoInteger

The folder parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The file entry title. |  [optional] |
|**access** | **FileShare** |  |  [optional] |
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
|**parentId** | **Integer** | The parent folder ID of the folder. |  [optional] |
|**filesCount** | **Integer** | The number of files that the folder contains. |  [optional] |
|**foldersCount** | **Integer** | The number of folders that the folder contains. |  [optional] |
|**isShareable** | **Boolean** | Specifies if the folder can be shared or not. |  [optional] |
|**_new** | **Integer** | The new element index in the folder. |  [optional] |
|**mute** | **Boolean** | Specifies if the folder notifications are enabled or not. |  [optional] |
|**tags** | **List&lt;String&gt;** | The list of tags of the folder. |  [optional] |
|**logo** | [**Logo**](Logo.md) |  |  [optional] |
|**pinned** | **Boolean** | Specifies if the folder is pinned or not. |  [optional] |
|**roomType** | **RoomType** |  |  [optional] |
|**_private** | **Boolean** | Specifies if the folder is private or not. |  [optional] |
|**indexing** | **Boolean** | Specifies if the folder is indexed or not. |  [optional] |
|**denyDownload** | **Boolean** | Specifies if the folder can be downloaded or not. |  [optional] |
|**lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) |  |  [optional] |
|**watermark** | [**WatermarkDto**](WatermarkDto.md) |  |  [optional] |
|**type** | **FolderType** |  |  [optional] |
|**inRoom** | **Boolean** | Specifies if the folder is placed in the room or not. |  [optional] |
|**quotaLimit** | **Long** | The folder quota limit. |  [optional] |
|**isCustomQuota** | **Boolean** | Specifies if the folder room has a custom quota or not. |  [optional] |
|**usedSpace** | **Long** | How much folder space is used (counter). |  [optional] |
|**passwordProtected** | **Boolean** | Specifies if the folder is password protected or not. |  [optional] |
|**expired** | **Boolean** | Specifies if an external link to the folder is expired or not. |  [optional] |
|**chatSettings** | [**ChatSettings**](ChatSettings.md) |  |  [optional] |
|**rootRoomType** | **RoomType** |  |  [optional] |



