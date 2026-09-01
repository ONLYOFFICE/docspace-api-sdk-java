# docspace-api-sdk.org.openapitools.client.api.EditorToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiEditorToolsCall**](AiEditorToolsApi.md#aiEditorToolsCall) | **POST** /api/2.0/ai/editor-tools/call | Execute a DocSpace tool on behalf of the editor AI plugin |
| [**aiEditorToolsList**](AiEditorToolsApi.md#aiEditorToolsList) | **GET** /api/2.0/ai/editor-tools/list | Sanitized DocSpace tool catalog for the editor AI plugin |



## aiEditorToolsCall

> AiSuccessResponse aiEditorToolsCall(requestBody)

Execute a DocSpace tool on behalf of the editor AI plugin

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-call/).

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
import org.openapitools.client.api.EditorToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        EditorToolsApi apiInstance = new EditorToolsApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiEditorToolsCall(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditorToolsApi#aiEditorToolsCall");
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


## aiEditorToolsList

> AiSuccessResponse aiEditorToolsList()

Sanitized DocSpace tool catalog for the editor AI plugin

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-list/).

### Parameters

This endpoint does not need any parameter.

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
import org.openapitools.client.api.EditorToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        EditorToolsApi apiInstance = new EditorToolsApi(defaultClient);
        try {
            AiSuccessResponse result = apiInstance.aiEditorToolsList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditorToolsApi#aiEditorToolsList");
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

