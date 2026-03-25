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

package org.openapitools.client.api.OAuth20;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ChangeClientActivationRequest;
import org.openapitools.client.model.ClientResponse;
import org.openapitools.client.model.ClientSecretResponse;
import org.openapitools.client.model.CreateClientRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.UpdateClientRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ClientManagementApi extends BaseApi {

  public ClientManagementApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ClientManagementApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Change the client activation status
   * Activates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.
   *
   * REST API Reference for changeActivation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
   *
   * @param clientId The client identifier. (required)
   * @param changeClientActivationRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object changeActivation(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull ChangeClientActivationRequest changeClientActivationRequest) throws ApiException {
    return this.changeActivation(clientId, changeClientActivationRequest, Collections.emptyMap());
  }


  /**
   * Change the client activation status
   * Activates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.
   *
   * REST API Reference for changeActivation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
   *
   * @param clientId The client identifier. (required)
   * @param changeClientActivationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object changeActivation(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull ChangeClientActivationRequest changeClientActivationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = changeClientActivationRequest;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling changeActivation");
    }
    
    // verify the required parameter 'changeClientActivationRequest' is set
    if (changeClientActivationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'changeClientActivationRequest' when calling changeActivation");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/{clientId}/activation"
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(apiClient.parameterToString(clientId)));

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
   * Create a new OAuth2 client
   * Creates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.
   *
   * REST API Reference for createClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/
   *
   * @param createClientRequest  (required)
   * @return ClientResponse
   * @throws ApiException if fails to make API call
   */
  public ClientResponse createClient(@javax.annotation.Nonnull CreateClientRequest createClientRequest) throws ApiException {
    return this.createClient(createClientRequest, Collections.emptyMap());
  }


  /**
   * Create a new OAuth2 client
   * Creates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.
   *
   * REST API Reference for createClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/
   *
   * @param createClientRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ClientResponse
   * @throws ApiException if fails to make API call
   */
  public ClientResponse createClient(@javax.annotation.Nonnull CreateClientRequest createClientRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createClientRequest;
    
    // verify the required parameter 'createClientRequest' is set
    if (createClientRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createClientRequest' when calling createClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients";

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<ClientResponse> localVarReturnType = new TypeReference<ClientResponse>() {};
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
   * Delete an OAuth2 client
   * Permanently deletes an OAuth2 client and all associated data. All access and refresh tokens issued to this client will be invalidated. This operation cannot be undone.
   *
   * REST API Reference for deleteClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
   *
   * @param clientId The client identifier. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteClient(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.deleteClient(clientId, Collections.emptyMap());
  }


  /**
   * Delete an OAuth2 client
   * Permanently deletes an OAuth2 client and all associated data. All access and refresh tokens issued to this client will be invalidated. This operation cannot be undone.
   *
   * REST API Reference for deleteClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
   *
   * @param clientId The client identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteClient(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling deleteClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/{clientId}"
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(apiClient.parameterToString(clientId)));

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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
   * Regenerate the client secret
   * Generates a new client secret for the specified OAuth2 client. The old secret will be immediately invalidated. This operation should be used with caution as it requires updating the secret in all client applications.
   *
   * REST API Reference for regenerateSecret Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
   *
   * @param clientId The client identifier. (required)
   * @return ClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  public ClientSecretResponse regenerateSecret(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.regenerateSecret(clientId, Collections.emptyMap());
  }


  /**
   * Regenerate the client secret
   * Generates a new client secret for the specified OAuth2 client. The old secret will be immediately invalidated. This operation should be used with caution as it requires updating the secret in all client applications.
   *
   * REST API Reference for regenerateSecret Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
   *
   * @param clientId The client identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  public ClientSecretResponse regenerateSecret(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling regenerateSecret");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/{clientId}/regenerate"
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(apiClient.parameterToString(clientId)));

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<ClientSecretResponse> localVarReturnType = new TypeReference<ClientSecretResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
   * Revoke client consent
   * Revokes all user consents for the specified OAuth2 client. This will invalidate all access tokens and refresh tokens issued to this client for the current user. The user will need to re-authorize the client to access their resources.
   *
   * REST API Reference for revokeUserClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
   *
   * @param clientId The client identifier. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object revokeUserClient(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.revokeUserClient(clientId, Collections.emptyMap());
  }


  /**
   * Revoke client consent
   * Revokes all user consents for the specified OAuth2 client. This will invalidate all access tokens and refresh tokens issued to this client for the current user. The user will need to re-authorize the client to access their resources.
   *
   * REST API Reference for revokeUserClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
   *
   * @param clientId The client identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object revokeUserClient(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling revokeUserClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/{clientId}/revoke"
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(apiClient.parameterToString(clientId)));

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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
   * Update an existing OAuth2 client
   * Updates the configuration of an existing OAuth2 client, allowing modifications to the client name, description, redirect URIs, and other settings. The client ID cannot be modified.
   *
   * REST API Reference for updateClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
   *
   * @param clientId The client identifier. (required)
   * @param updateClientRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateClient(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull UpdateClientRequest updateClientRequest) throws ApiException {
    return this.updateClient(clientId, updateClientRequest, Collections.emptyMap());
  }


  /**
   * Update an existing OAuth2 client
   * Updates the configuration of an existing OAuth2 client, allowing modifications to the client name, description, redirect URIs, and other settings. The client ID cannot be modified.
   *
   * REST API Reference for updateClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
   *
   * @param clientId The client identifier. (required)
   * @param updateClientRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateClient(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull UpdateClientRequest updateClientRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateClientRequest;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling updateClient");
    }
    
    // verify the required parameter 'updateClientRequest' is set
    if (updateClientRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateClientRequest' when calling updateClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/{clientId}"
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(apiClient.parameterToString(clientId)));

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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

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
