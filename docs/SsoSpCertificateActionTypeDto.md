

# SsoSpCertificateActionTypeDto

What the portal's own key pair may be used for, as the `action` of a service provider certificate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signing** | **String** | The key pair signs the requests the portal sends and nothing else. |  [optional] [readonly] |
|**encrypt** | **String** | The key pair encrypts what the portal sends and decrypts what comes back, but signs nothing. |  [optional] [readonly] |
|**signingAndEncrypt** | **String** | The key pair does both, which is what one pair configured on its own has to be set to. |  [optional] [readonly] |



