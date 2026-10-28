

# SsoSettingsDto

The SAML single sign-on configuration of the portal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastModified** | **OffsetDateTime** | The timestamp indicating when the settings were last modified. |  [optional] |
|**enableSso** | **Boolean** | Specifies if the SSO settings are enabled or not. |  [optional] |
|**idpSettings** | [**SsoIdpSettingsDto**](SsoIdpSettingsDto.md) | The SSO IdP settings. |  [optional] |
|**idpCertificates** | [**List&lt;SsoCertificateDto&gt;**](SsoCertificateDto.md) | The list of the IdP certificates. |  [optional] |
|**idpCertificateAdvanced** | [**SsoIdpCertificateAdvancedDto**](SsoIdpCertificateAdvancedDto.md) | The IdP advanced certificate. |  [optional] |
|**spLoginLabel** | **String** | The SP login label. |  [optional] |
|**spCertificates** | [**List&lt;SsoCertificateDto&gt;**](SsoCertificateDto.md) | The list of the SP certificates. |  [optional] |
|**spCertificateAdvanced** | [**SsoSpCertificateAdvancedDto**](SsoSpCertificateAdvancedDto.md) | The SP advanced certificate. |  [optional] |
|**fieldMapping** | [**SsoFieldMappingDto**](SsoFieldMappingDto.md) | The SSO field mapping. |  [optional] |
|**hideAuthPage** | **Boolean** | Specifies if the authentication page will be hidden or not. |  [optional] |
|**usersType** | **Integer** | The user type. |  [optional] |
|**disableEmailVerification** | **Boolean** | Specifies if the email verification is disabled or not. |  [optional] |



