

# ApiKeyResponseDto

The response data for the API key operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The API key unique identifier. |  |
|**name** | **String** | The API key name. |  |
|**key** | **String** | The full API key value (only returned when creating a new key). |  |
|**keyPostfix** | **String** | The API key postfix (used for identification). |  [optional] |
|**permissions** | **List&lt;String&gt;** | The list of permissions granted to the API key. |  |
|**lastUsed** | **OffsetDateTime** | The date and time when the API key was last used. |  [optional] |
|**createOn** | **OffsetDateTime** | The date and time when the API key was created. |  [optional] |
|**createBy** | [**EmployeeDto**](EmployeeDto.md) | The identifier of the user who created the API key. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The date and time when the API key expires. |  [optional] |
|**isActive** | **Boolean** | Indicates whether the API key is active or not. |  |



