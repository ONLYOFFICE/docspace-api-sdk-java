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

import org.openapitools.client.model.ActiveConnectionsWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.StringWrapper;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class ActiveConnectionsApi extends BaseApi {

  public ActiveConnectionsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ActiveConnectionsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get active connections
   * Returns all the active connections to the portal.
   *
   * REST API Reference for getAllActiveConnections Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-active-connections/
   *
   * @return ActiveConnectionsWrapper
   * @throws ApiException if fails to make API call
   */
  public ActiveConnectionsWrapper getAllActiveConnections() throws ApiException {
    return this.getAllActiveConnections(Collections.emptyMap());
  }


  /**
   * Get active connections
   * Returns all the active connections to the portal.
   *
   * REST API Reference for getAllActiveConnections Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-active-connections/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ActiveConnectionsWrapper
   * @throws ApiException if fails to make API call
   */
  public ActiveConnectionsWrapper getAllActiveConnections(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/activeconnections";

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

    TypeReference<ActiveConnectionsWrapper> localVarReturnType = new TypeReference<ActiveConnectionsWrapper>() {};
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
   * Log out from the connection
   * Logs out from the connection with the ID specified in the request.
   *
   * REST API Reference for logOutActiveConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-active-connection/
   *
   * @param loginEventId The ID of the specific login event. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper logOutActiveConnection(@javax.annotation.Nonnull Integer loginEventId) throws ApiException {
    return this.logOutActiveConnection(loginEventId, Collections.emptyMap());
  }


  /**
   * Log out from the connection
   * Logs out from the connection with the ID specified in the request.
   *
   * REST API Reference for logOutActiveConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-active-connection/
   *
   * @param loginEventId The ID of the specific login event. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper logOutActiveConnection(@javax.annotation.Nonnull Integer loginEventId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loginEventId' is set
    if (loginEventId == null) {
      throw new ApiException(400, "Missing the required parameter 'loginEventId' when calling logOutActiveConnection");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/activeconnections/logout/{loginEventId}"
      .replaceAll("\\{" + "loginEventId" + "\\}", apiClient.escapeString(apiClient.parameterToString(loginEventId)));

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
   * Log out and change password
   * Logs out from all the active connections for the current user and changes their password.
   *
   * REST API Reference for logOutAllActiveConnectionsChangePassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-change-password/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logOutAllActiveConnectionsChangePassword() throws ApiException {
    return this.logOutAllActiveConnectionsChangePassword(Collections.emptyMap());
  }


  /**
   * Log out and change password
   * Logs out from all the active connections for the current user and changes their password.
   *
   * REST API Reference for logOutAllActiveConnectionsChangePassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-change-password/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logOutAllActiveConnectionsChangePassword(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/activeconnections/logoutallchangepassword";

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
   * Log out for the user by ID
   * Logs out from all the active connections for the user with the ID specified in the request.
   *
   * REST API Reference for logOutAllActiveConnectionsForUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-for-user/
   *
   * @param userId The user ID extracted from the route parameters. (required)
   * @throws ApiException if fails to make API call
   */
  public void logOutAllActiveConnectionsForUser(@javax.annotation.Nonnull UUID userId) throws ApiException {
    this.logOutAllActiveConnectionsForUser(userId, Collections.emptyMap());
  }


  /**
   * Log out for the user by ID
   * Logs out from all the active connections for the user with the ID specified in the request.
   *
   * REST API Reference for logOutAllActiveConnectionsForUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-for-user/
   *
   * @param userId The user ID extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void logOutAllActiveConnectionsForUser(@javax.annotation.Nonnull UUID userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling logOutAllActiveConnectionsForUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/activeconnections/logoutall/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

  /**
   * Log out from all connections except the current one
   * Logs out from all the active connections except the current connection.
   *
   * REST API Reference for logOutAllExceptThisConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-except-this-connection/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logOutAllExceptThisConnection() throws ApiException {
    return this.logOutAllExceptThisConnection(Collections.emptyMap());
  }


  /**
   * Log out from all connections except the current one
   * Logs out from all the active connections except the current connection.
   *
   * REST API Reference for logOutAllExceptThisConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-except-this-connection/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logOutAllExceptThisConnection(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/activeconnections/logoutallexceptthis";

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
