

# MetadataOperationDto

The cascade metadata assignment operation status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The operation ID. |  [optional] |
|**progress** | **Double** | The operation progress percentage. |  [optional] |
|**isCompleted** | **Boolean** | Specifies if the operation is completed. |  [optional] |
|**error** | **String** | The operation error message. |  [optional] |
|**templateIds** | **List&lt;Integer&gt;** | The IDs of the metadata templates the operation propagates to the subtree. Empty when there is no operation to  report, so the answer describes nothing in progress. |  [optional] |



