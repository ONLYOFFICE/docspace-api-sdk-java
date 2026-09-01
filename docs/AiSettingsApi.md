# docspace-api-sdk.org.openapitools.client.api.SettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiSettingsGet**](AiSettingsApi.md#aiSettingsGet) | **GET** /api/2.0/ai/config | Get AI settings |
| [**aiSettingsGetUser**](AiSettingsApi.md#aiSettingsGetUser) | **GET** /api/2.0/ai/config/user | Get user AI settings |
| [**aiSettingsGetVectorization**](AiSettingsApi.md#aiSettingsGetVectorization) | **GET** /api/2.0/ai/config/vectorization | Get vectorization settings |
| [**aiSettingsSetUser**](AiSettingsApi.md#aiSettingsSetUser) | **PUT** /api/2.0/ai/config/user | Update user AI settings |
| [**aiSettingsSetVectorization**](AiSettingsApi.md#aiSettingsSetVectorization) | **PUT** /api/2.0/ai/config/vectorization | Update vectorization settings |



## aiSettingsGet

> AiAiSettingsWrapper aiSettingsGet()

Get AI settings

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiAiSettingsWrapper**](AiAiSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            AiAiSettingsWrapper result = apiInstance.aiSettingsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#aiSettingsGet");
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


## aiSettingsGetUser

> AiAiUserSettingsWrapper aiSettingsGetUser()

Get user AI settings

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiAiUserSettingsWrapper**](AiAiUserSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            AiAiUserSettingsWrapper result = apiInstance.aiSettingsGetUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#aiSettingsGetUser");
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


## aiSettingsGetVectorization

> AiVectorizationSettingsWrapper aiSettingsGetVectorization()

Get vectorization settings

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            AiVectorizationSettingsWrapper result = apiInstance.aiSettingsGetVectorization();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#aiSettingsGetVectorization");
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


## aiSettingsSetUser

> AiAiUserSettingsWrapper aiSettingsSetUser(requestBody)

Update user AI settings

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**AiAiUserSettingsWrapper**](AiAiUserSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiAiUserSettingsWrapper result = apiInstance.aiSettingsSetUser(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#aiSettingsSetUser");
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


## aiSettingsSetVectorization

> AiVectorizationSettingsWrapper aiSettingsSetVectorization(requestBody)

Update vectorization settings

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiVectorizationSettingsWrapper result = apiInstance.aiSettingsSetVectorization(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#aiSettingsSetVectorization");
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

