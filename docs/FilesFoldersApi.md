# onlyoffice.docspace.api.sdk.org.openapitools.client.api.FoldersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkUpload**](FilesFoldersApi.md#checkUpload) | **POST** /api/2.0/files/{folderId}/upload/check |  |
| [**createFolder**](FilesFoldersApi.md#createFolder) | **POST** /api/2.0/files/folder/{folderId} |  |
| [**createFolderPrimaryExternalLink**](FilesFoldersApi.md#createFolderPrimaryExternalLink) | **POST** /api/2.0/files/folder/{id}/link |  |
| [**createReportFolderHistory**](FilesFoldersApi.md#createReportFolderHistory) | **POST** /api/2.0/files/folder/{folderId}/log/report |  |
| [**deleteFolder**](FilesFoldersApi.md#deleteFolder) | **DELETE** /api/2.0/files/folder/{folderId} |  |
| [**getFavoritesFolder**](FilesFoldersApi.md#getFavoritesFolder) | **GET** /api/2.0/files/@favorites |  |
| [**getFilesUsedSpace**](FilesFoldersApi.md#getFilesUsedSpace) | **GET** /api/2.0/files/filesusedspace |  |
| [**getFolder**](FilesFoldersApi.md#getFolder) | **GET** /api/2.0/files/{folderId}/formfilter |  |
| [**getFolderByFolderId**](FilesFoldersApi.md#getFolderByFolderId) | **GET** /api/2.0/files/{folderId} |  |
| [**getFolderHistory**](FilesFoldersApi.md#getFolderHistory) | **GET** /api/2.0/files/folder/{folderId}/log |  |
| [**getFolderInfo**](FilesFoldersApi.md#getFolderInfo) | **GET** /api/2.0/files/folder/{folderId} |  |
| [**getFolderLinks**](FilesFoldersApi.md#getFolderLinks) | **GET** /api/2.0/files/folder/{id}/links |  |
| [**getFolderPath**](FilesFoldersApi.md#getFolderPath) | **GET** /api/2.0/files/folder/{folderId}/path |  |
| [**getFolderPrimaryExternalLink**](FilesFoldersApi.md#getFolderPrimaryExternalLink) | **GET** /api/2.0/files/folder/{id}/link |  |
| [**getFolderRecent**](FilesFoldersApi.md#getFolderRecent) | **GET** /api/2.0/files/recent |  |
| [**getFolders**](FilesFoldersApi.md#getFolders) | **GET** /api/2.0/files/{folderId}/subfolders |  |
| [**getMyFolder**](FilesFoldersApi.md#getMyFolder) | **GET** /api/2.0/files/@my |  |
| [**getNewFolderItems**](FilesFoldersApi.md#getNewFolderItems) | **GET** /api/2.0/files/{folderId}/news |  |
| [**getPrivacyFolder**](FilesFoldersApi.md#getPrivacyFolder) | **GET** /api/2.0/files/@privacy |  |
| [**getRecentFolder**](FilesFoldersApi.md#getRecentFolder) | **GET** /api/2.0/files/@recent |  |
| [**getRootFolders**](FilesFoldersApi.md#getRootFolders) | **GET** /api/2.0/files/@root |  |
| [**getTrashFolder**](FilesFoldersApi.md#getTrashFolder) | **GET** /api/2.0/files/@trash |  |
| [**insertFile**](FilesFoldersApi.md#insertFile) | **POST** /api/2.0/files/{folderId}/insert |  |
| [**insertFileToMyFromBody**](FilesFoldersApi.md#insertFileToMyFromBody) | **POST** /api/2.0/files/@my/insert |  |
| [**renameFolder**](FilesFoldersApi.md#renameFolder) | **PUT** /api/2.0/files/folder/{folderId} |  |
| [**setFolderOrder**](FilesFoldersApi.md#setFolderOrder) | **PUT** /api/2.0/files/folder/{folderId}/order |  |
| [**setFolderPrimaryExternalLink**](FilesFoldersApi.md#setFolderPrimaryExternalLink) | **PUT** /api/2.0/files/folder/{id}/links |  |
| [**uploadFile**](FilesFoldersApi.md#uploadFile) | **POST** /api/2.0/files/{folderId}/upload |  |
| [**uploadFileToMy**](FilesFoldersApi.md#uploadFileToMy) | **POST** /api/2.0/files/@my/upload |  |



## checkUpload

> STRINGArrayWrapper checkUpload(folderId, checkUploadRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **checkUploadRequest** | [**CheckUploadRequest**](CheckUploadRequest.md)| The request parameters for checking file uploads. | |

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID.
        CheckUploadRequest checkUploadRequest = new CheckUploadRequest(); // CheckUploadRequest | The request parameters for checking file uploads.
        try {
            STRINGArrayWrapper result = apiInstance.checkUpload(folderId, checkUploadRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#checkUpload");
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
| **200** | Inserted file |  -  |


## createFolder

> FolderIntegerWrapper createFolder(folderId, createFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID for the folder creation.
        CreateFolder createFolder = new CreateFolder(); // CreateFolder | The parameters for creating a folder.
        try {
            FolderIntegerWrapper result = apiInstance.createFolder(folderId, createFolder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#createFolder");
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
| **200** | New folder parameters |  -  |


## createFolderPrimaryExternalLink

> FileShareWrapper createFolderPrimaryExternalLink(id, folderLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 9846; // Integer | The folder ID.
        FolderLinkRequest folderLinkRequest = new FolderLinkRequest(); // FolderLinkRequest | The folder link parameters.
        try {
            FileShareWrapper result = apiInstance.createFolderPrimaryExternalLink(id, folderLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#createFolderPrimaryExternalLink");
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
| **200** | Folders security information |  -  |
| **404** | Not Found |  -  |


## createReportFolderHistory

> StringWrapper createReportFolderHistory(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**|  | |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 56; // Integer | 
        try {
            StringWrapper result = apiInstance.createReportFolderHistory(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#createReportFolderHistory");
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
| **200** | URL to the report file |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |
| **404** | The required folder was not found |  -  |


## deleteFolder

> FileOperationArrayWrapper deleteFolder(folderId, deleteFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to delete. | |
| **deleteFolder** | [**DeleteFolder**](DeleteFolder.md)| The parameters for deleting a folder. | |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID to delete.
        DeleteFolder deleteFolder = new DeleteFolder(); // DeleteFolder | The parameters for deleting a folder.
        try {
            FileOperationArrayWrapper result = apiInstance.deleteFolder(folderId, deleteFolder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#deleteFolder");
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


## getFavoritesFolder

> FolderContentIntegerWrapper getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **Integer**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first item to retrieve in a paginated list.
        String sortBy = "some text"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used as a filter or search criterion for folder content queries.
        try {
            FolderContentIntegerWrapper result = apiInstance.getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFavoritesFolder");
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
| **200** | The Favorites section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getFilesUsedSpace

> FilesStatisticsResultWrapper getFilesUsedSpace()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**FilesStatisticsResultWrapper**](FilesStatisticsResultWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        try {
            FilesStatisticsResultWrapper result = apiInstance.getFilesUsedSpace();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFilesUsedSpace");
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
| **200** | Used space of files in the root folders |  -  |


## getFolder

> FormsItemArrayWrapper getFolder(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FormsItemArrayWrapper**](FormsItemArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        try {
            FormsItemArrayWrapper result = apiInstance.getFolder(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolder");
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
| **200** | Ok |  -  |


## getFolderByFolderId

> FolderContentIntegerWrapper getFolderByFolderId(folderId, userIdOrGroupId, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **roomId** | **Integer**| The room ID. | [optional] |
| **excludeSubject** | **Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders, or all elements from the specified folder. | [optional] [enum: 0, 1, 2] |
| **extension** | **String**| Specifies whether to search for the specific file extension. | [optional] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **formsItemKey** | **String**| The forms item key. | [optional] |
| **formsItemType** | **String**| The forms item type. | [optional] |
| **count** | **Integer**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first item to retrieve in a paginated request. | [optional] |
| **sortBy** | **String**| The property used for sorting the folder request results. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text value used as a filter parameter for folder content queries. | [optional] |
| **location** | [**Location**](.md)| The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link. | [optional] [enum: 1, 2, 3] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID.
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer roomId = 9846; // Integer | The room ID.
        Boolean excludeSubject = true; // Boolean | Specifies whether to exclude search by user or group ID.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders, or all elements from the specified folder.
        String extension = ".txt"; // String | Specifies whether to search for the specific file extension.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The search area.
        String formsItemKey = "some text"; // String | The forms item key.
        String formsItemType = "some text"; // String | The forms item type.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first item to retrieve in a paginated request.
        String sortBy = "some text"; // String | The property used for sorting the folder request results.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text value used as a filter parameter for folder content queries.
        Location location = Location.fromValue("1"); // Location | The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link.
        try {
            FolderContentIntegerWrapper result = apiInstance.getFolderByFolderId(folderId, userIdOrGroupId, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderByFolderId");
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
| **200** | Folder contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getFolderHistory

> HistoryArrayWrapper getFolderHistory(folderId, fromDate, toDate, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID of the history request. | |
| **fromDate** | [**ApiDateTime**](.md)| The start date of the history request. | [optional] |
| **toDate** | [**ApiDateTime**](.md)| The end date of the history request. | [optional] |
| **count** | **Integer**| The number of records to retrieve for the folder history. | [optional] |
| **startIndex** | **Integer**| The starting index from which the history records are retrieved in the request. | [optional] |

### Return type

[**HistoryArrayWrapper**](HistoryArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID of the history request.
        ApiDateTime fromDate = new ApiDateTime(); // ApiDateTime | The start date of the history request.
        ApiDateTime toDate = new ApiDateTime(); // ApiDateTime | The end date of the history request.
        Integer count = 1234; // Integer | The number of records to retrieve for the folder history.
        Integer startIndex = 1234; // Integer | The starting index from which the history records are retrieved in the request.
        try {
            HistoryArrayWrapper result = apiInstance.getFolderHistory(folderId, fromDate, toDate, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderHistory");
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
| **200** | List of actions in the folder |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |
| **404** | The required folder was not found |  -  |


## getFolderInfo

> FolderIntegerWrapper getFolderInfo(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        try {
            FolderIntegerWrapper result = apiInstance.getFolderInfo(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderInfo");
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
| **200** | Folder parameters |  -  |


## getFolderLinks

> FileShareArrayWrapper getFolderLinks(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 9846; // Integer | The folder ID.
        try {
            FileShareArrayWrapper result = apiInstance.getFolderLinks(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderLinks");
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
| **200** | Folder security information |  -  |


## getFolderPath

> FileEntryBaseArrayWrapper getFolderPath(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        try {
            FileEntryBaseArrayWrapper result = apiInstance.getFolderPath(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderPath");
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
| **403** | You don&#39;t have enough permission to view the folder content |  -  |


## getFolderPrimaryExternalLink

> FileShareWrapper getFolderPrimaryExternalLink(id, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder unique identifier. | |
| **count** | **Integer**| The number of items to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The starting index for the query results. | [optional] |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 9846; // Integer | The folder unique identifier.
        Integer count = 1234; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        try {
            FileShareWrapper result = apiInstance.getFolderPrimaryExternalLink(id, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderPrimaryExternalLink");
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
| **200** | Folder security information |  -  |
| **404** | Not Found |  -  |


## getFolderRecent

> FolderContentIntegerWrapper getFolderRecent(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-recent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **excludeSubject** | **Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **extension** | [**List&lt;String&gt;**](String.md)| Specifies whether to search for a specific file extension in the Recent folder. | [optional] |
| **count** | **Integer**| The maximum number of items to return. | [optional] |
| **startIndex** | **Integer**| The starting position of the results to be returned in the query response. | [optional] |
| **sortBy** | **String**| Specifies the sorting criteria for the folder request. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Boolean excludeSubject = true; // Boolean | Specifies whether to exclude search by user or group ID.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The search area.
        List<String> extension = Arrays.asList(new ArrayList<>()); // List<String> | Specifies whether to search for a specific file extension in the Recent folder.
        Integer count = 1234; // Integer | The maximum number of items to return.
        Integer startIndex = 1234; // Integer | The starting position of the results to be returned in the query response.
        String sortBy = "some text"; // String | Specifies the sorting criteria for the folder request.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used for filtering or searching folder contents.
        try {
            FolderContentIntegerWrapper result = apiInstance.getFolderRecent(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderRecent");
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
| **200** | The Recent section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getFolders

> FileEntryBaseArrayWrapper getFolders(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        try {
            FileEntryBaseArrayWrapper result = apiInstance.getFolders(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolders");
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
| **403** | You don&#39;t have enough permission to view the folder content |  -  |


## getMyFolder

> FolderContentIntegerWrapper getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **Integer**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 1234; // Integer | The starting position of the items to be retrieved.
        String sortBy = "some text"; // String | The property used to specify the sorting criteria for folder contents.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used for filtering or searching folder contents.
        try {
            FolderContentIntegerWrapper result = apiInstance.getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getMyFolder");
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
| **200** | The My documents section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getNewFolderItems

> FileEntryBaseArrayWrapper getNewFolderItems(folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        try {
            FileEntryBaseArrayWrapper result = apiInstance.getNewFolderItems(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getNewFolderItems");
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
| **403** | You don&#39;t have enough permission to view the folder content |  -  |


## getPrivacyFolder

> FolderContentIntegerWrapper getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **Integer**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first item to retrieve in a paginated list.
        String sortBy = "some text"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used as a filter or search criterion for folder content queries.
        try {
            FolderContentIntegerWrapper result = apiInstance.getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getPrivacyFolder");
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
| **200** | The Private Room section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getRecentFolder

> FolderContentIntegerWrapper getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **excludeSubject** | **Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **extension** | [**List&lt;String&gt;**](String.md)| Specifies whether to search for a specific file extension in the Recent folder. | [optional] |
| **count** | **Integer**| The maximum number of items to return. | [optional] |
| **startIndex** | **Integer**| The starting position of the results to be returned in the query response. | [optional] |
| **sortBy** | **String**| Specifies the sorting criteria for the folder request. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Boolean excludeSubject = true; // Boolean | Specifies whether to exclude search by user or group ID.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The search area.
        List<String> extension = Arrays.asList(new ArrayList<>()); // List<String> | Specifies whether to search for a specific file extension in the Recent folder.
        Integer count = 1234; // Integer | The maximum number of items to return.
        Integer startIndex = 1234; // Integer | The starting position of the results to be returned in the query response.
        String sortBy = "some text"; // String | Specifies the sorting criteria for the folder request.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used for filtering or searching folder contents.
        try {
            FolderContentIntegerWrapper result = apiInstance.getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getRecentFolder");
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
| **200** | The Recent section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getRootFolders

> FolderContentIntegerArrayWrapper getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **withoutTrash** | **Boolean**| Specifies whether to return the Trash section or not. | [optional] |
| **count** | **Integer**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **Integer**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used as a filter for searching or retrieving folder contents. | [optional] |

### Return type

[**FolderContentIntegerArrayWrapper**](FolderContentIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Boolean withoutTrash = true; // Boolean | Specifies whether to return the Trash section or not.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 1234; // Integer | The starting position of the items to be retrieved.
        String sortBy = "some text"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used as a filter for searching or retrieving folder contents.
        try {
            FolderContentIntegerArrayWrapper result = apiInstance.getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getRootFolders");
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
| **200** | List of section contents with the following parameters |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getTrashFolder

> FolderContentIntegerWrapper getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **Integer**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        Integer count = 1234; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 1234; // Integer | The starting position of the items to be retrieved.
        String sortBy = "some text"; // String | The property used to specify the sorting criteria for folder contents.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text used for filtering or searching folder contents.
        try {
            FolderContentIntegerWrapper result = apiInstance.getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getTrashFolder");
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
| **200** | The Trash section contents |  -  |
| **403** | You don&#39;t have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## insertFile

> FileIntegerWrapper insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for inserting a file. | |
| **insertFileFile** | **File**| The file to be inserted. | [optional] |
| **insertFileTitle** | **String**| The file title to be inserted. | [optional] |
| **insertFileCreateNewIfExist** | **Boolean**| Specifies whether to create a new file if it already exists or not. | [optional] |
| **insertFileKeepConvertStatus** | **Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **insertFileStreamCanRead** | **Boolean**|  | [optional] |
| **insertFileStreamCanWrite** | **Boolean**|  | [optional] |
| **insertFileStreamCanSeek** | **Boolean**|  | [optional] |
| **insertFileStreamCanTimeout** | **Boolean**|  | [optional] |
| **insertFileStreamLength** | **Long**|  | [optional] |
| **insertFileStreamPosition** | **Long**|  | [optional] |
| **insertFileStreamReadTimeout** | **Integer**|  | [optional] |
| **insertFileStreamWriteTimeout** | **Integer**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID for inserting a file.
        File insertFileFile = new File("/path/to/file"); // File | The file to be inserted.
        String insertFileTitle = "insertFileTitle_example"; // String | The file title to be inserted.
        Boolean insertFileCreateNewIfExist = true; // Boolean | Specifies whether to create a new file if it already exists or not.
        Boolean insertFileKeepConvertStatus = true; // Boolean | Specifies whether to keep the file converting status or not.
        Boolean insertFileStreamCanRead = true; // Boolean | 
        Boolean insertFileStreamCanWrite = true; // Boolean | 
        Boolean insertFileStreamCanSeek = true; // Boolean | 
        Boolean insertFileStreamCanTimeout = true; // Boolean | 
        Long insertFileStreamLength = 56L; // Long | 
        Long insertFileStreamPosition = 56L; // Long | 
        Integer insertFileStreamReadTimeout = 56; // Integer | 
        Integer insertFileStreamWriteTimeout = 56; // Integer | 
        try {
            FileIntegerWrapper result = apiInstance.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#insertFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inserted file |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |
| **404** | Folder not found |  -  |


## insertFileToMyFromBody

> FileIntegerWrapper insertFileToMyFromBody(_file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| The file to be inserted. | [optional] |
| **title** | **String**| The file title to be inserted. | [optional] |
| **createNewIfExist** | **Boolean**| Specifies whether to create a new file if it already exists or not. | [optional] |
| **keepConvertStatus** | **Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **streamCanRead** | **Boolean**|  | [optional] |
| **streamCanWrite** | **Boolean**|  | [optional] |
| **streamCanSeek** | **Boolean**|  | [optional] |
| **streamCanTimeout** | **Boolean**|  | [optional] |
| **streamLength** | **Long**|  | [optional] |
| **streamPosition** | **Long**|  | [optional] |
| **streamReadTimeout** | **Integer**|  | [optional] |
| **streamWriteTimeout** | **Integer**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        File _file = new File("/path/to/file"); // File | The file to be inserted.
        String title = "title_example"; // String | The file title to be inserted.
        Boolean createNewIfExist = true; // Boolean | Specifies whether to create a new file if it already exists or not.
        Boolean keepConvertStatus = true; // Boolean | Specifies whether to keep the file converting status or not.
        Boolean streamCanRead = true; // Boolean | 
        Boolean streamCanWrite = true; // Boolean | 
        Boolean streamCanSeek = true; // Boolean | 
        Boolean streamCanTimeout = true; // Boolean | 
        Long streamLength = 56L; // Long | 
        Long streamPosition = 56L; // Long | 
        Integer streamReadTimeout = 56; // Integer | 
        Integer streamWriteTimeout = 56; // Integer | 
        try {
            FileIntegerWrapper result = apiInstance.insertFileToMyFromBody(_file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#insertFileToMyFromBody");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inserted file |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |
| **404** | Folder not found |  -  |


## renameFolder

> FolderIntegerWrapper renameFolder(folderId, createFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID for the folder creation.
        CreateFolder createFolder = new CreateFolder(); // CreateFolder | The parameters for creating a folder.
        try {
            FolderIntegerWrapper result = apiInstance.renameFolder(folderId, createFolder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#renameFolder");
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
| **200** | Folder parameters |  -  |
| **403** | You don&#39;t have enough permission to rename the folder |  -  |


## setFolderOrder

> FolderIntegerWrapper setFolderOrder(folderId, orderRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The folder order information. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder unique identifier.
        OrderRequestDto orderRequestDto = new OrderRequestDto(); // OrderRequestDto | The folder order information.
        try {
            FolderIntegerWrapper result = apiInstance.setFolderOrder(folderId, orderRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#setFolderOrder");
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


## setFolderPrimaryExternalLink

> FileShareWrapper setFolderPrimaryExternalLink(id, folderLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 9846; // Integer | The folder ID.
        FolderLinkRequest folderLinkRequest = new FolderLinkRequest(); // FolderLinkRequest | The folder link parameters.
        try {
            FileShareWrapper result = apiInstance.setFolderPrimaryExternalLink(id, folderLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#setFolderPrimaryExternalLink");
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
| **200** | Folder information |  -  |


## uploadFile

> ObjectWrapper uploadFile(folderId, uploadRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to upload a file. | |
| **uploadRequestDto** | [**UploadRequestDto**](UploadRequestDto.md)| The request parameters for uploading a file. | [optional] |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID to upload a file.
        UploadRequestDto uploadRequestDto = new UploadRequestDto(); // UploadRequestDto | The request parameters for uploading a file.
        try {
            ObjectWrapper result = apiInstance.uploadFile(folderId, uploadRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#uploadFile");
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
| **200** | Inserted file |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |
| **404** | Folder not found |  -  |


## uploadFileToMy

> ObjectWrapper uploadFileToMy(inDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inDto** | [**UploadRequestDto**](.md)| The request parameters for uploading a file. | [optional] |

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
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UploadRequestDto inDto = new UploadRequestDto(); // UploadRequestDto | The request parameters for uploading a file.
        try {
            ObjectWrapper result = apiInstance.uploadFileToMy(inDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#uploadFileToMy");
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
| **200** | Uploaded file(s) |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |
| **404** | File not found |  -  |

