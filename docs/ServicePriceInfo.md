

# ServicePriceInfo

Represents a price of the service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The price unique identifier. |  [optional] |
|**accountNumber** | **Integer** | The account number. |  [optional] |
|**serviceId** | **Integer** | The service ID. |  [optional] |
|**timeUnit** | **PriceTimeUnit** | The time unit the price is bound to. |  [optional] |
|**costPrice** | **Double** | The cost price. |  [optional] |
|**extraCharge** | **Double** | The extra charge added to the cost price. |  [optional] |
|**servicePrice** | **Double** | The resulting service price. |  [optional] |
|**quota** | **Double** | The quota the price is set for. |  [optional] |
|**timeBound** | [**TimeBound**](TimeBound.md) | The period the price is effective in. |  [optional] |
|**status** | **PriceStatus** | The price status. |  [optional] |
|**created** | **OffsetDateTime** | The date and time when the price was created. |  [optional] |
|**discountCategoryId** | **Integer** | The discount category ID. |  [optional] |
|**discountCategory** | [**DiscountCategory**](DiscountCategory.md) | The discount category. |  [optional] |



