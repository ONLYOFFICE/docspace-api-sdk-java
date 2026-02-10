

# RoomTemplateDto

The room template parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roomId** | **Integer** | The room template ID. |  |
|**title** | **String** | The room template title. |  [optional] |
|**logo** | [**LogoRequest**](LogoRequest.md) |  |  [optional] |
|**copyLogo** | **Boolean** | Specifies whether to copy room logo or not. |  [optional] |
|**share** | **List&lt;String&gt;** | The collection of email addresses of users with whom to share a room. |  [optional] |
|**groups** | **List&lt;UUID&gt;** | The collection of groups with whom to share a room. |  [optional] |
|**_public** | **Boolean** | Specifies whether the room template is public or not. |  [optional] |
|**tags** | **List&lt;String&gt;** | The collection of tags. |  [optional] |
|**color** | **String** | The color of the room template. |  [optional] |
|**cover** | **String** | The cover of the room template. |  [optional] |
|**quota** | **Long** | Room quota |  [optional] |



