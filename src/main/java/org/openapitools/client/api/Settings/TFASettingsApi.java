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

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ObjectArrayWrapper;
import org.openapitools.client.model.SetupCodeWrapper;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TfaRequestsDto;
import org.openapitools.client.model.TfaSettingsArrayWrapper;
import org.openapitools.client.model.TfaValidateRequestsDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class TFASettingsApi extends BaseApi {

  public TFASettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public TFASettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the TFA codes
   * Returns the two-factor authentication application codes.
   *
   * REST API Reference for getTfaAppCodes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-app-codes/
   *
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getTfaAppCodes() throws ApiException {
    return this.getTfaAppCodes(Collections.emptyMap());
  }


  /**
   * Get the TFA codes
   * Returns the two-factor authentication application codes.
   *
   * REST API Reference for getTfaAppCodes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-app-codes/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getTfaAppCodes(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaappcodes";

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

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * Get confirmation email
   * Returns the confirmation email URL for authorization via SMS or TFA application.
   *
   * REST API Reference for getTfaConfirmUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-confirm-url/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getTfaConfirmUrl() throws ApiException {
    return this.getTfaConfirmUrl(Collections.emptyMap());
  }


  /**
   * Get confirmation email
   * Returns the confirmation email URL for authorization via SMS or TFA application.
   *
   * REST API Reference for getTfaConfirmUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-confirm-url/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getTfaConfirmUrl(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaapp/confirm";

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Get the TFA settings
   * Returns the current two-factor authentication settings.
   *
   * REST API Reference for getTfaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-settings/
   *
   * @return TfaSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public TfaSettingsArrayWrapper getTfaSettings() throws ApiException {
    return this.getTfaSettings(Collections.emptyMap());
  }


  /**
   * Get the TFA settings
   * Returns the current two-factor authentication settings.
   *
   * REST API Reference for getTfaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TfaSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public TfaSettingsArrayWrapper getTfaSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaapp";

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

    TypeReference<TfaSettingsArrayWrapper> localVarReturnType = new TypeReference<TfaSettingsArrayWrapper>() {};
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
   * Generate setup code
   * Generates the setup TFA code for the current user.
   *
   * REST API Reference for tfaAppGenerateSetupCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-app-generate-setup-code/
   *
   * @return SetupCodeWrapper
   * @throws ApiException if fails to make API call
   */
  public SetupCodeWrapper tfaAppGenerateSetupCode() throws ApiException {
    return this.tfaAppGenerateSetupCode(Collections.emptyMap());
  }


  /**
   * Generate setup code
   * Generates the setup TFA code for the current user.
   *
   * REST API Reference for tfaAppGenerateSetupCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-app-generate-setup-code/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SetupCodeWrapper
   * @throws ApiException if fails to make API call
   */
  public SetupCodeWrapper tfaAppGenerateSetupCode(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaapp/setup";

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

    TypeReference<SetupCodeWrapper> localVarReturnType = new TypeReference<SetupCodeWrapper>() {};
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
   * Validate the TFA code
   * Validates the two-factor authentication code specified in the request.
   *
   * REST API Reference for tfaValidateAuthCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-validate-auth-code/
   *
   * @param tfaValidateRequestsDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper tfaValidateAuthCode(@javax.annotation.Nullable TfaValidateRequestsDto tfaValidateRequestsDto) throws ApiException {
    return this.tfaValidateAuthCode(tfaValidateRequestsDto, Collections.emptyMap());
  }


  /**
   * Validate the TFA code
   * Validates the two-factor authentication code specified in the request.
   *
   * REST API Reference for tfaValidateAuthCode Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-validate-auth-code/
   *
   * @param tfaValidateRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper tfaValidateAuthCode(@javax.annotation.Nullable TfaValidateRequestsDto tfaValidateRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tfaValidateRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaapp/validate";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Unlink the TFA application
   * Unlinks the current two-factor authentication application from the user account specified in the request.
   *
   * REST API Reference for unlinkTfaApp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-tfa-app/
   *
   * @param tfaRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper unlinkTfaApp(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto) throws ApiException {
    return this.unlinkTfaApp(tfaRequestsDto, Collections.emptyMap());
  }


  /**
   * Unlink the TFA application
   * Unlinks the current two-factor authentication application from the user account specified in the request.
   *
   * REST API Reference for unlinkTfaApp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-tfa-app/
   *
   * @param tfaRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper unlinkTfaApp(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tfaRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaappnewapp";

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Update the TFA codes
   * Requests the new backup codes for the two-factor authentication application.
   *
   * REST API Reference for updateTfaAppCodes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-app-codes/
   *
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper updateTfaAppCodes() throws ApiException {
    return this.updateTfaAppCodes(Collections.emptyMap());
  }


  /**
   * Update the TFA codes
   * Requests the new backup codes for the two-factor authentication application.
   *
   * REST API Reference for updateTfaAppCodes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-app-codes/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper updateTfaAppCodes(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaappnewcodes";

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

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * Update the TFA settings
   * Updates the two-factor authentication settings with the parameters specified in the request.
   *
   * REST API Reference for updateTfaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings/
   *
   * @param tfaRequestsDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateTfaSettings(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto) throws ApiException {
    return this.updateTfaSettings(tfaRequestsDto, Collections.emptyMap());
  }


  /**
   * Update the TFA settings
   * Updates the two-factor authentication settings with the parameters specified in the request.
   *
   * REST API Reference for updateTfaSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings/
   *
   * @param tfaRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateTfaSettings(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tfaRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaapp";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Get a confirmation email for updating TFA settings
   * Returns the confirmation email URL for updating TFA settings.
   *
   * REST API Reference for updateTfaSettingsLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings-link/
   *
   * @param tfaRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateTfaSettingsLink(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto) throws ApiException {
    return this.updateTfaSettingsLink(tfaRequestsDto, Collections.emptyMap());
  }


  /**
   * Get a confirmation email for updating TFA settings
   * Returns the confirmation email URL for updating TFA settings.
   *
   * REST API Reference for updateTfaSettingsLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings-link/
   *
   * @param tfaRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateTfaSettingsLink(@javax.annotation.Nullable TfaRequestsDto tfaRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tfaRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/tfaappwithlink";

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
