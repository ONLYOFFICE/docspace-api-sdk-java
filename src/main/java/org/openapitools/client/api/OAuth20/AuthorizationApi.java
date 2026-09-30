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
   * Start the authorization flow
   * Starts the OAuth2 authorization code flow for the client named by client_id. The caller has to present the portal signature cookie, and a request without a valid one is not refused with 401 or 403 but redirected to the portal login page, carrying the client ID so the flow can resume after signing in. When the user has not yet consented to the requested scopes the browser is redirected to the consent page; once the consent exists the browser is redirected to the client's redirect URI with the authorization code and, when one was sent, the original state. A caller that cannot follow redirects may send the X-Disable-Redirect header, and then the response is 200 with an empty body and the target URL in the X-Redirect-URI header. The code returned here is exchanged for tokens at the token endpoint.
   *
   * REST API Reference for authorizeOAuth Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
   *
   * @param responseType The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint. (required)
   * @param clientId The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against. (required)
   * @param redirectUri Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused. (required)
   * @param scope The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these. (required)
   * @throws ApiException if fails to make API call
   */
  public void authorizeOAuth(@javax.annotation.Nonnull String responseType, @javax.annotation.Nonnull String clientId, @javax.annotation.Nonnull String redirectUri, @javax.annotation.Nonnull String scope) throws ApiException {
    this.authorizeOAuth(responseType, clientId, redirectUri, scope, Collections.emptyMap());
  }


  /**
   * Start the authorization flow
   * Starts the OAuth2 authorization code flow for the client named by client_id. The caller has to present the portal signature cookie, and a request without a valid one is not refused with 401 or 403 but redirected to the portal login page, carrying the client ID so the flow can resume after signing in. When the user has not yet consented to the requested scopes the browser is redirected to the consent page; once the consent exists the browser is redirected to the client's redirect URI with the authorization code and, when one was sent, the original state. A caller that cannot follow redirects may send the X-Disable-Redirect header, and then the response is 200 with an empty body and the target URL in the X-Redirect-URI header. The code returned here is exchanged for tokens at the token endpoint.
   *
   * REST API Reference for authorizeOAuth Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
   *
   * @param responseType The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint. (required)
   * @param clientId The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against. (required)
   * @param redirectUri Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused. (required)
   * @param scope The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these. (required)
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
   * Exchange the authorization code
   * Exchanges an authorization code for an access token. The request is form-encoded and has to carry the grant type, the code, the same redirect URI that was used to obtain the code, and the client credentials: the client authenticates itself here rather than through the portal signature cookie the authorization endpoint uses. The response carries the access token, its type and its lifetime in seconds, plus a refresh token when the client is configured for the refresh token grant. Client authentication that fails is answered with 401, while a malformed, unknown or expired code is answered with 400. The code is single use, so replaying it fails.
   *
   * REST API Reference for exchangeToken Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
   *
   * @param grantType Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token. (optional)
   * @param code The authorization code returned by the authorization endpoint. It may be redeemed once. (optional)
   * @param redirectUri The same redirect URI that was used to obtain the code. The exchange fails when it differs. (optional)
   * @param clientId The identifier of the client redeeming the code. (optional)
   * @param clientSecret The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead. (optional)
   * @return ExchangeToken200Response
   * @throws ApiException if fails to make API call
   */
  public ExchangeToken200Response exchangeToken(@javax.annotation.Nullable String grantType, @javax.annotation.Nullable String code, @javax.annotation.Nullable String redirectUri, @javax.annotation.Nullable String clientId, @javax.annotation.Nullable String clientSecret) throws ApiException {
    return this.exchangeToken(grantType, code, redirectUri, clientId, clientSecret, Collections.emptyMap());
  }


  /**
   * Exchange the authorization code
   * Exchanges an authorization code for an access token. The request is form-encoded and has to carry the grant type, the code, the same redirect URI that was used to obtain the code, and the client credentials: the client authenticates itself here rather than through the portal signature cookie the authorization endpoint uses. The response carries the access token, its type and its lifetime in seconds, plus a refresh token when the client is configured for the refresh token grant. Client authentication that fails is answered with 401, while a malformed, unknown or expired code is answered with 400. The code is single use, so replaying it fails.
   *
   * REST API Reference for exchangeToken Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
   *
   * @param grantType Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token. (optional)
   * @param code The authorization code returned by the authorization endpoint. It may be redeemed once. (optional)
   * @param redirectUri The same redirect URI that was used to obtain the code. The exchange fails when it differs. (optional)
   * @param clientId The identifier of the client redeeming the code. (optional)
   * @param clientSecret The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead. (optional)
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
   * Submit the consent decision
   * Submits the user's consent decision for the scopes an authorization request asked for. It is the form post the consent page makes, so it carries the client ID, the state and the agreed scopes as multipart form data, along with the same portal signature cookie the authorization request needed. On success the browser is redirected to the client's redirect URI with an authorization code, or, when the request carries the X-Disable-Redirect header, answered 200 with that URL in the X-Redirect-URI header. The consent is stored per user and client, so a later authorization request for the same scopes no longer stops at the consent page.
   *
   * REST API Reference for submitConsent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
   *
   * @param clientId The client the consent is being given to. It has to be the same client the authorization request named. (optional)
   * @param state The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request. (optional)
   * @param scope The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested. (optional)
   * @throws ApiException if fails to make API call
   */
  public void submitConsent(@javax.annotation.Nullable String clientId, @javax.annotation.Nullable String state, @javax.annotation.Nullable String scope) throws ApiException {
    this.submitConsent(clientId, state, scope, Collections.emptyMap());
  }


  /**
   * Submit the consent decision
   * Submits the user's consent decision for the scopes an authorization request asked for. It is the form post the consent page makes, so it carries the client ID, the state and the agreed scopes as multipart form data, along with the same portal signature cookie the authorization request needed. On success the browser is redirected to the client's redirect URI with an authorization code, or, when the request carries the X-Disable-Redirect header, answered 200 with that URL in the X-Redirect-URI header. The consent is stored per user and client, so a later authorization request for the same scopes no longer stops at the consent page.
   *
   * REST API Reference for submitConsent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
   *
   * @param clientId The client the consent is being given to. It has to be the same client the authorization request named. (optional)
   * @param state The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request. (optional)
   * @param scope The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested. (optional)
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

    String[] localVarAuthNames = new String[] { "x-signature" };

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

    String[] localVarAuthNames = new String[] { "x-signature" };

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
