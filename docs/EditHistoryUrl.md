

# EditHistoryUrl

The address, document key and format of the revision a comparison is made against.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The document key of that revision. When the file has no earlier revision the portal generates a fresh key for  the template it falls back to, so the value is not always one an earlier revision ever had. |  [optional] |
|**url** | **URI** | The address that revision's content is served from. It is meant for the editing service and carries its own  key, which is valid for a limited time. |  [optional] |
|**fileType** | **String** | The format of that revision, as an extension without the leading dot. |  [optional] |



