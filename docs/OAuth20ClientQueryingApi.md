# docspace-api-sdk.org.openapitools.client.api.ClientQueryingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClient**](OAuth20ClientQueryingApi.md#getClient) | **GET** /api/2.0/clients/{clientId} | Get client details |
| [**getClientInfo**](OAuth20ClientQueryingApi.md#getClientInfo) | **GET** /api/2.0/clients/{clientId}/info | Retrieves detailed information for a specific client |
| [**getClients**](OAuth20ClientQueryingApi.md#getClients) | **GET** /api/2.0/clients | List clients |
| [**getClientsInfo**](OAuth20ClientQueryingApi.md#getClientsInfo) | **GET** /api/2.0/clients/info | Retrieves a pageable list of client information |
| [**getConsents**](OAuth20ClientQueryingApi.md#getConsents) | **GET** /api/2.0/clients/consents | Retrieves a pageable list of consents |
| [**getPublicClientInfo**](OAuth20ClientQueryingApi.md#getPublicClientInfo) | **GET** /api/2.0/clients/{clientId}/public/info | Handles the GET request for public client information |



## getClient

> ClientResponse getClient(clientId)

Get client detailsRetrieves detailed information about a specific OAuth2 client including its name, description, redirect URIs, and scopes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to retrieve | |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to retrieve
        try {
            ClientResponse result = apiInstance.getClient(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getClient");
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
| **200** | Client details successfully retrieved |  -  |
| **400** | Invalid client ID format |  -  |
| **403** | Insufficient permissions to view client |  -  |
| **404** | Client not found |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## getClientInfo

> ClientInfoResponse getClientInfo(clientId)

Retrieves detailed information for a specific clientRetrieves the detailed information for a client with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to retrieve | |

### Return type

[**ClientInfoResponse**](ClientInfoResponse.md)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to retrieve
        try {
            ClientInfoResponse result = apiInstance.getClientInfo(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getClientInfo");
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
| **200** | Successfully retrieved client info |  -  |
| **400** | Bad request |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## getClients

> PageableResponse getClients(limit, lastClientId, lastCreatedOn)

List clientsRetrieves a paginated list of OAuth2 clients. The results can be paginated using the limit parameter and last seen client ID/creation date.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Pagination limit | [default to 30] |
| **lastClientId** | **String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableResponse**](PageableResponse.md)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        Integer limit = 30; // Integer | Pagination limit
        String lastClientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the last retrieved client
        OffsetDateTime lastCreatedOn = OffsetDateTime.parse("2024-04-04T12:00:00Z"); // OffsetDateTime | Date of the last retrieved client
        try {
            PageableResponse result = apiInstance.getClients(limit, lastClientId, lastCreatedOn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getClients");
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
| **200** | Client list successfully retrieved |  -  |
| **400** | Invalid pagination parameters |  -  |
| **403** | Insufficient permissions to list clients |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## getClientsInfo

> PageableResponseClientInfoResponse getClientsInfo(limit, lastClientId, lastCreatedOn)

Retrieves a pageable list of client informationRetrieves a paginated list of information for all clients.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Pagination limit | |
| **lastClientId** | **String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableResponseClientInfoResponse**](PageableResponseClientInfoResponse.md)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        Integer limit = 1; // Integer | Pagination limit
        String lastClientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the last retrieved client
        OffsetDateTime lastCreatedOn = OffsetDateTime.parse("2024-04-04T12:00:00Z"); // OffsetDateTime | Date of the last retrieved client
        try {
            PageableResponseClientInfoResponse result = apiInstance.getClientsInfo(limit, lastClientId, lastCreatedOn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getClientsInfo");
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
| **200** | Successfully retrieved clients info |  -  |
| **400** | Bad request |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## getConsents

> PageableModificationResponse getConsents(limit, lastModifiedOn)

Retrieves a pageable list of consentsRetrieves a paginated list of user consents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Pagination limit | |
| **lastModifiedOn** | **OffsetDateTime**| Date of the last retrieved consent | [optional] |

### Return type

[**PageableModificationResponse**](PageableModificationResponse.md)

### Authorization

[x-signature](../README.md#x-signature)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        Integer limit = 1; // Integer | Pagination limit
        OffsetDateTime lastModifiedOn = OffsetDateTime.parse("2024-04-04T12:00:00Z"); // OffsetDateTime | Date of the last retrieved consent
        try {
            PageableModificationResponse result = apiInstance.getConsents(limit, lastModifiedOn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getConsents");
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
| **200** | Successfully retrieved user consents |  -  |


## getPublicClientInfo

> ClientInfoResponse getPublicClientInfo(clientId)

Handles the GET request for public client information

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to retrieve | |

### Return type

[**ClientInfoResponse**](ClientInfoResponse.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientQueryingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ClientQueryingApi apiInstance = new ClientQueryingApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to retrieve
        try {
            ClientInfoResponse result = apiInstance.getPublicClientInfo(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientQueryingApi#getPublicClientInfo");
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
| **200** | Successfully retrieved client public info |  -  |
| **400** | Bad request |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |

