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

package org.openapitools.client.api.Settings;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.CustomColorThemesSettingsRequestsDto;
import org.openapitools.client.model.CustomColorThemesSettingsWrapper;
import org.openapitools.client.model.DeepLinkConfigurationRequestsDto;
import org.openapitools.client.model.DefaultProductRequestDto;
import org.openapitools.client.model.DnsSettingsRequestsDto;
import org.openapitools.client.model.EmailActivationSettings;
import org.openapitools.client.model.EmailActivationSettingsWrapper;
import org.openapitools.client.model.MailDomainSettingsRequestsDto;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.PaymentSettingsWrapper;
import org.openapitools.client.model.STRINGArrayWrapper;
import org.openapitools.client.model.SettingsWrapper;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.StudioDefaultPageSettingsWrapper;
import org.openapitools.client.model.TenantAiAccessSettingsDto;
import org.openapitools.client.model.TenantAiAccessSettingsWrapper;
import org.openapitools.client.model.TenantDeepLinkSettingsWrapper;
import org.openapitools.client.model.TenantUserInvitationSettingsRequestDto;
import org.openapitools.client.model.TenantUserInvitationSettingsWrapper;
import org.openapitools.client.model.TimezonesRequestsArrayWrapper;
import org.openapitools.client.model.WizardRequestsDto;
import org.openapitools.client.model.WizardSettingsWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class CommonSettingsApi extends BaseApi {

  public CommonSettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public CommonSettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Close the admin helper
   * Closes the administrator helper notification.
   *
   * REST API Reference for closeAdminHelper Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/close-admin-helper/
   *
   * @throws ApiException if fails to make API call
   */
  public void closeAdminHelper() throws ApiException {
    this.closeAdminHelper(Collections.emptyMap());
  }


  /**
   * Close the admin helper
   * Closes the administrator helper notification.
   *
   * REST API Reference for closeAdminHelper Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/close-admin-helper/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void closeAdminHelper(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/closeadminhelper";

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
   * Complete the Wizard settings
   * Completes the Wizard settings.
   *
   * REST API Reference for completeWizard Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/complete-wizard/
   *
   * @param wizardRequestsDto  (optional)
   * @return WizardSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WizardSettingsWrapper completeWizard(@javax.annotation.Nullable WizardRequestsDto wizardRequestsDto) throws ApiException {
    return this.completeWizard(wizardRequestsDto, Collections.emptyMap());
  }


  /**
   * Complete the Wizard settings
   * Completes the Wizard settings.
   *
   * REST API Reference for completeWizard Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/complete-wizard/
   *
   * @param wizardRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WizardSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public WizardSettingsWrapper completeWizard(@javax.annotation.Nullable WizardRequestsDto wizardRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = wizardRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/wizard/complete";

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

    TypeReference<WizardSettingsWrapper> localVarReturnType = new TypeReference<WizardSettingsWrapper>() {};
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
   * Configure the deep link settings
   * Saves the deep link configuration settings for the portal.
   *
   * REST API Reference for configureDeepLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-deep-link/
   *
   * @param deepLinkConfigurationRequestsDto  (optional)
   * @return TenantDeepLinkSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantDeepLinkSettingsWrapper configureDeepLink(@javax.annotation.Nullable DeepLinkConfigurationRequestsDto deepLinkConfigurationRequestsDto) throws ApiException {
    return this.configureDeepLink(deepLinkConfigurationRequestsDto, Collections.emptyMap());
  }


  /**
   * Configure the deep link settings
   * Saves the deep link configuration settings for the portal.
   *
   * REST API Reference for configureDeepLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-deep-link/
   *
   * @param deepLinkConfigurationRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantDeepLinkSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantDeepLinkSettingsWrapper configureDeepLink(@javax.annotation.Nullable DeepLinkConfigurationRequestsDto deepLinkConfigurationRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deepLinkConfigurationRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/deeplink";

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

    TypeReference<TenantDeepLinkSettingsWrapper> localVarReturnType = new TypeReference<TenantDeepLinkSettingsWrapper>() {};
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
   * Delete a color theme
   * Deletes the portal color theme with the ID specified in the request.
   *
   * REST API Reference for deletePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
   *
   * @param id The ID of the portal theme to delete. (required)
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper deletePortalColorTheme(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.deletePortalColorTheme(id, Collections.emptyMap());
  }


  /**
   * Delete a color theme
   * Deletes the portal color theme with the ID specified in the request.
   *
   * REST API Reference for deletePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
   *
   * @param id The ID of the portal theme to delete. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper deletePortalColorTheme(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePortalColorTheme");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/colortheme";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("id", id));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<CustomColorThemesSettingsWrapper> localVarReturnType = new TypeReference<CustomColorThemesSettingsWrapper>() {};
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
   * Get the deep link settings
   * Returns the deep link settings.
   *
   * REST API Reference for getDeepLinkSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/
   *
   * @return TenantDeepLinkSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantDeepLinkSettingsWrapper getDeepLinkSettings() throws ApiException {
    return this.getDeepLinkSettings(Collections.emptyMap());
  }


  /**
   * Get the deep link settings
   * Returns the deep link settings.
   *
   * REST API Reference for getDeepLinkSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantDeepLinkSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantDeepLinkSettingsWrapper getDeepLinkSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/deeplink";

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

    TypeReference<TenantDeepLinkSettingsWrapper> localVarReturnType = new TypeReference<TenantDeepLinkSettingsWrapper>() {};
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
   * Get the payment settings
   * Returns the portal payment settings.
   *
   * REST API Reference for getPaymentSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-settings/
   *
   * @return PaymentSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentSettingsWrapper getPaymentSettings() throws ApiException {
    return this.getPaymentSettings(Collections.emptyMap());
  }


  /**
   * Get the payment settings
   * Returns the portal payment settings.
   *
   * REST API Reference for getPaymentSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentSettingsWrapper getPaymentSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/payment";

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

    TypeReference<PaymentSettingsWrapper> localVarReturnType = new TypeReference<PaymentSettingsWrapper>() {};
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
   * Get a color theme
   * Returns the portal color theme.
   *
   * REST API Reference for getPortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/
   *
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper getPortalColorTheme() throws ApiException {
    return this.getPortalColorTheme(Collections.emptyMap());
  }


  /**
   * Get a color theme
   * Returns the portal color theme.
   *
   * REST API Reference for getPortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper getPortalColorTheme(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/colortheme";

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

    TypeReference<CustomColorThemesSettingsWrapper> localVarReturnType = new TypeReference<CustomColorThemesSettingsWrapper>() {};
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
   * Get hostname
   * Returns the portal hostname.
   *
   * REST API Reference for getPortalHostname Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getPortalHostname() throws ApiException {
    return this.getPortalHostname(Collections.emptyMap());
  }


  /**
   * Get hostname
   * Returns the portal hostname.
   *
   * REST API Reference for getPortalHostname Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getPortalHostname(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/machine";

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

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
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
   * Get a portal logo
   * Returns the portal logo image URL.
   *
   * REST API Reference for getPortalLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-logo/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPortalLogo() throws ApiException {
    return this.getPortalLogo(Collections.emptyMap());
  }


  /**
   * Get a portal logo
   * Returns the portal logo image URL.
   *
   * REST API Reference for getPortalLogo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-logo/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPortalLogo(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/logo";

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
   * Get the portal settings
   * Returns a list of all the available portal settings with the current values for each parameter.
   *
   * REST API Reference for getPortalSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
   *
   * @param withpassword Specifies whether to include the password hashing configuration in the response. (optional)
   * @return SettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SettingsWrapper getPortalSettings(@javax.annotation.Nullable Boolean withpassword) throws ApiException {
    return this.getPortalSettings(withpassword, Collections.emptyMap());
  }


  /**
   * Get the portal settings
   * Returns a list of all the available portal settings with the current values for each parameter.
   *
   * REST API Reference for getPortalSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
   *
   * @param withpassword Specifies whether to include the password hashing configuration in the response. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SettingsWrapper getPortalSettings(@javax.annotation.Nullable Boolean withpassword, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("withpassword", withpassword));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<SettingsWrapper> localVarReturnType = new TypeReference<SettingsWrapper>() {};
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
   * Get the socket settings
   * Returns the socket settings.
   *
   * REST API Reference for getSocketSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSocketSettings() throws ApiException {
    return this.getSocketSettings(Collections.emptyMap());
  }


  /**
   * Get the socket settings
   * Returns the socket settings.
   *
   * REST API Reference for getSocketSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getSocketSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/socket";

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

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
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
   * Get supported languages
   * Returns a list of all the available portal languages in the format of a two-letter or four-letter language code (e.g. de, en-US, etc.).
   *
   * REST API Reference for getSupportedCultures Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/
   *
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper getSupportedCultures() throws ApiException {
    return this.getSupportedCultures(Collections.emptyMap());
  }


  /**
   * Get supported languages
   * Returns a list of all the available portal languages in the format of a two-letter or four-letter language code (e.g. de, en-US, etc.).
   *
   * REST API Reference for getSupportedCultures Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper getSupportedCultures(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/cultures";

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

    TypeReference<STRINGArrayWrapper> localVarReturnType = new TypeReference<STRINGArrayWrapper>() {};
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
   * Get the AI access settings for the portal
   * Returns the current portal-level AI access settings that control whether all AI functionality  (chat, agents, vectorization) is available for the portal. AI is enabled by default.
   *
   * REST API Reference for getTenantAiAccessSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-ai-access-settings/
   *
   * @return TenantAiAccessSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAccessSettingsWrapper getTenantAiAccessSettings() throws ApiException {
    return this.getTenantAiAccessSettings(Collections.emptyMap());
  }


  /**
   * Get the AI access settings for the portal
   * Returns the current portal-level AI access settings that control whether all AI functionality  (chat, agents, vectorization) is available for the portal. AI is enabled by default.
   *
   * REST API Reference for getTenantAiAccessSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-ai-access-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantAiAccessSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAccessSettingsWrapper getTenantAiAccessSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ai-access";

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

    TypeReference<TenantAiAccessSettingsWrapper> localVarReturnType = new TypeReference<TenantAiAccessSettingsWrapper>() {};
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
   * Get the user invitation settings
   * Returns the portal user invitation settings.
   *
   * REST API Reference for getTenantUserInvitationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/
   *
   * @return TenantUserInvitationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserInvitationSettingsWrapper getTenantUserInvitationSettings() throws ApiException {
    return this.getTenantUserInvitationSettings(Collections.emptyMap());
  }


  /**
   * Get the user invitation settings
   * Returns the portal user invitation settings.
   *
   * REST API Reference for getTenantUserInvitationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantUserInvitationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserInvitationSettingsWrapper getTenantUserInvitationSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/invitationsettings";

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

    TypeReference<TenantUserInvitationSettingsWrapper> localVarReturnType = new TypeReference<TenantUserInvitationSettingsWrapper>() {};
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
   * Get time zones
   * Returns a list of all the available portal time zones.
   *
   * REST API Reference for getTimeZones Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-time-zones/
   *
   * @return TimezonesRequestsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public TimezonesRequestsArrayWrapper getTimeZones() throws ApiException {
    return this.getTimeZones(Collections.emptyMap());
  }


  /**
   * Get time zones
   * Returns a list of all the available portal time zones.
   *
   * REST API Reference for getTimeZones Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-time-zones/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TimezonesRequestsArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public TimezonesRequestsArrayWrapper getTimeZones(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/timezones";

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

    TypeReference<TimezonesRequestsArrayWrapper> localVarReturnType = new TypeReference<TimezonesRequestsArrayWrapper>() {};
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
   * Set the default folder
   * Sets the default folder.
   *
   * REST API Reference for saveDefaultFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-default-folder/
   *
   * @param defaultProductRequestDto  (optional)
   * @return StudioDefaultPageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public StudioDefaultPageSettingsWrapper saveDefaultFolder(@javax.annotation.Nullable DefaultProductRequestDto defaultProductRequestDto) throws ApiException {
    return this.saveDefaultFolder(defaultProductRequestDto, Collections.emptyMap());
  }


  /**
   * Set the default folder
   * Sets the default folder.
   *
   * REST API Reference for saveDefaultFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-default-folder/
   *
   * @param defaultProductRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StudioDefaultPageSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public StudioDefaultPageSettingsWrapper saveDefaultFolder(@javax.annotation.Nullable DefaultProductRequestDto defaultProductRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = defaultProductRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/defaultfolder";

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

    TypeReference<StudioDefaultPageSettingsWrapper> localVarReturnType = new TypeReference<StudioDefaultPageSettingsWrapper>() {};
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
   * Save the DNS settings
   * Saves the DNS settings specified in the request to the current portal.
   *
   * REST API Reference for saveDnsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-dns-settings/
   *
   * @param dnsSettingsRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper saveDnsSettings(@javax.annotation.Nullable DnsSettingsRequestsDto dnsSettingsRequestsDto) throws ApiException {
    return this.saveDnsSettings(dnsSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the DNS settings
   * Saves the DNS settings specified in the request to the current portal.
   *
   * REST API Reference for saveDnsSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-dns-settings/
   *
   * @param dnsSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper saveDnsSettings(@javax.annotation.Nullable DnsSettingsRequestsDto dnsSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = dnsSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/dns";

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
   * Save the mail domain settings
   * Saves the mail domain settings specified in the request to the portal.
   *
   * REST API Reference for saveMailDomainSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mail-domain-settings/
   *
   * @param mailDomainSettingsRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper saveMailDomainSettings(@javax.annotation.Nullable MailDomainSettingsRequestsDto mailDomainSettingsRequestsDto) throws ApiException {
    return this.saveMailDomainSettings(mailDomainSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the mail domain settings
   * Saves the mail domain settings specified in the request to the portal.
   *
   * REST API Reference for saveMailDomainSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mail-domain-settings/
   *
   * @param mailDomainSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper saveMailDomainSettings(@javax.annotation.Nullable MailDomainSettingsRequestsDto mailDomainSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = mailDomainSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/maildomainsettings";

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
   * Save a color theme
   * Saves the portal color theme specified in the request.
   *
   * REST API Reference for savePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-portal-color-theme/
   *
   * @param customColorThemesSettingsRequestsDto  (optional)
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper savePortalColorTheme(@javax.annotation.Nullable CustomColorThemesSettingsRequestsDto customColorThemesSettingsRequestsDto) throws ApiException {
    return this.savePortalColorTheme(customColorThemesSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Save a color theme
   * Saves the portal color theme specified in the request.
   *
   * REST API Reference for savePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-portal-color-theme/
   *
   * @param customColorThemesSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper savePortalColorTheme(@javax.annotation.Nullable CustomColorThemesSettingsRequestsDto customColorThemesSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = customColorThemesSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/colortheme";

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

    TypeReference<CustomColorThemesSettingsWrapper> localVarReturnType = new TypeReference<CustomColorThemesSettingsWrapper>() {};
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
   * Set the AI access for the portal
   * Updates the portal-level AI access settings. When AI is disabled, all AI features are turned off:  the AI Agents folder is hidden from root folder listings, AI status checks immediately return disabled,  and AI chat endpoints become inaccessible. Only users with the DocSpaceAdmin role  (EditPortalSettings permission) can change this setting.
   *
   * REST API Reference for setTenantAiAccessSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-ai-access-settings/
   *
   * @param tenantAiAccessSettingsDto  (optional)
   * @return TenantAiAccessSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAccessSettingsWrapper setTenantAiAccessSettings(@javax.annotation.Nullable TenantAiAccessSettingsDto tenantAiAccessSettingsDto) throws ApiException {
    return this.setTenantAiAccessSettings(tenantAiAccessSettingsDto, Collections.emptyMap());
  }


  /**
   * Set the AI access for the portal
   * Updates the portal-level AI access settings. When AI is disabled, all AI features are turned off:  the AI Agents folder is hidden from root folder listings, AI status checks immediately return disabled,  and AI chat endpoints become inaccessible. Only users with the DocSpaceAdmin role  (EditPortalSettings permission) can change this setting.
   *
   * REST API Reference for setTenantAiAccessSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-ai-access-settings/
   *
   * @param tenantAiAccessSettingsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantAiAccessSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAiAccessSettingsWrapper setTenantAiAccessSettings(@javax.annotation.Nullable TenantAiAccessSettingsDto tenantAiAccessSettingsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantAiAccessSettingsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/ai-access";

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

    TypeReference<TenantAiAccessSettingsWrapper> localVarReturnType = new TypeReference<TenantAiAccessSettingsWrapper>() {};
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
   * Update the email activation settings
   * Updates the email activation settings.
   *
   * REST API Reference for updateEmailActivationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-email-activation-settings/
   *
   * @param emailActivationSettings  (optional)
   * @return EmailActivationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public EmailActivationSettingsWrapper updateEmailActivationSettings(@javax.annotation.Nullable EmailActivationSettings emailActivationSettings) throws ApiException {
    return this.updateEmailActivationSettings(emailActivationSettings, Collections.emptyMap());
  }


  /**
   * Update the email activation settings
   * Updates the email activation settings.
   *
   * REST API Reference for updateEmailActivationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-email-activation-settings/
   *
   * @param emailActivationSettings  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmailActivationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public EmailActivationSettingsWrapper updateEmailActivationSettings(@javax.annotation.Nullable EmailActivationSettings emailActivationSettings, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = emailActivationSettings;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/emailactivation";

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

    TypeReference<EmailActivationSettingsWrapper> localVarReturnType = new TypeReference<EmailActivationSettingsWrapper>() {};
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
   * Update user invitation settings
   * Updates the portal user invitation settings.
   *
   * REST API Reference for updateInvitationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-settings/
   *
   * @param tenantUserInvitationSettingsRequestDto  (optional)
   * @return TenantUserInvitationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserInvitationSettingsWrapper updateInvitationSettings(@javax.annotation.Nullable TenantUserInvitationSettingsRequestDto tenantUserInvitationSettingsRequestDto) throws ApiException {
    return this.updateInvitationSettings(tenantUserInvitationSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Update user invitation settings
   * Updates the portal user invitation settings.
   *
   * REST API Reference for updateInvitationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-settings/
   *
   * @param tenantUserInvitationSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantUserInvitationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantUserInvitationSettingsWrapper updateInvitationSettings(@javax.annotation.Nullable TenantUserInvitationSettingsRequestDto tenantUserInvitationSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantUserInvitationSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/invitationsettings";

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

    TypeReference<TenantUserInvitationSettingsWrapper> localVarReturnType = new TypeReference<TenantUserInvitationSettingsWrapper>() {};
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
