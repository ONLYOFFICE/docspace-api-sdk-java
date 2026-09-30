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
import org.openapitools.client.model.AiThreadsAppendUserMessage200Response;
import org.openapitools.client.model.AiThreadsAppendUserMessageRequest;
import org.openapitools.client.model.AiThreadsCreateRequest;
import org.openapitools.client.model.AiThreadsOpenOrCreateRequest;
import org.openapitools.client.model.AiThreadsRegenerateTitle200Response;
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
   * Stores a user message in a thread and bumps its last-edit date so the thread resurfaces at the top of the list. The per-kind attachment cap of the composer is enforced here as well, so a direct API call cannot exceed what the UI allows. Passing `profileId` rebinds the thread to another model, which is how a mid-conversation model switch is recorded. The answer carries the new message's ID; the message is stored as sent and no reply is generated - run a round with `POST api/2.0/ai/ai/send-with-stream` for that.
   *
   * REST API Reference for aiThreadsAppendUserMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
   *
   * @param aiThreadsAppendUserMessageRequest  (required)
   * @return AiThreadsAppendUserMessage200Response
   * @throws ApiException if fails to make API call
   */
  public AiThreadsAppendUserMessage200Response aiThreadsAppendUserMessage(@javax.annotation.Nonnull AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest) throws ApiException {
    return this.aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest, Collections.emptyMap());
  }


  /**
   * Append user message
   * Stores a user message in a thread and bumps its last-edit date so the thread resurfaces at the top of the list. The per-kind attachment cap of the composer is enforced here as well, so a direct API call cannot exceed what the UI allows. Passing `profileId` rebinds the thread to another model, which is how a mid-conversation model switch is recorded. The answer carries the new message's ID; the message is stored as sent and no reply is generated - run a round with `POST api/2.0/ai/ai/send-with-stream` for that.
   *
   * REST API Reference for aiThreadsAppendUserMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
   *
   * @param aiThreadsAppendUserMessageRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadsAppendUserMessage200Response
   * @throws ApiException if fails to make API call
   */
  public AiThreadsAppendUserMessage200Response aiThreadsAppendUserMessage(@javax.annotation.Nonnull AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiThreadsAppendUserMessage200Response> localVarReturnType = new TypeReference<AiThreadsAppendUserMessage200Response>() {};
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
   * Removes every message of a thread while keeping the thread, its title and its model binding, and bumps its last-edit date. The messages are gone for good. Unlike `delete` this does not verify that the thread exists, so clearing an unknown `threadId` reports success rather than 404. The answer only confirms the write.
   *
   * REST API Reference for aiThreadsClearMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
   *
   * @param body The ID of the thread to empty, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsClearMessages(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsClearMessages(body, Collections.emptyMap());
  }


  /**
   * Clear messages
   * Removes every message of a thread while keeping the thread, its title and its model binding, and bumps its last-edit date. The messages are gone for good. Unlike `delete` this does not verify that the thread exists, so clearing an unknown `threadId` reports success rather than 404. The answer only confirms the write.
   *
   * REST API Reference for aiThreadsClearMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
   *
   * @param body The ID of the thread to empty, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Create a chat thread
   * Creates a chat thread with a title supplied by the caller and returns it. A scoped thread requires that `entityId` names a room the caller can open, and a model has to resolve for the scope - an explicit `profileId`, or the room's `Chat` assignment - otherwise there is nothing to run the thread against and the call answers 404. In an agent room the agent's own assignment overrides any `profileId` sent with the request, so a thread there always starts on the agent's model. Use `POST api/2.0/ai/threads/open-or-create` instead when the title should be generated from the first user message.
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
   * Create a chat thread
   * Creates a chat thread with a title supplied by the caller and returns it. A scoped thread requires that `entityId` names a room the caller can open, and a model has to resolve for the scope - an explicit `profileId`, or the room's `Chat` assignment - otherwise there is nothing to run the thread against and the call answers 404. In an agent room the agent's own assignment overrides any `profileId` sent with the request, so a thread there always starts on the agent's model. Use `POST api/2.0/ai/threads/open-or-create` instead when the title should be generated from the first user message.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Delete a chat thread
   * Deletes a thread together with every message in it. The thread has to exist: unlike the other operations that take a `threadId`, this one checks first and answers 404 for an unknown or already-deleted thread rather than reporting success. The deletion is permanent and the messages cannot be recovered. To empty a thread but keep it, use `DELETE api/2.0/ai/threads/clear-messages`.
   *
   * REST API Reference for aiThreadsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
   *
   * @param body The ID of the thread to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete a chat thread
   * Deletes a thread together with every message in it. The thread has to exist: unlike the other operations that take a `threadId`, this one checks first and answers 404 for an unknown or already-deleted thread rather than reporting success. The deletion is permanent and the messages cannot be recovered. To empty a thread but keep it, use `DELETE api/2.0/ai/threads/clear-messages`.
   *
   * REST API Reference for aiThreadsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
   *
   * @param body The ID of the thread to delete, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Deletes one message and leaves the rest of the thread untouched. `messageId` is required and may be sent either in the body or as a query parameter. An unknown ID is not reported: the call answers success without having deleted anything, so verify with `GET api/2.0/ai/threads/read-messages` when it matters. The deletion is permanent.
   *
   * REST API Reference for aiThreadsDeleteMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
   *
   * @param body The ID of the message to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiThreadsDeleteMessage(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiThreadsDeleteMessage(body, Collections.emptyMap());
  }


  /**
   * Delete message
   * Deletes one message and leaves the rest of the thread untouched. `messageId` is required and may be sent either in the body or as a query parameter. An unknown ID is not reported: the call answers success without having deleted anything, so verify with `GET api/2.0/ai/threads/read-messages` when it matters. The deletion is permanent.
   *
   * REST API Reference for aiThreadsDeleteMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
   *
   * @param body The ID of the message to delete, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Get a chat thread
   * Returns one thread by its ID, without its messages - read those with `GET api/2.0/ai/threads/read-messages`. `threadId` is required and an unknown one answers 404, so the result is never an empty body. The answer carries the thread's title, its model binding and its last-edit date. This is a read-only operation and does not bump that date.
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
   * Get a chat thread
   * Returns one thread by its ID, without its messages - read those with `GET api/2.0/ai/threads/read-messages`. `threadId` is required and an unknown one answers 404, so the result is never an empty body. The answer carries the thread's title, its model binding and its last-edit date. This is a read-only operation and does not bump that date.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Get one chat message
   * Returns one message by its ID, wherever it sits, without needing the thread it belongs to. `messageId` is required. Unlike `GET api/2.0/ai/threads/get-by-id` an unknown ID is not reported as 404: the answer is an empty body with status 200, so a client has to treat a missing payload as no such message. Message IDs come from the thread history or from the answer of `POST api/2.0/ai/threads/append-user-message`.
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
   * Get one chat message
   * Returns one message by its ID, wherever it sits, without needing the thread it belongs to. `messageId` is required. Unlike `GET api/2.0/ai/threads/get-by-id` an unknown ID is not reported as 404: the answer is an empty body with status 200, so a client has to treat a missing payload as no such message. Message IDs come from the thread history or from the answer of `POST api/2.0/ai/threads/append-user-message`.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * List chat threads
   * Lists the threads of a scope, most recently edited first, and searches their titles case-insensitively when `query` is given. Every parameter is optional: omitting `entityId` lists the global scope, and omitting `count` lets the engine apply its own page size. Pagination is by cursor, and the cursor is a JSON object passed as a string in the query - `{id: <last thread id>, lastEditDate: <its date>}` - taken from the last entry of the previous page. A cursor that is not valid JSON, or that lacks an `id`, is ignored rather than rejected, and the read silently starts from the first page again.
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
  public List<AiThread> aiThreadsList(@javax.annotation.Nullable String entityId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String query) throws ApiException {
    return this.aiThreadsList(entityId, count, cursor, query, Collections.emptyMap());
  }


  /**
   * List chat threads
   * Lists the threads of a scope, most recently edited first, and searches their titles case-insensitively when `query` is given. Every parameter is optional: omitting `entityId` lists the global scope, and omitting `count` lets the engine apply its own page size. Pagination is by cursor, and the cursor is a JSON object passed as a string in the query - `{id: <last thread id>, lastEditDate: <its date>}` - taken from the last entry of the previous page. A cursor that is not valid JSON, or that lacks an `id`, is ignored rather than rejected, and the read silently starts from the first page again.
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
  public List<AiThread> aiThreadsList(@javax.annotation.Nullable String entityId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Opens a chat thread and returns it with its history, or creates one whose title is generated from the first message supplied in the request. That first message is not persisted: follow up with `POST api/2.0/ai/threads/append-user-message` to store it, or start the round directly with `POST api/2.0/ai/ai/send-with-stream`. Unlike `create` this takes a whole resolved `profile` object rather than an ID, and a request without one answers 404 because no model could be bound. A supplied `entityId` has to be a room the caller can open; anything that is not an agent room folds to the global scope instead of being rejected.
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
   * Opens a chat thread and returns it with its history, or creates one whose title is generated from the first message supplied in the request. That first message is not persisted: follow up with `POST api/2.0/ai/threads/append-user-message` to store it, or start the round directly with `POST api/2.0/ai/ai/send-with-stream`. Unlike `create` this takes a whole resolved `profile` object rather than an ID, and a request without one answers 404 because no model could be bound. A supplied `entityId` has to be a room the caller can open; anything that is not an agent room folds to the global scope instead of being rejected.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Reads the messages of one thread, oldest first, with the same string-encoded JSON cursor as the thread list. `direction` turns the read around, and only the exact value `desc` does so - anything else, including a misspelling, reads forward. Omitting `threadId` is not an error: the call answers 200 with an empty list, so an empty result does not distinguish a thread with no messages from a request that forgot the ID. A malformed cursor is ignored and the read starts from the beginning.
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
  public List<AiThreadMessageLike> aiThreadsReadMessages(@javax.annotation.Nonnull String threadId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String direction) throws ApiException {
    return this.aiThreadsReadMessages(threadId, count, cursor, direction, Collections.emptyMap());
  }


  /**
   * Read messages
   * Reads the messages of one thread, oldest first, with the same string-encoded JSON cursor as the thread list. `direction` turns the read around, and only the exact value `desc` does so - anything else, including a misspelling, reads forward. Omitting `threadId` is not an error: the call answers 200 with an empty list, so an empty result does not distinguish a thread with no messages from a request that forgot the ID. A malformed cursor is ignored and the read starts from the beginning.
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
  public List<AiThreadMessageLike> aiThreadsReadMessages(@javax.annotation.Nonnull String threadId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable String direction, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Asks the model to produce a title from the thread's first user message, stores it, and returns the new title. Both `threadId` and a resolved `profile` object are required; a thread with no user message yet has nothing to title and fails. This costs a model call, unlike `POST api/2.0/ai/threads/rename`, which just stores the string it is given. An `entityMeta` sent with the request is only read for its `entityId` hint - the source itself is resolved server-side under the caller's credentials, so a client cannot attribute the call to somebody else's room.
   *
   * REST API Reference for aiThreadsRegenerateTitle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
   *
   * @param aiThreadsRegenerateTitleRequest  (required)
   * @return AiThreadsRegenerateTitle200Response
   * @throws ApiException if fails to make API call
   */
  public AiThreadsRegenerateTitle200Response aiThreadsRegenerateTitle(@javax.annotation.Nonnull AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest) throws ApiException {
    return this.aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest, Collections.emptyMap());
  }


  /**
   * Regenerate title
   * Asks the model to produce a title from the thread's first user message, stores it, and returns the new title. Both `threadId` and a resolved `profile` object are required; a thread with no user message yet has nothing to title and fails. This costs a model call, unlike `POST api/2.0/ai/threads/rename`, which just stores the string it is given. An `entityMeta` sent with the request is only read for its `entityId` hint - the source itself is resolved server-side under the caller's credentials, so a client cannot attribute the call to somebody else's room.
   *
   * REST API Reference for aiThreadsRegenerateTitle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
   *
   * @param aiThreadsRegenerateTitleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadsRegenerateTitle200Response
   * @throws ApiException if fails to make API call
   */
  public AiThreadsRegenerateTitle200Response aiThreadsRegenerateTitle(@javax.annotation.Nonnull AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiThreadsRegenerateTitle200Response> localVarReturnType = new TypeReference<AiThreadsRegenerateTitle200Response>() {};
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
   * Rename a chat thread
   * Replaces a thread's title with the one supplied and bumps its last-edit date. Both `threadId` and a title with at least one non-whitespace character are required - a blank title is rejected rather than silently stored, so a thread cannot end up nameless. The answer only confirms the write. To have the model produce a title instead of supplying one, use `POST api/2.0/ai/threads/regenerate-title`.
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
   * Rename a chat thread
   * Replaces a thread's title with the one supplied and bumps its last-edit date. Both `threadId` and a title with at least one non-whitespace character are required - a blank title is rejected rather than silently stored, so a thread cannot end up nameless. The answer only confirms the write. To have the model produce a title instead of supplying one, use `POST api/2.0/ai/threads/regenerate-title`.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Bump a thread's activity
   * Bumps a thread's last-edit date without adding a message, which resurfaces it in the list. Passing `profileId` also rebinds the thread to another model, so this is the operation to call when a model switch alone should count as activity. Nothing else about the thread changes and the answer only confirms the write. It is idempotent: repeating it simply moves the date forward again.
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
   * Bump a thread's activity
   * Bumps a thread's last-edit date without adding a message, which resurfaces it in the list. Passing `profileId` also rebinds the thread to another model, so this is the operation to call when a model switch alone should count as activity. Nothing else about the thread changes and the answer only confirms the write. It is idempotent: repeating it simply moves the date forward again.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Replaces the content of one stored message, which is how the edit and regenerate flows change a message outside the streaming lifecycle. The whole message is overwritten by the one supplied rather than merged, so send a complete object. Neither the ID nor the payload is validated here, so a malformed request surfaces as an error relayed from storage rather than as a 400. The answer only confirms the write.
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
   * Replaces the content of one stored message, which is how the edit and regenerate flows change a message outside the streaming lifecycle. The whole message is overwritten by the one supplied rather than merged, so send a complete object. Neither the ID nor the payload is validated here, so a malformed request surfaces as an error relayed from storage rather than as a 400. The answer only confirms the write.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
