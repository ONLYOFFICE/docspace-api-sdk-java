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
import org.openapitools.client.model.AiSettingsWrapper;
import org.openapitools.client.model.AiSuccessResponse;
import org.openapitools.client.model.AiUserSettingsWrapper;
import org.openapitools.client.model.AiVectorizationSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SettingsApi extends BaseApi {

  public SettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get AI settings
   * Reports the portal's AI configuration and whether AI is usable at all, which is the first call a client makes before offering any AI feature. It takes no parameters and is proxied unchanged to the DocSpace AI service, so the answer is that service's settings payload. Among other things it says whether the portal runs on the central AI gateway, which decides whether provider profiles can be edited here at all. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/
   *
   * @return AiSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiSettingsWrapper aiSettingsGet() throws ApiException {
    return this.aiSettingsGet(Collections.emptyMap());
  }


  /**
   * Get AI settings
   * Reports the portal's AI configuration and whether AI is usable at all, which is the first call a client makes before offering any AI feature. It takes no parameters and is proxied unchanged to the DocSpace AI service, so the answer is that service's settings payload. Among other things it says whether the portal runs on the central AI gateway, which decides whether provider profiles can be edited here at all. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiSettingsWrapper aiSettingsGet(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiSettingsWrapper> localVarReturnType = new TypeReference<AiSettingsWrapper>() {};
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
   * Get the tool permission mode
   * Returns the calling user's tool permission mode as the DocSpace AI service spells it - `{ mode }` with the service's `ToolPermissionMode` enum (`Ask`, `Auto`, `Allow`), proxied unchanged. The chat reads the same value in its own spelling through `GET api/2.0/ai/preferences/get-tool-permission-mode`. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGetToolMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-tool-mode/
   *
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiSettingsGetToolMode() throws ApiException {
    return this.aiSettingsGetToolMode(Collections.emptyMap());
  }


  /**
   * Get the tool permission mode
   * Returns the calling user's tool permission mode as the DocSpace AI service spells it - `{ mode }` with the service's `ToolPermissionMode` enum (`Ask`, `Auto`, `Allow`), proxied unchanged. The chat reads the same value in its own spelling through `GET api/2.0/ai/preferences/get-tool-permission-mode`. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGetToolMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-tool-mode/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiSettingsGetToolMode(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/tool-mode";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get user AI settings
   * Returns the AI settings of the calling user, as opposed to the portal-wide ones. It takes no parameters - the user is the authenticated caller, and there is no way to read somebody else's settings - and is proxied unchanged to the DocSpace AI service. Use `GET api/2.0/ai/config` for the portal-wide configuration. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGetUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/
   *
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper aiSettingsGetUser() throws ApiException {
    return this.aiSettingsGetUser(Collections.emptyMap());
  }


  /**
   * Get user AI settings
   * Returns the AI settings of the calling user, as opposed to the portal-wide ones. It takes no parameters - the user is the authenticated caller, and there is no way to read somebody else's settings - and is proxied unchanged to the DocSpace AI service. Use `GET api/2.0/ai/config` for the portal-wide configuration. This is a read-only operation.
   *
   * REST API Reference for aiSettingsGetUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper aiSettingsGetUser(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/user";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiUserSettingsWrapper> localVarReturnType = new TypeReference<AiUserSettingsWrapper>() {};
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
   * Get vectorization settings
   * Returns the portal's vectorization settings - the embedding provider and the options used when portal content is indexed for retrieval. It takes no parameters and is proxied unchanged to the DocSpace AI service. Vectorization is a portal-wide setting, so there is no room-scoped form of it. Change it with `PUT api/2.0/ai/config/vectorization`.
   *
   * REST API Reference for aiSettingsGetVectorization Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/
   *
   * @return AiVectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiVectorizationSettingsWrapper aiSettingsGetVectorization() throws ApiException {
    return this.aiSettingsGetVectorization(Collections.emptyMap());
  }


  /**
   * Get vectorization settings
   * Returns the portal's vectorization settings - the embedding provider and the options used when portal content is indexed for retrieval. It takes no parameters and is proxied unchanged to the DocSpace AI service. Vectorization is a portal-wide setting, so there is no room-scoped form of it. Change it with `PUT api/2.0/ai/config/vectorization`.
   *
   * REST API Reference for aiSettingsGetVectorization Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiVectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiVectorizationSettingsWrapper aiSettingsGetVectorization(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/vectorization";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiVectorizationSettingsWrapper> localVarReturnType = new TypeReference<AiVectorizationSettingsWrapper>() {};
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
   * Set the tool permission mode
   * Stores the calling user's tool permission mode and returns the stored result. The body (`{ mode }`) is proxied unchanged to the DocSpace AI service, which rejects a value outside its `ToolPermissionMode` enum. The mode applies to every chat of the user in the portal.
   *
   * REST API Reference for aiSettingsSetToolMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-tool-mode/
   *
   * @param aiSettingsSetToolModeRequest `{ mode }` with the AI service's `ToolPermissionMode` enum, proxied unchanged; the service rejects anything outside the enum. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiSettingsSetToolMode(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetToolModeRequest) throws ApiException {
    return this.aiSettingsSetToolMode(aiSettingsSetToolModeRequest, Collections.emptyMap());
  }


  /**
   * Set the tool permission mode
   * Stores the calling user's tool permission mode and returns the stored result. The body (`{ mode }`) is proxied unchanged to the DocSpace AI service, which rejects a value outside its `ToolPermissionMode` enum. The mode applies to every chat of the user in the portal.
   *
   * REST API Reference for aiSettingsSetToolMode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-tool-mode/
   *
   * @param aiSettingsSetToolModeRequest `{ mode }` with the AI service's `ToolPermissionMode` enum, proxied unchanged; the service rejects anything outside the enum. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiSettingsSetToolMode(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetToolModeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSettingsSetToolModeRequest;
    
    // verify the required parameter 'aiSettingsSetToolModeRequest' is set
    if (aiSettingsSetToolModeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSettingsSetToolModeRequest' when calling aiSettingsSetToolMode");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/tool-mode";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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

  /**
   * Update user AI settings
   * Replaces the AI settings of the calling user and returns the stored result. `chatRecommendedModelVisible` is required and has to be a real boolean - a body the JSON parser cannot read, such as one sent as text/plain, used to arrive empty and answer 200 having stored nothing. The body is then proxied to the DocSpace AI service, which validates the rest, so a rejected value comes back with that service's verdict. Only the caller's own settings can be written. Portal-wide configuration is not touched by this operation.
   *
   * REST API Reference for aiSettingsSetUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/
   *
   * @param aiSettingsSetUserRequest The user's AI settings: `chatRecommendedModelVisible` as a boolean, required. Read the current one with `GET api/2.0/ai/config/user` and send it back changed. (required)
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper aiSettingsSetUser(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetUserRequest) throws ApiException {
    return this.aiSettingsSetUser(aiSettingsSetUserRequest, Collections.emptyMap());
  }


  /**
   * Update user AI settings
   * Replaces the AI settings of the calling user and returns the stored result. `chatRecommendedModelVisible` is required and has to be a real boolean - a body the JSON parser cannot read, such as one sent as text/plain, used to arrive empty and answer 200 having stored nothing. The body is then proxied to the DocSpace AI service, which validates the rest, so a rejected value comes back with that service's verdict. Only the caller's own settings can be written. Portal-wide configuration is not touched by this operation.
   *
   * REST API Reference for aiSettingsSetUser Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/
   *
   * @param aiSettingsSetUserRequest The user's AI settings: `chatRecommendedModelVisible` as a boolean, required. Read the current one with `GET api/2.0/ai/config/user` and send it back changed. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiUserSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiUserSettingsWrapper aiSettingsSetUser(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSettingsSetUserRequest;
    
    // verify the required parameter 'aiSettingsSetUserRequest' is set
    if (aiSettingsSetUserRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSettingsSetUserRequest' when calling aiSettingsSetUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/user";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiUserSettingsWrapper> localVarReturnType = new TypeReference<AiUserSettingsWrapper>() {};
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
   * Update vectorization settings
   * Replaces the portal's vectorization settings and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value is reported with that service's own verdict rather than being checked here. Changing the embedding provider does not re-index anything already indexed - start that separately with `POST api/2.0/ai/vectorization/tasks`. This is a portal-wide setting and requires the permissions the AI service demands for it.
   *
   * REST API Reference for aiSettingsSetVectorization Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/
   *
   * @param aiSettingsSetVectorizationRequest The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed. (required)
   * @return AiVectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiVectorizationSettingsWrapper aiSettingsSetVectorization(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetVectorizationRequest) throws ApiException {
    return this.aiSettingsSetVectorization(aiSettingsSetVectorizationRequest, Collections.emptyMap());
  }


  /**
   * Update vectorization settings
   * Replaces the portal's vectorization settings and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value is reported with that service's own verdict rather than being checked here. Changing the embedding provider does not re-index anything already indexed - start that separately with `POST api/2.0/ai/vectorization/tasks`. This is a portal-wide setting and requires the permissions the AI service demands for it.
   *
   * REST API Reference for aiSettingsSetVectorization Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/
   *
   * @param aiSettingsSetVectorizationRequest The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiVectorizationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AiVectorizationSettingsWrapper aiSettingsSetVectorization(@javax.annotation.Nonnull Map<String, Object> aiSettingsSetVectorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiSettingsSetVectorizationRequest;
    
    // verify the required parameter 'aiSettingsSetVectorizationRequest' is set
    if (aiSettingsSetVectorizationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiSettingsSetVectorizationRequest' when calling aiSettingsSetVectorization");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/config/vectorization";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiVectorizationSettingsWrapper> localVarReturnType = new TypeReference<AiVectorizationSettingsWrapper>() {};
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
