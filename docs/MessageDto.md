

# MessageDto

The chat message information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The unique identifier of the message. |  [optional] |
|**role** | **Role** |  |  [optional] |
|**contents** | [**List&lt;MessageContentDto&gt;**](MessageContentDto.md) | The ordered collection of content blocks that make up the message body (text, tool calls, or attachments). |  [optional] |
|**createdOn** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |



