# docspace-api-sdk.org.openapitools.client.api.AttachmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiAttachmentsDelete**](AiAttachmentsApi.md#aiAttachmentsDelete) | **DELETE** /api/2.0/ai/attachments/delete | Delete |
| [**aiAttachmentsDeleteMany**](AiAttachmentsApi.md#aiAttachmentsDeleteMany) | **DELETE** /api/2.0/ai/attachments/delete-many | Delete many |
| [**aiAttachmentsGet**](AiAttachmentsApi.md#aiAttachmentsGet) | **POST** /api/2.0/ai/attachments/get | Get |
| [**aiAttachmentsGetMany**](AiAttachmentsApi.md#aiAttachmentsGetMany) | **POST** /api/2.0/ai/attachments/get-many | Get many |
| [**aiAttachmentsLinkToMessage**](AiAttachmentsApi.md#aiAttachmentsLinkToMessage) | **POST** /api/2.0/ai/attachments/link-to-message | Link to message |
| [**aiAttachmentsSaveFile**](AiAttachmentsApi.md#aiAttachmentsSaveFile) | **POST** /api/2.0/ai/attachments/save-file | Save file |
| [**aiAttachmentsSaveFilesMany**](AiAttachmentsApi.md#aiAttachmentsSaveFilesMany) | **POST** /api/2.0/ai/attachments/save-files-many | Save files many |



## aiAttachmentsDelete

> AiSuccessResponse aiAttachmentsDelete(body)

DeletePermanently deletes one attachment, whether it is still a draft or already linked to a message.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/).

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
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiAttachmentsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsDelete");
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


## aiAttachmentsDeleteMany

> AiSuccessResponse aiAttachmentsDeleteMany(requestBody)

Delete manyPermanently deletes a batch of attachments in a single round trip.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            AiSuccessResponse result = apiInstance.aiAttachmentsDeleteMany(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsDeleteMany");
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


## aiAttachmentsGet

> AiAttachment aiAttachmentsGet(body)

GetReturns one attachment by identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

[**AiAttachment**](AiAttachment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiAttachment result = apiInstance.aiAttachmentsGet(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsGet");
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


## aiAttachmentsGetMany

> List&lt;AiAttachment&gt; aiAttachmentsGetMany(requestBody)

Get manyReturns a batch of attachments, preserving the requested order; an identifier that no longer exists comes back empty.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**List&lt;AiAttachment&gt;**](AiAttachment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            List<AiAttachment> result = apiInstance.aiAttachmentsGetMany(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsGetMany");
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


## aiAttachmentsLinkToMessage

> AiSuccessResponse aiAttachmentsLinkToMessage(aiAttachmentsLinkToMessageRequest)

Link to messageBinds draft attachments to the chat message that owns them, once that message has been persisted, so deleting the message removes them too. Identifiers that no longer exist are skipped.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAttachmentsLinkToMessageRequest** | [**AiAttachmentsLinkToMessageRequest**](AiAttachmentsLinkToMessageRequest.md)|  | |

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
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest = new AiAttachmentsLinkToMessageRequest(); // AiAttachmentsLinkToMessageRequest | 
        try {
            AiSuccessResponse result = apiInstance.aiAttachmentsLinkToMessage(aiAttachmentsLinkToMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsLinkToMessage");
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


## aiAttachmentsSaveFile

> AiAttachment aiAttachmentsSaveFile(aiAttachmentsSaveFileRequest)

Save fileStores one file attachment as a draft, carrying the host-extracted text of the file. Prefer `save-files-many` when adding several files at once so they land as one round trip.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAttachmentsSaveFileRequest** | [**AiAttachmentsSaveFileRequest**](AiAttachmentsSaveFileRequest.md)|  | |

### Return type

[**AiAttachment**](AiAttachment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        AiAttachmentsSaveFileRequest aiAttachmentsSaveFileRequest = new AiAttachmentsSaveFileRequest(); // AiAttachmentsSaveFileRequest | 
        try {
            AiAttachment result = apiInstance.aiAttachmentsSaveFile(aiAttachmentsSaveFileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsSaveFile");
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


## aiAttachmentsSaveFilesMany

> List&lt;AiAttachment&gt; aiAttachmentsSaveFilesMany(aiAttachmentsSaveFilesManyRequest)

Save files manyStores a batch of file attachments as drafts in a single round trip. The returned records keep the order of the input.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiAttachmentsSaveFilesManyRequest** | [**AiAttachmentsSaveFilesManyRequest**](AiAttachmentsSaveFilesManyRequest.md)|  | |

### Return type

[**List&lt;AiAttachment&gt;**](AiAttachment.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        AiAttachmentsSaveFilesManyRequest aiAttachmentsSaveFilesManyRequest = new AiAttachmentsSaveFilesManyRequest(); // AiAttachmentsSaveFilesManyRequest | 
        try {
            List<AiAttachment> result = apiInstance.aiAttachmentsSaveFilesMany(aiAttachmentsSaveFilesManyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#aiAttachmentsSaveFilesMany");
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

