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

import org.openapitools.client.model.AccountInfoArrayWrapper;
import org.openapitools.client.model.EmployeeWrapper;
import org.openapitools.client.model.LinkAccountRequestDto;
import org.openapitools.client.model.SignupAccountRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ThirdPartyAccountsApi extends BaseApi {

  public ThirdPartyAccountsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ThirdPartyAccountsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get third-party accounts
   * Returns a list of the available third-party accounts.
   *
   * REST API Reference for getThirdPartyAuthProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/
   *
   * @param inviteView Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers. (optional)
   * @param settingsView Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false). (optional)
   * @param clientCallback The method that is called after authentication. (optional)
   * @param fromOnly The provider name if a response is required only from this provider. (optional)
   * @return AccountInfoArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AccountInfoArrayWrapper getThirdPartyAuthProviders(@javax.annotation.Nullable Boolean inviteView, @javax.annotation.Nullable Boolean settingsView, @javax.annotation.Nullable String clientCallback, @javax.annotation.Nullable String fromOnly) throws ApiException {
    return this.getThirdPartyAuthProviders(inviteView, settingsView, clientCallback, fromOnly, Collections.emptyMap());
  }


  /**
   * Get third-party accounts
   * Returns a list of the available third-party accounts.
   *
   * REST API Reference for getThirdPartyAuthProviders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/
   *
   * @param inviteView Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers. (optional)
   * @param settingsView Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false). (optional)
   * @param clientCallback The method that is called after authentication. (optional)
   * @param fromOnly The provider name if a response is required only from this provider. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AccountInfoArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AccountInfoArrayWrapper getThirdPartyAuthProviders(@javax.annotation.Nullable Boolean inviteView, @javax.annotation.Nullable Boolean settingsView, @javax.annotation.Nullable String clientCallback, @javax.annotation.Nullable String fromOnly, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/thirdparty/providers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("inviteView", inviteView));
    localVarQueryParams.addAll(apiClient.parameterToPair("settingsView", settingsView));
    localVarQueryParams.addAll(apiClient.parameterToPair("clientCallback", clientCallback));
    localVarQueryParams.addAll(apiClient.parameterToPair("fromOnly", fromOnly));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AccountInfoArrayWrapper> localVarReturnType = new TypeReference<AccountInfoArrayWrapper>() {};
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
   * Link a third-pary account
   * Links a third-party account specified in the request to the user profile.
   *
   * REST API Reference for linkThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/
   *
   * @param linkAccountRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void linkThirdPartyAccount(@javax.annotation.Nullable LinkAccountRequestDto linkAccountRequestDto) throws ApiException {
    this.linkThirdPartyAccount(linkAccountRequestDto, Collections.emptyMap());
  }


  /**
   * Link a third-pary account
   * Links a third-party account specified in the request to the user profile.
   *
   * REST API Reference for linkThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/
   *
   * @param linkAccountRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void linkThirdPartyAccount(@javax.annotation.Nullable LinkAccountRequestDto linkAccountRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = linkAccountRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/thirdparty/linkaccount";

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

  /**
   * Create a third-pary account
   * Creates a third-party account with the parameters specified in the request.
   *
   * REST API Reference for signupThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/
   *
   * @param signupAccountRequestDto  (optional)
   * @return EmployeeWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeWrapper signupThirdPartyAccount(@javax.annotation.Nullable SignupAccountRequestDto signupAccountRequestDto) throws ApiException {
    return this.signupThirdPartyAccount(signupAccountRequestDto, Collections.emptyMap());
  }


  /**
   * Create a third-pary account
   * Creates a third-party account with the parameters specified in the request.
   *
   * REST API Reference for signupThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/
   *
   * @param signupAccountRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeWrapper signupThirdPartyAccount(@javax.annotation.Nullable SignupAccountRequestDto signupAccountRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = signupAccountRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/thirdparty/signup";

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

    TypeReference<EmployeeWrapper> localVarReturnType = new TypeReference<EmployeeWrapper>() {};
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
   * Unlink a third-pary account
   * Unlinks a third-party account specified in the request from the user profile.
   *
   * REST API Reference for unlinkThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/
   *
   * @param provider The provider name. (optional)
   * @throws ApiException if fails to make API call
   */
  public void unlinkThirdPartyAccount(@javax.annotation.Nullable String provider) throws ApiException {
    this.unlinkThirdPartyAccount(provider, Collections.emptyMap());
  }


  /**
   * Unlink a third-pary account
   * Unlinks a third-party account specified in the request from the user profile.
   *
   * REST API Reference for unlinkThirdPartyAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/
   *
   * @param provider The provider name. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void unlinkThirdPartyAccount(@javax.annotation.Nullable String provider, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/thirdparty/unlinkaccount";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("provider", provider));
      
    
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
