

# DocsCloudTenant

Represents a DocsCloud tenant of a portal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dedicatedResourceExId** | **Integer** | The external ID of the dedicated resource the tenant is hosted on. |  [optional] |
|**alias** | **String** | The tenant alias. |  [optional] |
|**name** | **String** | The tenant name. |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date and time when the tenant was last modified. |  [optional] |
|**customerId** | **String** | The customer ID. |  [optional] |
|**customerName** | **String** | The customer name. |  [optional] |
|**endDate** | **OffsetDateTime** | The date and time when the tenant subscription ends. |  [optional] |
|**resourceType** | **Integer** | The resource type. |  [optional] |
|**isActive** | **Boolean** | Whether the tenant is active (the end date is in the future). |  [optional] |
|**address** | **String** | The tenant address. |  [optional] |
|**payment** | [**DocsCloudPayment**](DocsCloudPayment.md) | The tenant payment information. |  [optional] |



