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

import org.openapitools.client.model.AiProviderArrayWrapper;
import org.openapitools.client.model.AiProviderWrapper;
import org.openapitools.client.model.CreateProviderRequestDto;
import org.openapitools.client.model.DefaultProviderWrapper;
import org.openapitools.client.model.ProviderSettingsArrayWrapper;
import org.openapitools.client.model.RemoveProviderRequestDto;
import org.openapitools.client.model.SetDefaultProviderRequestDto;
import org.openapitools.client.model.UpdateProviderBody;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ProvidersApi extends BaseApi {

  public ProvidersApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ProvidersApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public ProvidersApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Add an AI provider
   * Registers a new AI provider for the current tenant by specifying its type, display title, API endpoint URL, and authentication key.  The provider becomes available for AI chat conversations after creation. This action is rate-limited.
   *
   * REST API Reference for addProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-provider/
   *
   * @param createProviderRequestDto  (optional)
   * @return AiProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderWrapper addProvider(@javax.annotation.Nullable CreateProviderRequestDto createProviderRequestDto) throws ApiException {
    return this.addProvider(createProviderRequestDto, Collections.emptyMap());
  }


  /**
   * Add an AI provider
   * Registers a new AI provider for the current tenant by specifying its type, display title, API endpoint URL, and authentication key.  The provider becomes available for AI chat conversations after creation. This action is rate-limited.
   *
   * REST API Reference for addProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-provider/
   *
   * @param createProviderRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderWrapper addProvider(@javax.annotation.Nullable CreateProviderRequestDto createProviderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createProviderRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers";

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

    TypeReference<AiProviderWrapper> localVarReturnType = new TypeReference<AiProviderWrapper>() {};
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
   * Delete AI providers
   * Permanently deletes one or more AI providers by their identifiers.  All specified providers are removed from the current tenant. This action cannot be undone.
   *
   * REST API Reference for deleteProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-providers/
   *
   * @param removeProviderRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteProviders(@javax.annotation.Nullable RemoveProviderRequestDto removeProviderRequestDto) throws ApiException {
    this.deleteProviders(removeProviderRequestDto, Collections.emptyMap());
  }


  /**
   * Delete AI providers
   * Permanently deletes one or more AI providers by their identifiers.  All specified providers are removed from the current tenant. This action cannot be undone.
   *
   * REST API Reference for deleteProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-providers/
   *
   * @param removeProviderRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteProviders(@javax.annotation.Nullable RemoveProviderRequestDto removeProviderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = removeProviderRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers";

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
   * Get available AI provider types
   * Returns the list of AI provider types that are available for configuration on the current instance.  Each entry includes the provider type identifier and the default API endpoint URL.
   *
   * REST API Reference for getAvailableProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-providers/
   *
   * @return ProviderSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ProviderSettingsArrayWrapper getAvailableProviders() throws ApiException {
    return this.getAvailableProviders(Collections.emptyMap());
  }


  /**
   * Get available AI provider types
   * Returns the list of AI provider types that are available for configuration on the current instance.  Each entry includes the provider type identifier and the default API endpoint URL.
   *
   * REST API Reference for getAvailableProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-providers/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ProviderSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ProviderSettingsArrayWrapper getAvailableProviders(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers/available";

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

    TypeReference<ProviderSettingsArrayWrapper> localVarReturnType = new TypeReference<ProviderSettingsArrayWrapper>() {};
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
   * Get the default AI provider
   * Returns the default AI provider and model configured for the current tenant.  Returns null if the tenant does not have any registered providers.
   *
   * REST API Reference for getDefaultProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-provider/
   *
   * @return DefaultProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public DefaultProviderWrapper getDefaultProvider() throws ApiException {
    return this.getDefaultProvider(Collections.emptyMap());
  }


  /**
   * Get the default AI provider
   * Returns the default AI provider and model configured for the current tenant.  Returns null if the tenant does not have any registered providers.
   *
   * REST API Reference for getDefaultProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-provider/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DefaultProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public DefaultProviderWrapper getDefaultProvider(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers/default";

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

    TypeReference<DefaultProviderWrapper> localVarReturnType = new TypeReference<DefaultProviderWrapper>() {};
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
   * Get AI providers
   * Returns a paginated list of AI providers configured for the current tenant.  Supports pagination via the startIndex and count query parameters. The total number of providers is included in the response metadata.
   *
   * REST API Reference for getProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-providers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @return AiProviderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderArrayWrapper getProviders(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.getProviders(startIndex, count, Collections.emptyMap());
  }


  /**
   * Get AI providers
   * Returns a paginated list of AI providers configured for the current tenant.  Supports pagination via the startIndex and count query parameters. The total number of providers is included in the response metadata.
   *
   * REST API Reference for getProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-providers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProviderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderArrayWrapper getProviders(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<AiProviderArrayWrapper> localVarReturnType = new TypeReference<AiProviderArrayWrapper>() {};
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
   * Set the default AI provider
   * Sets the default AI provider and model for the current tenant.  The specified provider and model will be used as the default for all new AI chat sessions within the tenant.
   *
   * REST API Reference for setDefaultProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-provider/
   *
   * @param setDefaultProviderRequestDto  (optional)
   * @return DefaultProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public DefaultProviderWrapper setDefaultProvider(@javax.annotation.Nullable SetDefaultProviderRequestDto setDefaultProviderRequestDto) throws ApiException {
    return this.setDefaultProvider(setDefaultProviderRequestDto, Collections.emptyMap());
  }


  /**
   * Set the default AI provider
   * Sets the default AI provider and model for the current tenant.  The specified provider and model will be used as the default for all new AI chat sessions within the tenant.
   *
   * REST API Reference for setDefaultProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-provider/
   *
   * @param setDefaultProviderRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DefaultProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public DefaultProviderWrapper setDefaultProvider(@javax.annotation.Nullable SetDefaultProviderRequestDto setDefaultProviderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setDefaultProviderRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers/default";

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

    TypeReference<DefaultProviderWrapper> localVarReturnType = new TypeReference<DefaultProviderWrapper>() {};
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
   * Update an AI provider
   * Updates the configuration of an existing AI provider, including its display title, API endpoint URL, and authentication key.  Only the fields provided in the request body will be updated. This action is rate-limited.
   *
   * REST API Reference for updateProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-provider/
   *
   * @param id The identifier of the AI provider to update. (required)
   * @param updateProviderBody The AI provider configuration parameters to update. (required)
   * @return AiProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderWrapper updateProvider(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateProviderBody updateProviderBody) throws ApiException {
    return this.updateProvider(id, updateProviderBody, Collections.emptyMap());
  }


  /**
   * Update an AI provider
   * Updates the configuration of an existing AI provider, including its display title, API endpoint URL, and authentication key.  Only the fields provided in the request body will be updated. This action is rate-limited.
   *
   * REST API Reference for updateProvider Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-provider/
   *
   * @param id The identifier of the AI provider to update. (required)
   * @param updateProviderBody The AI provider configuration parameters to update. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProviderWrapper
   * @throws ApiException if fails to make API call
   */
  public AiProviderWrapper updateProvider(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull UpdateProviderBody updateProviderBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateProviderBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateProvider");
    }
    
    // verify the required parameter 'updateProviderBody' is set
    if (updateProviderBody == null) {
      throw new ApiException(400, "Missing the required parameter 'updateProviderBody' when calling updateProvider");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/providers/{id}"
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<AiProviderWrapper> localVarReturnType = new TypeReference<AiProviderWrapper>() {};
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
