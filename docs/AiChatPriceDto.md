

# AiChatPriceDto

What a chat model charges, split by the direction the tokens flow in.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **Double** | The cost of one million tokens sent to the model, which includes the conversation history resent with  every turn and not just the newest message. |  [optional] |
|**completion** | **Double** | The cost of one million tokens the model writes back. It is normally the dearer of the two directions. |  [optional] |
|**promptCacheRead** | **Double** | The cost of one million prompt tokens served from the prompt cache. It is absent when the model does not  support prompt caching. |  [optional] |
|**promptCacheWrite** | **Double** | The cost of one million prompt tokens written to the prompt cache with the default lifetime. It is absent  when the model does not support prompt caching. |  [optional] |
|**promptCacheWrite1H** | **Double** | The cost of one million prompt tokens written to the prompt cache with a one-hour lifetime. It is absent  when the model offers no such option. |  [optional] |



