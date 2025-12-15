

# HistoryDto

The file history information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier for the file history entry. |  |
|**action** | [**HistoryAction**](HistoryAction.md) |  |  |
|**initiator** | [**EmployeeDto**](EmployeeDto.md) |  |  |
|**date** | [**ApiDateTime**](ApiDateTime.md) |  |  |
|**data** | [**HistoryData**](HistoryData.md) |  |  |
|**related** | [**List&lt;HistoryDto&gt;**](HistoryDto.md) | The list of related history. |  [optional] |



