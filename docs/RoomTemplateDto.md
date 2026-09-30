

# RoomTemplateDto

The parameters of a room template built from an existing room.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roomId** | **Integer** | The identifier of the room the template is built from. Take it from the room listing of  `GET api/2.0/files/rooms`; a folder identifier is not accepted. |  |
|**title** | **String** | The title the template is saved under in the Templates section. Characters that a folder name cannot contain  are replaced with an underscore on save, and two templates may share a title. |  |
|**logo** | [**LogoRequest**](LogoRequest.md) | A picture of the caller's own for the template, cropped out of an image already placed in the temporary  storage. |  [optional] |
|**copyLogo** | **Boolean** | Whether the template takes over the picture already set on the source room. When false the template gets no  picture from that room. |  [optional] |
|**share** | **List&lt;String&gt;** | The email addresses of the portal members who are granted read access to the finished template. |  [optional] |
|**groups** | **List&lt;UUID&gt;** | The identifiers of the portal groups whose members are granted read access to the finished template. |  [optional] |
|**_public** | **Boolean** | Whether the finished template is shared with everyone allowed to create rooms. When false it stays reachable  only for the recipients named for it. |  [optional] |
|**tags** | **List&lt;String&gt;** | The labels attached to the template and shown next to it in listings. |  [optional] |
|**color** | **String** | The accent colour of the generated cover, written as six hexadecimal digits with no leading hash sign. When it  is left empty a colour is picked at random. |  [optional] |
|**cover** | **String** | The identifier of a built-in cover picture, as listed by `GET api/2.0/files/rooms/covers`. When it is left  empty the template gets no cover. |  [optional] |
|**quota** | **Long** | The storage limit assigned to the template, in bytes. When it is not set the template keeps the limit of the  source room. |  [optional] |



