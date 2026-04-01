# docspace-api-sdk.org.openapitools.client.api.ClientManagementApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeActivation**](OAuth20ClientManagementApi.md#changeActivation) | **PATCH** /api/2.0/clients/{clientId}/activation | Change client activation status |
| [**createClient**](OAuth20ClientManagementApi.md#createClient) | **POST** /api/2.0/clients | Create a new OAuth2 client |
| [**deleteClient**](OAuth20ClientManagementApi.md#deleteClient) | **DELETE** /api/2.0/clients/{clientId} | Delete an OAuth2 client |
| [**deleteTenantClients**](OAuth20ClientManagementApi.md#deleteTenantClients) | **DELETE** /api/2.0/clients/tenant | Delete all tenant OAuth2 clients |
| [**deleteUserClients**](OAuth20ClientManagementApi.md#deleteUserClients) | **DELETE** /api/2.0/clients | Delete all user OAuth2 clients |
| [**regenerateSecret**](OAuth20ClientManagementApi.md#regenerateSecret) | **PATCH** /api/2.0/clients/{clientId}/regenerate | Regenerate client secret |
| [**revokeUserClient**](OAuth20ClientManagementApi.md#revokeUserClient) | **DELETE** /api/2.0/clients/{clientId}/revoke | Revoke client consent |
| [**updateClient**](OAuth20ClientManagementApi.md#updateClient) | **PUT** /api/2.0/clients/{clientId} | Update an existing OAuth2 client |



## changeActivation

> Object changeActivation(clientId, changeClientActivationRequest)

Change client activation statusActivates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to change activation for | |
| **changeClientActivationRequest** | [**ChangeClientActivationRequest**](ChangeClientActivationRequest.md)|  | |

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to change activation for
        ChangeClientActivationRequest changeClientActivationRequest = new ChangeClientActivationRequest(); // ChangeClientActivationRequest | 
        try {
            Object result = apiInstance.changeActivation(clientId, changeClientActivationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#changeActivation");
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
| **200** | Client activation status successfully changed |  -  |
| **400** | Invalid client ID format or activation status |  -  |
| **403** | Insufficient permissions to change client activation |  -  |
| **404** | Client not found |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## createClient

> ClientResponse createClient(createClientRequest)

Create a new OAuth2 clientCreates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createClientRequest** | [**CreateClientRequest**](CreateClientRequest.md)|  | |

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        CreateClientRequest createClientRequest = new CreateClientRequest(); // CreateClientRequest | 
        try {
            ClientResponse result = apiInstance.createClient(createClientRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#createClient");
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
| **201** | Client successfully created |  -  |
| **400** | Invalid request - missing required fields or validation failed |  -  |
| **403** | Insufficient permissions to create client |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## deleteClient

> Object deleteClient(clientId)

Delete an OAuth2 clientPermanently deletes an OAuth2 client and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to delete | |

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to delete
        try {
            Object result = apiInstance.deleteClient(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#deleteClient");
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
| **200** | Client successfully deleted |  -  |
| **400** | Invalid client ID format |  -  |
| **403** | Insufficient permissions to delete client |  -  |
| **404** | Client not found |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## deleteTenantClients

> Object deleteTenantClients()

Delete all tenant OAuth2 clientsPermanently deletes tenant OAuth2 clients and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-tenant-clients/).

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        try {
            Object result = apiInstance.deleteTenantClients();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#deleteTenantClients");
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
| **200** | Client successfully deleted |  -  |
| **403** | Insufficient permissions to delete tenant clients |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## deleteUserClients

> Object deleteUserClients()

Delete all user OAuth2 clientsPermanently deletes user OAuth2 clients and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-user-clients/).

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        try {
            Object result = apiInstance.deleteUserClients();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#deleteUserClients");
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
| **200** | Client successfully deleted |  -  |
| **403** | Insufficient permissions to delete user clients |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## regenerateSecret

> ClientSecretResponse regenerateSecret(clientId)

Regenerate client secretGenerates a new client secret for the specified OAuth2 client. The old secret will be immediately invalidated. This operation should be used with caution as it requires updating the secret in all client applications.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to regenerate secret for | |

### Return type

[**ClientSecretResponse**](ClientSecretResponse.md)

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to regenerate secret for
        try {
            ClientSecretResponse result = apiInstance.regenerateSecret(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#regenerateSecret");
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
| **200** | Client secret successfully regenerated |  -  |
| **400** | Invalid client ID format |  -  |
| **403** | Insufficient permissions to regenerate client secret |  -  |
| **404** | Client not found |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |


## revokeUserClient

> Object revokeUserClient(clientId)

Revoke client consentRevokes all user consents for the specified OAuth2 client. This will invalidate all access tokens and refresh tokens issued to this client for the current user. The user will need to re-authorize the client to access their resources.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to revoke consent for | |

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to revoke consent for
        try {
            Object result = apiInstance.revokeUserClient(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#revokeUserClient");
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
| **200** | Client consent successfully revoked |  -  |
| **400** | Invalid client ID format |  -  |
| **403** | Insufficient permissions to revoke consent |  -  |
| **404** | Client not found |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |
| **503** | Authorization service unavailable |  -  |


## updateClient

> Object updateClient(clientId, updateClientRequest)

Update an existing OAuth2 clientUpdates the configuration of an existing OAuth2 client. Allows modification of client name, description, redirect URIs, and other settings. The client ID cannot be modified.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| ID of the client to update | |
| **updateClientRequest** | [**UpdateClientRequest**](UpdateClientRequest.md)|  | |

### Return type

**Object**

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
import org.openapitools.client.api.ClientManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure API key authorization: x-signature
        ApiKeyAuth x-signature = (ApiKeyAuth) defaultClient.getAuthentication("x-signature");
        x-signature.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-signature.setApiKeyPrefix("Token");

        ClientManagementApi apiInstance = new ClientManagementApi(defaultClient);
        String clientId = "6c7cf17b-1bd3-47d5-94c6-be2d3570e168"; // String | ID of the client to update
        UpdateClientRequest updateClientRequest = new UpdateClientRequest(); // UpdateClientRequest | 
        try {
            Object result = apiInstance.updateClient(clientId, updateClientRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientManagementApi#updateClient");
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
| **200** | Client successfully updated |  -  |
| **400** | Invalid request - missing required fields or validation failed |  -  |
| **403** | Insufficient permissions to update client |  -  |
| **404** | Client not found |  -  |
| **415** | Unsupported media type |  -  |
| **429** | Too many requests - rate limit exceeded |  -  |
| **500** | Internal server error occurred |  -  |

