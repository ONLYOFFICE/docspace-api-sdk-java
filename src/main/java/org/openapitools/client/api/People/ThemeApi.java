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

import org.openapitools.client.model.DarkThemeSettingsRequestDto;
import org.openapitools.client.model.DarkThemeSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class ThemeApi extends BaseApi {

  public ThemeApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ThemeApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Change the portal theme
   * Changes the current portal theme.
   *
   * REST API Reference for changePortalTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-portal-theme/
   *
   * @param darkThemeSettingsRequestDto  (optional)
   * @return DarkThemeSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public DarkThemeSettingsWrapper changePortalTheme(@javax.annotation.Nullable DarkThemeSettingsRequestDto darkThemeSettingsRequestDto) throws ApiException {
    return this.changePortalTheme(darkThemeSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Change the portal theme
   * Changes the current portal theme.
   *
   * REST API Reference for changePortalTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-portal-theme/
   *
   * @param darkThemeSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DarkThemeSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public DarkThemeSettingsWrapper changePortalTheme(@javax.annotation.Nullable DarkThemeSettingsRequestDto darkThemeSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = darkThemeSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/theme";

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

    TypeReference<DarkThemeSettingsWrapper> localVarReturnType = new TypeReference<DarkThemeSettingsWrapper>() {};
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
   * Get the portal theme
   * Returns a theme which is set to the current portal.
   *
   * REST API Reference for getPortalTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-theme/
   *
   * @return DarkThemeSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public DarkThemeSettingsWrapper getPortalTheme() throws ApiException {
    return this.getPortalTheme(Collections.emptyMap());
  }


  /**
   * Get the portal theme
   * Returns a theme which is set to the current portal.
   *
   * REST API Reference for getPortalTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-theme/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DarkThemeSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public DarkThemeSettingsWrapper getPortalTheme(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/theme";

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

    TypeReference<DarkThemeSettingsWrapper> localVarReturnType = new TypeReference<DarkThemeSettingsWrapper>() {};
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
