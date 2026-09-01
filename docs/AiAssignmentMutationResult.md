

# AiAssignmentMutationResult

Outcome of `AssignmentsEngine.assign` / `AssignmentsEngine.unassign`. Either a success or a field-scoped error suitable for displaying in the profile editor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the assignment was persisted. |  |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the assignment was rejected. Present on failure. |  [optional] |



