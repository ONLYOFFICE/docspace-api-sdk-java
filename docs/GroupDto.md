

# GroupDto

The group parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The group name. |  |
|**parent** | **UUID** | The parent group ID. |  [optional] |
|**category** | **UUID** | The group category ID. |  |
|**id** | **UUID** | The group ID. |  |
|**isLDAP** | **Boolean** | Specifies if the LDAP settings are enabled for the group or not. |  |
|**isSystem** | **Boolean** | Indicates whether the group is a system group. |  [optional] |
|**manager** | [**EmployeeFullDto**](EmployeeFullDto.md) |  |  [optional] |
|**members** | [**List&lt;EmployeeFullDto&gt;**](EmployeeFullDto.md) | The list of group members. |  [optional] |
|**shared** | **Boolean** | Specifies whether the group can be shared or not. |  [optional] |
|**membersCount** | **Integer** | The number of group members. |  [optional] |



