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

package org.openapitools.client.api.Settings;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AdminMessageBaseSettingsRequestsDto;
import org.openapitools.client.model.AdminMessageSettingsRequestsDto;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TurnOnAdminMessageSettingsRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class MessagesApi extends BaseApi {

  public MessagesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Enable the administrator message settings
   * Displays the contact form on the Sign In page, allowing users to send a message to the DocSpace administrator in case they encounter any issues while accessing DocSpace.
   *
   * REST API Reference for enableAdminMessageSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-admin-message-settings/
   *
   * @param turnOnAdminMessageSettingsRequestDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper enableAdminMessageSettings(@javax.annotation.Nullable TurnOnAdminMessageSettingsRequestDto turnOnAdminMessageSettingsRequestDto) throws ApiException {
    return this.enableAdminMessageSettings(turnOnAdminMessageSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Enable the administrator message settings
   * Displays the contact form on the Sign In page, allowing users to send a message to the DocSpace administrator in case they encounter any issues while accessing DocSpace.
   *
   * REST API Reference for enableAdminMessageSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-admin-message-settings/
   *
   * @param turnOnAdminMessageSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper enableAdminMessageSettings(@javax.annotation.Nullable TurnOnAdminMessageSettingsRequestDto turnOnAdminMessageSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = turnOnAdminMessageSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/messagesettings";

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

  /**
   * Send a message to the administrator
   * Sends a message to the administrator email when unauthorized users encounter issues accessing DocSpace.
   *
   * REST API Reference for sendAdminMail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-admin-mail/
   *
   * @param adminMessageSettingsRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendAdminMail(@javax.annotation.Nullable AdminMessageSettingsRequestsDto adminMessageSettingsRequestsDto) throws ApiException {
    return this.sendAdminMail(adminMessageSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Send a message to the administrator
   * Sends a message to the administrator email when unauthorized users encounter issues accessing DocSpace.
   *
   * REST API Reference for sendAdminMail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-admin-mail/
   *
   * @param adminMessageSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendAdminMail(@javax.annotation.Nullable AdminMessageSettingsRequestsDto adminMessageSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = adminMessageSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/sendadmmail";

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

  /**
   * Sends an invitation email
   * Sends an invitation email with a link to the DocSpace.
   *
   * REST API Reference for sendJoinInviteMail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-join-invite-mail/
   *
   * @param adminMessageBaseSettingsRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendJoinInviteMail(@javax.annotation.Nullable AdminMessageBaseSettingsRequestsDto adminMessageBaseSettingsRequestsDto) throws ApiException {
    return this.sendJoinInviteMail(adminMessageBaseSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Sends an invitation email
   * Sends an invitation email with a link to the DocSpace.
   *
   * REST API Reference for sendJoinInviteMail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-join-invite-mail/
   *
   * @param adminMessageBaseSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendJoinInviteMail(@javax.annotation.Nullable AdminMessageBaseSettingsRequestsDto adminMessageBaseSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = adminMessageBaseSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/sendjoininvite";

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
