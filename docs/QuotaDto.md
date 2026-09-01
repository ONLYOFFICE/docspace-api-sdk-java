

# QuotaDto

The quota information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The quota ID. |  |
|**title** | **String** | The quota title. |  [optional] |
|**price** | [**PriceDto**](PriceDto.md) | The price parameters. |  |
|**nonProfit** | **Boolean** | Specifies if the quota is nonprofit or not. |  |
|**free** | **Boolean** | Specifies if the quota is free or not. |  |
|**trial** | **Boolean** | Specifies if the quota is trial or not. |  |
|**features** | [**List&lt;TenantQuotaFeatureDto&gt;**](TenantQuotaFeatureDto.md) | The list of tenant quota features. |  |
|**usersQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The user quota. |  [optional] |
|**roomsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The room quota. |  [optional] |
|**aiAgentsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The ai agent quota. |  [optional] |
|**tenantCustomQuota** | [**TenantQuotaSettings**](TenantQuotaSettings.md) | The tenant custom quota. |  [optional] |
|**dueDate** | **OffsetDateTime** | The due date. |  [optional] |



