

# UpdateServiceLimitRequestDto

The new thresholds and state of an existing service limit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits. |  |
|**amountValue** | **Double** | The most money the AI services may cost per period, in their currency. Zero blocks the AI services completely. |  [optional] |
|**quantityValue** | **Integer** | The largest quantity the AI services may consume per period, in their common unit. Zero blocks the AI services  completely. |  [optional] |
|**enabled** | **Boolean** | Whether the limit is in force: false switches it off at once, true switches it back on. |  [optional] |



