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

import org.openapitools.client.model.QuotaSettingsRequestsDto;
import org.openapitools.client.model.TenantAiAgentQuotaSettingsWrapper;
import org.openapitools.client.model.TenantQuotaSettingsRequestsDto;
import org.openapitools.client.model.TenantQuotaSettingsWrapper;
import org.openapitools.client.model.TenantRoomQuotaSettingsWrapper;
import org.openapitools.client.model.TenantUserQuotaSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class QuotaApi extends BaseApi {

  public QuotaApi() {
    super(Configuration.getDefaultApiClient());
  }

  public QuotaApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the user quota settings
   * Returns the user quota settings.
   *
   * REST API Reference for getUserQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-quota-settings/
   *
   * @return TenantUserQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserQuotaSettingsWrapper getUserQuotaSettings() throws ApiException {
    return this.getUserQuotaSettings(Collections.emptyMap());
  }


  /**
   * Get the user quota settings
   * Returns the user quota settings.
   *
   * REST API Reference for getUserQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-quota-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantUserQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserQuotaSettingsWrapper getUserQuotaSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/userquotasettings";

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

    TypeReference<TenantUserQuotaSettingsWrapper> localVarReturnType = new TypeReference<TenantUserQuotaSettingsWrapper>() {};
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
   * Save the AI Agent quota settings
   * Saves the AI Agent quota settings specified in the request to the current portal.
   *
   * REST API Reference for saveAiAgentQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ai-agent-quota-settings/
   *
   * @param quotaSettingsRequestsDto  (optional)
   * @return TenantAiAgentQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAgentQuotaSettingsWrapper saveAiAgentQuotaSettings(@javax.annotation.Nullable QuotaSettingsRequestsDto quotaSettingsRequestsDto) throws ApiException {
    return this.saveAiAgentQuotaSettings(quotaSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the AI Agent quota settings
   * Saves the AI Agent quota settings specified in the request to the current portal.
   *
   * REST API Reference for saveAiAgentQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ai-agent-quota-settings/
   *
   * @param quotaSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantAiAgentQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAgentQuotaSettingsWrapper saveAiAgentQuotaSettings(@javax.annotation.Nullable QuotaSettingsRequestsDto quotaSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = quotaSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/aiagentquotasettings";

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

    TypeReference<TenantAiAgentQuotaSettingsWrapper> localVarReturnType = new TypeReference<TenantAiAgentQuotaSettingsWrapper>() {};
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
   * Save the room quota settings
   * Saves the room quota settings specified in the request to the current portal.
   *
   * REST API Reference for saveRoomQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-room-quota-settings/
   *
   * @param quotaSettingsRequestsDto  (optional)
   * @return TenantRoomQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantRoomQuotaSettingsWrapper saveRoomQuotaSettings(@javax.annotation.Nullable QuotaSettingsRequestsDto quotaSettingsRequestsDto) throws ApiException {
    return this.saveRoomQuotaSettings(quotaSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the room quota settings
   * Saves the room quota settings specified in the request to the current portal.
   *
   * REST API Reference for saveRoomQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-room-quota-settings/
   *
   * @param quotaSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantRoomQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantRoomQuotaSettingsWrapper saveRoomQuotaSettings(@javax.annotation.Nullable QuotaSettingsRequestsDto quotaSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = quotaSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/roomquotasettings";

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

    TypeReference<TenantRoomQuotaSettingsWrapper> localVarReturnType = new TypeReference<TenantRoomQuotaSettingsWrapper>() {};
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
   * Save the tenant quota settings
   * Saves the tenant quota settings specified in the request to the current portal.
   *
   * REST API Reference for setTenantQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-quota-settings/
   *
   * @param tenantQuotaSettingsRequestsDto  (optional)
   * @return TenantQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantQuotaSettingsWrapper setTenantQuotaSettings(@javax.annotation.Nullable TenantQuotaSettingsRequestsDto tenantQuotaSettingsRequestsDto) throws ApiException {
    return this.setTenantQuotaSettings(tenantQuotaSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the tenant quota settings
   * Saves the tenant quota settings specified in the request to the current portal.
   *
   * REST API Reference for setTenantQuotaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-quota-settings/
   *
   * @param tenantQuotaSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantQuotaSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantQuotaSettingsWrapper setTenantQuotaSettings(@javax.annotation.Nullable TenantQuotaSettingsRequestsDto tenantQuotaSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantQuotaSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tenantquotasettings";

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

    TypeReference<TenantQuotaSettingsWrapper> localVarReturnType = new TypeReference<TenantQuotaSettingsWrapper>() {};
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
