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

package org.openapitools.client.api.Rooms;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.EncryptionKeyArrayWrapper;
import org.openapitools.client.model.EncryptionKeyRequestDto;
import org.openapitools.client.model.ErrorApiResponse;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PrivacyRoomApi extends BaseApi {

  public PrivacyRoomApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PrivacyRoomApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Deletes an encryption key and removes it from the system.
   * Deletes an encryption key and removes it from the system based on the provided key identifier.    Breaking change in DocSpace 4.0: the endpoint used to answer 200 with the caller's remaining  encryption keys and now answers 204 with no body. A client that read that list must call  `GET api/2.0/privacyroom/keys` instead.
   *
   * REST API Reference for deleteKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-keys/
   *
   * @param id The unique identifier of the encryption key to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteKeys(@javax.annotation.Nonnull UUID id) throws ApiException {
    this.deleteKeys(id, Collections.emptyMap());
  }


  /**
   * Deletes an encryption key and removes it from the system.
   * Deletes an encryption key and removes it from the system based on the provided key identifier.    Breaking change in DocSpace 4.0: the endpoint used to answer 200 with the caller's remaining  encryption keys and now answers 204 with no body. A client that read that list must call  `GET api/2.0/privacyroom/keys` instead.
   *
   * REST API Reference for deleteKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-keys/
   *
   * @param id The unique identifier of the encryption key to be deleted. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteKeys(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteKeys");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/privacyroom/keys/{id}"
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
   * Retrieves encryption keys associated with the current user.
   * Retrieves encryption keys associated with the current user.
   *
   * REST API Reference for getUserKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys/
   *
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper getUserKeys() throws ApiException {
    return this.getUserKeys(Collections.emptyMap());
  }


  /**
   * Retrieves encryption keys associated with the current user.
   * Retrieves encryption keys associated with the current user.
   *
   * REST API Reference for getUserKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper getUserKeys(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/privacyroom/keys";

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

    TypeReference<EncryptionKeyArrayWrapper> localVarReturnType = new TypeReference<EncryptionKeyArrayWrapper>() {};
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
   * Retrieves the encryption keys associated with a specific privacy room.
   * Retrieves the encryption keys associated with a specific privacy room.
   *
   * REST API Reference for getUserKeysForRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys-for-room/
   *
   * @param roomId The identifier of the privacy room. (required)
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper getUserKeysForRoom(@javax.annotation.Nonnull Integer roomId) throws ApiException {
    return this.getUserKeysForRoom(roomId, Collections.emptyMap());
  }


  /**
   * Retrieves the encryption keys associated with a specific privacy room.
   * Retrieves the encryption keys associated with a specific privacy room.
   *
   * REST API Reference for getUserKeysForRoom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys-for-room/
   *
   * @param roomId The identifier of the privacy room. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper getUserKeysForRoom(@javax.annotation.Nonnull Integer roomId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getUserKeysForRoom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/privacyroom/{roomId}/access"
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

    TypeReference<EncryptionKeyArrayWrapper> localVarReturnType = new TypeReference<EncryptionKeyArrayWrapper>() {};
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
   * Replaces an existing encryption key with a new one for the user.
   * Replaces an existing encryption key with a new one for the user.
   *
   * REST API Reference for replaceKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/replace-key/
   *
   * @param encryptionKeyRequestDto The request object containing the public and private key information to replace the existing key. (optional)
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper replaceKey(@javax.annotation.Nullable EncryptionKeyRequestDto encryptionKeyRequestDto) throws ApiException {
    return this.replaceKey(encryptionKeyRequestDto, Collections.emptyMap());
  }


  /**
   * Replaces an existing encryption key with a new one for the user.
   * Replaces an existing encryption key with a new one for the user.
   *
   * REST API Reference for replaceKey Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/replace-key/
   *
   * @param encryptionKeyRequestDto The request object containing the public and private key information to replace the existing key. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper replaceKey(@javax.annotation.Nullable EncryptionKeyRequestDto encryptionKeyRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = encryptionKeyRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/privacyroom/keys";

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

    TypeReference<EncryptionKeyArrayWrapper> localVarReturnType = new TypeReference<EncryptionKeyArrayWrapper>() {};
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
   * Creates and sets encryption keys for the user.
   * Creates and sets encryption keys for the user.
   *
   * REST API Reference for setKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-keys/
   *
   * @param encryptionKeyRequestDto The request object containing public and private key information. (optional)
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper setKeys(@javax.annotation.Nullable EncryptionKeyRequestDto encryptionKeyRequestDto) throws ApiException {
    return this.setKeys(encryptionKeyRequestDto, Collections.emptyMap());
  }


  /**
   * Creates and sets encryption keys for the user.
   * Creates and sets encryption keys for the user.
   *
   * REST API Reference for setKeys Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-keys/
   *
   * @param encryptionKeyRequestDto The request object containing public and private key information. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EncryptionKeyArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyArrayWrapper setKeys(@javax.annotation.Nullable EncryptionKeyRequestDto encryptionKeyRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = encryptionKeyRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/privacyroom/keys";

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

    TypeReference<EncryptionKeyArrayWrapper> localVarReturnType = new TypeReference<EncryptionKeyArrayWrapper>() {};
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
