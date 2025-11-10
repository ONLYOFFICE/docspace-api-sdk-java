# onlyoffice.docspace.api.sdk.org.openapitools.client.api.FilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFileToRecent**](FilesFilesApi.md#addFileToRecent) | **POST** /api/2.0/files/file/{fileId}/recent |  |
| [**addTemplates**](FilesFilesApi.md#addTemplates) | **POST** /api/2.0/files/templates |  |
| [**changeVersionHistory**](FilesFilesApi.md#changeVersionHistory) | **PUT** /api/2.0/files/file/{fileId}/history |  |
| [**checkFillFormDraft**](FilesFilesApi.md#checkFillFormDraft) | **POST** /api/2.0/files/masterform/{fileId}/checkfillformdraft |  |
| [**copyFileAs**](FilesFilesApi.md#copyFileAs) | **POST** /api/2.0/files/file/{fileId}/copyas |  |
| [**createEditSession**](FilesFilesApi.md#createEditSession) | **POST** /api/2.0/files/file/{fileId}/edit_session |  |
| [**createFile**](FilesFilesApi.md#createFile) | **POST** /api/2.0/files/{folderId}/file |  |
| [**createFileInMyDocuments**](FilesFilesApi.md#createFileInMyDocuments) | **POST** /api/2.0/files/@my/file |  |
| [**createFilePrimaryExternalLink**](FilesFilesApi.md#createFilePrimaryExternalLink) | **POST** /api/2.0/files/file/{id}/link |  |
| [**createHtmlFile**](FilesFilesApi.md#createHtmlFile) | **POST** /api/2.0/files/{folderId}/html |  |
| [**createHtmlFileInMyDocuments**](FilesFilesApi.md#createHtmlFileInMyDocuments) | **POST** /api/2.0/files/@my/html |  |
| [**createTextFile**](FilesFilesApi.md#createTextFile) | **POST** /api/2.0/files/{folderId}/text |  |
| [**createTextFileInMyDocuments**](FilesFilesApi.md#createTextFileInMyDocuments) | **POST** /api/2.0/files/@my/text |  |
| [**createThumbnails**](FilesFilesApi.md#createThumbnails) | **POST** /api/2.0/files/thumbnails |  |
| [**deleteFile**](FilesFilesApi.md#deleteFile) | **DELETE** /api/2.0/files/file/{fileId} |  |
| [**deleteRecent**](FilesFilesApi.md#deleteRecent) | **DELETE** /api/2.0/files/recent |  |
| [**deleteTemplates**](FilesFilesApi.md#deleteTemplates) | **DELETE** /api/2.0/files/templates |  |
| [**getAllFormRoles**](FilesFilesApi.md#getAllFormRoles) | **GET** /api/2.0/files/file/{fileId}/formroles |  |
| [**getEditDiffUrl**](FilesFilesApi.md#getEditDiffUrl) | **GET** /api/2.0/files/file/{fileId}/edit/diff |  |
| [**getEditHistory**](FilesFilesApi.md#getEditHistory) | **GET** /api/2.0/files/file/{fileId}/edit/history |  |
| [**getFileHistory**](FilesFilesApi.md#getFileHistory) | **GET** /api/2.0/files/file/{fileId}/log |  |
| [**getFileInfo**](FilesFilesApi.md#getFileInfo) | **GET** /api/2.0/files/file/{fileId} |  |
| [**getFileLinks**](FilesFilesApi.md#getFileLinks) | **GET** /api/2.0/files/file/{id}/links |  |
| [**getFilePrimaryExternalLink**](FilesFilesApi.md#getFilePrimaryExternalLink) | **GET** /api/2.0/files/file/{id}/link |  |
| [**getFileVersionInfo**](FilesFilesApi.md#getFileVersionInfo) | **GET** /api/2.0/files/file/{fileId}/history |  |
| [**getFillResult**](FilesFilesApi.md#getFillResult) | **GET** /api/2.0/files/file/fillresult |  |
| [**getPresignedFileUri**](FilesFilesApi.md#getPresignedFileUri) | **GET** /api/2.0/files/file/{fileId}/presigned |  |
| [**getPresignedUri**](FilesFilesApi.md#getPresignedUri) | **GET** /api/2.0/files/file/{fileId}/presigneduri |  |
| [**getProtectedFileUsers**](FilesFilesApi.md#getProtectedFileUsers) | **GET** /api/2.0/files/file/{fileId}/protectusers |  |
| [**getReferenceData**](FilesFilesApi.md#getReferenceData) | **POST** /api/2.0/files/file/referencedata |  |
| [**isFormPDF**](FilesFilesApi.md#isFormPDF) | **GET** /api/2.0/files/file/{fileId}/isformpdf |  |
| [**lockFile**](FilesFilesApi.md#lockFile) | **PUT** /api/2.0/files/file/{fileId}/lock |  |
| [**manageFormFilling**](FilesFilesApi.md#manageFormFilling) | **PUT** /api/2.0/files/file/{fileId}/manageformfilling |  |
| [**openEditFile**](FilesFilesApi.md#openEditFile) | **GET** /api/2.0/files/file/{fileId}/openedit |  |
| [**restoreFileVersion**](FilesFilesApi.md#restoreFileVersion) | **GET** /api/2.0/files/file/{fileId}/restoreversion |  |
| [**saveEditingFileFromForm**](FilesFilesApi.md#saveEditingFileFromForm) | **PUT** /api/2.0/files/file/{fileId}/saveediting |  |
| [**saveFileAsPdf**](FilesFilesApi.md#saveFileAsPdf) | **POST** /api/2.0/files/file/{id}/saveaspdf |  |
| [**saveFormRoleMapping**](FilesFilesApi.md#saveFormRoleMapping) | **POST** /api/2.0/files/file/{fileId}/formrolemapping |  |
| [**setCustomFilterTag**](FilesFilesApi.md#setCustomFilterTag) | **PUT** /api/2.0/files/file/{fileId}/customfilter |  |
| [**setFileExternalLink**](FilesFilesApi.md#setFileExternalLink) | **PUT** /api/2.0/files/file/{id}/links |  |
| [**setFileOrder**](FilesFilesApi.md#setFileOrder) | **PUT** /api/2.0/files/{fileId}/order |  |
| [**setFilesOrder**](FilesFilesApi.md#setFilesOrder) | **PUT** /api/2.0/files/order |  |
| [**startEditFile**](FilesFilesApi.md#startEditFile) | **POST** /api/2.0/files/file/{fileId}/startedit |  |
| [**startFillingFile**](FilesFilesApi.md#startFillingFile) | **PUT** /api/2.0/files/file/{fileId}/startfilling |  |
| [**toggleFileFavorite**](FilesFilesApi.md#toggleFileFavorite) | **GET** /api/2.0/files/favorites/{fileId} |  |
| [**trackEditFile**](FilesFilesApi.md#trackEditFile) | **GET** /api/2.0/files/file/{fileId}/trackeditfile |  |
| [**updateFile**](FilesFilesApi.md#updateFile) | **PUT** /api/2.0/files/file/{fileId} |  |



## addFileToRecent

> FileIntegerWrapper addFileToRecent(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            FileIntegerWrapper result = apiInstance.addFileToRecent(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#addFileToRecent");
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
| **200** | New file information |  -  |


## addTemplates

> BooleanWrapper addTemplates(templatesRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templatesRequestDto** | [**TemplatesRequestDto**](TemplatesRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        TemplatesRequestDto templatesRequestDto = new TemplatesRequestDto(); // TemplatesRequestDto | 
        try {
            BooleanWrapper result = apiInstance.addTemplates(templatesRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#addTemplates");
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


## changeVersionHistory

> FileIntegerArrayWrapper changeVersionHistory(fileId, changeHistory)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file Id to change its version history. | |
| **changeHistory** | [**ChangeHistory**](ChangeHistory.md)| The parameters for changing version history. | |

### Return type

[**FileIntegerArrayWrapper**](FileIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file Id to change its version history.
        ChangeHistory changeHistory = new ChangeHistory(); // ChangeHistory | The parameters for changing version history.
        try {
            FileIntegerArrayWrapper result = apiInstance.changeVersionHistory(fileId, changeHistory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#changeVersionHistory");
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
| **200** | Updated information about file versions |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |


## checkFillFormDraft

> StringWrapper checkFillFormDraft(fileId, checkFillFormDraft)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-fill-form-draft/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID of the form draft. | |
| **checkFillFormDraft** | [**CheckFillFormDraft**](CheckFillFormDraft.md)| The parameters for checking the form draft filling. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID of the form draft.
        CheckFillFormDraft checkFillFormDraft = new CheckFillFormDraft(); // CheckFillFormDraft | The parameters for checking the form draft filling.
        try {
            StringWrapper result = apiInstance.checkFillFormDraft(fileId, checkFillFormDraft);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#checkFillFormDraft");
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
| **200** | Link to the form |  -  |
| **403** | You don&#39;t have enough permission to view the file |  -  |


## copyFileAs

> FileEntryBaseWrapper copyFileAs(fileId, copyAsJsonElement)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to copy. | |
| **copyAsJsonElement** | [**CopyAsJsonElement**](CopyAsJsonElement.md)| The parameters for copying a file. | |

### Return type

[**FileEntryBaseWrapper**](FileEntryBaseWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to copy.
        CopyAsJsonElement copyAsJsonElement = new CopyAsJsonElement(); // CopyAsJsonElement | The parameters for copying a file.
        try {
            FileEntryBaseWrapper result = apiInstance.copyFileAs(fileId, copyAsJsonElement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#copyFileAs");
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
| **200** | Copied file entry information |  -  |
| **400** | No file id or folder id toFolderId determine provider |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |
| **404** | File not found |  -  |


## createEditSession

> ObjectWrapper createEditSession(fileId, fileSize)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **fileSize** | **Long**| The file size in bytes. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        Long fileSize = 1234L; // Long | The file size in bytes.
        try {
            ObjectWrapper result = apiInstance.createEditSession(fileId, fileSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createEditSession");
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
| **200** | Information about created session |  -  |
| **403** | You don&#39;t have enough permission to edit the file |  -  |


## createFile

> FileIntegerWrapper createFile(folderId, createFileJsonElement)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID for the file creation. | |
| **createFileJsonElement** | [**CreateFileJsonElement**](CreateFileJsonElement.md)| The parameters for creating a file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID for the file creation.
        CreateFileJsonElement createFileJsonElement = new CreateFileJsonElement(); // CreateFileJsonElement | The parameters for creating a file.
        try {
            FileIntegerWrapper result = apiInstance.createFile(folderId, createFileJsonElement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createFile");
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
| **200** | New file information |  -  |


## createFileInMyDocuments

> FileIntegerWrapper createFileInMyDocuments(createFileJsonElement)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createFileJsonElement** | [**CreateFileJsonElement**](CreateFileJsonElement.md)|  | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        CreateFileJsonElement createFileJsonElement = new CreateFileJsonElement(); // CreateFileJsonElement | 
        try {
            FileIntegerWrapper result = apiInstance.createFileInMyDocuments(createFileJsonElement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createFileInMyDocuments");
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
| **200** | New file information |  -  |


## createFilePrimaryExternalLink

> FileShareWrapper createFilePrimaryExternalLink(id, fileLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The file ID. | |
| **fileLinkRequest** | [**FileLinkRequest**](FileLinkRequest.md)| The file external link parameters. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer id = 9846; // Integer | The file ID.
        FileLinkRequest fileLinkRequest = new FileLinkRequest(); // FileLinkRequest | The file external link parameters.
        try {
            FileShareWrapper result = apiInstance.createFilePrimaryExternalLink(id, fileLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createFilePrimaryExternalLink");
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
| **200** | File security information |  -  |
| **404** | Not Found |  -  |


## createHtmlFile

> FileIntegerWrapper createHtmlFile(folderId, createTextOrHtmlFile)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to create the text or HTML file. | |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)| The parameters for creating an HTML or text file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID to create the text or HTML file.
        CreateTextOrHtmlFile createTextOrHtmlFile = new CreateTextOrHtmlFile(); // CreateTextOrHtmlFile | The parameters for creating an HTML or text file.
        try {
            FileIntegerWrapper result = apiInstance.createHtmlFile(folderId, createTextOrHtmlFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createHtmlFile");
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
| **200** | New file information |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |


## createHtmlFileInMyDocuments

> FileIntegerWrapper createHtmlFileInMyDocuments(createTextOrHtmlFile)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)|  | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        CreateTextOrHtmlFile createTextOrHtmlFile = new CreateTextOrHtmlFile(); // CreateTextOrHtmlFile | 
        try {
            FileIntegerWrapper result = apiInstance.createHtmlFileInMyDocuments(createTextOrHtmlFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createHtmlFileInMyDocuments");
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
| **200** | New file information |  -  |
| **403** | You don&#39;t have enough permission to create |  -  |


## createTextFile

> FileIntegerWrapper createTextFile(folderId, createTextOrHtmlFile)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID to create the text or HTML file. | |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)| The parameters for creating an HTML or text file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID to create the text or HTML file.
        CreateTextOrHtmlFile createTextOrHtmlFile = new CreateTextOrHtmlFile(); // CreateTextOrHtmlFile | The parameters for creating an HTML or text file.
        try {
            FileIntegerWrapper result = apiInstance.createTextFile(folderId, createTextOrHtmlFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createTextFile");
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
| **200** | New file information |  -  |


## createTextFileInMyDocuments

> FileIntegerWrapper createTextFileInMyDocuments(createTextOrHtmlFile)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)|  | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        CreateTextOrHtmlFile createTextOrHtmlFile = new CreateTextOrHtmlFile(); // CreateTextOrHtmlFile | 
        try {
            FileIntegerWrapper result = apiInstance.createTextFileInMyDocuments(createTextOrHtmlFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createTextFileInMyDocuments");
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
| **200** | New file information |  -  |


## createThumbnails

> ObjectArrayWrapper createThumbnails(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            ObjectArrayWrapper result = apiInstance.createThumbnails(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createThumbnails");
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
| **200** | List of file IDs |  -  |


## deleteFile

> FileOperationArrayWrapper deleteFile(fileId, delete)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to delete. | |
| **delete** | [**Delete**](Delete.md)| The parameters for deleting a file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to delete.
        Delete delete = new Delete(); // Delete | The parameters for deleting a file.
        try {
            FileOperationArrayWrapper result = apiInstance.deleteFile(fileId, delete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#deleteFile");
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


## deleteRecent

> NoContentResultWrapper deleteRecent(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**NoContentResultWrapper**](NoContentResultWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            NoContentResultWrapper result = apiInstance.deleteRecent(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#deleteRecent");
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
| **200** | No content |  -  |


## deleteTemplates

> BooleanWrapper deleteTemplates(requestBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| The file IDs. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        List<Integer> requestBody = Arrays.asList(); // List<Integer> | The file IDs.
        try {
            BooleanWrapper result = apiInstance.deleteTemplates(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#deleteTemplates");
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


## getAllFormRoles

> FormRoleArrayWrapper getAllFormRoles(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

### Return type

[**FormRoleArrayWrapper**](FormRoleArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            FormRoleArrayWrapper result = apiInstance.getAllFormRoles(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getAllFormRoles");
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
| **200** | Successfully retrieved all roles for the form |  -  |
| **403** | You do not have enough permissions to view the form roles |  -  |


## getEditDiffUrl

> EditHistoryDataWrapper getEditDiffUrl(fileId, version)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **version** | **Integer**| The file version. | [optional] |

### Return type

[**EditHistoryDataWrapper**](EditHistoryDataWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        Integer version = 1234; // Integer | The file version.
        try {
            EditHistoryDataWrapper result = apiInstance.getEditDiffUrl(fileId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getEditDiffUrl");
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
| **200** | File version history data |  -  |


## getEditHistory

> EditHistoryArrayWrapper getEditHistory(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

### Return type

[**EditHistoryArrayWrapper**](EditHistoryArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            EditHistoryArrayWrapper result = apiInstance.getEditHistory(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getEditHistory");
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
| **200** | Version history data |  -  |


## getFileHistory

> HistoryArrayWrapper getFileHistory(fileId, fromDate, toDate, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID of the history request. | |
| **fromDate** | [**ApiDateTime**](.md)| The start date of the history. | [optional] |
| **toDate** | [**ApiDateTime**](.md)| The end date of the history. | [optional] |
| **count** | **Integer**| The number of history entries to retrieve for the file log. | [optional] |
| **startIndex** | **Integer**| The starting index for retrieving a subset of file history entries. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID of the history request.
        ApiDateTime fromDate = new ApiDateTime(); // ApiDateTime | The start date of the history.
        ApiDateTime toDate = new ApiDateTime(); // ApiDateTime | The end date of the history.
        Integer count = 1234; // Integer | The number of history entries to retrieve for the file log.
        Integer startIndex = 1234; // Integer | The starting index for retrieving a subset of file history entries.
        try {
            HistoryArrayWrapper result = apiInstance.getFileHistory(fileId, fromDate, toDate, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileHistory");
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
| **200** | List of actions performed on the file |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |
| **404** | The required file was not found |  -  |


## getFileInfo

> FileIntegerWrapper getFileInfo(fileId, version)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **version** | **Integer**| The file version. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        Integer version = 1234; // Integer | The file version.
        try {
            FileIntegerWrapper result = apiInstance.getFileInfo(fileId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileInfo");
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
| **200** | File information |  -  |


## getFileLinks

> FileShareArrayWrapper getFileLinks(id, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The file unique identifier. | |
| **count** | **Integer**| The number of items to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The starting index for the query results. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer id = 9846; // Integer | The file unique identifier.
        Integer count = 1234; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        try {
            FileShareArrayWrapper result = apiInstance.getFileLinks(id, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileLinks");
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
| **200** | File security information |  -  |


## getFilePrimaryExternalLink

> FileShareWrapper getFilePrimaryExternalLink(id, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The file unique identifier. | |
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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer id = 9846; // Integer | The file unique identifier.
        Integer count = 1234; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        try {
            FileShareWrapper result = apiInstance.getFilePrimaryExternalLink(id, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFilePrimaryExternalLink");
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
| **200** | File security information |  -  |
| **404** | Not Found |  -  |


## getFileVersionInfo

> FileIntegerArrayWrapper getFileVersionInfo(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

### Return type

[**FileIntegerArrayWrapper**](FileIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            FileIntegerArrayWrapper result = apiInstance.getFileVersionInfo(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileVersionInfo");
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
| **200** | Information about file versions: folder ID, version, version group, content length, pure content length, file status, URL to view a file, web URL, file type, file extension, comment, encrypted or not, thumbnail URL, thumbnail status, locked or not, user ID who locked a file, denies file downloading or not, denies file sharing or not, file accessibility |  -  |


## getFillResult

> FillingFormResultIntegerWrapper getFillResult(fillingSessionId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fillingSessionId** | **String**| The form-filling session ID. | [optional] |

### Return type

[**FillingFormResultIntegerWrapper**](FillingFormResultIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fillingSessionId = "some text"; // String | The form-filling session ID.
        try {
            FillingFormResultIntegerWrapper result = apiInstance.getFillResult(fillingSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFillResult");
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


## getPresignedFileUri

> FileLinkWrapper getPresignedFileUri(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

### Return type

[**FileLinkWrapper**](FileLinkWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            FileLinkWrapper result = apiInstance.getPresignedFileUri(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getPresignedFileUri");
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
| **200** | File download link |  -  |


## getPresignedUri

> StringWrapper getPresignedUri(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            StringWrapper result = apiInstance.getPresignedUri(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getPresignedUri");
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
| **200** | File download link |  -  |


## getProtectedFileUsers

> MentionWrapperArrayWrapper getProtectedFileUsers(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

### Return type

[**MentionWrapperArrayWrapper**](MentionWrapperArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            MentionWrapperArrayWrapper result = apiInstance.getProtectedFileUsers(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getProtectedFileUsers");
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
| **200** | List of users with their access rights to the protected file |  -  |


## getReferenceData

> FileReferenceWrapper getReferenceData(getReferenceDataDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getReferenceDataDtoInteger** | [**GetReferenceDataDtoInteger**](GetReferenceDataDtoInteger.md)|  | [optional] |

### Return type

[**FileReferenceWrapper**](FileReferenceWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        GetReferenceDataDtoInteger getReferenceDataDtoInteger = new GetReferenceDataDtoInteger(); // GetReferenceDataDtoInteger | 
        try {
            FileReferenceWrapper result = apiInstance.getReferenceData(getReferenceDataDtoInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getReferenceData");
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
| **200** | File reference data |  -  |


## isFormPDF

> BooleanWrapper isFormPDF(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            BooleanWrapper result = apiInstance.isFormPDF(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#isFormPDF");
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
| **200** | Boolean value: true - the PDF file is form, false - the PDF file is not a form |  -  |


## lockFile

> FileIntegerWrapper lockFile(fileId, lockFileParameters)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID for locking. | |
| **lockFileParameters** | [**LockFileParameters**](LockFileParameters.md)| The parameters for locking a file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID for locking.
        LockFileParameters lockFileParameters = new LockFileParameters(); // LockFileParameters | The parameters for locking a file.
        try {
            FileIntegerWrapper result = apiInstance.lockFile(fileId, lockFileParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#lockFile");
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
| **200** | Locked file information |  -  |


## manageFormFilling

> manageFormFilling(fileId, manageFormFillingDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **String**|  | |
| **manageFormFillingDtoInteger** | [**ManageFormFillingDtoInteger**](ManageFormFillingDtoInteger.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | 
        ManageFormFillingDtoInteger manageFormFillingDtoInteger = new ManageFormFillingDtoInteger(); // ManageFormFillingDtoInteger | 
        try {
            apiInstance.manageFormFilling(fileId, manageFormFillingDtoInteger);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#manageFormFilling");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed the form filling action |  -  |
| **403** | You do not have enough permissions to perform this action |  -  |


## openEditFile

> ConfigurationIntegerWrapper openEditFile(fileId, version, view, editorType, edit, fill)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/open-edit-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to open. | |
| **version** | **Integer**| The file version to open. | [optional] |
| **view** | **Boolean**| Specifies if the document will be opened for viewing only or not. | [optional] |
| **editorType** | [**EditorType**](.md)| The editor type to open the file. | [optional] [enum: 0, 1, 2] |
| **edit** | **Boolean**| Specifies if the document is opened in the editing mode or not. | [optional] |
| **fill** | **Boolean**| Specifies if the document is opened in the form-filling mode or not. | [optional] |

### Return type

[**ConfigurationIntegerWrapper**](ConfigurationIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to open.
        Integer version = 1234; // Integer | The file version to open.
        Boolean view = true; // Boolean | Specifies if the document will be opened for viewing only or not.
        EditorType editorType = EditorType.fromValue("0"); // EditorType | The editor type to open the file.
        Boolean edit = true; // Boolean | Specifies if the document is opened in the editing mode or not.
        Boolean fill = true; // Boolean | Specifies if the document is opened in the form-filling mode or not.
        try {
            ConfigurationIntegerWrapper result = apiInstance.openEditFile(fileId, version, view, editorType, edit, fill);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#openEditFile");
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
| **200** | Configuration parameters |  -  |
| **403** | You don&#39;t have enough permission to view the file |  -  |


## restoreFileVersion

> EditHistoryArrayWrapper restoreFileVersion(fileId, version, url)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-file-version/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID of the restore version. | |
| **version** | **Integer**| The file version of the restore. | [optional] |
| **url** | **String**| The file version URL of the restore. | [optional] |

### Return type

[**EditHistoryArrayWrapper**](EditHistoryArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID of the restore version.
        Integer version = 1234; // Integer | The file version of the restore.
        String url = "some text"; // String | The file version URL of the restore.
        try {
            EditHistoryArrayWrapper result = apiInstance.restoreFileVersion(fileId, version, url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#restoreFileVersion");
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
| **200** | Version history data: file ID, key, file version, version group, a user who updated a file, creation time, history changes in the string format, list of history changes, server version |  -  |
| **400** | No file id or folder id toFolderId determine provider |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |


## saveEditingFileFromForm

> FileIntegerWrapper saveEditingFileFromForm(fileId, fileExtension, downloadUri, _file, forcesave)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The editing file ID from the request. | |
| **fileExtension** | **String**| The editing file extension from the request. | [optional] |
| **downloadUri** | **String**| The URI to download the editing file. | [optional] |
| **_file** | **File**| The request file stream. | [optional] |
| **forcesave** | **Boolean**| Specifies whether to force save the file or not. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The editing file ID from the request.
        String fileExtension = "fileExtension_example"; // String | The editing file extension from the request.
        String downloadUri = "downloadUri_example"; // String | The URI to download the editing file.
        File _file = new File("/path/to/file"); // File | The request file stream.
        Boolean forcesave = true; // Boolean | Specifies whether to force save the file or not.
        try {
            FileIntegerWrapper result = apiInstance.saveEditingFileFromForm(fileId, fileExtension, downloadUri, _file, forcesave);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#saveEditingFileFromForm");
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
| **200** | Saved file parameters |  -  |
| **400** | No file id or folder id toFolderId determine provider |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |


## saveFileAsPdf

> FileIntegerWrapper saveFileAsPdf(id, saveAsPdfInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The file ID to save as PDF. | |
| **saveAsPdfInteger** | [**SaveAsPdfInteger**](SaveAsPdfInteger.md)| The parameters for saving the file as PDF. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer id = 9846; // Integer | The file ID to save as PDF.
        SaveAsPdfInteger saveAsPdfInteger = new SaveAsPdfInteger(); // SaveAsPdfInteger | The parameters for saving the file as PDF.
        try {
            FileIntegerWrapper result = apiInstance.saveFileAsPdf(id, saveAsPdfInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#saveFileAsPdf");
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
| **200** | New file information |  -  |
| **404** | File not found |  -  |


## saveFormRoleMapping

> saveFormRoleMapping(fileId, saveFormRoleMappingDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **String**|  | |
| **saveFormRoleMappingDtoInteger** | [**SaveFormRoleMappingDtoInteger**](SaveFormRoleMappingDtoInteger.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | 
        SaveFormRoleMappingDtoInteger saveFormRoleMappingDtoInteger = new SaveFormRoleMappingDtoInteger(); // SaveFormRoleMappingDtoInteger | 
        try {
            apiInstance.saveFormRoleMapping(fileId, saveFormRoleMappingDtoInteger);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#saveFormRoleMapping");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated information about form role mappings |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |


## setCustomFilterTag

> FileIntegerWrapper setCustomFilterTag(fileId, customFilterParameters)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **customFilterParameters** | [**CustomFilterParameters**](CustomFilterParameters.md)| The parameters for setting the Custom Filter editing mode. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        CustomFilterParameters customFilterParameters = new CustomFilterParameters(); // CustomFilterParameters | The parameters for setting the Custom Filter editing mode.
        try {
            FileIntegerWrapper result = apiInstance.setCustomFilterTag(fileId, customFilterParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#setCustomFilterTag");
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
| **200** | File information |  -  |


## setFileExternalLink

> FileShareWrapper setFileExternalLink(id, fileLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The file ID. | |
| **fileLinkRequest** | [**FileLinkRequest**](FileLinkRequest.md)| The file external link parameters. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer id = 9846; // Integer | The file ID.
        FileLinkRequest fileLinkRequest = new FileLinkRequest(); // FileLinkRequest | The file external link parameters.
        try {
            FileShareWrapper result = apiInstance.setFileExternalLink(id, fileLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#setFileExternalLink");
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
| **200** | File security information |  -  |


## setFileOrder

> FileIntegerWrapper setFileOrder(fileId, orderRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file unique identifier. | |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The file order information. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        OrderRequestDto orderRequestDto = new OrderRequestDto(); // OrderRequestDto | The file order information.
        try {
            FileIntegerWrapper result = apiInstance.setFileOrder(fileId, orderRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#setFileOrder");
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
| **200** | Updated file information |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |
| **404** | Not Found |  -  |


## setFilesOrder

> FileEntryIntegerArrayWrapper setFilesOrder(ordersRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ordersRequestDtoInteger** | [**OrdersRequestDtoInteger**](OrdersRequestDtoInteger.md)|  | [optional] |

### Return type

[**FileEntryIntegerArrayWrapper**](FileEntryIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        OrdersRequestDtoInteger ordersRequestDtoInteger = new OrdersRequestDtoInteger(); // OrdersRequestDtoInteger | 
        try {
            FileEntryIntegerArrayWrapper result = apiInstance.setFilesOrder(ordersRequestDtoInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#setFilesOrder");
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
| **200** | Updated file entries information |  -  |


## startEditFile

> StringWrapper startEditFile(fileId, startEdit)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-edit-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to start editing. | |
| **startEdit** | [**StartEdit**](StartEdit.md)| The file parameters to start editing. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to start editing.
        StartEdit startEdit = new StartEdit(); // StartEdit | The file parameters to start editing.
        try {
            StringWrapper result = apiInstance.startEditFile(fileId, startEdit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#startEditFile");
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
| **200** | File key for Document Service |  -  |
| **403** | You don&#39;t have enough permission to view the file |  -  |


## startFillingFile

> FileIntegerWrapper startFillingFile(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to start filling. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to start filling.
        try {
            FileIntegerWrapper result = apiInstance.startFillingFile(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#startFillingFile");
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
| **200** | File information |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |


## toggleFileFavorite

> BooleanWrapper toggleFileFavorite(fileId, favorite)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **favorite** | **Boolean**| Specifies if the file is marked as favorite or not. | [optional] |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        Boolean favorite = true; // Boolean | Specifies if the file is marked as favorite or not.
        try {
            BooleanWrapper result = apiInstance.toggleFileFavorite(fileId, favorite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#toggleFileFavorite");
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
| **200** | Boolean value: true - the file is favorite, false - the file is not favorite |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## trackEditFile

> KeyValuePairBooleanStringWrapper trackEditFile(fileId, tabId, docKeyForTrack, isFinish)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/track-edit-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to track editing changes. | |
| **tabId** | **UUID**| The tab ID to track editing changes. | [optional] |
| **docKeyForTrack** | **String**| The document key for tracking changes. | [optional] |
| **isFinish** | **Boolean**| Specifies whether to finish file tracking or not. | [optional] |

### Return type

[**KeyValuePairBooleanStringWrapper**](KeyValuePairBooleanStringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to track editing changes.
        UUID tabId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The tab ID to track editing changes.
        String docKeyForTrack = "some text"; // String | The document key for tracking changes.
        Boolean isFinish = true; // Boolean | Specifies whether to finish file tracking or not.
        try {
            KeyValuePairBooleanStringWrapper result = apiInstance.trackEditFile(fileId, tabId, docKeyForTrack, isFinish);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#trackEditFile");
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
| **200** | File changes |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## updateFile

> FileIntegerWrapper updateFile(fileId, updateFile)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID to update. | |
| **updateFile** | [**UpdateFile**](UpdateFile.md)| The parameters for updating a file. | |

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
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        FilesApi apiInstance = new FilesApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID to update.
        UpdateFile updateFile = new UpdateFile(); // UpdateFile | The parameters for updating a file.
        try {
            FileIntegerWrapper result = apiInstance.updateFile(fileId, updateFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#updateFile");
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
| **200** | Updated file information |  -  |
| **403** | You do not have enough permissions to edit the file |  -  |

