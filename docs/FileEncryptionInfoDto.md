

# FileEncryptionInfoDto

The encryption information of a file: the user key pairs and the per-user file keys.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userKeys** | [**List&lt;EncryptionKeyDto&gt;**](EncryptionKeyDto.md) | The key pairs of the users who have access to the file. |  [optional] |
|**fileKeys** | [**List&lt;FileKeys&gt;**](FileKeys.md) | The file keys issued to those users. |  [optional] |



