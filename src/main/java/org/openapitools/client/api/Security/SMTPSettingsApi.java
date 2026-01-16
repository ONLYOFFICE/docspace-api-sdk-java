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

package org.openapitools.client.api.Security;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.SmtpOperationStatusRequestsWrapper;
import org.openapitools.client.model.SmtpSettingsDto;
import org.openapitools.client.model.SmtpSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SMTPSettingsApi extends BaseApi {

  public SMTPSettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SMTPSettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the SMTP testing process status
   * Returns the status of the SMTP testing process.
   *
   * REST API Reference for getSmtpOperationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-operation-status/
   *
   * @return SmtpOperationStatusRequestsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpOperationStatusRequestsWrapper getSmtpOperationStatus() throws ApiException {
    return this.getSmtpOperationStatus(Collections.emptyMap());
  }


  /**
   * Get the SMTP testing process status
   * Returns the status of the SMTP testing process.
   *
   * REST API Reference for getSmtpOperationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-operation-status/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SmtpOperationStatusRequestsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpOperationStatusRequestsWrapper getSmtpOperationStatus(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/smtpsettings/smtp/test/status";

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

    TypeReference<SmtpOperationStatusRequestsWrapper> localVarReturnType = new TypeReference<SmtpOperationStatusRequestsWrapper>() {};
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
   * Get the SMTP settings
   * Returns the current portal SMTP settings.
   *
   * REST API Reference for getSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-settings/
   *
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper getSmtpSettings() throws ApiException {
    return this.getSmtpSettings(Collections.emptyMap());
  }


  /**
   * Get the SMTP settings
   * Returns the current portal SMTP settings.
   *
   * REST API Reference for getSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper getSmtpSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/smtpsettings/smtp";

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

    TypeReference<SmtpSettingsWrapper> localVarReturnType = new TypeReference<SmtpSettingsWrapper>() {};
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
   * Reset the SMTP settings
   * Resets the SMTP settings of the current portal.
   *
   * REST API Reference for resetSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-smtp-settings/
   *
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper resetSmtpSettings() throws ApiException {
    return this.resetSmtpSettings(Collections.emptyMap());
  }


  /**
   * Reset the SMTP settings
   * Resets the SMTP settings of the current portal.
   *
   * REST API Reference for resetSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-smtp-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper resetSmtpSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/smtpsettings/smtp";

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

    TypeReference<SmtpSettingsWrapper> localVarReturnType = new TypeReference<SmtpSettingsWrapper>() {};
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
   * Save the SMTP settings
   * Saves the SMTP settings for the current portal.
   *
   * REST API Reference for saveSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-smtp-settings/
   *
   * @param smtpSettingsDto  (optional)
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper saveSmtpSettings(@javax.annotation.Nullable SmtpSettingsDto smtpSettingsDto) throws ApiException {
    return this.saveSmtpSettings(smtpSettingsDto, Collections.emptyMap());
  }


  /**
   * Save the SMTP settings
   * Saves the SMTP settings for the current portal.
   *
   * REST API Reference for saveSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-smtp-settings/
   *
   * @param smtpSettingsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SmtpSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpSettingsWrapper saveSmtpSettings(@javax.annotation.Nullable SmtpSettingsDto smtpSettingsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = smtpSettingsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/smtpsettings/smtp";

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

    TypeReference<SmtpSettingsWrapper> localVarReturnType = new TypeReference<SmtpSettingsWrapper>() {};
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
   * Test the SMTP settings
   * Tests the SMTP settings for the current portal (sends test message to the user email).
   *
   * REST API Reference for testSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/test-smtp-settings/
   *
   * @return SmtpOperationStatusRequestsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpOperationStatusRequestsWrapper testSmtpSettings() throws ApiException {
    return this.testSmtpSettings(Collections.emptyMap());
  }


  /**
   * Test the SMTP settings
   * Tests the SMTP settings for the current portal (sends test message to the user email).
   *
   * REST API Reference for testSmtpSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/test-smtp-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SmtpOperationStatusRequestsWrapper
   * @throws ApiException if fails to make API call
   */
  public SmtpOperationStatusRequestsWrapper testSmtpSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/smtpsettings/smtp/test";

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

    TypeReference<SmtpOperationStatusRequestsWrapper> localVarReturnType = new TypeReference<SmtpOperationStatusRequestsWrapper>() {};
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
