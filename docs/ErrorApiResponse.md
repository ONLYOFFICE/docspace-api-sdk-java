

# ErrorApiResponse

The error body returned with every failed request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **Integer** | The response status flag. Always 1 on an error, as opposed to 0 on success. |  [optional] |
|**statusCode** | **Integer** | The HTTP status code of the response, repeated in the body. |  [optional] |
|**error** | [**ErrorApiResponseError**](ErrorApiResponseError.md) |  |  [optional] |



