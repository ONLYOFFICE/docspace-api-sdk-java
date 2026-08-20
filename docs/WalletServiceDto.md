

# WalletServiceDto

The wallet service information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The quota ID. |  |
|**title** | **String** | The quota title. |  |
|**price** | [**PriceDto**](PriceDto.md) |  |  |
|**nonProfit** | **Boolean** | Specifies if the quota is nonprofit or not. |  |
|**free** | **Boolean** | Specifies if the quota is free or not. |  |
|**trial** | **Boolean** | Specifies if the quota is trial or not. |  |
|**features** | [**List&lt;TenantQuotaFeatureDto&gt;**](TenantQuotaFeatureDto.md) | The list of tenant quota features. |  |
|**usersQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
|**roomsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
|**aiAgentsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
|**tenantCustomQuota** | [**TenantQuotaSettings**](TenantQuotaSettings.md) |  |  [optional] |
|**dueDate** | **OffsetDateTime** | The due date. |  [optional] |
|**innerServices** | [**List&lt;WalletServiceDto&gt;**](WalletServiceDto.md) | The list of inner services. |  [optional] |
|**serviceName** | **String** | The service name. |  [optional] |



