# docspace-api-sdk.org.openapitools.client.api.ProvidersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProvider**](AiProvidersApi.md#addProvider) | **POST** /api/2.0/ai/providers | Add an AI provider |
| [**deleteProviders**](AiProvidersApi.md#deleteProviders) | **DELETE** /api/2.0/ai/providers | Delete AI providers |
| [**getAvailableProviders**](AiProvidersApi.md#getAvailableProviders) | **GET** /api/2.0/ai/providers/available | Get available AI provider types |
| [**getDefaultProvider**](AiProvidersApi.md#getDefaultProvider) | **GET** /api/2.0/ai/providers/default | Get the default AI provider |
| [**getProviderModels**](AiProvidersApi.md#getProviderModels) | **GET** /api/2.0/ai/providers/{providerId}/models | Get all models for a provider with their settings |
| [**getProviders**](AiProvidersApi.md#getProviders) | **GET** /api/2.0/ai/providers | Get AI providers |
| [**previewProviderModels**](AiProvidersApi.md#previewProviderModels) | **POST** /api/2.0/ai/providers/models/preview | Preview models for a new AI provider |
| [**setDefaultProvider**](AiProvidersApi.md#setDefaultProvider) | **PUT** /api/2.0/ai/providers/default | Set the default AI provider |
| [**updateProvider**](AiProvidersApi.md#updateProvider) | **PUT** /api/2.0/ai/providers/{id} | Update an AI provider |



## addProvider

> AiProviderWrapper addProvider(createProviderRequestDto)

Add an AI providerRegisters a new AI provider for the current tenant by specifying its type, display title, API endpoint URL, and authentication key.  The provider becomes available for AI chat conversations after creation. This action is rate-limited.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-provider/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createProviderRequestDto** | [**CreateProviderRequestDto**](CreateProviderRequestDto.md)|  | [optional] |

### Return type

[**AiProviderWrapper**](AiProviderWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        CreateProviderRequestDto createProviderRequestDto = new CreateProviderRequestDto(); // CreateProviderRequestDto | 
        try {
            AiProviderWrapper result = apiInstance.addProvider(createProviderRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#addProvider");
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
| **200** | Created AI provider details |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid connection data or provider with this name already exists |  -  |
| **403** | You don't have enough permission to manage providers |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## deleteProviders

> deleteProviders(removeProviderRequestDto)

Delete AI providersPermanently deletes one or more AI providers by their identifiers.  All specified providers are removed from the current tenant. This action cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-providers/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **removeProviderRequestDto** | [**RemoveProviderRequestDto**](RemoveProviderRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        RemoveProviderRequestDto removeProviderRequestDto = new RemoveProviderRequestDto(); // RemoveProviderRequestDto | 
        try {
            apiInstance.deleteProviders(removeProviderRequestDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#deleteProviders");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The providers were successfully deleted |  -  |
| **403** | You don't have enough permission to manage providers |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAvailableProviders

> ProviderSettingsArrayWrapper getAvailableProviders()

Get available AI provider typesReturns the list of AI provider types that are available for configuration on the current instance.  Each entry includes the provider type identifier and the default API endpoint URL.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-providers/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**ProviderSettingsArrayWrapper**](ProviderSettingsArrayWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        try {
            ProviderSettingsArrayWrapper result = apiInstance.getAvailableProviders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getAvailableProviders");
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
| **200** | List of available AI provider types |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getDefaultProvider

> DefaultProviderWrapper getDefaultProvider()

Get the default AI providerReturns the default AI provider and model configured for the current tenant.  Returns null if the tenant does not have any registered providers.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-provider/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**DefaultProviderWrapper**](DefaultProviderWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        try {
            DefaultProviderWrapper result = apiInstance.getDefaultProvider();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getDefaultProvider");
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
| **200** | Default provider information or null if not set |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getProviderModels

> ModelSettingsArrayWrapper getProviderModels(providerId)

Get all models for a provider with their settingsReturns the full list of AI models available from a provider, including both recommended and additional models.  Each model includes its current settings: enabled state, display alias, and capabilities (vision, tool calling, thinking).  Recommended models are enabled by default and their alias and capabilities come from configuration.  Additional models are disabled by default and can be configured by the admin.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-provider-models/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerId** | **Integer**| The identifier of the AI provider. | |

### Return type

[**ModelSettingsArrayWrapper**](ModelSettingsArrayWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Integer providerId = 1; // Integer | The identifier of the AI provider.
        try {
            ModelSettingsArrayWrapper result = apiInstance.getProviderModels(providerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getProviderModels");
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
| **200** | List of models with settings |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | You don't have enough permission to manage providers |  -  |
| **404** | Provider not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getProviders

> AiProviderArrayWrapper getProviders(startIndex, count)

Get AI providersReturns a paginated list of AI providers configured for the current tenant.  Supports pagination via the startIndex and count query parameters. The total number of providers is included in the response metadata.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-providers/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startIndex** | **Integer**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **Integer**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**AiProviderArrayWrapper**](AiProviderArrayWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Integer startIndex = 0; // Integer | The number of items to skip before returning results (zero-based offset). Defaults to 0.
        Integer count = 100; // Integer | The maximum number of items to return per page. Defaults to 100.
        try {
            AiProviderArrayWrapper result = apiInstance.getProviders(startIndex, count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getProviders");
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
| **200** | Paginated list of AI providers |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## previewProviderModels

> ModelSettingsArrayWrapper previewProviderModels(previewProviderModelsRequestDto)

Preview models for a new AI providerConnects to the specified AI provider using the provided credentials and returns the available models  with their default settings. This is used to preview models before saving the provider.  Recommended models are enabled by default with configuration-defined settings.  Additional models are disabled by default with empty capabilities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/preview-provider-models/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **previewProviderModelsRequestDto** | [**PreviewProviderModelsRequestDto**](PreviewProviderModelsRequestDto.md)|  | [optional] |

### Return type

[**ModelSettingsArrayWrapper**](ModelSettingsArrayWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        PreviewProviderModelsRequestDto previewProviderModelsRequestDto = new PreviewProviderModelsRequestDto(); // PreviewProviderModelsRequestDto | 
        try {
            ModelSettingsArrayWrapper result = apiInstance.previewProviderModels(previewProviderModelsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#previewProviderModels");
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
| **200** | List of models with default settings |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid connection data or unsupported provider type |  -  |
| **403** | You don't have enough permission to manage providers |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## setDefaultProvider

> DefaultProviderWrapper setDefaultProvider(setDefaultProviderRequestDto)

Set the default AI providerSets the default AI provider and model for the current tenant.  The specified provider and model will be used as the default for all new AI chat sessions within the tenant.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-provider/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **setDefaultProviderRequestDto** | [**SetDefaultProviderRequestDto**](SetDefaultProviderRequestDto.md)|  | [optional] |

### Return type

[**DefaultProviderWrapper**](DefaultProviderWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        SetDefaultProviderRequestDto setDefaultProviderRequestDto = new SetDefaultProviderRequestDto(); // SetDefaultProviderRequestDto | 
        try {
            DefaultProviderWrapper result = apiInstance.setDefaultProvider(setDefaultProviderRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#setDefaultProvider");
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
| **200** | Default provider information |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | You don't have enough permission to manage providers |  -  |
| **404** | Provider not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## updateProvider

> AiProviderWrapper updateProvider(id, updateProviderBody)

Update an AI providerUpdates the configuration of an existing AI provider, including its display title, API endpoint URL, and authentication key.  Only the fields provided in the request body will be updated. This action is rate-limited.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-provider/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The identifier of the AI provider to update. | |
| **updateProviderBody** | [**UpdateProviderBody**](UpdateProviderBody.md)| The AI provider configuration parameters to update. | |

### Return type

[**AiProviderWrapper**](AiProviderWrapper.md)

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
import org.openapitools.client.api.ProvidersApi;

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


        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Integer id = 1; // Integer | The identifier of the AI provider to update.
        UpdateProviderBody updateProviderBody = new UpdateProviderBody(); // UpdateProviderBody | The AI provider configuration parameters to update.
        try {
            AiProviderWrapper result = apiInstance.updateProvider(id, updateProviderBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#updateProvider");
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
| **200** | Updated AI provider details |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid connection data or provider with this name already exists |  -  |
| **403** | You don't have enough permission to manage providers |  -  |
| **404** | The provider with the specified ID was not found |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

