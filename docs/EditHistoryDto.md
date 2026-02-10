

# EditHistoryDto

The file editing history parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The document ID. |  [optional] |
|**key** | **String** | The document identifier used to unambiguously identify the document file. |  [optional] |
|**version** | **Integer** | The document version number. |  [optional] |
|**versionGroup** | **Integer** | The document version group. |  [optional] |
|**user** | [**EditHistoryAuthor**](EditHistoryAuthor.md) |  |  [optional] |
|**created** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
|**changesHistory** | **String** | The file history changes in the string format. |  [optional] |
|**changes** | [**List&lt;EditHistoryChangesWrapper&gt;**](EditHistoryChangesWrapper.md) | The list of file history changes. |  [optional] |
|**serverVersion** | **String** | The current server version number. |  [optional] |



