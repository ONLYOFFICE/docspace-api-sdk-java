# docspace-api-sdk.org.openapitools.client.api.ToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiToolsAddCustomServer**](AiToolsApi.md#aiToolsAddCustomServer) | **POST** /api/2.0/ai/tools/add-custom-server | Add custom server |
| [**aiToolsGetAllowAlways**](AiToolsApi.md#aiToolsGetAllowAlways) | **GET** /api/2.0/ai/tools/get-allow-always | Get allow always |
| [**aiToolsGetCustomServer**](AiToolsApi.md#aiToolsGetCustomServer) | **GET** /api/2.0/ai/tools/get-custom-server | Get custom server |
| [**aiToolsGetDisabled**](AiToolsApi.md#aiToolsGetDisabled) | **GET** /api/2.0/ai/tools/get-disabled | Get disabled |
| [**aiToolsIsAllowAlways**](AiToolsApi.md#aiToolsIsAllowAlways) | **GET** /api/2.0/ai/tools/is-allow-always | Is allow always |
| [**aiToolsIsToolDisabled**](AiToolsApi.md#aiToolsIsToolDisabled) | **GET** /api/2.0/ai/tools/is-tool-disabled | Is tool disabled |
| [**aiToolsListCustomServers**](AiToolsApi.md#aiToolsListCustomServers) | **GET** /api/2.0/ai/tools/list-custom-servers | List custom servers |
| [**aiToolsListSystemTools**](AiToolsApi.md#aiToolsListSystemTools) | **GET** /api/2.0/ai/tools/list-system-tools | List system tools |
| [**aiToolsRemoveCustomServer**](AiToolsApi.md#aiToolsRemoveCustomServer) | **DELETE** /api/2.0/ai/tools/remove-custom-server | Remove custom server |
| [**aiToolsReplaceAllCustomServers**](AiToolsApi.md#aiToolsReplaceAllCustomServers) | **PUT** /api/2.0/ai/tools/replace-all-custom-servers | Replace all custom servers |
| [**aiToolsSetAllowAlways**](AiToolsApi.md#aiToolsSetAllowAlways) | **PUT** /api/2.0/ai/tools/set-allow-always | Set allow always |
| [**aiToolsSetDisabled**](AiToolsApi.md#aiToolsSetDisabled) | **PUT** /api/2.0/ai/tools/set-disabled | Set disabled |
| [**aiToolsUpdateCustomServer**](AiToolsApi.md#aiToolsUpdateCustomServer) | **PUT** /api/2.0/ai/tools/update-custom-server | Update custom server |



## aiToolsAddCustomServer

> AiToolsMutationResult aiToolsAddCustomServer(aiToolsAddCustomServerRequest)

Add custom server

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsAddCustomServerRequest** | [**AiToolsAddCustomServerRequest**](AiToolsAddCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsAddCustomServerRequest aiToolsAddCustomServerRequest = new AiToolsAddCustomServerRequest(); // AiToolsAddCustomServerRequest | 
        try {
            AiToolsMutationResult result = apiInstance.aiToolsAddCustomServer(aiToolsAddCustomServerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsAddCustomServer");
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


## aiToolsGetAllowAlways

> List&lt;String&gt; aiToolsGetAllowAlways(entityId)

Get allow always

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String entityId = "entityId_example"; // String | 
        try {
            List<String> result = apiInstance.aiToolsGetAllowAlways(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsGetAllowAlways");
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


## aiToolsGetCustomServer

> Object aiToolsGetCustomServer(name, entityId)

Get custom server

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **entityId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String name = "name_example"; // String | 
        String entityId = "entityId_example"; // String | 
        try {
            Object result = apiInstance.aiToolsGetCustomServer(name, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsGetCustomServer");
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


## aiToolsGetDisabled

> Map&lt;String, List&lt;String&gt;&gt; aiToolsGetDisabled(entityId)

Get disabled

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String entityId = "entityId_example"; // String | 
        try {
            Map<String, List<String>> result = apiInstance.aiToolsGetDisabled(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsGetDisabled");
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


## aiToolsIsAllowAlways

> Boolean aiToolsIsAllowAlways(serverType, toolName, entityId)

Is allow always

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-allow-always/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serverType** | **String**|  | |
| **toolName** | **String**|  | |
| **entityId** | **String**|  | |

### Return type

**Boolean**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String serverType = "serverType_example"; // String | 
        String toolName = "toolName_example"; // String | 
        String entityId = "entityId_example"; // String | 
        try {
            Boolean result = apiInstance.aiToolsIsAllowAlways(serverType, toolName, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsIsAllowAlways");
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


## aiToolsIsToolDisabled

> Boolean aiToolsIsToolDisabled(serverType, toolName, entityId)

Is tool disabled

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-tool-disabled/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serverType** | **String**|  | |
| **toolName** | **String**|  | |
| **entityId** | **String**|  | |

### Return type

**Boolean**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String serverType = "serverType_example"; // String | 
        String toolName = "toolName_example"; // String | 
        String entityId = "entityId_example"; // String | 
        try {
            Boolean result = apiInstance.aiToolsIsToolDisabled(serverType, toolName, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsIsToolDisabled");
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


## aiToolsListCustomServers

> Map&lt;String, Object&gt; aiToolsListCustomServers(entityId)

List custom servers

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String entityId = "entityId_example"; // String | 
        try {
            Map<String, Object> result = apiInstance.aiToolsListCustomServers(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsListCustomServers");
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


## aiToolsListSystemTools

> Map&lt;String, List&lt;AiTMCPItem&gt;&gt; aiToolsListSystemTools(entityId)

List system tools

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;AiTMCPItem&gt;&gt;**](List.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        String entityId = "entityId_example"; // String | 
        try {
            Map<String, List<AiTMCPItem>> result = apiInstance.aiToolsListSystemTools(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsListSystemTools");
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


## aiToolsRemoveCustomServer

> AiSuccessResponse aiToolsRemoveCustomServer(aiToolsRemoveCustomServerRequest)

Remove custom server

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsRemoveCustomServerRequest** | [**AiToolsRemoveCustomServerRequest**](AiToolsRemoveCustomServerRequest.md)|  | |

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
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsRemoveCustomServerRequest aiToolsRemoveCustomServerRequest = new AiToolsRemoveCustomServerRequest(); // AiToolsRemoveCustomServerRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiToolsRemoveCustomServer(aiToolsRemoveCustomServerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsRemoveCustomServer");
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


## aiToolsReplaceAllCustomServers

> AiToolsBulkResult aiToolsReplaceAllCustomServers(aiToolsReplaceAllCustomServersRequest)

Replace all custom servers

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsReplaceAllCustomServersRequest** | [**AiToolsReplaceAllCustomServersRequest**](AiToolsReplaceAllCustomServersRequest.md)|  | |

### Return type

[**AiToolsBulkResult**](AiToolsBulkResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsReplaceAllCustomServersRequest aiToolsReplaceAllCustomServersRequest = new AiToolsReplaceAllCustomServersRequest(); // AiToolsReplaceAllCustomServersRequest | 
        try {
            AiToolsBulkResult result = apiInstance.aiToolsReplaceAllCustomServers(aiToolsReplaceAllCustomServersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsReplaceAllCustomServers");
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


## aiToolsSetAllowAlways

> AiSuccessResponse aiToolsSetAllowAlways(aiToolsSetAllowAlwaysRequest)

Set allow always

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsSetAllowAlwaysRequest** | [**AiToolsSetAllowAlwaysRequest**](AiToolsSetAllowAlwaysRequest.md)|  | |

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
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsSetAllowAlwaysRequest aiToolsSetAllowAlwaysRequest = new AiToolsSetAllowAlwaysRequest(); // AiToolsSetAllowAlwaysRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiToolsSetAllowAlways(aiToolsSetAllowAlwaysRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsSetAllowAlways");
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


## aiToolsSetDisabled

> AiSuccessResponse aiToolsSetDisabled(aiToolsSetDisabledRequest)

Set disabled

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsSetDisabledRequest** | [**AiToolsSetDisabledRequest**](AiToolsSetDisabledRequest.md)|  | |

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
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsSetDisabledRequest aiToolsSetDisabledRequest = new AiToolsSetDisabledRequest(); // AiToolsSetDisabledRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiToolsSetDisabled(aiToolsSetDisabledRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsSetDisabled");
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


## aiToolsUpdateCustomServer

> AiToolsMutationResult aiToolsUpdateCustomServer(aiToolsUpdateCustomServerRequest)

Update custom server

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiToolsUpdateCustomServerRequest** | [**AiToolsUpdateCustomServerRequest**](AiToolsUpdateCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ToolsApi apiInstance = new ToolsApi(defaultClient);
        AiToolsUpdateCustomServerRequest aiToolsUpdateCustomServerRequest = new AiToolsUpdateCustomServerRequest(); // AiToolsUpdateCustomServerRequest | 
        try {
            AiToolsMutationResult result = apiInstance.aiToolsUpdateCustomServer(aiToolsUpdateCustomServerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolsApi#aiToolsUpdateCustomServer");
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

