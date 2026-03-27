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

package org.openapitools.client.api.OAuth20;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ExchangeToken200Response;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AuthorizationApi extends BaseApi {

  public AuthorizationApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AuthorizationApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * OAuth2 authorization endpoint
   * Initiates the OAuth2 authorization flow.
   *
   * REST API Reference for authorizeOAuth Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
   *
   * @param responseType The OAuth 2.0 response type, must be 'code' for authorization code flow. (required)
   * @param clientId The client identifier issued to the client during registration. (required)
   * @param redirectUri The URL to redirect to after authorization is complete. (required)
   * @param scope The space-separated list of requested scope permissions. (required)
   * @throws ApiException if fails to make API call
   */
  public void authorizeOAuth(@javax.annotation.Nonnull String responseType, @javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull String redirectUri, @javax.annotation.Nonnull String scope) throws ApiException {
    this.authorizeOAuth(responseType, clientId, redirectUri, scope, Collections.emptyMap());
  }


  /**
   * OAuth2 authorization endpoint
   * Initiates the OAuth2 authorization flow.
   *
   * REST API Reference for authorizeOAuth Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
   *
   * @param responseType The OAuth 2.0 response type, must be 'code' for authorization code flow. (required)
   * @param clientId The client identifier issued to the client during registration. (required)
   * @param redirectUri The URL to redirect to after authorization is complete. (required)
   * @param scope The space-separated list of requested scope permissions. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void authorizeOAuth(@javax.annotation.Nonnull String responseType, @javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull String redirectUri, @javax.annotation.Nonnull String scope, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
      throw new ApiException(400, "Missing the required parameter 'responseType' when calling authorizeOAuth");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling authorizeOAuth");
    }
    
    // verify the required parameter 'redirectUri' is set
    if (redirectUri == null) {
      throw new ApiException(400, "Missing the required parameter 'redirectUri' when calling authorizeOAuth");
    }
    
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling authorizeOAuth");
    }
    
    // create path and map variables
    String localVarPath = "/oauth2/authorize";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("response_type", responseType));
    localVarQueryParams.addAll(apiClient.parameterToPair("client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
    localVarQueryParams.addAll(apiClient.parameterToPair("scope", scope));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * OAuth2 token endpoint
   * Exchanges an authorization code specified in the request for the access token.
   *
   * REST API Reference for exchangeToken Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
   *
   * @param grantType The OAuth2 grant type, must be 'authorization_code' for the authorization code flow. (optional)
   * @param code A temporary authorization code that is sent to the client to be exchanged for a token. (optional)
   * @param redirectUri The URL where the user will be redirected after successful or unsuccessful authentication. (optional)
   * @param clientId The client identifier issued to the client during registration. (optional)
   * @param clientSecret The client secret issued to the client during registration. (optional)
   * @return ExchangeToken200Response
   * @throws ApiException if fails to make API call
   */
  public ExchangeToken200Response exchangeToken(@javax.annotation.Nullable String grantType, @javax.annotation.Nullable String code, @javax.annotation.Nullable String redirectUri, @javax.annotation.Nullable String clientId, @javax.annotation.Nullable String clientSecret) throws ApiException {
    return this.exchangeToken(grantType, code, redirectUri, clientId, clientSecret, Collections.emptyMap());
  }


  /**
   * OAuth2 token endpoint
   * Exchanges an authorization code specified in the request for the access token.
   *
   * REST API Reference for exchangeToken Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
   *
   * @param grantType The OAuth2 grant type, must be 'authorization_code' for the authorization code flow. (optional)
   * @param code A temporary authorization code that is sent to the client to be exchanged for a token. (optional)
   * @param redirectUri The URL where the user will be redirected after successful or unsuccessful authentication. (optional)
   * @param clientId The client identifier issued to the client during registration. (optional)
   * @param clientSecret The client secret issued to the client during registration. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ExchangeToken200Response
   * @throws ApiException if fails to make API call
   */
  public ExchangeToken200Response exchangeToken(@javax.annotation.Nullable String grantType, @javax.annotation.Nullable String code, @javax.annotation.Nullable String redirectUri, @javax.annotation.Nullable String clientId, @javax.annotation.Nullable String clientSecret, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/oauth2/token";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (grantType != null)
      localVarFormParams.put("grant_type", grantType);
if (code != null)
      localVarFormParams.put("code", code);
if (redirectUri != null)
      localVarFormParams.put("redirect_uri", redirectUri);
if (clientId != null)
      localVarFormParams.put("client_id", clientId);
if (clientSecret != null)
      localVarFormParams.put("client_secret", clientSecret);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ExchangeToken200Response> localVarReturnType = new TypeReference<ExchangeToken200Response>() {};
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
   * OAuth2 consent endpoint
   * Sends a consent request with the specified parameters.
   *
   * REST API Reference for submitConsent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
   *
   * @param clientId The client identifier issued to the client during registration. (optional)
   * @param state The random string used to solve the CSRF vulnerability problem. (optional)
   * @param scope The space-separated list of requested scope permissions. (optional)
   * @throws ApiException if fails to make API call
   */
  public void submitConsent(@javax.annotation.Nullable String clientId, @javax.annotation.Nullable String state, @javax.annotation.Nullable String scope) throws ApiException {
    this.submitConsent(clientId, state, scope, Collections.emptyMap());
  }


  /**
   * OAuth2 consent endpoint
   * Sends a consent request with the specified parameters.
   *
   * REST API Reference for submitConsent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
   *
   * @param clientId The client identifier issued to the client during registration. (optional)
   * @param state The random string used to solve the CSRF vulnerability problem. (optional)
   * @param scope The space-separated list of requested scope permissions. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void submitConsent(@javax.annotation.Nullable String clientId, @javax.annotation.Nullable String state, @javax.annotation.Nullable String scope, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/oauth2/authorize";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (clientId != null)
      localVarFormParams.put("client_id", clientId);
if (state != null)
      localVarFormParams.put("state", state);
if (scope != null)
      localVarFormParams.put("scope", scope);

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

    apiClient.invokeAPI(
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
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "asc_auth_key" };

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
