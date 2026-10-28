# docspace-api-sdk.org.openapitools.client.api.AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeOAuth**](OAuth20AuthorizationApi.md#authorizeOAuth) | **GET** /oauth2/authorize | Start the authorization flow |
| [**exchangeToken**](OAuth20AuthorizationApi.md#exchangeToken) | **POST** /oauth2/token | Exchange the authorization code |
| [**submitConsent**](OAuth20AuthorizationApi.md#submitConsent) | **POST** /oauth2/authorize | Submit the consent decision |



## authorizeOAuth

> authorizeOAuth(responseType, clientId, redirectUri, scope)

Start the authorization flowStarts the OAuth2 authorization code flow for the client named by client_id. The caller has to present the portal signature cookie, and a request without a valid one is not refused with 401 or 403 but redirected to the portal login page, carrying the client ID so the flow can resume after signing in. When the user has not yet consented to the requested scopes the browser is redirected to the consent page; once the consent exists the browser is redirected to the client's redirect URI with the authorization code and, when one was sent, the original state. A caller that cannot follow redirects may send the X-Disable-Redirect header, and then the response is 200 with an empty body and the target URL in the X-Redirect-URI header. The code returned here is exchanged for tokens at the token endpoint.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseType** | **String**| The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint. | |
| **clientId** | **String**| The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against. | |
| **redirectUri** | **String**| Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused. | |
| **scope** | **String**| The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these. | |

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
        String responseType = "code"; // String | The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint.
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against.
        String redirectUri = "https://example.com"; // String | Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused.
        String scope = "files:read"; // String | The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these.
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
| **302** | Redirect to the login page, to the consent page, or back to the client's redirect URI with an authorization code |  -  |
| **200** | Returned instead of the redirect when the request carries the X-Disable-Redirect header: the target URL is sent in the X-Redirect-URI response header and the body is empty |  -  |
| **400** | Invalid request parameters |  -  |


## exchangeToken

> ExchangeToken200Response exchangeToken(grantType, code, redirectUri, clientId, clientSecret)

Exchange the authorization codeExchanges an authorization code for an access token. The request is form-encoded and has to carry the grant type, the code, the same redirect URI that was used to obtain the code, and the client credentials: the client authenticates itself here rather than through the portal signature cookie the authorization endpoint uses. The response carries the access token, its type and its lifetime in seconds, plus a refresh token when the client is configured for the refresh token grant. Client authentication that fails is answered with 401, while a malformed, unknown or expired code is answered with 400. The code is single use, so replaying it fails.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token. | [optional] |
| **code** | **String**| The authorization code returned by the authorization endpoint. It may be redeemed once. | [optional] |
| **redirectUri** | **String**| The same redirect URI that was used to obtain the code. The exchange fails when it differs. | [optional] |
| **clientId** | **String**| The identifier of the client redeeming the code. | [optional] |
| **clientSecret** | **String**| The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead. | [optional] |

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
        String grantType = "grantType_example"; // String | Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token.
        String code = "code_example"; // String | The authorization code returned by the authorization endpoint. It may be redeemed once.
        String redirectUri = "redirectUri_example"; // String | The same redirect URI that was used to obtain the code. The exchange fails when it differs.
        String clientId = "clientId_example"; // String | The identifier of the client redeeming the code.
        String clientSecret = "clientSecret_example"; // String | The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead.
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
| **401** | Client authentication failed: the client ID is unknown or the client secret does not match |  -  |


## submitConsent

> submitConsent(clientId, state, scope)

Submit the consent decisionSubmits the user's consent decision for the scopes an authorization request asked for. It is the form post the consent page makes, so it carries the client ID, the state and the agreed scopes as multipart form data, along with the same portal signature cookie the authorization request needed. On success the browser is redirected to the client's redirect URI with an authorization code, or, when the request carries the X-Disable-Redirect header, answered 200 with that URL in the X-Redirect-URI header. The consent is stored per user and client, so a later authorization request for the same scopes no longer stops at the consent page.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The client the consent is being given to. It has to be the same client the authorization request named. | [optional] |
| **state** | **String**| The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request. | [optional] |
| **scope** | **String**| The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested. | [optional] |

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
        String clientId = "clientId_example"; // String | The client the consent is being given to. It has to be the same client the authorization request named.
        String state = "state_example"; // String | The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request.
        String scope = "scope_example"; // String | The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested.
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
| **200** | Returned instead of the redirect when the request carries the X-Disable-Redirect header: the target URL is sent in the X-Redirect-URI response header and the body is empty |  -  |
| **400** | Invalid request parameters |  -  |

