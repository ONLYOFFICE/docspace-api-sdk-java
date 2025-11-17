/*
 * (c) Copyright Ascensio System SIA 2025
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

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ApiKeyResponseArrayWrapper;
import org.openapitools.client.model.ApiKeyResponseWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CreateApiKeyRequestDto;
import org.openapitools.client.model.STRINGArrayWrapper;
import java.util.UUID;
import org.openapitools.client.model.UpdateApiKeyRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ApiKeysApi extends BaseApi {

  public ApiKeysApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ApiKeysApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Create a user API key
   * Creates a user API key with the parameters specified in the request.
   *
   * REST API Reference for createApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-api-key/
   *
   * @param createApiKeyRequestDto  (optional)
   * @return ApiKeyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseWrapper createApiKey(@javax.annotation.Nullable CreateApiKeyRequestDto createApiKeyRequestDto) throws ApiException {
    return this.createApiKey(createApiKeyRequestDto, Collections.emptyMap());
  }


  /**
   * Create a user API key
   * Creates a user API key with the parameters specified in the request.
   *
   * REST API Reference for createApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-api-key/
   *
   * @param createApiKeyRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApiKeyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseWrapper createApiKey(@javax.annotation.Nullable CreateApiKeyRequestDto createApiKeyRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createApiKeyRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys";

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

    TypeReference<ApiKeyResponseWrapper> localVarReturnType = new TypeReference<ApiKeyResponseWrapper>() {};
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
   * Delete a user API key
   * Deletes a user API key by its ID.
   *
   * REST API Reference for deleteApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-api-key/
   *
   * @param keyId The API key ID. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteApiKey(@javax.annotation.Nonnull UUID keyId) throws ApiException {
    return this.deleteApiKey(keyId, Collections.emptyMap());
  }


  /**
   * Delete a user API key
   * Deletes a user API key by its ID.
   *
   * REST API Reference for deleteApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-api-key/
   *
   * @param keyId The API key ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteApiKey(@javax.annotation.Nonnull UUID keyId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteApiKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys/{keyId}"
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(apiClient.parameterToString(keyId)));

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Get API key permissions
   * Returns a list of all available permissions for the API key.
   *
   * REST API Reference for getAllPermissions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-permissions/
   *
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper getAllPermissions() throws ApiException {
    return this.getAllPermissions(Collections.emptyMap());
  }


  /**
   * Get API key permissions
   * Returns a list of all available permissions for the API key.
   *
   * REST API Reference for getAllPermissions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-permissions/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper getAllPermissions(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys/permissions";

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

    TypeReference<STRINGArrayWrapper> localVarReturnType = new TypeReference<STRINGArrayWrapper>() {};
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
   * Get current user&#39;s API key
   * Returns information about the current user&#39;s API key.
   *
   * REST API Reference for getApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-key/
   *
   * @return ApiKeyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseWrapper getApiKey() throws ApiException {
    return this.getApiKey(Collections.emptyMap());
  }


  /**
   * Get current user&#39;s API key
   * Returns information about the current user&#39;s API key.
   *
   * REST API Reference for getApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-key/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ApiKeyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseWrapper getApiKey(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys/@self";

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

    TypeReference<ApiKeyResponseWrapper> localVarReturnType = new TypeReference<ApiKeyResponseWrapper>() {};
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
   * Get current user&#39;s API keys
   * Returns a list of all API keys for the current user.
   *
   * REST API Reference for getApiKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-keys/
   *
   * @return ApiKeyResponseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseArrayWrapper getApiKeys() throws ApiException {
    return this.getApiKeys(Collections.emptyMap());
  }


  /**
   * Get current user&#39;s API keys
   * Returns a list of all API keys for the current user.
   *
   * REST API Reference for getApiKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-keys/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ApiKeyResponseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponseArrayWrapper getApiKeys(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys";

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

    TypeReference<ApiKeyResponseArrayWrapper> localVarReturnType = new TypeReference<ApiKeyResponseArrayWrapper>() {};
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
   * Update an API key
   * Updates an existing API key changing its name, permissions, and status.
   *
   * REST API Reference for updateApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-api-key/
   *
   * @param keyId The unique identifier of the API key to update. (required)
   * @param updateApiKeyRequest The request parameters for updating an existing API key. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateApiKey(@javax.annotation.Nonnull UUID keyId, @javax.annotation.Nonnull UpdateApiKeyRequest updateApiKeyRequest) throws ApiException {
    return this.updateApiKey(keyId, updateApiKeyRequest, Collections.emptyMap());
  }


  /**
   * Update an API key
   * Updates an existing API key changing its name, permissions, and status.
   *
   * REST API Reference for updateApiKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-api-key/
   *
   * @param keyId The unique identifier of the API key to update. (required)
   * @param updateApiKeyRequest The request parameters for updating an existing API key. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateApiKey(@javax.annotation.Nonnull UUID keyId, @javax.annotation.Nonnull UpdateApiKeyRequest updateApiKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateApiKeyRequest;
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling updateApiKey");
    }
    
    // verify the required parameter 'updateApiKeyRequest' is set
    if (updateApiKeyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateApiKeyRequest' when calling updateApiKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/keys/{keyId}"
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(apiClient.parameterToString(keyId)));

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
