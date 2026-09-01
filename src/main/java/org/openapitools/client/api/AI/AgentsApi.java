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

import org.openapitools.client.model.AiAgentsCreateRequest;
import org.openapitools.client.model.AiAgentsDeleteRequest;
import org.openapitools.client.model.AiAgentsResetQuotaRequest;
import org.openapitools.client.model.AiAgentsUpdateQuotaRequest;
import org.openapitools.client.model.AiAgentsUpdateRequest;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiFileOperationWrapper;
import org.openapitools.client.model.AiFolderContentIntegerWrapper;
import org.openapitools.client.model.AiFolderIntegerArrayWrapper;
import org.openapitools.client.model.AiFolderIntegerWrapper;
import org.openapitools.client.model.AiNewItemsAgentNewItemsArrayWrapper;


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


  /**
   * Create an agent
   * Creates an AI agent room in the .NET AI service and binds the supplied `profileId` to it as a `Chat` assignment. The instruction is stored on the room as a prompt-only chat setting; a failed binding is reported as an error even though the room already exists.
   *
   * REST API Reference for aiAgentsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
   *
   * @param aiAgentsCreateRequest  (required)
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsCreate(@javax.annotation.Nonnull AiAgentsCreateRequest aiAgentsCreateRequest) throws ApiException {
    return this.aiAgentsCreate(aiAgentsCreateRequest, Collections.emptyMap());
  }


  /**
   * Create an agent
   * Creates an AI agent room in the .NET AI service and binds the supplied `profileId` to it as a `Chat` assignment. The instruction is stored on the room as a prompt-only chat setting; a failed binding is reported as an error even though the room already exists.
   *
   * REST API Reference for aiAgentsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
   *
   * @param aiAgentsCreateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsCreate(@javax.annotation.Nonnull AiAgentsCreateRequest aiAgentsCreateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAgentsCreateRequest;
    
    // verify the required parameter 'aiAgentsCreateRequest' is set
    if (aiAgentsCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAgentsCreateRequest' when calling aiAgentsCreate");
    }
    
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderIntegerWrapper> localVarReturnType = new TypeReference<AiFolderIntegerWrapper>() {};
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
   * Delete an agent
   * Deletes an AI agent room.
   *
   * REST API Reference for aiAgentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsDeleteRequest  (required)
   * @return AiFileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFileOperationWrapper aiAgentsDelete(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsDeleteRequest aiAgentsDeleteRequest) throws ApiException {
    return this.aiAgentsDelete(id, aiAgentsDeleteRequest, Collections.emptyMap());
  }


  /**
   * Delete an agent
   * Deletes an AI agent room.
   *
   * REST API Reference for aiAgentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsDeleteRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFileOperationWrapper aiAgentsDelete(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsDeleteRequest aiAgentsDeleteRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAgentsDeleteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiAgentsDelete");
    }
    
    // verify the required parameter 'aiAgentsDeleteRequest' is set
    if (aiAgentsDeleteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAgentsDeleteRequest' when calling aiAgentsDelete");
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFileOperationWrapper> localVarReturnType = new TypeReference<AiFileOperationWrapper>() {};
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
   * Get an agent
   * Returns one AI agent room, enriched with the `profileId` bound to it so an edit form can prefill the profile selector. A missing assignment simply leaves `profileId` out.
   *
   * REST API Reference for aiAgentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
   *
   * @param id The agent identifier. (required)
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsGet(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiAgentsGet(id, Collections.emptyMap());
  }


  /**
   * Get an agent
   * Returns one AI agent room, enriched with the `profileId` bound to it so an edit form can prefill the profile selector. A missing assignment simply leaves `profileId` out.
   *
   * REST API Reference for aiAgentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
   *
   * @param id The agent identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsGet(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiAgentsGet");
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderIntegerWrapper> localVarReturnType = new TypeReference<AiFolderIntegerWrapper>() {};
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
   * List agents
   * Lists the portal's AI agent rooms. Query parameters are forwarded unchanged to the .NET AI service, which answers with its folder-content payload.
   *
   * REST API Reference for aiAgentsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
   *
   * @return AiFolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderContentIntegerWrapper aiAgentsList() throws ApiException {
    return this.aiAgentsList(Collections.emptyMap());
  }


  /**
   * List agents
   * Lists the portal's AI agent rooms. Query parameters are forwarded unchanged to the .NET AI service, which answers with its folder-content payload.
   *
   * REST API Reference for aiAgentsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderContentIntegerWrapper aiAgentsList(Map<String, String> additionalHeaders) throws ApiException {
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

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderContentIntegerWrapper> localVarReturnType = new TypeReference<AiFolderContentIntegerWrapper>() {};
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
   * List agent news items
   * Lists the new items across the caller's AI agent rooms.
   *
   * REST API Reference for aiAgentsNews Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/
   *
   * @return AiNewItemsAgentNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiNewItemsAgentNewItemsArrayWrapper aiAgentsNews() throws ApiException {
    return this.aiAgentsNews(Collections.emptyMap());
  }


  /**
   * List agent news items
   * Lists the new items across the caller's AI agent rooms.
   *
   * REST API Reference for aiAgentsNews Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiNewItemsAgentNewItemsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiNewItemsAgentNewItemsArrayWrapper aiAgentsNews(Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiNewItemsAgentNewItemsArrayWrapper> localVarReturnType = new TypeReference<AiNewItemsAgentNewItemsArrayWrapper>() {};
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
   * Reset agents' quota
   * Resets the storage quota of the given AI agent rooms.
   *
   * REST API Reference for aiAgentsResetQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
   *
   * @param aiAgentsResetQuotaRequest  (required)
   * @return AiFolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerArrayWrapper aiAgentsResetQuota(@javax.annotation.Nonnull AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest) throws ApiException {
    return this.aiAgentsResetQuota(aiAgentsResetQuotaRequest, Collections.emptyMap());
  }


  /**
   * Reset agents' quota
   * Resets the storage quota of the given AI agent rooms.
   *
   * REST API Reference for aiAgentsResetQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
   *
   * @param aiAgentsResetQuotaRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerArrayWrapper aiAgentsResetQuota(@javax.annotation.Nonnull AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAgentsResetQuotaRequest;
    
    // verify the required parameter 'aiAgentsResetQuotaRequest' is set
    if (aiAgentsResetQuotaRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAgentsResetQuotaRequest' when calling aiAgentsResetQuota");
    }
    
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderIntegerArrayWrapper> localVarReturnType = new TypeReference<AiFolderIntegerArrayWrapper>() {};
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
   * Update an agent
   * Updates an AI agent room - title, tags, instruction. `profileId` is not part of the room contract: it is stripped from the forwarded body and re-bound as the agent's assignment afterwards.
   *
   * REST API Reference for aiAgentsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsUpdateRequest  (required)
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsUpdate(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsUpdateRequest aiAgentsUpdateRequest) throws ApiException {
    return this.aiAgentsUpdate(id, aiAgentsUpdateRequest, Collections.emptyMap());
  }


  /**
   * Update an agent
   * Updates an AI agent room - title, tags, instruction. `profileId` is not part of the room contract: it is stripped from the forwarded body and re-bound as the agent's assignment afterwards.
   *
   * REST API Reference for aiAgentsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsUpdateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerWrapper aiAgentsUpdate(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsUpdateRequest aiAgentsUpdateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAgentsUpdateRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiAgentsUpdate");
    }
    
    // verify the required parameter 'aiAgentsUpdateRequest' is set
    if (aiAgentsUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAgentsUpdateRequest' when calling aiAgentsUpdate");
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderIntegerWrapper> localVarReturnType = new TypeReference<AiFolderIntegerWrapper>() {};
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
   * Update agents' quota
   * Changes the storage quota of the given AI agent rooms.
   *
   * REST API Reference for aiAgentsUpdateQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
   *
   * @param aiAgentsUpdateQuotaRequest  (required)
   * @return AiFolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerArrayWrapper aiAgentsUpdateQuota(@javax.annotation.Nonnull AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest) throws ApiException {
    return this.aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest, Collections.emptyMap());
  }


  /**
   * Update agents' quota
   * Changes the storage quota of the given AI agent rooms.
   *
   * REST API Reference for aiAgentsUpdateQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
   *
   * @param aiAgentsUpdateQuotaRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderIntegerArrayWrapper aiAgentsUpdateQuota(@javax.annotation.Nonnull AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAgentsUpdateQuotaRequest;
    
    // verify the required parameter 'aiAgentsUpdateQuotaRequest' is set
    if (aiAgentsUpdateQuotaRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAgentsUpdateQuotaRequest' when calling aiAgentsUpdateQuota");
    }
    
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiFolderIntegerArrayWrapper> localVarReturnType = new TypeReference<AiFolderIntegerArrayWrapper>() {};
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
