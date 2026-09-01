# docspace-api-sdk.org.openapitools.client.api.PreferencesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiPreferencesClearDeepMode**](AiPreferencesApi.md#aiPreferencesClearDeepMode) | **DELETE** /api/2.0/ai/preferences/clear-deep-mode | Clear deep mode |
| [**aiPreferencesGetDeepMode**](AiPreferencesApi.md#aiPreferencesGetDeepMode) | **GET** /api/2.0/ai/preferences/get-deep-mode | Get deep mode |
| [**aiPreferencesIsDeepModeSet**](AiPreferencesApi.md#aiPreferencesIsDeepModeSet) | **GET** /api/2.0/ai/preferences/is-deep-mode-set | Is deep mode set |
| [**aiPreferencesSetDeepMode**](AiPreferencesApi.md#aiPreferencesSetDeepMode) | **PUT** /api/2.0/ai/preferences/set-deep-mode | Set deep mode |



## aiPreferencesClearDeepMode

> AiSuccessResponse aiPreferencesClearDeepMode(body)

Clear deep modeDrops the persisted deep-mode toggle of the scope, so later reads fall back to the configured default.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/).

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
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiPreferencesClearDeepMode(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#aiPreferencesClearDeepMode");
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


## aiPreferencesGetDeepMode

> Boolean aiPreferencesGetDeepMode(entityId)

Get deep modeReturns the deep-mode toggle of the scope, falling back to the configured default when nothing has been persisted.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/).

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
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String entityId = "entityId_example"; // String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
        try {
            Boolean result = apiInstance.aiPreferencesGetDeepMode(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#aiPreferencesGetDeepMode");
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


## aiPreferencesIsDeepModeSet

> Boolean aiPreferencesIsDeepModeSet(entityId)

Is deep mode setTells whether the scope has an explicitly persisted deep-mode value, whichever way that value is set.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/).

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
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String entityId = "entityId_example"; // String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
        try {
            Boolean result = apiInstance.aiPreferencesIsDeepModeSet(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#aiPreferencesIsDeepModeSet");
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


## aiPreferencesSetDeepMode

> AiSuccessResponse aiPreferencesSetDeepMode(aiPreferencesSetDeepModeRequest)

Set deep modePersists the deep-mode toggle of the scope. Idempotent - there is no need to check whether a value already exists.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiPreferencesSetDeepModeRequest** | [**AiPreferencesSetDeepModeRequest**](AiPreferencesSetDeepModeRequest.md)|  | |

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
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        AiPreferencesSetDeepModeRequest aiPreferencesSetDeepModeRequest = new AiPreferencesSetDeepModeRequest(); // AiPreferencesSetDeepModeRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiPreferencesSetDeepMode(aiPreferencesSetDeepModeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#aiPreferencesSetDeepMode");
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

