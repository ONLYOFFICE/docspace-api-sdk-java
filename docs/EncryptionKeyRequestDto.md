

# EncryptionKeyRequestDto

The request parameters for storing the encryption key pair of a user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The identifier of the key pair. |  [optional] |
|**publicKey** | **String** | The public key of the pair, used to encrypt the file keys. |  [optional] |
|**privateKeyEnc** | **String** | The private key of the pair, encrypted with the user password. |  [optional] |



