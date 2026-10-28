

# SetWalletTopUpSettingsRequest

The part of the automatic top-up settings a payer chooses. The low-balance warning state is kept by the portal  itself and cannot be set here.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether the payment method on file is charged automatically when the wallet balance runs low. |  [optional] |
|**minBalance** | **Integer** | The balance below which a top-up is charged, in `currency`. |  [optional] |
|**upToBalance** | **Integer** | The balance a top-up brings the wallet up to, in `currency`. |  [optional] |
|**currency** | **String** | The three-letter ISO 4217 code both amounts are expressed in; it has to be the currency of the wallet. |  [optional] |
|**lowBalanceThreshold** | **Integer** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**lowBalanceNotified** | **Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
|**lastModified** | **OffsetDateTime** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |



