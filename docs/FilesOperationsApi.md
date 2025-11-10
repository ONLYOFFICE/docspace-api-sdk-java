# onlyoffice.docspace.api.sdk.org.openapitools.client.api.OperationsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFavorites**](FilesOperationsApi.md#addFavorites) | **POST** /api/2.0/files/favorites |  |
| [**bulkDownload**](FilesOperationsApi.md#bulkDownload) | **PUT** /api/2.0/files/fileops/bulkdownload |  |
| [**checkConversionStatus**](FilesOperationsApi.md#checkConversionStatus) | **GET** /api/2.0/files/file/{fileId}/checkconversion |  |
| [**checkMoveOrCopyBatchItems**](FilesOperationsApi.md#checkMoveOrCopyBatchItems) | **GET** /api/2.0/files/fileops/move |  |
| [**checkMoveOrCopyDestFolder**](FilesOperationsApi.md#checkMoveOrCopyDestFolder) | **GET** /api/2.0/files/fileops/checkdestfolder |  |
| [**copyBatchItems**](FilesOperationsApi.md#copyBatchItems) | **PUT** /api/2.0/files/fileops/copy |  |
| [**createUploadSession**](FilesOperationsApi.md#createUploadSession) | **POST** /api/2.0/files/{folderId}/upload/create_session |  |
| [**deleteBatchItems**](FilesOperationsApi.md#deleteBatchItems) | **PUT** /api/2.0/files/fileops/delete |  |
| [**deleteFavoritesFromBody**](FilesOperationsApi.md#deleteFavoritesFromBody) | **DELETE** /api/2.0/files/favorites |  |
| [**deleteFileVersions**](FilesOperationsApi.md#deleteFileVersions) | **PUT** /api/2.0/files/fileops/deleteversion |  |
| [**duplicateBatchItems**](FilesOperationsApi.md#duplicateBatchItems) | **PUT** /api/2.0/files/fileops/duplicate |  |
| [**emptyTrash**](FilesOperationsApi.md#emptyTrash) | **PUT** /api/2.0/files/fileops/emptytrash |  |
| [**getOperationStatuses**](FilesOperationsApi.md#getOperationStatuses) | **GET** /api/2.0/files/fileops |  |
| [**getOperationStatusesByType**](FilesOperationsApi.md#getOperationStatusesByType) | **GET** /api/2.0/files/fileops/{operationType} |  |
| [**markAsRead**](FilesOperationsApi.md#markAsRead) | **PUT** /api/2.0/files/fileops/markasread |  |
| [**moveBatchItems**](FilesOperationsApi.md#moveBatchItems) | **PUT** /api/2.0/files/fileops/move |  |
| [**startFileConversion**](FilesOperationsApi.md#startFileConversion) | **PUT** /api/2.0/files/file/{fileId}/checkconversion |  |
| [**terminateTasks**](FilesOperationsApi.md#terminateTasks) | **PUT** /api/2.0/files/fileops/terminate/{id} |  |
| [**updateFileComment**](FilesOperationsApi.md#updateFileComment) | **PUT** /api/2.0/files/file/{fileId}/comment |  |



## addFavorites

> BooleanWrapper addFavorites(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            BooleanWrapper result = apiInstance.addFavorites(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#addFavorites");
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
| **200** | Boolean value: true if the operation is successful |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## bulkDownload

> FileOperationArrayWrapper bulkDownload(downloadRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **downloadRequestDto** | [**DownloadRequestDto**](DownloadRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        DownloadRequestDto downloadRequestDto = new DownloadRequestDto(); // DownloadRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.bulkDownload(downloadRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#bulkDownload");
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
| **200** | List of file operations |  -  |
| **403** | You don&#39;t have enough permission to download |  -  |


## checkConversionStatus

> ConversationResultArrayWrapper checkConversionStatus(fileId, start)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to check conversion status. | |
| **start** | **Boolean**| Specifies whether a conversion operation is started or not. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to check conversion status.
        Boolean start = true; // Boolean | Specifies whether a conversion operation is started or not.
        try {
            ConversationResultArrayWrapper result = apiInstance.checkConversionStatus(fileId, start);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#checkConversionStatus");
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
| **200** | Conversion result |  -  |


## checkMoveOrCopyBatchItems

> FileEntryBaseArrayWrapper checkMoveOrCopyBatchItems(inDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BatchRequestDto inDto = new BatchRequestDto(); // BatchRequestDto | The request parameters for copying/moving files.
        try {
            FileEntryBaseArrayWrapper result = apiInstance.checkMoveOrCopyBatchItems(inDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#checkMoveOrCopyBatchItems");
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
| **200** | List of file entry information |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |


## checkMoveOrCopyDestFolder

> CheckDestFolderWrapper checkMoveOrCopyDestFolder(inDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

### Return type

[**CheckDestFolderWrapper**](CheckDestFolderWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BatchRequestDto inDto = new BatchRequestDto(); // BatchRequestDto | The request parameters for copying/moving files.
        try {
            CheckDestFolderWrapper result = apiInstance.checkMoveOrCopyDestFolder(inDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#checkMoveOrCopyDestFolder");
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
| **200** | Result |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |


## copyBatchItems

> FileOperationArrayWrapper copyBatchItems(batchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BatchRequestDto batchRequestDto = new BatchRequestDto(); // BatchRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.copyBatchItems(batchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#copyBatchItems");
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
| **200** | List of file operations |  -  |
| **403** | You don&#39;t have enough permission to copy |  -  |


## createUploadSession

> ObjectWrapper createUploadSession(folderId, sessionRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The session folder ID. | |
| **sessionRequest** | [**SessionRequest**](SessionRequest.md)| The session parameters. | |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer folderId = 9846; // Integer | The session folder ID.
        SessionRequest sessionRequest = new SessionRequest(); // SessionRequest | The session parameters.
        try {
            ObjectWrapper result = apiInstance.createUploadSession(folderId, sessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#createUploadSession");
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
| **200** | Information about created session |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |


## deleteBatchItems

> FileOperationArrayWrapper deleteBatchItems(deleteBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteBatchRequestDto** | [**DeleteBatchRequestDto**](DeleteBatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        DeleteBatchRequestDto deleteBatchRequestDto = new DeleteBatchRequestDto(); // DeleteBatchRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.deleteBatchItems(deleteBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#deleteBatchItems");
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
| **200** | List of file operations |  -  |
| **403** | You don&#39;t have enough permission to delete |  -  |


## deleteFavoritesFromBody

> BooleanWrapper deleteFavoritesFromBody(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            BooleanWrapper result = apiInstance.deleteFavoritesFromBody(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#deleteFavoritesFromBody");
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
| **200** | Boolean value: true if the operation is successful |  -  |


## deleteFileVersions

> FileOperationWrapper deleteFileVersions(deleteVersionBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteVersionBatchRequestDto** | [**DeleteVersionBatchRequestDto**](DeleteVersionBatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        DeleteVersionBatchRequestDto deleteVersionBatchRequestDto = new DeleteVersionBatchRequestDto(); // DeleteVersionBatchRequestDto | 
        try {
            FileOperationWrapper result = apiInstance.deleteFileVersions(deleteVersionBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#deleteFileVersions");
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
| **200** | List of file operations |  -  |


## duplicateBatchItems

> FileOperationArrayWrapper duplicateBatchItems(duplicateRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **duplicateRequestDto** | [**DuplicateRequestDto**](DuplicateRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        DuplicateRequestDto duplicateRequestDto = new DuplicateRequestDto(); // DuplicateRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.duplicateBatchItems(duplicateRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#duplicateBatchItems");
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
| **200** | List of file operations |  -  |
| **403** | You don&#39;t have enough permission to duplicate |  -  |


## emptyTrash

> FileOperationArrayWrapper emptyTrash(single)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **single** | **Boolean**| Specifies whether to return only the current operation | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Boolean single = true; // Boolean | Specifies whether to return only the current operation
        try {
            FileOperationArrayWrapper result = apiInstance.emptyTrash(single);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#emptyTrash");
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
| **200** | List of file operations |  -  |


## getOperationStatuses

> FileOperationArrayWrapper getOperationStatuses(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the file operation. | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        String id = "9846"; // String | The ID of the file operation.
        try {
            FileOperationArrayWrapper result = apiInstance.getOperationStatuses(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#getOperationStatuses");
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
| **200** | List of file operations |  -  |


## getOperationStatusesByType

> FileOperationArrayWrapper getOperationStatusesByType(operationType, id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **operationType** | [**FileOperationType**](.md)| Specifies the type of file operation to be retrieved. | [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **id** | **String**| The ID of the file operation. | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        FileOperationType operationType = FileOperationType.fromValue("0"); // FileOperationType | Specifies the type of file operation to be retrieved.
        String id = "9846"; // String | The ID of the file operation.
        try {
            FileOperationArrayWrapper result = apiInstance.getOperationStatusesByType(operationType, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#getOperationStatusesByType");
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
| **200** | List of file operations |  -  |


## markAsRead

> FileOperationArrayWrapper markAsRead(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.markAsRead(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#markAsRead");
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
| **200** | List of file operations |  -  |


## moveBatchItems

> FileOperationArrayWrapper moveBatchItems(batchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        BatchRequestDto batchRequestDto = new BatchRequestDto(); // BatchRequestDto | 
        try {
            FileOperationArrayWrapper result = apiInstance.moveBatchItems(batchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#moveBatchItems");
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
| **200** | List of file operations |  -  |
| **403** | You don&#39;t have enough permission to move |  -  |


## startFileConversion

> ConversationResultArrayWrapper startFileConversion(fileId, checkConversionRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to start conversion proccess. | |
| **checkConversionRequestDtoInteger** | [**CheckConversionRequestDtoInteger**](CheckConversionRequestDtoInteger.md)| The parameters for checking file conversion. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to start conversion proccess.
        CheckConversionRequestDtoInteger checkConversionRequestDtoInteger = new CheckConversionRequestDtoInteger(); // CheckConversionRequestDtoInteger | The parameters for checking file conversion.
        try {
            ConversationResultArrayWrapper result = apiInstance.startFileConversion(fileId, checkConversionRequestDtoInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#startFileConversion");
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
| **200** | Conversion result |  -  |


## terminateTasks

> FileOperationArrayWrapper terminateTasks(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation unique identifier. | |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        String id = "9846"; // String | The operation unique identifier.
        try {
            FileOperationArrayWrapper result = apiInstance.terminateTasks(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#terminateTasks");
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
| **200** | List of file operations |  -  |


## updateFileComment

> StringWrapper updateFileComment(fileId, updateComment)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID where the comment is located. | |
| **updateComment** | [**UpdateComment**](UpdateComment.md)| The parameters for updating a comment. | |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID where the comment is located.
        UpdateComment updateComment = new UpdateComment(); // UpdateComment | The parameters for updating a comment.
        try {
            StringWrapper result = apiInstance.updateFileComment(fileId, updateComment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#updateFileComment");
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
| **200** | Updated comment |  -  |

