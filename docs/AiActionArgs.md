

# AiActionArgs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tools** | [**List&lt;AiMCPItem&gt;**](AiMCPItem.md) | Extra tools offered to the model for this request. |  [optional] |
|**isReasoning** | **Boolean** | Legacy extended-thinking switch; stands for `medium`. `reasoningLevel` wins when both are set. |  [optional] |
|**reasoningLevel** | **AiReasoningLevel** | Depth of extended thinking for the round; providers clamp it to what the model accepts. |  [optional] |
|**prompt** | [**AiActionArgsPrompt**](AiActionArgsPrompt.md) |  |  [optional] |



