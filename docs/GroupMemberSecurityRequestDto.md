

# GroupMemberSecurityRequestDto

The group member security information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**EmployeeFullDto**](EmployeeFullDto.md) | The full list of user parameters. |  |
|**groupAccess** | **FileShare** | The access rights type. |  |
|**userAccess** | **FileShare** | The group member access rights to the files. |  [optional] |
|**overridden** | **Boolean** | Specifies if the group access rights are overridden or not. |  |
|**canEditAccess** | **Boolean** | Specifies if the group member can edit the group access rights or not. |  |
|**owner** | **Boolean** | Specifies if the group member is a group owner or not. |  |



