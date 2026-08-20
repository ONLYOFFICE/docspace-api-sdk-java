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

import org.openapitools.client.model.AiSettingsWrapper;
import org.openapitools.client.model.AiUserSettingsWrapper;
import org.openapitools.client.model.SetAiUserSettingsRequestDto;
import org.openapitools.client.model.SetEmbeddingConfigRequestBody;
import org.openapitools.client.model.SetWebSearchSettingsRequestBody;
import org.openapitools.client.model.VectorizationSettingsWrapper;
import org.openapitools.client.model.WebSearchSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SettingsApi extends BaseApi {

  public SettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get AI settings
   * Retrieves the combined AI configuration for the current portal, including the status of web search,  vectorization, and AI readiness, along with tool names and the portal MCP server identifier.
   *
   * REST API Reference for getAiSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-settings/
   *
   * @return AiSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiSettingsWrapper getAiSettings() throws ApiException {
    return this.getAiSettings(Collections.emptyMap());
  }


  /**
   * Get AI settings
   * Retrieves the combined AI configuration for the current portal, including the status of web search,  vectorization, and AI readiness, along with tool names and the portal MCP server identifier.
   *
   * REST API Reference for getAiSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiSettingsWrapper getAiSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config";

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

    TypeReference<AiSettingsWrapper> localVarReturnType = new TypeReference<AiSettingsWrapper>() {};
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
   * Get per-user AI settings
   * Retrieves the current user's AI settings, including the recommended model banner visibility preference.
   *
   * REST API Reference for getAiUserSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-user-settings/
   *
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper getAiUserSettings() throws ApiException {
    return this.getAiUserSettings(Collections.emptyMap());
  }


  /**
   * Get per-user AI settings
   * Retrieves the current user's AI settings, including the recommended model banner visibility preference.
   *
   * REST API Reference for getAiUserSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-user-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper getAiUserSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/user";

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

    TypeReference<AiUserSettingsWrapper> localVarReturnType = new TypeReference<AiUserSettingsWrapper>() {};
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
   * Get vectorization settings
   * Retrieves the current embedding provider settings used for document vectorization,  including the configured provider type and whether the API key needs to be reset.
   *
   * REST API Reference for getVectorizationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-vectorization-settings/
   *
   * @return VectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public VectorizationSettingsWrapper getVectorizationSettings() throws ApiException {
    return this.getVectorizationSettings(Collections.emptyMap());
  }


  /**
   * Get vectorization settings
   * Retrieves the current embedding provider settings used for document vectorization,  including the configured provider type and whether the API key needs to be reset.
   *
   * REST API Reference for getVectorizationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-vectorization-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return VectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public VectorizationSettingsWrapper getVectorizationSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/vectorization";

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

    TypeReference<VectorizationSettingsWrapper> localVarReturnType = new TypeReference<VectorizationSettingsWrapper>() {};
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
   * Get web search settings
   * Retrieves the current web search integration settings for AI chat sessions,  including whether web search is enabled, the configured search engine type, and whether the API key needs to be reset.
   *
   * REST API Reference for getWebSearchSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-search-settings/
   *
   * @return WebSearchSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WebSearchSettingsWrapper getWebSearchSettings() throws ApiException {
    return this.getWebSearchSettings(Collections.emptyMap());
  }


  /**
   * Get web search settings
   * Retrieves the current web search integration settings for AI chat sessions,  including whether web search is enabled, the configured search engine type, and whether the API key needs to be reset.
   *
   * REST API Reference for getWebSearchSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-search-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return WebSearchSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WebSearchSettingsWrapper getWebSearchSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/web-search";

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

    TypeReference<WebSearchSettingsWrapper> localVarReturnType = new TypeReference<WebSearchSettingsWrapper>() {};
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
   * Update per-user AI settings
   * Updates the current user's AI recommended model banner visibility preferences.  Each user's settings are stored independently.
   *
   * REST API Reference for setAiUserSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-ai-user-settings/
   *
   * @param setAiUserSettingsRequestDto  (optional)
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper setAiUserSettings(@javax.annotation.Nullable SetAiUserSettingsRequestDto setAiUserSettingsRequestDto) throws ApiException {
    return this.setAiUserSettings(setAiUserSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Update per-user AI settings
   * Updates the current user's AI recommended model banner visibility preferences.  Each user's settings are stored independently.
   *
   * REST API Reference for setAiUserSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-ai-user-settings/
   *
   * @param setAiUserSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper setAiUserSettings(@javax.annotation.Nullable SetAiUserSettingsRequestDto setAiUserSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setAiUserSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/user";

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

    TypeReference<AiUserSettingsWrapper> localVarReturnType = new TypeReference<AiUserSettingsWrapper>() {};
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
   * Update vectorization settings
   * Configures the embedding provider used for document vectorization at the portal level.  Vectorization enables semantic search and knowledge retrieval capabilities in AI chat sessions.  Allows selecting the embedding provider type and providing the API key for the chosen provider.  Only portal administrators can modify these settings.
   *
   * REST API Reference for setVectorizationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-vectorization-settings/
   *
   * @param setEmbeddingConfigRequestBody The embedding provider configuration parameters. (required)
   * @return VectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public VectorizationSettingsWrapper setVectorizationSettings(@javax.annotation.Nonnull SetEmbeddingConfigRequestBody setEmbeddingConfigRequestBody) throws ApiException {
    return this.setVectorizationSettings(setEmbeddingConfigRequestBody, Collections.emptyMap());
  }


  /**
   * Update vectorization settings
   * Configures the embedding provider used for document vectorization at the portal level.  Vectorization enables semantic search and knowledge retrieval capabilities in AI chat sessions.  Allows selecting the embedding provider type and providing the API key for the chosen provider.  Only portal administrators can modify these settings.
   *
   * REST API Reference for setVectorizationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-vectorization-settings/
   *
   * @param setEmbeddingConfigRequestBody The embedding provider configuration parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return VectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public VectorizationSettingsWrapper setVectorizationSettings(@javax.annotation.Nonnull SetEmbeddingConfigRequestBody setEmbeddingConfigRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setEmbeddingConfigRequestBody;
    
    // verify the required parameter 'setEmbeddingConfigRequestBody' is set
    if (setEmbeddingConfigRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setEmbeddingConfigRequestBody' when calling setVectorizationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/vectorization";

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

    TypeReference<VectorizationSettingsWrapper> localVarReturnType = new TypeReference<VectorizationSettingsWrapper>() {};
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
   * Update web search settings
   * Configures the web search integration for AI chat sessions at the portal level.  Allows enabling or disabling web search, selecting the search engine type, and providing the API key for the chosen engine.  Only portal administrators can modify these settings.
   *
   * REST API Reference for setWebSearchSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-search-settings/
   *
   * @param setWebSearchSettingsRequestBody The web search configuration parameters. (required)
   * @return WebSearchSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WebSearchSettingsWrapper setWebSearchSettings(@javax.annotation.Nonnull SetWebSearchSettingsRequestBody setWebSearchSettingsRequestBody) throws ApiException {
    return this.setWebSearchSettings(setWebSearchSettingsRequestBody, Collections.emptyMap());
  }


  /**
   * Update web search settings
   * Configures the web search integration for AI chat sessions at the portal level.  Allows enabling or disabling web search, selecting the search engine type, and providing the API key for the chosen engine.  Only portal administrators can modify these settings.
   *
   * REST API Reference for setWebSearchSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-search-settings/
   *
   * @param setWebSearchSettingsRequestBody The web search configuration parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebSearchSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WebSearchSettingsWrapper setWebSearchSettings(@javax.annotation.Nonnull SetWebSearchSettingsRequestBody setWebSearchSettingsRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setWebSearchSettingsRequestBody;
    
    // verify the required parameter 'setWebSearchSettingsRequestBody' is set
    if (setWebSearchSettingsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setWebSearchSettingsRequestBody' when calling setWebSearchSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/web-search";

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

    TypeReference<WebSearchSettingsWrapper> localVarReturnType = new TypeReference<WebSearchSettingsWrapper>() {};
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
