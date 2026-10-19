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
import org.openapitools.client.model.AiOpenaiChatCompletions403Response;
import org.openapitools.client.model.AiOpenaiImagesGenerations403Response;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class OpenAIPassthroughApi extends BaseApi {

  public OpenAIPassthroughApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OpenAIPassthroughApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * OpenAI chat completions passthrough
   * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider as sent - the payload is owned by the plugin's SDK on one end and the provider on the other - except that a JSON body which names no `model` gets the profile's model filled in; a `model` the body carries wins. The provider's 4xx answers are relayed with their status and body, so a 429 and the provider's own error envelope surface as they stand; a 5xx from the provider or from the hop in front of it is not relayed - its detail stays in the server log and the call answers a fixed 502 envelope. A client disconnect cancels the provider call.
   *
   * REST API Reference for aiOpenaiChatCompletions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param aiOpenaiChatCompletionsRequest An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence. (required)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiOpenaiChatCompletions(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> aiOpenaiChatCompletionsRequest) throws ApiException {
    return this.aiOpenaiChatCompletions(profileId, aiOpenaiChatCompletionsRequest, Collections.emptyMap());
  }


  /**
   * OpenAI chat completions passthrough
   * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider as sent - the payload is owned by the plugin's SDK on one end and the provider on the other - except that a JSON body which names no `model` gets the profile's model filled in; a `model` the body carries wins. The provider's 4xx answers are relayed with their status and body, so a 429 and the provider's own error envelope surface as they stand; a 5xx from the provider or from the hop in front of it is not relayed - its detail stays in the server log and the call answers a fixed 502 envelope. A client disconnect cancels the provider call.
   *
   * REST API Reference for aiOpenaiChatCompletions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param aiOpenaiChatCompletionsRequest An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiOpenaiChatCompletions(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> aiOpenaiChatCompletionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiOpenaiChatCompletionsRequest;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling aiOpenaiChatCompletions");
    }
    
    // verify the required parameter 'aiOpenaiChatCompletionsRequest' is set
    if (aiOpenaiChatCompletionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiOpenaiChatCompletionsRequest' when calling aiOpenaiChatCompletions");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/openai/{profileId}/v1/chat/completions"
      .replaceAll("\\{" + "profileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(profileId)));

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

    TypeReference<Map<String, Object>> localVarReturnType = new TypeReference<Map<String, Object>>() {};
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
   * OpenAI image generation passthrough
   * OpenAI-compatible image generation for the document editor's AI plugin, working as the chat-completions passthrough does: the profile named by `profileId` is resolved server-side, its credentials are attached, and the body reaches the provider as sent. The documented OpenAI fields are checked first - `prompt` has to be a non-empty string, `n` a positive integer, `model`, `size`, `quality`, `style` and `response_format` strings when present - and a body failing that answers 400 instead of whatever the provider would have made of it; fields outside that set are passed on untouched. The provider's 4xx status and body are relayed, so its 429 and its own error envelope surface as they stand; a 5xx is replaced by a fixed 502 envelope with the detail kept in the server log. A body larger than this route accepts is refused before it is forwarded. A client disconnect aborts the provider call.
   *
   * REST API Reference for aiOpenaiImagesGenerations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param aiOpenaiImagesGenerationsRequest An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path. (required)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiOpenaiImagesGenerations(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> aiOpenaiImagesGenerationsRequest) throws ApiException {
    return this.aiOpenaiImagesGenerations(profileId, aiOpenaiImagesGenerationsRequest, Collections.emptyMap());
  }


  /**
   * OpenAI image generation passthrough
   * OpenAI-compatible image generation for the document editor's AI plugin, working as the chat-completions passthrough does: the profile named by `profileId` is resolved server-side, its credentials are attached, and the body reaches the provider as sent. The documented OpenAI fields are checked first - `prompt` has to be a non-empty string, `n` a positive integer, `model`, `size`, `quality`, `style` and `response_format` strings when present - and a body failing that answers 400 instead of whatever the provider would have made of it; fields outside that set are passed on untouched. The provider's 4xx status and body are relayed, so its 429 and its own error envelope surface as they stand; a 5xx is replaced by a fixed 502 envelope with the detail kept in the server log. A body larger than this route accepts is refused before it is forwarded. A client disconnect aborts the provider call.
   *
   * REST API Reference for aiOpenaiImagesGenerations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param aiOpenaiImagesGenerationsRequest An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiOpenaiImagesGenerations(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> aiOpenaiImagesGenerationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiOpenaiImagesGenerationsRequest;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling aiOpenaiImagesGenerations");
    }
    
    // verify the required parameter 'aiOpenaiImagesGenerationsRequest' is set
    if (aiOpenaiImagesGenerationsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiOpenaiImagesGenerationsRequest' when calling aiOpenaiImagesGenerations");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/openai/{profileId}/v1/images/generations"
      .replaceAll("\\{" + "profileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(profileId)));

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

    TypeReference<Map<String, Object>> localVarReturnType = new TypeReference<Map<String, Object>>() {};
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
