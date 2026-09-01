

# MailDomainSettingsRequestsDto

The request parameters for configuring trusted mail domains and visitor invitation settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **TenantTrustedDomainsType** | The type of the tenant trusted domains. |  |
|**domains** | **List&lt;String&gt;** | The list of authorized email domains that are considered trusted. |  |
|**inviteUsersAsVisitors** | **Boolean** | Specifies the default permission level for the invited users (visitors or not). |  |



