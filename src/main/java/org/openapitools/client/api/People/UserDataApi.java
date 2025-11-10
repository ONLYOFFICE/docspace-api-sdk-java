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

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.StartReassignRequestDto;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TaskProgressResponseWrapper;
import org.openapitools.client.model.TerminateRequestDto;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class UserDataApi extends BaseApi {

  public UserDataApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserDataApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the progress of deleting the personal folder
   * Returns the progress of deleting the personal folder.
   *
   * REST API Reference for getDeletePersonalFolderProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-delete-personal-folder-progress/
   *
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getDeletePersonalFolderProgress() throws ApiException {
    return this.getDeletePersonalFolderProgress(Collections.emptyMap());
  }


  /**
   * Get the progress of deleting the personal folder
   * Returns the progress of deleting the personal folder.
   *
   * REST API Reference for getDeletePersonalFolderProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-delete-personal-folder-progress/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getDeletePersonalFolderProgress(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/delete/personal/progress";

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
   * Get the reassignment progress
   * Returns the progress of the started data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for getReassignProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reassign-progress/
   *
   * @param userid The user ID. (required)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getReassignProgress(@javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getReassignProgress(userid, Collections.emptyMap());
  }


  /**
   * Get the reassignment progress
   * Returns the progress of the started data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for getReassignProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reassign-progress/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getReassignProgress(@javax.annotation.Nonnull UUID userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getReassignProgress");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/reassign/progress/{userid}"
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
   * Get the deletion progress
   * Returns the progress of the started data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for getRemoveProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-remove-progress/
   *
   * @param userid The user ID. (required)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getRemoveProgress(@javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getRemoveProgress(userid, Collections.emptyMap());
  }


  /**
   * Get the deletion progress
   * Returns the progress of the started data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for getRemoveProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-remove-progress/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper getRemoveProgress(@javax.annotation.Nonnull UUID userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getRemoveProgress");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/remove/progress/{userid}"
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
   * Check data for reassignment need
   * Checks whether the reassignment of rooms and shared files is required.
   *
   * REST API Reference for necessaryReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/necessary-reassign/
   *
   * @param userId The user ID. (optional)
   * @param type The expected user type. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper necessaryReassign(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable EmployeeType type) throws ApiException {
    return this.necessaryReassign(userId, type, Collections.emptyMap());
  }


  /**
   * Check data for reassignment need
   * Checks whether the reassignment of rooms and shared files is required.
   *
   * REST API Reference for necessaryReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/necessary-reassign/
   *
   * @param userId The user ID. (optional)
   * @param type The expected user type. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper necessaryReassign(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable EmployeeType type, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/reassign/necessary";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
      
    
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
   * Send the deletion instructions
   * Sends the instructions for deleting a user profile.
   *
   * REST API Reference for sendInstructionsToDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-instructions-to-delete/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendInstructionsToDelete() throws ApiException {
    return this.sendInstructionsToDelete(Collections.emptyMap());
  }


  /**
   * Send the deletion instructions
   * Sends the instructions for deleting a user profile.
   *
   * REST API Reference for sendInstructionsToDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-instructions-to-delete/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendInstructionsToDelete(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/self/delete";

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
   * Delete the personal folder
   * Starts deleting the personal folder.
   *
   * REST API Reference for startDeletePersonalFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-delete-personal-folder/
   *
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startDeletePersonalFolder() throws ApiException {
    return this.startDeletePersonalFolder(Collections.emptyMap());
  }


  /**
   * Delete the personal folder
   * Starts deleting the personal folder.
   *
   * REST API Reference for startDeletePersonalFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-delete-personal-folder/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startDeletePersonalFolder(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/delete/personal/start";

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
   * Start the data reassignment
   * Starts the data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for startReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-reassign/
   *
   * @param startReassignRequestDto  (optional)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startReassign(@javax.annotation.Nullable StartReassignRequestDto startReassignRequestDto) throws ApiException {
    return this.startReassign(startReassignRequestDto, Collections.emptyMap());
  }


  /**
   * Start the data reassignment
   * Starts the data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for startReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-reassign/
   *
   * @param startReassignRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startReassign(@javax.annotation.Nullable StartReassignRequestDto startReassignRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startReassignRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/reassign/start";

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
   * Start the data deletion
   * Starts the data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for startRemove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-remove/
   *
   * @param terminateRequestDto  (optional)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startRemove(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto) throws ApiException {
    return this.startRemove(terminateRequestDto, Collections.emptyMap());
  }


  /**
   * Start the data deletion
   * Starts the data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for startRemove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-remove/
   *
   * @param terminateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper startRemove(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = terminateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/remove/start";

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
   * Terminate the data reassignment
   * Terminates the data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for terminateReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-reassign/
   *
   * @param terminateRequestDto  (optional)
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper terminateReassign(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto) throws ApiException {
    return this.terminateReassign(terminateRequestDto, Collections.emptyMap());
  }


  /**
   * Terminate the data reassignment
   * Terminates the data reassignment for the user with the ID specified in the request.
   *
   * REST API Reference for terminateReassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-reassign/
   *
   * @param terminateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TaskProgressResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public TaskProgressResponseWrapper terminateReassign(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = terminateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/reassign/terminate";

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
   * Terminate the data deletion
   * Terminates the data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for terminateRemove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-remove/
   *
   * @param terminateRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void terminateRemove(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto) throws ApiException {
    this.terminateRemove(terminateRequestDto, Collections.emptyMap());
  }


  /**
   * Terminate the data deletion
   * Terminates the data deletion for the user with the ID specified in the request.
   *
   * REST API Reference for terminateRemove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-remove/
   *
   * @param terminateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateRemove(@javax.annotation.Nullable TerminateRequestDto terminateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = terminateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/remove/terminate";

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
      "application/json"
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
