# docspace-api-sdk.org.openapitools.client.api.WebhooksApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](SettingsWebhooksApi.md#createWebhook) | **POST** /api/2.0/settings/webhook | Create a webhook |
| [**enableWebhook**](SettingsWebhooksApi.md#enableWebhook) | **PUT** /api/2.0/settings/webhook/enable | Enable a webhook |
| [**getTenantWebhooks**](SettingsWebhooksApi.md#getTenantWebhooks) | **GET** /api/2.0/settings/webhook | Get webhooks |
| [**getWebhookTriggers**](SettingsWebhooksApi.md#getWebhookTriggers) | **GET** /api/2.0/settings/webhook/triggers | Get webhook triggers |
| [**getWebhooksLogs**](SettingsWebhooksApi.md#getWebhooksLogs) | **GET** /api/2.0/settings/webhooks/log | Get webhook logs |
| [**removeWebhook**](SettingsWebhooksApi.md#removeWebhook) | **DELETE** /api/2.0/settings/webhook/{id} | Remove a webhook |
| [**retryWebhook**](SettingsWebhooksApi.md#retryWebhook) | **PUT** /api/2.0/settings/webhook/{id}/retry | Retry a webhook |
| [**retryWebhooks**](SettingsWebhooksApi.md#retryWebhooks) | **PUT** /api/2.0/settings/webhook/retry | Retry webhooks |
| [**updateWebhook**](SettingsWebhooksApi.md#updateWebhook) | **PUT** /api/2.0/settings/webhook | Update a webhook |



## createWebhook

> WebhooksConfigWrapper createWebhook(createWebhooksConfigRequestsDto)

Create a webhookCreates a new tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-webhook/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createWebhooksConfigRequestsDto** | [**CreateWebhooksConfigRequestsDto**](CreateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateWebhooksConfigRequestsDto createWebhooksConfigRequestsDto = new CreateWebhooksConfigRequestsDto(); // CreateWebhooksConfigRequestsDto | 
        try {
            WebhooksConfigWrapper result = apiInstance.createWebhook(createWebhooksConfigRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **200** | Tenant webhook with its config parameters |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid or empty parameters |  -  |
| **403** | Access denied |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## enableWebhook

> WebhooksConfigWrapper enableWebhook(updateWebhooksConfigRequestsDto)

Enable a webhookEnables or disables a tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-webhook/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateWebhooksConfigRequestsDto** | [**UpdateWebhooksConfigRequestsDto**](UpdateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto = new UpdateWebhooksConfigRequestsDto(); // UpdateWebhooksConfigRequestsDto | 
        try {
            WebhooksConfigWrapper result = apiInstance.enableWebhook(updateWebhooksConfigRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#enableWebhook");
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
| **200** | Enable or disable tenant webhook |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid or empty parameters |  -  |
| **403** | Access denied |  -  |
| **404** | Item not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getTenantWebhooks

> WebhooksConfigWithStatusArrayWrapper getTenantWebhooks()

Get webhooksReturns a list of the tenant webhooks.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-webhooks/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**WebhooksConfigWithStatusArrayWrapper**](WebhooksConfigWithStatusArrayWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            WebhooksConfigWithStatusArrayWrapper result = apiInstance.getTenantWebhooks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getTenantWebhooks");
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
| **200** | List of tenant webhooks with their config parameters |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | Access denied |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getWebhookTriggers

> GetWebhookTriggers200Response getWebhookTriggers()

Get webhook triggersReturns a list of triggers for a webhook.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetWebhookTriggers200Response**](GetWebhookTriggers200Response.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            GetWebhookTriggers200Response result = apiInstance.getWebhookTriggers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhookTriggers");
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
| **200** | List of triggers for a webhook |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getWebhooksLogs

> WebhooksLogArrayWrapper getWebhooksLogs(deliveryFrom, deliveryTo, hookUri, configId, eventId, groupStatus, userId, trigger, count, startIndex)

Get webhook logsReturns the logs of the webhook activities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryFrom** | **OffsetDateTime**| The delivery start time for filtering webhook logs. | [optional] |
| **deliveryTo** | **OffsetDateTime**| The delivery end time for filtering webhook logs. | [optional] |
| **hookUri** | **String**| The destination URL where webhooks are delivered. | [optional] |
| **configId** | **Integer**| The webhook configuration identifier. | [optional] |
| **eventId** | **Integer**| The unique identifier of the event that triggered the webhook. | [optional] |
| **groupStatus** | [**WebhookGroupStatus**](.md)| The status of the webhook delivery group. | [optional] [enum: 0, 1, 2, 4, 8, 16] |
| **userId** | **UUID**| The identifier of the user associated with the webhook event. | [optional] |
| **trigger** | [**WebhookTrigger**](.md)| The type of event that triggered the webhook. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824] |
| **count** | **Integer**| The maximum number of webhook log records to return in the query response. | [optional] |
| **startIndex** | **Integer**| Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries. | [optional] |

### Return type

[**WebhooksLogArrayWrapper**](WebhooksLogArrayWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        OffsetDateTime deliveryFrom = OffsetDateTime.parse("2024-01-15T10:30Z"); // OffsetDateTime | The delivery start time for filtering webhook logs.
        OffsetDateTime deliveryTo = OffsetDateTime.parse("2024-01-15T10:30Z"); // OffsetDateTime | The delivery end time for filtering webhook logs.
        String hookUri = "https://example.com/webhook"; // String | The destination URL where webhooks are delivered.
        Integer configId = 1; // Integer | The webhook configuration identifier.
        Integer eventId = 1; // Integer | The unique identifier of the event that triggered the webhook.
        WebhookGroupStatus groupStatus = WebhookGroupStatus.fromValue("0"); // WebhookGroupStatus | The status of the webhook delivery group.
        UUID userId = UUID.randomUUID(); // UUID | The identifier of the user associated with the webhook event.
        WebhookTrigger trigger = WebhookTrigger.fromValue("0"); // WebhookTrigger | The type of event that triggered the webhook.
        Integer count = 1; // Integer | The maximum number of webhook log records to return in the query response.
        Integer startIndex = 1; // Integer | Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries.
        try {
            WebhooksLogArrayWrapper result = apiInstance.getWebhooksLogs(deliveryFrom, deliveryTo, hookUri, configId, eventId, groupStatus, userId, trigger, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhooksLogs");
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
| **200** | Logs of the webhook activities |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | Access denied |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## removeWebhook

> WebhooksConfigWrapper removeWebhook(id)

Remove a webhookRemoves a tenant webhook with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID extracted from the route parameters. | |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        Integer id = 1; // Integer | The ID extracted from the route parameters.
        try {
            WebhooksConfigWrapper result = apiInstance.removeWebhook(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#removeWebhook");
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
| **200** | Tenant webhook with its config parameters |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | Access denied |  -  |
| **404** | Item not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## retryWebhook

> WebhooksLogWrapper retryWebhook(id)

Retry a webhookRetries a webhook with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID extracted from the route parameters. | |

### Return type

[**WebhooksLogWrapper**](WebhooksLogWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        Integer id = 1; // Integer | The ID extracted from the route parameters.
        try {
            WebhooksLogWrapper result = apiInstance.retryWebhook(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#retryWebhook");
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
| **200** | Logs of the webhook activities |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Id incorrect |  -  |
| **403** | Access denied |  -  |
| **404** | Item not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## retryWebhooks

> WebhooksLogArrayWrapper retryWebhooks(webhookRetryRequestsDto)

Retry webhooksRetries all the webhooks with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhooks/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookRetryRequestsDto** | [**WebhookRetryRequestsDto**](WebhookRetryRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksLogArrayWrapper**](WebhooksLogArrayWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        WebhookRetryRequestsDto webhookRetryRequestsDto = new WebhookRetryRequestsDto(); // WebhookRetryRequestsDto | 
        try {
            WebhooksLogArrayWrapper result = apiInstance.retryWebhooks(webhookRetryRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#retryWebhooks");
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
| **200** | Logs of the webhook activities |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | Access denied |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## updateWebhook

> WebhooksConfigWrapper updateWebhook(updateWebhooksConfigRequestsDto)

Update a webhookUpdates a tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-webhook/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateWebhooksConfigRequestsDto** | [**UpdateWebhooksConfigRequestsDto**](UpdateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
import org.openapitools.client.api.WebhooksApi;

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


        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto = new UpdateWebhooksConfigRequestsDto(); // UpdateWebhooksConfigRequestsDto | 
        try {
            WebhooksConfigWrapper result = apiInstance.updateWebhook(updateWebhooksConfigRequestsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **200** | Updated tenant webhook with its config parameters |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid or empty parameters |  -  |
| **403** | Access denied |  -  |
| **404** | Item not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

