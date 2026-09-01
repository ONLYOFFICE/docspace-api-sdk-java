

# ConfigurationDtoInteger

The configuration parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**document** | [**DocumentConfigDto**](DocumentConfigDto.md) | The document configuration. |  |
|**documentType** | **String** | The document type. |  |
|**editorConfig** | [**EditorConfigurationDto**](EditorConfigurationDto.md) | The editor configuration. |  |
|**editorType** | **EditorType** | The editor type. |  |
|**editorUrl** | **URI** | The editor URL. |  |
|**token** | **String** | The token of the file configuration. |  [optional] |
|**type** | **String** | The platform type. |  [optional] |
|**_file** | [**FileDtoInteger**](FileDtoInteger.md) | The file parameters. |  |
|**errorMessage** | **String** | The error message. |  [optional] |
|**startFilling** | **Boolean** | Specifies if the file filling has started or not. |  [optional] |
|**fillingStatus** | **Boolean** | The file filling status. |  [optional] |
|**startFillingMode** | **StartFillingMode** | The start filling mode. |  [optional] |
|**fillingSessionId** | **String** | The file filling session ID. |  [optional] |
|**quotaExceededScope** | **QuotaScope** | Indicates which quota scope has been exceeded. |  [optional] |
|**generationToolCallState** | [**EditorToolCallStateDto**](EditorToolCallStateDto.md) | The generation tool call state. Used to run the agent flow in the editor. |  [optional] |



