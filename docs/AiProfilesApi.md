# docspace-api-sdk.org.openapitools.client.api.ProfilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiProfilesCreate**](AiProfilesApi.md#aiProfilesCreate) | **POST** /api/2.0/ai/profiles/create | Create |
| [**aiProfilesDelete**](AiProfilesApi.md#aiProfilesDelete) | **DELETE** /api/2.0/ai/profiles/delete | Delete |
| [**aiProfilesGetById**](AiProfilesApi.md#aiProfilesGetById) | **GET** /api/2.0/ai/profiles/get-by-id | Get by id |
| [**aiProfilesList**](AiProfilesApi.md#aiProfilesList) | **GET** /api/2.0/ai/profiles/list | List |
| [**aiProfilesListModels**](AiProfilesApi.md#aiProfilesListModels) | **GET** /api/2.0/ai/profiles/list-models | List models |
| [**aiProfilesListProviderModels**](AiProfilesApi.md#aiProfilesListProviderModels) | **POST** /api/2.0/ai/profiles/list-provider-models | List provider models |
| [**aiProfilesTestConnection**](AiProfilesApi.md#aiProfilesTestConnection) | **POST** /api/2.0/ai/profiles/test-connection | Test connection |
| [**aiProfilesUpdate**](AiProfilesApi.md#aiProfilesUpdate) | **PUT** /api/2.0/ai/profiles/update | Update |



## aiProfilesCreate

> AiProfileMutationResult aiProfilesCreate(aiCreateProfileInput)

CreateCreates an AI provider profile. The name must be unique and the credentials are validated against the provider before the profile is stored; the portal's first profile also takes the `Default` assignment slot.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiCreateProfileInput** | [**AiCreateProfileInput**](AiCreateProfileInput.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        AiCreateProfileInput aiCreateProfileInput = new AiCreateProfileInput(); // AiCreateProfileInput | 
        try {
            AiProfileMutationResult result = apiInstance.aiProfilesCreate(aiCreateProfileInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesCreate");
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


## aiProfilesDelete

> AiSuccessResponse aiProfilesDelete(body)

DeleteDeletes an AI provider profile and cleans up the assignments pointing at it - the `Default` slot moves to the first remaining profile, the other slots are unbound.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/).

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
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiSuccessResponse result = apiInstance.aiProfilesDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesDelete");
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


## aiProfilesGetById

> AiProfilesGetById200Response aiProfilesGetById(id)

Get by idReturns one AI provider profile, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The AI provider profile identifier. | |

### Return type

[**AiProfilesGetById200Response**](AiProfilesGetById200Response.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String id = "id_example"; // String | The AI provider profile identifier.
        try {
            AiProfilesGetById200Response result = apiInstance.aiProfilesGetById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesGetById");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiProfilesList

> List&lt;AiProfile&gt; aiProfilesList()

ListLists the portal's AI provider profiles.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;AiProfile&gt;**](AiProfile.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        try {
            List<AiProfile> result = apiInstance.aiProfilesList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesList");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiProfilesListModels

> List&lt;AiModel&gt; aiProfilesListModels(profileId)

List modelsLists the models the given profile's provider offers, as reported by the provider itself.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The AI provider profile identifier. | |

### Return type

[**List&lt;AiModel&gt;**](AiModel.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String profileId = "profileId_example"; // String | The AI provider profile identifier.
        try {
            List<AiModel> result = apiInstance.aiProfilesListModels(profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesListModels");
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
| **200** | Success. |  -  |
| **401** | Missing `asc_auth_key` cookie or `Authorization` header. |  -  |


## aiProfilesListProviderModels

> List&lt;AiModel&gt; aiProfilesListProviderModels(aiProfilesListProviderModelsRequest)

List provider modelsLists the models a provider offers for the supplied endpoint and key, before any profile is created from them.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiProfilesListProviderModelsRequest** | [**AiProfilesListProviderModelsRequest**](AiProfilesListProviderModelsRequest.md)|  | |

### Return type

[**List&lt;AiModel&gt;**](AiModel.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        AiProfilesListProviderModelsRequest aiProfilesListProviderModelsRequest = new AiProfilesListProviderModelsRequest(); // AiProfilesListProviderModelsRequest | 
        try {
            List<AiModel> result = apiInstance.aiProfilesListProviderModels(aiProfilesListProviderModelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesListProviderModels");
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


## aiProfilesTestConnection

> AiProfilesTestConnection200Response aiProfilesTestConnection(body)

Test connectionChecks a stored profile's credentials against its provider and reports the provider's own error when the call fails. Nothing is written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

[**AiProfilesTestConnection200Response**](AiProfilesTestConnection200Response.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            AiProfilesTestConnection200Response result = apiInstance.aiProfilesTestConnection(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesTestConnection");
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


## aiProfilesUpdate

> AiProfileMutationResult aiProfilesUpdate(aiProfile)

UpdateUpdates an AI provider profile, re-checking name uniqueness and the provider credentials.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiProfile** | [**AiProfile**](AiProfile.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        AiProfile aiProfile = new AiProfile(); // AiProfile | 
        try {
            AiProfileMutationResult result = apiInstance.aiProfilesUpdate(aiProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#aiProfilesUpdate");
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

