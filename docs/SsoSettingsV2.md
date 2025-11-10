

# SsoSettingsV2

The SSO portal settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastModified** | **OffsetDateTime** |  |  [optional] |
|**enableSso** | **Boolean** | Specifies if the SSO settings are enabled or not. |  [optional] |
|**idpSettings** | [**SsoIdpSettings**](SsoIdpSettings.md) |  |  [optional] |
|**idpCertificates** | [**List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the IdP certificates. |  [optional] |
|**idpCertificateAdvanced** | [**SsoIdpCertificateAdvanced**](SsoIdpCertificateAdvanced.md) |  |  [optional] |
|**spLoginLabel** | **String** | The SP login label. |  [optional] |
|**spCertificates** | [**List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the SP certificates. |  [optional] |
|**spCertificateAdvanced** | [**SsoSpCertificateAdvanced**](SsoSpCertificateAdvanced.md) |  |  [optional] |
|**fieldMapping** | [**SsoFieldMapping**](SsoFieldMapping.md) |  |  [optional] |
|**hideAuthPage** | **Boolean** | Specifies if the authentication page will be hidden or not. |  [optional] |
|**usersType** | **Integer** | The user type. |  [optional] |
|**disableEmailVerification** | **Boolean** | Specifies if the email verification is disabled or not. |  [optional] |



