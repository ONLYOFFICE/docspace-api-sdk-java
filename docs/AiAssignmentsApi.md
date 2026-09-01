# docspace-api-sdk.org.openapitools.client.api.AssignmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiAssignmentsAssign**](AiAssignmentsApi.md#aiAssignmentsAssign) | **PUT** /api/2.0/ai/assignments/assign | Assign |
| [**aiAssignmentsBulkAssign**](AiAssignmentsApi.md#aiAssignmentsBulkAssign) | **PUT** /api/2.0/ai/assignments/bulk-assign | Bulk assign |
| [**aiAssignmentsCascadeProfileDelete**](AiAssignmentsApi.md#aiAssignmentsCascadeProfileDelete) | **DELETE** /api/2.0/ai/assignments/cascade-profile-delete | Cascade profile delete |
| [**aiAssignmentsGetAllAssignments**](AiAssignmentsApi.md#aiAssignmentsGetAllAssignments) | **GET** /api/2.0/ai/assignments/get-all-assignments | Get all assignments |
| [**aiAssignmentsGetAssignment**](AiAssignmentsApi.md#aiAssignmentsGetAssignment) | **GET** /api/2.0/ai/assignments/get-assignment | Get assignment |
| [**aiAssignmentsResolveForAction**](AiAssignmentsApi.md#aiAssignmentsResolveForAction) | **GET** /api/2.0/ai/assignments/resolve-for-action | Resolve for action |
| [**aiAssignmentsTryResolveForAction**](AiAssignmentsApi.md#aiAssignmentsTryResolveForAction) | **GET** /api/2.0/ai/assignments/try-resolve-for-action | Try resolve for action |
| [**aiAssignmentsUnassign**](AiAssignmentsApi.md#aiAssignmentsUnassign) | **DELETE** /api/2.0/ai/assignments/unassign | Unassign |



## aiAssignmentsAssign

> AiAssignmentMutationResult aiAssignmentsAssign(aiAssignmentsAssignRequest)

Assign

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAssignmentsAssignRequest** | [**AiAssignmentsAssignRequest**](AiAssignmentsAssignRequest.md)|  | |

### Return type

[**AiAssignmentMutationResult**](AiAssignmentMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        AiAssignmentsAssignRequest aiAssignmentsAssignRequest = new AiAssignmentsAssignRequest(); // AiAssignmentsAssignRequest | 
        try {
            AiAssignmentMutationResult result = apiInstance.aiAssignmentsAssign(aiAssignmentsAssignRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsAssign");
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


## aiAssignmentsBulkAssign

> AiBulkAssignmentResult aiAssignmentsBulkAssign(requestBody)

Bulk assign

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | |

### Return type

[**AiBulkAssignmentResult**](AiBulkAssignmentResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
        try {
            AiBulkAssignmentResult result = apiInstance.aiAssignmentsBulkAssign(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsBulkAssign");
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


## aiAssignmentsCascadeProfileDelete

> AiSuccessResponse aiAssignmentsCascadeProfileDelete(body)

Cascade profile delete

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/).

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
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiAssignmentsCascadeProfileDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsCascadeProfileDelete");
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


## aiAssignmentsGetAllAssignments

> Map&lt;String, String&gt; aiAssignmentsGetAllAssignments(entityId)

Get all assignments

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String entityId = "entityId_example"; // String | 
        try {
            Map<String, String> result = apiInstance.aiAssignmentsGetAllAssignments(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsGetAllAssignments");
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


## aiAssignmentsGetAssignment

> String aiAssignmentsGetAssignment(actionType)

Get assignment

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionType** | **String**|  | |

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
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String actionType = "actionType_example"; // String | 
        try {
            String result = apiInstance.aiAssignmentsGetAssignment(actionType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsGetAssignment");
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


## aiAssignmentsResolveForAction

> AiResolvedAssignment aiAssignmentsResolveForAction(actionType, entityId)

Resolve for action

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionType** | **String**|  | |
| **entityId** | **String**|  | |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String actionType = "actionType_example"; // String | 
        String entityId = "entityId_example"; // String | 
        try {
            AiResolvedAssignment result = apiInstance.aiAssignmentsResolveForAction(actionType, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsResolveForAction");
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


## aiAssignmentsTryResolveForAction

> AiResolvedAssignment aiAssignmentsTryResolveForAction(actionType, entityId)

Try resolve for action

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionType** | **String**|  | |
| **entityId** | **String**|  | |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String actionType = "actionType_example"; // String | 
        String entityId = "entityId_example"; // String | 
        try {
            AiResolvedAssignment result = apiInstance.aiAssignmentsTryResolveForAction(actionType, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsTryResolveForAction");
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


## aiAssignmentsUnassign

> AiSuccessResponse aiAssignmentsUnassign(body)

Unassign

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/).

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
import org.openapitools.client.api.AssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AssignmentsApi apiInstance = new AssignmentsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiAssignmentsUnassign(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssignmentsApi#aiAssignmentsUnassign");
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

