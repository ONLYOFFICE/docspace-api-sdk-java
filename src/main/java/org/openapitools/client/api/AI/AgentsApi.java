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
import org.openapitools.client.model.AiAgentsGet200Response;
import org.openapitools.client.model.AiAgentsResetQuotaRequest;
import org.openapitools.client.model.AiAgentsUpdateQuotaRequest;
import org.openapitools.client.model.AiAgentsUpdateRequest;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiFileOperationWrapper;
import org.openapitools.client.model.AiFolderArrayWrapper;
import org.openapitools.client.model.AiFolderContentWrapper;
import org.openapitools.client.model.AiFolderWrapper;
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
   * Create an agent
   * Creates an AI agent room and binds a model to it, in that order. `profileId` is required, has to be a UUID, has to name an existing profile, and that profile has to support chat - an image-only model is refused here rather than failing on every later request. `prompt` is required and is stored on the room as its standing instruction with any markup stripped, so it cannot round-trip HTML into another user's reply. The two steps are not atomic: when the room is created but the model binding fails, the call reports an error and the room is left behind, so re-bind it with `PUT api/2.0/ai/agents/{id}` rather than creating a second one.
   *
   * REST API Reference for aiAgentsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
   *
   * @param aiAgentsCreateRequest  (required)
   * @return AiFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderWrapper aiAgentsCreate(@javax.annotation.Nonnull AiAgentsCreateRequest aiAgentsCreateRequest) throws ApiException {
    return this.aiAgentsCreate(aiAgentsCreateRequest, Collections.emptyMap());
  }


  /**
   * Create an agent
   * Creates an AI agent room and binds a model to it, in that order. `profileId` is required, has to be a UUID, has to name an existing profile, and that profile has to support chat - an image-only model is refused here rather than failing on every later request. `prompt` is required and is stored on the room as its standing instruction with any markup stripped, so it cannot round-trip HTML into another user's reply. The two steps are not atomic: when the room is created but the model binding fails, the call reports an error and the room is left behind, so re-bind it with `PUT api/2.0/ai/agents/{id}` rather than creating a second one.
   *
   * REST API Reference for aiAgentsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
   *
   * @param aiAgentsCreateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderWrapper aiAgentsCreate(@javax.annotation.Nonnull AiAgentsCreateRequest aiAgentsCreateRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiFolderWrapper> localVarReturnType = new TypeReference<AiFolderWrapper>() {};
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
   * Deletes an AI agent room. The ID has to be the room's integer identifier, and the body is forwarded to the DocSpace AI service unchanged, so it accepts the same options as deleting an ordinary room - `deleteAfter` among them. Deletion is asynchronous there: the answer is a file-operation payload to poll, not a completed result. The agent's model binding is deliberately left behind, because the upstream assignment API has no per-entry delete, so an orphaned assignment row survives the room.
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
   * Deletes an AI agent room. The ID has to be the room's integer identifier, and the body is forwarded to the DocSpace AI service unchanged, so it accepts the same options as deleting an ordinary room - `deleteAfter` among them. Deletion is asynchronous there: the answer is a file-operation payload to poll, not a completed result. The agent's model binding is deliberately left behind, because the upstream assignment API has no per-entry delete, so an orphaned assignment row survives the room.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Returns one AI agent room, enriched with the `profileId` currently bound to it so an edit form can prefill its model selector. The ID is the room's integer identifier, and a non-integer value is refused rather than passed on to fail opaquely upstream. The binding lives in an assignment rather than on the room, so it is looked up separately: a missing or unreadable assignment simply leaves `profileId` out of the answer instead of failing the call. The standing instruction comes back on the room as `chatSettings.prompt`.
   *
   * REST API Reference for aiAgentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
   *
   * @param id The agent identifier. (required)
   * @return AiAgentsGet200Response
   * @throws ApiException if fails to make API call
   */
  public AiAgentsGet200Response aiAgentsGet(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiAgentsGet(id, Collections.emptyMap());
  }


  /**
   * Get an agent
   * Returns one AI agent room, enriched with the `profileId` currently bound to it so an edit form can prefill its model selector. The ID is the room's integer identifier, and a non-integer value is refused rather than passed on to fail opaquely upstream. The binding lives in an assignment rather than on the room, so it is looked up separately: a missing or unreadable assignment simply leaves `profileId` out of the answer instead of failing the call. The standing instruction comes back on the room as `chatSettings.prompt`.
   *
   * REST API Reference for aiAgentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
   *
   * @param id The agent identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiAgentsGet200Response
   * @throws ApiException if fails to make API call
   */
  public AiAgentsGet200Response aiAgentsGet(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiAgentsGet200Response> localVarReturnType = new TypeReference<AiAgentsGet200Response>() {};
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
   * Lists the portal's AI agent rooms. The query is forwarded unchanged to the DocSpace AI service, so it takes the same paging, sorting and filtering parameters as an ordinary room listing, and the answer is that service's folder-content payload rather than a shape of this API's own. Array and object query values are dropped rather than guessed at, so send flat strings. The profile bound to each agent is not included here - read one agent with `GET api/2.0/ai/agents/{id}` for that.
   *
   * REST API Reference for aiAgentsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
   *
   * @param subjectId Show only the agent rooms this user takes part in. (optional)
   * @param subjectOwnerId Show only the agent rooms owned by this user. (optional)
   * @param excludeSubject Invert the user filter: leave out what `subjectId` selects instead of keeping it. (optional)
   * @param tags Show only the agent rooms carrying these tags, comma-separated. (optional)
   * @param withoutTags Show only the agent rooms that carry no tags at all. (optional)
   * @param quotaFilter Filter by quota kind: 0 for all, 1 for the default quota, 2 for a custom one. (optional)
   * @param filterValue Show only the agent rooms whose title matches this text. (optional)
   * @param sortBy Field to sort by, for example `DateAndTime`. (optional)
   * @param sortOrder Sort direction, `ascending` or `descending`. (optional)
   * @param startIndex Index of the first entry to return; 0 starts at the beginning. (optional)
   * @param count How many entries to return. The internal service applies its own default. (optional)
   * @return AiFolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderContentWrapper aiAgentsList(@javax.annotation.Nullable String subjectId, @javax.annotation.Nullable String subjectOwnerId, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable Integer quotaFilter, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable String sortOrder, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.aiAgentsList(subjectId, subjectOwnerId, excludeSubject, tags, withoutTags, quotaFilter, filterValue, sortBy, sortOrder, startIndex, count, Collections.emptyMap());
  }


  /**
   * List agents
   * Lists the portal's AI agent rooms. The query is forwarded unchanged to the DocSpace AI service, so it takes the same paging, sorting and filtering parameters as an ordinary room listing, and the answer is that service's folder-content payload rather than a shape of this API's own. Array and object query values are dropped rather than guessed at, so send flat strings. The profile bound to each agent is not included here - read one agent with `GET api/2.0/ai/agents/{id}` for that.
   *
   * REST API Reference for aiAgentsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
   *
   * @param subjectId Show only the agent rooms this user takes part in. (optional)
   * @param subjectOwnerId Show only the agent rooms owned by this user. (optional)
   * @param excludeSubject Invert the user filter: leave out what `subjectId` selects instead of keeping it. (optional)
   * @param tags Show only the agent rooms carrying these tags, comma-separated. (optional)
   * @param withoutTags Show only the agent rooms that carry no tags at all. (optional)
   * @param quotaFilter Filter by quota kind: 0 for all, 1 for the default quota, 2 for a custom one. (optional)
   * @param filterValue Show only the agent rooms whose title matches this text. (optional)
   * @param sortBy Field to sort by, for example `DateAndTime`. (optional)
   * @param sortOrder Sort direction, `ascending` or `descending`. (optional)
   * @param startIndex Index of the first entry to return; 0 starts at the beginning. (optional)
   * @param count How many entries to return. The internal service applies its own default. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderContentWrapper aiAgentsList(@javax.annotation.Nullable String subjectId, @javax.annotation.Nullable String subjectOwnerId, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable String tags, @javax.annotation.Nullable Boolean withoutTags, @javax.annotation.Nullable Integer quotaFilter, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable String sortOrder, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPair("subjectOwnerId", subjectOwnerId));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutTags", withoutTags));
    localVarQueryParams.addAll(apiClient.parameterToPair("quotaFilter", quotaFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
      
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiFolderContentWrapper> localVarReturnType = new TypeReference<AiFolderContentWrapper>() {};
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
   * Lists the unread items across the caller's AI agent rooms, so a badge can be rendered without walking each room. It takes no parameters and is scoped to the caller by the DocSpace AI service. The answer is that service's new-items payload. This is a read-only operation and does not mark anything as seen.
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
   * Lists the unread items across the caller's AI agent rooms, so a badge can be rendered without walking each room. It takes no parameters and is scoped to the caller by the DocSpace AI service. The answer is that service's new-items payload. This is a read-only operation and does not mark anything as seen.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Returns the listed AI agent rooms to the portal's default storage quota, forwarding `roomIds` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. This is the counterpart of `PUT api/2.0/ai/agents/agentquota` and takes no quota value of its own. Rooms already on the default are unaffected.
   *
   * REST API Reference for aiAgentsResetQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
   *
   * @param aiAgentsResetQuotaRequest  (required)
   * @return AiFolderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderArrayWrapper aiAgentsResetQuota(@javax.annotation.Nonnull AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest) throws ApiException {
    return this.aiAgentsResetQuota(aiAgentsResetQuotaRequest, Collections.emptyMap());
  }


  /**
   * Reset agents' quota
   * Returns the listed AI agent rooms to the portal's default storage quota, forwarding `roomIds` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. This is the counterpart of `PUT api/2.0/ai/agents/agentquota` and takes no quota value of its own. Rooms already on the default are unaffected.
   *
   * REST API Reference for aiAgentsResetQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
   *
   * @param aiAgentsResetQuotaRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderArrayWrapper aiAgentsResetQuota(@javax.annotation.Nonnull AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiFolderArrayWrapper> localVarReturnType = new TypeReference<AiFolderArrayWrapper>() {};
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
   * Changes an AI agent room - its title, tags or standing instruction - and optionally rebinds its model. The ID has to be the room's integer identifier. `profileId` is not part of the room contract: it is taken out of the forwarded body and applied afterwards as the agent's assignment, and it has to be a UUID naming an existing chat-capable profile. An instruction sent as `chatSettings.prompt` has its markup stripped, as on create; note that when `chatSettings` is present the upstream service still requires the rest of that object to be valid, so send it whole.
   *
   * REST API Reference for aiAgentsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsUpdateRequest  (required)
   * @return AiFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderWrapper aiAgentsUpdate(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsUpdateRequest aiAgentsUpdateRequest) throws ApiException {
    return this.aiAgentsUpdate(id, aiAgentsUpdateRequest, Collections.emptyMap());
  }


  /**
   * Update an agent
   * Changes an AI agent room - its title, tags or standing instruction - and optionally rebinds its model. The ID has to be the room's integer identifier. `profileId` is not part of the room contract: it is taken out of the forwarded body and applied afterwards as the agent's assignment, and it has to be a UUID naming an existing chat-capable profile. An instruction sent as `chatSettings.prompt` has its markup stripped, as on create; note that when `chatSettings` is present the upstream service still requires the rest of that object to be valid, so send it whole.
   *
   * REST API Reference for aiAgentsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
   *
   * @param id The agent identifier. (required)
   * @param aiAgentsUpdateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderWrapper aiAgentsUpdate(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull AiAgentsUpdateRequest aiAgentsUpdateRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiFolderWrapper> localVarReturnType = new TypeReference<AiFolderWrapper>() {};
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
   * Sets the storage quota of the listed AI agent rooms in one call, forwarding `roomIds` and `quota` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. A quota applies to the room's stored files, not to the model usage of its chats. Use `PUT api/2.0/ai/agents/resetquota` to return rooms to the portal default instead of naming a number.
   *
   * REST API Reference for aiAgentsUpdateQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
   *
   * @param aiAgentsUpdateQuotaRequest  (required)
   * @return AiFolderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderArrayWrapper aiAgentsUpdateQuota(@javax.annotation.Nonnull AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest) throws ApiException {
    return this.aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest, Collections.emptyMap());
  }


  /**
   * Update agents' quota
   * Sets the storage quota of the listed AI agent rooms in one call, forwarding `roomIds` and `quota` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. A quota applies to the room's stored files, not to the model usage of its chats. Use `PUT api/2.0/ai/agents/resetquota` to return rooms to the portal default instead of naming a number.
   *
   * REST API Reference for aiAgentsUpdateQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
   *
   * @param aiAgentsUpdateQuotaRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiFolderArrayWrapper aiAgentsUpdateQuota(@javax.annotation.Nonnull AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiFolderArrayWrapper> localVarReturnType = new TypeReference<AiFolderArrayWrapper>() {};
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
