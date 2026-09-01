# docspace-api-sdk.org.openapitools.client.api.ExportApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiExportTextToDocx**](AiExportApi.md#aiExportTextToDocx) | **POST** /api/2.0/ai/text-to-docx | Start markdown → docx export |



## aiExportTextToDocx

> AiExportTextToDocx200Response aiExportTextToDocx(aiExportTextToDocxRequest)

Start markdown → docx exportStarts an asynchronous markdown-to-docx export. The response only acknowledges the task: the AI Worker converts the content and saves the .docx into the target folder (an agent room resolves to its result-storage subfolder), and completion reaches the client as the usual folder-modified socket event.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiExportTextToDocxRequest** | [**AiExportTextToDocxRequest**](AiExportTextToDocxRequest.md)|  | |

### Return type

[**AiExportTextToDocx200Response**](AiExportTextToDocx200Response.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ExportApi apiInstance = new ExportApi(defaultClient);
        AiExportTextToDocxRequest aiExportTextToDocxRequest = new AiExportTextToDocxRequest(); // AiExportTextToDocxRequest | 
        try {
            AiExportTextToDocx200Response result = apiInstance.aiExportTextToDocx(aiExportTextToDocxRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#aiExportTextToDocx");
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

