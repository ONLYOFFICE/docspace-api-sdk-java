# onlyoffice.docspace.api.sdk.org.openapitools.client.api.QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resetRoomQuota**](FilesQuotaApi.md#resetRoomQuota) | **PUT** /api/2.0/files/rooms/resetquota |  |
| [**updateRoomsQuota**](FilesQuotaApi.md#updateRoomsQuota) | **PUT** /api/2.0/files/rooms/roomquota |  |



## resetRoomQuota

> FolderIntegerArrayWrapper resetRoomQuota(updateRoomsRoomIdsRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateRoomsRoomIdsRequestDtoInteger** | [**UpdateRoomsRoomIdsRequestDtoInteger**](UpdateRoomsRoomIdsRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        QuotaApi apiInstance = new QuotaApi(defaultClient);
        UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger = new UpdateRoomsRoomIdsRequestDtoInteger(); // UpdateRoomsRoomIdsRequestDtoInteger | 
        try {
            FolderIntegerArrayWrapper result = apiInstance.resetRoomQuota(updateRoomsRoomIdsRequestDtoInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotaApi#resetRoomQuota");
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
| **200** | List of rooms with the detailed information |  -  |


## updateRoomsQuota

> FolderIntegerArrayWrapper updateRoomsQuota(updateRoomsQuotaRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateRoomsQuotaRequestDtoInteger** | [**UpdateRoomsQuotaRequestDtoInteger**](UpdateRoomsQuotaRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        QuotaApi apiInstance = new QuotaApi(defaultClient);
        UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger = new UpdateRoomsQuotaRequestDtoInteger(); // UpdateRoomsQuotaRequestDtoInteger | 
        try {
            FolderIntegerArrayWrapper result = apiInstance.updateRoomsQuota(updateRoomsQuotaRequestDtoInteger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotaApi#updateRoomsQuota");
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
| **200** | List of rooms with the detailed information |  -  |

