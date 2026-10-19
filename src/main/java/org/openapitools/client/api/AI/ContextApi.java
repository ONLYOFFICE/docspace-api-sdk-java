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

package org.openapitools.client.api.AI;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ContextApi extends BaseApi {

  public ContextApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ContextApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get context folders
   * 
   *
   * REST API Reference for aiContextGetContextFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/
   *
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetContextFolders() throws ApiException {
    return this.aiContextGetContextFolders(Collections.emptyMap());
  }


  /**
   * Get context folders
   * 
   *
   * REST API Reference for aiContextGetContextFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetContextFolders(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/context/get-context-folders";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get room skill
   * 
   *
   * REST API Reference for aiContextGetRoomSkill Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/
   *
   * @param cloud  (required)
   * @param roomId  (required)
   * @param skillId  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetRoomSkill(@javax.annotation.Nonnull String cloud, @javax.annotation.Nonnull String roomId, @javax.annotation.Nonnull String skillId) throws ApiException {
    return this.aiContextGetRoomSkill(cloud, roomId, skillId, Collections.emptyMap());
  }


  /**
   * Get room skill
   * 
   *
   * REST API Reference for aiContextGetRoomSkill Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/
   *
   * @param cloud  (required)
   * @param roomId  (required)
   * @param skillId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetRoomSkill(@javax.annotation.Nonnull String cloud, @javax.annotation.Nonnull String roomId, @javax.annotation.Nonnull String skillId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cloud' is set
    if (cloud == null) {
      throw new ApiException(400, "Missing the required parameter 'cloud' when calling aiContextGetRoomSkill");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling aiContextGetRoomSkill");
    }
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new ApiException(400, "Missing the required parameter 'skillId' when calling aiContextGetRoomSkill");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/context/get-room-skill";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("cloud", cloud));
    localVarQueryParams.addAll(apiClient.parameterToPair("roomId", roomId));
    localVarQueryParams.addAll(apiClient.parameterToPair("skillId", skillId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get room skills
   * 
   *
   * REST API Reference for aiContextGetRoomSkills Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/
   *
   * @param cloud  (required)
   * @param roomId  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetRoomSkills(@javax.annotation.Nonnull String cloud, @javax.annotation.Nonnull String roomId) throws ApiException {
    return this.aiContextGetRoomSkills(cloud, roomId, Collections.emptyMap());
  }


  /**
   * Get room skills
   * 
   *
   * REST API Reference for aiContextGetRoomSkills Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/
   *
   * @param cloud  (required)
   * @param roomId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiContextGetRoomSkills(@javax.annotation.Nonnull String cloud, @javax.annotation.Nonnull String roomId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cloud' is set
    if (cloud == null) {
      throw new ApiException(400, "Missing the required parameter 'cloud' when calling aiContextGetRoomSkills");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling aiContextGetRoomSkills");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/context/get-room-skills";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("cloud", cloud));
    localVarQueryParams.addAll(apiClient.parameterToPair("roomId", roomId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
