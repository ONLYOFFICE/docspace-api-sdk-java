

# ConversationResultArrayWrapper

The successful API response containing the list of ConversationResultDto objects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**response** | [**List&lt;ConversationResultDto&gt;**](ConversationResultDto.md) | The list of ConversationResultDto objects returned by the operation. |  [optional] |
|**count** | **Integer** | How many items this response carries: the length of the page for a list, 1 for a single object |  [optional] |
|**total** | **Long** | How many items the whole list holds across all pages, for working out how many pages to request. Sent only by the operations that page their results, and left out of every other response |  [optional] |
|**links** | [**List&lt;GetPortalPrices200ResponseLinksInner&gt;**](GetPortalPrices200ResponseLinksInner.md) | List of links related to the response |  [optional] |
|**status** | **Integer** | HTTP status code of the response |  [optional] |
|**statusCode** | **Integer** | HTTP status code of the response (duplicate of status) |  [optional] |



