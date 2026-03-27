

# ChunkedUploadSessionResponseInteger

Represents the response returned from a chunked upload session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the entity. |  [optional] |
|**path** | **List&lt;Integer&gt;** | Represents the hierarchical path of folders associated with a chunked upload session. |  [optional] |
|**created** | **OffsetDateTime** | The timestamp indicating when the chunked upload session was created. |  [optional] |
|**expired** | **OffsetDateTime** | The date and time when the chunked upload session is set to expire. |  [optional] |
|**location** | **String** | Represents the URI or path of the chunked upload session's current location. |  [optional] |
|**bytesTotal** | **Long** | The total size, in bytes, of the file being uploaded in the chunked upload session. |  [optional] |



