# docspace-api-sdk.org.openapitools.client.api.ThirdPartyAccountsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getThirdPartyAuthProviders**](PeopleThirdPartyAccountsApi.md#getThirdPartyAuthProviders) | **GET** /api/2.0/people/thirdparty/providers | Get third-party accounts |
| [**linkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#linkThirdPartyAccount) | **PUT** /api/2.0/people/thirdparty/linkaccount | Link a third-pary account |
| [**signupThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#signupThirdPartyAccount) | **POST** /api/2.0/people/thirdparty/signup | Create a third-pary account |
| [**unlinkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#unlinkThirdPartyAccount) | **DELETE** /api/2.0/people/thirdparty/unlinkaccount | Unlink a third-pary account |



## getThirdPartyAuthProviders

> AccountInfoArrayWrapper getThirdPartyAuthProviders(inviteView, settingsView, clientCallback, fromOnly)

Get third-party accountsReturns a list of the available third-party accounts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteView** | **Boolean**| Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers. | [optional] |
| **settingsView** | **Boolean**| Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false). | [optional] |
| **clientCallback** | **String**| The method that is called after authentication. | [optional] |
| **fromOnly** | **String**| The provider name if a response is required only from this provider. | [optional] |

### Return type

[**AccountInfoArrayWrapper**](AccountInfoArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyAccountsApi apiInstance = new ThirdPartyAccountsApi(defaultClient);
        Boolean inviteView = false; // Boolean | Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers.
        Boolean settingsView = false; // Boolean | Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false).
        String clientCallback = "onAuthCallback"; // String | The method that is called after authentication.
        String fromOnly = "Google"; // String | The provider name if a response is required only from this provider.
        try {
            AccountInfoArrayWrapper result = apiInstance.getThirdPartyAuthProviders(inviteView, settingsView, clientCallback, fromOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyAccountsApi#getThirdPartyAuthProviders");
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
| **200** | List of third-party accounts |  -  |


## linkThirdPartyAccount

> linkThirdPartyAccount(linkAccountRequestDto)

Link a third-pary accountLinks a third-party account specified in the request to the user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **linkAccountRequestDto** | [**LinkAccountRequestDto**](LinkAccountRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

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
import org.openapitools.client.api.ThirdPartyAccountsApi;

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


        ThirdPartyAccountsApi apiInstance = new ThirdPartyAccountsApi(defaultClient);
        LinkAccountRequestDto linkAccountRequestDto = new LinkAccountRequestDto(); // LinkAccountRequestDto | 
        try {
            apiInstance.linkThirdPartyAccount(linkAccountRequestDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyAccountsApi#linkThirdPartyAccount");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **405** | Error not allowed option |  -  |
| **401** | Unauthorized |  -  |


## signupThirdPartyAccount

> EmployeeWrapper signupThirdPartyAccount(signupAccountRequestDto)

Create a third-pary accountCreates a third-party account with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signupAccountRequestDto** | [**SignupAccountRequestDto**](SignupAccountRequestDto.md)|  | [optional] |

### Return type

[**EmployeeWrapper**](EmployeeWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyAccountsApi apiInstance = new ThirdPartyAccountsApi(defaultClient);
        SignupAccountRequestDto signupAccountRequestDto = new SignupAccountRequestDto(); // SignupAccountRequestDto | 
        try {
            EmployeeWrapper result = apiInstance.signupThirdPartyAccount(signupAccountRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyAccountsApi#signupThirdPartyAccount");
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
| **200** | Ok |  -  |
| **400** | Incorrect email |  -  |
| **403** | The invitation link is invalid or its validity has expired |  -  |


## unlinkThirdPartyAccount

> unlinkThirdPartyAccount(provider)

Unlink a third-pary accountUnlinks a third-party account specified in the request from the user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **provider** | **String**| The provider name. | [optional] |

### Return type

null (empty response body)

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
import org.openapitools.client.api.ThirdPartyAccountsApi;

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


        ThirdPartyAccountsApi apiInstance = new ThirdPartyAccountsApi(defaultClient);
        String provider = "Google"; // String | The provider name.
        try {
            apiInstance.unlinkThirdPartyAccount(provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyAccountsApi#unlinkThirdPartyAccount");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

