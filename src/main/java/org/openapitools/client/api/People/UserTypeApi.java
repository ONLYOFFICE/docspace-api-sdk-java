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

import org.openapitools.client.model.EmployeeFullArrayWrapper;
import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.StartUpdateUserTypeDto;
import org.openapitools.client.model.TaskProgressResponseWrapper;
import org.openapitools.client.model.TerminateRequestDto;
import java.util.UUID;
import org.openapitools.client.model.UpdateMembersRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class UserTypeApi extends BaseApi {

  public UserTypeApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserTypeApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the progress of updating user type
   * Returns the progress of updating the user type.
   *
   * REST API Reference for getUserTypeUpdateProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-type-update-progress/
   *
   * @param userid The user ID. (required)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getUserTypeUpdateProgress(@javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getUserTypeUpdateProgress(userid, Collections.emptyMap());
  }


  /**
   * Get the progress of updating user type
   * Returns the progress of updating the user type.
   *
   * REST API Reference for getUserTypeUpdateProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-type-update-progress/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getUserTypeUpdateProgress(@javax.annotation.Nonnull UUID userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getUserTypeUpdateProgress");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/type/progress/{userid}"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<TaskProgressResponseWrapper> localVarReturnType = new TypeReference<TaskProgressResponseWrapper>() {};
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
   * Start updating user type
   * Starts updating the type of the user or guest when reassigning rooms and shared files.
   *
   * REST API Reference for starUserTypetUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/star-user-typet-update/
   *
   * @param startUpdateUserTypeDto  (optional)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper starUserTypetUpdate(@javax.annotation.Nullable StartUpdateUserTypeDto startUpdateUserTypeDto) throws ApiException {
    return this.starUserTypetUpdate(startUpdateUserTypeDto, Collections.emptyMap());
  }


  /**
   * Start updating user type
   * Starts updating the type of the user or guest when reassigning rooms and shared files.
   *
   * REST API Reference for starUserTypetUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/star-user-typet-update/
   *
   * @param startUpdateUserTypeDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper starUserTypetUpdate(@javax.annotation.Nullable StartUpdateUserTypeDto startUpdateUserTypeDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startUpdateUserTypeDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/type";

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

    TypeReference<TaskProgressResponseWrapper> localVarReturnType = new TypeReference<TaskProgressResponseWrapper>() {};
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
   * Terminate updating user type
   * Terminates the process of updating the type of the user or guest.
   *
   * REST API Reference for terminateUserTypeUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-user-type-update/
   *
   * @param terminateRequestDto  (optional)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper terminateUserTypeUpdate(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto) throws ApiException {
    return this.terminateUserTypeUpdate(terminateRequestDto, Collections.emptyMap());
  }


  /**
   * Terminate updating user type
   * Terminates the process of updating the type of the user or guest.
   *
   * REST API Reference for terminateUserTypeUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-user-type-update/
   *
   * @param terminateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper terminateUserTypeUpdate(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = terminateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/type/terminate";

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

    TypeReference<TaskProgressResponseWrapper> localVarReturnType = new TypeReference<TaskProgressResponseWrapper>() {};
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
   * Change a user type
   * Changes a type of the users with the IDs specified in the request.
   *
   * REST API Reference for updateUserType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-type/
   *
   * @param type The new user type. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserType(@javax.annotation.Nonnull EmployeeType type, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.updateUserType(type, updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Change a user type
   * Changes a type of the users with the IDs specified in the request.
   *
   * REST API Reference for updateUserType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-type/
   *
   * @param type The new user type. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserType(@javax.annotation.Nonnull EmployeeType type, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMembersRequestDto;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling updateUserType");
    }
    
    // verify the required parameter 'updateMembersRequestDto' is set
    if (updateMembersRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMembersRequestDto' when calling updateUserType");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/type/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(apiClient.parameterToString(type)));

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

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
