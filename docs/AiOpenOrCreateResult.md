

# AiOpenOrCreateResult

Resolved thread state returned by `ThreadsEngine.openOrCreate`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threadId** | **String** | The thread that was opened, or the one just created. |  |
|**title** | **String** | Empty string for existing threads — the engine doesn't re-fetch. |  |
|**priorMessages** | [**List&lt;AiThreadMessageLike&gt;**](AiThreadMessageLike.md) | The messages already in the thread - empty for a thread that was just created. |  |



