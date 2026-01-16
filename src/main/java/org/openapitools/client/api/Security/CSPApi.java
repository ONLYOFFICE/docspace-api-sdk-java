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

package org.openapitools.client.api.Security;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.CspRequestsDto;
import org.openapitools.client.model.CspWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class CSPApi extends BaseApi {

  public CSPApi() {
    super(Configuration.getDefaultApiClient());
  }

  public CSPApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Configure CSP settings
   * Configures the CSP (Content Security Policy) settings for the current portal.
   *
   * REST API Reference for configureCsp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-csp/
   *
   * @param cspRequestsDto  (optional)
   * @return CspWrapper
   * @throws ApiException if fails to make API call
   */
  public CspWrapper configureCsp(@javax.annotation.Nullable CspRequestsDto cspRequestsDto) throws ApiException {
    return this.configureCsp(cspRequestsDto, Collections.emptyMap());
  }


  /**
   * Configure CSP settings
   * Configures the CSP (Content Security Policy) settings for the current portal.
   *
   * REST API Reference for configureCsp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-csp/
   *
   * @param cspRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CspWrapper
   * @throws ApiException if fails to make API call
   */
  public CspWrapper configureCsp(@javax.annotation.Nullable CspRequestsDto cspRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = cspRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/csp";

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

    TypeReference<CspWrapper> localVarReturnType = new TypeReference<CspWrapper>() {};
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
   * Get CSP settings
   * Returns the CSP (Content Security Policy) settings for the current portal.
   *
   * REST API Reference for getCspSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/
   *
   * @return CspWrapper
   * @throws ApiException if fails to make API call
   */
  public CspWrapper getCspSettings() throws ApiException {
    return this.getCspSettings(Collections.emptyMap());
  }


  /**
   * Get CSP settings
   * Returns the CSP (Content Security Policy) settings for the current portal.
   *
   * REST API Reference for getCspSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CspWrapper
   * @throws ApiException if fails to make API call
   */
  public CspWrapper getCspSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/csp";

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

    TypeReference<CspWrapper> localVarReturnType = new TypeReference<CspWrapper>() {};
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
