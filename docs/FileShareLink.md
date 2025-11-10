

# FileShareLink

A shareable link for a file with its configuration and status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the shared link. |  [optional] |
|**title** | **String** | The title of the shared content. |  [optional] |
|**shareLink** | **String** | The URL for accessing the shared content. |  [optional] |
|**expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**linkType** | **LinkType** |  |  [optional] |
|**password** | **String** | The password protection for accessing the shared content. |  [optional] |
|**denyDownload** | **Boolean** | Indicates whether downloading of the shared content is prohibited. |  [optional] |
|**isExpired** | **Boolean** | Indicates whether the shared link has expired. |  [optional] |
|**primary** | **Boolean** | Indicates whether this is the primary shared link. |  [optional] |
|**internal** | **Boolean** | Indicates whether the link is for the internal sharing only. |  [optional] |
|**requestToken** | **String** | The token for validating access requests. |  [optional] |



