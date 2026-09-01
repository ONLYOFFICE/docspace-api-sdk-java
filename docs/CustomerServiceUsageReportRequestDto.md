

# CustomerServiceUsageReportRequestDto

The request parameters for generating a customer service usage report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceName** | **List&lt;String&gt;** | The service name list. A single string is also accepted for backward compatibility. |  [optional] |
|**startDate** | **OffsetDateTime** | The report start date. |  [optional] |
|**endDate** | **OffsetDateTime** | The report end date. |  [optional] |
|**participantName** | **String** | The participant name. |  [optional] |
|**status** | **OperationStatus** | The operation status to filter by. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata key-value pairs to filter by. |  [optional] |
|**orderBy** | **String** | The field to order by. |  [optional] |
|**orderType** | **OperationOrderType** | Order direction: Ascending or Descending. |  [optional] |



