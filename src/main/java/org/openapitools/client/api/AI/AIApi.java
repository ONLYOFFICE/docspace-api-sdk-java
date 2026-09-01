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

import org.openapitools.client.model.AiAiApproveToolCallRequest;
import org.openapitools.client.model.AiAiRegenerateStreamRequest;
import org.openapitools.client.model.AiAiSendCustomRequest;
import org.openapitools.client.model.AiAiSendRequest;
import org.openapitools.client.model.AiAiSendStreamBody;
import org.openapitools.client.model.AiAiToolCallData;
import org.openapitools.client.model.AiChatEvent;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiOpenAIStreamChunk;
import org.openapitools.client.model.AiThreadMessageLike;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AIApi extends BaseApi {

  public AIApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AIApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Approve tool call
   * Resumes a chat round paused on a tool call. The supplied result is persisted onto the assistant message that issued the call and the stream continues with the augmented history.
   *
   * REST API Reference for aiAiApproveToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/
   *
   * @param aiAiApproveToolCallRequest  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiApproveToolCall(@javax.annotation.Nonnull AiAiApproveToolCallRequest aiAiApproveToolCallRequest) throws ApiException {
    return this.aiAiApproveToolCall(aiAiApproveToolCallRequest, Collections.emptyMap());
  }


  /**
   * Approve tool call
   * Resumes a chat round paused on a tool call. The supplied result is persisted onto the assistant message that issued the call and the stream continues with the augmented history.
   *
   * REST API Reference for aiAiApproveToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/
   *
   * @param aiAiApproveToolCallRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiApproveToolCall(@javax.annotation.Nonnull AiAiApproveToolCallRequest aiAiApproveToolCallRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiApproveToolCallRequest;
    
    // verify the required parameter 'aiAiApproveToolCallRequest' is set
    if (aiAiApproveToolCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiApproveToolCallRequest' when calling aiAiApproveToolCall");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/approve-tool-call";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/x-ndjson", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiChatEvent> localVarReturnType = new TypeReference<AiChatEvent>() {};
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
   * Deny tool call
   * Denies the pending tool call and resumes the chat immediately, with `User deny tool call` standing in for the tool result.
   *
   * REST API Reference for aiAiDenyToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/
   *
   * @param aiAiToolCallData  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiDenyToolCall(@javax.annotation.Nonnull AiAiToolCallData aiAiToolCallData) throws ApiException {
    return this.aiAiDenyToolCall(aiAiToolCallData, Collections.emptyMap());
  }


  /**
   * Deny tool call
   * Denies the pending tool call and resumes the chat immediately, with `User deny tool call` standing in for the tool result.
   *
   * REST API Reference for aiAiDenyToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/
   *
   * @param aiAiToolCallData  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiDenyToolCall(@javax.annotation.Nonnull AiAiToolCallData aiAiToolCallData, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiToolCallData;
    
    // verify the required parameter 'aiAiToolCallData' is set
    if (aiAiToolCallData == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiToolCallData' when calling aiAiDenyToolCall");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/deny-tool-call";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/x-ndjson", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiChatEvent> localVarReturnType = new TypeReference<AiChatEvent>() {};
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
   * Regenerate stream
   * Re-rolls the last assistant reply in an existing thread: every message after the last user message (the previous reply plus any tool-call hops) is dropped and a fresh reply is streamed against the unchanged prompt. The thread must already exist and no title is generated.
   *
   * REST API Reference for aiAiRegenerateStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/
   *
   * @param aiAiRegenerateStreamRequest  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiRegenerateStream(@javax.annotation.Nonnull AiAiRegenerateStreamRequest aiAiRegenerateStreamRequest) throws ApiException {
    return this.aiAiRegenerateStream(aiAiRegenerateStreamRequest, Collections.emptyMap());
  }


  /**
   * Regenerate stream
   * Re-rolls the last assistant reply in an existing thread: every message after the last user message (the previous reply plus any tool-call hops) is dropped and a fresh reply is streamed against the unchanged prompt. The thread must already exist and no title is generated.
   *
   * REST API Reference for aiAiRegenerateStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/
   *
   * @param aiAiRegenerateStreamRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiRegenerateStream(@javax.annotation.Nonnull AiAiRegenerateStreamRequest aiAiRegenerateStreamRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiRegenerateStreamRequest;
    
    // verify the required parameter 'aiAiRegenerateStreamRequest' is set
    if (aiAiRegenerateStreamRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiRegenerateStreamRequest' when calling aiAiRegenerateStream");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/regenerate-stream";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/x-ndjson", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiChatEvent> localVarReturnType = new TypeReference<AiChatEvent>() {};
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
   * Send
   * Runs one AI action: the profile bound to `actionType` (falling back to the `Default` slot) is dispatched against a single-message history. Nothing is persisted - no thread, no title generation, no storage writes.
   *
   * REST API Reference for aiAiSend Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/
   *
   * @param aiAiSendRequest  (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiAiSend(@javax.annotation.Nonnull AiAiSendRequest aiAiSendRequest) throws ApiException {
    return this.aiAiSend(aiAiSendRequest, Collections.emptyMap());
  }


  /**
   * Send
   * Runs one AI action: the profile bound to `actionType` (falling back to the `Default` slot) is dispatched against a single-message history. Nothing is persisted - no thread, no title generation, no storage writes.
   *
   * REST API Reference for aiAiSend Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/
   *
   * @param aiAiSendRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiAiSend(@javax.annotation.Nonnull AiAiSendRequest aiAiSendRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiSendRequest;
    
    // verify the required parameter 'aiAiSendRequest' is set
    if (aiAiSendRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiSendRequest' when calling aiAiSend");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/send";

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
   * Send custom
   * Runs a free-form one-turn call against a caller-supplied system prompt. No thread, no history and no persistence. The profile is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot.
   *
   * REST API Reference for aiAiSendCustom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/
   *
   * @param aiAiSendCustomRequest  (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiAiSendCustom(@javax.annotation.Nonnull AiAiSendCustomRequest aiAiSendCustomRequest) throws ApiException {
    return this.aiAiSendCustom(aiAiSendCustomRequest, Collections.emptyMap());
  }


  /**
   * Send custom
   * Runs a free-form one-turn call against a caller-supplied system prompt. No thread, no history and no persistence. The profile is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot.
   *
   * REST API Reference for aiAiSendCustom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/
   *
   * @param aiAiSendCustomRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiAiSendCustom(@javax.annotation.Nonnull AiAiSendCustomRequest aiAiSendCustomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiSendCustomRequest;
    
    // verify the required parameter 'aiAiSendCustomRequest' is set
    if (aiAiSendCustomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiSendCustomRequest' when calling aiAiSendCustom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/send-custom";

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
   * Send with stream
   * Starts a chat round and streams it back as newline-delimited `ChatEvent` objects. The thread is opened or created, the user message and the reply are persisted, a new thread gets a generated title, and a tool call pauses the round until it is approved or denied.
   *
   * REST API Reference for aiAiSendWithStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/
   *
   * @param aiAiSendStreamBody  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiSendWithStream(@javax.annotation.Nonnull AiAiSendStreamBody aiAiSendStreamBody) throws ApiException {
    return this.aiAiSendWithStream(aiAiSendStreamBody, Collections.emptyMap());
  }


  /**
   * Send with stream
   * Starts a chat round and streams it back as newline-delimited `ChatEvent` objects. The thread is opened or created, the user message and the reply are persisted, a new thread gets a generated title, and a tool call pauses the round until it is approved or denied.
   *
   * REST API Reference for aiAiSendWithStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/
   *
   * @param aiAiSendStreamBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiAiSendWithStream(@javax.annotation.Nonnull AiAiSendStreamBody aiAiSendStreamBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiSendStreamBody;
    
    // verify the required parameter 'aiAiSendStreamBody' is set
    if (aiAiSendStreamBody == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiSendStreamBody' when calling aiAiSendWithStream");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/send-with-stream";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/x-ndjson", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiChatEvent> localVarReturnType = new TypeReference<AiChatEvent>() {};
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
   * Send with stream open ai
   * The same chat round as `send-with-stream`, re-encoded as an OpenAI Chat Completions stream of `chat.completion.chunk` objects. Storage, title generation and tool-call pauses are identical - only the wire shape differs; a tool call ends the stream with `finish_reason: tool_calls`.
   *
   * REST API Reference for aiAiSendWithStreamOpenAI Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/
   *
   * @param aiAiSendStreamBody  (required)
   * @return AiOpenAIStreamChunk
   * @throws ApiException if fails to make API call
   */
  public AiOpenAIStreamChunk aiAiSendWithStreamOpenAI(@javax.annotation.Nonnull AiAiSendStreamBody aiAiSendStreamBody) throws ApiException {
    return this.aiAiSendWithStreamOpenAI(aiAiSendStreamBody, Collections.emptyMap());
  }


  /**
   * Send with stream open ai
   * The same chat round as `send-with-stream`, re-encoded as an OpenAI Chat Completions stream of `chat.completion.chunk` objects. Storage, title generation and tool-call pauses are identical - only the wire shape differs; a tool call ends the stream with `finish_reason: tool_calls`.
   *
   * REST API Reference for aiAiSendWithStreamOpenAI Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/
   *
   * @param aiAiSendStreamBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiOpenAIStreamChunk
   * @throws ApiException if fails to make API call
   */
  public AiOpenAIStreamChunk aiAiSendWithStreamOpenAI(@javax.annotation.Nonnull AiAiSendStreamBody aiAiSendStreamBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAiSendStreamBody;
    
    // verify the required parameter 'aiAiSendStreamBody' is set
    if (aiAiSendStreamBody == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAiSendStreamBody' when calling aiAiSendWithStreamOpenAI");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/ai/send-with-stream-openai";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/event-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiOpenAIStreamChunk> localVarReturnType = new TypeReference<AiOpenAIStreamChunk>() {};
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
      "text/event-stream", "application/json"
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
