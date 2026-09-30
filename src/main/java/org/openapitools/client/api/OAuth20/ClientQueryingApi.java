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

import org.openapitools.client.model.ClientInfoResponse;
import org.openapitools.client.model.ClientResponse;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PageableClientInfoResponse;
import org.openapitools.client.model.PageableClientResponse;
import org.openapitools.client.model.PageableModificationResponse;
import org.openapitools.client.model.ProblemDetail;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ClientQueryingApi extends BaseApi {

  public ClientQueryingApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ClientQueryingApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get client details
   * Returns the whole stored record of one client: its name and description, its secret, scopes, redirect URIs, allowed origins, logout redirect URIs and audit fields. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. Whatever the caller may not see is reported as 404 rather than 403, so absence and lack of access are deliberately indistinguishable, and an identifier that is not a valid client ID is reported the same way. The response is a single object, not a collection.
   *
   * REST API Reference for getClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/
   *
   * @param clientId ID of the client to retrieve (required)
   * @return ClientResponse
   * @throws ApiException if fails to make API call
   */
  public ClientResponse getClient(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.getClient(clientId, Collections.emptyMap());
  }


  /**
   * Get client details
   * Returns the whole stored record of one client: its name and description, its secret, scopes, redirect URIs, allowed origins, logout redirect URIs and audit fields. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. Whatever the caller may not see is reported as 404 rather than 403, so absence and lack of access are deliberately indistinguishable, and an identifier that is not a valid client ID is reported the same way. The response is a single object, not a collection.
   *
   * REST API Reference for getClient Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/
   *
   * @param clientId ID of the client to retrieve (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ClientResponse
   * @throws ApiException if fails to make API call
   */
  public ClientResponse getClient(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getClient");
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

    TypeReference<ClientResponse> localVarReturnType = new TypeReference<ClientResponse>() {};
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
   * Get client info
   * Retrieves the detailed information for a client with the ID specified in the request. It returns the consent-facing subset of the client - name, description, logo, the website, terms and policy URLs, authentication methods and scopes - and deliberately omits the secret, the redirect URIs and the allowed origins, which is what makes it safe to render on a consent screen. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. A client the caller may not see is reported as 404, exactly like an unknown one.
   *
   * REST API Reference for getClientInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/
   *
   * @param clientId ID of the client to retrieve (required)
   * @return ClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ClientInfoResponse getClientInfo(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.getClientInfo(clientId, Collections.emptyMap());
  }


  /**
   * Get client info
   * Retrieves the detailed information for a client with the ID specified in the request. It returns the consent-facing subset of the client - name, description, logo, the website, terms and policy URLs, authentication methods and scopes - and deliberately omits the secret, the redirect URIs and the allowed origins, which is what makes it safe to render on a consent screen. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. A client the caller may not see is reported as 404, exactly like an unknown one.
   *
   * REST API Reference for getClientInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/
   *
   * @param clientId ID of the client to retrieve (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ClientInfoResponse getClientInfo(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getClientInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}/info"
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

    TypeReference<ClientInfoResponse> localVarReturnType = new TypeReference<ClientInfoResponse>() {};
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
   * List clients
   * Returns one page of the tenant's clients, newest first, each in the same full form as the single-client read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based rather than offset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page to ask for the next one. The limit defaults to 30 and has to lie between 1 and 50; a value outside that range, or a last_created_on that cannot be parsed as a date, is rejected with 400.
   *
   * REST API Reference for getClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
   *
   * @param limit How many entries to return, between 1 and 50. Defaults to 30 when omitted. (optional, default to 30)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @return PageableClientResponse
   * @throws ApiException if fails to make API call
   */
  public PageableClientResponse getClients(@javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn) throws ApiException {
    return this.getClients(limit, lastClientId, lastCreatedOn, Collections.emptyMap());
  }


  /**
   * List clients
   * Returns one page of the tenant's clients, newest first, each in the same full form as the single-client read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based rather than offset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page to ask for the next one. The limit defaults to 30 and has to lie between 1 and 50; a value outside that range, or a last_created_on that cannot be parsed as a date, is rejected with 400.
   *
   * REST API Reference for getClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
   *
   * @param limit How many entries to return, between 1 and 50. Defaults to 30 when omitted. (optional, default to 30)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PageableClientResponse
   * @throws ApiException if fails to make API call
   */
  public PageableClientResponse getClients(@javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn, Map<String, String> additionalHeaders) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("last_client_id", lastClientId));
    localVarQueryParams.addAll(apiClient.parameterToPair("last_created_on", lastCreatedOn));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x-signature" };

    TypeReference<PageableClientResponse> localVarReturnType = new TypeReference<PageableClientResponse>() {};
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
   * List client info
   * Retrieves a paginated list of information for all clients, each in the same consent-facing form as the single-client info read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page. Unlike the full client listing, limit has no default here - it has to be supplied on every call and has to lie between 1 and 50, and a missing or out-of-range value is rejected with 400.
   *
   * REST API Reference for getClientsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
   *
   * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call. (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @return PageableClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public PageableClientInfoResponse getClientsInfo(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn) throws ApiException {
    return this.getClientsInfo(limit, lastClientId, lastCreatedOn, Collections.emptyMap());
  }


  /**
   * List client info
   * Retrieves a paginated list of information for all clients, each in the same consent-facing form as the single-client info read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page. Unlike the full client listing, limit has no default here - it has to be supplied on every call and has to lie between 1 and 50, and a missing or out-of-range value is rejected with 400.
   *
   * REST API Reference for getClientsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
   *
   * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call. (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PageableClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public PageableClientInfoResponse getClientsInfo(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
      throw new ApiException(400, "Missing the required parameter 'limit' when calling getClientsInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/info";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("last_client_id", lastClientId));
    localVarQueryParams.addAll(apiClient.parameterToPair("last_created_on", lastCreatedOn));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x-signature" };

    TypeReference<PageableClientInfoResponse> localVarReturnType = new TypeReference<PageableClientInfoResponse>() {};
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
   * List user consents
   * Retrieves a paginated list of user consents: the clients the calling user has authorized, each with the scopes granted, the moment the consent was last changed and the client's consent-facing details. It always reports the caller's own consents and nothing else - there is no role check on this endpoint, so guests may call it too, and no parameter widens it to another user. The consents are read from the authorization service over gRPC, so an authorization service that cannot be reached surfaces as 503. Paging is keyset-based on last_modified_on, and limit has no default: it has to be supplied on every call and has to lie between 1 and 50.
   *
   * REST API Reference for getConsents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
   *
   * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call. (required)
   * @param lastModifiedOn Date of the last retrieved consent (optional)
   * @return PageableModificationResponse
   * @throws ApiException if fails to make API call
   */
  public PageableModificationResponse getConsents(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable OffsetDateTime lastModifiedOn) throws ApiException {
    return this.getConsents(limit, lastModifiedOn, Collections.emptyMap());
  }


  /**
   * List user consents
   * Retrieves a paginated list of user consents: the clients the calling user has authorized, each with the scopes granted, the moment the consent was last changed and the client's consent-facing details. It always reports the caller's own consents and nothing else - there is no role check on this endpoint, so guests may call it too, and no parameter widens it to another user. The consents are read from the authorization service over gRPC, so an authorization service that cannot be reached surfaces as 503. Paging is keyset-based on last_modified_on, and limit has no default: it has to be supplied on every call and has to lie between 1 and 50.
   *
   * REST API Reference for getConsents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
   *
   * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call. (required)
   * @param lastModifiedOn Date of the last retrieved consent (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PageableModificationResponse
   * @throws ApiException if fails to make API call
   */
  public PageableModificationResponse getConsents(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable OffsetDateTime lastModifiedOn, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
      throw new ApiException(400, "Missing the required parameter 'limit' when calling getConsents");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/consents";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("last_modified_on", lastModifiedOn));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x-signature" };

    TypeReference<PageableModificationResponse> localVarReturnType = new TypeReference<PageableModificationResponse>() {};
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
   * Get public client info
   * Returns the same consent-facing client information as the signed read, but without requiring a portal signature. It is meant for a login or consent page that has to render the client before the user is known, so it resolves the client by ID alone: there is no authentication, no tenant scoping and no creator check, and any caller who knows a client ID can read that client's public details. It still exposes no secret, no redirect URIs and no allowed origins. Being unauthenticated it is rate-limited on a separate, tighter budget than the signed endpoints. An unknown client ID, and an identifier that is not a client ID at all, are both reported as 404.
   *
   * REST API Reference for getPublicClientInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/
   *
   * @param clientId ID of the client to retrieve (required)
   * @return ClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ClientInfoResponse getPublicClientInfo(@javax.annotation.Nonnull String clientId) throws ApiException {
    return this.getPublicClientInfo(clientId, Collections.emptyMap());
  }


  /**
   * Get public client info
   * Returns the same consent-facing client information as the signed read, but without requiring a portal signature. It is meant for a login or consent page that has to render the client before the user is known, so it resolves the client by ID alone: there is no authentication, no tenant scoping and no creator check, and any caller who knows a client ID can read that client's public details. It still exposes no secret, no redirect URIs and no allowed origins. Being unauthenticated it is rate-limited on a separate, tighter budget than the signed endpoints. An unknown client ID, and an identifier that is not a client ID at all, are both reported as 404.
   *
   * REST API Reference for getPublicClientInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/
   *
   * @param clientId ID of the client to retrieve (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ClientInfoResponse getPublicClientInfo(@javax.annotation.Nonnull String clientId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getPublicClientInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/oauth2/clients/{clientId}/public/info"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ClientInfoResponse> localVarReturnType = new TypeReference<ClientInfoResponse>() {};
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
