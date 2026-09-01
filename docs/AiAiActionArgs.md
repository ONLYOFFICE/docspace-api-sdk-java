

# AiAiActionArgs

Wire-serializable subset of the engine's `ActionArgs` — drops the engine-injected `signal`/`fetch`; `profile`/`messages` are owned by the engine and never sent by the caller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tools** | [**List&lt;AiTMCPItem&gt;**](AiTMCPItem.md) | Extra tools offered to the model for this request. |  [optional] |
|**isReasoning** | **Boolean** | Enable extended thinking / reasoning for this request. |  [optional] |
|**prompt** | [**AiAiActionArgsPrompt**](AiAiActionArgsPrompt.md) |  |  [optional] |



