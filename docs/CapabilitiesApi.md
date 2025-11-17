# docspace-api-sdk.org.openapitools.client.api.CapabilitiesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortalCapabilities**](CapabilitiesApi.md#getPortalCapabilities) | **GET** /api/2.0/capabilities | Get portal capabilities |



## getPortalCapabilities

> CapabilitiesWrapper getPortalCapabilities()

Get portal capabilitiesReturns the information about portal capabilities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-capabilities/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**CapabilitiesWrapper**](CapabilitiesWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CapabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        CapabilitiesApi apiInstance = new CapabilitiesApi(defaultClient);
        try {
            CapabilitiesWrapper result = apiInstance.getPortalCapabilities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CapabilitiesApi#getPortalCapabilities");
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
| **200** | Portal capabilities |  -  |

