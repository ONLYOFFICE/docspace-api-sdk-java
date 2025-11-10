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

import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.SsoSettingsRequestsDto;
import org.openapitools.client.model.SsoSettingsV2Wrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SSOApi extends BaseApi {

  public SSOApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SSOApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the default SSO settings
   * Returns the default portal SSO settings.
   *
   * REST API Reference for getDefaultSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-sso-settings-v2/
   *
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper getDefaultSsoSettingsV2() throws ApiException {
    return this.getDefaultSsoSettingsV2(Collections.emptyMap());
  }


  /**
   * Get the default SSO settings
   * Returns the default portal SSO settings.
   *
   * REST API Reference for getDefaultSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-sso-settings-v2/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper getDefaultSsoSettingsV2(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ssov2/default";

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

    TypeReference<SsoSettingsV2Wrapper> localVarReturnType = new TypeReference<SsoSettingsV2Wrapper>() {};
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
   * Get the SSO settings
   * Returns the current portal SSO settings.
   *
   * REST API Reference for getSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/
   *
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper getSsoSettingsV2() throws ApiException {
    return this.getSsoSettingsV2(Collections.emptyMap());
  }


  /**
   * Get the SSO settings
   * Returns the current portal SSO settings.
   *
   * REST API Reference for getSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper getSsoSettingsV2(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ssov2";

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

    TypeReference<SsoSettingsV2Wrapper> localVarReturnType = new TypeReference<SsoSettingsV2Wrapper>() {};
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
   * Get the SSO settings constants
   * Returns the SSO settings constants.
   *
   * REST API Reference for getSsoSettingsV2Constants Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSsoSettingsV2Constants() throws ApiException {
    return this.getSsoSettingsV2Constants(Collections.emptyMap());
  }


  /**
   * Get the SSO settings constants
   * Returns the SSO settings constants.
   *
   * REST API Reference for getSsoSettingsV2Constants Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSsoSettingsV2Constants(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ssov2/constants";

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

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
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
   * Reset the SSO settings
   * Resets the SSO settings of the current portal.
   *
   * REST API Reference for resetSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-sso-settings-v2/
   *
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper resetSsoSettingsV2() throws ApiException {
    return this.resetSsoSettingsV2(Collections.emptyMap());
  }


  /**
   * Reset the SSO settings
   * Resets the SSO settings of the current portal.
   *
   * REST API Reference for resetSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-sso-settings-v2/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper resetSsoSettingsV2(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ssov2";

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

    TypeReference<SsoSettingsV2Wrapper> localVarReturnType = new TypeReference<SsoSettingsV2Wrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
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
   * Save the SSO settings
   * Saves the SSO settings for the current portal.
   *
   * REST API Reference for saveSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-sso-settings-v2/
   *
   * @param ssoSettingsRequestsDto  (optional)
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper saveSsoSettingsV2(@javax.annotation.Nullable SsoSettingsRequestsDto ssoSettingsRequestsDto) throws ApiException {
    return this.saveSsoSettingsV2(ssoSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the SSO settings
   * Saves the SSO settings for the current portal.
   *
   * REST API Reference for saveSsoSettingsV2 Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-sso-settings-v2/
   *
   * @param ssoSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SsoSettingsV2Wrapper
   * @throws ApiException if fails to make API call
   */
  public SsoSettingsV2Wrapper saveSsoSettingsV2(@javax.annotation.Nullable SsoSettingsRequestsDto ssoSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ssoSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ssov2";

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

    TypeReference<SsoSettingsV2Wrapper> localVarReturnType = new TypeReference<SsoSettingsV2Wrapper>() {};
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
