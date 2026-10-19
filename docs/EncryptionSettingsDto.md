

# EncryptionSettingsDto

The state of the portal's storage encryption.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**password** | **String** | Always an empty string: the encryption password is never returned. |  [optional] |
|**status** | **EncryptionStatus** | Whether the storage is encrypted, decrypted, or on its way to either. |  [optional] |
|**notifyUsers** | **Boolean** | Whether the users are notified when the operation starts and ends. |  [optional] |



