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

package org.openapitools.client.api.Files;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.FolderIntegerArrayWrapper;
import org.openapitools.client.model.UpdateRoomsQuotaRequestDtoInteger;
import org.openapitools.client.model.UpdateRoomsRoomIdsRequestDtoInteger;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class QuotaApi extends BaseApi {

  public QuotaApi() {
    super(Configuration.getDefaultApiClient());
  }

  public QuotaApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Reset the room quota limit
   * Resets the quota limit for the rooms with the IDs specified in the request.
   *
   * REST API Reference for resetRoomQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/
   *
   * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper resetRoomQuota(@javax.annotation.Nullable UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger) throws ApiException {
    return this.resetRoomQuota(updateRoomsRoomIdsRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * Reset the room quota limit
   * Resets the quota limit for the rooms with the IDs specified in the request.
   *
   * REST API Reference for resetRoomQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/
   *
   * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper resetRoomQuota(@javax.annotation.Nullable UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomsRoomIdsRequestDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/resetquota";

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

    TypeReference<FolderIntegerArrayWrapper> localVarReturnType = new TypeReference<FolderIntegerArrayWrapper>() {};
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
   * Change the room quota limit
   * Changes the quota limit for the rooms with the IDs specified in the request.
   *
   * REST API Reference for updateRoomsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/
   *
   * @param updateRoomsQuotaRequestDtoInteger  (optional)
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper updateRoomsQuota(@javax.annotation.Nullable UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger) throws ApiException {
    return this.updateRoomsQuota(updateRoomsQuotaRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * Change the room quota limit
   * Changes the quota limit for the rooms with the IDs specified in the request.
   *
   * REST API Reference for updateRoomsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/
   *
   * @param updateRoomsQuotaRequestDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper updateRoomsQuota(@javax.annotation.Nullable UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomsQuotaRequestDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/rooms/roomquota";

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

    TypeReference<FolderIntegerArrayWrapper> localVarReturnType = new TypeReference<FolderIntegerArrayWrapper>() {};
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
