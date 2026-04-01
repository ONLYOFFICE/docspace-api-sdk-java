# docspace-api-sdk.org.openapitools.client.api.DiscoveryApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleOptions**](OAuth20DiscoveryApi.md#handleOptions) | **OPTIONS** /.well-known/oauth-authorization-server |  |



## handleOptions

> Object handleOptions()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/handle-options/).

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
        try {
            Object result = apiInstance.handleOptions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoveryApi#handleOptions");
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
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

