

# Tariff

The tariff parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The tariff ID. |  [optional] |
|**state** | **TariffState** |  |  [optional] |
|**dueDate** | **OffsetDateTime** | The tariff due date. |  |
|**delayDueDate** | **OffsetDateTime** | The tariff delay due date. |  [optional] |
|**licenseDate** | **OffsetDateTime** | The tariff license date. |  [optional] |
|**customerId** | **String** | The tariff customer ID. |  [optional] |
|**quotas** | [**List&lt;Quota&gt;**](Quota.md) | The list of tariff quotas. |  |
|**overdueQuotas** | [**List&lt;Quota&gt;**](Quota.md) | The list of overdue tariff quotas. |  [optional] |



