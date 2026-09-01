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

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.DocsCloudConfig;
import org.openapitools.client.model.DocsCloudConfigWrapper;
import org.openapitools.client.model.DocsCloudDevPackRequestDto;
import org.openapitools.client.model.DocsCloudQuotaWrapper;
import org.openapitools.client.model.DocsCloudTenantInfoWrapper;
import org.openapitools.client.model.DocsCloudTenantWrapper;
import org.openapitools.client.model.DocsCloudUsageWrapper;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.PaymentCalculationWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class DocsCloudApi extends BaseApi {

  public DocsCloudApi() {
    super(Configuration.getDefaultApiClient());
  }

  public DocsCloudApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Calculate the DocsCloud subscription switch cost
   * Calculates the top-up cost of switching the current DocsCloud subscription to DocsCloudDevPack,  without making any changes. The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
   *
   * REST API Reference for calculateDevPack Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-dev-pack/
   *
   * @param docsCloudDevPackRequestDto  (optional)
   * @return PaymentCalculationWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentCalculationWrapper calculateDevPack(@javax.annotation.Nullable DocsCloudDevPackRequestDto docsCloudDevPackRequestDto) throws ApiException {
    return this.calculateDevPack(docsCloudDevPackRequestDto, Collections.emptyMap());
  }


  /**
   * Calculate the DocsCloud subscription switch cost
   * Calculates the top-up cost of switching the current DocsCloud subscription to DocsCloudDevPack,  without making any changes. The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
   *
   * REST API Reference for calculateDevPack Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-dev-pack/
   *
   * @param docsCloudDevPackRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentCalculationWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentCalculationWrapper calculateDevPack(@javax.annotation.Nullable DocsCloudDevPackRequestDto docsCloudDevPackRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = docsCloudDevPackRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/calculatedevpack";

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

    TypeReference<PaymentCalculationWrapper> localVarReturnType = new TypeReference<PaymentCalculationWrapper>() {};
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
   * Start the DocsCloud tenant quota report generation
   * Starts generating the DocsCloud user quota report as an xlsx file and saves it in My Documents.
   *
   * REST API Reference for createTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-tenant-quota-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createTenantQuotaReport() throws ApiException {
    return this.createTenantQuotaReport(Collections.emptyMap());
  }


  /**
   * Start the DocsCloud tenant quota report generation
   * Starts generating the DocsCloud user quota report as an xlsx file and saves it in My Documents.
   *
   * REST API Reference for createTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-tenant-quota-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createTenantQuotaReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/quota/report";

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

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
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
   * Get the DocsCloud tenant
   * Returns the DocsCloud tenant of the current portal.
   *
   * REST API Reference for getTenant Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant from DocsCloud again. (optional, default to false)
   * @return DocsCloudTenantWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudTenantWrapper getTenant(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getTenant(refresh, Collections.emptyMap());
  }


  /**
   * Get the DocsCloud tenant
   * Returns the DocsCloud tenant of the current portal.
   *
   * REST API Reference for getTenant Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant from DocsCloud again. (optional, default to false)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudTenantWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudTenantWrapper getTenant(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("refresh", refresh));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocsCloudTenantWrapper> localVarReturnType = new TypeReference<DocsCloudTenantWrapper>() {};
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
   * Get the DocsCloud tenant configuration
   * Returns the DocsCloud tenant configuration of the current portal.
   *
   * REST API Reference for getTenantConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-config/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant configuration from DocsCloud again. (optional, default to false)
   * @return DocsCloudConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudConfigWrapper getTenantConfig(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getTenantConfig(refresh, Collections.emptyMap());
  }


  /**
   * Get the DocsCloud tenant configuration
   * Returns the DocsCloud tenant configuration of the current portal.
   *
   * REST API Reference for getTenantConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-config/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant configuration from DocsCloud again. (optional, default to false)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudConfigWrapper getTenantConfig(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/config";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("refresh", refresh));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocsCloudConfigWrapper> localVarReturnType = new TypeReference<DocsCloudConfigWrapper>() {};
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
   * Get the DocsCloud tenant information
   * Returns the DocsCloud license and server information with usage statistics of the current portal.
   *
   * REST API Reference for getTenantInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-info/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant information from DocsCloud again. (optional, default to false)
   * @return DocsCloudTenantInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudTenantInfoWrapper getTenantInfo(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getTenantInfo(refresh, Collections.emptyMap());
  }


  /**
   * Get the DocsCloud tenant information
   * Returns the DocsCloud license and server information with usage statistics of the current portal.
   *
   * REST API Reference for getTenantInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-info/
   *
   * @param refresh Specifies whether to bypass the cache and request the tenant information from DocsCloud again. (optional, default to false)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudTenantInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudTenantInfoWrapper getTenantInfo(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/info";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("refresh", refresh));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocsCloudTenantInfoWrapper> localVarReturnType = new TypeReference<DocsCloudTenantInfoWrapper>() {};
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
   * Get the DocsCloud tenant quota
   * Returns the DocsCloud user quota (active users) of the current portal.
   *
   * REST API Reference for getTenantQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota/
   *
   * @param refresh Specifies whether to bypass the cache and request the user quota from DocsCloud again. (optional, default to false)
   * @return DocsCloudQuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudQuotaWrapper getTenantQuota(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getTenantQuota(refresh, Collections.emptyMap());
  }


  /**
   * Get the DocsCloud tenant quota
   * Returns the DocsCloud user quota (active users) of the current portal.
   *
   * REST API Reference for getTenantQuota Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota/
   *
   * @param refresh Specifies whether to bypass the cache and request the user quota from DocsCloud again. (optional, default to false)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudQuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudQuotaWrapper getTenantQuota(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/quota";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("refresh", refresh));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocsCloudQuotaWrapper> localVarReturnType = new TypeReference<DocsCloudQuotaWrapper>() {};
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
   * Get the status of the DocsCloud tenant quota report generation
   * Returns the status of generating the DocsCloud user quota report.
   *
   * REST API Reference for getTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getTenantQuotaReport() throws ApiException {
    return this.getTenantQuotaReport(Collections.emptyMap());
  }


  /**
   * Get the status of the DocsCloud tenant quota report generation
   * Returns the status of generating the DocsCloud user quota report.
   *
   * REST API Reference for getTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getTenantQuotaReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/quota/report";

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

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
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
   * Get the DocsCloud tenant usage
   * Returns the DocsCloud usage statistics of the current portal.
   *
   * REST API Reference for getTenantUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-usage/
   *
   * @param refresh Specifies whether to bypass the cache and request the usage statistics from DocsCloud again. (optional, default to false)
   * @return DocsCloudUsageWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudUsageWrapper getTenantUsage(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getTenantUsage(refresh, Collections.emptyMap());
  }


  /**
   * Get the DocsCloud tenant usage
   * Returns the DocsCloud usage statistics of the current portal.
   *
   * REST API Reference for getTenantUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-usage/
   *
   * @param refresh Specifies whether to bypass the cache and request the usage statistics from DocsCloud again. (optional, default to false)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudUsageWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudUsageWrapper getTenantUsage(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/usage";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("refresh", refresh));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocsCloudUsageWrapper> localVarReturnType = new TypeReference<DocsCloudUsageWrapper>() {};
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
   * Start the DocsCloud trial
   * Starts the DocsCloud trial.
   *
   * REST API Reference for startDocsCloudTrial Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-docs-cloud-trial/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper startDocsCloudTrial() throws ApiException {
    return this.startDocsCloudTrial(Collections.emptyMap());
  }


  /**
   * Start the DocsCloud trial
   * Starts the DocsCloud trial.
   *
   * REST API Reference for startDocsCloudTrial Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-docs-cloud-trial/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper startDocsCloudTrial(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/trial";

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
   * Switch the DocsCloud subscription to DocsCloudDevPack
   * Switches the current DocsCloud subscription to DocsCloudDevPack: charges the price difference  from the wallet and transfers the subscription (with its license) to the target product.  The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
   *
   * REST API Reference for switchToDevPack Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/switch-to-dev-pack/
   *
   * @param docsCloudDevPackRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper switchToDevPack(@javax.annotation.Nullable DocsCloudDevPackRequestDto docsCloudDevPackRequestDto) throws ApiException {
    return this.switchToDevPack(docsCloudDevPackRequestDto, Collections.emptyMap());
  }


  /**
   * Switch the DocsCloud subscription to DocsCloudDevPack
   * Switches the current DocsCloud subscription to DocsCloudDevPack: charges the price difference  from the wallet and transfers the subscription (with its license) to the target product.  The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
   *
   * REST API Reference for switchToDevPack Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/switch-to-dev-pack/
   *
   * @param docsCloudDevPackRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper switchToDevPack(@javax.annotation.Nullable DocsCloudDevPackRequestDto docsCloudDevPackRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = docsCloudDevPackRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/switchtodevpack";

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
   * Terminate the DocsCloud tenant quota report generation
   * Terminates generating the DocsCloud user quota report.
   *
   * REST API Reference for terminateTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tenant-quota-report/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateTenantQuotaReport() throws ApiException {
    this.terminateTenantQuotaReport(Collections.emptyMap());
  }


  /**
   * Terminate the DocsCloud tenant quota report generation
   * Terminates generating the DocsCloud user quota report.
   *
   * REST API Reference for terminateTenantQuotaReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tenant-quota-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateTenantQuotaReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/quota/report";

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

  /**
   * Update the DocsCloud tenant configuration
   * Updates the DocsCloud tenant configuration of the current portal with the parameters specified in the request.
   *
   * REST API Reference for updateTenantConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tenant-config/
   *
   * @param docsCloudConfig  (optional)
   * @return DocsCloudConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudConfigWrapper updateTenantConfig(@javax.annotation.Nullable DocsCloudConfig docsCloudConfig) throws ApiException {
    return this.updateTenantConfig(docsCloudConfig, Collections.emptyMap());
  }


  /**
   * Update the DocsCloud tenant configuration
   * Updates the DocsCloud tenant configuration of the current portal with the parameters specified in the request.
   *
   * REST API Reference for updateTenantConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tenant-config/
   *
   * @param docsCloudConfig  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocsCloudConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public DocsCloudConfigWrapper updateTenantConfig(@javax.annotation.Nullable DocsCloudConfig docsCloudConfig, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = docsCloudConfig;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/docscloud/tenant/config";

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

    TypeReference<DocsCloudConfigWrapper> localVarReturnType = new TypeReference<DocsCloudConfigWrapper>() {};
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
