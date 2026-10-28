# docspace-api-sdk.org.openapitools.client.api.ClientQueryingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClient**](OAuth20ClientQueryingApi.md#getClient) | **GET** /api/2.0/oauth2/clients/{clientId} | Get client details |
| [**getClientInfo**](OAuth20ClientQueryingApi.md#getClientInfo) | **GET** /api/2.0/oauth2/clients/{clientId}/info | Get client info |
| [**getClients**](OAuth20ClientQueryingApi.md#getClients) | **GET** /api/2.0/oauth2/clients | List clients |
| [**getClientsInfo**](OAuth20ClientQueryingApi.md#getClientsInfo) | **GET** /api/2.0/oauth2/clients/info | List client info |
| [**getConsents**](OAuth20ClientQueryingApi.md#getConsents) | **GET** /api/2.0/oauth2/clients/consents | List user consents |
| [**getPublicClientInfo**](OAuth20ClientQueryingApi.md#getPublicClientInfo) | **GET** /api/2.0/oauth2/clients/{clientId}/public/info | Get public client info |



## getClient

> ClientResponse getClient(clientId)

Get client detailsReturns the whole stored record of one client: its name and description, its secret, scopes, redirect URIs, allowed origins, logout redirect URIs and audit fields. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. Whatever the caller may not see is reported as 404 rather than 403, so absence and lack of access are deliberately indistinguishable, and an identifier that is not a valid client ID is reported the same way. The response is a single object, not a collection.

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
| **400** | The client ID is blank or contains only whitespace |  -  |
| **403** | Insufficient permissions to view client |  -  |
| **404** | No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |
| **406** | The Accept header does not allow application/json |  -  |


## getClientInfo

> ClientInfoResponse getClientInfo(clientId)

Get client infoRetrieves the detailed information for a client with the ID specified in the request. It returns the consent-facing subset of the client - name, description, logo, the website, terms and policy URLs, authentication methods and scopes - and deliberately omits the secret, the redirect URIs and the allowed origins, which is what makes it safe to render on a consent screen. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. A client the caller may not see is reported as 404, exactly like an unknown one.

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
| **400** | The client ID is blank or contains only whitespace |  -  |
| **403** | Insufficient permissions to view client information |  -  |
| **404** | No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |
| **406** | The Accept header does not allow application/json |  -  |


## getClients

> PageableClientResponse getClients(limit, lastClientId, lastCreatedOn)

List clientsReturns one page of the tenant's clients, newest first, each in the same full form as the single-client read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based rather than offset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page to ask for the next one. The limit defaults to 30 and has to lie between 1 and 50; a value outside that range, or a last_created_on that cannot be parsed as a date, is rejected with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| How many entries to return, between 1 and 50. Defaults to 30 when omitted. | [optional] [default to 30] |
| **lastClientId** | **String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableClientResponse**](PageableClientResponse.md)

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
        Integer limit = 30; // Integer | How many entries to return, between 1 and 50. Defaults to 30 when omitted.
        String lastClientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the last retrieved client
        OffsetDateTime lastCreatedOn = OffsetDateTime.parse("2024-04-04T12:00:00Z"); // OffsetDateTime | Date of the last retrieved client
        try {
            PageableClientResponse result = apiInstance.getClients(limit, lastClientId, lastCreatedOn);
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
| **400** | Invalid pagination parameters, including a last_created_on that cannot be parsed as a date-time |  -  |
| **403** | Insufficient permissions to list clients |  -  |
| **406** | The Accept header does not allow application/json |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |


## getClientsInfo

> PageableClientInfoResponse getClientsInfo(limit, lastClientId, lastCreatedOn)

List client infoRetrieves a paginated list of information for all clients, each in the same consent-facing form as the single-client info read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page. Unlike the full client listing, limit has no default here - it has to be supplied on every call and has to lie between 1 and 50, and a missing or out-of-range value is rejected with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| How many entries to return, between 1 and 50. It has no default and has to be sent on every call. | |
| **lastClientId** | **String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableClientInfoResponse**](PageableClientInfoResponse.md)

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
        Integer limit = 30; // Integer | How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
        String lastClientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the last retrieved client
        OffsetDateTime lastCreatedOn = OffsetDateTime.parse("2024-04-04T12:00:00Z"); // OffsetDateTime | Date of the last retrieved client
        try {
            PageableClientInfoResponse result = apiInstance.getClientsInfo(limit, lastClientId, lastCreatedOn);
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
| **400** | The limit parameter is missing, is outside the range 1-50, or last_created_on cannot be parsed as a date-time |  -  |
| **403** | Insufficient permissions to list client information |  -  |
| **406** | The Accept header does not allow application/json |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |


## getConsents

> PageableModificationResponse getConsents(limit, lastModifiedOn)

List user consentsRetrieves a paginated list of user consents: the clients the calling user has authorized, each with the scopes granted, the moment the consent was last changed and the client's consent-facing details. It always reports the caller's own consents and nothing else - there is no role check on this endpoint, so guests may call it too, and no parameter widens it to another user. The consents are read from the authorization service over gRPC, so an authorization service that cannot be reached surfaces as 503. Paging is keyset-based on last_modified_on, and limit has no default: it has to be supplied on every call and has to lie between 1 and 50.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| How many entries to return, between 1 and 50. It has no default and has to be sent on every call. | |
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
        Integer limit = 30; // Integer | How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
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
| **400** | The limit parameter is missing, is outside the range 1-50, or last_modified_on cannot be parsed as a date-time |  -  |
| **403** | The request carries no valid portal signature |  -  |
| **406** | The Accept header does not allow application/json |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **503** | Authorization service unavailable |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |


## getPublicClientInfo

> ClientInfoResponse getPublicClientInfo(clientId)

Get public client infoReturns the same consent-facing client information as the signed read, but without requiring a portal signature. It is meant for a login or consent page that has to render the client before the user is known, so it resolves the client by ID alone: there is no authentication, no tenant scoping and no creator check, and any caller who knows a client ID can read that client's public details. It still exposes no secret, no redirect URIs and no allowed origins. Being unauthenticated it is rate-limited on a separate, tighter budget than the signed endpoints. An unknown client ID, and an identifier that is not a client ID at all, are both reported as 404.

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
| **400** | The client ID is blank or contains only whitespace |  -  |
| **404** | No client with this ID exists, or the ID cannot be parsed as a client ID |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **405** | The HTTP method is not allowed for this path |  -  |
| **406** | The Accept header does not allow application/json |  -  |

