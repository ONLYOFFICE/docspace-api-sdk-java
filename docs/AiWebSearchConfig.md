

# AiWebSearchConfig

Web-search provider configuration. Credentials and provider selection for the built-in web-search tool group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | Provider identifier (e.g. `exa`). |  |
|**key** | **String** | API key for the provider. Optional for self-hosted or keyless setups. |  [optional] |
|**baseUrl** | **String** | Optional override for the provider's base URL. |  [optional] |
|**isCloudProvider** | **Boolean** | Whether this provider is cloud-hosted (vs. self-hosted). |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | Extra HTTP headers sent with each request to the ONLYOFFICE / cloud backend (e.g. `X-Tenant`). Merged after the derived `Authorization` header, so a custom header of the same name wins. |  [optional] |



