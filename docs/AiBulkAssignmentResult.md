

# AiBulkAssignmentResult

Outcome of  {@link  AssignmentsEngine.bulkAssign } . Either every entry persisted, or no entries persisted and a per-key error report. The engine validates first and writes second so a single bad entry never leaves the assignment table in a half-written state.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** |  |  |
|**errors** | [**List&lt;AiBulkAssignmentResultErrorsInner&gt;**](AiBulkAssignmentResultErrorsInner.md) |  |  [optional] |



