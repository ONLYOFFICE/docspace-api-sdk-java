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

import org.openapitools.client.model.OwnerChangeInstructionsWrapper;
import org.openapitools.client.model.OwnerIdSettingsRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class OwnerApi extends BaseApi {

  public OwnerApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OwnerApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Send the owner change instructions
   * Sends the instructions to change the DocSpace owner.
   *
   * REST API Reference for sendOwnerChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-owner-change-instructions/
   *
   * @param ownerIdSettingsRequestDto  (optional)
   * @return OwnerChangeInstructionsWrapper
   * @throws ApiException if fails to make API call
   */
  public OwnerChangeInstructionsWrapper sendOwnerChangeInstructions(@javax.annotation.Nullable OwnerIdSettingsRequestDto ownerIdSettingsRequestDto) throws ApiException {
    return this.sendOwnerChangeInstructions(ownerIdSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Send the owner change instructions
   * Sends the instructions to change the DocSpace owner.
   *
   * REST API Reference for sendOwnerChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-owner-change-instructions/
   *
   * @param ownerIdSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return OwnerChangeInstructionsWrapper
   * @throws ApiException if fails to make API call
   */
  public OwnerChangeInstructionsWrapper sendOwnerChangeInstructions(@javax.annotation.Nullable OwnerIdSettingsRequestDto ownerIdSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ownerIdSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/owner";

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

    TypeReference<OwnerChangeInstructionsWrapper> localVarReturnType = new TypeReference<OwnerChangeInstructionsWrapper>() {};
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
   * Update the portal owner
   * Updates the current portal owner with a new one specified in the request.
   *
   * REST API Reference for updatePortalOwner Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-portal-owner/
   *
   * @param ownerIdSettingsRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updatePortalOwner(@javax.annotation.Nullable OwnerIdSettingsRequestDto ownerIdSettingsRequestDto) throws ApiException {
    this.updatePortalOwner(ownerIdSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Update the portal owner
   * Updates the current portal owner with a new one specified in the request.
   *
   * REST API Reference for updatePortalOwner Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-portal-owner/
   *
   * @param ownerIdSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void updatePortalOwner(@javax.annotation.Nullable OwnerIdSettingsRequestDto ownerIdSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ownerIdSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/owner";

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
