

# TfaRequestsDto

The request parameters for configuring the Two-Factor Authentication (TFA) settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **TfaRequestsDtoType** | The two-factor authentication type. |  [optional] |
|**id** | **UUID** | The ID of the user for whom the TFA settings are being configured. |  [optional] |
|**trustedIps** | **List&lt;String&gt;** | The list of IP addresses that bypass TFA verification. Each entry is a single address, an inclusive  from-to range or a CIDR block. |  [optional] |
|**mandatoryUsers** | **List&lt;UUID&gt;** | The list of user IDs for whom TFA is mandatory. |  [optional] |
|**mandatoryGroups** | **List&lt;UUID&gt;** | The list group IDs whose members must use TFA. |  [optional] |



