# docspace-api-sdk.org.openapitools.client.api.ThreadsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiThreadsAppendUserMessage**](AiThreadsApi.md#aiThreadsAppendUserMessage) | **POST** /api/2.0/ai/threads/append-user-message | Append user message |
| [**aiThreadsClearMessages**](AiThreadsApi.md#aiThreadsClearMessages) | **DELETE** /api/2.0/ai/threads/clear-messages | Clear messages |
| [**aiThreadsCreate**](AiThreadsApi.md#aiThreadsCreate) | **POST** /api/2.0/ai/threads/create | Create |
| [**aiThreadsDelete**](AiThreadsApi.md#aiThreadsDelete) | **DELETE** /api/2.0/ai/threads/delete | Delete |
| [**aiThreadsDeleteMessage**](AiThreadsApi.md#aiThreadsDeleteMessage) | **DELETE** /api/2.0/ai/threads/delete-message | Delete message |
| [**aiThreadsGetById**](AiThreadsApi.md#aiThreadsGetById) | **GET** /api/2.0/ai/threads/get-by-id | Get by id |
| [**aiThreadsGetMessageById**](AiThreadsApi.md#aiThreadsGetMessageById) | **GET** /api/2.0/ai/threads/get-message-by-id | Get message by id |
| [**aiThreadsList**](AiThreadsApi.md#aiThreadsList) | **GET** /api/2.0/ai/threads/list | List |
| [**aiThreadsOpenOrCreate**](AiThreadsApi.md#aiThreadsOpenOrCreate) | **POST** /api/2.0/ai/threads/open-or-create | Open or create |
| [**aiThreadsReadMessages**](AiThreadsApi.md#aiThreadsReadMessages) | **GET** /api/2.0/ai/threads/read-messages | Read messages |
| [**aiThreadsRegenerateTitle**](AiThreadsApi.md#aiThreadsRegenerateTitle) | **POST** /api/2.0/ai/threads/regenerate-title | Regenerate title |
| [**aiThreadsRename**](AiThreadsApi.md#aiThreadsRename) | **PUT** /api/2.0/ai/threads/rename | Rename |
| [**aiThreadsTouch**](AiThreadsApi.md#aiThreadsTouch) | **POST** /api/2.0/ai/threads/touch | Touch |
| [**aiThreadsUpdateMessage**](AiThreadsApi.md#aiThreadsUpdateMessage) | **PUT** /api/2.0/ai/threads/update-message | Update message |



## aiThreadsAppendUserMessage

> AiThreadMessageLike aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest)

Append user messagePersists a user message in a thread and bumps the thread's last-edit date so it resurfaces in the sidebar. Optionally rebinds the thread to another profile when the model changed mid-conversation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsAppendUserMessageRequest** | [**AiThreadsAppendUserMessageRequest**](AiThreadsAppendUserMessageRequest.md)|  | |

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest = new AiThreadsAppendUserMessageRequest(); // AiThreadsAppendUserMessageRequest | 
        try {
            AiThreadMessageLike result = apiInstance.aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsAppendUserMessage");
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


## aiThreadsClearMessages

> AiSuccessResponse aiThreadsClearMessages(body)

Clear messagesDrops every message of a thread while keeping the thread itself, and bumps its last-edit date.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/).

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsClearMessages(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsClearMessages");
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


## aiThreadsCreate

> AiThread aiThreadsCreate(aiThreadsCreateRequest)

CreateCreates a chat thread with a caller-supplied title. Use `open-or-create` instead when the title should be generated from the first user message.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsCreateRequest** | [**AiThreadsCreateRequest**](AiThreadsCreateRequest.md)|  | |

### Return type

[**AiThread**](AiThread.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsCreateRequest aiThreadsCreateRequest = new AiThreadsCreateRequest(); // AiThreadsCreateRequest | 
        try {
            AiThread result = apiInstance.aiThreadsCreate(aiThreadsCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsCreate");
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


## aiThreadsDelete

> AiSuccessResponse aiThreadsDelete(body)

DeleteDeletes a chat thread together with its messages.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/).

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsDelete");
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


## aiThreadsDeleteMessage

> AiSuccessResponse aiThreadsDeleteMessage(body)

Delete messageDeletes one chat message, leaving the rest of the thread untouched.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/).

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsDeleteMessage(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsDeleteMessage");
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


## aiThreadsGetById

> AiThread aiThreadsGetById(threadId)

Get by idReturns one chat thread, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **String**| The chat thread identifier. | |

### Return type

[**AiThread**](AiThread.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | The chat thread identifier.
        try {
            AiThread result = apiInstance.aiThreadsGetById(threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsGetById");
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


## aiThreadsGetMessageById

> AiThreadMessageLike aiThreadsGetMessageById(messageId)

Get message by idReturns one chat message by its globally unique identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageId** | **String**| The globally unique chat message identifier. | |

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String messageId = "messageId_example"; // String | The globally unique chat message identifier.
        try {
            AiThreadMessageLike result = apiInstance.aiThreadsGetMessageById(messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsGetMessageById");
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


## aiThreadsList

> List&lt;AiThread&gt; aiThreadsList(entityId, count, cursor, query)

ListLists the chat threads of the scope, most recently edited first. Supports cursor pagination and a server-side case-insensitive title search.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |
| **count** | **String**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **query** | **String**| The full-text query the thread list is filtered by. | [optional] |

### Return type

[**List&lt;AiThread&gt;**](AiThread.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String entityId = "entityId_example"; // String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
        String count = "count_example"; // String | The maximum number of items to return in one page.
        String cursor = "cursor_example"; // String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
        String query = "query_example"; // String | The full-text query the thread list is filtered by.
        try {
            List<AiThread> result = apiInstance.aiThreadsList(entityId, count, cursor, query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsList");
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


## aiThreadsOpenOrCreate

> AiOpenOrCreateResult aiThreadsOpenOrCreate(aiThreadsOpenOrCreateRequest)

Open or createOpens a chat thread and returns its history, or creates one with a title generated from the supplied first message. That first message is not persisted - the caller decides whether to follow up with `append-user-message`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsOpenOrCreateRequest** | [**AiThreadsOpenOrCreateRequest**](AiThreadsOpenOrCreateRequest.md)|  | |

### Return type

[**AiOpenOrCreateResult**](AiOpenOrCreateResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsOpenOrCreateRequest aiThreadsOpenOrCreateRequest = new AiThreadsOpenOrCreateRequest(); // AiThreadsOpenOrCreateRequest | 
        try {
            AiOpenOrCreateResult result = apiInstance.aiThreadsOpenOrCreate(aiThreadsOpenOrCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsOpenOrCreate");
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


## aiThreadsReadMessages

> List&lt;AiThreadMessageLike&gt; aiThreadsReadMessages(threadId, count, cursor, direction)

Read messagesReads the messages of a thread, with the same cursor pagination as the thread list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **String**| The chat thread identifier. | |
| **count** | **String**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **direction** | **String**| The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. | [optional] |

### Return type

[**List&lt;AiThreadMessageLike&gt;**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | The chat thread identifier.
        String count = "count_example"; // String | The maximum number of items to return in one page.
        String cursor = "cursor_example"; // String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
        String direction = "direction_example"; // String | The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read.
        try {
            List<AiThreadMessageLike> result = apiInstance.aiThreadsReadMessages(threadId, count, cursor, direction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsReadMessages");
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


## aiThreadsRegenerateTitle

> String aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest)

Regenerate titleGenerates a fresh title from the thread's first user message and persists it. Fails when the thread has no user message yet.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsRegenerateTitleRequest** | [**AiThreadsRegenerateTitleRequest**](AiThreadsRegenerateTitleRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest = new AiThreadsRegenerateTitleRequest(); // AiThreadsRegenerateTitleRequest | 
        try {
            String result = apiInstance.aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsRegenerateTitle");
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


## aiThreadsRename

> AiSuccessResponse aiThreadsRename(aiThreadsRenameRequest)

RenameRenames a chat thread and bumps its last-edit date so the new title shows up in the sidebar.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsRenameRequest** | [**AiThreadsRenameRequest**](AiThreadsRenameRequest.md)|  | |

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsRenameRequest aiThreadsRenameRequest = new AiThreadsRenameRequest(); // AiThreadsRenameRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsRename(aiThreadsRenameRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsRename");
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


## aiThreadsTouch

> AiSuccessResponse aiThreadsTouch(aiThreadsTouchRequest)

TouchBumps a thread's last-edit date, and optionally rebinds it to another profile, when something other than a new message - a model switch, say - should resurface it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsTouchRequest** | [**AiThreadsTouchRequest**](AiThreadsTouchRequest.md)|  | |

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsTouchRequest aiThreadsTouchRequest = new AiThreadsTouchRequest(); // AiThreadsTouchRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsTouch(aiThreadsTouchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsTouch");
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


## aiThreadsUpdateMessage

> AiSuccessResponse aiThreadsUpdateMessage(aiThreadsUpdateMessageRequest)

Update messageReplaces the content of a chat message - used by the edit and regenerate flows that change a message outside the streaming lifecycle.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiThreadsUpdateMessageRequest** | [**AiThreadsUpdateMessageRequest**](AiThreadsUpdateMessageRequest.md)|  | |

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
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        AiThreadsUpdateMessageRequest aiThreadsUpdateMessageRequest = new AiThreadsUpdateMessageRequest(); // AiThreadsUpdateMessageRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiThreadsUpdateMessage(aiThreadsUpdateMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#aiThreadsUpdateMessage");
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

