

# AiFolderMutationResult

Outcome of `createFolder` / `renameFolder` — either the persisted folder or a field-scoped error.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the folder was persisted. |  |
|**folder** | [**AiPromptFolder**](AiPromptFolder.md) | The persisted folder. Present on success. |  [optional] |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the folder was rejected. Present on failure. |  [optional] |



