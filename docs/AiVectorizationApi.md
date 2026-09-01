# docspace-api-sdk.org.openapitools.client.api.VectorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiVectorizationStartTask**](AiVectorizationApi.md#aiVectorizationStartTask) | **POST** /api/2.0/ai/vectorization/tasks | Start a vectorization task |



## aiVectorizationStartTask

> AiSuccessResponse aiVectorizationStartTask(requestBody)

Start a vectorization taskStarts a vectorization task over the supplied portal files. The indexing itself runs asynchronously on the .NET side.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-vectorization-start-task/).

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
import org.openapitools.client.api.VectorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        VectorizationApi apiInstance = new VectorizationApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiVectorizationStartTask(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorizationApi#aiVectorizationStartTask");
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

