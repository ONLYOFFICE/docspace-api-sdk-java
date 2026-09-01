# docspace-api-sdk.org.openapitools.client.api.PromptsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiPromptsCreate**](AiPromptsApi.md#aiPromptsCreate) | **POST** /api/2.0/ai/prompts/create | Create |
| [**aiPromptsCreateFolder**](AiPromptsApi.md#aiPromptsCreateFolder) | **POST** /api/2.0/ai/prompts/create-folder | Create folder |
| [**aiPromptsDelete**](AiPromptsApi.md#aiPromptsDelete) | **DELETE** /api/2.0/ai/prompts/delete | Delete |
| [**aiPromptsDeleteFolder**](AiPromptsApi.md#aiPromptsDeleteFolder) | **DELETE** /api/2.0/ai/prompts/delete-folder | Delete folder |
| [**aiPromptsExport**](AiPromptsApi.md#aiPromptsExport) | **GET** /api/2.0/ai/prompts/export | Export |
| [**aiPromptsGetById**](AiPromptsApi.md#aiPromptsGetById) | **GET** /api/2.0/ai/prompts/get-by-id | Get by id |
| [**aiPromptsGetFolderById**](AiPromptsApi.md#aiPromptsGetFolderById) | **GET** /api/2.0/ai/prompts/get-folder-by-id | Get folder by id |
| [**aiPromptsImportBundle**](AiPromptsApi.md#aiPromptsImportBundle) | **POST** /api/2.0/ai/prompts/import-bundle | Import bundle |
| [**aiPromptsList**](AiPromptsApi.md#aiPromptsList) | **GET** /api/2.0/ai/prompts/list | List |
| [**aiPromptsListFolders**](AiPromptsApi.md#aiPromptsListFolders) | **GET** /api/2.0/ai/prompts/list-folders | List folders |
| [**aiPromptsMove**](AiPromptsApi.md#aiPromptsMove) | **PUT** /api/2.0/ai/prompts/move | Move |
| [**aiPromptsRenameFolder**](AiPromptsApi.md#aiPromptsRenameFolder) | **PUT** /api/2.0/ai/prompts/rename-folder | Rename folder |
| [**aiPromptsUpdate**](AiPromptsApi.md#aiPromptsUpdate) | **PUT** /api/2.0/ai/prompts/update | Update |



## aiPromptsCreate

> AiPromptMutationResult aiPromptsCreate(aiCreatePromptInput)

Create

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiCreatePromptInput** | [**AiCreatePromptInput**](AiCreatePromptInput.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        AiCreatePromptInput aiCreatePromptInput = new AiCreatePromptInput(); // AiCreatePromptInput | 
        try {
            AiPromptMutationResult result = apiInstance.aiPromptsCreate(aiCreatePromptInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsCreate");
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


## aiPromptsCreateFolder

> AiFolderMutationResult aiPromptsCreateFolder(body)

Create folder

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiFolderMutationResult result = apiInstance.aiPromptsCreateFolder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsCreateFolder");
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


## aiPromptsDelete

> AiSuccessResponse aiPromptsDelete(body)

Delete

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/).

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
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiPromptsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsDelete");
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


## aiPromptsDeleteFolder

> AiSuccessResponse aiPromptsDeleteFolder(body)

Delete folder

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/).

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
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiPromptsDeleteFolder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsDeleteFolder");
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


## aiPromptsExport

> AiPromptBundle aiPromptsExport()

Export

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AiPromptBundle**](AiPromptBundle.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        try {
            AiPromptBundle result = apiInstance.aiPromptsExport();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsExport");
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


## aiPromptsGetById

> AiPrompt aiPromptsGetById(id)

Get by id

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**AiPrompt**](AiPrompt.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            AiPrompt result = apiInstance.aiPromptsGetById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsGetById");
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


## aiPromptsGetFolderById

> AiPromptFolder aiPromptsGetFolderById(id)

Get folder by id

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**AiPromptFolder**](AiPromptFolder.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            AiPromptFolder result = apiInstance.aiPromptsGetFolderById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsGetFolderById");
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


## aiPromptsImportBundle

> AiImportResult aiPromptsImportBundle(aiPromptsImportBundleRequest)

Import bundle

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiPromptsImportBundleRequest** | [**AiPromptsImportBundleRequest**](AiPromptsImportBundleRequest.md)|  | |

### Return type

[**AiImportResult**](AiImportResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        AiPromptsImportBundleRequest aiPromptsImportBundleRequest = new AiPromptsImportBundleRequest(); // AiPromptsImportBundleRequest | 
        try {
            AiImportResult result = apiInstance.aiPromptsImportBundle(aiPromptsImportBundleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsImportBundle");
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


## aiPromptsList

> List&lt;AiPrompt&gt; aiPromptsList(folderId)

List

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **String**|  | |

### Return type

[**List&lt;AiPrompt&gt;**](AiPrompt.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        String folderId = "folderId_example"; // String | 
        try {
            List<AiPrompt> result = apiInstance.aiPromptsList(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsList");
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


## aiPromptsListFolders

> List&lt;AiPromptFolder&gt; aiPromptsListFolders()

List folders

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;AiPromptFolder&gt;**](AiPromptFolder.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        try {
            List<AiPromptFolder> result = apiInstance.aiPromptsListFolders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsListFolders");
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


## aiPromptsMove

> AiPromptMutationResult aiPromptsMove(aiPromptsMoveRequest)

Move

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiPromptsMoveRequest** | [**AiPromptsMoveRequest**](AiPromptsMoveRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        AiPromptsMoveRequest aiPromptsMoveRequest = new AiPromptsMoveRequest(); // AiPromptsMoveRequest | 
        try {
            AiPromptMutationResult result = apiInstance.aiPromptsMove(aiPromptsMoveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsMove");
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


## aiPromptsRenameFolder

> AiFolderMutationResult aiPromptsRenameFolder(aiPromptsRenameFolderRequest)

Rename folder

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiPromptsRenameFolderRequest** | [**AiPromptsRenameFolderRequest**](AiPromptsRenameFolderRequest.md)|  | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        AiPromptsRenameFolderRequest aiPromptsRenameFolderRequest = new AiPromptsRenameFolderRequest(); // AiPromptsRenameFolderRequest | 
        try {
            AiFolderMutationResult result = apiInstance.aiPromptsRenameFolder(aiPromptsRenameFolderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsRenameFolder");
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


## aiPromptsUpdate

> AiPromptMutationResult aiPromptsUpdate(aiPromptsUpdateRequest)

Update

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiPromptsUpdateRequest** | [**AiPromptsUpdateRequest**](AiPromptsUpdateRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PromptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        PromptsApi apiInstance = new PromptsApi(defaultClient);
        AiPromptsUpdateRequest aiPromptsUpdateRequest = new AiPromptsUpdateRequest(); // AiPromptsUpdateRequest | 
        try {
            AiPromptMutationResult result = apiInstance.aiPromptsUpdate(aiPromptsUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromptsApi#aiPromptsUpdate");
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

