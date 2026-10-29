

# AiMetaGenerateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | The entry's table. Only `file` for now: a folder or a room answers 400. |  |
|**id** | [**AiMetaGenerateRequestId**](AiMetaGenerateRequestId.md) |  |  |
|**prompt** | **String** | What kind of metadata fields the caller is interested in; a hint for the model. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |



