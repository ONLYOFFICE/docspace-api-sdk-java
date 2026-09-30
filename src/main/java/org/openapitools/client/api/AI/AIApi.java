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
   * Resumes a chat round that a tool call has paused, and streams the continuation as newline-delimited `ChatEvent` objects. The result supplied in the request is persisted onto the assistant message that issued the call, so the tool is not executed here - the caller runs it and reports the outcome. The round continues against the augmented history and may pause again on a further tool call. Call `POST api/2.0/ai/ai/deny-tool-call` instead to refuse the call and let the model answer without it.
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
   * Resumes a chat round that a tool call has paused, and streams the continuation as newline-delimited `ChatEvent` objects. The result supplied in the request is persisted onto the assistant message that issued the call, so the tool is not executed here - the caller runs it and reports the outcome. The round continues against the augmented history and may pause again on a further tool call. Call `POST api/2.0/ai/ai/deny-tool-call` instead to refuse the call and let the model answer without it.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Refuses the tool call a chat round is paused on and resumes it immediately, streaming the continuation as newline-delimited `ChatEvent` objects. The literal `User deny tool call` is persisted in place of the tool result, so the model sees an explicit refusal rather than a missing answer and may reply without the tool or ask for something else. Nothing is executed and no result is accepted from the caller. Use `POST api/2.0/ai/ai/approve-tool-call` to supply a result instead.
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
   * Refuses the tool call a chat round is paused on and resumes it immediately, streaming the continuation as newline-delimited `ChatEvent` objects. The literal `User deny tool call` is persisted in place of the tool result, so the model sees an explicit refusal rather than a missing answer and may reply without the tool or ask for something else. Nothing is executed and no result is accepted from the caller. Use `POST api/2.0/ai/ai/approve-tool-call` to supply a result instead.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Re-rolls the last assistant reply of an existing thread: every message after the last user message - the previous reply and any tool-call hops - is dropped, and a fresh reply is streamed as newline-delimited `ChatEvent` objects against the unchanged prompt. The thread has to exist already, `threadId` is required, and no title is generated. The dropped messages are gone for good, so this is a destructive operation on the thread's tail rather than a retry that keeps both answers. Unlike `send-with-stream` the profile is not verified before the stream opens, so an unusable model surfaces as an error frame inside the 200 rather than as a 4xx.
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
   * Re-rolls the last assistant reply of an existing thread: every message after the last user message - the previous reply and any tool-call hops - is dropped, and a fresh reply is streamed as newline-delimited `ChatEvent` objects against the unchanged prompt. The thread has to exist already, `threadId` is required, and no title is generated. The dropped messages are gone for good, so this is a destructive operation on the thread's tail rather than a retry that keeps both answers. Unlike `send-with-stream` the profile is not verified before the stream opens, so an unusable model surfaces as an error frame inside the 200 rather than as a 4xx.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Run an AI action
   * Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.
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
   * Run an AI action
   * Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. The shape of the answer depends on the body rather than on the route: with `isStream` set it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.
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
   * Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. The shape of the answer depends on the body rather than on the route: with `isStream` set it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Runs one chat round and streams it back as newline-delimited `ChatEvent` objects. Omitting `threadId` opens a new thread, which requires that `entityId` names a room the caller can open and that a profile resolves for it; the user message and the reply are persisted either way, and a new thread also gets a generated title. The model is settled in a fixed order - an agent's assignment in scope overrides everything, then the explicit `profileId`, then the one stored on the thread, then the `Chat` assignment - and the effective profile is checked before the stream opens, so an unknown one fails with 400 rather than as an error buried in a 200. A tool call pauses the round and ends the stream; resume it with `POST api/2.0/ai/ai/approve-tool-call` or `POST api/2.0/ai/ai/deny-tool-call`.
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
   * Runs one chat round and streams it back as newline-delimited `ChatEvent` objects. Omitting `threadId` opens a new thread, which requires that `entityId` names a room the caller can open and that a profile resolves for it; the user message and the reply are persisted either way, and a new thread also gets a generated title. The model is settled in a fixed order - an agent's assignment in scope overrides everything, then the explicit `profileId`, then the one stored on the thread, then the `Chat` assignment - and the effective profile is checked before the stream opens, so an unknown one fails with 400 rather than as an error buried in a 200. A tool call pauses the round and ends the stream; resume it with `POST api/2.0/ai/ai/approve-tool-call` or `POST api/2.0/ai/ai/deny-tool-call`.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Stream a chat in OpenAI format
   * The same chat round as `send-with-stream`, re-encoded as a server-sent-events stream of OpenAI `chat.completion.chunk` objects terminated by a `[DONE]` sentinel. Thread handling, persistence, title generation and the profile pre-flight are identical, and a tool call ends the stream with `finish_reason: tool_calls` instead of a pause event - resume it through the same approve and deny operations. Unlike `send-with-stream` it does not reject an empty user message and does not enforce the per-kind attachment cap, so validate both before calling. Choose this route only for a client that already speaks the OpenAI wire format; `POST api/2.0/ai/ai/send-with-stream` is the native one.
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
   * Stream a chat in OpenAI format
   * The same chat round as `send-with-stream`, re-encoded as a server-sent-events stream of OpenAI `chat.completion.chunk` objects terminated by a `[DONE]` sentinel. Thread handling, persistence, title generation and the profile pre-flight are identical, and a tool call ends the stream with `finish_reason: tool_calls` instead of a pause event - resume it through the same approve and deny operations. Unlike `send-with-stream` it does not reject an empty user message and does not enforce the per-kind attachment cap, so validate both before calling. Choose this route only for a client that already speaks the OpenAI wire format; `POST api/2.0/ai/ai/send-with-stream` is the native one.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
