# docspace-api-sdk.org.openapitools.client.api.FoldersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkUpload**](FilesFoldersApi.md#checkUpload) | **POST** /api/2.0/files/{folderId}/upload/check | Check file uploads |
| [**createFolder**](FilesFoldersApi.md#createFolder) | **POST** /api/2.0/files/folder/{folderId} | Create a folder |
| [**createFolderPrimaryExternalLink**](FilesFoldersApi.md#createFolderPrimaryExternalLink) | **POST** /api/2.0/files/folder/{id}/link | Create primary external link |
| [**createReportFolderHistory**](FilesFoldersApi.md#createReportFolderHistory) | **POST** /api/2.0/files/folder/{folderId}/log/report | Generates folder history |
| [**deleteFolder**](FilesFoldersApi.md#deleteFolder) | **DELETE** /api/2.0/files/folder/{folderId} | Delete a folder |
| [**generateXlsxByFolder**](FilesFoldersApi.md#generateXlsxByFolder) | **POST** /api/2.0/files/folder/{folderId}/xlsx | Generate XLSX report by folder |
| [**getFavoritesFolder**](FilesFoldersApi.md#getFavoritesFolder) | **GET** /api/2.0/files/@favorites | Get the Favorites section |
| [**getFilesUsedSpace**](FilesFoldersApi.md#getFilesUsedSpace) | **GET** /api/2.0/files/filesusedspace | Get used space of files |
| [**getFolder**](FilesFoldersApi.md#getFolder) | **GET** /api/2.0/files/{folderId}/formfilter | Get folder form filter |
| [**getFolderByFolderId**](FilesFoldersApi.md#getFolderByFolderId) | **GET** /api/2.0/files/{folderId} | Get a folder by ID |
| [**getFolderHistory**](FilesFoldersApi.md#getFolderHistory) | **GET** /api/2.0/files/folder/{folderId}/log | Get folder history |
| [**getFolderInfo**](FilesFoldersApi.md#getFolderInfo) | **GET** /api/2.0/files/folder/{folderId} | Get folder information |
| [**getFolderLinks**](FilesFoldersApi.md#getFolderLinks) | **GET** /api/2.0/files/folder/{id}/links | Get the folder links |
| [**getFolderPath**](FilesFoldersApi.md#getFolderPath) | **GET** /api/2.0/files/folder/{folderId}/path | Get the folder path |
| [**getFolderPrimaryExternalLink**](FilesFoldersApi.md#getFolderPrimaryExternalLink) | **GET** /api/2.0/files/folder/{id}/link | Get primary external link |
| [**getFolders**](FilesFoldersApi.md#getFolders) | **GET** /api/2.0/files/{folderId}/subfolders | Get subfolders |
| [**getMyFolder**](FilesFoldersApi.md#getMyFolder) | **GET** /api/2.0/files/@my | Get the My documents section |
| [**getNewFolderItems**](FilesFoldersApi.md#getNewFolderItems) | **GET** /api/2.0/files/{folderId}/news | Get new folder items |
| [**getPrivacyFolder**](FilesFoldersApi.md#getPrivacyFolder) | **GET** /api/2.0/files/@privacy | Get the Private Room section |
| [**getRecentFolder**](FilesFoldersApi.md#getRecentFolder) | **GET** /api/2.0/files/recent | Get the Recent section |
| [**getRootFolders**](FilesFoldersApi.md#getRootFolders) | **GET** /api/2.0/files/@root | Get filtered sections |
| [**getTrashFolder**](FilesFoldersApi.md#getTrashFolder) | **GET** /api/2.0/files/@trash | Get the Trash section |
| [**insertFile**](FilesFoldersApi.md#insertFile) | **POST** /api/2.0/files/{folderId}/insert | Insert a file |
| [**insertFileToMyFromBody**](FilesFoldersApi.md#insertFileToMyFromBody) | **POST** /api/2.0/files/@my/insert | Insert a file to the My documents section |
| [**renameFolder**](FilesFoldersApi.md#renameFolder) | **PUT** /api/2.0/files/folder/{folderId} | Rename a folder |
| [**setFolderOrder**](FilesFoldersApi.md#setFolderOrder) | **PUT** /api/2.0/files/folder/{folderId}/order | Set folder order |
| [**setFolderPrimaryExternalLink**](FilesFoldersApi.md#setFolderPrimaryExternalLink) | **PUT** /api/2.0/files/folder/{id}/links | Set the folder external link |
| [**uploadFile**](FilesFoldersApi.md#uploadFile) | **POST** /api/2.0/files/{folderId}/upload | Upload a file |
| [**uploadFileToMy**](FilesFoldersApi.md#uploadFileToMy) | **POST** /api/2.0/files/@my/upload | Upload a file to the My documents section |



## checkUpload

> STRINGArrayWrapper checkUpload(folderId, checkUploadRequest)

Check file uploadsChecks the file uploads to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **checkUploadRequest** | [**CheckUploadRequest**](CheckUploadRequest.md)| The request parameters for checking file uploads. | |

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID.
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
| **401** | Unauthorized |  -  |


## createFolder

> FolderIntegerWrapper createFolder(folderId, createFolder)

Create a folderCreates a new folder with the title specified in the request. The parent folder ID can be also specified.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID for the folder creation.
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
| **401** | Unauthorized |  -  |


## createFolderPrimaryExternalLink

> FileShareWrapper createFolderPrimaryExternalLink(id, folderLinkRequest)

Create primary external linkCreates a primary external link by the identifier specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 1; // Integer | The folder ID.
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
| **401** | Unauthorized |  -  |


## createReportFolderHistory

> StringWrapper createReportFolderHistory(folderId)

Generates folder historyGenerates the activity history of a folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**|  | |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


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
| **403** | You don't have enough permission to perform the operation |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## deleteFolder

> FileOperationArrayWrapper deleteFolder(folderId, deleteFolder)

Delete a folderDeletes a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to delete. | |
| **deleteFolder** | [**DeleteFolder**](DeleteFolder.md)| The parameters for deleting a folder. | |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 10; // Integer | The folder ID to delete.
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
| **401** | Unauthorized |  -  |


## generateXlsxByFolder

> FileIntegerWrapper generateXlsxByFolder(folderId)

Generate XLSX report by folderTriggers asynchronous XLSX report generation for the specified form results folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder unique identifier.
        try {
            FileIntegerWrapper result = apiInstance.generateXlsxByFolder(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#generateXlsxByFolder");
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
| **200** | Original form file information |  -  |
| **403** | You do not have enough permissions to perform this action |  -  |
| **404** | Form results folder not found |  -  |
| **401** | Unauthorized |  -  |


## getFavoritesFolder

> FolderContentIntegerWrapper getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)

Get the Favorites sectionReturns the detailed list of files and folders located in the Favorites section.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 0; // Integer | The zero-based index of the first item to retrieve in a paginated list.
        String sortBy = "DateAndTime"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used as a filter or search criterion for folder content queries.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getFilesUsedSpace

> FilesStatisticsResultWrapper getFilesUsedSpace()

Get used space of filesReturns the used space of files in the root folders.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**FilesStatisticsResultWrapper**](FilesStatisticsResultWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


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
| **401** | Unauthorized |  -  |


## getFolder

> FormsItemArrayWrapper getFolder(folderId)

Get folder form filterReturns the form filter of a folder with the ID specified in the request.

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
        Integer folderId = 1; // Integer | The folder unique identifier.
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

> FolderContentIntegerWrapper getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location)

Get a folder by IDReturns the detailed list of files and folders located in the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **userIdOrGroupId** | **UUID**| The user or group ID. | [optional] |
| **sharedBy** | **UUID**| The identifier of the user who shared the folder or file. | [optional] |
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
        Integer folderId = 1; // Integer | The folder ID.
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        UUID sharedBy = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The identifier of the user who shared the folder or file.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer roomId = 1; // Integer | The room ID.
        Boolean excludeSubject = false; // Boolean | Specifies whether to exclude search by user or group ID.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders, or all elements from the specified folder.
        String extension = ".docx"; // String | Specifies whether to search for the specific file extension.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The search area.
        String formsItemKey = "doc_key_123"; // String | The forms item key.
        String formsItemType = "text"; // String | The forms item type.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 0; // Integer | The zero-based index of the first item to retrieve in a paginated request.
        String sortBy = "DateAndTime"; // String | The property used for sorting the folder request results.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text value used as a filter parameter for folder content queries.
        Location location = Location.fromValue("1"); // Location | The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link.
        try {
            FolderContentIntegerWrapper result = apiInstance.getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location);
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |


## getFolderHistory

> HistoryArrayWrapper getFolderHistory(folderId, fromDate, toDate, count, startIndex)

Get folder historyReturns the activity history of a folder with a specified identifier.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID of the history request.
        ApiDateTime fromDate = new ApiDateTime(); // ApiDateTime | The start date of the history request.
        ApiDateTime toDate = new ApiDateTime(); // ApiDateTime | The end date of the history request.
        Integer count = 25; // Integer | The number of records to retrieve for the folder history.
        Integer startIndex = 0; // Integer | The starting index from which the history records are retrieved in the request.
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
| **403** | You don't have enough permission to perform the operation |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getFolderInfo

> FolderIntegerWrapper getFolderInfo(folderId)

Get folder informationReturns the detailed information about a folder with the ID specified in the request.

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
        Integer folderId = 1; // Integer | The folder unique identifier.
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

Get the folder linksReturns the links of the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 1; // Integer | The folder ID.
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
| **401** | Unauthorized |  -  |


## getFolderPath

> FileEntryBaseArrayWrapper getFolderPath(folderId)

Get the folder pathReturns a path to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder unique identifier.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **401** | Unauthorized |  -  |


## getFolderPrimaryExternalLink

> FileShareWrapper getFolderPrimaryExternalLink(id, count, startIndex)

Get primary external linkReturns the primary external link by the identifier specified in the request.

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
        Integer id = 10; // Integer | The folder unique identifier.
        Integer count = 25; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 0; // Integer | The starting index for the query results.
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


## getFolders

> FileEntryBaseArrayWrapper getFolders(folderId)

Get subfoldersReturns a list of all the subfolders from a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder unique identifier.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **401** | Unauthorized |  -  |


## getMyFolder

> FolderContentIntegerWrapper getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)

Get the My documents sectionReturns the detailed list of files and folders located in the My documents section.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 0; // Integer | The starting position of the items to be retrieved.
        String sortBy = "DateAndTime"; // String | The property used to specify the sorting criteria for folder contents.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used for filtering or searching folder contents.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getNewFolderItems

> FileEntryBaseArrayWrapper getNewFolderItems(folderId)

Get new folder itemsReturns a list of all the new items from a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder unique identifier.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **401** | Unauthorized |  -  |


## getPrivacyFolder

> FolderContentIntegerWrapper getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)

Get the Private Room sectionReturns the detailed list of files and folders located in the Private Room section.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the request.
        Integer startIndex = 0; // Integer | The zero-based index of the first item to retrieve in a paginated list.
        String sortBy = "DateAndTime"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used as a filter or search criterion for folder content queries.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getRecentFolder

> FolderContentIntegerWrapper getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)

Get the Recent sectionReturns the detailed list of files located in the Recent section.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Boolean excludeSubject = false; // Boolean | Specifies whether to exclude search by user or group ID.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The search area.
        List<String> extension = Arrays.asList(new ArrayList<>()); // List<String> | Specifies whether to search for a specific file extension in the Recent folder.
        Integer count = 25; // Integer | The maximum number of items to return.
        Integer startIndex = 0; // Integer | The starting position of the results to be returned in the query response.
        String sortBy = "DateAndTime"; // String | Specifies the sorting criteria for the folder request.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used for filtering or searching folder contents.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getRootFolders

> FolderContentIntegerArrayWrapper getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue)

Get filtered sectionsReturns all the sections matching the parameters specified in the request.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        Boolean withoutTrash = false; // Boolean | Specifies whether to return the Trash section or not.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 0; // Integer | The starting position of the items to be retrieved.
        String sortBy = "DateAndTime"; // String | Specifies the field by which the folder content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used as a filter for searching or retrieving folder contents.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## getTrashFolder

> FolderContentIntegerWrapper getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)

Get the Trash sectionReturns the detailed list of files and folders located in the Trash section.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        UUID userIdOrGroupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | The user or group ID.
        FilterType filterType = FilterType.fromValue("0"); // FilterType | The filter type.
        ApplyFilterOption applyFilterOption = ApplyFilterOption.fromValue("0"); // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
        Integer count = 25; // Integer | The maximum number of items to retrieve in the response.
        Integer startIndex = 0; // Integer | The starting position of the items to be retrieved.
        String sortBy = "DateAndTime"; // String | The property used to specify the sorting criteria for folder contents.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "My Document"; // String | The text used for filtering or searching folder contents.
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
| **403** | You don't have enough permission to view the folder content |  -  |
| **404** | The required folder was not found |  -  |
| **401** | Unauthorized |  -  |


## insertFile

> FileIntegerWrapper insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout)

Insert a fileInserts a file specified in the request to the selected folder by single file uploading.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID for inserting a file.
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
| **403** | You don't have enough permission to create |  -  |
| **404** | Folder not found |  -  |
| **401** | Unauthorized |  -  |


## insertFileToMyFromBody

> FileIntegerWrapper insertFileToMyFromBody(_file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout)

Insert a file to the My documents sectionInserts a file specified in the request to the My documents section by single file uploading.

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

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


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
| **403** | You don't have enough permission to create |  -  |
| **404** | Folder not found |  -  |
| **401** | Unauthorized |  -  |


## renameFolder

> FolderIntegerWrapper renameFolder(folderId, createFolder)

Rename a folderRenames the selected folder with a new title specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID for the folder creation.
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
| **403** | You don't have enough permission to rename the folder |  -  |
| **401** | Unauthorized |  -  |


## setFolderOrder

> FolderIntegerWrapper setFolderOrder(folderId, orderRequestDto)

Set folder orderSets the order of a folder with ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder unique identifier. | |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The folder order information. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder unique identifier.
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
| **401** | Unauthorized |  -  |


## setFolderPrimaryExternalLink

> FileShareWrapper setFolderPrimaryExternalLink(id, folderLinkRequest)

Set the folder external linkSets the folder external link with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer id = 1; // Integer | The folder ID.
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
| **401** | Unauthorized |  -  |


## uploadFile

> ObjectWrapper uploadFile(folderId, uploadRequestDto)

Upload a fileUploads a file specified in the request to the selected folder by single file uploading or standart multipart/form-data method.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to upload a file. | |
| **uploadRequestDto** | [**UploadRequestDto**](UploadRequestDto.md)| The request parameters for uploading a file. | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer folderId = 1; // Integer | The folder ID to upload a file.
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
| **403** | You don't have enough permission to create |  -  |
| **404** | Folder not found |  -  |
| **401** | Unauthorized |  -  |


## uploadFileToMy

> ObjectWrapper uploadFileToMy(inDto)

Upload a file to the My documents sectionUploads a file specified in the request to the My documents section by single file uploading or standart multipart/form-data method.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inDto** | [**UploadRequestDto**](.md)| The request parameters for uploading a file. | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2), [ApiKeyBearer](../README.md#ApiKeyBearer), [asc_auth_key](../README.md#asc_auth_key), [Bearer](../README.md#Bearer), [OpenId](../README.md#OpenId)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


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
| **403** | You don't have enough permission to create |  -  |
| **404** | File not found |  -  |
| **401** | Unauthorized |  -  |

