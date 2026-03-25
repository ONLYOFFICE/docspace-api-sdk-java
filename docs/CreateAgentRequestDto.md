

# CreateAgentRequestDto

Request to create a new AI agent room.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The room name. |  |
|**quota** | **Long** | The room quota. |  [optional] |
|**indexing** | **Boolean** | Specifies whether to create a room with indexing. |  [optional] |
|**denyDownload** | **Boolean** | Specifies whether to deny downloads from the room. |  [optional] |
|**lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) |  |  [optional] |
|**watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) |  |  [optional] |
|**logo** | [**LogoRequest**](LogoRequest.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | The list of tags. |  [optional] |
|**color** | **String** | The room color. |  [optional] |
|**cover** | **String** | The room cover. |  [optional] |
|**_private** | **Boolean** | Specifies whether the room to be created is private or not. |  [optional] |
|**share** | [**List&lt;FileShareParams&gt;**](FileShareParams.md) | The collection of sharing parameters. |  [optional] |
|**chatSettings** | [**ChatSettings**](ChatSettings.md) |  |  |
|**attachDefaultTools** | **Boolean** | Specifies whether to attach default tools to the agent or not. |  [optional] |



