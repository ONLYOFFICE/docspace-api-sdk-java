# docspace-api-sdk.org.openapitools.client.api.WebSearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiWebSearchClear**](AiWebSearchApi.md#aiWebSearchClear) | **DELETE** /api/2.0/ai/web-search/clear | Clear |
| [**aiWebSearchConfigure**](AiWebSearchApi.md#aiWebSearchConfigure) | **PUT** /api/2.0/ai/web-search/configure | Configure |
| [**aiWebSearchGetActiveConfig**](AiWebSearchApi.md#aiWebSearchGetActiveConfig) | **GET** /api/2.0/ai/web-search/get-active-config | Get active config |
| [**aiWebSearchIsConfigured**](AiWebSearchApi.md#aiWebSearchIsConfigured) | **GET** /api/2.0/ai/web-search/is-configured | Is configured |
| [**aiWebSearchPassthroughContents**](AiWebSearchApi.md#aiWebSearchPassthroughContents) | **POST** /api/2.0/ai/websearch/v1/contents | Web page contents proxied to the portal's active web-search provider |
| [**aiWebSearchPassthroughSearch**](AiWebSearchApi.md#aiWebSearchPassthroughSearch) | **POST** /api/2.0/ai/websearch/v1/search | Web search proxied to the portal's active web-search provider |
| [**aiWebSearchSetActiveConfig**](AiWebSearchApi.md#aiWebSearchSetActiveConfig) | **PUT** /api/2.0/ai/web-search/set-active-config | Set active config |
| [**aiWebSearchTestConnection**](AiWebSearchApi.md#aiWebSearchTestConnection) | **POST** /api/2.0/ai/web-search/test-connection | Test connection |



## aiWebSearchClear

> AiSuccessResponse aiWebSearchClear(body)

ClearRemoves the web-search configuration of the scope. Does nothing when web search was not configured there.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiWebSearchClear(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchClear");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchConfigure

> AiWebSearchMutationResult aiWebSearchConfigure(aiWebSearchConfigureRequest)

ConfigureValidates a web-search configuration against the live provider and stores it only when the provider answers, replacing the previous one in a single write.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

### Return type

[**AiWebSearchMutationResult**](AiWebSearchMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        AiWebSearchConfigureRequest aiWebSearchConfigureRequest = new AiWebSearchConfigureRequest(); // AiWebSearchConfigureRequest | 
        try {
            AiWebSearchMutationResult result = apiInstance.aiWebSearchConfigure(aiWebSearchConfigureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchConfigure");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchGetActiveConfig

> AiWebSearchConfig aiWebSearchGetActiveConfig(entityId)

Get active configReturns the web-search configuration active in the scope, or an empty result when web search is not configured.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiWebSearchConfig**](AiWebSearchConfig.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        String entityId = "entityId_example"; // String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
        try {
            AiWebSearchConfig result = apiInstance.aiWebSearchGetActiveConfig(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchGetActiveConfig");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchIsConfigured

> Boolean aiWebSearchIsConfigured(entityId)

Is configuredTells whether web search is configured in the scope.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**Boolean**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        String entityId = "entityId_example"; // String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
        try {
            Boolean result = apiInstance.aiWebSearchIsConfigured(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchIsConfigured");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchPassthroughContents

> AiSuccessResponse aiWebSearchPassthroughContents(requestBody)

Web page contents proxied to the portal's active web-search providerFetches web page contents on behalf of the document editor's AI plugin, against the portal's active web-search provider, the same way as the search passthrough.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiWebSearchPassthroughContents(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchPassthroughContents");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchPassthroughSearch

> AiSuccessResponse aiWebSearchPassthroughSearch(requestBody)

Web search proxied to the portal's active web-search providerRuns a web search on behalf of the document editor's AI plugin. The plugin only holds a placeholder configuration; the portal's active provider and its key are resolved here and never reach the browser.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiWebSearchPassthroughSearch(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchPassthroughSearch");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchSetActiveConfig

> AiSuccessResponse aiWebSearchSetActiveConfig(aiWebSearchConfigureRequest)

Set active configStores a web-search configuration without contacting the provider first, for forms that validate locally.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        AiWebSearchConfigureRequest aiWebSearchConfigureRequest = new AiWebSearchConfigureRequest(); // AiWebSearchConfigureRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiWebSearchSetActiveConfig(aiWebSearchConfigureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchSetActiveConfig");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiWebSearchTestConnection

> AiProfilesTestConnection200Response aiWebSearchTestConnection(aiWebSearchConfig)

Test connectionChecks a web-search configuration against the live provider without storing it - for a Test button that must not commit on success.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiWebSearchConfig** | [**AiWebSearchConfig**](AiWebSearchConfig.md)|  | |

### Return type

[**AiProfilesTestConnection200Response**](AiProfilesTestConnection200Response.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        WebSearchApi apiInstance = new WebSearchApi(defaultClient);
        AiWebSearchConfig aiWebSearchConfig = new AiWebSearchConfig(); // AiWebSearchConfig | 
        try {
            AiProfilesTestConnection200Response result = apiInstance.aiWebSearchTestConnection(aiWebSearchConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebSearchApi#aiWebSearchTestConnection");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |

