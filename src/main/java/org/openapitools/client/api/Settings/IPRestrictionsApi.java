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

import org.openapitools.client.model.IPRestrictionArrayWrapper;
import org.openapitools.client.model.IPRestrictionsSettingsWrapper;
import org.openapitools.client.model.IpRestrictionsDto;
import org.openapitools.client.model.IpRestrictionsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class IPRestrictionsApi extends BaseApi {

  public IPRestrictionsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public IPRestrictionsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the IP portal restrictions
   * Returns the IP portal restrictions.
   *
   * REST API Reference for getIpRestrictions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ip-restrictions/
   *
   * @return IPRestrictionArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public IPRestrictionArrayWrapper getIpRestrictions() throws ApiException {
    return this.getIpRestrictions(Collections.emptyMap());
  }


  /**
   * Get the IP portal restrictions
   * Returns the IP portal restrictions.
   *
   * REST API Reference for getIpRestrictions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ip-restrictions/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return IPRestrictionArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public IPRestrictionArrayWrapper getIpRestrictions(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/iprestrictions";

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

    TypeReference<IPRestrictionArrayWrapper> localVarReturnType = new TypeReference<IPRestrictionArrayWrapper>() {};
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
   * Get the IP restriction settings
   * Returns the IP restriction settings.
   *
   * REST API Reference for readIpRestrictionsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/read-ip-restrictions-settings/
   *
   * @return IPRestrictionsSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public IPRestrictionsSettingsWrapper readIpRestrictionsSettings() throws ApiException {
    return this.readIpRestrictionsSettings(Collections.emptyMap());
  }


  /**
   * Get the IP restriction settings
   * Returns the IP restriction settings.
   *
   * REST API Reference for readIpRestrictionsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/read-ip-restrictions-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return IPRestrictionsSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public IPRestrictionsSettingsWrapper readIpRestrictionsSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/iprestrictions/settings";

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

    TypeReference<IPRestrictionsSettingsWrapper> localVarReturnType = new TypeReference<IPRestrictionsSettingsWrapper>() {};
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
   * Update the IP restrictions
   * Updates the IP restrictions with the parameters specified in the request.
   *
   * REST API Reference for saveIpRestrictions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ip-restrictions/
   *
   * @param ipRestrictionsDto  (optional)
   * @return IpRestrictionsWrapper
   * @throws ApiException if fails to make API call
   */
  public IpRestrictionsWrapper saveIpRestrictions(@javax.annotation.Nullable IpRestrictionsDto ipRestrictionsDto) throws ApiException {
    return this.saveIpRestrictions(ipRestrictionsDto, Collections.emptyMap());
  }


  /**
   * Update the IP restrictions
   * Updates the IP restrictions with the parameters specified in the request.
   *
   * REST API Reference for saveIpRestrictions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ip-restrictions/
   *
   * @param ipRestrictionsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return IpRestrictionsWrapper
   * @throws ApiException if fails to make API call
   */
  public IpRestrictionsWrapper saveIpRestrictions(@javax.annotation.Nullable IpRestrictionsDto ipRestrictionsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ipRestrictionsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/iprestrictions";

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

    TypeReference<IpRestrictionsWrapper> localVarReturnType = new TypeReference<IpRestrictionsWrapper>() {};
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
   * Update the IP restriction settings
   * Updates the IP restriction settings with the parameters specified in the request.
   *
   * REST API Reference for updateIpRestrictionsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-ip-restrictions-settings/
   *
   * @param ipRestrictionsDto  (optional)
   * @return IpRestrictionsWrapper
   * @throws ApiException if fails to make API call
   */
  public IpRestrictionsWrapper updateIpRestrictionsSettings(@javax.annotation.Nullable IpRestrictionsDto ipRestrictionsDto) throws ApiException {
    return this.updateIpRestrictionsSettings(ipRestrictionsDto, Collections.emptyMap());
  }


  /**
   * Update the IP restriction settings
   * Updates the IP restriction settings with the parameters specified in the request.
   *
   * REST API Reference for updateIpRestrictionsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-ip-restrictions-settings/
   *
   * @param ipRestrictionsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return IpRestrictionsWrapper
   * @throws ApiException if fails to make API call
   */
  public IpRestrictionsWrapper updateIpRestrictionsSettings(@javax.annotation.Nullable IpRestrictionsDto ipRestrictionsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ipRestrictionsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/iprestrictions/settings";

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

    TypeReference<IpRestrictionsWrapper> localVarReturnType = new TypeReference<IpRestrictionsWrapper>() {};
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
