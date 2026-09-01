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
import org.openapitools.client.model.AiSuccessResponse;


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
   * OpenAI-compatible chat completions proxied to the profile's provider
   * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider verbatim - the payload is owned by the plugin's SDK on one end and the provider on the other. A client disconnect cancels the provider call.
   *
   * REST API Reference for aiOpenaiChatCompletions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiOpenaiChatCompletions(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> requestBody) throws ApiException {
    return this.aiOpenaiChatCompletions(profileId, requestBody, Collections.emptyMap());
  }


  /**
   * OpenAI-compatible chat completions proxied to the profile's provider
   * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider verbatim - the payload is owned by the plugin's SDK on one end and the provider on the other. A client disconnect cancels the provider call.
   *
   * REST API Reference for aiOpenaiChatCompletions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiOpenaiChatCompletions(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling aiOpenaiChatCompletions");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiOpenaiChatCompletions");
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
   * OpenAI-compatible image generation proxied to the profile's provider
   * OpenAI-compatible image generation for the document editor's AI plugin. As with the chat-completions passthrough, the profile's credentials are attached server-side and the body reaches the provider unchanged.
   *
   * REST API Reference for aiOpenaiImagesGenerations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiOpenaiImagesGenerations(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> requestBody) throws ApiException {
    return this.aiOpenaiImagesGenerations(profileId, requestBody, Collections.emptyMap());
  }


  /**
   * OpenAI-compatible image generation proxied to the profile's provider
   * OpenAI-compatible image generation for the document editor's AI plugin. As with the chat-completions passthrough, the profile's credentials are attached server-side and the body reaches the provider unchanged.
   *
   * REST API Reference for aiOpenaiImagesGenerations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiOpenaiImagesGenerations(@javax.annotation.Nonnull String profileId, @javax.annotation.Nonnull Map<String, Object> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling aiOpenaiImagesGenerations");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiOpenaiImagesGenerations");
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
