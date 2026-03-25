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

import org.openapitools.client.model.CreateAgentRequestDto;
import org.openapitools.client.model.DeleteRoomRequest;
import org.openapitools.client.model.FileOperationWrapper;
import org.openapitools.client.model.FolderContentIntegerWrapper;
import org.openapitools.client.model.FolderIntegerArrayWrapper;
import org.openapitools.client.model.FolderIntegerWrapper;
import org.openapitools.client.model.NewItemsAgentNewItemsArrayWrapper;
import org.openapitools.client.model.QuotaFilter;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.SubjectFilter;
import org.openapitools.client.model.UpdateRoomRequest;
import org.openapitools.client.model.UpdateRoomsQuotaRequestDtoInteger;
import org.openapitools.client.model.UpdateRoomsRoomIdsRequestDtoInteger;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AgentsApi extends BaseApi {

  public AgentsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AgentsApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public AgentsApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Create an ai agent
   * Creates an ai agent.
   *
   * REST API Reference for createAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-agent/
   *
   * @param createAgentRequestDto  (optional)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createAgent(@javax.annotation.Nullable CreateAgentRequestDto createAgentRequestDto) throws ApiException {
    return this.createAgent(createAgentRequestDto, Collections.emptyMap());
  }


  /**
   * Create an ai agent
   * Creates an ai agent.
   *
   * REST API Reference for createAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-agent/
   *
   * @param createAgentRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createAgent(@javax.annotation.Nullable CreateAgentRequestDto createAgentRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createAgentRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents";

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
   * Remove an ai agent
   * Removes an ai agent.
   *
   * REST API Reference for deleteAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-agent/
   *
   * @param id The room ID. (required)
   * @param deleteRoomRequest The parameters for deleting a room. (required)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteAgent(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull DeleteRoomRequest deleteRoomRequest) throws ApiException {
    return this.deleteAgent(id, deleteRoomRequest, Collections.emptyMap());
  }


  /**
   * Remove an ai agent
   * Removes an ai agent.
   *
   * REST API Reference for deleteAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-agent/
   *
   * @param id The room ID. (required)
   * @param deleteRoomRequest The parameters for deleting a room. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteAgent(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull DeleteRoomRequest deleteRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAgent");
    }
    
    // verify the required parameter 'deleteRoomRequest' is set
    if (deleteRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteRoomRequest' when calling deleteAgent");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/{id}"
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
   * Return an ai agent
   * Returns an ai agent.
   *
   * REST API Reference for getAgentInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agent-info/
   *
   * @param id The room ID. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getAgentInfo(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getAgentInfo(id, Collections.emptyMap());
  }


  /**
   * Return an ai agent
   * Returns an ai agent.
   *
   * REST API Reference for getAgentInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agent-info/
   *
   * @param id The room ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getAgentInfo(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAgentInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/{id}"
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get ai agents
   * Get ai agents
   *
   * REST API Reference for getAgents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents/
   *
   * @param subjectId The filter by user ID. (optional)
   * @param withoutTags Specifies whether to search by tags or not. (optional)
   * @param tags The tags in the serialized format. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
   * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
   * @param count Specifies the maximum number of items to retrieve. (optional)
   * @param startIndex The index from which to start retrieving the room content. (optional)
   * @param sortBy Specifies the field by which the room content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text filter value used to refine search or query operations. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getAgents(@javax.annotation.Nullable String subjectId, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable SubjectFilter subjectFilter, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getAgents(subjectId, withoutTags, tags, excludeSubject, subjectFilter, quotaFilter, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get ai agents
   * Get ai agents
   *
   * REST API Reference for getAgents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents/
   *
   * @param subjectId The filter by user ID. (optional)
   * @param withoutTags Specifies whether to search by tags or not. (optional)
   * @param tags The tags in the serialized format. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
   * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
   * @param count Specifies the maximum number of items to retrieve. (optional)
   * @param startIndex The index from which to start retrieving the room content. (optional)
   * @param sortBy Specifies the field by which the room content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text filter value used to refine search or query operations. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getAgents(@javax.annotation.Nullable String subjectId, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable SubjectFilter subjectFilter, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("subjectId", subjectId));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutTags", withoutTags));
    localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("subjectFilter", subjectFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("quotaFilter", quotaFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    if (this.fields != null)
      localVarHeaderParams.put("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get the room new items
   * Returns the room new items.
   *
   * REST API Reference for getAgentsNewItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents-new-items/
   *
   * @return NewItemsAgentNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsAgentNewItemsArrayWrapper getAgentsNewItems() throws ApiException {
    return this.getAgentsNewItems(Collections.emptyMap());
  }


  /**
   * Get the room new items
   * Returns the room new items.
   *
   * REST API Reference for getAgentsNewItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents-new-items/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return NewItemsAgentNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public NewItemsAgentNewItemsArrayWrapper getAgentsNewItems(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/news";

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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<NewItemsAgentNewItemsArrayWrapper> localVarReturnType = new TypeReference<NewItemsAgentNewItemsArrayWrapper>() {};
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
   * Reset the AI agents quota limit
   * Resets the quota limit for the AI agents with the IDs specified in the request.
   *
   * REST API Reference for resetAgentsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-agents-quota/
   *
   * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper resetAgentsQuota(@javax.annotation.Nullable UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger) throws ApiException {
    return this.resetAgentsQuota(updateRoomsRoomIdsRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * Reset the AI agents quota limit
   * Resets the quota limit for the AI agents with the IDs specified in the request.
   *
   * REST API Reference for resetAgentsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-agents-quota/
   *
   * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper resetAgentsQuota(@javax.annotation.Nullable UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomsRoomIdsRequestDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/resetquota";

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
   * Update an ai agent
   * Updates an ai agent.
   *
   * REST API Reference for updateAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agent/
   *
   * @param id The room ID. (required)
   * @param updateRoomRequest The request parameters for updating a room. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper updateAgent(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomRequest updateRoomRequest) throws ApiException {
    return this.updateAgent(id, updateRoomRequest, Collections.emptyMap());
  }


  /**
   * Update an ai agent
   * Updates an ai agent.
   *
   * REST API Reference for updateAgent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agent/
   *
   * @param id The room ID. (required)
   * @param updateRoomRequest The request parameters for updating a room. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper updateAgent(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateRoomRequest updateRoomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAgent");
    }
    
    // verify the required parameter 'updateRoomRequest' is set
    if (updateRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRoomRequest' when calling updateAgent");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/{id}"
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
   * Change the AI agent quota limit
   * Changes the quota limit for the AI agents with the IDs specified in the request.
   *
   * REST API Reference for updateAgentsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agents-quota/
   *
   * @param updateRoomsQuotaRequestDtoInteger  (optional)
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper updateAgentsQuota(@javax.annotation.Nullable UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger) throws ApiException {
    return this.updateAgentsQuota(updateRoomsQuotaRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * Change the AI agent quota limit
   * Changes the quota limit for the AI agents with the IDs specified in the request.
   *
   * REST API Reference for updateAgentsQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agents-quota/
   *
   * @param updateRoomsQuotaRequestDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerArrayWrapper updateAgentsQuota(@javax.annotation.Nullable UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateRoomsQuotaRequestDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/agents/agentquota";

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
