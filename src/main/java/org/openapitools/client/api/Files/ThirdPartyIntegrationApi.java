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

package org.openapitools.client.api.Files;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ArrayArrayWrapper;
import org.openapitools.client.model.FolderStringArrayWrapper;
import org.openapitools.client.model.FolderStringWrapper;
import org.openapitools.client.model.ProviderArrayWrapper;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.ThirdPartyBackupRequestDto;
import org.openapitools.client.model.ThirdPartyParamsArrayWrapper;
import org.openapitools.client.model.ThirdPartyRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ThirdPartyIntegrationApi extends BaseApi {

  public ThirdPartyIntegrationApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ThirdPartyIntegrationApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Remove a third-party account
   * Removes the third-party storage service account with the ID specified in the request.
   *
   * REST API Reference for deleteThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/
   *
   * @param providerId The provider ID. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper deleteThirdParty(@javax.annotation.Nonnull Integer providerId) throws ApiException {
    return this.deleteThirdParty(providerId, Collections.emptyMap());
  }


  /**
   * Remove a third-party account
   * Removes the third-party storage service account with the ID specified in the request.
   *
   * REST API Reference for deleteThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/
   *
   * @param providerId The provider ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper deleteThirdParty(@javax.annotation.Nonnull Integer providerId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling deleteThirdParty");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/{providerId}"
      .replaceAll("\\{" + "providerId" + "\\}", apiClient.escapeString(apiClient.parameterToString(providerId)));

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Get all providers
   * Returns a list of all providers.
   *
   * REST API Reference for getAllProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/
   *
   * @param excludewebdav Specifies whether WebDAV resources should be excluded from the result.. (optional)
   * @return ProviderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ProviderArrayWrapper getAllProviders(@javax.annotation.Nullable Boolean excludewebdav) throws ApiException {
    return this.getAllProviders(excludewebdav, Collections.emptyMap());
  }


  /**
   * Get all providers
   * Returns a list of all providers.
   *
   * REST API Reference for getAllProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/
   *
   * @param excludewebdav Specifies whether WebDAV resources should be excluded from the result.. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProviderArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ProviderArrayWrapper getAllProviders(@javax.annotation.Nullable Boolean excludewebdav, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/providers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludewebdav", excludewebdav));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ProviderArrayWrapper> localVarReturnType = new TypeReference<ProviderArrayWrapper>() {};
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
   * Get a third-party account backup
   * Returns a backup of the connected third-party account.
   *
   * REST API Reference for getBackupThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/
   *
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper getBackupThirdPartyAccount() throws ApiException {
    return this.getBackupThirdPartyAccount(Collections.emptyMap());
  }


  /**
   * Get a third-party account backup
   * Returns a backup of the connected third-party account.
   *
   * REST API Reference for getBackupThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper getBackupThirdPartyAccount(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/backup";

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

    TypeReference<FolderStringWrapper> localVarReturnType = new TypeReference<FolderStringWrapper>() {};
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
   * Get providers
   * Returns the list of the available providers.
   *
   * REST API Reference for getCapabilities Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/
   *
   * @return ArrayArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ArrayArrayWrapper getCapabilities() throws ApiException {
    return this.getCapabilities(Collections.emptyMap());
  }


  /**
   * Get providers
   * Returns the list of the available providers.
   *
   * REST API Reference for getCapabilities Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ArrayArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ArrayArrayWrapper getCapabilities(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/capabilities";

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

    TypeReference<ArrayArrayWrapper> localVarReturnType = new TypeReference<ArrayArrayWrapper>() {};
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
   * Get the common third-party services
   * Returns a list of the third-party services connected to the Common section.
   *
   * REST API Reference for getCommonThirdPartyFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/
   *
   * @return FolderStringArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringArrayWrapper getCommonThirdPartyFolders() throws ApiException {
    return this.getCommonThirdPartyFolders(Collections.emptyMap());
  }


  /**
   * Get the common third-party services
   * Returns a list of the third-party services connected to the Common section.
   *
   * REST API Reference for getCommonThirdPartyFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderStringArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringArrayWrapper getCommonThirdPartyFolders(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/common";

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

    TypeReference<FolderStringArrayWrapper> localVarReturnType = new TypeReference<FolderStringArrayWrapper>() {};
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
   * Get the third-party accounts
   * Returns a list of all the connected third-party accounts.
   *
   * REST API Reference for getThirdPartyAccounts Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/
   *
   * @return ThirdPartyParamsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyParamsArrayWrapper getThirdPartyAccounts() throws ApiException {
    return this.getThirdPartyAccounts(Collections.emptyMap());
  }


  /**
   * Get the third-party accounts
   * Returns a list of all the connected third-party accounts.
   *
   * REST API Reference for getThirdPartyAccounts Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyParamsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyParamsArrayWrapper getThirdPartyAccounts(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty";

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

    TypeReference<ThirdPartyParamsArrayWrapper> localVarReturnType = new TypeReference<ThirdPartyParamsArrayWrapper>() {};
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
   * Save a third-party account
   * Saves the third-party storage service account. For WebDav, Yandex, kDrive and SharePoint, the login and password are used for authentication. For other providers, the authentication is performed using a token received via OAuth 2.0.
   *
   * REST API Reference for saveThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/
   *
   * @param thirdPartyRequestDto  (optional)
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper saveThirdParty(@javax.annotation.Nullable ThirdPartyRequestDto thirdPartyRequestDto) throws ApiException {
    return this.saveThirdParty(thirdPartyRequestDto, Collections.emptyMap());
  }


  /**
   * Save a third-party account
   * Saves the third-party storage service account. For WebDav, Yandex, kDrive and SharePoint, the login and password are used for authentication. For other providers, the authentication is performed using a token received via OAuth 2.0.
   *
   * REST API Reference for saveThirdParty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/
   *
   * @param thirdPartyRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper saveThirdParty(@javax.annotation.Nullable ThirdPartyRequestDto thirdPartyRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = thirdPartyRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty";

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

    TypeReference<FolderStringWrapper> localVarReturnType = new TypeReference<FolderStringWrapper>() {};
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
   * Save a third-party account backup
   * Saves a backup of the connected third-party account.
   *
   * REST API Reference for saveThirdPartyBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/
   *
   * @param thirdPartyBackupRequestDto  (optional)
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper saveThirdPartyBackup(@javax.annotation.Nullable ThirdPartyBackupRequestDto thirdPartyBackupRequestDto) throws ApiException {
    return this.saveThirdPartyBackup(thirdPartyBackupRequestDto, Collections.emptyMap());
  }


  /**
   * Save a third-party account backup
   * Saves a backup of the connected third-party account.
   *
   * REST API Reference for saveThirdPartyBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/
   *
   * @param thirdPartyBackupRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderStringWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderStringWrapper saveThirdPartyBackup(@javax.annotation.Nullable ThirdPartyBackupRequestDto thirdPartyBackupRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = thirdPartyBackupRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty/backup";

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

    TypeReference<FolderStringWrapper> localVarReturnType = new TypeReference<FolderStringWrapper>() {};
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
