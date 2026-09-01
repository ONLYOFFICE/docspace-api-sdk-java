

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
|**lastUsed** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
|**createOn** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
|**createBy** | [**EmployeeDto**](EmployeeDto.md) | The user parameters. |  [optional] |
|**expiresAt** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
|**isActive** | **Boolean** | Indicates whether the API key is active or not. |  |



