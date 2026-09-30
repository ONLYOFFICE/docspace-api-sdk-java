

# DownloadRequestItemDto

One file of a bulk download, together with the format it is converted to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | [**DownloadRequestItemDtoKey**](DownloadRequestItemDtoKey.md) |  |  |
|**value** | **String** | The format the file is converted to before it is packed, as a file extension without a leading dot. |  |
|**password** | **String** | The password that opens the source file, for a file protected with one; a protected file cannot be converted  without it. |  [optional] |



