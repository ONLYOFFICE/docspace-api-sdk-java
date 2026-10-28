

# SecurityInfoSimpleRequestDto

The rights to apply to a single file or folder, and how to announce them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**share** | [**List&lt;FileShareParams&gt;**](FileShareParams.md) | One record per account or group whose rights are being set, each naming the subject and the level it gets; a  level of `None` takes the access away. An empty collection makes the call change nothing. |  [optional] |
|**notify** | **Boolean** | Set to true to have every account named in `share` emailed about the access it just received; false changes  the rights without telling anyone. |  [optional] |
|**sharingMessage** | **String** | The text put into that email, ignored while `notify` is false. Markup is stripped before sending, so only the  plain text of the value survives. |  [optional] |



