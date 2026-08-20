

# ExternalDbSyncTaskDto

The external DB synchronization task parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The task ID. |  |
|**error** | **String** | The error message if the synchronization failed. |  [optional] |
|**percentage** | **Integer** | The progress percentage of the synchronization. |  |
|**isCompleted** | **Boolean** | Specifies whether the synchronization is completed or not. |  |
|**status** | **DistributedTaskStatus** |  |  |
|**forms** | [**List&lt;ExternalDbSyncFormResultDto&gt;**](ExternalDbSyncFormResultDto.md) | The synchronization results for all original forms in the room. |  |



