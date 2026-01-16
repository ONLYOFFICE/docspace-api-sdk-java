

# DbTenant

The database tenant parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The tenant ID. |  [optional] |
|**name** | **String** | The tenant name. |  [optional] |
|**alias** | **String** | The tenant alias. |  [optional] |
|**mappedDomain** | **String** | Mapped domain |  [optional] |
|**version** | **Integer** | The tenant version. |  [optional] |
|**VersionChangedField** | **OffsetDateTime** | The Version_changed field. |  [optional] |
|**versionChanged** | **OffsetDateTime** | The date and time when the version was changed. |  [optional] |
|**language** | **String** | The tenant language. |  [optional] |
|**timeZone** | **String** | The tenant time zone. |  [optional] |
|**trustedDomainsRaw** | **String** | The tenant trusted domains raw. |  [optional] |
|**trustedDomainsEnabled** | **TenantTrustedDomainsType** |  |  [optional] |
|**status** | **TenantStatus** |  |  [optional] |
|**statusChanged** | **OffsetDateTime** | The date and time when the tenant status was changed. |  [optional] |
|**statusChangedHack** | **OffsetDateTime** | The hacked date and time when the tenant status was changed. |  [optional] |
|**creationDateTime** | **OffsetDateTime** | The tenant creation date. |  [optional] |
|**ownerId** | **UUID** | The tenant owner ID. |  [optional] |
|**paymentId** | **String** | The tenant payment ID. |  [optional] |
|**industry** | **TenantIndustry** |  |  [optional] |
|**lastModified** | **OffsetDateTime** | The date and time when the tenant was last modified. |  [optional] |
|**calls** | **Boolean** | Specifies if the calls are available for the current tenant or not. |  [optional] |
|**partner** | [**DbTenantPartner**](DbTenantPartner.md) |  |  [optional] |



