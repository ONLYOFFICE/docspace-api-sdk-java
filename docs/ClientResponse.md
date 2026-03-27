

# ClientResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The client name. |  [optional] |
|**description** | **String** | The client description. |  [optional] |
|**tenant** | **Long** | The tenant ID associated with the client. |  [optional] |
|**scopes** | **Set&lt;String&gt;** | The client scopes. |  [optional] |
|**enabled** | **Boolean** | Specifies if the client is currently enabled or not. |  [optional] |
|**clientId** | **String** | The client identifier issued to the client during registration. |  [optional] |
|**clientSecret** | **String** | The client secret issued to the client during registration. |  [optional] |
|**websiteUrl** | **String** | The URL to the client's website. |  [optional] |
|**termsUrl** | **String** | The URL to the client's terms of service. |  [optional] |
|**policyUrl** | **String** | The URL to the client's privacy policy. |  [optional] |
|**logo** | **String** | The URL to the client's logo. |  [optional] |
|**authenticationMethods** | **Set&lt;String&gt;** | The authentication methods supported by the client. |  [optional] |
|**redirectUris** | **Set&lt;String&gt;** | The list of allowed redirect URIs. |  [optional] |
|**allowedOrigins** | **Set&lt;String&gt;** | The list of allowed CORS origins. |  [optional] |
|**logoutRedirectUris** | **Set&lt;String&gt;** | The list of allowed logout redirect URIs. |  [optional] |
|**createdOn** | **OffsetDateTime** | The date and time when the client was created. |  [optional] |
|**createdBy** | **String** | The user who created the client. |  [optional] |
|**modifiedOn** | **OffsetDateTime** | The date and time when the client was last modified. |  [optional] |
|**modifiedBy** | **String** | The user who last modified the client. |  [optional] |
|**isPublic** | **Boolean** | Indicates whether the client is accessible by third-party tenants. |  [optional] |



