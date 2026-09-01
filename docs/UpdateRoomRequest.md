

# UpdateRoomRequest

The request parameters for updating a room.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The room title. |  [optional] |
|**quota** | **Long** | The room quota. |  [optional] |
|**indexing** | **Boolean** | Specifies whether to create a third-party room with indexing. |  [optional] |
|**denyDownload** | **Boolean** | Specifies whether to deny downloads from the third-party room. |  [optional] |
|**lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) | The room data lifetime information. |  [optional] |
|**watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) | The watermark settings. |  [optional] |
|**logo** | [**LogoRequest**](LogoRequest.md) | The room logo. |  [optional] |
|**tags** | **List&lt;String&gt;** | The list of tags. |  [optional] |
|**color** | **String** | The room color, as a six-digit hexadecimal value without a leading '#'. |  [optional] |
|**cover** | **String** | The room cover. |  [optional] |
|**chatSettings** | [**ChatSettings**](ChatSettings.md) | The chat settings. |  [optional] |
|**sendFormToExternalDB** | **Boolean** | Specifies whether to send form data to external database. |  [optional] |
|**saveFormAsXLSX** | **Boolean** | Specifies whether to save form data as XLSX file. |  [optional] |



