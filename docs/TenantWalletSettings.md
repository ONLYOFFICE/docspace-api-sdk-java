

# TenantWalletSettings

The tenant wallet settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Specifies whether automatic top-up for the tenant wallet is enabled. |  [optional] |
|**minBalance** | **Integer** | The minimum wallet balance at which automatic top-up will be triggered. Must be between 5 and 1000. |  [optional] |
|**upToBalance** | **Integer** | The maximum wallet balance at which automatic top-up will be triggered. Must be between 6 and 5000. |  [optional] |
|**currency** | **String** | The three-character ISO 4217 currency symbol. |  [optional] |
|**lastModified** | **OffsetDateTime** | The date and time when the tenant wallet settings were last modified. |  [optional] |



