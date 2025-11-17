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

import org.openapitools.client.model.CdnStorageSettingsWrapper;
import org.openapitools.client.model.DoubleWrapper;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.StorageArrayWrapper;
import org.openapitools.client.model.StorageRequestsDto;
import org.openapitools.client.model.StorageSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class StorageApi extends BaseApi {

  public StorageApi() {
    super(Configuration.getDefaultApiClient());
  }

  public StorageApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the backup storages
   * Returns a list of all the backup storages.
   *
   * REST API Reference for getAllBackupStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-backup-storages/
   *
   * @param dump  (optional)
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllBackupStorages(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.getAllBackupStorages(dump, Collections.emptyMap());
  }


  /**
   * Get the backup storages
   * Returns a list of all the backup storages.
   *
   * REST API Reference for getAllBackupStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-backup-storages/
   *
   * @param dump  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllBackupStorages(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/backup";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<StorageArrayWrapper> localVarReturnType = new TypeReference<StorageArrayWrapper>() {};
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
   * Get the CDN storages
   * Returns a list of all the CDN storages.
   *
   * REST API Reference for getAllCdnStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-cdn-storages/
   *
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllCdnStorages() throws ApiException {
    return this.getAllCdnStorages(Collections.emptyMap());
  }


  /**
   * Get the CDN storages
   * Returns a list of all the CDN storages.
   *
   * REST API Reference for getAllCdnStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-cdn-storages/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllCdnStorages(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/cdn";

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

    TypeReference<StorageArrayWrapper> localVarReturnType = new TypeReference<StorageArrayWrapper>() {};
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
   * Get storages
   * Returns a list of all the portal storages.
   *
   * REST API Reference for getAllStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-storages/
   *
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllStorages() throws ApiException {
    return this.getAllStorages(Collections.emptyMap());
  }


  /**
   * Get storages
   * Returns a list of all the portal storages.
   *
   * REST API Reference for getAllStorages Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-storages/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StorageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageArrayWrapper getAllStorages(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage";

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

    TypeReference<StorageArrayWrapper> localVarReturnType = new TypeReference<StorageArrayWrapper>() {};
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
   * Get Amazon regions
   * Returns a list of all Amazon regions.
   *
   * REST API Reference for getAmazonS3Regions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-amazon-s3-regions/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAmazonS3Regions() throws ApiException {
    return this.getAmazonS3Regions(Collections.emptyMap());
  }


  /**
   * Get Amazon regions
   * Returns a list of all Amazon regions.
   *
   * REST API Reference for getAmazonS3Regions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-amazon-s3-regions/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAmazonS3Regions(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/s3/regions";

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

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
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
   * Get the storage progress
   * Returns the storage progress.
   *
   * REST API Reference for getStorageProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-progress/
   *
   * @return DoubleWrapper
   * @throws ApiException if fails to make API call
   */
  public DoubleWrapper getStorageProgress() throws ApiException {
    return this.getStorageProgress(Collections.emptyMap());
  }


  /**
   * Get the storage progress
   * Returns the storage progress.
   *
   * REST API Reference for getStorageProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-progress/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DoubleWrapper
   * @throws ApiException if fails to make API call
   */
  public DoubleWrapper getStorageProgress(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/progress";

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
   * Reset the CDN storage settings
   * Resets the CDN storage settings to the default parameters.
   *
   * REST API Reference for resetCdnToDefault Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-cdn-to-default/
   *
   * @throws ApiException if fails to make API call
   */
  public void resetCdnToDefault() throws ApiException {
    this.resetCdnToDefault(Collections.emptyMap());
  }


  /**
   * Reset the CDN storage settings
   * Resets the CDN storage settings to the default parameters.
   *
   * REST API Reference for resetCdnToDefault Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-cdn-to-default/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void resetCdnToDefault(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/cdn";

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
   * Reset the storage settings
   * Resets the storage settings to the default parameters.
   *
   * REST API Reference for resetStorageToDefault Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-storage-to-default/
   *
   * @throws ApiException if fails to make API call
   */
  public void resetStorageToDefault() throws ApiException {
    this.resetStorageToDefault(Collections.emptyMap());
  }


  /**
   * Reset the storage settings
   * Resets the storage settings to the default parameters.
   *
   * REST API Reference for resetStorageToDefault Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-storage-to-default/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void resetStorageToDefault(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage";

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
   * Update the CDN storage
   * Updates the CDN storage with the parameters specified in the request.
   *
   * REST API Reference for updateCdnStorage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cdn-storage/
   *
   * @param storageRequestsDto  (optional)
   * @return CdnStorageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CdnStorageSettingsWrapper updateCdnStorage(@javax.annotation.Nullable StorageRequestsDto storageRequestsDto) throws ApiException {
    return this.updateCdnStorage(storageRequestsDto, Collections.emptyMap());
  }


  /**
   * Update the CDN storage
   * Updates the CDN storage with the parameters specified in the request.
   *
   * REST API Reference for updateCdnStorage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cdn-storage/
   *
   * @param storageRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CdnStorageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CdnStorageSettingsWrapper updateCdnStorage(@javax.annotation.Nullable StorageRequestsDto storageRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = storageRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage/cdn";

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

    TypeReference<CdnStorageSettingsWrapper> localVarReturnType = new TypeReference<CdnStorageSettingsWrapper>() {};
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
   * Update a storage
   * Updates a storage with the parameters specified in the request.
   *
   * REST API Reference for updateStorage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-storage/
   *
   * @param storageRequestsDto  (optional)
   * @return StorageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageSettingsWrapper updateStorage(@javax.annotation.Nullable StorageRequestsDto storageRequestsDto) throws ApiException {
    return this.updateStorage(storageRequestsDto, Collections.emptyMap());
  }


  /**
   * Update a storage
   * Updates a storage with the parameters specified in the request.
   *
   * REST API Reference for updateStorage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-storage/
   *
   * @param storageRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StorageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public StorageSettingsWrapper updateStorage(@javax.annotation.Nullable StorageRequestsDto storageRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = storageRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/storage";

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

    TypeReference<StorageSettingsWrapper> localVarReturnType = new TypeReference<StorageSettingsWrapper>() {};
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
