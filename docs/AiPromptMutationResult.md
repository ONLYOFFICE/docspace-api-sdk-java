

# AiPromptMutationResult

Outcome of `create` / `update` / `move` on a prompt — either the persisted prompt or a field-scoped error.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the prompt was persisted. |  |
|**prompt** | [**AiPrompt**](AiPrompt.md) | The persisted prompt. Present on success. |  [optional] |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the prompt was rejected. Present on failure. |  [optional] |



