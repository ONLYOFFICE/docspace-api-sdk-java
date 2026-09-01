

# AiImportError

Per-entry error reported by `PromptsEngine.importBundle`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | `folder` or `prompt`, plus the offending name or id. |  |
|**ref** | **String** | The offending entry - its name or its id. |  |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the entry was rejected. |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |
| PROMPT | &quot;prompt&quot; |



