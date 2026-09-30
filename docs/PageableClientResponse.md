

# PageableClientResponse

One page of full client records together with the next-page cursor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;ClientResponse&gt;**](ClientResponse.md) | The items on this page, at most as many as the requested limit. An empty array means there is nothing further to read. |  [optional] |
|**limit** | **Integer** | The page size that was applied to this request, between 1 and 50. |  [optional] |
|**lastClientId** | **String** | The cursor to send back as last_client_id to ask for the next page, together with last_created_on. It is null when the page is empty. |  [optional] |
|**lastCreatedOn** | **OffsetDateTime** | The cursor to send back as last_created_on to ask for the next page, together with last_client_id. It is null when the page is empty. |  [optional] |



