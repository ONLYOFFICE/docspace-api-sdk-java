

# FormRoleDto

The form role parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleName** | **String** | The role name. |  |
|**roleColor** | **String** | The role color. |  [optional] |
|**user** | [**EmployeeFullDto**](EmployeeFullDto.md) | The user of the role. |  [optional] |
|**sequence** | **Integer** | The role sequence. |  |
|**submitted** | **Boolean** | Specifies if the role is submitted. |  |
|**stopedBy** | [**EmployeeFullDto**](EmployeeFullDto.md) | The user who stopped the role. |  [optional] |
|**history** | **Map&lt;String, OffsetDateTime&gt;** | The role history. |  [optional] |
|**roleStatus** | **FormFillingStatus** | The role status. |  [optional] |



