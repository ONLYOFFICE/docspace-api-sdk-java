

# FileKeys

The encrypted file key issued to one user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** | The identifier of the user the file key was issued to. |  [optional] |
|**publicKeyId** | **UUID** | The identifier of the key pair the file key is encrypted for. |  [optional] |
|**privateKeyEnc** | **String** | The file key, encrypted with the public key of the pair. |  [optional] |
|**tenantId** | **Integer** | The identifier of the portal the file belongs to. |  [optional] |
|**fileId** | **Integer** | The identifier of the file the key unlocks. |  [optional] |
|**createOn** | **OffsetDateTime** | The date and time when the file key was issued. |  [optional] |



