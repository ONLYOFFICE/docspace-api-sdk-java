

# FileShareDto

The file sharing information and access rights.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | **FileShare** |  |  [optional] |
|**sharedTo** | **Object** | The user who has the access to the specified file. |  [optional] |
|**sharedToUser** | [**EmployeeFullDto**](EmployeeFullDto.md) |  |  [optional] |
|**sharedToGroup** | [**GroupSummaryDto**](GroupSummaryDto.md) |  |  [optional] |
|**sharedLink** | [**FileShareLink**](FileShareLink.md) |  |  [optional] |
|**isLocked** | **Boolean** | Specifies if the access right is locked or not. |  |
|**isOwner** | **Boolean** | Specifies if the user is an owner of the specified file or not. |  |
|**canEditAccess** | **Boolean** | Specifies if the user can edit the access to the specified file or not. |  |
|**canEditInternal** | **Boolean** | Indicates whether internal editing permissions are granted. |  |
|**canEditDenyDownload** | **Boolean** | Determines whether the user has permission to modify the deny download setting for the file share. |  |
|**canEditExpirationDate** | **Boolean** | Indicates whether the expiration date of access permissions can be edited. |  |
|**canRevoke** | **Boolean** | Specifies whether the file sharing access can be revoked by the current user. |  |
|**subjectType** | **SubjectType** |  |  |



