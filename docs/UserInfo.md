

# UserInfo

The user information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The user ID. |  [optional] |
|**firstName** | **String** | The user&#39;s first name. |  [optional] |
|**lastName** | **String** | The user&#39;s last name. |  [optional] |
|**userName** | **String** | The user username. |  [optional] |
|**birthDate** | **OffsetDateTime** | The user birthday. |  [optional] |
|**sex** | **Boolean** | The user sex (male or female). |  [optional] |
|**status** | **EmployeeStatus** |  |  [optional] |
|**activationStatus** | **EmployeeActivationStatus** |  |  [optional] |
|**terminatedDate** | **OffsetDateTime** | The date and time when the user account was terminated. |  [optional] |
|**title** | **String** | The user title. |  [optional] |
|**workFromDate** | **OffsetDateTime** | The user registration date. |  [optional] |
|**email** | **String** | The user email address. |  [optional] |
|**contacts** | **String** | The list of user contacts in the string format. |  [optional] |
|**contactsList** | **List&lt;String&gt;** | The list of user contacts. |  [optional] |
|**location** | **String** | The user location. |  [optional] |
|**notes** | **String** | The user notes. |  [optional] |
|**removed** | **Boolean** | Specifies if the user account was removed or not. |  [optional] |
|**lastModified** | **OffsetDateTime** | The date and time when the user account was last modified. |  [optional] |
|**tenantId** | **Integer** | The tenant ID. |  [optional] |
|**isActive** | **Boolean** | Specifies if the user is active or not. |  [optional] [readonly] |
|**cultureName** | **String** | The user culture code. |  [optional] |
|**mobilePhone** | **String** | The user mobile phone. |  [optional] |
|**mobilePhoneActivationStatus** | **MobilePhoneActivationStatus** |  |  [optional] |
|**sid** | **String** | The LDAP user identifier. |  [optional] |
|**ldapQouta** | **Long** | The LDAP user quota attribute. |  [optional] |
|**ssoNameId** | **String** | The SSO SAML user identifier. |  [optional] |
|**ssoSessionId** | **String** | The SSO SAML user session identifier. |  [optional] |
|**createDate** | **OffsetDateTime** | The date and time when the user account was created. |  [optional] |
|**createdBy** | **UUID** | The ID of the user who created the current user account. |  [optional] |
|**spam** | **Boolean** | Specifies if tips, updates and offers are allowed to be sent to the user or not. |  [optional] |
|**checkActivation** | **Boolean** | Indicates whether the activation status of the employee or recipient is unchecked or inactive.  Depending on the context, this property evaluates the activation or eligibility status accordingly. |  [optional] [readonly] |



