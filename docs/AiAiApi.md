# docspace-api-sdk.org.openapitools.client.api.AIApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiAiApproveToolCall**](AiAiApi.md#aiAiApproveToolCall) | **POST** /api/2.0/ai/ai/approve-tool-call | Approve tool call |
| [**aiAiDenyToolCall**](AiAiApi.md#aiAiDenyToolCall) | **POST** /api/2.0/ai/ai/deny-tool-call | Deny tool call |
| [**aiAiRegenerateStream**](AiAiApi.md#aiAiRegenerateStream) | **POST** /api/2.0/ai/ai/regenerate-stream | Regenerate stream |
| [**aiAiSend**](AiAiApi.md#aiAiSend) | **POST** /api/2.0/ai/ai/send | Send |
| [**aiAiSendCustom**](AiAiApi.md#aiAiSendCustom) | **POST** /api/2.0/ai/ai/send-custom | Send custom |
| [**aiAiSendWithStream**](AiAiApi.md#aiAiSendWithStream) | **POST** /api/2.0/ai/ai/send-with-stream | Send with stream |
| [**aiAiSendWithStreamOpenAI**](AiAiApi.md#aiAiSendWithStreamOpenAI) | **POST** /api/2.0/ai/ai/send-with-stream-openai | Send with stream open ai |



## aiAiApproveToolCall

> AiChatEvent aiAiApproveToolCall(aiAiApproveToolCallRequest)

Approve tool call

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiApproveToolCallRequest** | [**AiAiApproveToolCallRequest**](AiAiApproveToolCallRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiApproveToolCallRequest aiAiApproveToolCallRequest = new AiAiApproveToolCallRequest(); // AiAiApproveToolCallRequest | 
        try {
            AiChatEvent result = apiInstance.aiAiApproveToolCall(aiAiApproveToolCallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiApproveToolCall");
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
- **Accept**: application/x-ndjson, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Newline-delimited stream of chat events — one JSON `ChatEvent` object per line. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiAiDenyToolCall

> AiChatEvent aiAiDenyToolCall(aiAiToolCallData)

Deny tool call

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiToolCallData** | [**AiAiToolCallData**](AiAiToolCallData.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiToolCallData aiAiToolCallData = new AiAiToolCallData(); // AiAiToolCallData | 
        try {
            AiChatEvent result = apiInstance.aiAiDenyToolCall(aiAiToolCallData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiDenyToolCall");
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
- **Accept**: application/x-ndjson, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Newline-delimited stream of chat events — one JSON `ChatEvent` object per line. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiAiRegenerateStream

> AiChatEvent aiAiRegenerateStream(aiAiRegenerateStreamRequest)

Regenerate stream

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiRegenerateStreamRequest** | [**AiAiRegenerateStreamRequest**](AiAiRegenerateStreamRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiRegenerateStreamRequest aiAiRegenerateStreamRequest = new AiAiRegenerateStreamRequest(); // AiAiRegenerateStreamRequest | 
        try {
            AiChatEvent result = apiInstance.aiAiRegenerateStream(aiAiRegenerateStreamRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiRegenerateStream");
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
- **Accept**: application/x-ndjson, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Newline-delimited stream of chat events — one JSON `ChatEvent` object per line. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiAiSend

> AiThreadMessageLike aiAiSend(aiAiSendRequest)

Send

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiSendRequest** | [**AiAiSendRequest**](AiAiSendRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiSendRequest aiAiSendRequest = new AiAiSendRequest(); // AiAiSendRequest | 
        try {
            AiThreadMessageLike result = apiInstance.aiAiSend(aiAiSendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiSend");
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


## aiAiSendCustom

> AiThreadMessageLike aiAiSendCustom(aiAiSendCustomRequest)

Send custom

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiSendCustomRequest** | [**AiAiSendCustomRequest**](AiAiSendCustomRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiSendCustomRequest aiAiSendCustomRequest = new AiAiSendCustomRequest(); // AiAiSendCustomRequest | 
        try {
            AiThreadMessageLike result = apiInstance.aiAiSendCustom(aiAiSendCustomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiSendCustom");
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


## aiAiSendWithStream

> AiChatEvent aiAiSendWithStream(aiAiSendStreamBody)

Send with stream

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiSendStreamBody aiAiSendStreamBody = new AiAiSendStreamBody(); // AiAiSendStreamBody | 
        try {
            AiChatEvent result = apiInstance.aiAiSendWithStream(aiAiSendStreamBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiSendWithStream");
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
- **Accept**: application/x-ndjson, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Newline-delimited stream of chat events — one JSON `ChatEvent` object per line. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiAiSendWithStreamOpenAI

> AiOpenAIStreamChunk aiAiSendWithStreamOpenAI(aiAiSendStreamBody)

Send with stream open ai

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiOpenAIStreamChunk**](AiOpenAIStreamChunk.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AIApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AIApi apiInstance = new AIApi(defaultClient);
        AiAiSendStreamBody aiAiSendStreamBody = new AiAiSendStreamBody(); // AiAiSendStreamBody | 
        try {
            AiOpenAIStreamChunk result = apiInstance.aiAiSendWithStreamOpenAI(aiAiSendStreamBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AIApi#aiAiSendWithStreamOpenAI");
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
- **Accept**: text/event-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server-sent events stream of OpenAI `chat.completion.chunk` objects, terminated by a `[DONE]` sentinel. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |

