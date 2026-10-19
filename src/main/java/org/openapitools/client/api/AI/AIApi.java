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

import org.openapitools.client.model.AiApproveToolCallRequest;
import org.openapitools.client.model.AiChatEvent;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiOpenAIStreamChunk;
import org.openapitools.client.model.AiRegenerateStreamRequest;
import org.openapitools.client.model.AiSendCustomRequest;
import org.openapitools.client.model.AiSendRequest;
import org.openapitools.client.model.AiSendStreamBody;
import org.openapitools.client.model.AiThreadMessageLike;
import org.openapitools.client.model.AiToolCallData;


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
   * REST API Reference for aiApproveToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-approve-tool-call/
   *
   * @param aiApproveToolCallRequest  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiApproveToolCall(@javax.annotation.Nonnull AiApproveToolCallRequest aiApproveToolCallRequest) throws ApiException {
    return this.aiApproveToolCall(aiApproveToolCallRequest, Collections.emptyMap());
  }


  /**
   * Approve tool call
   * Resumes a chat round that a tool call has paused, and streams the continuation as newline-delimited `ChatEvent` objects. The result supplied in the request is persisted onto the assistant message that issued the call, so the tool is not executed here - the caller runs it and reports the outcome. The round continues against the augmented history and may pause again on a further tool call. Call `POST api/2.0/ai/ai/deny-tool-call` instead to refuse the call and let the model answer without it.
   *
   * REST API Reference for aiApproveToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-approve-tool-call/
   *
   * @param aiApproveToolCallRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiApproveToolCall(@javax.annotation.Nonnull AiApproveToolCallRequest aiApproveToolCallRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiApproveToolCallRequest;
    
    // verify the required parameter 'aiApproveToolCallRequest' is set
    if (aiApproveToolCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiApproveToolCallRequest' when calling aiApproveToolCall");
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
   * REST API Reference for aiDenyToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-deny-tool-call/
   *
   * @param aiToolCallData  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiDenyToolCall(@javax.annotation.Nonnull AiToolCallData aiToolCallData) throws ApiException {
    return this.aiDenyToolCall(aiToolCallData, Collections.emptyMap());
  }


  /**
   * Deny tool call
   * Refuses the tool call a chat round is paused on and resumes it immediately, streaming the continuation as newline-delimited `ChatEvent` objects. The literal `User deny tool call` is persisted in place of the tool result, so the model sees an explicit refusal rather than a missing answer and may reply without the tool or ask for something else. Nothing is executed and no result is accepted from the caller. Use `POST api/2.0/ai/ai/approve-tool-call` to supply a result instead.
   *
   * REST API Reference for aiDenyToolCall Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-deny-tool-call/
   *
   * @param aiToolCallData  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiDenyToolCall(@javax.annotation.Nonnull AiToolCallData aiToolCallData, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolCallData;
    
    // verify the required parameter 'aiToolCallData' is set
    if (aiToolCallData == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolCallData' when calling aiDenyToolCall");
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
   * REST API Reference for aiRegenerateStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-regenerate-stream/
   *
   * @param aiRegenerateStreamRequest  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiRegenerateStream(@javax.annotation.Nonnull AiRegenerateStreamRequest aiRegenerateStreamRequest) throws ApiException {
    return this.aiRegenerateStream(aiRegenerateStreamRequest, Collections.emptyMap());
  }


  /**
   * Regenerate stream
   * Re-rolls the last assistant reply of an existing thread: every message after the last user message - the previous reply and any tool-call hops - is dropped, and a fresh reply is streamed as newline-delimited `ChatEvent` objects against the unchanged prompt. The thread has to exist already, `threadId` is required, and no title is generated. The dropped messages are gone for good, so this is a destructive operation on the thread's tail rather than a retry that keeps both answers. Unlike `send-with-stream` the profile is not verified before the stream opens, so an unusable model surfaces as an error frame inside the 200 rather than as a 4xx.
   *
   * REST API Reference for aiRegenerateStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-regenerate-stream/
   *
   * @param aiRegenerateStreamRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiRegenerateStream(@javax.annotation.Nonnull AiRegenerateStreamRequest aiRegenerateStreamRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiRegenerateStreamRequest;
    
    // verify the required parameter 'aiRegenerateStreamRequest' is set
    if (aiRegenerateStreamRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiRegenerateStreamRequest' when calling aiRegenerateStream");
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
   * Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. `actionType` has to be a known action and `userMessage` has to carry text or an attachment, or the call answers 400 before anything runs. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.
   *
   * REST API Reference for aiSend Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send/
   *
   * @param aiSendRequest  (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiSend(@javax.annotation.Nonnull AiSendRequest aiSendRequest) throws ApiException {
    return this.aiSend(aiSendRequest, Collections.emptyMap());
  }


  /**
   * Run an AI action
   * Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. `actionType` has to be a known action and `userMessage` has to carry text or an attachment, or the call answers 400 before anything runs. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.
   *
   * REST API Reference for aiSend Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send/
   *
   * @param aiSendRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiSend(@javax.annotation.Nonnull AiSendRequest aiSendRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSendRequest;
    
    // verify the required parameter 'aiSendRequest' is set
    if (aiSendRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSendRequest' when calling aiSend");
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
   * Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. `systemPrompt` is required and `userMessage` has to carry text or an attachment, or the call answers 400 before anything runs. The shape of the answer depends on the body rather than on the route: with `isStream: true` it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both; `isStream` has to be a real boolean when sent, a string is refused. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.
   *
   * REST API Reference for aiSendCustom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-custom/
   *
   * @param aiSendCustomRequest  (required)
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiSendCustom(@javax.annotation.Nonnull AiSendCustomRequest aiSendCustomRequest) throws ApiException {
    return this.aiSendCustom(aiSendCustomRequest, Collections.emptyMap());
  }


  /**
   * Send custom
   * Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. `systemPrompt` is required and `userMessage` has to carry text or an attachment, or the call answers 400 before anything runs. The shape of the answer depends on the body rather than on the route: with `isStream: true` it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both; `isStream` has to be a real boolean when sent, a string is refused. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.
   *
   * REST API Reference for aiSendCustom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-custom/
   *
   * @param aiSendCustomRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiThreadMessageLike
   * @throws ApiException if fails to make API call
   */
  public AiThreadMessageLike aiSendCustom(@javax.annotation.Nonnull AiSendCustomRequest aiSendCustomRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSendCustomRequest;
    
    // verify the required parameter 'aiSendCustomRequest' is set
    if (aiSendCustomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSendCustomRequest' when calling aiSendCustom");
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
   * REST API Reference for aiSendWithStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-with-stream/
   *
   * @param aiSendStreamBody  (required)
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiSendWithStream(@javax.annotation.Nonnull AiSendStreamBody aiSendStreamBody) throws ApiException {
    return this.aiSendWithStream(aiSendStreamBody, Collections.emptyMap());
  }


  /**
   * Send with stream
   * Runs one chat round and streams it back as newline-delimited `ChatEvent` objects. Omitting `threadId` opens a new thread, which requires that `entityId` names a room the caller can open and that a profile resolves for it; the user message and the reply are persisted either way, and a new thread also gets a generated title. The model is settled in a fixed order - an agent's assignment in scope overrides everything, then the explicit `profileId`, then the one stored on the thread, then the `Chat` assignment - and the effective profile is checked before the stream opens, so an unknown one fails with 400 rather than as an error buried in a 200. A tool call pauses the round and ends the stream; resume it with `POST api/2.0/ai/ai/approve-tool-call` or `POST api/2.0/ai/ai/deny-tool-call`.
   *
   * REST API Reference for aiSendWithStream Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-with-stream/
   *
   * @param aiSendStreamBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiChatEvent
   * @throws ApiException if fails to make API call
   */
  public AiChatEvent aiSendWithStream(@javax.annotation.Nonnull AiSendStreamBody aiSendStreamBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSendStreamBody;
    
    // verify the required parameter 'aiSendStreamBody' is set
    if (aiSendStreamBody == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSendStreamBody' when calling aiSendWithStream");
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
   * REST API Reference for aiSendWithStreamOpenAI Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-with-stream-open-ai/
   *
   * @param aiSendStreamBody  (required)
   * @return AiOpenAIStreamChunk
   * @throws ApiException if fails to make API call
   */
  public AiOpenAIStreamChunk aiSendWithStreamOpenAI(@javax.annotation.Nonnull AiSendStreamBody aiSendStreamBody) throws ApiException {
    return this.aiSendWithStreamOpenAI(aiSendStreamBody, Collections.emptyMap());
  }


  /**
   * Stream a chat in OpenAI format
   * The same chat round as `send-with-stream`, re-encoded as a server-sent-events stream of OpenAI `chat.completion.chunk` objects terminated by a `[DONE]` sentinel. Thread handling, persistence, title generation and the profile pre-flight are identical, and a tool call ends the stream with `finish_reason: tool_calls` instead of a pause event - resume it through the same approve and deny operations. Unlike `send-with-stream` it does not reject an empty user message and does not enforce the per-kind attachment cap, so validate both before calling. Choose this route only for a client that already speaks the OpenAI wire format; `POST api/2.0/ai/ai/send-with-stream` is the native one.
   *
   * REST API Reference for aiSendWithStreamOpenAI Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-send-with-stream-open-ai/
   *
   * @param aiSendStreamBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiOpenAIStreamChunk
   * @throws ApiException if fails to make API call
   */
  public AiOpenAIStreamChunk aiSendWithStreamOpenAI(@javax.annotation.Nonnull AiSendStreamBody aiSendStreamBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSendStreamBody;
    
    // verify the required parameter 'aiSendStreamBody' is set
    if (aiSendStreamBody == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSendStreamBody' when calling aiSendWithStreamOpenAI");
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
