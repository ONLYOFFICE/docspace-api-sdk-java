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

import org.openapitools.client.model.ChatArrayWrapper;
import org.openapitools.client.model.ChatWrapper;
import org.openapitools.client.model.ContinueChatBody;
import org.openapitools.client.model.ExportChatRequestBody;
import org.openapitools.client.model.MessageArrayWrapper;
import org.openapitools.client.model.ModelArrayWrapper;
import org.openapitools.client.model.RenameChatBody;
import org.openapitools.client.model.SetUserChatSettingsRequestBody;
import org.openapitools.client.model.StartNewChatBody;
import org.openapitools.client.model.ToolDecisionRequestBody;
import java.util.UUID;
import org.openapitools.client.model.UserChatSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ChatApi extends BaseApi {

  public ChatApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Send a message to an existing AI chat
   * Appends a new user message to an existing chat session and streams the AI assistant's response.  The full conversation history of the chat is sent to the AI provider to maintain context.  The response is delivered as a Server-Sent Events (SSE) stream with periodic keep-alive pings.  File references can optionally be attached to provide additional context.
   *
   * REST API Reference for continueChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-chat/
   *
   * @param chatId The unique identifier of the existing AI chat session to continue. (required)
   * @param continueChatBody The message and optional file attachments. (required)
   * @throws ApiException if fails to make API call
   */
  public void continueChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull ContinueChatBody continueChatBody) throws ApiException {
    this.continueChat(chatId, continueChatBody, Collections.emptyMap());
  }


  /**
   * Send a message to an existing AI chat
   * Appends a new user message to an existing chat session and streams the AI assistant's response.  The full conversation history of the chat is sent to the AI provider to maintain context.  The response is delivered as a Server-Sent Events (SSE) stream with periodic keep-alive pings.  File references can optionally be attached to provide additional context.
   *
   * REST API Reference for continueChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-chat/
   *
   * @param chatId The unique identifier of the existing AI chat session to continue. (required)
   * @param continueChatBody The message and optional file attachments. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void continueChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull ContinueChatBody continueChatBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = continueChatBody;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling continueChat");
    }
    
    // verify the required parameter 'continueChatBody' is set
    if (continueChatBody == null) {
      throw new ApiException(400, "Missing the required parameter 'continueChatBody' when calling continueChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}/messages"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Delete an AI chat
   * Permanently deletes an AI chat session along with all of its messages.  Only the chat owner can delete their own chat sessions. This action cannot be undone.
   *
   * REST API Reference for deleteChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-chat/
   *
   * @param chatId The unique identifier of the AI chat session to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteChat(@javax.annotation.Nonnull UUID chatId) throws ApiException {
    this.deleteChat(chatId, Collections.emptyMap());
  }


  /**
   * Delete an AI chat
   * Permanently deletes an AI chat session along with all of its messages.  Only the chat owner can delete their own chat sessions. This action cannot be undone.
   *
   * REST API Reference for deleteChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-chat/
   *
   * @param chatId The unique identifier of the AI chat session to delete. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteChat(@javax.annotation.Nonnull UUID chatId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling deleteChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Export AI chat messages to a file
   * Exports the entire message history of an AI chat session and saves it as a document in the specified folder.  The exported file is created with the provided title. Only the chat owner can export their own chat sessions.
   *
   * REST API Reference for exportChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-chat/
   *
   * @param chatId The unique identifier of the AI chat session to export. (required)
   * @param exportChatRequestBody The export parameters including destination folder and file title. (required)
   * @throws ApiException if fails to make API call
   */
  public void exportChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull ExportChatRequestBody exportChatRequestBody) throws ApiException {
    this.exportChat(chatId, exportChatRequestBody, Collections.emptyMap());
  }


  /**
   * Export AI chat messages to a file
   * Exports the entire message history of an AI chat session and saves it as a document in the specified folder.  The exported file is created with the provided title. Only the chat owner can export their own chat sessions.
   *
   * REST API Reference for exportChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-chat/
   *
   * @param chatId The unique identifier of the AI chat session to export. (required)
   * @param exportChatRequestBody The export parameters including destination folder and file title. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void exportChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull ExportChatRequestBody exportChatRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = exportChatRequestBody;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling exportChat");
    }
    
    // verify the required parameter 'exportChatRequestBody' is set
    if (exportChatRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'exportChatRequestBody' when calling exportChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}/messages/export"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Get an AI chat by ID
   * Retrieves the metadata of a single AI chat session, including its title, creation date, and the user who created it.  Only the chat owner can access their own chat sessions.
   *
   * REST API Reference for getChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat/
   *
   * @param chatId The unique identifier of the AI chat session to retrieve. (required)
   * @return ChatWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatWrapper getChat(@javax.annotation.Nonnull UUID chatId) throws ApiException {
    return this.getChat(chatId, Collections.emptyMap());
  }


  /**
   * Get an AI chat by ID
   * Retrieves the metadata of a single AI chat session, including its title, creation date, and the user who created it.  Only the chat owner can access their own chat sessions.
   *
   * REST API Reference for getChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat/
   *
   * @param chatId The unique identifier of the AI chat session to retrieve. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChatWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatWrapper getChat(@javax.annotation.Nonnull UUID chatId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling getChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

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

    TypeReference<ChatWrapper> localVarReturnType = new TypeReference<ChatWrapper>() {};
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
   * Get available AI models
   * Returns the list of AI models available for chat conversations.  Optionally filters the results to models from a specific provider when the provider query parameter is specified.  Each model entry includes the provider ID, provider display name, and the model identifier.
   *
   * REST API Reference for getChatModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat-models/
   *
   * @param provider The optional AI provider identifier to filter models by. When set to 0, models from all providers are returned. (optional)
   * @return ModelArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ModelArrayWrapper getChatModels(@javax.annotation.Nullable Integer provider) throws ApiException {
    return this.getChatModels(provider, Collections.emptyMap());
  }


  /**
   * Get available AI models
   * Returns the list of AI models available for chat conversations.  Optionally filters the results to models from a specific provider when the provider query parameter is specified.  Each model entry includes the provider ID, provider display name, and the model identifier.
   *
   * REST API Reference for getChatModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat-models/
   *
   * @param provider The optional AI provider identifier to filter models by. When set to 0, models from all providers are returned. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ModelArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ModelArrayWrapper getChatModels(@javax.annotation.Nullable Integer provider, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/models";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("provider", provider));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ModelArrayWrapper> localVarReturnType = new TypeReference<ModelArrayWrapper>() {};
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
   * Get AI chats in a room
   * Returns a paginated list of AI chat sessions that belong to the current user within the specified room.  Supports pagination via the startIndex and count query parameters. The total number of chats is included in the response metadata.
   *
   * REST API Reference for getChats Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chats/
   *
   * @param roomId The identifier of the room whose AI chat sessions are to be listed. (required)
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @return ChatArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatArrayWrapper getChats(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.getChats(roomId, startIndex, count, Collections.emptyMap());
  }


  /**
   * Get AI chats in a room
   * Returns a paginated list of AI chat sessions that belong to the current user within the specified room.  Supports pagination via the startIndex and count query parameters. The total number of chats is included in the response metadata.
   *
   * REST API Reference for getChats Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chats/
   *
   * @param roomId The identifier of the room whose AI chat sessions are to be listed. (required)
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChatArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatArrayWrapper getChats(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getChats");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/chats"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ChatArrayWrapper> localVarReturnType = new TypeReference<ChatArrayWrapper>() {};
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
   * Get messages of an AI chat
   * Returns a paginated list of messages from an AI chat session owned by the current user.  Each message includes its role (user or assistant), content blocks (text, tool calls, attachments), and timestamp.  Supports pagination via the startIndex and count query parameters. The total number of messages is included in the response metadata.
   *
   * REST API Reference for getMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-messages/
   *
   * @param chatId The unique identifier of the AI chat session whose messages are to be listed. (required)
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @return MessageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MessageArrayWrapper getMessages(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.getMessages(chatId, startIndex, count, Collections.emptyMap());
  }


  /**
   * Get messages of an AI chat
   * Returns a paginated list of messages from an AI chat session owned by the current user.  Each message includes its role (user or assistant), content blocks (text, tool calls, attachments), and timestamp.  Supports pagination via the startIndex and count query parameters. The total number of messages is included in the response metadata.
   *
   * REST API Reference for getMessages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-messages/
   *
   * @param chatId The unique identifier of the AI chat session whose messages are to be listed. (required)
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return MessageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MessageArrayWrapper getMessages(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling getMessages");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}/messages"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<MessageArrayWrapper> localVarReturnType = new TypeReference<MessageArrayWrapper>() {};
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
   * Get user chat settings for a room
   * Retrieves the current user's personal AI chat preferences for the specified room,  including whether web search is enabled for AI-assisted responses.
   *
   * REST API Reference for getUserChatsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-chats-settings/
   *
   * @param roomId The identifier of the room whose chat settings are to be retrieved. (required)
   * @return UserChatSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public UserChatSettingsWrapper getUserChatsSettings(@javax.annotation.Nonnull Integer roomId) throws ApiException {
    return this.getUserChatsSettings(roomId, Collections.emptyMap());
  }


  /**
   * Get user chat settings for a room
   * Retrieves the current user's personal AI chat preferences for the specified room,  including whether web search is enabled for AI-assisted responses.
   *
   * REST API Reference for getUserChatsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-chats-settings/
   *
   * @param roomId The identifier of the room whose chat settings are to be retrieved. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserChatSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public UserChatSettingsWrapper getUserChatsSettings(@javax.annotation.Nonnull Integer roomId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getUserChatsSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/chats/config"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

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

    TypeReference<UserChatSettingsWrapper> localVarReturnType = new TypeReference<UserChatSettingsWrapper>() {};
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
   * Submit a tool execution permission decision
   * Provides the user's approval or denial decision for a pending MCP (Model Context Protocol) tool execution request.  When an AI assistant attempts to invoke an external tool that requires explicit user consent,  the client receives a permission prompt via the SSE stream. This endpoint is used to submit the user's decision  so that the AI chat session can proceed accordingly.
   *
   * REST API Reference for providePermission Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/provide-permission/
   *
   * @param callId The unique identifier of the pending tool execution call awaiting a permission decision. (required)
   * @param toolDecisionRequestBody The permission decision parameters. (required)
   * @throws ApiException if fails to make API call
   */
  public void providePermission(@javax.annotation.Nonnull String callId, @javax.annotation.Nonnull ToolDecisionRequestBody toolDecisionRequestBody) throws ApiException {
    this.providePermission(callId, toolDecisionRequestBody, Collections.emptyMap());
  }


  /**
   * Submit a tool execution permission decision
   * Provides the user's approval or denial decision for a pending MCP (Model Context Protocol) tool execution request.  When an AI assistant attempts to invoke an external tool that requires explicit user consent,  the client receives a permission prompt via the SSE stream. This endpoint is used to submit the user's decision  so that the AI chat session can proceed accordingly.
   *
   * REST API Reference for providePermission Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/provide-permission/
   *
   * @param callId The unique identifier of the pending tool execution call awaiting a permission decision. (required)
   * @param toolDecisionRequestBody The permission decision parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void providePermission(@javax.annotation.Nonnull String callId, @javax.annotation.Nonnull ToolDecisionRequestBody toolDecisionRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = toolDecisionRequestBody;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling providePermission");
    }
    
    // verify the required parameter 'toolDecisionRequestBody' is set
    if (toolDecisionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'toolDecisionRequestBody' when calling providePermission");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/tool-permissions/{callId}/decision"
      .replaceAll("\\{" + "callId" + "\\}", apiClient.escapeString(apiClient.parameterToString(callId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Rename an AI chat
   * Updates the display title of an existing AI chat session owned by the current user.  The new name must not exceed 255 characters.
   *
   * REST API Reference for renameChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-chat/
   *
   * @param chatId The unique identifier of the AI chat session to rename. (required)
   * @param renameChatBody The new chat name. (required)
   * @return ChatWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatWrapper renameChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull RenameChatBody renameChatBody) throws ApiException {
    return this.renameChat(chatId, renameChatBody, Collections.emptyMap());
  }


  /**
   * Rename an AI chat
   * Updates the display title of an existing AI chat session owned by the current user.  The new name must not exceed 255 characters.
   *
   * REST API Reference for renameChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-chat/
   *
   * @param chatId The unique identifier of the AI chat session to rename. (required)
   * @param renameChatBody The new chat name. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChatWrapper
   * @throws ApiException if fails to make API call
   */
  public ChatWrapper renameChat(@javax.annotation.Nonnull UUID chatId, @javax.annotation.Nonnull RenameChatBody renameChatBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = renameChatBody;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling renameChat");
    }
    
    // verify the required parameter 'renameChatBody' is set
    if (renameChatBody == null) {
      throw new ApiException(400, "Missing the required parameter 'renameChatBody' when calling renameChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/chats/{chatId}"
      .replaceAll("\\{" + "chatId" + "\\}", apiClient.escapeString(apiClient.parameterToString(chatId)));

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

    TypeReference<ChatWrapper> localVarReturnType = new TypeReference<ChatWrapper>() {};
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
   * Update user chat settings for a room
   * Saves the current user's personal AI chat preferences for the specified room.  Currently supports toggling the web search capability, which allows the AI assistant to search the internet when generating responses.
   *
   * REST API Reference for setUserChatsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-user-chats-settings/
   *
   * @param roomId The identifier of the room whose chat settings are to be updated. (required)
   * @param setUserChatSettingsRequestBody The chat settings to apply. (required)
   * @return UserChatSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public UserChatSettingsWrapper setUserChatsSettings(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull SetUserChatSettingsRequestBody setUserChatSettingsRequestBody) throws ApiException {
    return this.setUserChatsSettings(roomId, setUserChatSettingsRequestBody, Collections.emptyMap());
  }


  /**
   * Update user chat settings for a room
   * Saves the current user's personal AI chat preferences for the specified room.  Currently supports toggling the web search capability, which allows the AI assistant to search the internet when generating responses.
   *
   * REST API Reference for setUserChatsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-user-chats-settings/
   *
   * @param roomId The identifier of the room whose chat settings are to be updated. (required)
   * @param setUserChatSettingsRequestBody The chat settings to apply. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserChatSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public UserChatSettingsWrapper setUserChatsSettings(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull SetUserChatSettingsRequestBody setUserChatSettingsRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setUserChatSettingsRequestBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling setUserChatsSettings");
    }
    
    // verify the required parameter 'setUserChatSettingsRequestBody' is set
    if (setUserChatSettingsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setUserChatSettingsRequestBody' when calling setUserChatsSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/chats/config"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

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

    TypeReference<UserChatSettingsWrapper> localVarReturnType = new TypeReference<UserChatSettingsWrapper>() {};
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
   * Start a new AI chat
   * Creates a new AI chat session within the specified room and sends the initial message to the configured AI provider.  The response is delivered as a Server-Sent Events (SSE) stream containing completion chunks (text deltas, tool calls, tool results, and message lifecycle events)  with periodic keep-alive pings every 5 seconds. File references can be included as context for the AI model.
   *
   * REST API Reference for startNewChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-new-chat/
   *
   * @param roomId The identifier of the room in which to create the new AI chat session. (required)
   * @param startNewChatBody The initial message and optional file attachments. (required)
   * @throws ApiException if fails to make API call
   */
  public void startNewChat(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull StartNewChatBody startNewChatBody) throws ApiException {
    this.startNewChat(roomId, startNewChatBody, Collections.emptyMap());
  }


  /**
   * Start a new AI chat
   * Creates a new AI chat session within the specified room and sends the initial message to the configured AI provider.  The response is delivered as a Server-Sent Events (SSE) stream containing completion chunks (text deltas, tool calls, tool results, and message lifecycle events)  with periodic keep-alive pings every 5 seconds. File references can be included as context for the AI model.
   *
   * REST API Reference for startNewChat Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-new-chat/
   *
   * @param roomId The identifier of the room in which to create the new AI chat session. (required)
   * @param startNewChatBody The initial message and optional file attachments. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void startNewChat(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull StartNewChatBody startNewChatBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startNewChatBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling startNewChat");
    }
    
    // verify the required parameter 'startNewChatBody' is set
    if (startNewChatBody == null) {
      throw new ApiException(400, "Missing the required parameter 'startNewChatBody' when calling startNewChat");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/chats"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
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
