# docspace-api-sdk.org.openapitools.client.api.SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroupsWithFilesShared**](GroupSearchApi.md#getGroupsWithFilesShared) | **GET** /api/2.0/group/file/{id} | Get groups with file sharing settings |
| [**getGroupsWithFoldersShared**](GroupSearchApi.md#getGroupsWithFoldersShared) | **GET** /api/2.0/group/folder/{id} | Get groups with folder sharing settings |
| [**getGroupsWithRoomsShared**](GroupSearchApi.md#getGroupsWithRoomsShared) | **GET** /api/2.0/group/room/{id} | Get groups with room sharing settings |



## getGroupsWithFilesShared

> GroupArrayWrapper getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue)

Get groups with file sharing settingsReturns groups with their sharing settings for a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The group ID. | |
| **excludeShared** | **Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **Integer**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
import org.openapitools.client.api.SearchApi;

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


        SearchApi apiInstance = new SearchApi(defaultClient);
        Integer id = 56; // Integer | The group ID.
        Boolean excludeShared = false; // Boolean | Specifies whether to exclude the group sharing settings from the response.
        Integer count = 25; // Integer | The number of groups to retrieve in the request.
        Integer startIndex = 0; // Integer | The starting index from which to begin retrieving groups with their sharing settings.
        String filterValue = "John"; // String | The text used as a filter for retrieving groups with their sharing settings.
        try {
            GroupArrayWrapper result = apiInstance.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getGroupsWithFilesShared");
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
| **200** | Ok |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getGroupsWithFoldersShared

> GroupArrayWrapper getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue)

Get groups with folder sharing settingsReturns groups with their sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The group ID. | |
| **excludeShared** | **Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **Integer**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
import org.openapitools.client.api.SearchApi;

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


        SearchApi apiInstance = new SearchApi(defaultClient);
        Integer id = 56; // Integer | The group ID.
        Boolean excludeShared = false; // Boolean | Specifies whether to exclude the group sharing settings from the response.
        Integer count = 25; // Integer | The number of groups to retrieve in the request.
        Integer startIndex = 0; // Integer | The starting index from which to begin retrieving groups with their sharing settings.
        String filterValue = "John"; // String | The text used as a filter for retrieving groups with their sharing settings.
        try {
            GroupArrayWrapper result = apiInstance.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getGroupsWithFoldersShared");
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
| **200** | Ok |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getGroupsWithRoomsShared

> GroupArrayWrapper getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue)

Get groups with room sharing settingsReturns groups with their sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The group ID. | |
| **excludeShared** | **Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **Integer**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **Integer**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
import org.openapitools.client.api.SearchApi;

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


        SearchApi apiInstance = new SearchApi(defaultClient);
        Integer id = 56; // Integer | The group ID.
        Boolean excludeShared = false; // Boolean | Specifies whether to exclude the group sharing settings from the response.
        Integer count = 25; // Integer | The number of groups to retrieve in the request.
        Integer startIndex = 0; // Integer | The starting index from which to begin retrieving groups with their sharing settings.
        String filterValue = "John"; // String | The text used as a filter for retrieving groups with their sharing settings.
        try {
            GroupArrayWrapper result = apiInstance.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getGroupsWithRoomsShared");
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
| **200** | Ok |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

