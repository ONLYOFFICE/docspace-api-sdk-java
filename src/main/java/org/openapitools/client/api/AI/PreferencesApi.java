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

package org.openapitools.client.api.AI;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiPreferencesSetDeepModeRequest;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PreferencesApi extends BaseApi {

  public PreferencesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PreferencesApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Clear deep mode
   * Drops the persisted deep-mode toggle of the scope, so later reads fall back to the configured default.
   *
   * REST API Reference for aiPreferencesClearDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPreferencesClearDeepMode(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPreferencesClearDeepMode(body, Collections.emptyMap());
  }


  /**
   * Clear deep mode
   * Drops the persisted deep-mode toggle of the scope, so later reads fall back to the configured default.
   *
   * REST API Reference for aiPreferencesClearDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPreferencesClearDeepMode(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiPreferencesClearDeepMode");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/preferences/clear-deep-mode";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get deep mode
   * Returns the deep-mode toggle of the scope, falling back to the configured default when nothing has been persisted.
   *
   * REST API Reference for aiPreferencesGetDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiPreferencesGetDeepMode(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiPreferencesGetDeepMode(entityId, Collections.emptyMap());
  }


  /**
   * Get deep mode
   * Returns the deep-mode toggle of the scope, falling back to the configured default when nothing has been persisted.
   *
   * REST API Reference for aiPreferencesGetDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiPreferencesGetDeepMode(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/preferences/get-deep-mode";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Boolean> localVarReturnType = new TypeReference<Boolean>() {};
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
   * Is deep mode set
   * Tells whether the scope has an explicitly persisted deep-mode value, whichever way that value is set.
   *
   * REST API Reference for aiPreferencesIsDeepModeSet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiPreferencesIsDeepModeSet(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiPreferencesIsDeepModeSet(entityId, Collections.emptyMap());
  }


  /**
   * Is deep mode set
   * Tells whether the scope has an explicitly persisted deep-mode value, whichever way that value is set.
   *
   * REST API Reference for aiPreferencesIsDeepModeSet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiPreferencesIsDeepModeSet(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/preferences/is-deep-mode-set";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Boolean> localVarReturnType = new TypeReference<Boolean>() {};
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
   * Set deep mode
   * Persists the deep-mode toggle of the scope. Idempotent - there is no need to check whether a value already exists.
   *
   * REST API Reference for aiPreferencesSetDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/
   *
   * @param aiPreferencesSetDeepModeRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPreferencesSetDeepMode(@javax.annotation.Nonnull AiPreferencesSetDeepModeRequest aiPreferencesSetDeepModeRequest) throws ApiException {
    return this.aiPreferencesSetDeepMode(aiPreferencesSetDeepModeRequest, Collections.emptyMap());
  }


  /**
   * Set deep mode
   * Persists the deep-mode toggle of the scope. Idempotent - there is no need to check whether a value already exists.
   *
   * REST API Reference for aiPreferencesSetDeepMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/
   *
   * @param aiPreferencesSetDeepModeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPreferencesSetDeepMode(@javax.annotation.Nonnull AiPreferencesSetDeepModeRequest aiPreferencesSetDeepModeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiPreferencesSetDeepModeRequest;
    
    // verify the required parameter 'aiPreferencesSetDeepModeRequest' is set
    if (aiPreferencesSetDeepModeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiPreferencesSetDeepModeRequest' when calling aiPreferencesSetDeepMode");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/preferences/set-deep-mode";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
