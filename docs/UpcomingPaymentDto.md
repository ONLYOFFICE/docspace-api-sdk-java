

# UpcomingPaymentDto

The upcoming payment parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The quota ID. |  [optional] |
|**name** | **String** | The quota name. |  [optional] |
|**title** | **String** | The quota title. |  [optional] |
|**unitOfMeasure** | **String** | The quota unit of measure. |  [optional] |
|**quantity** | **Integer** | The quantity that will be charged (the next quantity if set, otherwise the current quantity). |  [optional] |
|**wallet** | **Boolean** | The quota applies to the wallet or not. |  [optional] |
|**dueDate** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
|**amount** | **Double** | The amount that will be charged (unit price multiplied by the quantity). |  [optional] |
|**currency** | **String** | The three-character ISO 4217 currency symbol of the amount. |  [optional] |



