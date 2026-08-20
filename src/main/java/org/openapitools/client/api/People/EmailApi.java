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

package org.openapitools.client.api.People;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ChangeEmailRequest;
import org.openapitools.client.model.EmployeeFullWrapper;
import org.openapitools.client.model.StringWrapper;
import java.util.UUID;
import org.openapitools.client.model.UpdateMemberRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class EmailApi extends BaseApi {

  public EmailApi() {
    super(Configuration.getDefaultApiClient());
  }

  public EmailApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Change a user email
   * Sets a new email to the user with the ID specified in the request.
   *
   * REST API Reference for changeUserEmail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-email/
   *
   * @param userid The user ID. (required)
   * @param changeEmailRequest The request parameters for updating a user email. (required)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper changeUserEmail(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull ChangeEmailRequest changeEmailRequest) throws ApiException {
    return this.changeUserEmail(userid, changeEmailRequest, Collections.emptyMap());
  }


  /**
   * Change a user email
   * Sets a new email to the user with the ID specified in the request.
   *
   * REST API Reference for changeUserEmail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-email/
   *
   * @param userid The user ID. (required)
   * @param changeEmailRequest The request parameters for updating a user email. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper changeUserEmail(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull ChangeEmailRequest changeEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = changeEmailRequest;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling changeUserEmail");
    }
    
    // verify the required parameter 'changeEmailRequest' is set
    if (changeEmailRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'changeEmailRequest' when calling changeUserEmail");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/email"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Send instructions to change email
   * Sends a message to the user email with the instructions to change the email address connected to the portal.
   *
   * REST API Reference for sendEmailChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
   *
   * @param updateMemberRequestDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendEmailChangeInstructions(@javax.annotation.Nullable UpdateMemberRequestDto updateMemberRequestDto) throws ApiException {
    return this.sendEmailChangeInstructions(updateMemberRequestDto, Collections.emptyMap());
  }


  /**
   * Send instructions to change email
   * Sends a message to the user email with the instructions to change the email address connected to the portal.
   *
   * REST API Reference for sendEmailChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
   *
   * @param updateMemberRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendEmailChangeInstructions(@javax.annotation.Nullable UpdateMemberRequestDto updateMemberRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMemberRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/email";

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
