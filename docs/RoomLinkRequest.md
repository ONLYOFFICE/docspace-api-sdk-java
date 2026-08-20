

# RoomLinkRequest

The room link parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linkId** | **UUID** | The room link ID. |  [optional] |
|**access** | **FileShare** |  |  [optional] |
|**expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**internal** | **Boolean** | The link scope, whether it is internal or not. |  [optional] |
|**title** | **String** | The link name. |  [optional] |
|**linkType** | **LinkType** |  |  [optional] |
|**password** | **String** | The link password. |  [optional] |
|**denyDownload** | **Boolean** | Specifies if downloading the file from the link is disabled or not. |  [optional] |
|**maxUseCount** | **Integer** | The maximum number of times the invitation link can be used. |  [optional] |
|**currentUseCount** | **Integer** | The current number of times the invitation link has been used. |  [optional] |



