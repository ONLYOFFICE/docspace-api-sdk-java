

# AiProfileMutationResult

Outcome of `create` / `update` — either a success carrying the persisted profile, or a failure with a field-level error description from the name check or the provider credential check.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | True when the profile was persisted. |  |
|**profile** | [**AiProfile**](AiProfile.md) | The persisted profile. Present on success. |  [optional] |
|**error** | [**AiTErrorData**](AiTErrorData.md) | Why the profile was rejected - the name check or the provider credential check. Present on failure. |  [optional] |



