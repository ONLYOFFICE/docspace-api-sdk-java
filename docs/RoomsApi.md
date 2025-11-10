# onlyoffice.docspace.api.sdk.org.openapitools.client.api.RoomsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRoomTags**](RoomsApi.md#addRoomTags) | **PUT** /api/2.0/files/rooms/{id}/tags |  |
| [**archiveRoom**](RoomsApi.md#archiveRoom) | **PUT** /api/2.0/files/rooms/{id}/archive |  |
| [**changeRoomCover**](RoomsApi.md#changeRoomCover) | **POST** /api/2.0/files/rooms/{id}/cover |  |
| [**createRoom**](RoomsApi.md#createRoom) | **POST** /api/2.0/files/rooms |  |
| [**createRoomFromTemplate**](RoomsApi.md#createRoomFromTemplate) | **POST** /api/2.0/files/rooms/fromtemplate |  |
| [**createRoomLogo**](RoomsApi.md#createRoomLogo) | **POST** /api/2.0/files/rooms/{id}/logo |  |
| [**createRoomTag**](RoomsApi.md#createRoomTag) | **POST** /api/2.0/files/tags |  |
| [**createRoomTemplate**](RoomsApi.md#createRoomTemplate) | **POST** /api/2.0/files/roomtemplate |  |
| [**createRoomThirdParty**](RoomsApi.md#createRoomThirdParty) | **POST** /api/2.0/files/rooms/thirdparty/{id} |  |
| [**deleteCustomTags**](RoomsApi.md#deleteCustomTags) | **DELETE** /api/2.0/files/tags |  |
| [**deleteRoom**](RoomsApi.md#deleteRoom) | **DELETE** /api/2.0/files/rooms/{id} |  |
| [**deleteRoomLogo**](RoomsApi.md#deleteRoomLogo) | **DELETE** /api/2.0/files/rooms/{id}/logo |  |
| [**deleteRoomTags**](RoomsApi.md#deleteRoomTags) | **DELETE** /api/2.0/files/rooms/{id}/tags |  |
| [**getNewRoomItems**](RoomsApi.md#getNewRoomItems) | **GET** /api/2.0/files/rooms/{id}/news |  |
| [**getPublicSettings**](RoomsApi.md#getPublicSettings) | **GET** /api/2.0/files/roomtemplate/{id}/public |  |
| [**getRoomCovers**](RoomsApi.md#getRoomCovers) | **GET** /api/2.0/files/rooms/covers |  |
| [**getRoomCreatingStatus**](RoomsApi.md#getRoomCreatingStatus) | **GET** /api/2.0/files/rooms/fromtemplate/status |  |
| [**getRoomIndexExport**](RoomsApi.md#getRoomIndexExport) | **GET** /api/2.0/files/rooms/indexexport |  |
| [**getRoomInfo**](RoomsApi.md#getRoomInfo) | **GET** /api/2.0/files/rooms/{id} |  |
| [**getRoomLinks**](RoomsApi.md#getRoomLinks) | **GET** /api/2.0/files/rooms/{id}/links |  |
| [**getRoomSecurityInfo**](RoomsApi.md#getRoomSecurityInfo) | **GET** /api/2.0/files/rooms/{id}/share |  |
| [**getRoomTagsInfo**](RoomsApi.md#getRoomTagsInfo) | **GET** /api/2.0/files/tags |  |
| [**getRoomTemplateCreatingStatus**](RoomsApi.md#getRoomTemplateCreatingStatus) | **GET** /api/2.0/files/roomtemplate/status |  |
| [**getRoomsFolder**](RoomsApi.md#getRoomsFolder) | **GET** /api/2.0/files/rooms |  |
| [**getRoomsNewItems**](RoomsApi.md#getRoomsNewItems) | **GET** /api/2.0/files/rooms/news |  |
| [**getRoomsPrimaryExternalLink**](RoomsApi.md#getRoomsPrimaryExternalLink) | **GET** /api/2.0/files/rooms/{id}/link |  |
| [**pinRoom**](RoomsApi.md#pinRoom) | **PUT** /api/2.0/files/rooms/{id}/pin |  |
| [**reorderRoom**](RoomsApi.md#reorderRoom) | **PUT** /api/2.0/files/rooms/{id}/reorder |  |
| [**resendEmailInvitations**](RoomsApi.md#resendEmailInvitations) | **POST** /api/2.0/files/rooms/{id}/resend |  |
| [**setPublicSettings**](RoomsApi.md#setPublicSettings) | **PUT** /api/2.0/files/roomtemplate/public |  |
| [**setRoomLink**](RoomsApi.md#setRoomLink) | **PUT** /api/2.0/files/rooms/{id}/links |  |
| [**setRoomSecurity**](RoomsApi.md#setRoomSecurity) | **PUT** /api/2.0/files/rooms/{id}/share |  |
| [**startRoomIndexExport**](RoomsApi.md#startRoomIndexExport) | **POST** /api/2.0/files/rooms/{id}/indexexport |  |
| [**terminateRoomIndexExport**](RoomsApi.md#terminateRoomIndexExport) | **DELETE** /api/2.0/files/rooms/indexexport |  |
| [**unarchiveRoom**](RoomsApi.md#unarchiveRoom) | **PUT** /api/2.0/files/rooms/{id}/unarchive |  |
| [**unpinRoom**](RoomsApi.md#unpinRoom) | **PUT** /api/2.0/files/rooms/{id}/unpin |  |
| [**updateRoom**](RoomsApi.md#updateRoom) | **PUT** /api/2.0/files/rooms/{id} |  |
| [**uploadRoomLogo**](RoomsApi.md#uploadRoomLogo) | **POST** /api/2.0/files/logos |  |



## addRoomTags

> FolderIntegerWrapper addRoomTags(id, batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room Id. | |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room Id.
        BatchTagsRequestDto batchTagsRequestDto = new BatchTagsRequestDto(); // BatchTagsRequestDto | The parameters for managing tags.
        try {
            FolderIntegerWrapper result = apiInstance.addRoomTags(id, batchTagsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#addRoomTags");
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
| **200** | Room information |  -  |
| **403** | You don&#39;t have permission to edit the room |  -  |


## archiveRoom

> FileOperationWrapper archiveRoom(id, archiveRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        ArchiveRoomRequest archiveRoomRequest = new ArchiveRoomRequest(); // ArchiveRoomRequest | The parameters for archiving a room.
        try {
            FileOperationWrapper result = apiInstance.archiveRoom(id, archiveRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#archiveRoom");
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
| **200** | File operation |  -  |


## changeRoomCover

> FolderIntegerWrapper changeRoomCover(id, coverRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **coverRequestDto** | [**CoverRequestDto**](CoverRequestDto.md)| The request parameters to change the room cover. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        CoverRequestDto coverRequestDto = new CoverRequestDto(); // CoverRequestDto | The request parameters to change the room cover.
        try {
            FolderIntegerWrapper result = apiInstance.changeRoomCover(id, coverRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#changeRoomCover");
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
| **200** | Room cover |  -  |
| **403** | You don&#39;t have permission to change cover |  -  |
| **404** | The required room was not found |  -  |


## createRoom

> FolderIntegerWrapper createRoom(createRoomRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createRoomRequestDto** | [**CreateRoomRequestDto**](CreateRoomRequestDto.md)|  | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        CreateRoomRequestDto createRoomRequestDto = new CreateRoomRequestDto(); // CreateRoomRequestDto | 
        try {
            FolderIntegerWrapper result = apiInstance.createRoom(createRoomRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoom");
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
| **200** | Room information |  -  |


## createRoomFromTemplate

> RoomFromTemplateStatusWrapper createRoomFromTemplate(createRoomFromTemplateDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createRoomFromTemplateDto** | [**CreateRoomFromTemplateDto**](CreateRoomFromTemplateDto.md)|  | [optional] |

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        CreateRoomFromTemplateDto createRoomFromTemplateDto = new CreateRoomFromTemplateDto(); // CreateRoomFromTemplateDto | 
        try {
            RoomFromTemplateStatusWrapper result = apiInstance.createRoomFromTemplate(createRoomFromTemplateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoomFromTemplate");
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
| **200** | Status |  -  |


## createRoomLogo

> FolderIntegerWrapper createRoomLogo(id, logoRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **logoRequest** | [**LogoRequest**](LogoRequest.md)| The logo request parameters. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        LogoRequest logoRequest = new LogoRequest(); // LogoRequest | The logo request parameters.
        try {
            FolderIntegerWrapper result = apiInstance.createRoomLogo(id, logoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoomLogo");
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
| **200** | Room information |  -  |
| **404** | The required room was not found |  -  |


## createRoomTag

> ObjectWrapper createRoomTag(createTagRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTagRequestDto** | [**CreateTagRequestDto**](CreateTagRequestDto.md)|  | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        CreateTagRequestDto createTagRequestDto = new CreateTagRequestDto(); // CreateTagRequestDto | 
        try {
            ObjectWrapper result = apiInstance.createRoomTag(createTagRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoomTag");
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
| **200** | New tag name |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## createRoomTemplate

> RoomTemplateStatusWrapper createRoomTemplate(roomTemplateDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roomTemplateDto** | [**RoomTemplateDto**](RoomTemplateDto.md)|  | [optional] |

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        RoomTemplateDto roomTemplateDto = new RoomTemplateDto(); // RoomTemplateDto | 
        try {
            RoomTemplateStatusWrapper result = apiInstance.createRoomTemplate(roomTemplateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoomTemplate");
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
| **200** | Status |  -  |


## createRoomThirdParty

> FolderStringWrapper createRoomThirdParty(id, createThirdPartyRoom)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the folder in the third-party storage in which the contents of the room will be stored. | |
| **createThirdPartyRoom** | [**CreateThirdPartyRoom**](CreateThirdPartyRoom.md)| The third-party room information. | |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        String id = "9846"; // String | The ID of the folder in the third-party storage in which the contents of the room will be stored.
        CreateThirdPartyRoom createThirdPartyRoom = new CreateThirdPartyRoom(); // CreateThirdPartyRoom | The third-party room information.
        try {
            FolderStringWrapper result = apiInstance.createRoomThirdParty(id, createThirdPartyRoom);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoomThirdParty");
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
| **200** | Room information |  -  |


## deleteCustomTags

> deleteCustomTags(batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        BatchTagsRequestDto batchTagsRequestDto = new BatchTagsRequestDto(); // BatchTagsRequestDto | 
        try {
            apiInstance.deleteCustomTags(batchTagsRequestDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#deleteCustomTags");
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
| **200** | Ok |  -  |
| **403** | You don&#39;t have enough permission to perform the operation |  -  |


## deleteRoom

> FileOperationWrapper deleteRoom(id, deleteRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **deleteRoomRequest** | [**DeleteRoomRequest**](DeleteRoomRequest.md)| The parameters for deleting a room. | |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        DeleteRoomRequest deleteRoomRequest = new DeleteRoomRequest(); // DeleteRoomRequest | The parameters for deleting a room.
        try {
            FileOperationWrapper result = apiInstance.deleteRoom(id, deleteRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#deleteRoom");
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
| **200** | File operation |  -  |


## deleteRoomLogo

> FolderIntegerWrapper deleteRoomLogo(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FolderIntegerWrapper result = apiInstance.deleteRoomLogo(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#deleteRoomLogo");
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
| **200** | Room information |  -  |


## deleteRoomTags

> FolderIntegerWrapper deleteRoomTags(id, batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room Id. | |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room Id.
        BatchTagsRequestDto batchTagsRequestDto = new BatchTagsRequestDto(); // BatchTagsRequestDto | The parameters for managing tags.
        try {
            FolderIntegerWrapper result = apiInstance.deleteRoomTags(id, batchTagsRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#deleteRoomTags");
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
| **200** | Room information |  -  |
| **403** | You don&#39;t have permission to edit the room |  -  |


## getNewRoomItems

> NewItemsFileEntryBaseArrayWrapper getNewRoomItems(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**NewItemsFileEntryBaseArrayWrapper**](NewItemsFileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            NewItemsFileEntryBaseArrayWrapper result = apiInstance.getNewRoomItems(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getNewRoomItems");
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
| **200** | List of file entry information |  -  |


## getPublicSettings

> BooleanWrapper getPublicSettings(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room template ID. | |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room template ID.
        try {
            BooleanWrapper result = apiInstance.getPublicSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getPublicSettings");
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


## getRoomCovers

> CoversResultArrayWrapper getRoomCovers()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**CoversResultArrayWrapper**](CoversResultArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            CoversResultArrayWrapper result = apiInstance.getRoomCovers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomCovers");
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
| **200** | Gets room cover |  -  |


## getRoomCreatingStatus

> RoomFromTemplateStatusWrapper getRoomCreatingStatus()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            RoomFromTemplateStatusWrapper result = apiInstance.getRoomCreatingStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomCreatingStatus");
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
| **200** | Status |  -  |


## getRoomIndexExport

> DocumentBuilderTaskWrapper getRoomIndexExport()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            DocumentBuilderTaskWrapper result = apiInstance.getRoomIndexExport();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomIndexExport");
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


## getRoomInfo

> FolderIntegerWrapper getRoomInfo(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FolderIntegerWrapper result = apiInstance.getRoomInfo(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomInfo");
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
| **200** | Room information |  -  |


## getRoomLinks

> FileShareArrayWrapper getRoomLinks(id, type)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **type** | [**LinkType**](.md)| The link type. | [optional] [enum: 0, 1] |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        LinkType type = LinkType.fromValue("0"); // LinkType | The link type.
        try {
            FileShareArrayWrapper result = apiInstance.getRoomLinks(id, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomLinks");
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
| **200** | Room security information |  -  |


## getRoomSecurityInfo

> FileShareArrayWrapper getRoomSecurityInfo(id, filterType, count, startIndex, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **filterType** | [**ShareFilterType**](.md)| The filter type of the access rights. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32] |
| **count** | **Integer**| The number of items to be retrieved or processed. | [optional] |
| **startIndex** | **Integer**| The starting index of the items to retrieve in a paginated request. | [optional] |
| **filterValue** | **String**| The text filter value used for filtering room security information. | [optional] |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        ShareFilterType filterType = ShareFilterType.fromValue("0"); // ShareFilterType | The filter type of the access rights.
        Integer count = 1234; // Integer | The number of items to be retrieved or processed.
        Integer startIndex = 1234; // Integer | The starting index of the items to retrieve in a paginated request.
        String filterValue = "some text"; // String | The text filter value used for filtering room security information.
        try {
            FileShareArrayWrapper result = apiInstance.getRoomSecurityInfo(id, filterType, count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomSecurityInfo");
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
| **200** | Security information of room files |  -  |


## getRoomTagsInfo

> ObjectArrayWrapper getRoomTagsInfo(count, startIndex, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-tags-info/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **count** | **Integer**| Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set. | [optional] |
| **startIndex** | **Integer**| Represents the starting index from which the tags&#39; information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins. | [optional] |
| **filterValue** | **String**| Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer count = 1234; // Integer | Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set.
        Integer startIndex = 1234; // Integer | Represents the starting index from which the tags' information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins.
        String filterValue = "some text"; // String | Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information.
        try {
            ObjectArrayWrapper result = apiInstance.getRoomTagsInfo(count, startIndex, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomTagsInfo");
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
| **200** | List of tag names |  -  |


## getRoomTemplateCreatingStatus

> RoomTemplateStatusWrapper getRoomTemplateCreatingStatus()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            RoomTemplateStatusWrapper result = apiInstance.getRoomTemplateCreatingStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomTemplateCreatingStatus");
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
| **200** | Status |  -  |


## getRoomsFolder

> FolderContentIntegerWrapper getRoomsFolder(type, subjectId, searchArea, withoutTags, tags, excludeSubject, provider, subjectFilter, quotaFilter, storageFilter, count, startIndex, sortBy, sortOrder, filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-folder/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | [**List&lt;RoomType&gt;**](RoomType.md)| The filter by room type. | [optional] |
| **subjectId** | **String**| The filter by user ID. | [optional] |
| **searchArea** | [**SearchArea**](.md)| The room search area (Active, Archive, Any, Recent by links). | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **withoutTags** | **Boolean**| Specifies whether to search by tags or not. | [optional] |
| **tags** | **String**| The tags in the serialized format. | [optional] |
| **excludeSubject** | **Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **provider** | [**ProviderFilter**](.md)| The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage). | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9] |
| **subjectFilter** | [**SubjectFilter**](.md)| The filter by user (Owner - 0, Member - 1). | [optional] [enum: 0, 1] |
| **quotaFilter** | [**QuotaFilter**](.md)| The filter by quota (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **storageFilter** | [**StorageFilter**](.md)| The filter by storage (None - 0, Internal - 1, ThirdParty - 2). | [optional] [enum: 0, 1, 2] |
| **count** | **Integer**| Specifies the maximum number of items to retrieve. | [optional] |
| **startIndex** | **Integer**| The index from which to start retrieving the room content. | [optional] |
| **sortBy** | **String**| Specifies the field by which the room content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **String**| The text filter value used to refine search or query operations. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        List<RoomType> type = Arrays.asList(new ArrayList<>()); // List<RoomType> | The filter by room type.
        String subjectId = "some text"; // String | The filter by user ID.
        SearchArea searchArea = SearchArea.fromValue("0"); // SearchArea | The room search area (Active, Archive, Any, Recent by links).
        Boolean withoutTags = true; // Boolean | Specifies whether to search by tags or not.
        String tags = "some text"; // String | The tags in the serialized format.
        Boolean excludeSubject = true; // Boolean | Specifies whether to exclude search by user or group ID.
        ProviderFilter provider = ProviderFilter.fromValue("0"); // ProviderFilter | The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage).
        SubjectFilter subjectFilter = SubjectFilter.fromValue("0"); // SubjectFilter | The filter by user (Owner - 0, Member - 1).
        QuotaFilter quotaFilter = QuotaFilter.fromValue("0"); // QuotaFilter | The filter by quota (All - 0, Default - 1, Custom - 2).
        StorageFilter storageFilter = StorageFilter.fromValue("0"); // StorageFilter | The filter by storage (None - 0, Internal - 1, ThirdParty - 2).
        Integer count = 1234; // Integer | Specifies the maximum number of items to retrieve.
        Integer startIndex = 1234; // Integer | The index from which to start retrieving the room content.
        String sortBy = "some text"; // String | Specifies the field by which the room content should be sorted.
        SortOrder sortOrder = SortOrder.fromValue("0"); // SortOrder | The order in which the results are sorted.
        String filterValue = "some text"; // String | The text filter value used to refine search or query operations.
        try {
            FolderContentIntegerWrapper result = apiInstance.getRoomsFolder(type, subjectId, searchArea, withoutTags, tags, excludeSubject, provider, subjectFilter, quotaFilter, storageFilter, count, startIndex, sortBy, sortOrder, filterValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomsFolder");
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
| **200** | Returns the contents of the Rooms section |  -  |
| **403** | You don&#39;t have enough permission to view the room content |  -  |


## getRoomsNewItems

> NewItemsRoomNewItemsArrayWrapper getRoomsNewItems()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/).

### Parameters

This endpoint does not need any parameter.

### Return type

[**NewItemsRoomNewItemsArrayWrapper**](NewItemsRoomNewItemsArrayWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            NewItemsRoomNewItemsArrayWrapper result = apiInstance.getRoomsNewItems();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomsNewItems");
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
| **200** | List of new items |  -  |


## getRoomsPrimaryExternalLink

> FileShareWrapper getRoomsPrimaryExternalLink(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FileShareWrapper result = apiInstance.getRoomsPrimaryExternalLink(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#getRoomsPrimaryExternalLink");
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
| **200** | Room security information |  -  |
| **404** | Not Found |  -  |


## pinRoom

> FolderIntegerWrapper pinRoom(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FolderIntegerWrapper result = apiInstance.pinRoom(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#pinRoom");
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
| **200** | Room information |  -  |


## reorderRoom

> FolderIntegerWrapper reorderRoom(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FolderIntegerWrapper result = apiInstance.reorderRoom(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#reorderRoom");
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
| **200** | Room information |  -  |


## resendEmailInvitations

> resendEmailInvitations(id, userInvitation)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **userInvitation** | [**UserInvitation**](UserInvitation.md)| The user invitation parameters. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        UserInvitation userInvitation = new UserInvitation(); // UserInvitation | The user invitation parameters.
        try {
            apiInstance.resendEmailInvitations(id, userInvitation);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#resendEmailInvitations");
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
| **200** | Ok |  -  |


## setPublicSettings

> setPublicSettings(setPublicDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **setPublicDto** | [**SetPublicDto**](SetPublicDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        SetPublicDto setPublicDto = new SetPublicDto(); // SetPublicDto | 
        try {
            apiInstance.setPublicSettings(setPublicDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#setPublicSettings");
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
| **200** | Ok |  -  |


## setRoomLink

> FileShareWrapper setRoomLink(id, roomLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **roomLinkRequest** | [**RoomLinkRequest**](RoomLinkRequest.md)| The room link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        RoomLinkRequest roomLinkRequest = new RoomLinkRequest(); // RoomLinkRequest | The room link parameters.
        try {
            FileShareWrapper result = apiInstance.setRoomLink(id, roomLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#setRoomLink");
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
| **200** | Room security information |  -  |


## setRoomSecurity

> RoomSecurityWrapper setRoomSecurity(id, roomInvitationRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **roomInvitationRequest** | [**RoomInvitationRequest**](RoomInvitationRequest.md)| The room invitation request. | |

### Return type

[**RoomSecurityWrapper**](RoomSecurityWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        RoomInvitationRequest roomInvitationRequest = new RoomInvitationRequest(); // RoomInvitationRequest | The room invitation request.
        try {
            RoomSecurityWrapper result = apiInstance.setRoomSecurity(id, roomInvitationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#setRoomSecurity");
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
| **200** | Room security information |  -  |


## startRoomIndexExport

> DocumentBuilderTaskWrapper startRoomIndexExport(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            DocumentBuilderTaskWrapper result = apiInstance.startRoomIndexExport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#startRoomIndexExport");
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
| **501** | Folder indexing is turned off |  -  |


## terminateRoomIndexExport

> terminateRoomIndexExport()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/).

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        try {
            apiInstance.terminateRoomIndexExport();
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#terminateRoomIndexExport");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## unarchiveRoom

> FileOperationWrapper unarchiveRoom(id, archiveRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        ArchiveRoomRequest archiveRoomRequest = new ArchiveRoomRequest(); // ArchiveRoomRequest | The parameters for archiving a room.
        try {
            FileOperationWrapper result = apiInstance.unarchiveRoom(id, archiveRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#unarchiveRoom");
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
| **200** | File operation |  -  |


## unpinRoom

> FolderIntegerWrapper unpinRoom(id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        try {
            FolderIntegerWrapper result = apiInstance.unpinRoom(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#unpinRoom");
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
| **200** | Room information |  -  |


## updateRoom

> FolderIntegerWrapper updateRoom(id, updateRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The room ID. | |
| **updateRoomRequest** | [**UpdateRoomRequest**](UpdateRoomRequest.md)| The request parameters for updating a room. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        Integer id = 9846; // Integer | The room ID.
        UpdateRoomRequest updateRoomRequest = new UpdateRoomRequest(); // UpdateRoomRequest | The request parameters for updating a room.
        try {
            FolderIntegerWrapper result = apiInstance.updateRoom(id, updateRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#updateRoom");
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
| **200** | Updated room information |  -  |


## uploadRoomLogo

> UploadResultWrapper uploadRoomLogo(formCollection)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **formCollection** | [**List&lt;KeyValuePairStringStringValues&gt;**](KeyValuePairStringStringValues.md)| The image data. | [optional] |

### Return type

[**UploadResultWrapper**](UploadResultWrapper.md)

### Authorization

No authorization required

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        List<KeyValuePairStringStringValues> formCollection = Arrays.asList(); // List<KeyValuePairStringStringValues> | The image data.
        try {
            UploadResultWrapper result = apiInstance.uploadRoomLogo(formCollection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#uploadRoomLogo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload result |  -  |
| **403** | No permissions to perform this action |  -  |

