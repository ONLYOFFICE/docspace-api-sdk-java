

# PageableModificationResponse

One page of results ordered by modification time, together with the cursor that asks for the next page.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Object** |  |  [optional] |
|**limit** | **Integer** | The page size that was applied to this request, between 1 and 50. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | The cursor to send back as last_modified_on to ask for the next page. It is null when the page is empty. |  [optional] |



