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
import org.openapitools.client.model.ProblemDetail;
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
   * Change client activation status
   * Enables or disables an existing client and answers 200 with an empty body. A disabled client can no longer obtain new tokens, but the tokens and consents it already holds stay valid until they expire on their own: disable a client to stop new authorizations, delete it to end the existing ones. An administrator may change any client of the tenant, a plain user only the clients they created. The body carries the single activation flag, and a client the caller may not see is reported as not found rather than as forbidden.
   *
   * REST API Reference for changeActivation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
   *
   * @param clientId ID of the client to change activation for (required)
   * @param changeClientActivationRequest  (required)
   * @throws ApiException if fails to make API call
   */
  public void changeActivation(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull ChangeClientActivationRequest changeClientActivationRequest) throws ApiException {
    this.changeActivation(clientId, changeClientActivationRequest, Collections.emptyMap());
  }


  /**
   * Change client activation status
   * Enables or disables an existing client and answers 200 with an empty body. A disabled client can no longer obtain new tokens, but the tokens and consents it already holds stay valid until they expire on their own: disable a client to stop new authorizations, delete it to end the existing ones. An administrator may change any client of the tenant, a plain user only the clients they created. The body carries the single activation flag, and a client the caller may not see is reported as not found rather than as forbidden.
   *
   * REST API Reference for changeActivation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
   *
   * @param clientId ID of the client to change activation for (required)
   * @param changeClientActivationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void changeActivation(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull ChangeClientActivationRequest changeClientActivationRequest, Map<String, String> additionalHeaders) throws ApiException {
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
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}/activation"
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

    String[] localVarAuthNames = new String[] { "x-signature" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Create a new OAuth2 client
   * Registers a new OAuth2 client in the caller's tenant and returns it. The body must carry a name, a description, a logo and at least one redirect URI, allowed origin and scope, and every scope named must already exist in the tenant's scope catalogue. Administrators and users may both register clients; the caller is recorded as the creator, which is what later restricts a plain user to the clients they created. The response is the stored client with its generated client ID and secret, and it is the first place either value can be read. Some deployments cap how many clients one tenant may hold, and reaching that cap is reported as 400 together with the validation failures.
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
   * Registers a new OAuth2 client in the caller's tenant and returns it. The body must carry a name, a description, a logo and at least one redirect URI, allowed origin and scope, and every scope named must already exist in the tenant's scope catalogue. Administrators and users may both register clients; the caller is recorded as the creator, which is what later restricts a plain user to the clients they created. The response is the stored client with its generated client ID and secret, and it is the first place either value can be read. Some deployments cap how many clients one tenant may hold, and reaching that cap is reported as 400 together with the validation failures.
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
    String localVarPath = "/api/2.0/oauth2/clients";

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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Deletes one client from the tenant permanently and answers 200 with an empty body. An administrator may delete any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The authorizations and consents issued for the client are removed too, but that cleanup is driven by a message and completes on the authorization service after this call has already returned. A delete that removes no row answers 400. The operation cannot be undone.
   *
   * REST API Reference for deleteClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
   *
   * @param clientId ID of the client to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteClient(@javax.annotation.Nonnull String clientId) throws ApiException {
    this.deleteClient(clientId, Collections.emptyMap());
  }


  /**
   * Delete an OAuth2 client
   * Deletes one client from the tenant permanently and answers 200 with an empty body. An administrator may delete any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The authorizations and consents issued for the client are removed too, but that cleanup is driven by a message and completes on the authorization service after this call has already returned. A delete that removes no row answers 400. The operation cannot be undone.
   *
   * REST API Reference for deleteClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
   *
   * @param clientId ID of the client to delete (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteClient(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling deleteClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}"
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Delete all tenant OAuth2 clients
   * Deletes every client registered in the current tenant and answers 200 with an empty body. Only an administrator may call it - for a plain user or a guest it is refused with 403 - and it removes the clients of all users of the tenant, not only those of the caller. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
   *
   * REST API Reference for deleteTenantClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-tenant-clients/
   *
   * @throws ApiException if fails to make API call
   */
  public void deleteTenantClients() throws ApiException {
    this.deleteTenantClients(Collections.emptyMap());
  }


  /**
   * Delete all tenant OAuth2 clients
   * Deletes every client registered in the current tenant and answers 200 with an empty body. Only an administrator may call it - for a plain user or a guest it is refused with 403 - and it removes the clients of all users of the tenant, not only those of the caller. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
   *
   * REST API Reference for deleteTenantClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-tenant-clients/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteTenantClients(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/tenant";

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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Delete all user OAuth2 clients
   * Deletes every client the calling user created in the current tenant and answers 200 with an empty body. The caller's own identity always selects the set, so this never reaches clients created by somebody else, not even for an administrator. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
   *
   * REST API Reference for deleteUserClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-user-clients/
   *
   * @throws ApiException if fails to make API call
   */
  public void deleteUserClients() throws ApiException {
    this.deleteUserClients(Collections.emptyMap());
  }


  /**
   * Delete all user OAuth2 clients
   * Deletes every client the calling user created in the current tenant and answers 200 with an empty body. The caller's own identity always selects the set, so this never reaches clients created by somebody else, not even for an administrator. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
   *
   * REST API Reference for deleteUserClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-user-clients/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteUserClients(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients";

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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Regenerate client secret
   * Issues a new secret for the client and returns it. The previous secret stops working as soon as this call succeeds, there is no grace period and no way to recover it, so every deployed copy of the client has to be updated with the value returned here. An administrator may do this for any client of the tenant, a plain user only for the clients they created. Tokens already issued to the client keep working; only future client authentication is affected. The response carries the new secret and nothing else.
   *
   * REST API Reference for regenerateSecret Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
   *
   * @param clientId ID of the client to regenerate secret for (required)
   * @return ClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  public ClientSecretResponse regenerateSecret(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.regenerateSecret(clientId, Collections.emptyMap());
  }


  /**
   * Regenerate client secret
   * Issues a new secret for the client and returns it. The previous secret stops working as soon as this call succeeds, there is no grace period and no way to recover it, so every deployed copy of the client has to be updated with the value returned here. An administrator may do this for any client of the tenant, a plain user only for the clients they created. Tokens already issued to the client keep working; only future client authentication is affected. The response carries the new secret and nothing else.
   *
   * REST API Reference for regenerateSecret Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
   *
   * @param clientId ID of the client to regenerate secret for (required)
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
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}/regenerate"
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Revokes the calling user's own consent for one client and answers 200 with an empty body. It touches only the caller's grant: other users keep their consents and the client itself stays registered. Guests may call it as well as users and administrators, because it can never reach anyone else's data. The revocation is carried out by the authorization service over gRPC, so a service that reports nothing was revoked produces 400 and a service that cannot be reached produces 503. Once it succeeds the user has to authorize the client again before it can act on their behalf.
   *
   * REST API Reference for revokeUserClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
   *
   * @param clientId ID of the client to revoke consent for (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeUserClient(@javax.annotation.Nonnull String clientId) throws ApiException {
    this.revokeUserClient(clientId, Collections.emptyMap());
  }


  /**
   * Revoke client consent
   * Revokes the calling user's own consent for one client and answers 200 with an empty body. It touches only the caller's grant: other users keep their consents and the client itself stays registered. Guests may call it as well as users and administrators, because it can never reach anyone else's data. The revocation is carried out by the authorization service over gRPC, so a service that reports nothing was revoked produces 400 and a service that cannot be reached produces 503. Once it succeeds the user has to authorize the client again before it can act on their behalf.
   *
   * REST API Reference for revokeUserClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
   *
   * @param clientId ID of the client to revoke consent for (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void revokeUserClient(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling revokeUserClient");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}/revoke"
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Update an existing OAuth2 client
   * Updates the mutable settings of an existing client and answers 200 with an empty body. Only the fields carried in the request body change; the client ID, the secret, the tenant and the creator cannot be changed this way. An administrator may update any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The write runs under optimistic locking and is retried a few times, so a request that still loses the race is rejected with 400 instead of silently overwriting a concurrent change. Nothing is returned in the body - read the client back to see the stored result.
   *
   * REST API Reference for updateClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
   *
   * @param clientId ID of the client to update (required)
   * @param updateClientRequest  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateClient(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull UpdateClientRequest updateClientRequest) throws ApiException {
    this.updateClient(clientId, updateClientRequest, Collections.emptyMap());
  }


  /**
   * Update an existing OAuth2 client
   * Updates the mutable settings of an existing client and answers 200 with an empty body. Only the fields carried in the request body change; the client ID, the secret, the tenant and the creator cannot be changed this way. An administrator may update any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The write runs under optimistic locking and is retried a few times, so a request that still loses the race is rejected with 400 instead of silently overwriting a concurrent change. Nothing is returned in the body - read the client back to see the stored result.
   *
   * REST API Reference for updateClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
   *
   * @param clientId ID of the client to update (required)
   * @param updateClientRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void updateClient(@javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull UpdateClientRequest updateClientRequest, Map<String, String> additionalHeaders) throws ApiException {
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
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}"
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

    String[] localVarAuthNames = new String[] { "x-signature" };

    apiClient.invokeAPI(
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
        null
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
