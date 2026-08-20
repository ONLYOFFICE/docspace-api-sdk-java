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
import org.openapitools.client.model.PageableModificationResponse;
import org.openapitools.client.model.PageableResponse;
import org.openapitools.client.model.PageableResponseClientInfoResponse;
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
   * Retrieves detailed information about a specific OAuth2 client including its name, description, redirect URIs, and scopes.
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
   * Retrieves detailed information about a specific OAuth2 client including its name, description, redirect URIs, and scopes.
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
   * Retrieves detailed information for a specific client
   * Retrieves the detailed information for a client with the ID specified in the request.
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
   * Retrieves detailed information for a specific client
   * Retrieves the detailed information for a client with the ID specified in the request.
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
    String localVarPath = "/api/2.0/clients/{clientId}/info"
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
   * Retrieves a paginated list of OAuth2 clients. The results can be paginated using the limit parameter and last seen client ID/creation date.
   *
   * REST API Reference for getClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
   *
   * @param limit Pagination limit (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @return PageableResponse
   * @throws ApiException if fails to make API call
   */
  public PageableResponse getClients(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn) throws ApiException {
    return this.getClients(limit, lastClientId, lastCreatedOn, Collections.emptyMap());
  }


  /**
   * List clients
   * Retrieves a paginated list of OAuth2 clients. The results can be paginated using the limit parameter and last seen client ID/creation date.
   *
   * REST API Reference for getClients Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
   *
   * @param limit Pagination limit (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PageableResponse
   * @throws ApiException if fails to make API call
   */
  public PageableResponse getClients(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
      throw new ApiException(400, "Missing the required parameter 'limit' when calling getClients");
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

    TypeReference<PageableResponse> localVarReturnType = new TypeReference<PageableResponse>() {};
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
   * Retrieves a pageable list of client information
   * Retrieves a paginated list of information for all clients.
   *
   * REST API Reference for getClientsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
   *
   * @param limit Pagination limit (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @return PageableResponseClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public PageableResponseClientInfoResponse getClientsInfo(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn) throws ApiException {
    return this.getClientsInfo(limit, lastClientId, lastCreatedOn, Collections.emptyMap());
  }


  /**
   * Retrieves a pageable list of client information
   * Retrieves a paginated list of information for all clients.
   *
   * REST API Reference for getClientsInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
   *
   * @param limit Pagination limit (required)
   * @param lastClientId ID of the last retrieved client (optional)
   * @param lastCreatedOn Date of the last retrieved client (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PageableResponseClientInfoResponse
   * @throws ApiException if fails to make API call
   */
  public PageableResponseClientInfoResponse getClientsInfo(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable String lastClientId, @javax.annotation.Nullable OffsetDateTime lastCreatedOn, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
      throw new ApiException(400, "Missing the required parameter 'limit' when calling getClientsInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/clients/info";

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

    TypeReference<PageableResponseClientInfoResponse> localVarReturnType = new TypeReference<PageableResponseClientInfoResponse>() {};
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
   * Retrieves a pageable list of consents
   * Retrieves a paginated list of user consents.
   *
   * REST API Reference for getConsents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
   *
   * @param limit Pagination limit (required)
   * @param lastModifiedOn Date of the last retrieved consent (optional)
   * @return PageableModificationResponse
   * @throws ApiException if fails to make API call
   */
  public PageableModificationResponse getConsents(@javax.annotation.Nonnull Integer limit, @javax.annotation.Nullable OffsetDateTime lastModifiedOn) throws ApiException {
    return this.getConsents(limit, lastModifiedOn, Collections.emptyMap());
  }


  /**
   * Retrieves a pageable list of consents
   * Retrieves a paginated list of user consents.
   *
   * REST API Reference for getConsents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
   *
   * @param limit Pagination limit (required)
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
    String localVarPath = "/api/2.0/clients/consents";

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
   * Handles the GET request for public client information
   * 
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
   * Handles the GET request for public client information
   * 
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
    String localVarPath = "/api/2.0/clients/{clientId}/public/info"
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
