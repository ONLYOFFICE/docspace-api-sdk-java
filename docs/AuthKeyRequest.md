

# AuthKeyRequest

One key of a provider and the value to store for it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The key name, as `GET api/2.0/settings/authservice` lists it in `props`. |  |
|**value** | **String** | The value to store. An empty string clears the key. |  |
|**title** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**type** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**options** | **List&lt;String&gt;** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**dependsOn** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**dependsOnValue** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |



