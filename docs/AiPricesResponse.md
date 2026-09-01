

# AiPricesResponse

The AI price list: per-model pricing for every model kind, in a single currency.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chat** | [**List&lt;AiChatModelPricing&gt;**](AiChatModelPricing.md) | The pricing of every available chat model. |  |
|**embedding** | [**List&lt;AiEmbeddingModelPricing&gt;**](AiEmbeddingModelPricing.md) | The pricing of every available embedding model. |  |
|**image** | [**List&lt;AiImageModelPricing&gt;**](AiImageModelPricing.md) | The pricing of every available image model. |  |
|**search** | [**List&lt;AiWebSearchPricing&gt;**](AiWebSearchPricing.md) | The pricing of every available web search provider. |  |
|**currency** | [**CurrencyInfo**](CurrencyInfo.md) | The currency the AI prices are quoted in. |  |



