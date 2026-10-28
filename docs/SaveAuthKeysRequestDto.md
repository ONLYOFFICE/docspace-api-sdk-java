

# SaveAuthKeysRequestDto

The keys to store for one third-party authorization or storage provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The internal key of the provider, such as `google` or `box`. Take it from the `name` of  `GET api/2.0/settings/authservice`. |  [optional] |
|**title** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**description** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**instruction** | **String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**canSet** | **Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**paid** | **Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**props** | [**List&lt;AuthKeyRequest&gt;**](AuthKeyRequest.md) | The keys of the provider with their new values, by the key names `GET api/2.0/settings/authservice` lists in  `props`. |  [optional] |



