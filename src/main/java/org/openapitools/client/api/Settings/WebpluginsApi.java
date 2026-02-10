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

package org.openapitools.client.api.Settings;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.WebPluginArrayWrapper;
import org.openapitools.client.model.WebPluginRequests;
import org.openapitools.client.model.WebPluginWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class WebpluginsApi extends BaseApi {

  public WebpluginsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebpluginsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Add a web plugin
   * Adds a web plugin from a file to the current portal.
   *
   * REST API Reference for addWebPluginFromFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/
   *
   * @param system Specifies whether to load the system plugins or not. (optional)
   * @return WebPluginWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginWrapper addWebPluginFromFile(@javax.annotation.Nullable Boolean system) throws ApiException {
    return this.addWebPluginFromFile(system, Collections.emptyMap());
  }


  /**
   * Add a web plugin
   * Adds a web plugin from a file to the current portal.
   *
   * REST API Reference for addWebPluginFromFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/
   *
   * @param system Specifies whether to load the system plugins or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebPluginWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginWrapper addWebPluginFromFile(@javax.annotation.Nullable Boolean system, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webplugins";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("system", system));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<WebPluginWrapper> localVarReturnType = new TypeReference<WebPluginWrapper>() {};
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
   * Delete a web plugin
   * Deletes a web plugin by the name specified in the request.
   *
   * REST API Reference for deleteWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebPlugin(@javax.annotation.Nonnull String name) throws ApiException {
    this.deleteWebPlugin(name, Collections.emptyMap());
  }


  /**
   * Delete a web plugin
   * Deletes a web plugin by the name specified in the request.
   *
   * REST API Reference for deleteWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteWebPlugin(@javax.annotation.Nonnull String name, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteWebPlugin");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webplugins/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(apiClient.parameterToString(name)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Get a web plugin by name
   * Returns a web plugin by the name specified in the request.
   *
   * REST API Reference for getWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @return WebPluginWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginWrapper getWebPlugin(@javax.annotation.Nonnull String name) throws ApiException {
    return this.getWebPlugin(name, Collections.emptyMap());
  }


  /**
   * Get a web plugin by name
   * Returns a web plugin by the name specified in the request.
   *
   * REST API Reference for getWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebPluginWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginWrapper getWebPlugin(@javax.annotation.Nonnull String name, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getWebPlugin");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webplugins/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(apiClient.parameterToString(name)));

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

    TypeReference<WebPluginWrapper> localVarReturnType = new TypeReference<WebPluginWrapper>() {};
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
   * Get web plugins
   * Returns the portal web plugins.
   *
   * REST API Reference for getWebPlugins Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/
   *
   * @param enabled The optional filter for the plugin enabled state. (optional)
   * @return WebPluginArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginArrayWrapper getWebPlugins(@javax.annotation.Nullable Boolean enabled) throws ApiException {
    return this.getWebPlugins(enabled, Collections.emptyMap());
  }


  /**
   * Get web plugins
   * Returns the portal web plugins.
   *
   * REST API Reference for getWebPlugins Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/
   *
   * @param enabled The optional filter for the plugin enabled state. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebPluginArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebPluginArrayWrapper getWebPlugins(@javax.annotation.Nullable Boolean enabled, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webplugins";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("enabled", enabled));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<WebPluginArrayWrapper> localVarReturnType = new TypeReference<WebPluginArrayWrapper>() {};
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
   * Update a web plugin
   * Updates a web plugin with the parameters specified in the request.
   *
   * REST API Reference for updateWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @param webPluginRequests The configuration settings for the web plugin instance. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWebPlugin(@javax.annotation.Nonnull String name, @javax.annotation.Nonnull WebPluginRequests webPluginRequests) throws ApiException {
    this.updateWebPlugin(name, webPluginRequests, Collections.emptyMap());
  }


  /**
   * Update a web plugin
   * Updates a web plugin with the parameters specified in the request.
   *
   * REST API Reference for updateWebPlugin Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/
   *
   * @param name The web plugin name. (required)
   * @param webPluginRequests The configuration settings for the web plugin instance. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void updateWebPlugin(@javax.annotation.Nonnull String name, @javax.annotation.Nonnull WebPluginRequests webPluginRequests, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webPluginRequests;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateWebPlugin");
    }
    
    // verify the required parameter 'webPluginRequests' is set
    if (webPluginRequests == null) {
      throw new ApiException(400, "Missing the required parameter 'webPluginRequests' when calling updateWebPlugin");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webplugins/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(apiClient.parameterToString(name)));

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
