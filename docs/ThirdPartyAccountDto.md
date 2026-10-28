

# ThirdPartyAccountDto

A third-party storage account the caller has connected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**corporate** | **Boolean** | Whether the account is attached to the legacy Common section, which is the case only for accounts inherited  from an older portal. |  [optional] |
|**roomsStorage** | **Boolean** | Whether the account is attached to the Rooms section, room templates and the archive counted in. This is where  `POST api/2.0/files/thirdparty` puts every account it connects. |  [optional] |
|**customerTitle** | **String** | The name the account is shown under in the portal, as it was saved when the account was connected. |  [optional] |
|**providerId** | **Integer** | The account ID to send to `DELETE api/2.0/files/thirdparty/{providerId}`, or as `providerId` to  re-authenticate the account. |  [optional] |
|**providerKey** | **String** | The storage service behind the account. `WebDav` stands for every WebDAV preset, so it does not tell which of  them was chosen when the account was connected. |  [optional] |



