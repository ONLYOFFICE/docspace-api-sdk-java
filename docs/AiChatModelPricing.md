

# AiChatModelPricing

The pricing of a single chat model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the model, as the provider expects it on the wire. |  |
|**alias** | **String** | The display name of the model. |  [optional] |
|**ownedBy** | **String** | The owner of the model, as reported by the provider. |  [optional] |
|**provider** | **String** | The provider that serves the model. |  [optional] |
|**link** | **String** | The link to the pricing page of the model. |  [optional] |
|**price** | [**AiChatPrice**](AiChatPrice.md) | The price of a chat model, per token. |  |



