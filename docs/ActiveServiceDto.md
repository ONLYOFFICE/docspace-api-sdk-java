

# ActiveServiceDto

Represents an active wallet service (quota) of the current portal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**service** | **String** | The name of the service. |  [optional] |
|**serviceUnit** | **String** | The unit of measurement for the service. |  [optional] |
|**subscription** | **Boolean** | Indicates whether the service is subscription-based. |  [optional] |
|**title** | **String** | The title of the service. |  [optional] |
|**limit** | **Integer** | The service limit. Populated only for the subscription-based services. |  [optional] |
|**used** | **Integer** | The current service usage. Populated only for the subscription-based services. |  [optional] |



