

# CustomerOperationsReportRequestDto

The request parameters for generating a report on client operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceName** | **String** | The service name. |  [optional] |
|**writeOffServiceQuota** | **Boolean** | Write-off of the quota for the service |  [optional] |
|**startDate** | **OffsetDateTime** | The report start date. |  [optional] |
|**endDate** | **OffsetDateTime** | The report end date. |  [optional] |
|**participantName** | **String** | The participant name. |  [optional] |
|**credit** | **Boolean** | Specifies whether to include credit operations in the report. |  [optional] |
|**debit** | **Boolean** | Specifies whether to include debit operations in the report. |  [optional] |
|**types** | **OperationType** |  |  [optional] |
|**status** | **OperationStatus** |  |  [optional] |
|**orderBy** | **String** | The field to order by. |  [optional] |
|**orderType** | **OperationOrderType** |  |  [optional] |



