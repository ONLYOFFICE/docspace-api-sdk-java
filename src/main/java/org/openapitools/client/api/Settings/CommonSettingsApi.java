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
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.MailDomainSettingsRequestsDto;
import org.openapitools.client.model.PaymentSettingsWrapper;
import org.openapitools.client.model.STRINGArrayWrapper;
import org.openapitools.client.model.SettingsWrapper;
import org.openapitools.client.model.SocketSettingsWrapper;
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
   * Dismisses the administrator helper tip for the caller, so it is not shown again on this account. Available  only to a DocSpace administrator, which includes the portal Owner, on a Standalone (self-hosted) installation  running outside white-label custom mode; every other caller is refused. This is a mutating, idempotent call  scoped to the calling account only; it never affects other administrators. It returns no data on success.
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
   * Dismisses the administrator helper tip for the caller, so it is not shown again on this account. Available  only to a DocSpace administrator, which includes the portal Owner, on a Standalone (self-hosted) installation  running outside white-label custom mode; every other caller is refused. This is a mutating, idempotent call  scoped to the calling account only; it never affects other administrators. It returns no data on success.
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
      "application/json"
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
   * Finishes the initial portal setup wizard: sets the owner's password and locale, applies the supplied license  if one is required, and marks the wizard as completed so it is not shown again. This call is not for a normal  logged-in session: it requires a confirmation link bearing the Wizard claim, of the kind issued when a new  portal is created, and the link is consumed as part of authenticating the request; the caller must also hold  the EditPortalSettings permission. An empty password or a malformed email address is rejected without  completing the wizard, and so is a missing, invalid, or expired license, or a license whose user quota does  not cover the portal. This call is meant to run once per portal; running it again is accepted but has no  further effect once the wizard is already completed. It returns the resulting wizard settings, including the  completed flag.
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
   * Finishes the initial portal setup wizard: sets the owner's password and locale, applies the supplied license  if one is required, and marks the wizard as completed so it is not shown again. This call is not for a normal  logged-in session: it requires a confirmation link bearing the Wizard claim, of the kind issued when a new  portal is created, and the link is consumed as part of authenticating the request; the caller must also hold  the EditPortalSettings permission. An empty password or a malformed email address is rejected without  completing the wizard, and so is a missing, invalid, or expired license, or a license whose user quota does  not cover the portal. This call is meant to run once per portal; running it again is accepted but has no  further effect once the wizard is already completed. It returns the resulting wizard settings, including the  completed flag.
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
   * Sets how the portal responds when a client opens a DocSpace link on a mobile device: always in the browser,  always in the native app, or asking the user to choose each time. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The handling mode must be one of the documented enum values; anything else is  rejected without being saved. This is a mutating, idempotent call: sending the same mode again leaves the  setting unchanged. It returns the saved deep link settings, including the timestamp of the last change; read  the current value at any time, including anonymously, from `GET api/2.0/settings/deeplink`.
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
   * Sets how the portal responds when a client opens a DocSpace link on a mobile device: always in the browser,  always in the native app, or asking the user to choose each time. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The handling mode must be one of the documented enum values; anything else is  rejected without being saved. This is a mutating, idempotent call: sending the same mode again leaves the  setting unchanged. It returns the saved deep link settings, including the timestamp of the last change; read  the current value at any time, including anonymously, from `GET api/2.0/settings/deeplink`.
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
   * Removes a custom color theme from the portal by its ID. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). An ID belonging to one of the built-in default themes is not removable; the  call succeeds but leaves the theme list unchanged. If the deleted theme was the currently selected one, the  theme with the lowest remaining ID is selected automatically. This is a mutating, idempotent call: deleting an  ID that is already gone succeeds without error and again leaves nothing changed. It returns the full updated  theme configuration, including the (possibly new) selected theme.
   *
   * REST API Reference for deletePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
   *
   * @param id The theme to remove, by theme ID. An ID belonging to a built-in theme leaves the list untouched, and so does  one that is already gone - neither is reported as an error. Removing the theme currently in use moves the  portal to the remaining theme with the lowest ID. (required)
   * @return CustomColorThemesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomColorThemesSettingsWrapper deletePortalColorTheme(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.deletePortalColorTheme(id, Collections.emptyMap());
  }


  /**
   * Delete a color theme
   * Removes a custom color theme from the portal by its ID. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). An ID belonging to one of the built-in default themes is not removable; the  call succeeds but leaves the theme list unchanged. If the deleted theme was the currently selected one, the  theme with the lowest remaining ID is selected automatically. This is a mutating, idempotent call: deleting an  ID that is already gone succeeds without error and again leaves nothing changed. It returns the full updated  theme configuration, including the (possibly new) selected theme.
   *
   * REST API Reference for deletePortalColorTheme Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
   *
   * @param id The theme to remove, by theme ID. An ID belonging to a built-in theme leaves the list untouched, and so does  one that is already gone - neither is reported as an error. Removing the theme currently in use moves the  portal to the remaining theme with the lowest ID. (required)
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
   * Returns how the portal currently responds when a client opens a DocSpace link on a mobile device: always in  the browser, always in the native app, or asking the user to choose. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call. The response supports conditional requests:  send the standard If-Modified-Since header with the previous `lastModified` value, and an unchanged response  comes back empty instead of resending the settings. Change the mode with `POST api/2.0/settings/deeplink`,  which requires the EditPortalSettings permission.
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
   * Returns how the portal currently responds when a client opens a DocSpace link on a mobile device: always in  the browser, always in the native app, or asking the user to choose. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call. The response supports conditional requests:  send the standard If-Modified-Since header with the previous `lastModified` value, and an unchanged response  comes back empty instead of resending the settings. Change the mode with `POST api/2.0/settings/deeplink`,  which requires the EditPortalSettings permission.
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Returns the portal's payment-related configuration: the sales contact email, the URL to buy or extend a  subscription, whether the portal is Standalone, the current license's trial status and expiration date, and  the maximum quota quantity that can be purchased at once. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). This is a read-only, idempotent call. It remains reachable even while the  portal's own subscription payment is overdue, since this is how the caller finds the link to resolve it.
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
   * Returns the portal's payment-related configuration: the sales contact email, the URL to buy or extend a  subscription, whether the portal is Standalone, the current license's trial status and expiration date, and  the maximum quota quantity that can be purchased at once. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). This is a read-only, idempotent call. It remains reachable even while the  portal's own subscription payment is overdue, since this is how the caller finds the link to resolve it.
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
   * Returns the portal's color theme configuration: every saved custom theme, which one is currently selected, and  how many custom themes the plan still allows. No permission is required; anonymous callers can read it too.  This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings. A `limit` of `0` means the plan does not cap the number of custom  themes.
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
   * Returns the portal's color theme configuration: every saved custom theme, which one is currently selected, and  how many custom themes the plan still allows. No permission is required; anonymous callers can read it too.  This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings. A `limit` of `0` means the plan does not cap the number of custom  themes.
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get the portal hostname
   * Returns the hostname the current request arrived on, exactly as sent in the HTTP Host header, so a client  mid-setup can learn the address the portal is actually reachable at. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard claim, of the kind generated during initial portal  setup, and the link is consumed as part of authenticating the request. This is a read-only, idempotent call.  The value reflects whatever the caller connected through, including a reverse proxy's public name, and is not  necessarily the tenant's configured alias or mapped domain.
   *
   * REST API Reference for getPortalHostname Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPortalHostname() throws ApiException {
    return this.getPortalHostname(Collections.emptyMap());
  }


  /**
   * Get the portal hostname
   * Returns the hostname the current request arrived on, exactly as sent in the HTTP Host header, so a client  mid-setup can learn the address the portal is actually reachable at. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard claim, of the kind generated during initial portal  setup, and the link is consumed as part of authenticating the request. This is a read-only, idempotent call.  The value reflects whatever the caller connected through, including a reverse proxy's public name, and is not  necessarily the tenant's configured alias or mapped domain.
   *
   * REST API Reference for getPortalHostname Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPortalHostname(Map<String, String> additionalHeaders) throws ApiException {
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
   * Get a portal logo
   * Returns the absolute URL of the portal's current logo image, already resolved against the active white-label  branding. Requires an authenticated session; every role, including Guest, can read it. This is a read-only,  idempotent call. The response supports conditional requests: send the standard If-Modified-Since header with  the previous `lastModified` value, and an unchanged response comes back empty instead of resending the same  URL. The URL points at whatever image is currently configured, including the default DocSpace logo when no  custom branding has been set.
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
   * Returns the absolute URL of the portal's current logo image, already resolved against the active white-label  branding. Requires an authenticated session; every role, including Guest, can read it. This is a read-only,  idempotent call. The response supports conditional requests: send the standard If-Modified-Since header with  the previous `lastModified` value, and an unchanged response comes back empty instead of resending the same  URL. The URL points at whatever image is currently configured, including the default DocSpace logo when no  custom branding has been set.
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
   * Returns the current portal's general configuration: branding, culture, feature flags, and DocSpace/Standalone  mode, everything the client needs to render its shell before or after login. No permission is required, but  the response shape depends on the caller's identity. An anonymous caller receives only the public subset  (culture, branding, DocSpace/Standalone flags, deep link data, setup-wizard and join-by-domain hints); once  authenticated, the response also includes tenant-specific fields such as the owner ID, time zone, invitation  limit, AI/banner/dev-tools flags, and, for a DocSpace administrator, the tenant wallet's low-balance flag.  This is a read-only, idempotent call. Pass `withPassword=true` to also receive the parameters (`salt`,  iteration count, hash size) used to hash the password client-side before it is sent to the authentication  endpoints; these are only added for an anonymous caller or when explicitly requested, never as part of the  default authenticated response.
   *
   * REST API Reference for getPortalSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
   *
   * @param withpassword Whether the answer also carries the salt, iteration count and hash size a client needs to hash a password  before sending it to the authentication operations. They are included for an anonymous caller anyway; for a  signed-in one they are left out unless this is set. (optional)
   * @return SettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SettingsWrapper getPortalSettings(@javax.annotation.Nullable Boolean withpassword) throws ApiException {
    return this.getPortalSettings(withpassword, Collections.emptyMap());
  }


  /**
   * Get the portal settings
   * Returns the current portal's general configuration: branding, culture, feature flags, and DocSpace/Standalone  mode, everything the client needs to render its shell before or after login. No permission is required, but  the response shape depends on the caller's identity. An anonymous caller receives only the public subset  (culture, branding, DocSpace/Standalone flags, deep link data, setup-wizard and join-by-domain hints); once  authenticated, the response also includes tenant-specific fields such as the owner ID, time zone, invitation  limit, AI/banner/dev-tools flags, and, for a DocSpace administrator, the tenant wallet's low-balance flag.  This is a read-only, idempotent call. Pass `withPassword=true` to also receive the parameters (`salt`,  iteration count, hash size) used to hash the password client-side before it is sent to the authentication  endpoints; these are only added for an anonymous caller or when explicitly requested, never as part of the  default authenticated response.
   *
   * REST API Reference for getPortalSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
   *
   * @param withpassword Whether the answer also carries the salt, iteration count and hash size a client needs to hash a password  before sending it to the authentication operations. They are included for an anonymous caller anyway; for a  signed-in one they are left out unless this is set. (optional)
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Returns the base URL of the portal's real-time notification hub (Socket.IO), which the client connects to for  live updates such as file changes, presence, or quota alerts. Requires an authenticated session; every role  can read it. This is a read-only, idempotent call. The value comes from server-side configuration and cannot  be changed through this API; an empty `url` means the portal has no notification hub configured and the client  should not attempt to connect.
   *
   * REST API Reference for getSocketSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
   *
   * @return SocketSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SocketSettingsWrapper getSocketSettings() throws ApiException {
    return this.getSocketSettings(Collections.emptyMap());
  }


  /**
   * Get the socket settings
   * Returns the base URL of the portal's real-time notification hub (Socket.IO), which the client connects to for  live updates such as file changes, presence, or quota alerts. Requires an authenticated session; every role  can read it. This is a read-only, idempotent call. The value comes from server-side configuration and cannot  be changed through this API; an empty `url` means the portal has no notification hub configured and the client  should not attempt to connect.
   *
   * REST API Reference for getSocketSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SocketSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public SocketSettingsWrapper getSocketSettings(Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<SocketSettingsWrapper> localVarReturnType = new TypeReference<SocketSettingsWrapper>() {};
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
   * Returns the two- or four-letter language codes of every culture currently enabled on the portal (for example  `en-US`), used to populate a language picker before or after login. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call, and the list is not paginated. The response  supports conditional requests: an unchanged result is signaled instead of resending the same list. The set of  enabled cultures is a portal-wide configuration value, not a per-user preference.
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
   * Returns the two- or four-letter language codes of every culture currently enabled on the portal (for example  `en-US`), used to populate a language picker before or after login. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call, and the list is not paginated. The response  supports conditional requests: an unchanged result is signaled instead of resending the same list. The set of  enabled cultures is a portal-wide configuration value, not a per-user preference.
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get the AI access settings
   * Returns whether AI functionality (chat, agents, vectorization) is currently available on the portal at all; AI  is enabled by default. Requires an authenticated session; every role can read it. This is a read-only,  idempotent call. When the setting is disabled, every AI-specific endpoint and folder is unavailable regardless  of the caller's own permissions; this call only reports the portal-wide switch, not any per-user entitlement.
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
   * Get the AI access settings
   * Returns whether AI functionality (chat, agents, vectorization) is currently available on the portal at all; AI  is enabled by default. Requires an authenticated session; every role can read it. This is a read-only,  idempotent call. When the setting is disabled, every AI-specific endpoint and folder is unavailable regardless  of the caller's own permissions; this call only reports the portal-wide switch, not any per-user entitlement.
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
   * Returns whether the portal currently allows inviting new members and new guests at all. No permission is  required; anonymous callers can read it too, since the invitation flow itself may run before the caller has  signed in. This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings.
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
   * Returns whether the portal currently allows inviting new members and new guests at all. No permission is  required; anonymous callers can read it too, since the invitation flow itself may run before the caller has  signed in. This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings.
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Returns every time zone known to the host machine, each with its IANA identifier and a human-readable display  name, ordered from the most negative to the most positive UTC offset. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard or Administrators claim, of the kind generated  during initial portal setup or issued by an administrator, and the link is consumed as part of authenticating  the request. This is a read-only, idempotent call, and the list is not paginated. Use the returned `id` values  wherever the portal expects a time zone identifier; an unrecognized value is rejected there, not here.
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
   * Returns every time zone known to the host machine, each with its IANA identifier and a human-readable display  name, ordered from the most negative to the most positive UTC offset. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard or Administrators claim, of the kind generated  during initial portal setup or issued by an administrator, and the link is consumed as part of authenticating  the request. This is a read-only, idempotent call, and the list is not paginated. Use the returned `id` values  wherever the portal expects a time zone identifier; an unrecognized value is rejected there, not here.
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
   * Sets which folder the current user's account opens into by default, such as My Documents, the rooms list, or  favorites. Requires an authenticated session; every role may set its own default, and the change never affects  any other user. Only folder types the client actually offers as a landing page are accepted; picking My  Documents (`USER`) as a Guest is rejected too, since guests have no personal storage. This is a mutating,  idempotent call. It returns the saved setting.
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
   * Sets which folder the current user's account opens into by default, such as My Documents, the rooms list, or  favorites. Requires an authenticated session; every role may set its own default, and the change never affects  any other user. Only folder types the client actually offers as a landing page are accepted; picking My  Documents (`USER`) as a Guest is rejected too, since guests have no personal storage. This is a mutating,  idempotent call. It returns the saved setting.
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
   * Maps a custom domain name onto the current tenant, or clears the mapping, so the portal becomes reachable  under the caller's own DNS name instead of only its default alias. Available only on a Standalone  (self-hosted) installation; on SaaS the call is always refused. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disable the mapping by passing `enable=false`, in which case the domain name  in the request is ignored. A domain that collides with the portal's reserved base domain, or otherwise fails  validation, is rejected without changing the current mapping. This is a mutating, idempotent call. On success  the previous domain also stops answering, and any CSP configuration referencing it is updated to the new one.
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
   * Maps a custom domain name onto the current tenant, or clears the mapping, so the portal becomes reachable  under the caller's own DNS name instead of only its default alias. Available only on a Standalone  (self-hosted) installation; on SaaS the call is always refused. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disable the mapping by passing `enable=false`, in which case the domain name  in the request is ignored. A domain that collides with the portal's reserved base domain, or otherwise fails  validation, is rejected without changing the current mapping. This is a mutating, idempotent call. On success  the previous domain also stops answering, and any CSP configuration referencing it is updated to the new one.
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
   * Overwrites the portal's trusted mail domain configuration, which controls which email domains are treated as  already verified when a user is invited or self-registers. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). When the requested mode is a custom domain list, every domain is normalized to  lowercase and checked against the expected hostname format; a domain that fails the check, or an empty custom  list, causes the whole call to be rejected without saving anything. For the other modes the domain list in the  request is ignored. The `inviteUsersAsVisitors` flag controls whether users who join through a trusted domain  are added as full members or as visitors, and takes effect on the next join rather than retroactively. This is  a mutating, idempotent call: repeating it with the same body leaves the portal in the same state. On success  it returns a confirmation message, not the saved settings themselves; read them back from  `GET api/2.0/settings`.
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
   * Overwrites the portal's trusted mail domain configuration, which controls which email domains are treated as  already verified when a user is invited or self-registers. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). When the requested mode is a custom domain list, every domain is normalized to  lowercase and checked against the expected hostname format; a domain that fails the check, or an empty custom  list, causes the whole call to be rejected without saving anything. For the other modes the domain list in the  request is ignored. The `inviteUsersAsVisitors` flag controls whether users who join through a trusted domain  are added as full members or as visitors, and takes effect on the next join rather than retroactively. This is  a mutating, idempotent call: repeating it with the same body leaves the portal in the same state. On success  it returns a confirmation message, not the saved settings themselves; read them back from  `GET api/2.0/settings`.
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
   * Adds or updates a custom color theme, or changes which theme is selected, for the whole portal. Requires Owner  or DocSpaceAdmin (the EditPortalSettings permission). Pass `theme` to create or edit one: an existing theme is  matched and updated by its ID, a new one is appended, and an ID that collides with a built-in default theme is  treated as a request to create a new custom theme instead of overwriting the default. Once the plan's  custom-theme limit is reached, a new theme is silently not added rather than rejected with an error, so check  the returned `themes` count against `limit` before assuming it was saved. Pass `selected` to switch the active  theme; an ID that does not match any existing theme is ignored. This is a mutating call, not strictly  idempotent once the limit has been reached. It returns the full updated theme configuration.
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
   * Adds or updates a custom color theme, or changes which theme is selected, for the whole portal. Requires Owner  or DocSpaceAdmin (the EditPortalSettings permission). Pass `theme` to create or edit one: an existing theme is  matched and updated by its ID, a new one is appended, and an ID that collides with a built-in default theme is  treated as a request to create a new custom theme instead of overwriting the default. Once the plan's  custom-theme limit is reached, a new theme is silently not added rather than rejected with an error, so check  the returned `themes` count against `limit` before assuming it was saved. Pass `selected` to switch the active  theme; an ID that does not match any existing theme is ignored. This is a mutating call, not strictly  idempotent once the limit has been reached. It returns the full updated theme configuration.
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
   * Set the AI access settings
   * Turns AI functionality (chat, agents, vectorization) on or off for the whole portal; AI is enabled by default.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other caller is refused. Disabling  it immediately hides the AI Agents folder from root folder listings, makes AI status checks report disabled,  and makes AI chat endpoints unreachable for every user on the tenant, not only the caller. This is a mutating,  idempotent, portal-wide call, and the change is pushed to already-connected clients over the real-time  notification hub rather than waiting for their next request. It returns the saved setting.
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
   * Set the AI access settings
   * Turns AI functionality (chat, agents, vectorization) on or off for the whole portal; AI is enabled by default.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other caller is refused. Disabling  it immediately hides the AI Agents folder from root folder listings, makes AI status checks report disabled,  and makes AI chat endpoints unreachable for every user on the tenant, not only the caller. This is a mutating,  idempotent, portal-wide call, and the change is pushed to already-connected clients over the real-time  notification hub rather than waiting for their next request. It returns the saved setting.
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
   * Updates the current user's own preference for whether the email confirmation prompt is displayed on their  account. Requires an authenticated session; every role may change its own setting, and the change never  affects any other user. This is a mutating, idempotent call. It returns the settings exactly as submitted,  without validating them against the account's actual email confirmation state, so `show` can be set to `true`  even after the address is already confirmed.
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
   * Updates the current user's own preference for whether the email confirmation prompt is displayed on their  account. Requires an authenticated session; every role may change its own setting, and the change never  affects any other user. This is a mutating, idempotent call. It returns the settings exactly as submitted,  without validating them against the account's actual email confirmation state, so `show` can be set to `true`  even after the address is already confirmed.
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
   * Update the user invitation settings
   * Sets whether the portal allows inviting new members and new guests. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disabling member or guest invitations only blocks creating new invitations  going forward; it does not revoke links already issued or remove members already invited. This is a mutating,  idempotent, portal-wide call. It returns the saved setting; read the current value at any time, including  anonymously, from `GET api/2.0/settings/invitationsettings`.
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
   * Update the user invitation settings
   * Sets whether the portal allows inviting new members and new guests. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disabling member or guest invitations only blocks creating new invitations  going forward; it does not revoke links already issued or remove members already invited. This is a mutating,  idempotent, portal-wide call. It returns the saved setting; read the current value at any time, including  anonymously, from `GET api/2.0/settings/invitationsettings`.
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
