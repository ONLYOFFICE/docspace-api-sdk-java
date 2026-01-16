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

package org.openapitools.client.api.People;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.EmailMemberRequestDto;
import org.openapitools.client.model.EmployeeFullWrapper;
import org.openapitools.client.model.MemberBaseRequestDto;
import org.openapitools.client.model.StringWrapper;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PasswordApi extends BaseApi {

  public PasswordApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PasswordApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Change a user password
   * Sets a new password to the user with the ID specified in the request.
   *
   * REST API Reference for changeUserPassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/
   *
   * @param userid The user ID. (required)
   * @param memberBaseRequestDto The request parameters for the user generic information. (required)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper changeUserPassword(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull MemberBaseRequestDto memberBaseRequestDto) throws ApiException {
    return this.changeUserPassword(userid, memberBaseRequestDto, Collections.emptyMap());
  }


  /**
   * Change a user password
   * Sets a new password to the user with the ID specified in the request.
   *
   * REST API Reference for changeUserPassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/
   *
   * @param userid The user ID. (required)
   * @param memberBaseRequestDto The request parameters for the user generic information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper changeUserPassword(@javax.annotation.Nonnull UUID userid, @javax.annotation.Nonnull MemberBaseRequestDto memberBaseRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = memberBaseRequestDto;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling changeUserPassword");
    }
    
    // verify the required parameter 'memberBaseRequestDto' is set
    if (memberBaseRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'memberBaseRequestDto' when calling changeUserPassword");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/password"
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
   * Remind a user password
   * Reminds a password to the user using the email address specified in the request.
   *
   * REST API Reference for sendUserPassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/
   *
   * @param emailMemberRequestDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendUserPassword(@javax.annotation.Nullable EmailMemberRequestDto emailMemberRequestDto) throws ApiException {
    return this.sendUserPassword(emailMemberRequestDto, Collections.emptyMap());
  }


  /**
   * Remind a user password
   * Reminds a password to the user using the email address specified in the request.
   *
   * REST API Reference for sendUserPassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/
   *
   * @param emailMemberRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendUserPassword(@javax.annotation.Nullable EmailMemberRequestDto emailMemberRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = emailMemberRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/password";

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

    String[] localVarAuthNames = new String[] {  };

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
