

# TfaSettingsDto

The parameters representing the Two-Factor Authentication (TFA) configuration settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the TFA configuration. |  |
|**title** | **String** | The display name or description of the TFA configuration. |  |
|**enabled** | **Boolean** | Indicates whether the TFA configuration is currently active. |  |
|**available** | **Boolean** | Indicates whether the TFA configuration can be used. |  |
|**trustedIps** | **List&lt;String&gt;** | The list of IP addresses that are exempt from TFA requirements. |  [optional] |
|**mandatoryUsers** | **List&lt;UUID&gt;** | The list of user IDs that are required to use TFA. |  [optional] |
|**mandatoryGroups** | **List&lt;UUID&gt;** | The list of group IDs whose members are required to use TFA. |  [optional] |



