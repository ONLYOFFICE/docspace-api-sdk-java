

# CustomerOperationsReportRequestDto

The request parameters for generating a report on client operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceName** | **List&lt;String&gt;** | The service name list. A single string is also accepted for backward compatibility. |  [optional] |
|**startDate** | **OffsetDateTime** | The report start date. |  [optional] |
|**endDate** | **OffsetDateTime** | The report end date. |  [optional] |
|**participantName** | **String** | The participant name. |  [optional] |
|**credit** | **Boolean** | Specifies whether to include credit operations in the report. |  [optional] |
|**debit** | **Boolean** | Specifies whether to include debit operations in the report. |  [optional] |
|**type** | **OperationType** | The operation type to filter by. |  [optional] |
|**status** | **OperationStatus** | The operation status to filter by. |  [optional] |
|**orderBy** | **String** | The field to order by. |  [optional] |
|**orderType** | **OperationOrderType** | Order direction: Ascending or Descending. |  [optional] |



