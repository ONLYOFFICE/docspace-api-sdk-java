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

package org.openapitools.client.api.Apps;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AppArrayWrapper;
import org.openapitools.client.model.AppWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.SetAppEnabledBody;
import org.openapitools.client.model.SetAppSettingsBody;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AppsApi extends BaseApi {

  public AppsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AppsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get a single app
   * Returns a single application by id with the per-tenant enabled state and settings JSON.
   *
   * REST API Reference for get Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get/
   *
   * @param id The application identifier. (required)
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper get(@javax.annotation.Nonnull String id) throws ApiException {
    return this.get(id, Collections.emptyMap());
  }


  /**
   * Get a single app
   * Returns a single application by id with the per-tenant enabled state and settings JSON.
   *
   * REST API Reference for get Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get/
   *
   * @param id The application identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper get(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/apps/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<AppWrapper> localVarReturnType = new TypeReference<AppWrapper>() {};
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
   * Get all apps
   * Returns the full list of portal applications declared in configuration, merged with per-tenant overrides  (enabled state and JSON settings).
   *
   * REST API Reference for getAll Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all/
   *
   * @return AppArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AppArrayWrapper getAll() throws ApiException {
    return this.getAll(Collections.emptyMap());
  }


  /**
   * Get all apps
   * Returns the full list of portal applications declared in configuration, merged with per-tenant overrides  (enabled state and JSON settings).
   *
   * REST API Reference for getAll Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AppArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AppArrayWrapper getAll(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/apps";

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

    TypeReference<AppArrayWrapper> localVarReturnType = new TypeReference<AppArrayWrapper>() {};
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
   * Get app settings
   * Returns the JSON settings document saved for the specified application, or null if no overrides exist.
   *
   * REST API Reference for getSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/
   *
   * @param id The application identifier. (required)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSettings(@javax.annotation.Nonnull String id) throws ApiException {
    return this.getSettings(id, Collections.emptyMap());
  }


  /**
   * Get app settings
   * Returns the JSON settings document saved for the specified application, or null if no overrides exist.
   *
   * REST API Reference for getSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/
   *
   * @param id The application identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSettings(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/apps/{id}/settings"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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
   * Enable or disable an app
   * Toggles the enabled state of the application for the current tenant. Requires portal administrator permissions.
   *
   * REST API Reference for setEnabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/
   *
   * @param id The application identifier. (required)
   * @param setAppEnabledBody New enabled state. (required)
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper setEnabled(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull SetAppEnabledBody setAppEnabledBody) throws ApiException {
    return this.setEnabled(id, setAppEnabledBody, Collections.emptyMap());
  }


  /**
   * Enable or disable an app
   * Toggles the enabled state of the application for the current tenant. Requires portal administrator permissions.
   *
   * REST API Reference for setEnabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/
   *
   * @param id The application identifier. (required)
   * @param setAppEnabledBody New enabled state. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper setEnabled(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull SetAppEnabledBody setAppEnabledBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setAppEnabledBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setEnabled");
    }
    
    // verify the required parameter 'setAppEnabledBody' is set
    if (setAppEnabledBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setAppEnabledBody' when calling setEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/apps/{id}/enabled"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<AppWrapper> localVarReturnType = new TypeReference<AppWrapper>() {};
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
   * Save app settings
   * Saves an arbitrary JSON settings document for the specified application for the current tenant.  Requires portal administrator permissions.
   *
   * REST API Reference for setSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/
   *
   * @param id The application identifier. (required)
   * @param setAppSettingsBody New settings document. (required)
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper setSettings(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull SetAppSettingsBody setAppSettingsBody) throws ApiException {
    return this.setSettings(id, setAppSettingsBody, Collections.emptyMap());
  }


  /**
   * Save app settings
   * Saves an arbitrary JSON settings document for the specified application for the current tenant.  Requires portal administrator permissions.
   *
   * REST API Reference for setSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/
   *
   * @param id The application identifier. (required)
   * @param setAppSettingsBody New settings document. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AppWrapper
   * @throws ApiException if fails to make API call
   */
  public AppWrapper setSettings(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull SetAppSettingsBody setAppSettingsBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setAppSettingsBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSettings");
    }
    
    // verify the required parameter 'setAppSettingsBody' is set
    if (setAppSettingsBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setAppSettingsBody' when calling setSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/apps/{id}/settings"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<AppWrapper> localVarReturnType = new TypeReference<AppWrapper>() {};
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
