

# SubscriptionBalanceInfo

The information about the current subscription and its unused balance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCost** | **Double** | The total cost of the current billing period (the sum across all subscription items). |  [optional] |
|**currency** | **String** | The three-character ISO 4217 currency symbol of the subscription. |  [optional] |
|**periodStart** | **OffsetDateTime** | The start of the current billing period. |  [optional] |
|**periodEnd** | **OffsetDateTime** | The end of the current billing period. |  [optional] |
|**periodUsedUntil** | **OffsetDateTime** | The boundary of the used part of the period (the moment of the request). |  [optional] |
|**daysElapsed** | **Integer** | The number of days elapsed since the start of the period (inclusive). |  [optional] |
|**remainingBalance** | **Double** | The unused balance of the subscription, in the subscription currency. |  [optional] |
|**remainingBalanceInWalletCurrency** | **Double** | The unused balance of the subscription, converted to the wallet currency. |  [optional] |
|**walletCurrency** | **String** | The three-character ISO 4217 currency symbol of the wallet. |  [optional] |



