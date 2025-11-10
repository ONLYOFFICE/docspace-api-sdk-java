/*
 * (c) Copyright Ascensio System SIA 2025
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ArchiveRoomRequest;
import org.openapitools.client.model.BatchTagsRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CoverRequestDto;
import org.openapitools.client.model.CoversResultArrayWrapper;
import org.openapitools.client.model.CreateRoomFromTemplateDto;
import org.openapitools.client.model.CreateRoomRequestDto;
import org.openapitools.client.model.CreateTagRequestDto;
import org.openapitools.client.model.CreateThirdPartyRoom;
import org.openapitools.client.model.DeleteRoomRequest;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.FileOperationWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.FileShareWrapper;
import org.openapitools.client.model.FolderContentIntegerWrapper;
import org.openapitools.client.model.FolderIntegerWrapper;
import org.openapitools.client.model.FolderStringWrapper;
import org.openapitools.client.model.KeyValuePairStringStringValues;
import org.openapitools.client.model.LinkType;
import org.openapitools.client.model.LogoRequest;
import org.openapitools.client.model.NewItemsFileEntryBaseArrayWrapper;
import org.openapitools.client.model.NewItemsRoomNewItemsArrayWrapper;
import org.openapitools.client.model.ObjectArrayWrapper;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.ProviderFilter;
import org.openapitools.client.model.QuotaFilter;
import org.openapitools.client.model.RoomFromTemplateStatusWrapper;
import org.openapitools.client.model.RoomInvitationRequest;
import org.openapitools.client.model.RoomLinkRequest;
import org.openapitools.client.model.RoomSecurityWrapper;
import org.openapitools.client.model.RoomTemplateDto;
import org.openapitools.client.model.RoomTemplateStatusWrapper;
import org.openapitools.client.model.RoomType;
import org.openapitools.client.model.SearchArea;
import org.openapitools.client.model.SetPublicDto;
import org.openapitools.client.model.ShareFilterType;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.StorageFilter;
import org.openapitools.client.model.SubjectFilter;
import org.openapitools.client.model.UpdateRoomRequest;
import org.openapitools.client.model.UploadResultWrapper;
import org.openapitools.client.model.UserInvitation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class RoomsApi extends BaseApi {

  public RoomsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public RoomsApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public RoomsApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * 
   * 
   *
   * REST API Reference for addRoomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/
   *
   * @param id The room Id. (required)
   * @param batchTagsRequestDto The parameters for managing tags. (optional)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper addRoomTags(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto) throws ApiException {
    return this.addRoomTags(id, batchTagsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for addRoomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/
   *
   * @param id The room Id. (required)
   * @param batchTagsRequestDto The parameters for managing tags. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper addRoomTags(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = batchTagsRequestDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addRoomTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/tags"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for archiveRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/
   *
   * @param id The room ID. (required)
   * @param archiveRoomRequest The parameters for archiving a room. (optional)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper archiveRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ArchiveRoomRequest archiveRoomRequest) throws ApiException {
    return this.archiveRoom(id, archiveRoomRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for archiveRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/
   *
   * @param id The room ID. (required)
   * @param archiveRoomRequest The parameters for archiving a room. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper archiveRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ArchiveRoomRequest archiveRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = archiveRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling archiveRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/archive"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationWrapper> localVarReturnType = new TypeReference<FileOperationWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for changeRoomCover Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/
   *
   * @param id The room ID. (required)
   * @param coverRequestDto The request parameters to change the room cover. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper changeRoomCover(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull CoverRequestDto coverRequestDto) throws ApiException {
    return this.changeRoomCover(id, coverRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeRoomCover Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/
   *
   * @param id The room ID. (required)
   * @param coverRequestDto The request parameters to change the room cover. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper changeRoomCover(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull CoverRequestDto coverRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = coverRequestDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling changeRoomCover");
    }
    
    // verify the required parameter 'coverRequestDto' is set
    if (coverRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'coverRequestDto' when calling changeRoomCover");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/cover"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/
   *
   * @param createRoomRequestDto  (optional)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createRoom(@javax.annotation.Nullable CreateRoomRequestDto createRoomRequestDto) throws ApiException {
    return this.createRoom(createRoomRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/
   *
   * @param createRoomRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createRoom(@javax.annotation.Nullable CreateRoomRequestDto createRoomRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createRoomRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoomFromTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/
   *
   * @param createRoomFromTemplateDto  (optional)
   * @return RoomFromTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomFromTemplateStatusWrapper createRoomFromTemplate(@javax.annotation.Nullable CreateRoomFromTemplateDto createRoomFromTemplateDto) throws ApiException {
    return this.createRoomFromTemplate(createRoomFromTemplateDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoomFromTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/
   *
   * @param createRoomFromTemplateDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomFromTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomFromTemplateStatusWrapper createRoomFromTemplate(@javax.annotation.Nullable CreateRoomFromTemplateDto createRoomFromTemplateDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createRoomFromTemplateDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/fromtemplate";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<RoomFromTemplateStatusWrapper> localVarReturnType = new TypeReference<RoomFromTemplateStatusWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/
   *
   * @param id The room ID. (required)
   * @param logoRequest The logo request parameters. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createRoomLogo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull LogoRequest logoRequest) throws ApiException {
    return this.createRoomLogo(id, logoRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/
   *
   * @param id The room ID. (required)
   * @param logoRequest The logo request parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createRoomLogo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull LogoRequest logoRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = logoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createRoomLogo");
    }
    
    // verify the required parameter 'logoRequest' is set
    if (logoRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'logoRequest' when calling createRoomLogo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/logo"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoomTag Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/
   *
   * @param createTagRequestDto  (optional)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createRoomTag(@javax.annotation.Nullable CreateTagRequestDto createTagRequestDto) throws ApiException {
    return this.createRoomTag(createTagRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoomTag Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/
   *
   * @param createTagRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createRoomTag(@javax.annotation.Nullable CreateTagRequestDto createTagRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createTagRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/tags";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoomTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/
   *
   * @param roomTemplateDto  (optional)
   * @return RoomTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomTemplateStatusWrapper createRoomTemplate(@javax.annotation.Nullable RoomTemplateDto roomTemplateDto) throws ApiException {
    return this.createRoomTemplate(roomTemplateDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoomTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/
   *
   * @param roomTemplateDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomTemplateStatusWrapper createRoomTemplate(@javax.annotation.Nullable RoomTemplateDto roomTemplateDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = roomTemplateDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/roomtemplate";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<RoomTemplateStatusWrapper> localVarReturnType = new TypeReference<RoomTemplateStatusWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for createRoomThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/
   *
   * @param id The ID of the folder in the third-party storage in which the contents of the room will be stored. (required)
   * @param createThirdPartyRoom The third-party room information. (required)
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper createRoomThirdParty(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull CreateThirdPartyRoom createThirdPartyRoom) throws ApiException {
    return this.createRoomThirdParty(id, createThirdPartyRoom, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createRoomThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/
   *
   * @param id The ID of the folder in the third-party storage in which the contents of the room will be stored. (required)
   * @param createThirdPartyRoom The third-party room information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper createRoomThirdParty(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull CreateThirdPartyRoom createThirdPartyRoom, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createThirdPartyRoom;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createRoomThirdParty");
    }
    
    // verify the required parameter 'createThirdPartyRoom' is set
    if (createThirdPartyRoom == null) {
      throw new ApiException(400, "Missing the required parameter 'createThirdPartyRoom' when calling createRoomThirdParty");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/thirdparty/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderStringWrapper> localVarReturnType = new TypeReference<FolderStringWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for deleteCustomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/
   *
   * @param batchTagsRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomTags(@javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto) throws ApiException {
    this.deleteCustomTags(batchTagsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteCustomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/
   *
   * @param batchTagsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomTags(@javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = batchTagsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/tags";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for deleteRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/
   *
   * @param id The room ID. (required)
   * @param deleteRoomRequest The parameters for deleting a room. (required)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull DeleteRoomRequest deleteRoomRequest) throws ApiException {
    return this.deleteRoom(id, deleteRoomRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/
   *
   * @param id The room ID. (required)
   * @param deleteRoomRequest The parameters for deleting a room. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull DeleteRoomRequest deleteRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRoom");
    }
    
    // verify the required parameter 'deleteRoomRequest' is set
    if (deleteRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteRoomRequest' when calling deleteRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationWrapper> localVarReturnType = new TypeReference<FileOperationWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for deleteRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper deleteRoomLogo(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.deleteRoomLogo(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper deleteRoomLogo(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRoomLogo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/logo"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for deleteRoomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/
   *
   * @param id The room Id. (required)
   * @param batchTagsRequestDto The parameters for managing tags. (optional)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper deleteRoomTags(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto) throws ApiException {
    return this.deleteRoomTags(id, batchTagsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteRoomTags Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/
   *
   * @param id The room Id. (required)
   * @param batchTagsRequestDto The parameters for managing tags. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper deleteRoomTags(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable BatchTagsRequestDto batchTagsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = batchTagsRequestDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRoomTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/tags"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getNewRoomItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/
   *
   * @param id The room ID. (required)
   * @return NewItemsFileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsFileEntryBaseArrayWrapper getNewRoomItems(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getNewRoomItems(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getNewRoomItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return NewItemsFileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsFileEntryBaseArrayWrapper getNewRoomItems(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewRoomItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/news"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<NewItemsFileEntryBaseArrayWrapper> localVarReturnType = new TypeReference<NewItemsFileEntryBaseArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getPublicSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/
   *
   * @param id The room template ID. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getPublicSettings(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getPublicSettings(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getPublicSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/
   *
   * @param id The room template ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getPublicSettings(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPublicSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/roomtemplate/{id}/public"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomCovers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/
   *
   * @return CoversResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CoversResultArrayWrapper getRoomCovers() throws ApiException {
    return this.getRoomCovers(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomCovers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CoversResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CoversResultArrayWrapper getRoomCovers(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/covers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CoversResultArrayWrapper> localVarReturnType = new TypeReference<CoversResultArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomCreatingStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/
   *
   * @return RoomFromTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomFromTemplateStatusWrapper getRoomCreatingStatus() throws ApiException {
    return this.getRoomCreatingStatus(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomCreatingStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomFromTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomFromTemplateStatusWrapper getRoomCreatingStatus(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/fromtemplate/status";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<RoomFromTemplateStatusWrapper> localVarReturnType = new TypeReference<RoomFromTemplateStatusWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getRoomIndexExport() throws ApiException {
    return this.getRoomIndexExport(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getRoomIndexExport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/indexexport";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-info/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getRoomInfo(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getRoomInfo(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-info/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getRoomInfo(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/
   *
   * @param id The room ID. (required)
   * @param type The link type. (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getRoomLinks(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable LinkType type) throws ApiException {
    return this.getRoomLinks(id, type, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/
   *
   * @param id The room ID. (required)
   * @param type The link type. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getRoomLinks(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable LinkType type, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomLinks");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/links"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/
   *
   * @param id The room ID. (required)
   * @param filterType The filter type of the access rights. (optional)
   * @param count The number of items to be retrieved or processed. (optional)
   * @param startIndex The starting index of the items to retrieve in a paginated request. (optional)
   * @param filterValue The text filter value used for filtering room security information. (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getRoomSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ShareFilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRoomSecurityInfo(id, filterType, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/
   *
   * @param id The room ID. (required)
   * @param filterType The filter type of the access rights. (optional)
   * @param count The number of items to be retrieved or processed. (optional)
   * @param startIndex The starting index of the items to retrieve in a paginated request. (optional)
   * @param filterValue The text filter value used for filtering room security information. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getRoomSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ShareFilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/share"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomTagsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-tags-info/
   *
   * @param count Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set. (optional)
   * @param startIndex Represents the starting index from which the tags&#39; information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins. (optional)
   * @param filterValue Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information. (optional)
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getRoomTagsInfo(@javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRoomTagsInfo(count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomTagsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-tags-info/
   *
   * @param count Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set. (optional)
   * @param startIndex Represents the starting index from which the tags&#39; information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins. (optional)
   * @param filterValue Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getRoomTagsInfo(@javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/tags";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    if (this.fields != null)
      localVarHeaderParams.put.Add("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomTemplateCreatingStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/
   *
   * @return RoomTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomTemplateStatusWrapper getRoomTemplateCreatingStatus() throws ApiException {
    return this.getRoomTemplateCreatingStatus(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomTemplateCreatingStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomTemplateStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomTemplateStatusWrapper getRoomTemplateCreatingStatus(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/roomtemplate/status";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<RoomTemplateStatusWrapper> localVarReturnType = new TypeReference<RoomTemplateStatusWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomsFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-folder/
   *
   * @param type The filter by room type. (optional)
   * @param subjectId The filter by user ID. (optional)
   * @param searchArea The room search area (Active, Archive, Any, Recent by links). (optional)
   * @param withoutTags Specifies whether to search by tags or not. (optional)
   * @param tags The tags in the serialized format. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param provider The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage). (optional)
   * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
   * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
   * @param storageFilter The filter by storage (None - 0, Internal - 1, ThirdParty - 2). (optional)
   * @param count Specifies the maximum number of items to retrieve. (optional)
   * @param startIndex The index from which to start retrieving the room content. (optional)
   * @param sortBy Specifies the field by which the room content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text filter value used to refine search or query operations. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getRoomsFolder(@javax.annotation.Nullable List<RoomType> type, @javax.annotation.Nullable String subjectId, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ProviderFilter provider, @javax.annotation.Nullable SubjectFilter subjectFilter, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable StorageFilter storageFilter, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRoomsFolder(type, subjectId, searchArea, withoutTags, tags, excludeSubject, provider, subjectFilter, quotaFilter, storageFilter, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomsFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-folder/
   *
   * @param type The filter by room type. (optional)
   * @param subjectId The filter by user ID. (optional)
   * @param searchArea The room search area (Active, Archive, Any, Recent by links). (optional)
   * @param withoutTags Specifies whether to search by tags or not. (optional)
   * @param tags The tags in the serialized format. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param provider The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage). (optional)
   * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
   * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
   * @param storageFilter The filter by storage (None - 0, Internal - 1, ThirdParty - 2). (optional)
   * @param count Specifies the maximum number of items to retrieve. (optional)
   * @param startIndex The index from which to start retrieving the room content. (optional)
   * @param sortBy Specifies the field by which the room content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text filter value used to refine search or query operations. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getRoomsFolder(@javax.annotation.Nullable List<RoomType> type, @javax.annotation.Nullable String subjectId, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ProviderFilter provider, @javax.annotation.Nullable SubjectFilter subjectFilter, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable StorageFilter storageFilter, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParameterBaseName = "type";
    for (int i=0; i < type.size(); i++) {
      localVarQueryStringJoiner.add(type.get(i).toUrlQueryString(String.format("type[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("subjectId", subjectId));
    localVarQueryParams.addAll(apiClient.parameterToPair("searchArea", searchArea));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutTags", withoutTags));
    localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("provider", provider));
    localVarQueryParams.addAll(apiClient.parameterToPair("subjectFilter", subjectFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("quotaFilter", quotaFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("storageFilter", storageFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    if (this.fields != null)
      localVarHeaderParams.put.Add("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomsNewItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/
   *
   * @return NewItemsRoomNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsRoomNewItemsArrayWrapper getRoomsNewItems() throws ApiException {
    return this.getRoomsNewItems(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomsNewItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return NewItemsRoomNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsRoomNewItemsArrayWrapper getRoomsNewItems(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/news";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<NewItemsRoomNewItemsArrayWrapper> localVarReturnType = new TypeReference<NewItemsRoomNewItemsArrayWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for getRoomsPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/
   *
   * @param id The room ID. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getRoomsPrimaryExternalLink(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getRoomsPrimaryExternalLink(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getRoomsPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getRoomsPrimaryExternalLink(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomsPrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/link"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileShareWrapper> localVarReturnType = new TypeReference<FileShareWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for pinRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper pinRoom(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.pinRoom(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for pinRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper pinRoom(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pinRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/pin"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for reorderRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper reorderRoom(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.reorderRoom(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for reorderRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper reorderRoom(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling reorderRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/reorder"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for resendEmailInvitations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/
   *
   * @param id The room ID. (required)
   * @param userInvitation The user invitation parameters. (required)
   * @throws ApiException if fails to make API call
   */
  public void resendEmailInvitations(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UserInvitation userInvitation) throws ApiException {
    this.resendEmailInvitations(id, userInvitation, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for resendEmailInvitations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/
   *
   * @param id The room ID. (required)
   * @param userInvitation The user invitation parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void resendEmailInvitations(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UserInvitation userInvitation, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userInvitation;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resendEmailInvitations");
    }
    
    // verify the required parameter 'userInvitation' is set
    if (userInvitation == null) {
      throw new ApiException(400, "Missing the required parameter 'userInvitation' when calling resendEmailInvitations");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/resend"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for setPublicSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/
   *
   * @param setPublicDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void setPublicSettings(@javax.annotation.Nullable SetPublicDto setPublicDto) throws ApiException {
    this.setPublicSettings(setPublicDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setPublicSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/
   *
   * @param setPublicDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void setPublicSettings(@javax.annotation.Nullable SetPublicDto setPublicDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setPublicDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/roomtemplate/public";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for setRoomLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/
   *
   * @param id The room ID. (required)
   * @param roomLinkRequest The room link parameters. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setRoomLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull RoomLinkRequest roomLinkRequest) throws ApiException {
    return this.setRoomLink(id, roomLinkRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setRoomLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/
   *
   * @param id The room ID. (required)
   * @param roomLinkRequest The room link parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setRoomLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull RoomLinkRequest roomLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = roomLinkRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setRoomLink");
    }
    
    // verify the required parameter 'roomLinkRequest' is set
    if (roomLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'roomLinkRequest' when calling setRoomLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/links"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileShareWrapper> localVarReturnType = new TypeReference<FileShareWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for setRoomSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/
   *
   * @param id The room ID. (required)
   * @param roomInvitationRequest The room invitation request. (required)
   * @return RoomSecurityWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomSecurityWrapper setRoomSecurity(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull RoomInvitationRequest roomInvitationRequest) throws ApiException {
    return this.setRoomSecurity(id, roomInvitationRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setRoomSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/
   *
   * @param id The room ID. (required)
   * @param roomInvitationRequest The room invitation request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomSecurityWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomSecurityWrapper setRoomSecurity(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull RoomInvitationRequest roomInvitationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = roomInvitationRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setRoomSecurity");
    }
    
    // verify the required parameter 'roomInvitationRequest' is set
    if (roomInvitationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'roomInvitationRequest' when calling setRoomSecurity");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/share"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<RoomSecurityWrapper> localVarReturnType = new TypeReference<RoomSecurityWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for startRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/
   *
   * @param id The room ID. (required)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper startRoomIndexExport(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.startRoomIndexExport(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for startRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper startRoomIndexExport(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startRoomIndexExport");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/indexexport"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for terminateRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateRoomIndexExport() throws ApiException {
    this.terminateRoomIndexExport(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for terminateRoomIndexExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateRoomIndexExport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/indexexport";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for unarchiveRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/
   *
   * @param id The room ID. (required)
   * @param archiveRoomRequest The parameters for archiving a room. (optional)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper unarchiveRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ArchiveRoomRequest archiveRoomRequest) throws ApiException {
    return this.unarchiveRoom(id, archiveRoomRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for unarchiveRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/
   *
   * @param id The room ID. (required)
   * @param archiveRoomRequest The parameters for archiving a room. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper unarchiveRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable ArchiveRoomRequest archiveRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = archiveRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling unarchiveRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/unarchive"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationWrapper> localVarReturnType = new TypeReference<FileOperationWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for unpinRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper unpinRoom(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.unpinRoom(id, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for unpinRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper unpinRoom(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling unpinRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}/unpin"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for updateRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/
   *
   * @param id The room ID. (required)
   * @param updateRoomRequest The request parameters for updating a room. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper updateRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomRequest updateRoomRequest) throws ApiException {
    return this.updateRoom(id, updateRoomRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for updateRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/
   *
   * @param id The room ID. (required)
   * @param updateRoomRequest The request parameters for updating a room. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper updateRoom(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomRequest updateRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateRoom");
    }
    
    // verify the required parameter 'updateRoomRequest' is set
    if (updateRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRoomRequest' when calling updateRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for uploadRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/
   *
   * @param formCollection The image data. (optional)
   * @return UploadResultWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadResultWrapper uploadRoomLogo(@javax.annotation.Nullable List<KeyValuePairStringStringValues> formCollection) throws ApiException {
    return this.uploadRoomLogo(formCollection, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for uploadRoomLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/
   *
   * @param formCollection The image data. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UploadResultWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadResultWrapper uploadRoomLogo(@javax.annotation.Nullable List<KeyValuePairStringStringValues> formCollection, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/logos";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (formCollection != null)
      localVarFormParams.put("FormCollection", formCollection);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<UploadResultWrapper> localVarReturnType = new TypeReference<UploadResultWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
