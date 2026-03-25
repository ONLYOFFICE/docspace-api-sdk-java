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

package org.openapitools.client.api.Security;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.TenantBannerSettingsDto;
import org.openapitools.client.model.TenantBannerSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class BannersVisibilityApi extends BaseApi {

  public BannersVisibilityApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BannersVisibilityApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Set the banners visibility
   * Sets the visibility settings of the promotional banners in the portal.
   *
   * REST API Reference for setTenantBannerSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-banner-settings/
   *
   * @param tenantBannerSettingsDto  (optional)
   * @return TenantBannerSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantBannerSettingsWrapper setTenantBannerSettings(@javax.annotation.Nullable TenantBannerSettingsDto tenantBannerSettingsDto) throws ApiException {
    return this.setTenantBannerSettings(tenantBannerSettingsDto, Collections.emptyMap());
  }


  /**
   * Set the banners visibility
   * Sets the visibility settings of the promotional banners in the portal.
   *
   * REST API Reference for setTenantBannerSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-banner-settings/
   *
   * @param tenantBannerSettingsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantBannerSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantBannerSettingsWrapper setTenantBannerSettings(@javax.annotation.Nullable TenantBannerSettingsDto tenantBannerSettingsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantBannerSettingsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/banner";

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

    TypeReference<TenantBannerSettingsWrapper> localVarReturnType = new TypeReference<TenantBannerSettingsWrapper>() {};
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
