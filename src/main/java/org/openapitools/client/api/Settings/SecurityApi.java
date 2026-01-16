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

package org.openapitools.client.api.Settings;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.EmployeeArrayWrapper;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.PasswordSettingsRequestsDto;
import org.openapitools.client.model.PasswordSettingsWrapper;
import org.openapitools.client.model.ProductAdministratorWrapper;
import org.openapitools.client.model.SecurityArrayWrapper;
import org.openapitools.client.model.SecurityRequestsDto;
import java.util.UUID;
import org.openapitools.client.model.WebItemSecurityRequestsDto;
import org.openapitools.client.model.WebItemsSecurityRequestsDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SecurityApi extends BaseApi {

  public SecurityApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SecurityApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get the enabled modules
   * Returns a list of all the enabled modules.
   *
   * REST API Reference for getEnabledModules Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enabled-modules/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getEnabledModules() throws ApiException {
    return this.getEnabledModules(Collections.emptyMap());
  }


  /**
   * Get the enabled modules
   * Returns a list of all the enabled modules.
   *
   * REST API Reference for getEnabledModules Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enabled-modules/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getEnabledModules(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/modules";

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
   * Check a product administrator
   * Checks if the selected user is an administrator of a product with the ID specified in the request.
   *
   * REST API Reference for getIsProductAdministrator Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-product-administrator/
   *
   * @param productid The ID of the product extracted from the query parameters. (required)
   * @param userid The user ID extracted from the query parameters. (required)
   * @return ProductAdministratorWrapper
   * @throws ApiException if fails to make API call
   */
  public ProductAdministratorWrapper getIsProductAdministrator(@javax.annotation.Nonnull UUID productid, @javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getIsProductAdministrator(productid, userid, Collections.emptyMap());
  }


  /**
   * Check a product administrator
   * Checks if the selected user is an administrator of a product with the ID specified in the request.
   *
   * REST API Reference for getIsProductAdministrator Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-product-administrator/
   *
   * @param productid The ID of the product extracted from the query parameters. (required)
   * @param userid The user ID extracted from the query parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProductAdministratorWrapper
   * @throws ApiException if fails to make API call
   */
  public ProductAdministratorWrapper getIsProductAdministrator(@javax.annotation.Nonnull UUID productid, @javax.annotation.Nonnull UUID userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productid' is set
    if (productid == null) {
      throw new ApiException(400, "Missing the required parameter 'productid' when calling getIsProductAdministrator");
    }
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getIsProductAdministrator");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/administrator";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("productid", productid));
    localVarQueryParams.addAll(apiClient.parameterToPair("userid", userid));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ProductAdministratorWrapper> localVarReturnType = new TypeReference<ProductAdministratorWrapper>() {};
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
   * Get the password settings
   * Returns the portal password settings.
   *
   * REST API Reference for getPasswordSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-password-settings/
   *
   * @return PasswordSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PasswordSettingsWrapper getPasswordSettings() throws ApiException {
    return this.getPasswordSettings(Collections.emptyMap());
  }


  /**
   * Get the password settings
   * Returns the portal password settings.
   *
   * REST API Reference for getPasswordSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-password-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return PasswordSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PasswordSettingsWrapper getPasswordSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/password";

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

    TypeReference<PasswordSettingsWrapper> localVarReturnType = new TypeReference<PasswordSettingsWrapper>() {};
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
   * Get the product administrators
   * Returns a list of all the administrators of a product with the ID specified in the request.
   *
   * REST API Reference for getProductAdministrators Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-product-administrators/
   *
   * @param productid The ID of the product extracted from the route parameters. (required)
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper getProductAdministrators(@javax.annotation.Nonnull UUID productid) throws ApiException {
    return this.getProductAdministrators(productid, Collections.emptyMap());
  }


  /**
   * Get the product administrators
   * Returns a list of all the administrators of a product with the ID specified in the request.
   *
   * REST API Reference for getProductAdministrators Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-product-administrators/
   *
   * @param productid The ID of the product extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper getProductAdministrators(@javax.annotation.Nonnull UUID productid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productid' is set
    if (productid == null) {
      throw new ApiException(400, "Missing the required parameter 'productid' when calling getProductAdministrators");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/administrator/{productid}"
      .replaceAll("\\{" + "productid" + "\\}", apiClient.escapeString(apiClient.parameterToString(productid)));

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

    TypeReference<EmployeeArrayWrapper> localVarReturnType = new TypeReference<EmployeeArrayWrapper>() {};
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
   * Get the module availability
   * Returns the availability of the module with the ID specified in the request.
   *
   * REST API Reference for getWebItemSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-security-info/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getWebItemSecurityInfo(@javax.annotation.Nonnull UUID id) throws ApiException {
    return this.getWebItemSecurityInfo(id, Collections.emptyMap());
  }


  /**
   * Get the module availability
   * Returns the availability of the module with the ID specified in the request.
   *
   * REST API Reference for getWebItemSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-security-info/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getWebItemSecurityInfo(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWebItemSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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
   * Get the security settings
   * Returns the security settings for the modules specified in the request.
   *
   * REST API Reference for getWebItemSettingsSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-settings-security-info/
   *
   * @param ids The list of module identifiers for which to retrieve the security settings. (optional)
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper getWebItemSettingsSecurityInfo(@javax.annotation.Nullable List<String> ids) throws ApiException {
    return this.getWebItemSettingsSecurityInfo(ids, Collections.emptyMap());
  }


  /**
   * Get the security settings
   * Returns the security settings for the modules specified in the request.
   *
   * REST API Reference for getWebItemSettingsSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-settings-security-info/
   *
   * @param ids The list of module identifiers for which to retrieve the security settings. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper getWebItemSettingsSecurityInfo(@javax.annotation.Nullable List<String> ids, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParameterBaseName = "ids";
    for (int i=0; i < ids.size(); i++) {
      localVarQueryStringJoiner.add(String.format(java.util.Locale.ROOT, "ids[%d]=%s", i, apiClient.parameterToString(ids.get(i))));
    }
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<SecurityArrayWrapper> localVarReturnType = new TypeReference<SecurityArrayWrapper>() {};
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
   * Set the security settings to modules
   * Sets the security settings to the modules with the IDs specified in the request.
   *
   * REST API Reference for setAccessToWebItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-access-to-web-items/
   *
   * @param webItemsSecurityRequestsDto  (optional)
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper setAccessToWebItems(@javax.annotation.Nullable WebItemsSecurityRequestsDto webItemsSecurityRequestsDto) throws ApiException {
    return this.setAccessToWebItems(webItemsSecurityRequestsDto, Collections.emptyMap());
  }


  /**
   * Set the security settings to modules
   * Sets the security settings to the modules with the IDs specified in the request.
   *
   * REST API Reference for setAccessToWebItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-access-to-web-items/
   *
   * @param webItemsSecurityRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper setAccessToWebItems(@javax.annotation.Nullable WebItemsSecurityRequestsDto webItemsSecurityRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webItemsSecurityRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/access";

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

    TypeReference<SecurityArrayWrapper> localVarReturnType = new TypeReference<SecurityArrayWrapper>() {};
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
   * Set a product administrator
   * Sets the selected user as an administrator of a product with the ID specified in the request.
   *
   * REST API Reference for setProductAdministrator Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-product-administrator/
   *
   * @param securityRequestsDto  (optional)
   * @return ProductAdministratorWrapper
   * @throws ApiException if fails to make API call
   */
  public ProductAdministratorWrapper setProductAdministrator(@javax.annotation.Nullable SecurityRequestsDto securityRequestsDto) throws ApiException {
    return this.setProductAdministrator(securityRequestsDto, Collections.emptyMap());
  }


  /**
   * Set a product administrator
   * Sets the selected user as an administrator of a product with the ID specified in the request.
   *
   * REST API Reference for setProductAdministrator Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-product-administrator/
   *
   * @param securityRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProductAdministratorWrapper
   * @throws ApiException if fails to make API call
   */
  public ProductAdministratorWrapper setProductAdministrator(@javax.annotation.Nullable SecurityRequestsDto securityRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = securityRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/administrator";

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

    TypeReference<ProductAdministratorWrapper> localVarReturnType = new TypeReference<ProductAdministratorWrapper>() {};
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
   * Set the module security settings
   * Sets the security settings to the module with the ID specified in the request.
   *
   * REST API Reference for setWebItemSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-item-security/
   *
   * @param webItemSecurityRequestsDto  (optional)
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper setWebItemSecurity(@javax.annotation.Nullable WebItemSecurityRequestsDto webItemSecurityRequestsDto) throws ApiException {
    return this.setWebItemSecurity(webItemSecurityRequestsDto, Collections.emptyMap());
  }


  /**
   * Set the module security settings
   * Sets the security settings to the module with the ID specified in the request.
   *
   * REST API Reference for setWebItemSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-item-security/
   *
   * @param webItemSecurityRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SecurityArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public SecurityArrayWrapper setWebItemSecurity(@javax.annotation.Nullable WebItemSecurityRequestsDto webItemSecurityRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webItemSecurityRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security";

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

    TypeReference<SecurityArrayWrapper> localVarReturnType = new TypeReference<SecurityArrayWrapper>() {};
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
   * Set the password settings
   * Sets the portal password settings.
   *
   * REST API Reference for updatePasswordSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-password-settings/
   *
   * @param passwordSettingsRequestsDto  (optional)
   * @return PasswordSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PasswordSettingsWrapper updatePasswordSettings(@javax.annotation.Nullable PasswordSettingsRequestsDto passwordSettingsRequestsDto) throws ApiException {
    return this.updatePasswordSettings(passwordSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Set the password settings
   * Sets the portal password settings.
   *
   * REST API Reference for updatePasswordSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-password-settings/
   *
   * @param passwordSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PasswordSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public PasswordSettingsWrapper updatePasswordSettings(@javax.annotation.Nullable PasswordSettingsRequestsDto passwordSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = passwordSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/security/password";

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

    TypeReference<PasswordSettingsWrapper> localVarReturnType = new TypeReference<PasswordSettingsWrapper>() {};
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
