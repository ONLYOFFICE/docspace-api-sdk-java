# docspace-api-sdk.org.openapitools.client.api.OpenAIPassthroughApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiOpenaiChatCompletions**](AiOpenAiPassthroughApi.md#aiOpenaiChatCompletions) | **POST** /api/2.0/ai/openai/{profileId}/v1/chat/completions | OpenAI-compatible chat completions proxied to the profile's provider |
| [**aiOpenaiImagesGenerations**](AiOpenAiPassthroughApi.md#aiOpenaiImagesGenerations) | **POST** /api/2.0/ai/openai/{profileId}/v1/images/generations | OpenAI-compatible image generation proxied to the profile's provider |



## aiOpenaiChatCompletions

> AiSuccessResponse aiOpenaiChatCompletions(profileId, requestBody)

OpenAI-compatible chat completions proxied to the profile's provider

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**|  | |
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
import org.openapitools.client.api.OpenAIPassthroughApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OpenAIPassthroughApi apiInstance = new OpenAIPassthroughApi(defaultClient);
        String profileId = "profileId_example"; // String | 
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiOpenaiChatCompletions(profileId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenAIPassthroughApi#aiOpenaiChatCompletions");
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


## aiOpenaiImagesGenerations

> AiSuccessResponse aiOpenaiImagesGenerations(profileId, requestBody)

OpenAI-compatible image generation proxied to the profile's provider

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**|  | |
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
import org.openapitools.client.api.OpenAIPassthroughApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OpenAIPassthroughApi apiInstance = new OpenAIPassthroughApi(defaultClient);
        String profileId = "profileId_example"; // String | 
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            AiSuccessResponse result = apiInstance.aiOpenaiImagesGenerations(profileId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenAIPassthroughApi#aiOpenaiImagesGenerations");
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

