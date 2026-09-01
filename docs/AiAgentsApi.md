# docspace-api-sdk.org.openapitools.client.api.AgentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiAgentsCreate**](AiAgentsApi.md#aiAgentsCreate) | **POST** /api/2.0/ai/agents | Create an agent |
| [**aiAgentsDelete**](AiAgentsApi.md#aiAgentsDelete) | **DELETE** /api/2.0/ai/agents/{id} | Delete an agent |
| [**aiAgentsGet**](AiAgentsApi.md#aiAgentsGet) | **GET** /api/2.0/ai/agents/{id} | Get an agent |
| [**aiAgentsList**](AiAgentsApi.md#aiAgentsList) | **GET** /api/2.0/ai/agents | List agents |
| [**aiAgentsNews**](AiAgentsApi.md#aiAgentsNews) | **GET** /api/2.0/ai/agents/news | List agent news items |
| [**aiAgentsResetQuota**](AiAgentsApi.md#aiAgentsResetQuota) | **PUT** /api/2.0/ai/agents/resetquota | Reset agents' quota |
| [**aiAgentsUpdate**](AiAgentsApi.md#aiAgentsUpdate) | **PUT** /api/2.0/ai/agents/{id} | Update an agent |
| [**aiAgentsUpdateQuota**](AiAgentsApi.md#aiAgentsUpdateQuota) | **PUT** /api/2.0/ai/agents/agentquota | Update agents' quota |



## aiAgentsCreate

> AiFolderIntegerWrapper aiAgentsCreate(aiAgentsCreateRequest)

Create an agentCreates an AI agent room in the .NET AI service and binds the supplied `profileId` to it as a `Chat` assignment. The instruction is stored on the room as a prompt-only chat setting; a failed binding is reported as an error even though the room already exists.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAgentsCreateRequest** | [**AiAgentsCreateRequest**](AiAgentsCreateRequest.md)|  | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        AiAgentsCreateRequest aiAgentsCreateRequest = new AiAgentsCreateRequest(); // AiAgentsCreateRequest | 
        try {
            AiFolderIntegerWrapper result = apiInstance.aiAgentsCreate(aiAgentsCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsCreate");
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


## aiAgentsDelete

> AiFileOperationWrapper aiAgentsDelete(id, aiAgentsDeleteRequest)

Delete an agentDeletes an AI agent room.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The agent identifier. | |
| **aiAgentsDeleteRequest** | [**AiAgentsDeleteRequest**](AiAgentsDeleteRequest.md)|  | |

### Return type

[**AiFileOperationWrapper**](AiFileOperationWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        String id = "id_example"; // String | The agent identifier.
        AiAgentsDeleteRequest aiAgentsDeleteRequest = new AiAgentsDeleteRequest(); // AiAgentsDeleteRequest | 
        try {
            AiFileOperationWrapper result = apiInstance.aiAgentsDelete(id, aiAgentsDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsDelete");
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


## aiAgentsGet

> AiFolderIntegerWrapper aiAgentsGet(id)

Get an agentReturns one AI agent room, enriched with the `profileId` bound to it so an edit form can prefill the profile selector. A missing assignment simply leaves `profileId` out.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The agent identifier. | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        String id = "id_example"; // String | The agent identifier.
        try {
            AiFolderIntegerWrapper result = apiInstance.aiAgentsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsGet");
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


## aiAgentsList

> AiFolderContentIntegerWrapper aiAgentsList()

List agentsLists the portal's AI agent rooms. Query parameters are forwarded unchanged to the .NET AI service, which answers with its folder-content payload.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiFolderContentIntegerWrapper**](AiFolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        try {
            AiFolderContentIntegerWrapper result = apiInstance.aiAgentsList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsList");
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


## aiAgentsNews

> AiNewItemsAgentNewItemsArrayWrapper aiAgentsNews()

List agent news itemsLists the new items across the caller's AI agent rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiNewItemsAgentNewItemsArrayWrapper**](AiNewItemsAgentNewItemsArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        try {
            AiNewItemsAgentNewItemsArrayWrapper result = apiInstance.aiAgentsNews();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsNews");
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


## aiAgentsResetQuota

> AiFolderIntegerArrayWrapper aiAgentsResetQuota(aiAgentsResetQuotaRequest)

Reset agents' quotaResets the storage quota of the given AI agent rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAgentsResetQuotaRequest** | [**AiAgentsResetQuotaRequest**](AiAgentsResetQuotaRequest.md)|  | |

### Return type

[**AiFolderIntegerArrayWrapper**](AiFolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest = new AiAgentsResetQuotaRequest(); // AiAgentsResetQuotaRequest | 
        try {
            AiFolderIntegerArrayWrapper result = apiInstance.aiAgentsResetQuota(aiAgentsResetQuotaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsResetQuota");
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


## aiAgentsUpdate

> AiFolderIntegerWrapper aiAgentsUpdate(id, aiAgentsUpdateRequest)

Update an agentUpdates an AI agent room - title, tags, instruction. `profileId` is not part of the room contract: it is stripped from the forwarded body and re-bound as the agent's assignment afterwards.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The agent identifier. | |
| **aiAgentsUpdateRequest** | [**AiAgentsUpdateRequest**](AiAgentsUpdateRequest.md)|  | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        String id = "id_example"; // String | The agent identifier.
        AiAgentsUpdateRequest aiAgentsUpdateRequest = new AiAgentsUpdateRequest(); // AiAgentsUpdateRequest | 
        try {
            AiFolderIntegerWrapper result = apiInstance.aiAgentsUpdate(id, aiAgentsUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsUpdate");
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


## aiAgentsUpdateQuota

> AiFolderIntegerArrayWrapper aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest)

Update agents' quotaChanges the storage quota of the given AI agent rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAgentsUpdateQuotaRequest** | [**AiAgentsUpdateQuotaRequest**](AiAgentsUpdateQuotaRequest.md)|  | |

### Return type

[**AiFolderIntegerArrayWrapper**](AiFolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest = new AiAgentsUpdateQuotaRequest(); // AiAgentsUpdateQuotaRequest | 
        try {
            AiFolderIntegerArrayWrapper result = apiInstance.aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#aiAgentsUpdateQuota");
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

