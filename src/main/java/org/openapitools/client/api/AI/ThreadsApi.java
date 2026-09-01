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
import org.openapitools.client.model.AiOpenOrCreateResult;
import org.openapitools.client.model.AiSuccessResponse;
import org.openapitools.client.model.AiThread;
import org.openapitools.client.model.AiThreadMessageLike;
import org.openapitools.client.model.AiThreadsAppendUserMessageRequest;
import org.openapitools.client.model.AiThreadsCreateRequest;
import org.openapitools.client.model.AiThreadsOpenOrCreateRequest;
import org.openapitools.client.model.AiThreadsRegenerateTitleRequest;
import org.openapitools.client.model.AiThreadsRenameRequest;
import org.openapitools.client.model.AiThreadsTouchRequest;
import org.openapitools.client.model.AiThreadsUpdateMessageRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ThreadsApi extends BaseApi {

  public ThreadsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ThreadsApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public ThreadsApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Append user message
   * Persists a user message in a thread and bumps the thread's last-edit date so it resurfaces in the sidebar. Optionally rebinds the thread to another profile when the model changed mid-conversation.
   *
   * REST API Reference for aiThreadsAppendUserMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
   *
   * @param aiThreadsAppendUserMessageRequest  (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiThreadsAppendUserMessage(@javax.annotation.Nonnull AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest) throws ApiException {
    return this.aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest, Collections.emptyMap());
  }


  /**
   * Append user message
   * Persists a user message in a thread and bumps the thread's last-edit date so it resurfaces in the sidebar. Optionally rebinds the thread to another profile when the model changed mid-conversation.
   *
   * REST API Reference for aiThreadsAppendUserMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
   *
   * @param aiThreadsAppendUserMessageRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiThreadsAppendUserMessage(@javax.annotation.Nonnull AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsAppendUserMessageRequest;
    
    // verify the required parameter 'aiThreadsAppendUserMessageRequest' is set
    if (aiThreadsAppendUserMessageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsAppendUserMessageRequest' when calling aiThreadsAppendUserMessage");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/append-user-message";

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

    TypeReference<AiThreadMessageLike> localVarReturnType = new TypeReference<AiThreadMessageLike>() {};
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
   * Clear messages
   * Drops every message of a thread while keeping the thread itself, and bumps its last-edit date.
   *
   * REST API Reference for aiThreadsClearMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsClearMessages(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsClearMessages(body, Collections.emptyMap());
  }


  /**
   * Clear messages
   * Drops every message of a thread while keeping the thread itself, and bumps its last-edit date.
   *
   * REST API Reference for aiThreadsClearMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsClearMessages(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiThreadsClearMessages");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/clear-messages";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Create
   * Creates a chat thread with a caller-supplied title. Use `open-or-create` instead when the title should be generated from the first user message.
   *
   * REST API Reference for aiThreadsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/
   *
   * @param aiThreadsCreateRequest  (required)
   * @return AiThread
   * @throws ApiException if fails to make API call
   */
  public AiThread aiThreadsCreate(@javax.annotation.Nonnull AiThreadsCreateRequest aiThreadsCreateRequest) throws ApiException {
    return this.aiThreadsCreate(aiThreadsCreateRequest, Collections.emptyMap());
  }


  /**
   * Create
   * Creates a chat thread with a caller-supplied title. Use `open-or-create` instead when the title should be generated from the first user message.
   *
   * REST API Reference for aiThreadsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/
   *
   * @param aiThreadsCreateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThread
   * @throws ApiException if fails to make API call
   */
  public AiThread aiThreadsCreate(@javax.annotation.Nonnull AiThreadsCreateRequest aiThreadsCreateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsCreateRequest;
    
    // verify the required parameter 'aiThreadsCreateRequest' is set
    if (aiThreadsCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsCreateRequest' when calling aiThreadsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/create";

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

    TypeReference<AiThread> localVarReturnType = new TypeReference<AiThread>() {};
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
   * Delete
   * Deletes a chat thread together with its messages.
   *
   * REST API Reference for aiThreadsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete
   * Deletes a chat thread together with its messages.
   *
   * REST API Reference for aiThreadsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDelete(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiThreadsDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/delete";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Delete message
   * Deletes one chat message, leaving the rest of the thread untouched.
   *
   * REST API Reference for aiThreadsDeleteMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDeleteMessage(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsDeleteMessage(body, Collections.emptyMap());
  }


  /**
   * Delete message
   * Deletes one chat message, leaving the rest of the thread untouched.
   *
   * REST API Reference for aiThreadsDeleteMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDeleteMessage(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiThreadsDeleteMessage");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/delete-message";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get by id
   * Returns one chat thread, or an empty result when the identifier is unknown.
   *
   * REST API Reference for aiThreadsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/
   *
   * @param threadId The chat thread identifier. (required)
   * @return AiThread
   * @throws ApiException if fails to make API call
   */
  public AiThread aiThreadsGetById(@javax.annotation.Nonnull String threadId) throws ApiException {
    return this.aiThreadsGetById(threadId, Collections.emptyMap());
  }


  /**
   * Get by id
   * Returns one chat thread, or an empty result when the identifier is unknown.
   *
   * REST API Reference for aiThreadsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/
   *
   * @param threadId The chat thread identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThread
   * @throws ApiException if fails to make API call
   */
  public AiThread aiThreadsGetById(@javax.annotation.Nonnull String threadId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling aiThreadsGetById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/get-by-id";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("threadId", threadId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiThread> localVarReturnType = new TypeReference<AiThread>() {};
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
   * Get message by id
   * Returns one chat message by its globally unique identifier.
   *
   * REST API Reference for aiThreadsGetMessageById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/
   *
   * @param messageId The globally unique chat message identifier. (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiThreadsGetMessageById(@javax.annotation.Nonnull String messageId) throws ApiException {
    return this.aiThreadsGetMessageById(messageId, Collections.emptyMap());
  }


  /**
   * Get message by id
   * Returns one chat message by its globally unique identifier.
   *
   * REST API Reference for aiThreadsGetMessageById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/
   *
   * @param messageId The globally unique chat message identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiThreadsGetMessageById(@javax.annotation.Nonnull String messageId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling aiThreadsGetMessageById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/get-message-by-id";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("messageId", messageId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiThreadMessageLike> localVarReturnType = new TypeReference<AiThreadMessageLike>() {};
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
   * List
   * Lists the chat threads of the scope, most recently edited first. Supports cursor pagination and a server-side case-insensitive title search.
   *
   * REST API Reference for aiThreadsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param count The maximum number of items to return in one page. (optional)
   * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
   * @param query The full-text query the thread list is filtered by. (optional)
   * @return List&lt;AiThread&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiThread> aiThreadsList(@javax.annotation.Nullable String entityId, @javax.annotation.Nullable String count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String query) throws ApiException {
    return this.aiThreadsList(entityId, count, cursor, query, Collections.emptyMap());
  }


  /**
   * List
   * Lists the chat threads of the scope, most recently edited first. Supports cursor pagination and a server-side case-insensitive title search.
   *
   * REST API Reference for aiThreadsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param count The maximum number of items to return in one page. (optional)
   * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
   * @param query The full-text query the thread list is filtered by. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiThread&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiThread> aiThreadsList(@javax.annotation.Nullable String entityId, @javax.annotation.Nullable String count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/list";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
      
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<List<AiThread>> localVarReturnType = new TypeReference<List<AiThread>>() {};
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
   * Open or create
   * Opens a chat thread and returns its history, or creates one with a title generated from the supplied first message. That first message is not persisted - the caller decides whether to follow up with `append-user-message`.
   *
   * REST API Reference for aiThreadsOpenOrCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/
   *
   * @param aiThreadsOpenOrCreateRequest  (required)
   * @return AiOpenOrCreateResult
   * @throws ApiException if fails to make API call
   */
  public AiOpenOrCreateResult aiThreadsOpenOrCreate(@javax.annotation.Nonnull AiThreadsOpenOrCreateRequest aiThreadsOpenOrCreateRequest) throws ApiException {
    return this.aiThreadsOpenOrCreate(aiThreadsOpenOrCreateRequest, Collections.emptyMap());
  }


  /**
   * Open or create
   * Opens a chat thread and returns its history, or creates one with a title generated from the supplied first message. That first message is not persisted - the caller decides whether to follow up with `append-user-message`.
   *
   * REST API Reference for aiThreadsOpenOrCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/
   *
   * @param aiThreadsOpenOrCreateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiOpenOrCreateResult
   * @throws ApiException if fails to make API call
   */
  public AiOpenOrCreateResult aiThreadsOpenOrCreate(@javax.annotation.Nonnull AiThreadsOpenOrCreateRequest aiThreadsOpenOrCreateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsOpenOrCreateRequest;
    
    // verify the required parameter 'aiThreadsOpenOrCreateRequest' is set
    if (aiThreadsOpenOrCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsOpenOrCreateRequest' when calling aiThreadsOpenOrCreate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/open-or-create";

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

    TypeReference<AiOpenOrCreateResult> localVarReturnType = new TypeReference<AiOpenOrCreateResult>() {};
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
   * Read messages
   * Reads the messages of a thread, with the same cursor pagination as the thread list.
   *
   * REST API Reference for aiThreadsReadMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/
   *
   * @param threadId The chat thread identifier. (required)
   * @param count The maximum number of items to return in one page. (optional)
   * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
   * @param direction The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. (optional)
   * @return List&lt;AiThreadMessageLike&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiThreadMessageLike> aiThreadsReadMessages(@javax.annotation.Nonnull String threadId, @javax.annotation.Nullable String count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String direction) throws ApiException {
    return this.aiThreadsReadMessages(threadId, count, cursor, direction, Collections.emptyMap());
  }


  /**
   * Read messages
   * Reads the messages of a thread, with the same cursor pagination as the thread list.
   *
   * REST API Reference for aiThreadsReadMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/
   *
   * @param threadId The chat thread identifier. (required)
   * @param count The maximum number of items to return in one page. (optional)
   * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
   * @param direction The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiThreadMessageLike&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiThreadMessageLike> aiThreadsReadMessages(@javax.annotation.Nonnull String threadId, @javax.annotation.Nullable String count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String direction, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling aiThreadsReadMessages");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/read-messages";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("threadId", threadId));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPair("direction", direction));
      
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<List<AiThreadMessageLike>> localVarReturnType = new TypeReference<List<AiThreadMessageLike>>() {};
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
   * Regenerate title
   * Generates a fresh title from the thread's first user message and persists it. Fails when the thread has no user message yet.
   *
   * REST API Reference for aiThreadsRegenerateTitle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
   *
   * @param aiThreadsRegenerateTitleRequest  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String aiThreadsRegenerateTitle(@javax.annotation.Nonnull AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest) throws ApiException {
    return this.aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest, Collections.emptyMap());
  }


  /**
   * Regenerate title
   * Generates a fresh title from the thread's first user message and persists it. Fails when the thread has no user message yet.
   *
   * REST API Reference for aiThreadsRegenerateTitle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
   *
   * @param aiThreadsRegenerateTitleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String aiThreadsRegenerateTitle(@javax.annotation.Nonnull AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsRegenerateTitleRequest;
    
    // verify the required parameter 'aiThreadsRegenerateTitleRequest' is set
    if (aiThreadsRegenerateTitleRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsRegenerateTitleRequest' when calling aiThreadsRegenerateTitle");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/regenerate-title";

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

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
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
   * Rename
   * Renames a chat thread and bumps its last-edit date so the new title shows up in the sidebar.
   *
   * REST API Reference for aiThreadsRename Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/
   *
   * @param aiThreadsRenameRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsRename(@javax.annotation.Nonnull AiThreadsRenameRequest aiThreadsRenameRequest) throws ApiException {
    return this.aiThreadsRename(aiThreadsRenameRequest, Collections.emptyMap());
  }


  /**
   * Rename
   * Renames a chat thread and bumps its last-edit date so the new title shows up in the sidebar.
   *
   * REST API Reference for aiThreadsRename Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/
   *
   * @param aiThreadsRenameRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsRename(@javax.annotation.Nonnull AiThreadsRenameRequest aiThreadsRenameRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsRenameRequest;
    
    // verify the required parameter 'aiThreadsRenameRequest' is set
    if (aiThreadsRenameRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsRenameRequest' when calling aiThreadsRename");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/rename";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Touch
   * Bumps a thread's last-edit date, and optionally rebinds it to another profile, when something other than a new message - a model switch, say - should resurface it.
   *
   * REST API Reference for aiThreadsTouch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/
   *
   * @param aiThreadsTouchRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsTouch(@javax.annotation.Nonnull AiThreadsTouchRequest aiThreadsTouchRequest) throws ApiException {
    return this.aiThreadsTouch(aiThreadsTouchRequest, Collections.emptyMap());
  }


  /**
   * Touch
   * Bumps a thread's last-edit date, and optionally rebinds it to another profile, when something other than a new message - a model switch, say - should resurface it.
   *
   * REST API Reference for aiThreadsTouch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/
   *
   * @param aiThreadsTouchRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsTouch(@javax.annotation.Nonnull AiThreadsTouchRequest aiThreadsTouchRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsTouchRequest;
    
    // verify the required parameter 'aiThreadsTouchRequest' is set
    if (aiThreadsTouchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsTouchRequest' when calling aiThreadsTouch");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/touch";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Update message
   * Replaces the content of a chat message - used by the edit and regenerate flows that change a message outside the streaming lifecycle.
   *
   * REST API Reference for aiThreadsUpdateMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/
   *
   * @param aiThreadsUpdateMessageRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsUpdateMessage(@javax.annotation.Nonnull AiThreadsUpdateMessageRequest aiThreadsUpdateMessageRequest) throws ApiException {
    return this.aiThreadsUpdateMessage(aiThreadsUpdateMessageRequest, Collections.emptyMap());
  }


  /**
   * Update message
   * Replaces the content of a chat message - used by the edit and regenerate flows that change a message outside the streaming lifecycle.
   *
   * REST API Reference for aiThreadsUpdateMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/
   *
   * @param aiThreadsUpdateMessageRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsUpdateMessage(@javax.annotation.Nonnull AiThreadsUpdateMessageRequest aiThreadsUpdateMessageRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiThreadsUpdateMessageRequest;
    
    // verify the required parameter 'aiThreadsUpdateMessageRequest' is set
    if (aiThreadsUpdateMessageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiThreadsUpdateMessageRequest' when calling aiThreadsUpdateMessage");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/threads/update-message";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
