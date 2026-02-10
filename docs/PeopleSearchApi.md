# docspace-api-sdk.org.openapitools.client.api.SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountsEntriesWithFilesShared**](PeopleSearchApi.md#getAccountsEntriesWithFilesShared) | **GET** /api/2.0/accounts/file/{id}/search | Get account entries with file sharing settings |
| [**getAccountsEntriesWithFoldersShared**](PeopleSearchApi.md#getAccountsEntriesWithFoldersShared) | **GET** /api/2.0/accounts/folder/{id}/search | Get account entries with folder sharing settings |
| [**getAccountsEntriesWithRoomsShared**](PeopleSearchApi.md#getAccountsEntriesWithRoomsShared) | **GET** /api/2.0/accounts/room/{id}/search | Get account entries |
| [**getSearch**](PeopleSearchApi.md#getSearch) | **GET** /api/2.0/people/@search/{query} | Search users |
| [**getSimpleByFilter**](PeopleSearchApi.md#getSimpleByFilter) | **GET** /api/2.0/people/simple/filter | Search users by extended filter |
| [**getUsersWithFilesShared**](PeopleSearchApi.md#getUsersWithFilesShared) | **GET** /api/2.0/people/file/{id} | Get users with file sharing settings |
| [**getUsersWithFoldersShared**](PeopleSearchApi.md#getUsersWithFoldersShared) | **GET** /api/2.0/people/folder/{id} | Get users with folder sharing settings |
| [**getUsersWithRoomShared**](PeopleSearchApi.md#getUsersWithRoomShared) | **GET** /api/2.0/people/room/{id} | Get users with room sharing settings |
| [**searchUsersByExtendedFilter**](PeopleSearchApi.md#searchUsersByExtendedFilter) | **GET** /api/2.0/people/filter | Search users with detailed information by extended filter |
| [**searchUsersByQuery**](PeopleSearchApi.md#searchUsersByQuery) | **GET** /api/2.0/people/search | Search users (using query parameters) |
| [**searchUsersByStatus**](PeopleSearchApi.md#searchUsersByStatus) | **GET** /api/2.0/people/status/{status}/search | Search users by status filter |



## getAccountsEntriesWithFilesShared

> ObjectArrayWrapper getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get account entries with file sharing settingsReturns the account entries with their sharing settings for a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **Integer**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **Integer**| The starting index for the query results. | [optional] |
| **filterSeparator** | **String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the account sharing settings from the response.
        Boolean includeShared = true; // Boolean | Specifies whether to include the account sharing settings in the response.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user is invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The area of the account entries.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of the user types.
        Integer count = 1234; // Integer | The number of items to retrieve in a request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        String filterSeparator = "some text"; // String | Specifies the separator used in filter expressions.
        String filterValue = "some text"; // String | The text filter applied to the accounts search query.
        try {
            ObjectArrayWrapper result = apiInstance.getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getAccountsEntriesWithFilesShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getAccountsEntriesWithFoldersShared

> ObjectArrayWrapper getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get account entries with folder sharing settingsReturns the account entries with their sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **Integer**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **Integer**| The starting index for the query results. | [optional] |
| **filterSeparator** | **String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the account sharing settings from the response.
        Boolean includeShared = true; // Boolean | Specifies whether to include the account sharing settings in the response.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user is invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The area of the account entries.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of the user types.
        Integer count = 1234; // Integer | The number of items to retrieve in a request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        String filterSeparator = "some text"; // String | Specifies the separator used in filter expressions.
        String filterValue = "some text"; // String | The text filter applied to the accounts search query.
        try {
            ObjectArrayWrapper result = apiInstance.getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getAccountsEntriesWithFoldersShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getAccountsEntriesWithRoomsShared

> ObjectArrayWrapper getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get account entriesReturns the account entries with their sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **Integer**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **Integer**| The starting index for the query results. | [optional] |
| **filterSeparator** | **String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the account sharing settings from the response.
        Boolean includeShared = true; // Boolean | Specifies whether to include the account sharing settings in the response.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user is invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The area of the account entries.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of the user types.
        Integer count = 1234; // Integer | The number of items to retrieve in a request.
        Integer startIndex = 1234; // Integer | The starting index for the query results.
        String filterSeparator = "some text"; // String | Specifies the separator used in filter expressions.
        String filterValue = "some text"; // String | The text filter applied to the accounts search query.
        try {
            ObjectArrayWrapper result = apiInstance.getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getAccountsEntriesWithRoomsShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getSearch

> EmployeeFullArrayWrapper getSearch(query, filterBy, filterValue)

Search usersReturns a list of users matching the search query.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-search/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The search query. | |
| **filterBy** | **String**| Specifies a filter criteria for the user search query. | [optional] |
| **filterValue** | **String**| The value used for filtering users, allowing additional constraints for the query. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        String query = "some text"; // String | The search query.
        String filterBy = "some text"; // String | Specifies a filter criteria for the user search query.
        String filterValue = "some text"; // String | The value used for filtering users, allowing additional constraints for the query.
        try {
            EmployeeFullArrayWrapper result = apiInstance.getSearch(query, filterBy, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getSearch");
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
| **200** | List of users with the detailed information |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getSimpleByFilter

> EmployeeArrayWrapper getSimpleByFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)

Search users by extended filterReturns a list of users matching the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-simple-by-filter/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **UUID**| The group ID. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| The user type. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**List&lt;Integer&gt;**](Integer.md)| The list of user types. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **Boolean**| Specifies if the user is an administrator or not. | [optional] |
| **payments** | [**Payments**](.md)| The user payment status. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| The account login type. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| The quota filter (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **Boolean**| Specifies whether the user should be a member of a group or not. | [optional] |
| **excludeGroup** | **Boolean**| Specifies whether the user should be a member of the group with the specified ID. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The filter area. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The maximum number of items to be retrieved in the response. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first item to be retrieved in a filtered result set. | [optional] |
| **sortBy** | **String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **String**| Represents the separator used to split filter criteria in query parameters. | [optional] |
| **filterValue** | **String**| The search text used to filter results based on user input. | [optional] |

### Return type

[**EmployeeArrayWrapper**](EmployeeArrayWrapper.md)

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
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        UUID groupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The group ID.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        EmployeeType employeeType = EmployeeType.fromValue("All"); // EmployeeType | The user type.
        List<Integer> employeeTypes = Arrays.asList(new ArrayList<>()); // List<Integer> | The list of user types.
        Boolean isAdministrator = true; // Boolean | Specifies if the user is an administrator or not.
        Payments payments = Payments.fromValue("0"); // Payments | The user payment status.
        AccountLoginType accountLoginType = AccountLoginType.fromValue("0"); // AccountLoginType | The account login type.
        QuotaFilter quotaFilter = QuotaFilter.fromValue("0"); // QuotaFilter | The quota filter (All - 0, Default - 1, Custom - 2).
        Boolean withoutGroup = true; // Boolean | Specifies whether the user should be a member of a group or not.
        Boolean excludeGroup = true; // Boolean | Specifies whether the user should be a member of the group with the specified ID.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user is invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The filter area.
        Integer count = 1234; // Integer | The maximum number of items to be retrieved in the response.
        Integer startIndex = 1234; // Integer | The zero-based index of the first item to be retrieved in a filtered result set.
        String sortBy = "some text"; // String | Specifies the property or field name by which the results should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterSeparator = "some text"; // String | Represents the separator used to split filter criteria in query parameters.
        String filterValue = "some text"; // String | The search text used to filter results based on user input.
        try {
            EmployeeArrayWrapper result = apiInstance.getSimpleByFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getSimpleByFilter");
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
| **200** | List of users |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getUsersWithFilesShared

> EmployeeFullArrayWrapper getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get users with file sharing settingsReturns the users with the sharing settings in a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **Integer**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **String**| The filter text value used for searching or filtering user results. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the user sharing settings or not.
        Boolean includeShared = true; // Boolean | Specifies whether to include the user sharing settings or not.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user was invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The user area.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of user types.
        Integer count = 1234; // Integer | The maximum number of users to be retrieved in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first record to retrieve in a paged query.
        String filterSeparator = "some text"; // String | The character or string used to separate multiple filter values in a filtering query.
        String filterValue = "some text"; // String | The filter text value used for searching or filtering user results.
        try {
            EmployeeFullArrayWrapper result = apiInstance.getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getUsersWithFilesShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getUsersWithFoldersShared

> EmployeeFullArrayWrapper getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get users with folder sharing settingsReturns the users with the sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **Integer**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **String**| The filter text value used for searching or filtering user results. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the user sharing settings or not.
        Boolean includeShared = true; // Boolean | Specifies whether to include the user sharing settings or not.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user was invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The user area.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of user types.
        Integer count = 1234; // Integer | The maximum number of users to be retrieved in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first record to retrieve in a paged query.
        String filterSeparator = "some text"; // String | The character or string used to separate multiple filter values in a filtering query.
        String filterValue = "some text"; // String | The filter text value used for searching or filtering user results.
        try {
            EmployeeFullArrayWrapper result = apiInstance.getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getUsersWithFoldersShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## getUsersWithRoomShared

> EmployeeFullArrayWrapper getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Get users with room sharing settingsReturns the users with the sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **Integer**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **String**| The filter text value used for searching or filtering user results. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        Integer id = 9846; // Integer | The user ID.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        Boolean excludeShared = true; // Boolean | Specifies whether to exclude the user sharing settings or not.
        Boolean includeShared = true; // Boolean | Specifies whether to include the user sharing settings or not.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user was invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The user area.
        List<EmployeeType> employeeTypes = Arrays.asList(new ArrayList<>()); // List<EmployeeType> | The list of user types.
        Integer count = 1234; // Integer | The maximum number of users to be retrieved in the request.
        Integer startIndex = 1234; // Integer | The zero-based index of the first record to retrieve in a paged query.
        String filterSeparator = "some text"; // String | The character or string used to separate multiple filter values in a filtering query.
        String filterValue = "some text"; // String | The filter text value used for searching or filtering user results.
        try {
            EmployeeFullArrayWrapper result = apiInstance.getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#getUsersWithRoomShared");
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
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## searchUsersByExtendedFilter

> EmployeeFullArrayWrapper searchUsersByExtendedFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)

Search users with detailed information by extended filterReturns a list of users with full information about them matching the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-extended-filter/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **UUID**| The group ID. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| The user type. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**List&lt;Integer&gt;**](Integer.md)| The list of user types. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **Boolean**| Specifies if the user is an administrator or not. | [optional] |
| **payments** | [**Payments**](.md)| The user payment status. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| The account login type. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| The quota filter (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **Boolean**| Specifies whether the user should be a member of a group or not. | [optional] |
| **excludeGroup** | **Boolean**| Specifies whether the user should be a member of the group with the specified ID. | [optional] |
| **invitedByMe** | **Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The filter area. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The maximum number of items to be retrieved in the response. | [optional] |
| **startIndex** | **Integer**| The zero-based index of the first item to be retrieved in a filtered result set. | [optional] |
| **sortBy** | **String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **String**| Represents the separator used to split filter criteria in query parameters. | [optional] |
| **filterValue** | **String**| The search text used to filter results based on user input. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        UUID groupId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The group ID.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | The user activation status.
        EmployeeType employeeType = EmployeeType.fromValue("All"); // EmployeeType | The user type.
        List<Integer> employeeTypes = Arrays.asList(new ArrayList<>()); // List<Integer> | The list of user types.
        Boolean isAdministrator = true; // Boolean | Specifies if the user is an administrator or not.
        Payments payments = Payments.fromValue("0"); // Payments | The user payment status.
        AccountLoginType accountLoginType = AccountLoginType.fromValue("0"); // AccountLoginType | The account login type.
        QuotaFilter quotaFilter = QuotaFilter.fromValue("0"); // QuotaFilter | The quota filter (All - 0, Default - 1, Custom - 2).
        Boolean withoutGroup = true; // Boolean | Specifies whether the user should be a member of a group or not.
        Boolean excludeGroup = true; // Boolean | Specifies whether the user should be a member of the group with the specified ID.
        Boolean invitedByMe = true; // Boolean | Specifies whether the user is invited by the current user or not.
        UUID inviterId = UUID.fromString("75a5f745-f697-4418-b38d-0fe0d277e258"); // UUID | The inviter ID.
        Area area = Area.fromValue("0"); // Area | The filter area.
        Integer count = 1234; // Integer | The maximum number of items to be retrieved in the response.
        Integer startIndex = 1234; // Integer | The zero-based index of the first item to be retrieved in a filtered result set.
        String sortBy = "some text"; // String | Specifies the property or field name by which the results should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterSeparator = "some text"; // String | Represents the separator used to split filter criteria in query parameters.
        String filterValue = "some text"; // String | The search text used to filter results based on user input.
        try {
            EmployeeFullArrayWrapper result = apiInstance.searchUsersByExtendedFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchUsersByExtendedFilter");
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
| **200** | List of users with the detailed information |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |


## searchUsersByQuery

> EmployeeArrayWrapper searchUsersByQuery(query)

Search users (using query parameters)Returns a list of users matching the search query. This method uses the query parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-query/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The search query. | [optional] |

### Return type

[**EmployeeArrayWrapper**](EmployeeArrayWrapper.md)

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
        String query = "some text"; // String | The search query.
        try {
            EmployeeArrayWrapper result = apiInstance.searchUsersByQuery(query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchUsersByQuery");
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
| **200** | List of users |  -  |
| **401** | Unauthorized |  -  |


## searchUsersByStatus

> EmployeeFullArrayWrapper searchUsersByStatus(status, query, filterBy, filterValue)

Search users by status filterReturns a list of users matching the status filter and search query.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-status/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**EmployeeStatus**](.md)| The user status. | [enum: 1, 2, 4, 5, 7] |
| **query** | **String**| The advanced search query. | [optional] |
| **filterBy** | **String**| Specifies the criteria used to filter search results in advanced queries. | [optional] |
| **filterValue** | **String**| The value used to filter the search query. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
        EmployeeStatus status = EmployeeStatus.fromValue("1"); // EmployeeStatus | The user status.
        String query = "some text"; // String | The advanced search query.
        String filterBy = "some text"; // String | Specifies the criteria used to filter search results in advanced queries.
        String filterValue = "some text"; // String | The value used to filter the search query.
        try {
            EmployeeFullArrayWrapper result = apiInstance.searchUsersByStatus(status, query, filterBy, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchUsersByStatus");
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
| **200** | List of users with the detailed information |  -  |
| **401** | Unauthorized |  -  |
| **403** | No permissions to perform this action |  -  |

