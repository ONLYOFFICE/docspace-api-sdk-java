# docspace-api-sdk.org.openapitools.client.api.AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeOAuth**](OAuth20AuthorizationApi.md#authorizeOAuth) | **GET** /oauth2/authorize | OAuth2 Authorization Endpoint |
| [**exchangeToken**](OAuth20AuthorizationApi.md#exchangeToken) | **POST** /oauth2/token | OAuth2 Token Endpoint |
| [**submitConsent**](OAuth20AuthorizationApi.md#submitConsent) | **POST** /oauth2/authorize | OAuth2 consent endpoint |



## authorizeOAuth

> authorizeOAuth(responseType, clientId, redirectUri, scope)

OAuth2 Authorization EndpointInitiates the OAuth2 authorization flow.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseType** | **String**| The OAuth 2.0 response type, must be 'code' for authorization code flow. | |
| **clientId** | **String**| The client identifier issued to the client during registration. | |
| **redirectUri** | **String**| The URL to redirect to after authorization is complete. | |
| **scope** | **String**| The space-separated list of requested scope permissions. | |

### Return type

null (empty response body)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        AuthorizationApi apiInstance = new AuthorizationApi(defaultClient);
        String responseType = "code"; // String | The OAuth 2.0 response type, must be 'code' for authorization code flow.
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | The client identifier issued to the client during registration.
        String redirectUri = "https://example.com"; // String | The URL to redirect to after authorization is complete.
        String scope = "files:read"; // String | The space-separated list of requested scope permissions.
        try {
            apiInstance.authorizeOAuth(responseType, clientId, redirectUri, scope);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#authorizeOAuth");
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
| **200** | Authorization page |  -  |
| **400** | Invalid request parameters |  -  |


## exchangeToken

> ExchangeToken200Response exchangeToken(grantType, code, redirectUri, clientId, clientSecret)

OAuth2 Token EndpointExchange authorization code for access token

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| The OAuth2 grant type, must be 'authorization_code' for the authorization code flow. | [optional] |
| **code** | **String**| A temporary authorization code that is sent to the client to be exchanged for a token. | [optional] |
| **redirectUri** | **String**| The URL where the user will be redirected after successful or unsuccessful authentication. | [optional] |
| **clientId** | **String**| The client identifier issued to the client during registration. | [optional] |
| **clientSecret** | **String**| The client secret issued to the client during registration. | [optional] |

### Return type

[**ExchangeToken200Response**](ExchangeToken200Response.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AuthorizationApi apiInstance = new AuthorizationApi(defaultClient);
        String grantType = "grantType_example"; // String | The OAuth2 grant type, must be 'authorization_code' for the authorization code flow.
        String code = "code_example"; // String | A temporary authorization code that is sent to the client to be exchanged for a token.
        String redirectUri = "redirectUri_example"; // String | The URL where the user will be redirected after successful or unsuccessful authentication.
        String clientId = "clientId_example"; // String | The client identifier issued to the client during registration.
        String clientSecret = "clientSecret_example"; // String | The client secret issued to the client during registration.
        try {
            ExchangeToken200Response result = apiInstance.exchangeToken(grantType, code, redirectUri, clientId, clientSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#exchangeToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully exchanged authorization code for access token |  -  |
| **400** | Invalid request parameters |  -  |


## submitConsent

> submitConsent(clientId, state, scope)

OAuth2 consent endpointSends consent approval

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The client identifier issued to the client during registration. | [optional] |
| **state** | **String**| The random string used to solve the CSRF vulnerability problem. | [optional] |
| **scope** | **String**| The space-separated list of requested scope permissions. | [optional] |

### Return type

null (empty response body)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        AuthorizationApi apiInstance = new AuthorizationApi(defaultClient);
        String clientId = "clientId_example"; // String | The client identifier issued to the client during registration.
        String state = "state_example"; // String | The random string used to solve the CSRF vulnerability problem.
        String scope = "scope_example"; // String | The space-separated list of requested scope permissions.
        try {
            apiInstance.submitConsent(clientId, state, scope);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#submitConsent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Redirect to the client's redirect URI with authorization code |  -  |
| **400** | Invalid request parameters |  -  |

