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

package org.openapitools.client.api.Portal;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.BalanceWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ChangeWalletServiceStateRequestDto;
import org.openapitools.client.model.CurrenciesArrayWrapper;
import org.openapitools.client.model.CustomerInfoWrapper;
import org.openapitools.client.model.CustomerOperationsReportRequestDto;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PaymentCalculationWrapper;
import org.openapitools.client.model.PaymentUrlRequestsDto;
import org.openapitools.client.model.QuantityRequestDto;
import org.openapitools.client.model.QuotaArrayWrapper;
import org.openapitools.client.model.QuotaWrapper;
import org.openapitools.client.model.ReportWrapper;
import org.openapitools.client.model.SalesRequestsDto;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TenantWalletService;
import org.openapitools.client.model.TenantWalletServiceSettingsWrapper;
import org.openapitools.client.model.TenantWalletSettingsWrapper;
import org.openapitools.client.model.TopUpDepositRequestDto;
import org.openapitools.client.model.UnknownWrapper;
import org.openapitools.client.model.WalletQuantityRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PaymentApi extends BaseApi {

  public PaymentApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PaymentApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Calculate the wallet payment amount
   * Calculates an amount of the wallet payment with the parameters specified in the request.
   *
   * REST API Reference for calculateWalletPayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-wallet-payment/
   *
   * @param walletQuantityRequestDto  (optional)
   * @return PaymentCalculationWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentCalculationWrapper calculateWalletPayment(@javax.annotation.Nullable WalletQuantityRequestDto walletQuantityRequestDto) throws ApiException {
    return this.calculateWalletPayment(walletQuantityRequestDto, Collections.emptyMap());
  }


  /**
   * Calculate the wallet payment amount
   * Calculates an amount of the wallet payment with the parameters specified in the request.
   *
   * REST API Reference for calculateWalletPayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-wallet-payment/
   *
   * @param walletQuantityRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentCalculationWrapper
   * @throws ApiException if fails to make API call
   */
  public PaymentCalculationWrapper calculateWalletPayment(@javax.annotation.Nullable WalletQuantityRequestDto walletQuantityRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walletQuantityRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/calculatewallet";

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
   * Change wallet service state
   * Changes the wallet service state.
   *
   * REST API Reference for changeTenantWalletServiceState Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-tenant-wallet-service-state/
   *
   * @param changeWalletServiceStateRequestDto  (optional)
   * @return TenantWalletServiceSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletServiceSettingsWrapper changeTenantWalletServiceState(@javax.annotation.Nullable ChangeWalletServiceStateRequestDto changeWalletServiceStateRequestDto) throws ApiException {
    return this.changeTenantWalletServiceState(changeWalletServiceStateRequestDto, Collections.emptyMap());
  }


  /**
   * Change wallet service state
   * Changes the wallet service state.
   *
   * REST API Reference for changeTenantWalletServiceState Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-tenant-wallet-service-state/
   *
   * @param changeWalletServiceStateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantWalletServiceSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletServiceSettingsWrapper changeTenantWalletServiceState(@javax.annotation.Nullable ChangeWalletServiceStateRequestDto changeWalletServiceStateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = changeWalletServiceStateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicestate";

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

    TypeReference<TenantWalletServiceSettingsWrapper> localVarReturnType = new TypeReference<TenantWalletServiceSettingsWrapper>() {};
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
   * Start the customer operations report generation
   * Starts generating a customer operations report as an xlsx file and saves it in Documents.
   *
   * REST API Reference for createCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-operations-report/
   *
   * @param customerOperationsReportRequestDto  (optional)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerOperationsReport(@javax.annotation.Nullable CustomerOperationsReportRequestDto customerOperationsReportRequestDto) throws ApiException {
    return this.createCustomerOperationsReport(customerOperationsReportRequestDto, Collections.emptyMap());
  }


  /**
   * Start the customer operations report generation
   * Starts generating a customer operations report as an xlsx file and saves it in Documents.
   *
   * REST API Reference for createCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-operations-report/
   *
   * @param customerOperationsReportRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerOperationsReport(@javax.annotation.Nullable CustomerOperationsReportRequestDto customerOperationsReportRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = customerOperationsReportRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/operationsreport";

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
   * Get the checkout setup page URL
   * Returns the URL to the checkout setup page.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The URL where the user will be redirected after completing the setup. (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getCheckoutSetupUrl(@javax.annotation.Nullable String backUrl) throws ApiException {
    return this.getCheckoutSetupUrl(backUrl, Collections.emptyMap());
  }


  /**
   * Get the checkout setup page URL
   * Returns the URL to the checkout setup page.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The URL where the user will be redirected after completing the setup. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getCheckoutSetupUrl(@javax.annotation.Nullable String backUrl, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/chechoutsetupurl";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("BackUrl", backUrl));
      
    
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
   * Get the customer balance
   * Returns the customer balance from the accounting service.
   *
   * REST API Reference for getCustomerBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @return BalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public BalanceWrapper getCustomerBalance(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getCustomerBalance(refresh, Collections.emptyMap());
  }


  /**
   * Get the customer balance
   * Returns the customer balance from the accounting service.
   *
   * REST API Reference for getCustomerBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public BalanceWrapper getCustomerBalance(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/balance";

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

    TypeReference<BalanceWrapper> localVarReturnType = new TypeReference<BalanceWrapper>() {};
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
   * Get the customer information
   * Returns the customer information.
   *
   * REST API Reference for getCustomerInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @return CustomerInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerInfoWrapper getCustomerInfo(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getCustomerInfo(refresh, Collections.emptyMap());
  }


  /**
   * Get the customer information
   * Returns the customer information.
   *
   * REST API Reference for getCustomerInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomerInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerInfoWrapper getCustomerInfo(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customerinfo";

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

    TypeReference<CustomerInfoWrapper> localVarReturnType = new TypeReference<CustomerInfoWrapper>() {};
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
   * Get the customer operations
   * Returns the report of customer operations from the accounting service.
   *
   * REST API Reference for getCustomerOperations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
   *
   * @param startDate The report start date. (optional)
   * @param endDate The report end date. (optional)
   * @param participantName The participant name. (optional)
   * @param credit Specifies whether to include credit operations in the report. The default value is true. (optional)
   * @param debit Specifies whether to include debit operations in the report. The default value is true. (optional)
   * @param offset The number of items to skip for pagination. The default value is 0. (optional)
   * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit) throws ApiException {
    return this.getCustomerOperations(startDate, endDate, participantName, credit, debit, offset, limit, Collections.emptyMap());
  }


  /**
   * Get the customer operations
   * Returns the report of customer operations from the accounting service.
   *
   * REST API Reference for getCustomerOperations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
   *
   * @param startDate The report start date. (optional)
   * @param endDate The report end date. (optional)
   * @param participantName The participant name. (optional)
   * @param credit Specifies whether to include credit operations in the report. The default value is true. (optional)
   * @param debit Specifies whether to include debit operations in the report. The default value is true. (optional)
   * @param offset The number of items to skip for pagination. The default value is 0. (optional)
   * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/operations";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("participantName", participantName));
    localVarQueryParams.addAll(apiClient.parameterToPair("credit", credit));
    localVarQueryParams.addAll(apiClient.parameterToPair("debit", debit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ReportWrapper> localVarReturnType = new TypeReference<ReportWrapper>() {};
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
   * Get the status of the customer operations report generation
   * Returns the status of generating a customer operations report.
   *
   * REST API Reference for getCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerOperationsReport() throws ApiException {
    return this.getCustomerOperationsReport(Collections.emptyMap());
  }


  /**
   * Get the status of the customer operations report generation
   * Returns the status of generating a customer operations report.
   *
   * REST API Reference for getCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerOperationsReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/operationsreport";

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
   * Get the payment account
   * Returns the URL to the payment account.
   *
   * REST API Reference for getPaymentAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
   *
   * @param backUrl The URL where the user will be redirected after payment processing. (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentAccount(@javax.annotation.Nullable String backUrl) throws ApiException {
    return this.getPaymentAccount(backUrl, Collections.emptyMap());
  }


  /**
   * Get the payment account
   * Returns the URL to the payment account.
   *
   * REST API Reference for getPaymentAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
   *
   * @param backUrl The URL where the user will be redirected after payment processing. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentAccount(@javax.annotation.Nullable String backUrl, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/account";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("backUrl", backUrl));
      
    
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
   * Get currencies
   * Returns the available portal currencies.
   *
   * REST API Reference for getPaymentCurrencies Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-currencies/
   *
   * @return CurrenciesArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CurrenciesArrayWrapper getPaymentCurrencies() throws ApiException {
    return this.getPaymentCurrencies(Collections.emptyMap());
  }


  /**
   * Get currencies
   * Returns the available portal currencies.
   *
   * REST API Reference for getPaymentCurrencies Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-currencies/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return CurrenciesArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CurrenciesArrayWrapper getPaymentCurrencies(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/currencies";

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

    TypeReference<CurrenciesArrayWrapper> localVarReturnType = new TypeReference<CurrenciesArrayWrapper>() {};
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
   * Get quotas
   * Returns the available portal quotas.
   *
   * REST API Reference for getPaymentQuotas Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
   *
   * @param wallet Specifies whether to return the wallet quotas only. (optional)
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getPaymentQuotas(@javax.annotation.Nullable Boolean wallet) throws ApiException {
    return this.getPaymentQuotas(wallet, Collections.emptyMap());
  }


  /**
   * Get quotas
   * Returns the available portal quotas.
   *
   * REST API Reference for getPaymentQuotas Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
   *
   * @param wallet Specifies whether to return the wallet quotas only. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getPaymentQuotas(@javax.annotation.Nullable Boolean wallet, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/quotas";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("wallet", wallet));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<QuotaArrayWrapper> localVarReturnType = new TypeReference<QuotaArrayWrapper>() {};
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
   * Get the payment page URL
   * Returns the URL to the payment page.
   *
   * REST API Reference for getPaymentUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/
   *
   * @param paymentUrlRequestsDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentUrl(@javax.annotation.Nullable PaymentUrlRequestsDto paymentUrlRequestsDto) throws ApiException {
    return this.getPaymentUrl(paymentUrlRequestsDto, Collections.emptyMap());
  }


  /**
   * Get the payment page URL
   * Returns the URL to the payment page.
   *
   * REST API Reference for getPaymentUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/
   *
   * @param paymentUrlRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentUrl(@javax.annotation.Nullable PaymentUrlRequestsDto paymentUrlRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentUrlRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/url";

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
   * Get prices
   * Returns the available portal prices.
   *
   * REST API Reference for getPortalPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-prices/
   *
   * @return UnknownWrapper
   * @throws ApiException if fails to make API call
   */
  public UnknownWrapper getPortalPrices() throws ApiException {
    return this.getPortalPrices(Collections.emptyMap());
  }


  /**
   * Get prices
   * Returns the available portal prices.
   *
   * REST API Reference for getPortalPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-prices/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return UnknownWrapper
   * @throws ApiException if fails to make API call
   */
  public UnknownWrapper getPortalPrices(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/prices";

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

    TypeReference<UnknownWrapper> localVarReturnType = new TypeReference<UnknownWrapper>() {};
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
   * Get quota payment information
   * Returns the payment information about the current portal quota.
   *
   * REST API Reference for getQuotaPaymentInformation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @return QuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaWrapper getQuotaPaymentInformation(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getQuotaPaymentInformation(refresh, Collections.emptyMap());
  }


  /**
   * Get quota payment information
   * Returns the payment information about the current portal quota.
   *
   * REST API Reference for getQuotaPaymentInformation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return QuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaWrapper getQuotaPaymentInformation(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/quota";

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

    TypeReference<QuotaWrapper> localVarReturnType = new TypeReference<QuotaWrapper>() {};
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
   * Get wallet services settings
   * Returns the wallet services settings.
   *
   * REST API Reference for getTenantWalletServiceSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-service-settings/
   *
   * @return TenantWalletServiceSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletServiceSettingsWrapper getTenantWalletServiceSettings() throws ApiException {
    return this.getTenantWalletServiceSettings(Collections.emptyMap());
  }


  /**
   * Get wallet services settings
   * Returns the wallet services settings.
   *
   * REST API Reference for getTenantWalletServiceSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-service-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantWalletServiceSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletServiceSettingsWrapper getTenantWalletServiceSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicessettings";

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

    TypeReference<TenantWalletServiceSettingsWrapper> localVarReturnType = new TypeReference<TenantWalletServiceSettingsWrapper>() {};
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
   * Get wallet auto top-up settings
   * Returns the wallet auto top-up settings.
   *
   * REST API Reference for getTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/
   *
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper getTenantWalletSettings() throws ApiException {
    return this.getTenantWalletSettings(Collections.emptyMap());
  }


  /**
   * Get wallet auto top-up settings
   * Returns the wallet auto top-up settings.
   *
   * REST API Reference for getTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper getTenantWalletSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/topupsettings";

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

    TypeReference<TenantWalletSettingsWrapper> localVarReturnType = new TypeReference<TenantWalletSettingsWrapper>() {};
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
   * Get wallet service
   * Returns the specified wallet service.
   *
   * REST API Reference for getWalletService Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
   *
   * @param service The wallet service type. (required)
   * @return QuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaWrapper getWalletService(@javax.annotation.Nonnull TenantWalletService service) throws ApiException {
    return this.getWalletService(service, Collections.emptyMap());
  }


  /**
   * Get wallet service
   * Returns the specified wallet service.
   *
   * REST API Reference for getWalletService Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
   *
   * @param service The wallet service type. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return QuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaWrapper getWalletService(@javax.annotation.Nonnull TenantWalletService service, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'service' is set
    if (service == null) {
      throw new ApiException(400, "Missing the required parameter 'service' when calling getWalletService");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/walletservice";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("service", service));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<QuotaWrapper> localVarReturnType = new TypeReference<QuotaWrapper>() {};
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
   * Get wallet services
   * Returns the available wallet services.
   *
   * REST API Reference for getWalletServices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-services/
   *
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getWalletServices() throws ApiException {
    return this.getWalletServices(Collections.emptyMap());
  }


  /**
   * Get wallet services
   * Returns the available wallet services.
   *
   * REST API Reference for getWalletServices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-services/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getWalletServices(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/walletservices";

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

    TypeReference<QuotaArrayWrapper> localVarReturnType = new TypeReference<QuotaArrayWrapper>() {};
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
   * Send a payment request
   * Sends a request for the portal payment.
   *
   * REST API Reference for sendPaymentRequest Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
   *
   * @param salesRequestsDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendPaymentRequest(@javax.annotation.Nullable SalesRequestsDto salesRequestsDto) throws ApiException {
    this.sendPaymentRequest(salesRequestsDto, Collections.emptyMap());
  }


  /**
   * Send a payment request
   * Sends a request for the portal payment.
   *
   * REST API Reference for sendPaymentRequest Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
   *
   * @param salesRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void sendPaymentRequest(@javax.annotation.Nullable SalesRequestsDto salesRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = salesRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/request";

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

  /**
   * Set wallet auto top-up settings
   * Sets the wallet auto top-up settings.
   *
   * REST API Reference for setTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
   *
   * @param tenantWalletSettingsWrapper  (optional)
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper setTenantWalletSettings(@javax.annotation.Nullable TenantWalletSettingsWrapper tenantWalletSettingsWrapper) throws ApiException {
    return this.setTenantWalletSettings(tenantWalletSettingsWrapper, Collections.emptyMap());
  }


  /**
   * Set wallet auto top-up settings
   * Sets the wallet auto top-up settings.
   *
   * REST API Reference for setTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
   *
   * @param tenantWalletSettingsWrapper  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper setTenantWalletSettings(@javax.annotation.Nullable TenantWalletSettingsWrapper tenantWalletSettingsWrapper, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantWalletSettingsWrapper;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/topupsettings";

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

    TypeReference<TenantWalletSettingsWrapper> localVarReturnType = new TypeReference<TenantWalletSettingsWrapper>() {};
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
   * Terminate the customer operations report generation
   * Terminates generating a customer operations report.
   *
   * REST API Reference for terminateCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-operations-report/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerOperationsReport() throws ApiException {
    this.terminateCustomerOperationsReport(Collections.emptyMap());
  }


  /**
   * Terminate the customer operations report generation
   * Terminates generating a customer operations report.
   *
   * REST API Reference for terminateCustomerOperationsReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-operations-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerOperationsReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/operationsreport";

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
   * Put money on deposit
   * Returns the result of putting money on deposit.
   *
   * REST API Reference for topUpDeposit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/top-up-deposit/
   *
   * @param topUpDepositRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper topUpDeposit(@javax.annotation.Nullable TopUpDepositRequestDto topUpDepositRequestDto) throws ApiException {
    return this.topUpDeposit(topUpDepositRequestDto, Collections.emptyMap());
  }


  /**
   * Put money on deposit
   * Returns the result of putting money on deposit.
   *
   * REST API Reference for topUpDeposit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/top-up-deposit/
   *
   * @param topUpDepositRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper topUpDeposit(@javax.annotation.Nullable TopUpDepositRequestDto topUpDepositRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = topUpDepositRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/deposit";

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
   * Update the payment quantity
   * Updates the payment quantity with the parameters specified in the request.
   *
   * REST API Reference for updatePayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-payment/
   *
   * @param quantityRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updatePayment(@javax.annotation.Nullable QuantityRequestDto quantityRequestDto) throws ApiException {
    return this.updatePayment(quantityRequestDto, Collections.emptyMap());
  }


  /**
   * Update the payment quantity
   * Updates the payment quantity with the parameters specified in the request.
   *
   * REST API Reference for updatePayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-payment/
   *
   * @param quantityRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updatePayment(@javax.annotation.Nullable QuantityRequestDto quantityRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = quantityRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/update";

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
   * Update the wallet payment quantity
   * Updates the wallet payment quantity with the parameters specified in the request.
   *
   * REST API Reference for updateWalletPayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-wallet-payment/
   *
   * @param walletQuantityRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateWalletPayment(@javax.annotation.Nullable WalletQuantityRequestDto walletQuantityRequestDto) throws ApiException {
    return this.updateWalletPayment(walletQuantityRequestDto, Collections.emptyMap());
  }


  /**
   * Update the wallet payment quantity
   * Updates the wallet payment quantity with the parameters specified in the request.
   *
   * REST API Reference for updateWalletPayment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-wallet-payment/
   *
   * @param walletQuantityRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateWalletPayment(@javax.annotation.Nullable WalletQuantityRequestDto walletQuantityRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walletQuantityRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/updatewallet";

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
