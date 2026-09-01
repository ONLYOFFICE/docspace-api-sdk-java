

# AiProfileMutationResult

Outcome of `create` / `update` — either a success carrying the persisted profile, or a failure with a field-level error description from the name check or the provider credential check.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** |  |  |
|**profile** | [**AiProfile**](AiProfile.md) |  |  [optional] |
|**error** | [**AiTErrorData**](AiTErrorData.md) |  |  [optional] |



