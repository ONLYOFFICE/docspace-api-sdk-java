# docspace-api-sdk.org.openapitools.client.api.AuthenticationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateMe**](AuthenticationApi.md#authenticateMe) | **POST** /api/2.0/authentication | Authenticate a user |
| [**authenticateMeFromBodyWithCode**](AuthenticationApi.md#authenticateMeFromBodyWithCode) | **POST** /api/2.0/authentication/{code} | Authenticate a user by code |
| [**checkConfirm**](AuthenticationApi.md#checkConfirm) | **POST** /api/2.0/authentication/confirm | Open confirmation email URL |
| [**getIsAuthentificated**](AuthenticationApi.md#getIsAuthentificated) | **GET** /api/2.0/authentication | Check authentication |
| [**logout**](AuthenticationApi.md#logout) | **POST** /api/2.0/authentication/logout | Log out |
| [**saveMobilePhone**](AuthenticationApi.md#saveMobilePhone) | **POST** /api/2.0/authentication/setphone | Set a mobile phone |
| [**sendSmsCode**](AuthenticationApi.md#sendSmsCode) | **POST** /api/2.0/authentication/sendsms | Send SMS code |



## authenticateMe

> AuthenticationTokenWrapper authenticateMe(authRequestsDto)

Authenticate a userAuthenticates the current user by SMS, authenticator app, or without two-factor authentication.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authRequestsDto** | [**AuthRequestsDto**](AuthRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthRequestsDto authRequestsDto = new AuthRequestsDto(); // AuthRequestsDto | 
        try {
            AuthenticationTokenWrapper result = apiInstance.authenticateMe(authRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authenticateMe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication data |  -  |
| **400** | userName, password or passworHash is empty |  -  |
| **401** | User authentication failed |  -  |
| **404** | The user could not be found |  -  |
| **429** | Too many login attempts. Please try again later |  -  |


## authenticateMeFromBodyWithCode

> AuthenticationTokenWrapper authenticateMeFromBodyWithCode(code, authRequestsDto)

Authenticate a user by codeAuthenticates the current user by SMS or two-factor authentication code.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**|  | |
| **authRequestsDto** | [**AuthRequestsDto**](AuthRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String code = "code_example"; // String | 
        AuthRequestsDto authRequestsDto = new AuthRequestsDto(); // AuthRequestsDto | 
        try {
            AuthenticationTokenWrapper result = apiInstance.authenticateMeFromBodyWithCode(code, authRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authenticateMeFromBodyWithCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication data |  -  |
| **400** | userName, password or passworHash is empty |  -  |
| **401** | User authentication failed |  -  |
| **403** | Auth code is not available |  -  |
| **429** | Too many login attempts. Please try again later |  -  |


## checkConfirm

> ConfirmWrapper checkConfirm(emailValidationKeyModel)

Open confirmation email URLOpens a confirmation email URL to validate a certain action (employee invitation, portal removal, phone activation, etc.).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-confirm/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailValidationKeyModel** | [**EmailValidationKeyModel**](EmailValidationKeyModel.md)|  | [optional] |

### Return type

[**ConfirmWrapper**](ConfirmWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        EmailValidationKeyModel emailValidationKeyModel = new EmailValidationKeyModel(); // EmailValidationKeyModel | 
        try {
            ConfirmWrapper result = apiInstance.checkConfirm(emailValidationKeyModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#checkConfirm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validation result: Ok, Invalid, or Expired |  -  |


## getIsAuthentificated

> BooleanWrapper getIsAuthentificated()

Check authenticationChecks if the current user is authenticated or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-authentificated/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            BooleanWrapper result = apiInstance.getIsAuthentificated();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getIsAuthentificated");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Boolean value: true if the current user is authenticated |  -  |


## logout

> StringWrapper logout()

Log outLogs out of the current user account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/logout/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            StringWrapper result = apiInstance.logout();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#logout");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## saveMobilePhone

> AuthenticationTokenWrapper saveMobilePhone(mobileRequestsDto)

Set a mobile phoneSets a mobile phone for the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mobile-phone/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mobileRequestsDto** | [**MobileRequestsDto**](MobileRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        MobileRequestsDto mobileRequestsDto = new MobileRequestsDto(); // MobileRequestsDto | 
        try {
            AuthenticationTokenWrapper result = apiInstance.saveMobilePhone(mobileRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#saveMobilePhone");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication data |  -  |
| **401** | Unauthorized |  -  |


## sendSmsCode

> AuthenticationTokenWrapper sendSmsCode(authRequestsDto)

Send SMS codeSends SMS with an authentication code.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-sms-code/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authRequestsDto** | [**AuthRequestsDto**](AuthRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthRequestsDto authRequestsDto = new AuthRequestsDto(); // AuthRequestsDto | 
        try {
            AuthenticationTokenWrapper result = apiInstance.sendSmsCode(authRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#sendSmsCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication data |  -  |
| **400** | userName, password or passworHash is empty |  -  |
| **429** | Too many login attempts. Please try again later |  -  |

