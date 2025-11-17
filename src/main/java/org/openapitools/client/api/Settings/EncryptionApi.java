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

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.DoubleWrapper;
import org.openapitools.client.model.EncryptionSettingsWrapper;
import org.openapitools.client.model.StorageEncryptionRequestsDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class EncryptionApi extends BaseApi {

  public EncryptionApi() {
    super(Configuration.getDefaultApiClient());
  }

  public EncryptionApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the storage encryption progress
   * Returns the storage encryption progress.
   *
   * REST API Reference for getStorageEncryptionProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-progress/
   *
   * @return DoubleWrapper
   * @throws ApiException if fails to make API call
   */
  public DoubleWrapper getStorageEncryptionProgress() throws ApiException {
    return this.getStorageEncryptionProgress(Collections.emptyMap());
  }


  /**
   * Get the storage encryption progress
   * Returns the storage encryption progress.
   *
   * REST API Reference for getStorageEncryptionProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-progress/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DoubleWrapper
   * @throws ApiException if fails to make API call
   */
  public DoubleWrapper getStorageEncryptionProgress(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/encryption/progress";

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

    TypeReference<DoubleWrapper> localVarReturnType = new TypeReference<DoubleWrapper>() {};
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
   * Get the storage encryption settings
   * Returns the storage encryption settings.
   *
   * REST API Reference for getStorageEncryptionSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-settings/
   *
   * @return EncryptionSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionSettingsWrapper getStorageEncryptionSettings() throws ApiException {
    return this.getStorageEncryptionSettings(Collections.emptyMap());
  }


  /**
   * Get the storage encryption settings
   * Returns the storage encryption settings.
   *
   * REST API Reference for getStorageEncryptionSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return EncryptionSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionSettingsWrapper getStorageEncryptionSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/encryption/settings";

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

    TypeReference<EncryptionSettingsWrapper> localVarReturnType = new TypeReference<EncryptionSettingsWrapper>() {};
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
   * Start the storage encryption process
   * Starts the storage encryption process.
   *
   * REST API Reference for startStorageEncryption Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-storage-encryption/
   *
   * @param storageEncryptionRequestsDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper startStorageEncryption(@javax.annotation.Nullable StorageEncryptionRequestsDto storageEncryptionRequestsDto) throws ApiException {
    return this.startStorageEncryption(storageEncryptionRequestsDto, Collections.emptyMap());
  }


  /**
   * Start the storage encryption process
   * Starts the storage encryption process.
   *
   * REST API Reference for startStorageEncryption Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-storage-encryption/
   *
   * @param storageEncryptionRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper startStorageEncryption(@javax.annotation.Nullable StorageEncryptionRequestsDto storageEncryptionRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = storageEncryptionRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/encryption/start";

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
