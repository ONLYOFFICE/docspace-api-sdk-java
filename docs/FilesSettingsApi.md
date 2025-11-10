# onlyoffice.docspace.api.sdk.org.openapitools.client.api.SettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeAccessToThirdparty**](FilesSettingsApi.md#changeAccessToThirdparty) | **PUT** /api/2.0/files/thirdparty |  |
| [**changeAutomaticallyCleanUp**](FilesSettingsApi.md#changeAutomaticallyCleanUp) | **PUT** /api/2.0/files/settings/autocleanup |  |
| [**changeDefaultAccessRights**](FilesSettingsApi.md#changeDefaultAccessRights) | **PUT** /api/2.0/files/settings/dafaultaccessrights |  |
| [**changeDeleteConfirm**](FilesSettingsApi.md#changeDeleteConfirm) | **PUT** /api/2.0/files/changedeleteconfrim |  |
| [**changeDownloadZipFromBody**](FilesSettingsApi.md#changeDownloadZipFromBody) | **PUT** /api/2.0/files/settings/downloadtargz |  |
| [**checkDocServiceUrl**](FilesSettingsApi.md#checkDocServiceUrl) | **PUT** /api/2.0/files/docservice |  |
| [**displayFileExtension**](FilesSettingsApi.md#displayFileExtension) | **PUT** /api/2.0/files/displayfileextension |  |
| [**displayRecent**](FilesSettingsApi.md#displayRecent) | **PUT** /api/2.0/files/displayrecent |  |
| [**externalShare**](FilesSettingsApi.md#externalShare) | **PUT** /api/2.0/files/settings/external |  |
| [**externalShareSocialMedia**](FilesSettingsApi.md#externalShareSocialMedia) | **PUT** /api/2.0/files/settings/externalsocialmedia |  |
| [**forcesave**](FilesSettingsApi.md#forcesave) | **PUT** /api/2.0/files/forcesave |  |
| [**getAutomaticallyCleanUp**](FilesSettingsApi.md#getAutomaticallyCleanUp) | **GET** /api/2.0/files/settings/autocleanup |  |
| [**getDocServiceUrl**](FilesSettingsApi.md#getDocServiceUrl) | **GET** /api/2.0/files/docservice |  |
| [**getFilesModule**](FilesSettingsApi.md#getFilesModule) | **GET** /api/2.0/files/info |  |
| [**getFilesSettings**](FilesSettingsApi.md#getFilesSettings) | **GET** /api/2.0/files/settings |  |
| [**hideConfirmCancelOperation**](FilesSettingsApi.md#hideConfirmCancelOperation) | **PUT** /api/2.0/files/hideconfirmcanceloperation |  |
| [**hideConfirmConvert**](FilesSettingsApi.md#hideConfirmConvert) | **PUT** /api/2.0/files/hideconfirmconvert |  |
| [**hideConfirmRoomLifetime**](FilesSettingsApi.md#hideConfirmRoomLifetime) | **PUT** /api/2.0/files/hideconfirmroomlifetime |  |
| [**isAvailablePrivacyRoomSettings**](FilesSettingsApi.md#isAvailablePrivacyRoomSettings) | **GET** /api/2.0/files/@privacy/available |  |
| [**keepNewFileName**](FilesSettingsApi.md#keepNewFileName) | **PUT** /api/2.0/files/keepnewfilename |  |
| [**setOpenEditorInSameTab**](FilesSettingsApi.md#setOpenEditorInSameTab) | **PUT** /api/2.0/files/settings/openeditorinsametab |  |
| [**storeForcesave**](FilesSettingsApi.md#storeForcesave) | **PUT** /api/2.0/files/storeforcesave |  |
| [**storeOriginal**](FilesSettingsApi.md#storeOriginal) | **PUT** /api/2.0/files/storeoriginal |  |
| [**updateFileIfExist**](FilesSettingsApi.md#updateFileIfExist) | **PUT** /api/2.0/files/updateifexist |  |



## changeAccessToThirdparty

> BooleanWrapper changeAccessToThirdparty(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.changeAccessToThirdparty(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#changeAccessToThirdparty");
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


## changeAutomaticallyCleanUp

> AutoCleanUpDataWrapper changeAutomaticallyCleanUp(autoCleanupRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoCleanupRequestDto** | [**AutoCleanupRequestDto**](AutoCleanupRequestDto.md)|  | [optional] |

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        AutoCleanupRequestDto autoCleanupRequestDto = new AutoCleanupRequestDto(); // AutoCleanupRequestDto | 
        try {
            AutoCleanUpDataWrapper result = apiInstance.changeAutomaticallyCleanUp(autoCleanupRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#changeAutomaticallyCleanUp");
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
| **200** | The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed |  -  |


## changeDefaultAccessRights

> FileShareArrayWrapper changeDefaultAccessRights(requestBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        List<Integer> requestBody = Arrays.asList(); // List<Integer> | Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator).
        try {
            FileShareArrayWrapper result = apiInstance.changeDefaultAccessRights(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#changeDefaultAccessRights");
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
| **200** | Updated sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator) |  -  |


## changeDeleteConfirm

> BooleanWrapper changeDeleteConfirm(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.changeDeleteConfirm(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#changeDeleteConfirm");
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


## changeDownloadZipFromBody

> ICompressWrapper changeDownloadZipFromBody(displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip-from-body/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

### Return type

[**ICompressWrapper**](ICompressWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        DisplayRequestDto displayRequestDto = new DisplayRequestDto(); // DisplayRequestDto | 
        try {
            ICompressWrapper result = apiInstance.changeDownloadZipFromBody(displayRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#changeDownloadZipFromBody");
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
| **200** | Archive |  -  |


## checkDocServiceUrl

> DocServiceUrlWrapper checkDocServiceUrl(checkDocServiceUrlRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **checkDocServiceUrlRequestDto** | [**CheckDocServiceUrlRequestDto**](CheckDocServiceUrlRequestDto.md)|  | [optional] |

### Return type

[**DocServiceUrlWrapper**](DocServiceUrlWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto = new CheckDocServiceUrlRequestDto(); // CheckDocServiceUrlRequestDto | 
        try {
            DocServiceUrlWrapper result = apiInstance.checkDocServiceUrl(checkDocServiceUrlRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#checkDocServiceUrl");
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
| **200** | Document service information: the Document Server address, the Document Server address in the local private network, the Community Server address |  -  |
| **400** | Invalid input urls/Mixed Active Content is not allowed. HTTPS address for Document Server is required |  -  |


## displayFileExtension

> BooleanWrapper displayFileExtension(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.displayFileExtension(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#displayFileExtension");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## displayRecent

> BooleanWrapper displayRecent(displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        DisplayRequestDto displayRequestDto = new DisplayRequestDto(); // DisplayRequestDto | 
        try {
            BooleanWrapper result = apiInstance.displayRecent(displayRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#displayRecent");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## externalShare

> BooleanWrapper externalShare(displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        DisplayRequestDto displayRequestDto = new DisplayRequestDto(); // DisplayRequestDto | 
        try {
            BooleanWrapper result = apiInstance.externalShare(displayRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#externalShare");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## externalShareSocialMedia

> BooleanWrapper externalShareSocialMedia(displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        DisplayRequestDto displayRequestDto = new DisplayRequestDto(); // DisplayRequestDto | 
        try {
            BooleanWrapper result = apiInstance.externalShareSocialMedia(displayRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#externalShareSocialMedia");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## forcesave

> BooleanWrapper forcesave()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/).

### Parameters

This endpoint does not need any parameter.

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            BooleanWrapper result = apiInstance.forcesave();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#forcesave");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## getAutomaticallyCleanUp

> AutoCleanUpDataWrapper getAutomaticallyCleanUp()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            AutoCleanUpDataWrapper result = apiInstance.getAutomaticallyCleanUp();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getAutomaticallyCleanUp");
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
| **200** | The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed |  -  |


## getDocServiceUrl

> DocServiceUrlWrapper getDocServiceUrl(version)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **Boolean**| Specifies whether to return the editor version or not. | [optional] |

### Return type

[**DocServiceUrlWrapper**](DocServiceUrlWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        Boolean version = true; // Boolean | Specifies whether to return the editor version or not.
        try {
            DocServiceUrlWrapper result = apiInstance.getDocServiceUrl(version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getDocServiceUrl");
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
| **200** | The document service URL with the editor version specified |  -  |


## getFilesModule

> ModuleWrapper getFilesModule()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**ModuleWrapper**](ModuleWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            ModuleWrapper result = apiInstance.getFilesModule();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getFilesModule");
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
| **200** | Module information: ID, product class name, title, description, icon URL, large icon URL, start URL, primary or nor, help URL |  -  |


## getFilesSettings

> FilesSettingsWrapper getFilesSettings()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**FilesSettingsWrapper**](FilesSettingsWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            FilesSettingsWrapper result = apiInstance.getFilesSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getFilesSettings");
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
| **200** | File settings |  -  |


## hideConfirmCancelOperation

> BooleanWrapper hideConfirmCancelOperation(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.hideConfirmCancelOperation(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#hideConfirmCancelOperation");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## hideConfirmConvert

> ModuleWrapper hideConfirmConvert(hideConfirmConvertRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hideConfirmConvertRequestDto** | [**HideConfirmConvertRequestDto**](HideConfirmConvertRequestDto.md)|  | [optional] |

### Return type

[**ModuleWrapper**](ModuleWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        HideConfirmConvertRequestDto hideConfirmConvertRequestDto = new HideConfirmConvertRequestDto(); // HideConfirmConvertRequestDto | 
        try {
            ModuleWrapper result = apiInstance.hideConfirmConvert(hideConfirmConvertRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#hideConfirmConvert");
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


## hideConfirmRoomLifetime

> BooleanWrapper hideConfirmRoomLifetime(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.hideConfirmRoomLifetime(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#hideConfirmRoomLifetime");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## isAvailablePrivacyRoomSettings

> BooleanWrapper isAvailablePrivacyRoomSettings()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/is-available-privacy-room-settings/).

### Parameters

This endpoint does not need any parameter.

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            BooleanWrapper result = apiInstance.isAvailablePrivacyRoomSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#isAvailablePrivacyRoomSettings");
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
| **200** | Boolean value: true if the Private Room settings are available |  -  |


## keepNewFileName

> BooleanWrapper keepNewFileName(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.keepNewFileName(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#keepNewFileName");
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


## setOpenEditorInSameTab

> BooleanWrapper setOpenEditorInSameTab(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.setOpenEditorInSameTab(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#setOpenEditorInSameTab");
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
| **200** | Boolean value: true if the parameter is enabled |  -  |


## storeForcesave

> BooleanWrapper storeForcesave()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/).

### Parameters

This endpoint does not need any parameter.

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            BooleanWrapper result = apiInstance.storeForcesave();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#storeForcesave");
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
| **200** | Boolean value: true if the operation is successful |  -  |


## storeOriginal

> BooleanWrapper storeOriginal(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.storeOriginal(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#storeOriginal");
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


## updateFileIfExist

> BooleanWrapper updateFileIfExist(settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
import org.openapitools.client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingsRequestDto settingsRequestDto = new SettingsRequestDto(); // SettingsRequestDto | 
        try {
            BooleanWrapper result = apiInstance.updateFileIfExist(settingsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#updateFileIfExist");
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

