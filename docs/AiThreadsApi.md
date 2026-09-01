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

Append user message

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

Clear messages

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

Create

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

Delete

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

Delete message

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

Get by id

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **String**|  | |

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
        String threadId = "threadId_example"; // String | 
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

Get message by id

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageId** | **String**|  | |

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
        String messageId = "messageId_example"; // String | 
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

List

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |
| **count** | **String**|  | |
| **cursor** | **String**|  | |
| **query** | **String**|  | |

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
        String entityId = "entityId_example"; // String | 
        String count = "count_example"; // String | 
        String cursor = "cursor_example"; // String | 
        String query = "query_example"; // String | 
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

Open or create

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

Read messages

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **String**|  | |
| **count** | **String**|  | |
| **cursor** | **String**|  | |
| **direction** | **String**|  | |

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
        String threadId = "threadId_example"; // String | 
        String count = "count_example"; // String | 
        String cursor = "cursor_example"; // String | 
        String direction = "direction_example"; // String | 
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

Regenerate title

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

Rename

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

Touch

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

Update message

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

