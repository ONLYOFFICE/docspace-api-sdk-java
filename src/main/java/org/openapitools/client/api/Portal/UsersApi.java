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

import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.Int64Wrapper;
import org.openapitools.client.model.StringWrapper;
import java.util.UUID;
import org.openapitools.client.model.UserInfoWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class UsersApi extends BaseApi {

  public UsersApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get an invitation link
   * Returns an invitation link for joining the portal.
   *
   * REST API Reference for getInvitationLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link/
   *
   * @param employeeType The type of employee role for the invitation link (All, RoomAdmin, Guest, DocSpaceAdmin, User). (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getInvitationLink(@javax.annotation.Nonnull EmployeeType employeeType) throws ApiException {
    return this.getInvitationLink(employeeType, Collections.emptyMap());
  }


  /**
   * Get an invitation link
   * Returns an invitation link for joining the portal.
   *
   * REST API Reference for getInvitationLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link/
   *
   * @param employeeType The type of employee role for the invitation link (All, RoomAdmin, Guest, DocSpaceAdmin, User). (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getInvitationLink(@javax.annotation.Nonnull EmployeeType employeeType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'employeeType' is set
    if (employeeType == null) {
      throw new ApiException(400, "Missing the required parameter 'employeeType' when calling getInvitationLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/users/invite/{employeeType}"
      .replaceAll("\\{" + "employeeType" + "\\}", apiClient.escapeString(apiClient.parameterToString(employeeType)));

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
   * Get a number of portal users
   * Returns a number of portal users.
   *
   * REST API Reference for getPortalUsersCount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-users-count/
   *
   * @return Int64Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int64Wrapper getPortalUsersCount() throws ApiException {
    return this.getPortalUsersCount(Collections.emptyMap());
  }


  /**
   * Get a number of portal users
   * Returns a number of portal users.
   *
   * REST API Reference for getPortalUsersCount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-users-count/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return Int64Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int64Wrapper getPortalUsersCount(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/userscount";

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

    TypeReference<Int64Wrapper> localVarReturnType = new TypeReference<Int64Wrapper>() {};
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
   * Get a user by ID
   * Returns a user with the ID specified in the request from the current portal.
   *
   * REST API Reference for getUserById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-by-id/
   *
   * @param userID The user ID extracted from the route parameters. (required)
   * @return UserInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public UserInfoWrapper getUserById(@javax.annotation.Nonnull UUID userID) throws ApiException {
    return this.getUserById(userID, Collections.emptyMap());
  }


  /**
   * Get a user by ID
   * Returns a user with the ID specified in the request from the current portal.
   *
   * REST API Reference for getUserById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-by-id/
   *
   * @param userID The user ID extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public UserInfoWrapper getUserById(@javax.annotation.Nonnull UUID userID, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userID' is set
    if (userID == null) {
      throw new ApiException(400, "Missing the required parameter 'userID' when calling getUserById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/users/{userID}"
      .replaceAll("\\{" + "userID" + "\\}", apiClient.escapeString(apiClient.parameterToString(userID)));

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

    TypeReference<UserInfoWrapper> localVarReturnType = new TypeReference<UserInfoWrapper>() {};
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
   * Mark a gift message as read
   * Marks a gift message as read.
   *
   * REST API Reference for markGiftMessageAsRead Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-gift-message-as-read/
   *
   * @throws ApiException if fails to make API call
   */
  public void markGiftMessageAsRead() throws ApiException {
    this.markGiftMessageAsRead(Collections.emptyMap());
  }


  /**
   * Mark a gift message as read
   * Marks a gift message as read.
   *
   * REST API Reference for markGiftMessageAsRead Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-gift-message-as-read/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void markGiftMessageAsRead(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/present/mark";

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
        null
    );
  }

  /**
   * Send congratulations
   * Sends congratulations to the user after registering a portal.
   *
   * REST API Reference for sendCongratulations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-congratulations/
   *
   * @param userid The user ID to receive the congratulatory message. (required)
   * @param key The template identifier or email configuration key. (required)
   * @throws ApiException if fails to make API call
   */
  public void sendCongratulations(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull String key) throws ApiException {
    this.sendCongratulations(userid, key, Collections.emptyMap());
  }


  /**
   * Send congratulations
   * Sends congratulations to the user after registering a portal.
   *
   * REST API Reference for sendCongratulations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-congratulations/
   *
   * @param userid The user ID to receive the congratulatory message. (required)
   * @param key The template identifier or email configuration key. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void sendCongratulations(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull String key, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling sendCongratulations");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling sendCongratulations");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/sendcongratulations";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Userid", userid));
    localVarQueryParams.addAll(apiClient.parameterToPair("Key", key));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
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
