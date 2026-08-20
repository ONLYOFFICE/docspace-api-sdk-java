

# FileOperationDto

The file operation information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The file operation ID. |  |
|**operation** | **FileOperationType** |  |  |
|**progress** | **Integer** | The file operation progress in percentage. |  |
|**error** | **String** | The file operation error message. |  |
|**processed** | **String** | The file operation processing status. |  |
|**finished** | **Boolean** | Specifies if the file operation is finished or not. |  |
|**url** | **URI** | The file operation URL. |  [optional] |
|**files** | [**List&lt;FileEntryBaseDto&gt;**](FileEntryBaseDto.md) | The list of files of the file operation. |  [optional] |
|**folders** | [**List&lt;FileEntryBaseDto&gt;**](FileEntryBaseDto.md) | The list of folders of the file operation. |  [optional] |
|**status** | **DistributedTaskStatus** |  |  [optional] |



