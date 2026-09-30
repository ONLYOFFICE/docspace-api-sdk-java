

# OperationTokenUsage

Tokens an AI operation consumed, as recorded in the operation metadata. A kind the provider did not report is `0`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalTokens** | **Long** | All tokens of the request: prompt plus completion. |  [optional] |
|**promptTokens** | **Long** | Tokens sent to the model, cached ones included. |  [optional] |
|**completionTokens** | **Long** | Tokens the model generated, reasoning ones included. |  [optional] |
|**cachedTokens** | **Long** | Part of the prompt tokens read from the provider cache. |  [optional] |
|**cacheWriteTokens** | **Long** | Part of the prompt tokens written to the provider cache. |  [optional] |
|**reasoningTokens** | **Long** | Part of the completion tokens the model spent on reasoning. |  [optional] |
|**imageTokens** | **Long** | Tokens spent on images. |  [optional] |



