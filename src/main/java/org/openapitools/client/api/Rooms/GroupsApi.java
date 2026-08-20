/*
 * (c) Copyright Ascensio System SIA 2026
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

package org.openapitools.client.api.Rooms;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.IconRequest;
import org.openapitools.client.model.RoomGroupArrayWrapper;
import org.openapitools.client.model.RoomGroupRequestDto;
import org.openapitools.client.model.RoomGroupWrapper;
import org.openapitools.client.model.UpdateRoomGroupRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class GroupsApi extends BaseApi {

  public GroupsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Add a new room group
   * Creates a new room group with the specified name, icon, and list of rooms.
   *
   * REST API Reference for addRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-group/
   *
   * @param roomGroupRequestDto  (optional)
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper addRoomGroup(@javax.annotation.Nullable RoomGroupRequestDto roomGroupRequestDto) throws ApiException {
    return this.addRoomGroup(roomGroupRequestDto, Collections.emptyMap());
  }


  /**
   * Add a new room group
   * Creates a new room group with the specified name, icon, and list of rooms.
   *
   * REST API Reference for addRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-group/
   *
   * @param roomGroupRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper addRoomGroup(@javax.annotation.Nullable RoomGroupRequestDto roomGroupRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = roomGroupRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group";

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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<RoomGroupWrapper> localVarReturnType = new TypeReference<RoomGroupWrapper>() {};
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
   * Change group icon
   * Changes the icon of an existing room group.
   *
   * REST API Reference for changeRoomGroupIcon Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/
   *
   * @param id Group id (required)
   * @param iconRequest Icon update data. (optional)
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper changeRoomGroupIcon(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable IconRequest iconRequest) throws ApiException {
    return this.changeRoomGroupIcon(id, iconRequest, Collections.emptyMap());
  }


  /**
   * Change group icon
   * Changes the icon of an existing room group.
   *
   * REST API Reference for changeRoomGroupIcon Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/
   *
   * @param id Group id (required)
   * @param iconRequest Icon update data. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper changeRoomGroupIcon(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable IconRequest iconRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = iconRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling changeRoomGroupIcon");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group/{id}/icon"
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<RoomGroupWrapper> localVarReturnType = new TypeReference<RoomGroupWrapper>() {};
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
   * Delete group
   * Deletes the specified room group.
   *
   * REST API Reference for deleteRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomGroup(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers) throws ApiException {
    this.deleteRoomGroup(id, includeMembers, Collections.emptyMap());
  }


  /**
   * Delete group
   * Deletes the specified room group.
   *
   * REST API Reference for deleteRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomGroup(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRoomGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("includeMembers", includeMembers));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get room group info
   * Returns detailed information about a room group.
   *
   * REST API Reference for getRoomGroupInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper getRoomGroupInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers) throws ApiException {
    return this.getRoomGroupInfo(id, includeMembers, Collections.emptyMap());
  }


  /**
   * Get room group info
   * Returns detailed information about a room group.
   *
   * REST API Reference for getRoomGroupInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper getRoomGroupInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomGroupInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("includeMembers", includeMembers));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<RoomGroupWrapper> localVarReturnType = new TypeReference<RoomGroupWrapper>() {};
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
   * List room groups
   * Returns a list of all room groups for the current user.
   *
   * REST API Reference for getRoomGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @return RoomGroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupArrayWrapper getRoomGroups(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers) throws ApiException {
    return this.getRoomGroups(id, includeMembers, Collections.emptyMap());
  }


  /**
   * List room groups
   * Returns a list of all room groups for the current user.
   *
   * REST API Reference for getRoomGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/
   *
   * @param id The group unique identifier. (required)
   * @param includeMembers Whether to include group members. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomGroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupArrayWrapper getRoomGroups(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean includeMembers, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRoomGroups");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("includeMembers", includeMembers));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<RoomGroupArrayWrapper> localVarReturnType = new TypeReference<RoomGroupArrayWrapper>() {};
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
   * Update room group
   * Updates room group properties and adds or removes rooms.
   *
   * REST API Reference for updateRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/
   *
   * @param id The group ID. (required)
   * @param updateRoomGroupRequest The request for updating a group. (required)
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper updateRoomGroup(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomGroupRequest updateRoomGroupRequest) throws ApiException {
    return this.updateRoomGroup(id, updateRoomGroupRequest, Collections.emptyMap());
  }


  /**
   * Update room group
   * Updates room group properties and adds or removes rooms.
   *
   * REST API Reference for updateRoomGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/
   *
   * @param id The group ID. (required)
   * @param updateRoomGroupRequest The request for updating a group. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomGroupWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomGroupWrapper updateRoomGroup(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomGroupRequest updateRoomGroupRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomGroupRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateRoomGroup");
    }
    
    // verify the required parameter 'updateRoomGroupRequest' is set
    if (updateRoomGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRoomGroupRequest' when calling updateRoomGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/group/{id}"
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<RoomGroupWrapper> localVarReturnType = new TypeReference<RoomGroupWrapper>() {};
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
