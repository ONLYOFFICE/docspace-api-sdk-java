# docspace-api-sdk.org.openapitools.client.api.OpenAIPassthroughApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiOpenaiChatCompletions**](AiOpenAiPassthroughApi.md#aiOpenaiChatCompletions) | **POST** /api/2.0/ai/openai/{profileId}/v1/chat/completions | OpenAI chat completions passthrough |
| [**aiOpenaiImagesGenerations**](AiOpenAiPassthroughApi.md#aiOpenaiImagesGenerations) | **POST** /api/2.0/ai/openai/{profileId}/v1/images/generations | OpenAI image generation passthrough |



## aiOpenaiChatCompletions

> Map&lt;String, Object&gt; aiOpenaiChatCompletions(profileId, aiOpenaiChatCompletionsRequest)

OpenAI chat completions passthroughOpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider as sent - the payload is owned by the plugin's SDK on one end and the provider on the other - except that a JSON body which names no `model` gets the profile's model filled in; a `model` the body carries wins. The provider's 4xx answers are relayed with their status and body, so a 429 and the provider's own error envelope surface as they stand; a 5xx from the provider or from the hop in front of it is not relayed - its detail stays in the server log and the call answers a fixed 502 envelope. A client disconnect cancels the provider call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The AI provider profile identifier. | |
| **aiOpenaiChatCompletionsRequest** | [**Map&lt;String, Object&gt;**](Object.md)| An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence. | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [bearerAuth](../README.md#bearerAuth)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenAIPassthroughApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OpenAIPassthroughApi apiInstance = new OpenAIPassthroughApi(defaultClient);
        String profileId = "00000000-0000-0000-0000-000000000000"; // String | The AI provider profile identifier.
        Map<String, Object> aiOpenaiChatCompletionsRequest = null; // Map<String, Object> | An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence.
        try {
            Map<String, Object> result = apiInstance.aiOpenaiChatCompletions(profileId, aiOpenaiChatCompletionsRequest);
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
| **200** | The provider's own response, relayed with its status and content type (a 5xx excepted). |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |
| **403** | AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API. |  -  |
| **404** | No profile with this identifier exists for the caller. |  -  |
| **413** | The request body is larger than this route accepts. |  -  |
| **429** | Relayed verbatim from the AI provider, which is rate-limiting this portal's key. |  -  |
| **500** | Unhandled failure. The reason is logged server-side and never echoed back. |  -  |
| **502** | The provider, or the hop in front of it, failed or answered a 5xx; the detail is in the server log. |  -  |


## aiOpenaiImagesGenerations

> Map&lt;String, Object&gt; aiOpenaiImagesGenerations(profileId, aiOpenaiImagesGenerationsRequest)

OpenAI image generation passthroughOpenAI-compatible image generation for the document editor's AI plugin, working as the chat-completions passthrough does: the profile named by `profileId` is resolved server-side, its credentials are attached, and the body reaches the provider as sent. The documented OpenAI fields are checked first - `prompt` has to be a non-empty string, `n` a positive integer, `model`, `size`, `quality`, `style` and `response_format` strings when present - and a body failing that answers 400 instead of whatever the provider would have made of it; fields outside that set are passed on untouched. The provider's 4xx status and body are relayed, so its 429 and its own error envelope surface as they stand; a 5xx is replaced by a fixed 502 envelope with the detail kept in the server log. A body larger than this route accepts is refused before it is forwarded. A client disconnect aborts the provider call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The AI provider profile identifier. | |
| **aiOpenaiImagesGenerationsRequest** | [**Map&lt;String, Object&gt;**](Object.md)| An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path. | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [bearerAuth](../README.md#bearerAuth)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenAIPassthroughApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OpenAIPassthroughApi apiInstance = new OpenAIPassthroughApi(defaultClient);
        String profileId = "00000000-0000-0000-0000-000000000000"; // String | The AI provider profile identifier.
        Map<String, Object> aiOpenaiImagesGenerationsRequest = null; // Map<String, Object> | An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path.
        try {
            Map<String, Object> result = apiInstance.aiOpenaiImagesGenerations(profileId, aiOpenaiImagesGenerationsRequest);
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
| **200** | The provider's own response, relayed with its status and content type (a 5xx excepted). |  -  |
| **400** | `prompt` is missing or empty, `n` is not a positive integer, or a documented string field has another type. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |
| **403** | AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API. |  -  |
| **404** | No profile with this identifier exists for the caller. |  -  |
| **413** | The request body is larger than this route accepts. |  -  |
| **429** | Relayed verbatim from the AI provider, which is rate-limiting this portal's key. |  -  |
| **500** | Unhandled failure. The reason is logged server-side and never echoed back. |  -  |
| **502** | The provider, or the hop in front of it, failed or answered a 5xx; the detail is in the server log. |  -  |

