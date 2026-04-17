# docspace-api-sdk.org.openapitools.client.api.AccessToDevToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**setTenantDevToolsAccessSettings**](SecurityAccessToDevToolsApi.md#setTenantDevToolsAccessSettings) | **POST** /api/2.0/settings/devtoolsaccess | Set the Developer Tools access settings |



## setTenantDevToolsAccessSettings

> TenantDevToolsAccessSettingsWrapper setTenantDevToolsAccessSettings(tenantDevToolsAccessSettingsDto)

Set the Developer Tools access settingsSets the Developer Tools access settings for the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-dev-tools-access-settings/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantDevToolsAccessSettingsDto** | [**TenantDevToolsAccessSettingsDto**](TenantDevToolsAccessSettingsDto.md)|  | [optional] |

### Return type

[**TenantDevToolsAccessSettingsWrapper**](TenantDevToolsAccessSettingsWrapper.md)

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
import org.openapitools.client.api.AccessToDevToolsApi;

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


        AccessToDevToolsApi apiInstance = new AccessToDevToolsApi(defaultClient);
        TenantDevToolsAccessSettingsDto tenantDevToolsAccessSettingsDto = new TenantDevToolsAccessSettingsDto(); // TenantDevToolsAccessSettingsDto | 
        try {
            TenantDevToolsAccessSettingsWrapper result = apiInstance.setTenantDevToolsAccessSettings(tenantDevToolsAccessSettingsDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessToDevToolsApi#setTenantDevToolsAccessSettings");
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
| **200** | Developer Tools access settings |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

