# onlyoffice.docspace.api.sdk.org.openapitools.client.api.ThirdPartyIntegrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteThirdParty**](FilesThirdPartyIntegrationApi.md#deleteThirdParty) | **DELETE** /api/2.0/files/thirdparty/{providerId} |  |
| [**getAllProviders**](FilesThirdPartyIntegrationApi.md#getAllProviders) | **GET** /api/2.0/files/thirdparty/providers |  |
| [**getBackupThirdPartyAccount**](FilesThirdPartyIntegrationApi.md#getBackupThirdPartyAccount) | **GET** /api/2.0/files/thirdparty/backup |  |
| [**getCapabilities**](FilesThirdPartyIntegrationApi.md#getCapabilities) | **GET** /api/2.0/files/thirdparty/capabilities |  |
| [**getCommonThirdPartyFolders**](FilesThirdPartyIntegrationApi.md#getCommonThirdPartyFolders) | **GET** /api/2.0/files/thirdparty/common |  |
| [**getThirdPartyAccounts**](FilesThirdPartyIntegrationApi.md#getThirdPartyAccounts) | **GET** /api/2.0/files/thirdparty |  |
| [**saveThirdParty**](FilesThirdPartyIntegrationApi.md#saveThirdParty) | **POST** /api/2.0/files/thirdparty |  |
| [**saveThirdPartyBackup**](FilesThirdPartyIntegrationApi.md#saveThirdPartyBackup) | **POST** /api/2.0/files/thirdparty/backup |  |



## deleteThirdParty

> StringWrapper deleteThirdParty(providerId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerId** | **Integer**| The provider ID. | |

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
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        Integer providerId = 1234; // Integer | The provider ID.
        try {
            StringWrapper result = apiInstance.deleteThirdParty(providerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#deleteThirdParty");
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
| **200** | Third-party folder ID |  -  |


## getAllProviders

> ProviderArrayWrapper getAllProviders()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**ProviderArrayWrapper**](ProviderArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        try {
            ProviderArrayWrapper result = apiInstance.getAllProviders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#getAllProviders");
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
| **200** | List of provider |  -  |


## getBackupThirdPartyAccount

> FolderStringWrapper getBackupThirdPartyAccount()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        try {
            FolderStringWrapper result = apiInstance.getBackupThirdPartyAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#getBackupThirdPartyAccount");
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
| **200** | Folder for the third-party account backup |  -  |


## getCapabilities

> ArrayArrayWrapper getCapabilities()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**ArrayArrayWrapper**](ArrayArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        try {
            ArrayArrayWrapper result = apiInstance.getCapabilities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#getCapabilities");
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
| **200** | List of provider keys |  -  |


## getCommonThirdPartyFolders

> FolderStringArrayWrapper getCommonThirdPartyFolders()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**FolderStringArrayWrapper**](FolderStringArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        try {
            FolderStringArrayWrapper result = apiInstance.getCommonThirdPartyFolders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#getCommonThirdPartyFolders");
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
| **200** | List of common third-party folderst |  -  |


## getThirdPartyAccounts

> ThirdPartyParamsArrayWrapper getThirdPartyAccounts()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**ThirdPartyParamsArrayWrapper**](ThirdPartyParamsArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        try {
            ThirdPartyParamsArrayWrapper result = apiInstance.getThirdPartyAccounts();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#getThirdPartyAccounts");
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
| **200** | List of connected providers information |  -  |


## saveThirdParty

> FolderStringWrapper saveThirdParty(thirdPartyRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thirdPartyRequestDto** | [**ThirdPartyRequestDto**](ThirdPartyRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        ThirdPartyRequestDto thirdPartyRequestDto = new ThirdPartyRequestDto(); // ThirdPartyRequestDto | 
        try {
            FolderStringWrapper result = apiInstance.saveThirdParty(thirdPartyRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#saveThirdParty");
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
| **200** | Connected provider folder |  -  |


## saveThirdPartyBackup

> FolderStringWrapper saveThirdPartyBackup(thirdPartyBackupRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **thirdPartyBackupRequestDto** | [**ThirdPartyBackupRequestDto**](ThirdPartyBackupRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThirdPartyIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ThirdPartyIntegrationApi apiInstance = new ThirdPartyIntegrationApi(defaultClient);
        ThirdPartyBackupRequestDto thirdPartyBackupRequestDto = new ThirdPartyBackupRequestDto(); // ThirdPartyBackupRequestDto | 
        try {
            FolderStringWrapper result = apiInstance.saveThirdPartyBackup(thirdPartyBackupRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThirdPartyIntegrationApi#saveThirdPartyBackup");
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
| **200** | Folder for the third-party account backup |  -  |

