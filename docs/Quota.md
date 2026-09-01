

# Quota

The quota parameters.  <example>  {    id: 1,    quantity: 50,    wallet: false,    additional: false,    dueDate: 2026-03-31T00:00:00Z,    nextQuantity: 100,    state: Active  }  </example>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The quota ID. |  [optional] |
|**quantity** | **Integer** | The quota quantity. |  [optional] |
|**wallet** | **Boolean** | The quota applies to the wallet or not |  [optional] |
|**dueDate** | **OffsetDateTime** | The quota due date. |  [optional] |
|**nextQuantity** | **Integer** | The quota next quantity. |  [optional] |
|**additional** | **Boolean** | Indicates whether the quota is primary or additional. |  [optional] |
|**nextQuota** | **Integer** | The quota ID to switch to at the next period. |  [optional] |
|**state** | **QuotaState** | The quota state. |  [optional] |



