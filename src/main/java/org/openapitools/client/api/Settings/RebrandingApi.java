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

import org.openapitools.client.model.AdditionalWhiteLabelSettingsWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CompanyWhiteLabelSettingsArrayWrapper;
import org.openapitools.client.model.CompanyWhiteLabelSettingsWrapper;
import org.openapitools.client.model.IsDefaultWhiteLabelLogosArrayWrapper;
import org.openapitools.client.model.IsDefaultWhiteLabelLogosWrapper;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.WhiteLabelItemArrayWrapper;
import org.openapitools.client.model.WhiteLabelRequestsDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class RebrandingApi extends BaseApi {

  public RebrandingApi() {
    super(Configuration.getDefaultApiClient());
  }

  public RebrandingApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Delete the additional white label settings
   * Deletes the additional white label settings.
   *
   * REST API Reference for deleteAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-additional-white-label-settings/
   *
   * @return AdditionalWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AdditionalWhiteLabelSettingsWrapper deleteAdditionalWhiteLabelSettings() throws ApiException {
    return this.deleteAdditionalWhiteLabelSettings(Collections.emptyMap());
  }


  /**
   * Delete the additional white label settings
   * Deletes the additional white label settings.
   *
   * REST API Reference for deleteAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-additional-white-label-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AdditionalWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AdditionalWhiteLabelSettingsWrapper deleteAdditionalWhiteLabelSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/additional";

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

    TypeReference<AdditionalWhiteLabelSettingsWrapper> localVarReturnType = new TypeReference<AdditionalWhiteLabelSettingsWrapper>() {};
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
   * Delete the company white label settings
   * Deletes the company white label settings.
   *
   * REST API Reference for deleteCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-company-white-label-settings/
   *
   * @return CompanyWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsWrapper deleteCompanyWhiteLabelSettings() throws ApiException {
    return this.deleteCompanyWhiteLabelSettings(Collections.emptyMap());
  }


  /**
   * Delete the company white label settings
   * Deletes the company white label settings.
   *
   * REST API Reference for deleteCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-company-white-label-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CompanyWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsWrapper deleteCompanyWhiteLabelSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/company";

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

    TypeReference<CompanyWhiteLabelSettingsWrapper> localVarReturnType = new TypeReference<CompanyWhiteLabelSettingsWrapper>() {};
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
   * Get the additional white label settings
   * Returns the additional white label settings.
   *
   * REST API Reference for getAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-additional-white-label-settings/
   *
   * @return AdditionalWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AdditionalWhiteLabelSettingsWrapper getAdditionalWhiteLabelSettings() throws ApiException {
    return this.getAdditionalWhiteLabelSettings(Collections.emptyMap());
  }


  /**
   * Get the additional white label settings
   * Returns the additional white label settings.
   *
   * REST API Reference for getAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-additional-white-label-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AdditionalWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public AdditionalWhiteLabelSettingsWrapper getAdditionalWhiteLabelSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/additional";

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

    TypeReference<AdditionalWhiteLabelSettingsWrapper> localVarReturnType = new TypeReference<AdditionalWhiteLabelSettingsWrapper>() {};
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
   * Get the company white label settings
   * Returns the company white label settings.
   *
   * REST API Reference for getCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-company-white-label-settings/
   *
   * @return CompanyWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsWrapper getCompanyWhiteLabelSettings() throws ApiException {
    return this.getCompanyWhiteLabelSettings(Collections.emptyMap());
  }


  /**
   * Get the company white label settings
   * Returns the company white label settings.
   *
   * REST API Reference for getCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-company-white-label-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CompanyWhiteLabelSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsWrapper getCompanyWhiteLabelSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/company";

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

    TypeReference<CompanyWhiteLabelSettingsWrapper> localVarReturnType = new TypeReference<CompanyWhiteLabelSettingsWrapper>() {};
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
   * Check the white label availability
   * Checks if the white label is enabled or not.
   *
   * REST API Reference for getEnableWhitelabel Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enable-whitelabel/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getEnableWhitelabel() throws ApiException {
    return this.getEnableWhitelabel(Collections.emptyMap());
  }


  /**
   * Check the white label availability
   * Checks if the white label is enabled or not.
   *
   * REST API Reference for getEnableWhitelabel Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enable-whitelabel/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getEnableWhitelabel(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/enablewhitelabel";

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
   * Check the default white label logo text
   * Specifies if the white label logo text is default or not.
   *
   * REST API Reference for getIsDefaultWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return IsDefaultWhiteLabelLogosWrapper
   * @throws ApiException if fails to make API call
   */
  public IsDefaultWhiteLabelLogosWrapper getIsDefaultWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.getIsDefaultWhiteLabelLogoText(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Check the default white label logo text
   * Specifies if the white label logo text is default or not.
   *
   * REST API Reference for getIsDefaultWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return IsDefaultWhiteLabelLogosWrapper
   * @throws ApiException if fails to make API call
   */
  public IsDefaultWhiteLabelLogosWrapper getIsDefaultWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logotext/isdefault";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<IsDefaultWhiteLabelLogosWrapper> localVarReturnType = new TypeReference<IsDefaultWhiteLabelLogosWrapper>() {};
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
   * Check the default white label logos
   * Specifies if the white label logos are default or not.
   *
   * REST API Reference for getIsDefaultWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return IsDefaultWhiteLabelLogosArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public IsDefaultWhiteLabelLogosArrayWrapper getIsDefaultWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.getIsDefaultWhiteLabelLogos(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Check the default white label logos
   * Specifies if the white label logos are default or not.
   *
   * REST API Reference for getIsDefaultWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return IsDefaultWhiteLabelLogosArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public IsDefaultWhiteLabelLogosArrayWrapper getIsDefaultWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logos/isdefault";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<IsDefaultWhiteLabelLogosArrayWrapper> localVarReturnType = new TypeReference<IsDefaultWhiteLabelLogosArrayWrapper>() {};
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
   * Get the licensor data
   * Returns the licensor data.
   *
   * REST API Reference for getLicensorData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-licensor-data/
   *
   * @return CompanyWhiteLabelSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsArrayWrapper getLicensorData() throws ApiException {
    return this.getLicensorData(Collections.emptyMap());
  }


  /**
   * Get the licensor data
   * Returns the licensor data.
   *
   * REST API Reference for getLicensorData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-licensor-data/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CompanyWhiteLabelSettingsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CompanyWhiteLabelSettingsArrayWrapper getLicensorData(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/companywhitelabel";

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

    TypeReference<CompanyWhiteLabelSettingsArrayWrapper> localVarReturnType = new TypeReference<CompanyWhiteLabelSettingsArrayWrapper>() {};
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
   * Get the white label logo text
   * Returns the white label logo text.
   *
   * REST API Reference for getWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.getWhiteLabelLogoText(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Get the white label logo text
   * Returns the white label logo text.
   *
   * REST API Reference for getWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logotext";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
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
   * Get the white label logos
   * Returns the white label logos.
   *
   * REST API Reference for getWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return WhiteLabelItemArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WhiteLabelItemArrayWrapper getWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.getWhiteLabelLogos(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Get the white label logos
   * Returns the white label logos.
   *
   * REST API Reference for getWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WhiteLabelItemArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WhiteLabelItemArrayWrapper getWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logos";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<WhiteLabelItemArrayWrapper> localVarReturnType = new TypeReference<WhiteLabelItemArrayWrapper>() {};
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
   * Restore the white label logo text
   * Restores the white label logo text.
   *
   * REST API Reference for restoreWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper restoreWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.restoreWhiteLabelLogoText(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Restore the white label logo text
   * Restores the white label logo text.
   *
   * REST API Reference for restoreWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper restoreWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logotext/restore";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
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
   * Restore the white label logos
   * Restores the white label logos.
   *
   * REST API Reference for restoreWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper restoreWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.restoreWhiteLabelLogos(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Restore the white label logos
   * Restores the white label logos.
   *
   * REST API Reference for restoreWhiteLabelLogos Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logos/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper restoreWhiteLabelLogos(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logos/restore";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
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
   * Save the additional white label settings
   * Saves the additional white label settings specified in the request.
   *
   * REST API Reference for saveAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-additional-white-label-settings/
   *
   * @param additionalWhiteLabelSettingsWrapper  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveAdditionalWhiteLabelSettings(@javax.annotation.Nullable AdditionalWhiteLabelSettingsWrapper additionalWhiteLabelSettingsWrapper) throws ApiException {
    return this.saveAdditionalWhiteLabelSettings(additionalWhiteLabelSettingsWrapper, Collections.emptyMap());
  }


  /**
   * Save the additional white label settings
   * Saves the additional white label settings specified in the request.
   *
   * REST API Reference for saveAdditionalWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-additional-white-label-settings/
   *
   * @param additionalWhiteLabelSettingsWrapper  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveAdditionalWhiteLabelSettings(@javax.annotation.Nullable AdditionalWhiteLabelSettingsWrapper additionalWhiteLabelSettingsWrapper, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = additionalWhiteLabelSettingsWrapper;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/additional";

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
   * Save the company white label settings
   * Saves the company white label settings specified in the request.
   *
   * REST API Reference for saveCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-company-white-label-settings/
   *
   * @param companyWhiteLabelSettingsWrapper  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveCompanyWhiteLabelSettings(@javax.annotation.Nullable CompanyWhiteLabelSettingsWrapper companyWhiteLabelSettingsWrapper) throws ApiException {
    return this.saveCompanyWhiteLabelSettings(companyWhiteLabelSettingsWrapper, Collections.emptyMap());
  }


  /**
   * Save the company white label settings
   * Saves the company white label settings specified in the request.
   *
   * REST API Reference for saveCompanyWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-company-white-label-settings/
   *
   * @param companyWhiteLabelSettingsWrapper  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveCompanyWhiteLabelSettings(@javax.annotation.Nullable CompanyWhiteLabelSettingsWrapper companyWhiteLabelSettingsWrapper, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = companyWhiteLabelSettingsWrapper;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/rebranding/company";

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
   * Save the white label logo text settings
   * Saves the white label logo text specified in the request.
   *
   * REST API Reference for saveWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param whiteLabelRequestsDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, @javax.annotation.Nullable WhiteLabelRequestsDto whiteLabelRequestsDto) throws ApiException {
    return this.saveWhiteLabelLogoText(isDark, isDefault, whiteLabelRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the white label logo text settings
   * Saves the white label logo text specified in the request.
   *
   * REST API Reference for saveWhiteLabelLogoText Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-logo-text/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param whiteLabelRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelLogoText(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, @javax.annotation.Nullable WhiteLabelRequestsDto whiteLabelRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = whiteLabelRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logotext/save";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
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
   * Save the white label logos
   * Saves the white label logos specified in the request.
   *
   * REST API Reference for saveWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param whiteLabelRequestsDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelSettings(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, @javax.annotation.Nullable WhiteLabelRequestsDto whiteLabelRequestsDto) throws ApiException {
    return this.saveWhiteLabelSettings(isDark, isDefault, whiteLabelRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the white label logos
   * Saves the white label logos specified in the request.
   *
   * REST API Reference for saveWhiteLabelSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param whiteLabelRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelSettings(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, @javax.annotation.Nullable WhiteLabelRequestsDto whiteLabelRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = whiteLabelRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logos/save";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
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
   * Save the white label logos from files
   * Saves the white label logos from files.
   *
   * REST API Reference for saveWhiteLabelSettingsFromFiles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings-from-files/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelSettingsFromFiles(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault) throws ApiException {
    return this.saveWhiteLabelSettingsFromFiles(isDark, isDefault, Collections.emptyMap());
  }


  /**
   * Save the white label logos from files
   * Saves the white label logos from files.
   *
   * REST API Reference for saveWhiteLabelSettingsFromFiles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings-from-files/
   *
   * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
   * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper saveWhiteLabelSettingsFromFiles(@javax.annotation.Nullable Boolean isDark, @javax.annotation.Nullable Boolean isDefault, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/whitelabel/logos/savefromfiles";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("IsDark", isDark));
    localVarQueryParams.addAll(apiClient.parameterToPair("IsDefault", isDefault));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
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
