# docspace-api-sdk.org.openapitools.client.api.SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountsEntriesWithFilesShared**](PeopleSearchApi.md#getAccountsEntriesWithFilesShared) | **GET** /api/2.0/accounts/file/{id}/search | Search accounts for a file |
| [**getAccountsEntriesWithFilesShared**](PeopleSearchApi.md#getAccountsEntriesWithFilesShared-third-party-storage) | **GET** /api/2.0/accounts/file/{id}/search | Search accounts for a file (third-party storage) |
| [**getAccountsEntriesWithFoldersShared**](PeopleSearchApi.md#getAccountsEntriesWithFoldersShared) | **GET** /api/2.0/accounts/folder/{id}/search | Search accounts for a folder |
| [**getAccountsEntriesWithFoldersShared**](PeopleSearchApi.md#getAccountsEntriesWithFoldersShared-third-party-storage) | **GET** /api/2.0/accounts/folder/{id}/search | Search accounts for a folder (third-party storage) |
| [**getAccountsEntriesWithRoomsShared**](PeopleSearchApi.md#getAccountsEntriesWithRoomsShared) | **GET** /api/2.0/accounts/room/{id}/search | Search accounts for a room |
| [**getAccountsEntriesWithRoomsShared**](PeopleSearchApi.md#getAccountsEntriesWithRoomsShared-third-party-storage) | **GET** /api/2.0/accounts/room/{id}/search | Search accounts for a room (third-party storage) |
| [**getSearch**](PeopleSearchApi.md#getSearch) | **GET** /api/2.0/people/@search/{query} | Search users |
| [**getSimpleByFilter**](PeopleSearchApi.md#getSimpleByFilter) | **GET** /api/2.0/people/simple/filter | Filter users in brief |
| [**getUsersWithFilesShared**](PeopleSearchApi.md#getUsersWithFilesShared) | **GET** /api/2.0/people/file/{id} | Search users for a file |
| [**getUsersWithFilesShared**](PeopleSearchApi.md#getUsersWithFilesShared-third-party-storage) | **GET** /api/2.0/people/file/{id} | Search users for a file (third-party storage) |
| [**getUsersWithFoldersShared**](PeopleSearchApi.md#getUsersWithFoldersShared) | **GET** /api/2.0/people/folder/{id} | Search users for a folder |
| [**getUsersWithFoldersShared**](PeopleSearchApi.md#getUsersWithFoldersShared-third-party-storage) | **GET** /api/2.0/people/folder/{id} | Search users for a folder (third-party storage) |
| [**getUsersWithRoomShared**](PeopleSearchApi.md#getUsersWithRoomShared) | **GET** /api/2.0/people/room/{id} | Search users for a room |
| [**getUsersWithRoomShared**](PeopleSearchApi.md#getUsersWithRoomShared-third-party-storage) | **GET** /api/2.0/people/room/{id} | Search users for a room (third-party storage) |
| [**searchUsersByExtendedFilter**](PeopleSearchApi.md#searchUsersByExtendedFilter) | **GET** /api/2.0/people/filter | Filter users in detail |
| [**searchUsersByQuery**](PeopleSearchApi.md#searchUsersByQuery) | **GET** /api/2.0/people/search | Search users by query |
| [**searchUsersByStatus**](PeopleSearchApi.md#searchUsersByStatus) | **GET** /api/2.0/people/status/{status}/search | Search users by status filter |



## getAccountsEntriesWithFilesShared

> IAccountEntryArrayWrapper getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a fileSearches the portal users and groups that can be given access to the file with the ID given in the route, and  reports for each of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        Integer id = 1234; // Integer | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the file |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No file has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAccountsEntriesWithFilesShared (third-party storage)

> IAccountEntryArrayWrapper getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a file (third-party storage)Searches the portal users and groups that can be given access to the file with the ID given in the route, and  reports for each of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        String id = "sbox-42-L1JlcG9ydC5kb2N4"; // String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the file |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No file has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAccountsEntriesWithFoldersShared

> IAccountEntryArrayWrapper getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a folderSearches the portal users and groups that can be given access to the folder with the ID given in the route,  and reports for each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        Integer id = 1234; // Integer | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the folder |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No folder has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAccountsEntriesWithFoldersShared (third-party storage)

> IAccountEntryArrayWrapper getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a folder (third-party storage)Searches the portal users and groups that can be given access to the folder with the ID given in the route,  and reports for each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        String id = "sbox-42"; // String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the folder |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No folder has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAccountsEntriesWithRoomsShared

> IAccountEntryArrayWrapper getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a roomSearches the portal users and groups that can be given access to the room with the ID given in the route, and  reports for each of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        Integer id = 1234; // Integer | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the room |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No room has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getAccountsEntriesWithRoomsShared (third-party storage)

> IAccountEntryArrayWrapper getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search accounts for a room (third-party storage)Searches the portal users and groups that can be given access to the room with the ID given in the route, and  reports for each of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The search is read-only and needs `filterValue`: while it is empty the operation returns an empty list and a  total of 0 instead of every account, so it cannot be used to enumerate the portal.  `filterValue` is matched case-insensitively against the first name, the last name and the email; without  `filterSeparator` it is split on spaces and every term has to match, and with a separator it is split on that  separator and any term may match.  Matching groups are streamed first and users after them, both paged together by `count` and `startIndex`,  while the number of matches is reported in the total count of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account. | [optional] |

### Return type

[**IAccountEntryArrayWrapper**](IAccountEntryArrayWrapper.md)

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
        String id = "sbox-42"; // String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the users in the given account state: `Active` for a working account, `Terminated` for a disabled  one and `Pending` for one that has not accepted its invitation yet. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the users whose activation is in the given state: `NotActivated` for an account that has never  been activated, `Activated` for one that completed the activation, `Pending` for one whose invitation is  still open, and `AutoGenerated` for an account created by the portal itself. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when adding new  members. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when  `excludeShared` is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the users invited by the caller when true, and only the users invited by somebody else when false.  Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the users invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the users of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page, counting groups and users together. It defaults to 100, which is also the largest value  the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts, counted over the groups and users together. It defaults  to 0, and the total number of matches is reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to search for, matched case-insensitively against the first name, the last name and the email. It is  required in practice: while it is empty the search returns nothing at all rather than every account.
        try {
            IAccountEntryArrayWrapper result = apiInstance.getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue);
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
| **200** | The matching users and groups, each with its access state for the room |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | No permissions to perform this action |  -  |
| **404** | No room has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getSearch

> EmployeeFullArrayWrapper getSearch(query, filterBy, filterValue)

Search usersSearches the active accounts of the portal by a term taken from the path, and is the same search as  `GET api/2.0/people/search`, which takes the term in the query string instead.  Only a DocSpace administrator may call it; every other account, including a room admin, gets 403.  Only accounts with the `Active` status are searched, so a pending invitation and a disabled account are never  found - use `GET api/2.0/people/filter` to search across states.  The call is read-only and is not paged: every match is streamed, without a total.  `filterBy` set to `group` turns `text` into a group ID and keeps only the members of that group, so `text`  then has to be a valid identifier.  The answer holds full profiles.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-search/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The term to look for, taken from the route. Only accounts with the `Active` status are searched. | |
| **filterBy** | **String**| The only recognised value is `group`, which turns `filterValue` into a group ID and keeps only the members of  that group. Any other value, and omitting the field, applies no group filter. | [optional] |
| **filterValue** | **String**| The group ID to keep the members of, used only when `filterBy` is `group`. It has to be a valid identifier -  a group name is not accepted. | [optional] |

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
        String query = "John"; // String | The term to look for, taken from the route. Only accounts with the `Active` status are searched.
        String filterBy = "group"; // String | The only recognised value is `group`, which turns `filterValue` into a group ID and keeps only the members of  that group. Any other value, and omitting the field, applies no group filter.
        String filterValue = "00000000-0000-0000-0000-000000000000"; // String | The group ID to keep the members of, used only when `filterBy` is `group`. It has to be a valid identifier -  a group name is not accepted.
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
| **200** | The full profiles of the matching active accounts |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is not a DocSpace administrator |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getSimpleByFilter

> EmployeeArrayWrapper getSimpleByFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)

Filter users in briefReturns a page of portal accounts selected by the full set of account filters, with the short profile of each  of them - the identifying fields, the avatar and the display name, without the contacts, the groups or the  quota.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  It accepts exactly the same filters as `GET api/2.0/people/filter` and differs only in how much of each  profile comes back, so prefer this one for pickers, mentions and any list that shows names, and switch to the  other only when the full profile is needed.  Filters combine as conditions that all have to hold, and the same interactions apply: `withoutGroup` makes  `groupId` irrelevant, `employeeType` wins over `employeeTypes`, and `area` cancels the type filters that  contradict it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-simple-by-filter/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **UUID**| Keeps only the members of this group, or excludes them when `excludeGroup` is true. It is ignored when  `withoutGroup` is set. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| Keeps only the accounts of this single type: `DocSpaceAdmin`, `RoomAdmin`, `User` or `Guest`. When it is  sent it wins over `employeeTypes`, and a type that contradicts `area` is dropped. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**List&lt;Integer&gt;**](Integer.md)| Keeps the accounts of any of the listed types, combined as alternatives. It is ignored when `employeeType`  is also sent. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **Boolean**| Set it to true to keep only the DocSpace administrators and the module administrators. Setting it to false  is the same as omitting it and does not exclude administrators. | [optional] |
| **payments** | [**Payments**](.md)| Keeps only the accounts that take a paid seat when `Paid`, or only the guests and members that do not when  `Free`. Omit it to search both. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| Keeps only the accounts that sign in this way: `SSO`, `LDAP`, or `Standart` for an ordinary portal  password. Omit it to search all of them. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| Keeps only the accounts whose storage quota is the portal default when `Default`, or set individually when  `Custom`. `All`, which is the same as omitting the field, searches both. | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **Boolean**| Set it to true to keep only the accounts that belong to no group at all, which makes `groupId` and  `excludeGroup` irrelevant. | [optional] |
| **excludeGroup** | **Boolean**| Inverts `groupId`: with true the members of that group are left out instead of being the only ones kept. It  has no effect without `groupId`. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only. It also cancels the type filters that contradict  it. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **sortBy** | **String**| What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The direction of the ordering: `Ascending`, which is the default, or `Descending`. | [optional] [enum: 0, 1] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to apply  no text filter at all. | [optional] |

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
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        UUID groupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the members of this group, or excludes them when `excludeGroup` is true. It is ignored when  `withoutGroup` is set.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        EmployeeType employeeType = EmployeeType.fromValue("All"); // EmployeeType | Keeps only the accounts of this single type: `DocSpaceAdmin`, `RoomAdmin`, `User` or `Guest`. When it is  sent it wins over `employeeTypes`, and a type that contradicts `area` is dropped.
        List<Integer> employeeTypes = Arrays.asList(); // List<Integer> | Keeps the accounts of any of the listed types, combined as alternatives. It is ignored when `employeeType`  is also sent.
        Boolean isAdministrator = false; // Boolean | Set it to true to keep only the DocSpace administrators and the module administrators. Setting it to false  is the same as omitting it and does not exclude administrators.
        Payments payments = Payments.fromValue("0"); // Payments | Keeps only the accounts that take a paid seat when `Paid`, or only the guests and members that do not when  `Free`. Omit it to search both.
        AccountLoginType accountLoginType = AccountLoginType.fromValue("0"); // AccountLoginType | Keeps only the accounts that sign in this way: `SSO`, `LDAP`, or `Standart` for an ordinary portal  password. Omit it to search all of them.
        QuotaFilter quotaFilter = QuotaFilter.fromValue("0"); // QuotaFilter | Keeps only the accounts whose storage quota is the portal default when `Default`, or set individually when  `Custom`. `All`, which is the same as omitting the field, searches both.
        Boolean withoutGroup = false; // Boolean | Set it to true to keep only the accounts that belong to no group at all, which makes `groupId` and  `excludeGroup` irrelevant.
        Boolean excludeGroup = false; // Boolean | Inverts `groupId`: with true the members of that group are left out instead of being the only ones kept. It  has no effect without `groupId`.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only. It also cancels the type filters that contradict  it.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String sortBy = "DisplayName"; // String | What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The direction of the ordering: `Ascending`, which is the default, or `Descending`.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to apply  no text filter at all.
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
| **200** | A page of matching accounts, with their short profiles |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a member or a guest |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithFilesShared

> EmployeeFullArrayWrapper getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a fileReturns the accounts that are relevant to the file with the ID given in the route, and reports for each of  them whether it already has access to that file.  The caller only needs read access to the file, not the right to manage its access, but a guest may not call  it at all; an ID that matches no file answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/file/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        Integer id = 1234; // Integer | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the file |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the file |  -  |
| **404** | No file has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithFilesShared (third-party storage)

> EmployeeFullArrayWrapper getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a file (third-party storage)Returns the accounts that are relevant to the file with the ID given in the route, and reports for each of  them whether it already has access to that file.  The caller only needs read access to the file, not the right to manage its access, but a guest may not call  it at all; an ID that matches no file answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/file/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        String id = "sbox-42-L1JlcG9ydC5kb2N4"; // String | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the file |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the file |  -  |
| **404** | No file has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithFoldersShared

> EmployeeFullArrayWrapper getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a folderReturns the accounts that are relevant to the folder with the ID given in the route, and reports for each of  them whether it already has access to that folder.  The caller only needs read access to the folder, not the right to manage its access, but a guest may not call  it at all; an ID that matches no folder answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/folder/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        Integer id = 1234; // Integer | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the folder |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the folder |  -  |
| **404** | No folder has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithFoldersShared (third-party storage)

> EmployeeFullArrayWrapper getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a folder (third-party storage)Returns the accounts that are relevant to the folder with the ID given in the route, and reports for each of  them whether it already has access to that folder.  The caller only needs read access to the folder, not the right to manage its access, but a guest may not call  it at all; an ID that matches no folder answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/folder/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        String id = "sbox-42"; // String | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the folder |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the folder |  -  |
| **404** | No folder has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithRoomShared

> EmployeeFullArrayWrapper getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a roomReturns the accounts that are relevant to the room with the ID given in the route, and reports for each of  them whether it already has access to that room.  The caller only needs read access to the room, not the right to manage its access, but a guest may not call  it at all; an ID that matches no room answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/room/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        Integer id = 1234; // Integer | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the room |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the room |  -  |
| **404** | No room has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## getUsersWithRoomShared (third-party storage)

> EmployeeFullArrayWrapper getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)

Search users for a room (third-party storage)Returns the accounts that are relevant to the room with the ID given in the route, and reports for each of  them whether it already has access to that room.  The caller only needs read access to the room, not the right to manage its access, but a guest may not call  it at all; an ID that matches no room answers 404.  The call is read-only, works without a filter - leaving `filterValue` empty returns every matching account  rather than nothing - and is paged by `count` and `startIndex`, with the number of matches in the total count  of the response.  Pass `excludeShared` to keep only the accounts that have no access yet, `includeShared` to keep only those  that already have it, and neither to get both kinds with the `shared` field telling them apart.  A DocSpace administrator additionally sees the guests that are not related to the caller.  To search users and groups together, or to build an access dialog that needs the right to manage sharing, use  `GET api/2.0/accounts/room/{id}/search` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **Boolean**| Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false. | [optional] |
| **includeShared** | **Boolean**| Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**List&lt;EmployeeType&gt;**](EmployeeType.md)| Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type. | [optional] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to. | [optional] |

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
        String id = "sbox-42"; // String | The ID of the room, folder or file the search is run against, taken from the route. It is an integer for an  entry stored in DocSpace and a provider-specific string for an entry in a connected third-party storage.
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        Boolean excludeShared = false; // Boolean | Keeps only the accounts that do not have access to the entry yet, which is the set to offer when granting  access. It takes precedence over `includeShared`, and every returned entry has `shared` set to false.
        Boolean includeShared = false; // Boolean | Keeps only the accounts that already have access to the entry, which is the set to offer when changing or  revoking access. Every returned entry has `shared` set to true, and the flag is ignored when `excludeShared`  is also set.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only - and for a caller who is not a DocSpace  administrator, only the guests that caller is related to.
        List<EmployeeType> employeeTypes = Arrays.asList(); // List<EmployeeType> | Keeps only the accounts of the listed types, combined as alternatives. An empty list, which is the default,  searches every type.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split the  value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to get  every account the caller may offer access to.
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
| **200** | The matching accounts, each with its access state for the room |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a guest or cannot read the room |  -  |
| **404** | No room has the specified ID |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## searchUsersByExtendedFilter

> EmployeeFullArrayWrapper searchUsersByExtendedFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)

Filter users in detailReturns a page of portal accounts selected by the full set of account filters, with the complete profile of  each of them.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403,  and a DocSpace admin additionally sees the accounts an ordinary admin does not.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Filters combine as conditions that all have to hold, with three interactions worth knowing: `withoutGroup`  makes `groupId` irrelevant, `employeeType` wins over `employeeTypes` when both are sent, and `area` set to  `Guests` or `People` cancels the type filters that contradict it.  `GET api/2.0/people/simple/filter` accepts exactly the same filters and returns the short profile instead, so  use that one for pickers and lists and this one when the full profile is really needed.  It is available on an unpaid portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-extended-filter/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employeeStatus** | [**EmployeeStatus**](.md)| Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **UUID**| Keeps only the members of this group, or excludes them when `excludeGroup` is true. It is ignored when  `withoutGroup` is set. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| Keeps only the accounts of this single type: `DocSpaceAdmin`, `RoomAdmin`, `User` or `Guest`. When it is  sent it wins over `employeeTypes`, and a type that contradicts `area` is dropped. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**List&lt;Integer&gt;**](Integer.md)| Keeps the accounts of any of the listed types, combined as alternatives. It is ignored when `employeeType`  is also sent. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **Boolean**| Set it to true to keep only the DocSpace administrators and the module administrators. Setting it to false  is the same as omitting it and does not exclude administrators. | [optional] |
| **payments** | [**Payments**](.md)| Keeps only the accounts that take a paid seat when `Paid`, or only the guests and members that do not when  `Free`. Omit it to search both. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| Keeps only the accounts that sign in this way: `SSO`, `LDAP`, or `Standart` for an ordinary portal  password. Omit it to search all of them. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| Keeps only the accounts whose storage quota is the portal default when `Default`, or set individually when  `Custom`. `All`, which is the same as omitting the field, searches both. | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **Boolean**| Set it to true to keep only the accounts that belong to no group at all, which makes `groupId` and  `excludeGroup` irrelevant. | [optional] |
| **excludeGroup** | **Boolean**| Inverts `groupId`: with true the members of that group are left out instead of being the only ones kept. It  has no effect without `groupId`. | [optional] |
| **invitedByMe** | **Boolean**| Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation. | [optional] |
| **inviterId** | **UUID**| Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation. | [optional] |
| **area** | [**Area**](.md)| The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only. It also cancels the type filters that contradict  it. | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **Integer**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **sortBy** | **String**| What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The direction of the ordering: `Ascending`, which is the default, or `Descending`. | [optional] [enum: 0, 1] |
| **filterSeparator** | **String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **String**| The text to match against the first name, the last name and the email, case-insensitively. Omit it to apply  no text filter at all. | [optional] |

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
        EmployeeStatus employeeStatus = EmployeeStatus.fromValue("1"); // EmployeeStatus | Keeps only the accounts in the given state: `Active` for working accounts, `Terminated` for disabled ones  and `Pending` for open invitations. Omit it to search every state.
        UUID groupId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the members of this group, or excludes them when `excludeGroup` is true. It is ignored when  `withoutGroup` is set.
        EmployeeActivationStatus activationStatus = EmployeeActivationStatus.fromValue("0"); // EmployeeActivationStatus | Keeps only the accounts whose activation is in the given state: `NotActivated`, `Activated`, `Pending` or  `AutoGenerated`. Omit it to search every state.
        EmployeeType employeeType = EmployeeType.fromValue("All"); // EmployeeType | Keeps only the accounts of this single type: `DocSpaceAdmin`, `RoomAdmin`, `User` or `Guest`. When it is  sent it wins over `employeeTypes`, and a type that contradicts `area` is dropped.
        List<Integer> employeeTypes = Arrays.asList(); // List<Integer> | Keeps the accounts of any of the listed types, combined as alternatives. It is ignored when `employeeType`  is also sent.
        Boolean isAdministrator = false; // Boolean | Set it to true to keep only the DocSpace administrators and the module administrators. Setting it to false  is the same as omitting it and does not exclude administrators.
        Payments payments = Payments.fromValue("0"); // Payments | Keeps only the accounts that take a paid seat when `Paid`, or only the guests and members that do not when  `Free`. Omit it to search both.
        AccountLoginType accountLoginType = AccountLoginType.fromValue("0"); // AccountLoginType | Keeps only the accounts that sign in this way: `SSO`, `LDAP`, or `Standart` for an ordinary portal  password. Omit it to search all of them.
        QuotaFilter quotaFilter = QuotaFilter.fromValue("0"); // QuotaFilter | Keeps only the accounts whose storage quota is the portal default when `Default`, or set individually when  `Custom`. `All`, which is the same as omitting the field, searches both.
        Boolean withoutGroup = false; // Boolean | Set it to true to keep only the accounts that belong to no group at all, which makes `groupId` and  `excludeGroup` irrelevant.
        Boolean excludeGroup = false; // Boolean | Inverts `groupId`: with true the members of that group are left out instead of being the only ones kept. It  has no effect without `groupId`.
        Boolean invitedByMe = false; // Boolean | Keeps only the accounts invited by the caller when true, and only those invited by somebody else when  false. Omit it to search regardless of who sent the invitation.
        UUID inviterId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | Keeps only the accounts invited by the account with this ID. Omit it to search regardless of who sent the  invitation.
        Area area = Area.fromValue("0"); // Area | The part of the portal to search in: `All`, the default, searches members and guests together, `People`  leaves the guests out, and `Guests` returns guests only. It also cancels the type filters that contradict  it.
        Integer count = 25; // Integer | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
        Integer startIndex = 0; // Integer | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
        String sortBy = "DisplayName"; // String | What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The direction of the ordering: `Ascending`, which is the default, or `Descending`.
        String filterSeparator = ","; // String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match.
        String filterValue = "John"; // String | The text to match against the first name, the last name and the email, case-insensitively. Omit it to apply  no text filter at all.
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
| **200** | A page of matching accounts, with their full profiles |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is a member or a guest |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## searchUsersByQuery

> EmployeeFullArrayWrapper searchUsersByQuery(query)

Search users by querySearches the active accounts of the portal by a term passed in the query string, and is the same search as  `GET api/2.0/people/@search/{query}`, which takes the term in the path instead.  Only a DocSpace administrator may call it; every other account, including a room admin, gets 403.  Only accounts with the `Active` status are searched, so a pending invitation and a disabled account are never  found - use `GET api/2.0/people/filter` to search across states.  The call is read-only and is not paged: every match is streamed, without a total.  It takes the search term and nothing else - the group filter of  `GET api/2.0/people/@search/{query}` is not reachable here, because the handler forwards only `query` - so  use that operation when the result has to be narrowed to one group.  The answer holds full profiles, because the handler passes the request on to the operation that builds the  complete profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-query/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The term to look for. Only accounts with the `Active` status are searched, and this is the only parameter the  operation reads. | [optional] |

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
        String query = "John"; // String | The term to look for. Only accounts with the `Active` status are searched, and this is the only parameter the  operation reads.
        try {
            EmployeeFullArrayWrapper result = apiInstance.searchUsersByQuery(query);
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
| **200** | The full profiles of the matching active accounts |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is not a DocSpace administrator |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |


## searchUsersByStatus

> EmployeeFullArrayWrapper searchUsersByStatus(status, query, filterBy, filterValue)

Search users by status filterSearches the accounts that are in one particular state - the status is taken from the route - and whose name,  user name, email or contacts contain the search term.  Only a DocSpace administrator may call it; every other account, including a room admin, gets 403.  The call is read-only and is not paged: it matches in memory over every account of that status and streams  all of them, so it is meant for administrative lookups rather than for a user-facing list - use  `GET api/2.0/people/filter` when a page and a total are needed.  The term is matched as a case-insensitive substring and is required; `filterBy` set to `group` turns `text`  into a group ID and keeps only the members of that group, so `text` then has to be a valid identifier.  The answer holds full profiles, in no particular order.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-status/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**EmployeeStatus**](.md)| The account state to search in, taken from the route: `Active` for working accounts, `Terminated` for  disabled ones, `Pending` for open invitations, or `All` for every state. | [enum: 1, 2, 4, 5, 7] |
| **query** | **String**| The term to look for, matched as a case-insensitive substring of the first name, the last name, the user  name, the email and the contacts. It is required in practice, because the search cannot run without it. | [optional] |
| **filterBy** | **String**| The only recognised value is `group`, which turns `filterValue` into a group ID and keeps only the members of  that group. Any other value, and omitting the field, applies no group filter. | [optional] |
| **filterValue** | **String**| The group ID to keep the members of, used only when `filterBy` is `group`. It has to be a valid identifier -  a group name is not accepted. | [optional] |

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
        EmployeeStatus status = EmployeeStatus.fromValue("1"); // EmployeeStatus | The account state to search in, taken from the route: `Active` for working accounts, `Terminated` for  disabled ones, `Pending` for open invitations, or `All` for every state.
        String query = "John"; // String | The term to look for, matched as a case-insensitive substring of the first name, the last name, the user  name, the email and the contacts. It is required in practice, because the search cannot run without it.
        String filterBy = "group"; // String | The only recognised value is `group`, which turns `filterValue` into a group ID and keeps only the members of  that group. Any other value, and omitting the field, applies no group filter.
        String filterValue = "00000000-0000-0000-0000-000000000000"; // String | The group ID to keep the members of, used only when `filterBy` is `group`. It has to be a valid identifier -  a group name is not accepted.
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
| **200** | The full profiles of the matching accounts |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | The caller is not a DocSpace administrator |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests. |  * Retry-After -  <br>  |
| **500** | Internal Server Error. |  -  |
| **400** | Bad Request. |  -  |
| **502** | Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |
| **503** | Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON. |  -  |

