

# CreateClientRequest

Client creation request containing client details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The client name. |  [optional] |
|**description** | **String** | The description of the client |  [optional] |
|**logo** | **String** | The logo of the client in base64 format |  [optional] |
|**scopes** | **Set&lt;String&gt;** | The scopes for the client |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**allowPkce** | **Boolean** | Indicates whether PKCE is allowed for the client |  [optional] |
|**isPublic** | **Boolean** | Indicates if the client is public |  [optional] |
|**websiteUrl** | **String** | The website URL of the client |  [optional] |
|**termsUrl** | **String** | The terms URL of the client |  [optional] |
|**policyUrl** | **String** | The policy URL of the client |  [optional] |
|**redirectUris** | **Set&lt;String&gt;** | The redirect URIs for the client |  |
|**allowedOrigins** | **Set&lt;String&gt;** | The allowed origins for the client |  |
|**logoutRedirectUri** | **String** | The logout redirect URI for the client |  [optional] |



