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

import org.openapitools.client.model.GroupArrayWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SearchApi extends BaseApi {

  public SearchApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get groups with file sharing settings
   * Returns groups with their sharing settings for a file with the ID specified in request.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Get groups with file sharing settings
   * Returns groups with their sharing settings for a file with the ID specified in request.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFilesShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/file/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupArrayWrapper> localVarReturnType = new TypeReference<GroupArrayWrapper>() {};
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
   * Get groups with folder sharing settings
   * Returns groups with their sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Get groups with folder sharing settings
   * Returns groups with their sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFoldersShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/folder/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupArrayWrapper> localVarReturnType = new TypeReference<GroupArrayWrapper>() {};
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
   * Get groups with room sharing settings
   * Returns groups with their sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Get groups with room sharing settings
   * Returns groups with their sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The group ID. (required)
   * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
   * @param count The number of groups to retrieve in the request. (optional)
   * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
   * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithRoomsShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/room/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupArrayWrapper> localVarReturnType = new TypeReference<GroupArrayWrapper>() {};
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
