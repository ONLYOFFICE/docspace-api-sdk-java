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

package org.openapitools.client.api.Portal;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AiPricesResponseWrapper;
import org.openapitools.client.model.BalanceWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ChangeWalletServiceStateRequestDto;
import org.openapitools.client.model.CreditAiBalanceRequestDto;
import org.openapitools.client.model.CurrenciesArrayWrapper;
import org.openapitools.client.model.CustomerInfoWrapper;
import org.openapitools.client.model.CustomerOperationsReportRequestDto;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.GetPortalPrices200Response;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OperationOrderType;
import org.openapitools.client.model.OperationStatus;
import org.openapitools.client.model.OperationType;
import org.openapitools.client.model.PaymentCalculationWrapper;
import org.openapitools.client.model.PaymentUrlRequestDto;
import org.openapitools.client.model.QuantityRequestDto;
import org.openapitools.client.model.QuotaArrayWrapper;
import org.openapitools.client.model.QuotaWrapper;
import org.openapitools.client.model.ReportWrapper;
import org.openapitools.client.model.RestrictedModelsResponseWrapper;
import org.openapitools.client.model.SalesRequestsDto;
import org.openapitools.client.model.ServicePaymentWrapper;
import org.openapitools.client.model.SetRestrictedAiModelsRequestDto;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TenantWalletService;
import org.openapitools.client.model.TenantWalletServiceSettingsWrapper;
import org.openapitools.client.model.TenantWalletSettingsWrapper;
import org.openapitools.client.model.TopUpDepositRequestDto;
import java.net.URI;
import org.openapitools.client.model.WalletQuantityRequestDto;
import org.openapitools.client.model.WalletServiceArrayWrapper;
import org.openapitools.client.model.WalletServiceWrapper;


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
   * Change tenant wallet service state
   * Changes the state of a wallet service for the current tenant.  Requires permission to edit portal settings and a configured tariff service.  Adds or removes the specified service from the enabled services list based on the enabled flag.
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
   * Change tenant wallet service state
   * Changes the state of a wallet service for the current tenant.  Requires permission to edit portal settings and a configured tariff service.  Adds or removes the specified service from the enabled services list based on the enabled flag.
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
   * Credit AI balance
   * Credits AI quota to the customer AI sub-account from their main balance.  Requires the customer to have a configured payment method.
   *
   * REST API Reference for creditAiBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/credit-ai-balance/
   *
   * @param creditAiBalanceRequestDto  (optional)
   * @return ServicePaymentWrapper
   * @throws ApiException if fails to make API call
   */
  public ServicePaymentWrapper creditAiBalance(@javax.annotation.Nullable CreditAiBalanceRequestDto creditAiBalanceRequestDto) throws ApiException {
    return this.creditAiBalance(creditAiBalanceRequestDto, Collections.emptyMap());
  }


  /**
   * Credit AI balance
   * Credits AI quota to the customer AI sub-account from their main balance.  Requires the customer to have a configured payment method.
   *
   * REST API Reference for creditAiBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/credit-ai-balance/
   *
   * @param creditAiBalanceRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServicePaymentWrapper
   * @throws ApiException if fails to make API call
   */
  public ServicePaymentWrapper creditAiBalance(@javax.annotation.Nullable CreditAiBalanceRequestDto creditAiBalanceRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = creditAiBalanceRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/creditaibalance";

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

    TypeReference<ServicePaymentWrapper> localVarReturnType = new TypeReference<ServicePaymentWrapper>() {};
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
   * Get AI model prices
   * Retrieves the pricing information for AI models including chat, embedding, and web search services.  The prices are returned in the configured currency and normalized per million tokens.  Requires administrator permissions to access.
   *
   * REST API Reference for getAiPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/
   *
   * @return AiPricesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AiPricesResponseWrapper getAiPrices() throws ApiException {
    return this.getAiPrices(Collections.emptyMap());
  }


  /**
   * Get AI model prices
   * Retrieves the pricing information for AI models including chat, embedding, and web search services.  The prices are returned in the configured currency and normalized per million tokens.  Requires administrator permissions to access.
   *
   * REST API Reference for getAiPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPricesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AiPricesResponseWrapper getAiPrices(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/ai-prices";

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

    TypeReference<AiPricesResponseWrapper> localVarReturnType = new TypeReference<AiPricesResponseWrapper>() {};
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
   * Get the checkout setup page URL
   * Returns the URL to the checkout setup page.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The URL where the user will be redirected after setup cancellation. (required)
   * @param successUrl The URL where the user will be redirected after successful payment. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getCheckoutSetupUrl(@javax.annotation.Nonnull URI backUrl, @javax.annotation.Nonnull URI successUrl) throws ApiException {
    return this.getCheckoutSetupUrl(backUrl, successUrl, Collections.emptyMap());
  }


  /**
   * Get the checkout setup page URL
   * Returns the URL to the checkout setup page.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The URL where the user will be redirected after setup cancellation. (required)
   * @param successUrl The URL where the user will be redirected after successful payment. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getCheckoutSetupUrl(@javax.annotation.Nonnull URI backUrl, @javax.annotation.Nonnull URI successUrl, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'backUrl' is set
    if (backUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'backUrl' when calling getCheckoutSetupUrl");
    }
    
    // verify the required parameter 'successUrl' is set
    if (successUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'successUrl' when calling getCheckoutSetupUrl");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/checkoutsetupurl";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("BackUrl", backUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("SuccessUrl", successUrl));
      
    
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
   * Get the customer AI balance
   * Returns the AI quota balance of a customer from the accounting service.
   *
   * REST API Reference for getCustomerAiBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-ai-balance/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @return BalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public BalanceWrapper getCustomerAiBalance(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getCustomerAiBalance(refresh, Collections.emptyMap());
  }


  /**
   * Get the customer AI balance
   * Returns the AI quota balance of a customer from the accounting service.
   *
   * REST API Reference for getCustomerAiBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-ai-balance/
   *
   * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public BalanceWrapper getCustomerAiBalance(@javax.annotation.Nullable Boolean refresh, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/aibalance";

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
   * @param offset The number of items to skip for pagination. The default value is 0. (optional)
   * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
   * @param serviceName The service name. (optional)
   * @param startDate The report start date. (optional)
   * @param endDate The report end date. (optional)
   * @param participantName The participant name. (optional)
   * @param credit Specifies whether to include credit operations in the report. (optional)
   * @param debit Specifies whether to include debit operations in the report. (optional)
   * @param type The operation type to filter by. (optional)
   * @param status The operation status to filter by. (optional)
   * @param orderBy The field to order by. (optional)
   * @param orderType Order direction: Ascending or Descending. (optional)
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String serviceName, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable OperationType type, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType) throws ApiException {
    return this.getCustomerOperations(offset, limit, serviceName, startDate, endDate, participantName, credit, debit, type, status, orderBy, orderType, Collections.emptyMap());
  }


  /**
   * Get the customer operations
   * Returns the report of customer operations from the accounting service.
   *
   * REST API Reference for getCustomerOperations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
   *
   * @param offset The number of items to skip for pagination. The default value is 0. (optional)
   * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
   * @param serviceName The service name. (optional)
   * @param startDate The report start date. (optional)
   * @param endDate The report end date. (optional)
   * @param participantName The participant name. (optional)
   * @param credit Specifies whether to include credit operations in the report. (optional)
   * @param debit Specifies whether to include debit operations in the report. (optional)
   * @param type The operation type to filter by. (optional)
   * @param status The operation status to filter by. (optional)
   * @param orderBy The field to order by. (optional)
   * @param orderType Order direction: Ascending or Descending. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String serviceName, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable OperationType type, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType, Map<String, String> additionalHeaders) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("ServiceName", serviceName));
    localVarQueryParams.addAll(apiClient.parameterToPair("StartDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("EndDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("ParticipantName", participantName));
    localVarQueryParams.addAll(apiClient.parameterToPair("Credit", credit));
    localVarQueryParams.addAll(apiClient.parameterToPair("Debit", debit));
    localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
    localVarQueryParams.addAll(apiClient.parameterToPair("Status", status));
    localVarQueryParams.addAll(apiClient.parameterToPair("OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("OrderType", orderType));
      
    
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
  public StringWrapper getPaymentAccount(@javax.annotation.Nullable URI backUrl) throws ApiException {
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
  public StringWrapper getPaymentAccount(@javax.annotation.Nullable URI backUrl, Map<String, String> additionalHeaders) throws ApiException {
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
   * @param paymentUrlRequestDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentUrl(@javax.annotation.Nullable PaymentUrlRequestDto paymentUrlRequestDto) throws ApiException {
    return this.getPaymentUrl(paymentUrlRequestDto, Collections.emptyMap());
  }


  /**
   * Get the payment page URL
   * Returns the URL to the payment page.
   *
   * REST API Reference for getPaymentUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/
   *
   * @param paymentUrlRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentUrl(@javax.annotation.Nullable PaymentUrlRequestDto paymentUrlRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentUrlRequestDto;
    
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
   * @return GetPortalPrices200Response
   * @throws ApiException if fails to make API call
   */
  public GetPortalPrices200Response getPortalPrices() throws ApiException {
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
   * @return GetPortalPrices200Response
   * @throws ApiException if fails to make API call
   */
  public GetPortalPrices200Response getPortalPrices(Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<GetPortalPrices200Response> localVarReturnType = new TypeReference<GetPortalPrices200Response>() {};
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
   * Get restricted AI models
   * Returns the list of AI chat model IDs that are restricted (disabled) for the current tenant.  Restricted models cannot be used for AI chat conversations by any user within the portal.  Only DocSpace administrators can access this endpoint.
   *
   * REST API Reference for getRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/
   *
   * @return RestrictedModelsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedModelsResponseWrapper getRestrictedAiModels() throws ApiException {
    return this.getRestrictedAiModels(Collections.emptyMap());
  }


  /**
   * Get restricted AI models
   * Returns the list of AI chat model IDs that are restricted (disabled) for the current tenant.  Restricted models cannot be used for AI chat conversations by any user within the portal.  Only DocSpace administrators can access this endpoint.
   *
   * REST API Reference for getRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return RestrictedModelsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedModelsResponseWrapper getRestrictedAiModels(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/ai-model/restrictions";

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

    TypeReference<RestrictedModelsResponseWrapper> localVarReturnType = new TypeReference<RestrictedModelsResponseWrapper>() {};
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
   * Gets the wallet service settings for the tenant.
   * Retrieves configuration settings related to the wallet service associated with the current tenant.
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
   * Gets the wallet service settings for the tenant.
   * Retrieves configuration settings related to the wallet service associated with the current tenant.
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
   * Gets the tenant wallet auto top up settings
   * Returns the wallet auto top up settings for the current tenant.
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
   * Gets the tenant wallet auto top up settings
   * Returns the wallet auto top up settings for the current tenant.
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
   * @return WalletServiceWrapper
   * @throws ApiException if fails to make API call
   */
  public WalletServiceWrapper getWalletService(@javax.annotation.Nonnull TenantWalletService service) throws ApiException {
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
   * @return WalletServiceWrapper
   * @throws ApiException if fails to make API call
   */
  public WalletServiceWrapper getWalletService(@javax.annotation.Nonnull TenantWalletService service, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<WalletServiceWrapper> localVarReturnType = new TypeReference<WalletServiceWrapper>() {};
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
   * @return WalletServiceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WalletServiceArrayWrapper getWalletServices() throws ApiException {
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
   * @return WalletServiceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WalletServiceArrayWrapper getWalletServices(Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<WalletServiceArrayWrapper> localVarReturnType = new TypeReference<WalletServiceArrayWrapper>() {};
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
   * Set restricted AI models
   * Overwrites the entire set of restricted AI model IDs for the current tenant.  The request body must contain the complete desired set — to add a restriction, include the new model alongside existing ones;  to remove one, omit it. An empty set lifts all restrictions. Only the portal payer can perform this action.
   *
   * REST API Reference for setRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/
   *
   * @param setRestrictedAiModelsRequestDto  (optional)
   * @return RestrictedModelsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedModelsResponseWrapper setRestrictedAiModels(@javax.annotation.Nullable SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto) throws ApiException {
    return this.setRestrictedAiModels(setRestrictedAiModelsRequestDto, Collections.emptyMap());
  }


  /**
   * Set restricted AI models
   * Overwrites the entire set of restricted AI model IDs for the current tenant.  The request body must contain the complete desired set — to add a restriction, include the new model alongside existing ones;  to remove one, omit it. An empty set lifts all restrictions. Only the portal payer can perform this action.
   *
   * REST API Reference for setRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/
   *
   * @param setRestrictedAiModelsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RestrictedModelsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedModelsResponseWrapper setRestrictedAiModels(@javax.annotation.Nullable SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setRestrictedAiModelsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/ai-model/restrictions";

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

    TypeReference<RestrictedModelsResponseWrapper> localVarReturnType = new TypeReference<RestrictedModelsResponseWrapper>() {};
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
   * Set the wallet auto top up settings
   * Updates the wallet auto top up settings for the current tenant.  Requires the tariff service to be configured and the user to be authorized as a payer.  Returns null if the tariff service is not configured or customer information/balance cannot be retrieved.
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
   * Set the wallet auto top up settings
   * Updates the wallet auto top up settings for the current tenant.  Requires the tariff service to be configured and the user to be authorized as a payer.  Returns null if the tariff service is not configured or customer information/balance cannot be retrieved.
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
