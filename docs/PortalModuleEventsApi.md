# docspace-api-sdk.org.openapitools.client.api.ModuleEventsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendModuleEvent**](PortalModuleEventsApi.md#sendModuleEvent) | **POST** /api/2.0/portal/moduleevents | Send a module event |



## sendModuleEvent

> sendModuleEvent(xModuleKey, sendModuleEventRequest)

Send a module eventDelivers one event from an integration module to the browsers of the portal named by the request host, over  the socket connection every open DocSpace page already keeps. No user session is needed: the caller  identifies itself with the module key in the `X-Module-Key` header, which the installation administrator  issues and allows for a list of portals. Set exactly one addressee - `user`, the e-mail of a portal user,  reaches only that user's open sessions without any subscription, and `room` reaches everyone in the portal  subscribed to `plugin-{module}-{room}`. Browsers receive `plugin:{module}:{event}` with `{ message }`, the  module name taken from the key, never from the body. The call only hands the event over: nothing is stored,  a user with no open session never sees it, and a repeated call delivers it again. Keep `message` a signal to  re-read, such as an unread count. The body is limited to 64 KB. A missing or unknown key fails with 401, a  portal the key is not allowed for with 403, an unknown or inactive user with 404, and invalid names or not  exactly one addressee with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-module-event/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xModuleKey** | **String**| The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity. | [optional] |
| **sendModuleEventRequest** | [**SendModuleEventRequest**](SendModuleEventRequest.md)| The event to deliver. | [optional] |

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
import org.openapitools.client.api.ModuleEventsApi;

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


        ModuleEventsApi apiInstance = new ModuleEventsApi(defaultClient);
        String xModuleKey = "mk_Q2hhdE1vZHVsZUtleTIwMjYtMTAtMjM"; // String | The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity.
        SendModuleEventRequest sendModuleEventRequest = new SendModuleEventRequest(); // SendModuleEventRequest | The event to deliver.
        try {
            apiInstance.sendModuleEvent(xModuleKey, sendModuleEventRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModuleEventsApi#sendModuleEvent");
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
| **200** | The event was handed to the socket service for delivery |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | The body is missing, the event or room name is invalid, or there is not exactly one addressee |  -  |
| **401** | The X-Module-Key header is missing or matches no configured module |  -  |
| **402** | The portal's payment has lapsed |  -  |
| **403** | The module key is not allowed for this portal |  -  |
| **404** | No active user of this portal has the given e-mail |  -  |
| **413** | The body is larger than 64 KB |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

