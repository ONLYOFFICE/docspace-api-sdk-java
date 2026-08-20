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

package org.openapitools.client.api.Authentication;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AuthRequestsDto;
import org.openapitools.client.model.AuthWithCodeRequestsDto;
import org.openapitools.client.model.AuthenticationTokenWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ConfirmWrapper;
import org.openapitools.client.model.EmailValidationKeyModel;
import org.openapitools.client.model.MobileRequestsDto;
import org.openapitools.client.model.StringWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AuthenticationApi extends BaseApi {

  public AuthenticationApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Authenticate a user
   * Authenticates the current user by SMS, authenticator app, or without two-factor authentication.
   *
   * REST API Reference for authenticateMe Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me/
   *
   * @param authRequestsDto  (optional)
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper authenticateMe(@javax.annotation.Nullable AuthRequestsDto authRequestsDto) throws ApiException {
    return this.authenticateMe(authRequestsDto, Collections.emptyMap());
  }


  /**
   * Authenticate a user
   * Authenticates the current user by SMS, authenticator app, or without two-factor authentication.
   *
   * REST API Reference for authenticateMe Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me/
   *
   * @param authRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper authenticateMe(@javax.annotation.Nullable AuthRequestsDto authRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication";

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

    TypeReference<AuthenticationTokenWrapper> localVarReturnType = new TypeReference<AuthenticationTokenWrapper>() {};
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
   * Authenticate a user by code
   * Authenticates the current user by SMS or two-factor authentication code.
   *
   * REST API Reference for authenticateMeFromBodyWithCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/
   *
   * @param code  (required)
   * @param authWithCodeRequestsDto  (optional)
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper authenticateMeFromBodyWithCode(@javax.annotation.Nonnull String code, @javax.annotation.Nullable AuthWithCodeRequestsDto authWithCodeRequestsDto) throws ApiException {
    return this.authenticateMeFromBodyWithCode(code, authWithCodeRequestsDto, Collections.emptyMap());
  }


  /**
   * Authenticate a user by code
   * Authenticates the current user by SMS or two-factor authentication code.
   *
   * REST API Reference for authenticateMeFromBodyWithCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/
   *
   * @param code  (required)
   * @param authWithCodeRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper authenticateMeFromBodyWithCode(@javax.annotation.Nonnull String code, @javax.annotation.Nullable AuthWithCodeRequestsDto authWithCodeRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authWithCodeRequestsDto;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling authenticateMeFromBodyWithCode");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(apiClient.parameterToString(code)));

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

    TypeReference<AuthenticationTokenWrapper> localVarReturnType = new TypeReference<AuthenticationTokenWrapper>() {};
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
   * Open confirmation email URL
   * Opens a confirmation email URL to validate a certain action (employee invitation, portal removal, phone activation, etc.).
   *
   * REST API Reference for checkConfirm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-confirm/
   *
   * @param emailValidationKeyModel  (optional)
   * @return ConfirmWrapper
   * @throws ApiException if fails to make API call
   */
  public ConfirmWrapper checkConfirm(@javax.annotation.Nullable EmailValidationKeyModel emailValidationKeyModel) throws ApiException {
    return this.checkConfirm(emailValidationKeyModel, Collections.emptyMap());
  }


  /**
   * Open confirmation email URL
   * Opens a confirmation email URL to validate a certain action (employee invitation, portal removal, phone activation, etc.).
   *
   * REST API Reference for checkConfirm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-confirm/
   *
   * @param emailValidationKeyModel  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConfirmWrapper
   * @throws ApiException if fails to make API call
   */
  public ConfirmWrapper checkConfirm(@javax.annotation.Nullable EmailValidationKeyModel emailValidationKeyModel, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = emailValidationKeyModel;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication/confirm";

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

    TypeReference<ConfirmWrapper> localVarReturnType = new TypeReference<ConfirmWrapper>() {};
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
   * Check authentication
   * Checks if the current user is authenticated or not.
   *
   * REST API Reference for getIsAuthentificated Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-authentificated/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getIsAuthentificated() throws ApiException {
    return this.getIsAuthentificated(Collections.emptyMap());
  }


  /**
   * Check authentication
   * Checks if the current user is authenticated or not.
   *
   * REST API Reference for getIsAuthentificated Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-authentificated/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getIsAuthentificated(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Log out
   * Logs out of the current user account.
   *
   * REST API Reference for logout Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/logout/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logout() throws ApiException {
    return this.logout(Collections.emptyMap());
  }


  /**
   * Log out
   * Logs out of the current user account.
   *
   * REST API Reference for logout Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/logout/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper logout(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication/logout";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Set a mobile phone
   * Sets a mobile phone for the current user.
   *
   * REST API Reference for saveMobilePhone Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mobile-phone/
   *
   * @param mobileRequestsDto  (optional)
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper saveMobilePhone(@javax.annotation.Nullable MobileRequestsDto mobileRequestsDto) throws ApiException {
    return this.saveMobilePhone(mobileRequestsDto, Collections.emptyMap());
  }


  /**
   * Set a mobile phone
   * Sets a mobile phone for the current user.
   *
   * REST API Reference for saveMobilePhone Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mobile-phone/
   *
   * @param mobileRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper saveMobilePhone(@javax.annotation.Nullable MobileRequestsDto mobileRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = mobileRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication/setphone";

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

    TypeReference<AuthenticationTokenWrapper> localVarReturnType = new TypeReference<AuthenticationTokenWrapper>() {};
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
   * Send SMS code
   * Sends SMS with an authentication code.
   *
   * REST API Reference for sendSmsCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-sms-code/
   *
   * @param authRequestsDto  (optional)
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper sendSmsCode(@javax.annotation.Nullable AuthRequestsDto authRequestsDto) throws ApiException {
    return this.sendSmsCode(authRequestsDto, Collections.emptyMap());
  }


  /**
   * Send SMS code
   * Sends SMS with an authentication code.
   *
   * REST API Reference for sendSmsCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-sms-code/
   *
   * @param authRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthenticationTokenWrapper
   * @throws ApiException if fails to make API call
   */
  public AuthenticationTokenWrapper sendSmsCode(@javax.annotation.Nullable AuthRequestsDto authRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/authentication/sendsms";

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

    TypeReference<AuthenticationTokenWrapper> localVarReturnType = new TypeReference<AuthenticationTokenWrapper>() {};
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
