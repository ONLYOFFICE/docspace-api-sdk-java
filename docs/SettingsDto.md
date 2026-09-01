

# SettingsDto

The settings information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timezone** | **String** | The time zone. |  [optional] |
|**trustedDomains** | **List&lt;String&gt;** | The list of the trusted domains. |  [optional] |
|**trustedDomainsType** | **TenantTrustedDomainsType** | The type of the trusted domains. |  [optional] |
|**culture** | **String** | The language. |  |
|**utcOffset** | **String** | The UTC offset in the TimeSpan format. |  [optional] |
|**utcHoursOffset** | **Double** | The UTC offset in hours. |  [optional] |
|**greetingSettings** | **String** | The greeting settings. |  [optional] |
|**ownerId** | **UUID** | The owner ID. |  [optional] |
|**nameSchemaId** | **String** | The team template ID. |  [optional] |
|**enabledJoin** | **Boolean** | Specifies if a user can join the portal or not. |  [optional] |
|**enableAdmMess** | **Boolean** | Specifies if a user can send a message to the administrator when accessing the DocSpace portal or not. |  [optional] |
|**thirdpartyEnable** | **Boolean** | Specifies if a user can connect third-party providers to the portal or not. |  [optional] |
|**docSpace** | **Boolean** | Specifies if this portal is a DocSpace portal or not. |  [optional] |
|**standalone** | **Boolean** | Indicates whether the system is running in standalone mode. |  [optional] |
|**isAmi** | **Boolean** | Specifies if this portal is the AMI instance or not. |  [optional] |
|**baseDomain** | **String** | The base domain. |  |
|**wizardToken** | **String** | The wizard token. |  [optional] |
|**passwordHash** | [**PasswordHasher**](PasswordHasher.md) | The password hash. |  [optional] |
|**firebase** | [**FirebaseDto**](FirebaseDto.md) | The Firebase parameters. |  [optional] |
|**version** | **String** | The portal version. |  [optional] |
|**recaptchaType** | **RecaptchaType** | The type of CAPTCHA validation used. |  [optional] |
|**recaptchaPublicKey** | **String** | The ReCAPTCHA public key. |  [optional] |
|**debugInfo** | **Boolean** | Specifies if the debug information will be sent or not. |  [optional] |
|**socketUrl** | **String** | The socket URL. |  [optional] |
|**tenantStatus** | **TenantStatus** | The tenant status. |  [optional] |
|**tenantAlias** | **String** | The tenant alias. |  [optional] |
|**displayAbout** | **Boolean** | Specifies whether to display the About portal section. |  [optional] |
|**domainValidator** | [**TenantDomainValidator**](TenantDomainValidator.md) | The domain validator. |  [optional] |
|**zendeskKey** | **String** | The Zendesk key. |  [optional] |
|**tagManagerId** | **String** | The tag manager ID. |  [optional] |
|**cookieSettingsEnabled** | **Boolean** | Specifies whether the cookie settings are enabled. |  |
|**limitedAccessSpace** | **Boolean** | Specifies whether the access to the space management is limited or not. |  [optional] |
|**limitedAccessDevToolsForUsers** | **Boolean** | Specifies whether the access to the Developer Tools is limited for users or not. |  [optional] |
|**displayBanners** | **Boolean** | Specifies whether to display the promotional banners. |  [optional] |
|**aiEnabled** | **Boolean** | Specifies whether AI functionality (chat, agents, vectorization) is enabled for the current tenant.  When `false`, all AI features are disabled and the AI Agents folder is hidden. |  [optional] |
|**walletLowBalance** | **Boolean** | Specifies whether the tenant wallet balance is currently below the low-balance threshold. Only returned to portal administrators. |  [optional] |
|**userNameRegex** | **String** | The user name validation regex. |  [optional] |
|**invitationLimit** | **Integer** | The maximum number of invitations to the portal. |  [optional] |
|**plugins** | [**PluginsDto**](PluginsDto.md) | The plugins settings. |  [optional] |
|**deepLink** | [**DeepLinkDto**](DeepLinkDto.md) | The deep link settings. |  |
|**formGallery** | [**FormGalleryDto**](FormGalleryDto.md) | The form gallery settings. |  [optional] |
|**maxImageUploadSize** | **Long** | The maximum image upload size. |  [optional] |
|**logoText** | **String** | The white label logo text. |  [optional] |
|**externalResources** | [**CultureSpecificExternalResources**](CultureSpecificExternalResources.md) | The external resources settings. |  [optional] |
|**defaultFolderType** | **FolderType** | Specifies the default folder type for the current settings. |  [optional] |
|**externalDbEnabled** | **Boolean** | Specifies if an external database is connected for storing form results. |  [optional] |



