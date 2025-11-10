

# TenantDto

The tenant parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateId** | **String** | The affiliate ID. |  [optional] |
|**tenantAlias** | **String** | The tenant alias. |  [optional] |
|**calls** | **Boolean** | Specifies if the calls are available for this tenant or not. |  [optional] |
|**campaign** | **String** | The tenant campaign. |  [optional] |
|**creationDateTime** | **OffsetDateTime** | The tenant creation date and time. |  [optional] [readonly] |
|**hostedRegion** | **String** | The hosted region. |  [optional] |
|**tenantId** | **Integer** | The tenant ID. |  [optional] [readonly] |
|**industry** | **TenantIndustry** |  |  [optional] |
|**language** | **String** | The tenant language. |  [optional] |
|**lastModified** | **OffsetDateTime** | The date and time when the tenant was last modified. |  [optional] |
|**mappedDomain** | **String** | The tenant mapped domain. |  [optional] |
|**name** | **String** | The tenant name. |  [optional] |
|**ownerId** | **UUID** | The tenant owner ID. |  [optional] |
|**paymentId** | **String** | The tenant payment ID. |  [optional] |
|**spam** | **Boolean** | Specifies if the ONLYOFFICE newsletter is allowed or not. |  [optional] |
|**status** | **TenantStatus** |  |  [optional] |
|**statusChangeDate** | **OffsetDateTime** | The date and time when the tenant status was changed. |  [optional] [readonly] |
|**timeZone** | **String** | The tenant time zone. |  [optional] |
|**trustedDomains** | **List&lt;String&gt;** | The list of tenant trusted domains. |  [optional] |
|**trustedDomainsRaw** | **String** | The tenant trusted domains in the string format. |  [optional] |
|**trustedDomainsType** | **TenantTrustedDomainsType** |  |  [optional] |
|**version** | **Integer** | The tenant version |  [optional] |
|**versionChanged** | **OffsetDateTime** | The date and time when the tenant version was changed. |  [optional] |
|**region** | **String** | The tenant AWS region. |  [optional] |



