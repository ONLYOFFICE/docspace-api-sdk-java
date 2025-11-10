# onlyoffice.docspace.api.sdk.org.openapitools.client.api.SharingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyExternalSharePassword**](FilesSharingApi.md#applyExternalSharePassword) | **POST** /api/2.0/files/share/{key}/password |  |
| [**changeFileOwner**](FilesSharingApi.md#changeFileOwner) | **POST** /api/2.0/files/owner |  |
| [**getExternalShareData**](FilesSharingApi.md#getExternalShareData) | **GET** /api/2.0/files/share/{key} |  |
| [**getFileSecurityInfo**](FilesSharingApi.md#getFileSecurityInfo) | **GET** /api/2.0/files/file/{id}/share |  |
| [**getFolderSecurityInfo**](FilesSharingApi.md#getFolderSecurityInfo) | **GET** /api/2.0/files/folder/{id}/share |  |
| [**getGroupsMembersWithFileSecurity**](FilesSharingApi.md#getGroupsMembersWithFileSecurity) | **GET** /api/2.0/files/file/{fileId}/group/{groupId}/share |  |
| [**getGroupsMembersWithFolderSecurity**](FilesSharingApi.md#getGroupsMembersWithFolderSecurity) | **GET** /api/2.0/files/folder/{folderId}/group/{groupId}/share |  |
| [**getSecurityInfo**](FilesSharingApi.md#getSecurityInfo) | **POST** /api/2.0/files/share |  |
| [**getSharedUsers**](FilesSharingApi.md#getSharedUsers) | **GET** /api/2.0/files/file/{fileId}/sharedusers |  |
| [**removeSecurityInfo**](FilesSharingApi.md#removeSecurityInfo) | **DELETE** /api/2.0/files/share |  |
| [**sendEditorNotify**](FilesSharingApi.md#sendEditorNotify) | **POST** /api/2.0/files/file/{fileId}/sendeditornotify |  |
| [**setFileSecurityInfo**](FilesSharingApi.md#setFileSecurityInfo) | **PUT** /api/2.0/files/file/{fileId}/share |  |
| [**setFolderSecurityInfo**](FilesSharingApi.md#setFolderSecurityInfo) | **PUT** /api/2.0/files/folder/{folderId}/share |  |
| [**setSecurityInfo**](FilesSharingApi.md#setSecurityInfo) | **PUT** /api/2.0/files/share |  |



## applyExternalSharePassword

> ExternalShareWrapper applyExternalSharePassword(key, externalShareRequestParam)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**| The unique document identifier. | |
| **externalShareRequestParam** | [**ExternalShareRequestParam**](ExternalShareRequestParam.md)| The external data share request parameters. | |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        String key = "some text"; // String | The unique document identifier.
        ExternalShareRequestParam externalShareRequestParam = new ExternalShareRequestParam(); // ExternalShareRequestParam | The external data share request parameters.
        try {
            ExternalShareWrapper result = apiInstance.applyExternalSharePassword(key, externalShareRequestParam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#applyExternalSharePassword");
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
| **200** | External data |  -  |
| **429** | Too many requests |  -  |


## changeFileOwner

> FileEntryBaseArrayWrapper changeFileOwner(changeOwnerRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **changeOwnerRequestDto** | [**ChangeOwnerRequestDto**](ChangeOwnerRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        ChangeOwnerRequestDto changeOwnerRequestDto = new ChangeOwnerRequestDto(); // ChangeOwnerRequestDto | 
        try {
            FileEntryBaseArrayWrapper result = apiInstance.changeFileOwner(changeOwnerRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#changeFileOwner");
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
| **200** | File entry information |  -  |


## getExternalShareData

> ExternalShareWrapper getExternalShareData(key, fileId, folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**| The unique key of the external shared data. | |
| **fileId** | **String**| The unique document identifier. | [optional] |
| **folderId** | **String**| The unique folder identifier. | [optional] |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        String key = "some text"; // String | The unique key of the external shared data.
        String fileId = "9846"; // String | The unique document identifier.
        String folderId = "9846"; // String | The unique folder identifier.
        try {
            ExternalShareWrapper result = apiInstance.getExternalShareData(key, fileId, folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getExternalShareData");
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
| **200** | External data |  -  |


## getFileSecurityInfo

> FileShareArrayWrapper getFileSecurityInfo(id, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/).

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer id = 9846; // Integer | The file unique identifier.
        Integer count = 1234; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        try {
            FileShareArrayWrapper result = apiInstance.getFileSecurityInfo(id, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getFileSecurityInfo");
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
| **200** | List of shared file information |  -  |


## getFolderSecurityInfo

> FileShareArrayWrapper getFolderSecurityInfo(id, count, startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The folder unique identifier. | |
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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer id = 9846; // Integer | The folder unique identifier.
        Integer count = 1234; // Integer | The number of items to retrieve in the request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        try {
            FileShareArrayWrapper result = apiInstance.getFolderSecurityInfo(id, count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getFolderSecurityInfo");
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
| **200** | List of shared file information |  -  |


## getGroupsMembersWithFileSecurity

> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **groupId** | **UUID**| The group ID. | |
| **count** | **Integer**| The number of items to be retrieved in the current query. | [optional] |
| **startIndex** | **Integer**| The starting index for the query result set. | [optional] |
| **filterValue** | **String**| The filter value used for searching or querying group members based on text input. | [optional] |

### Return type

[**GroupMemberSecurityRequestArrayWrapper**](GroupMemberSecurityRequestArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        UUID groupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The group ID.
        Integer count = 1234; // Integer | The number of items to be retrieved in the current query.
        Integer startIndex = 1234; // Integer | The starting index for the query result set.
        String filterValue = "some text"; // String | The filter value used for searching or querying group members based on text input.
        try {
            GroupMemberSecurityRequestArrayWrapper result = apiInstance.getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getGroupsMembersWithFileSecurity");
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


## getGroupsMembersWithFolderSecurity

> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **groupId** | **UUID**| The group ID. | |
| **count** | **Integer**| The number of items to be retrieved in the current query. | [optional] |
| **startIndex** | **Integer**| The starting index for the query result set. | [optional] |
| **filterValue** | **String**| The filter value used for searching or querying group members based on text input. | [optional] |

### Return type

[**GroupMemberSecurityRequestArrayWrapper**](GroupMemberSecurityRequestArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID.
        UUID groupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The group ID.
        Integer count = 1234; // Integer | The number of items to be retrieved in the current query.
        Integer startIndex = 1234; // Integer | The starting index for the query result set.
        String filterValue = "some text"; // String | The filter value used for searching or querying group members based on text input.
        try {
            GroupMemberSecurityRequestArrayWrapper result = apiInstance.getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getGroupsMembersWithFolderSecurity");
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


## getSecurityInfo

> FileShareArrayWrapper getSecurityInfo(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            FileShareArrayWrapper result = apiInstance.getSecurityInfo(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getSecurityInfo");
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
| **200** | List of shared files and folders information |  -  |


## getSharedUsers

> MentionWrapperArrayWrapper getSharedUsers(fileId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/).

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer fileId = 9846; // Integer | The file unique identifier.
        try {
            MentionWrapperArrayWrapper result = apiInstance.getSharedUsers(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#getSharedUsers");
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
| **200** | List of users with their access rights to the file |  -  |


## removeSecurityInfo

> BooleanWrapper removeSecurityInfo(baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/).

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        BaseBatchRequestDto baseBatchRequestDto = new BaseBatchRequestDto(); // BaseBatchRequestDto | 
        try {
            BooleanWrapper result = apiInstance.removeSecurityInfo(baseBatchRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#removeSecurityInfo");
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


## sendEditorNotify

> AceShortWrapperArrayWrapper sendEditorNotify(fileId, mentionMessageWrapper)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID with the mention message. | |
| **mentionMessageWrapper** | [**MentionMessageWrapper**](MentionMessageWrapper.md)| The mention message. | [optional] |

### Return type

[**AceShortWrapperArrayWrapper**](AceShortWrapperArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID with the mention message.
        MentionMessageWrapper mentionMessageWrapper = new MentionMessageWrapper(); // MentionMessageWrapper | The mention message.
        try {
            AceShortWrapperArrayWrapper result = apiInstance.sendEditorNotify(fileId, mentionMessageWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#sendEditorNotify");
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
| **200** | List of access rights information |  -  |


## setFileSecurityInfo

> FileShareArrayWrapper setFileSecurityInfo(fileId, securityInfoSimpleRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **Integer**| The file ID. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer fileId = 9846; // Integer | The file ID.
        SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto = new SecurityInfoSimpleRequestDto(); // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.
        try {
            FileShareArrayWrapper result = apiInstance.setFileSecurityInfo(fileId, securityInfoSimpleRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#setFileSecurityInfo");
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
| **200** | List of shared file information: sharing rights, a user who has the access to the specified file, the file is locked by this user or not, this user is an owner of the specified file or not, this user can edit the access to the specified file or not |  -  |


## setFolderSecurityInfo

> FileShareArrayWrapper setFolderSecurityInfo(folderId, securityInfoSimpleRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**| The folder ID. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        Integer folderId = 9846; // Integer | The folder ID.
        SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto = new SecurityInfoSimpleRequestDto(); // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.
        try {
            FileShareArrayWrapper result = apiInstance.setFolderSecurityInfo(folderId, securityInfoSimpleRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#setFolderSecurityInfo");
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
| **200** | List of shared folder information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not |  -  |


## setSecurityInfo

> FileShareArrayWrapper setSecurityInfo(securityInfoRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securityInfoRequestDto** | [**SecurityInfoRequestDto**](SecurityInfoRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SharingApi apiInstance = new SharingApi(defaultClient);
        SecurityInfoRequestDto securityInfoRequestDto = new SecurityInfoRequestDto(); // SecurityInfoRequestDto | 
        try {
            FileShareArrayWrapper result = apiInstance.setSecurityInfo(securityInfoRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharingApi#setSecurityInfo");
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
| **200** | List of shared files and folders information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not |  -  |

