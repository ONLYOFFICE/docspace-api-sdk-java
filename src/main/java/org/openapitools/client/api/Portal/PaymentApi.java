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

import org.openapitools.client.model.ActiveServiceArrayWrapper;
import org.openapitools.client.model.AiPricesWrapper;
import org.openapitools.client.model.BalanceWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ChangeWalletServiceStateRequestDto;
import org.openapitools.client.model.CreateServiceLimitRequestDto;
import org.openapitools.client.model.CurrenciesArrayWrapper;
import org.openapitools.client.model.CustomerInfoWrapper;
import org.openapitools.client.model.CustomerMonthlyUsageArrayWrapper;
import org.openapitools.client.model.CustomerMonthlyUsageReportRequestDto;
import org.openapitools.client.model.CustomerOperationsReportRequestDto;
import org.openapitools.client.model.CustomerServiceUsageReportRequestDto;
import org.openapitools.client.model.CustomerServiceUsageReportWrapper;
import org.openapitools.client.model.DepositReportWrapper;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.GetPortalPrices200Response;
import org.openapitools.client.model.Int32Wrapper;
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
import org.openapitools.client.model.RestrictedAiModelsWrapper;
import org.openapitools.client.model.SalesRequestDto;
import org.openapitools.client.model.ServiceLimitOrderBy;
import org.openapitools.client.model.ServiceLimitReportWrapper;
import org.openapitools.client.model.ServiceLimitWrapper;
import org.openapitools.client.model.ServicePriceArrayWrapper;
import org.openapitools.client.model.SetParticipantServiceLimitsRequestDto;
import org.openapitools.client.model.SetRestrictedAiModelsRequestDto;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.SubscriptionBalanceWrapper;
import org.openapitools.client.model.TenantWalletService;
import org.openapitools.client.model.TenantWalletServiceSettingsWrapper;
import org.openapitools.client.model.TenantWalletSettingsRequestDto;
import org.openapitools.client.model.TenantWalletSettingsWrapper;
import org.openapitools.client.model.TopUpDepositRequestDto;
import java.net.URI;
import org.openapitools.client.model.UpdateServiceLimitRequestDto;
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
   * Prices a wallet-service purchase without making it: it returns what buying the requested number of units would  cost right now, so a client can show the amount before asking for a confirmation. Only `productQuantityType`  `Add` (1) is accepted, the quantity must be greater than zero, and the portal needs a billing customer whose  wallet has a sub-account in the accounting currency. The caller has to be a DocSpace administrator. Nothing is  bought, charged or written down - the call is read-only and may be repeated - and the purchase itself is  `PUT api/2.0/portal/payment/updatewallet`. The answer carries the amount with its currency, the quantity it  was computed for and the identifier of the calculation. It is the price of this moment and is not held: it can  differ by the time the purchase is made.
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
   * Prices a wallet-service purchase without making it: it returns what buying the requested number of units would  cost right now, so a client can show the amount before asking for a confirmation. Only `productQuantityType`  `Add` (1) is accepted, the quantity must be greater than zero, and the portal needs a billing customer whose  wallet has a sub-account in the accounting currency. The caller has to be a DocSpace administrator. Nothing is  bought, charged or written down - the call is read-only and may be repeated - and the purchase itself is  `PUT api/2.0/portal/payment/updatewallet`. The answer carries the amount with its currency, the quantity it  was computed for and the identifier of the calculation. It is the price of this moment and is not held: it can  differ by the time the purchase is made.
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
   * Switch a wallet service
   * Switches one wallet service on or off for the portal: `service` names it and `enabled` says which way. The  portal needs a billing customer, and the caller needs both the permission to edit the portal settings and  DocSpace administrator rights. Order matters between the two AI services - AI tools has to be on before AI  search may be switched on, and switching AI tools off switches AI search off with it - so a request that  breaks that order is refused with 403. The call is mutating and idempotent: switching on a service that is  already on changes nothing. It is written to the portal audit trail, and switching AI tools notifies the  portal clients so the AI features appear or disappear for them without a reload. The whole updated set of  switched-on services comes back. Switching a service on does not buy it - its units are still bought with  `PUT api/2.0/portal/payment/updatewallet`.
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
   * Switch a wallet service
   * Switches one wallet service on or off for the portal: `service` names it and `enabled` says which way. The  portal needs a billing customer, and the caller needs both the permission to edit the portal settings and  DocSpace administrator rights. Order matters between the two AI services - AI tools has to be on before AI  search may be switched on, and switching AI tools off switches AI search off with it - so a request that  breaks that order is refused with 403. The call is mutating and idempotent: switching on a service that is  already on changes nothing. It is written to the portal audit trail, and switching AI tools notifies the  portal clients so the AI features appear or disappear for them without a reload. The whole updated set of  switched-on services comes back. Switching a service on does not buy it - its units are still bought with  `PUT api/2.0/portal/payment/updatewallet`.
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
   * Start the monthly usage report
   * Queues the wallet spending added up per calendar month as an `xlsx` file and returns the task that will build  it; the file is not ready when the response arrives. The portal needs a billing customer and the caller has to  be a DocSpace administrator. The body takes only the period - `startDate` and `endDate`, both inclusive - and  an empty body covers everything from the portal creation date to now; the months are cut in the portal time  zone, exactly as in `GET api/2.0/portal/payment/customer/usage/monthly`. Poll  `GET api/2.0/portal/payment/customer/usage/monthly/report` until `isCompleted` is true, then take the file  from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents  section, where it counts against the portal storage like any other file. One monthly usage report per user is  tracked at a time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/usage/monthly/report` stops it. There is no service filter here: for a  report per service use `POST api/2.0/portal/payment/customer/usage/report`.
   *
   * REST API Reference for createCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-monthly-usage-report/
   *
   * @param customerMonthlyUsageReportRequestDto  (optional)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerMonthlyUsageReport(@javax.annotation.Nullable CustomerMonthlyUsageReportRequestDto customerMonthlyUsageReportRequestDto) throws ApiException {
    return this.createCustomerMonthlyUsageReport(customerMonthlyUsageReportRequestDto, Collections.emptyMap());
  }


  /**
   * Start the monthly usage report
   * Queues the wallet spending added up per calendar month as an `xlsx` file and returns the task that will build  it; the file is not ready when the response arrives. The portal needs a billing customer and the caller has to  be a DocSpace administrator. The body takes only the period - `startDate` and `endDate`, both inclusive - and  an empty body covers everything from the portal creation date to now; the months are cut in the portal time  zone, exactly as in `GET api/2.0/portal/payment/customer/usage/monthly`. Poll  `GET api/2.0/portal/payment/customer/usage/monthly/report` until `isCompleted` is true, then take the file  from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents  section, where it counts against the portal storage like any other file. One monthly usage report per user is  tracked at a time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/usage/monthly/report` stops it. There is no service filter here: for a  report per service use `POST api/2.0/portal/payment/customer/usage/report`.
   *
   * REST API Reference for createCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-monthly-usage-report/
   *
   * @param customerMonthlyUsageReportRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerMonthlyUsageReport(@javax.annotation.Nullable CustomerMonthlyUsageReportRequestDto customerMonthlyUsageReportRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = customerMonthlyUsageReportRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/monthly/report";

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
   * Start the operations report
   * Queues the history of the wallet movements as an `xlsx` file and returns the task that will build it; the file  is not ready when the response arrives. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/operations` -  the service names, the date range, the participant, the operation type and status, the credit and debit  directions and the ordering - and an empty body reports everything from the portal creation date to now; a  service name this installation does not sell fails with 404. Poll  `GET api/2.0/portal/payment/customer/operationsreport` until `isCompleted` is true, then take the file from  `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents section,  where it counts against the portal storage like any other file. One operations report per user is tracked at a  time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/operationsreport` stops it. A build that fails ends the task with  `error` filled in rather than failing this call.
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
   * Start the operations report
   * Queues the history of the wallet movements as an `xlsx` file and returns the task that will build it; the file  is not ready when the response arrives. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/operations` -  the service names, the date range, the participant, the operation type and status, the credit and debit  directions and the ordering - and an empty body reports everything from the portal creation date to now; a  service name this installation does not sell fails with 404. Poll  `GET api/2.0/portal/payment/customer/operationsreport` until `isCompleted` is true, then take the file from  `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents section,  where it counts against the portal storage like any other file. One operations report per user is tracked at a  time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/operationsreport` stops it. A build that fails ends the task with  `error` filled in rather than failing this call.
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
   * Start the service usage report
   * Queues the usage of the wallet services as an `xlsx` file and returns the task that will build it; the file is  not ready when the response arrives. The portal needs a billing customer and the caller has to be a DocSpace  administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/usage` - the service  names, the date range, the participant, the operation status, the usage metadata and the ordering - and an  empty body reports every service from the portal creation date to now; a service name this installation does  not sell fails with 404. Poll `GET api/2.0/portal/payment/customer/usage/report` until `isCompleted` is true,  then take the file from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's  own My documents section, where it counts against the portal storage like any other file. One service usage  report per user is tracked at a time - a call made while the previous one is still running answers with that  task - and `DELETE api/2.0/portal/payment/customer/usage/report` stops it. It is a different report from the  operations one and does not interfere with it: per-movement history is  `POST api/2.0/portal/payment/customer/operationsreport`.
   *
   * REST API Reference for createCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-service-usage-report/
   *
   * @param customerServiceUsageReportRequestDto  (optional)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerServiceUsageReport(@javax.annotation.Nullable CustomerServiceUsageReportRequestDto customerServiceUsageReportRequestDto) throws ApiException {
    return this.createCustomerServiceUsageReport(customerServiceUsageReportRequestDto, Collections.emptyMap());
  }


  /**
   * Start the service usage report
   * Queues the usage of the wallet services as an `xlsx` file and returns the task that will build it; the file is  not ready when the response arrives. The portal needs a billing customer and the caller has to be a DocSpace  administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/usage` - the service  names, the date range, the participant, the operation status, the usage metadata and the ordering - and an  empty body reports every service from the portal creation date to now; a service name this installation does  not sell fails with 404. Poll `GET api/2.0/portal/payment/customer/usage/report` until `isCompleted` is true,  then take the file from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's  own My documents section, where it counts against the portal storage like any other file. One service usage  report per user is tracked at a time - a call made while the previous one is still running answers with that  task - and `DELETE api/2.0/portal/payment/customer/usage/report` stops it. It is a different report from the  operations one and does not interfere with it: per-movement history is  `POST api/2.0/portal/payment/customer/operationsreport`.
   *
   * REST API Reference for createCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-service-usage-report/
   *
   * @param customerServiceUsageReportRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createCustomerServiceUsageReport(@javax.annotation.Nullable CustomerServiceUsageReportRequestDto customerServiceUsageReportRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = customerServiceUsageReportRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/report";

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
   * Create a service limit
   * Creates a spending limit on the AI services - AI tools and AI search together - with `scope` saying whom it  applies to: `Total` for the portal as a whole, `Global` for every user separately, `Custom` for the user in  `userId`, which only this scope takes. A personal limit applies to its user instead of the one for every user,  and the limit of the portal is checked on top of both. The portal needs a billing customer, and the caller needs  the permission to edit the portal settings as well as DocSpace administrator rights. At least one of  `amountValue` and `quantityValue` must be given; with both, the services stop as soon as either is reached. The  call is mutating and written to the portal audit trail. It is not idempotent: a second limit of the same scope,  or for the same user, is refused with 409 - change the existing one with  `PUT api/2.0/portal/payment/servicelimit` instead. The scope, the user and the period cannot be changed later.
   *
   * REST API Reference for createServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-service-limit/
   *
   * @param createServiceLimitRequestDto  (optional)
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper createServiceLimit(@javax.annotation.Nullable CreateServiceLimitRequestDto createServiceLimitRequestDto) throws ApiException {
    return this.createServiceLimit(createServiceLimitRequestDto, Collections.emptyMap());
  }


  /**
   * Create a service limit
   * Creates a spending limit on the AI services - AI tools and AI search together - with `scope` saying whom it  applies to: `Total` for the portal as a whole, `Global` for every user separately, `Custom` for the user in  `userId`, which only this scope takes. A personal limit applies to its user instead of the one for every user,  and the limit of the portal is checked on top of both. The portal needs a billing customer, and the caller needs  the permission to edit the portal settings as well as DocSpace administrator rights. At least one of  `amountValue` and `quantityValue` must be given; with both, the services stop as soon as either is reached. The  call is mutating and written to the portal audit trail. It is not idempotent: a second limit of the same scope,  or for the same user, is refused with 409 - change the existing one with  `PUT api/2.0/portal/payment/servicelimit` instead. The scope, the user and the period cannot be changed later.
   *
   * REST API Reference for createServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-service-limit/
   *
   * @param createServiceLimitRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper createServiceLimit(@javax.annotation.Nullable CreateServiceLimitRequestDto createServiceLimitRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createServiceLimitRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit";

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

    TypeReference<ServiceLimitWrapper> localVarReturnType = new TypeReference<ServiceLimitWrapper>() {};
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
   * Delete a service limit
   * Removes one spending limit on the AI services completely - the limit of the portal as a whole, the one for  every user, or a personal one - so it no longer restricts anyone. The portal needs a billing customer, and the  caller needs the permission to edit the portal settings as well as DocSpace administrator rights. The call is  destructive and cannot be undone: unlike switching a limit off with `PUT api/2.0/portal/payment/servicelimit`,  which keeps its settings, a deleted limit is gone, and a new one has to be created with  `POST api/2.0/portal/payment/servicelimit`. Deleting a personal limit lets the limit for every user apply to  that user. It is written to the portal audit trail. An ID that does not exist, belongs to another portal or is  not a limit on the AI services answers 404, which is also what a repeated deletion of the same limit gets.
   *
   * REST API Reference for deleteServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-service-limit/
   *
   * @param id The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceLimit(@javax.annotation.Nonnull Integer id) throws ApiException {
    this.deleteServiceLimit(id, Collections.emptyMap());
  }


  /**
   * Delete a service limit
   * Removes one spending limit on the AI services completely - the limit of the portal as a whole, the one for  every user, or a personal one - so it no longer restricts anyone. The portal needs a billing customer, and the  caller needs the permission to edit the portal settings as well as DocSpace administrator rights. The call is  destructive and cannot be undone: unlike switching a limit off with `PUT api/2.0/portal/payment/servicelimit`,  which keeps its settings, a deleted limit is gone, and a new one has to be created with  `POST api/2.0/portal/payment/servicelimit`. Deleting a personal limit lets the limit for every user apply to  that user. It is written to the portal audit trail. An ID that does not exist, belongs to another portal or is  not a limit on the AI services answers 404, which is also what a repeated deletion of the same limit gets.
   *
   * REST API Reference for deleteServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-service-limit/
   *
   * @param id The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceLimit(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteServiceLimit");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/{id}"
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
   * Disable the user service limits
   * Switches off every personal spending limit on the AI services in one call, so each user falls back to the limit  for every user, if one is set. The limit of the portal as a whole and the one for every user stay as they are.  The portal needs a billing customer, and the caller needs the permission to edit the portal settings as well as  DocSpace administrator rights. The switched-off limits stop restricting their users at once and are kept, so  each can be switched back on with `PUT api/2.0/portal/payment/servicelimit`. The call is mutating and  idempotent - repeating it switches off nothing more - and it is written to the portal audit trail. The answer is  the number of personal limits that were switched off, zero when none was in force. To switch off the limit of a  single user, use `PUT api/2.0/portal/payment/servicelimit` with `enabled` set to false.
   *
   * REST API Reference for disableParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/disable-participant-service-limits/
   *
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper disableParticipantServiceLimits() throws ApiException {
    return this.disableParticipantServiceLimits(Collections.emptyMap());
  }


  /**
   * Disable the user service limits
   * Switches off every personal spending limit on the AI services in one call, so each user falls back to the limit  for every user, if one is set. The limit of the portal as a whole and the one for every user stay as they are.  The portal needs a billing customer, and the caller needs the permission to edit the portal settings as well as  DocSpace administrator rights. The switched-off limits stop restricting their users at once and are kept, so  each can be switched back on with `PUT api/2.0/portal/payment/servicelimit`. The call is mutating and  idempotent - repeating it switches off nothing more - and it is written to the portal audit trail. The answer is  the number of personal limits that were switched off, zero when none was in force. To switch off the limit of a  single user, use `PUT api/2.0/portal/payment/servicelimit` with `enabled` set to false.
   *
   * REST API Reference for disableParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/disable-participant-service-limits/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper disableParticipantServiceLimits(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/participants/disable";

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

    TypeReference<Int32Wrapper> localVarReturnType = new TypeReference<Int32Wrapper>() {};
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
   * Get the service prices from the accounting service
   * Returns the price list of one wallet service as the accounting service keeps it: every price record with its  time unit, cost and resulting price, volume threshold, validity period, status and discount category. Take  the service name from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`. The caller must  be a DocSpace administrator, and the server must have the billing and accounting services configured;  otherwise the call fails with 403. The call is read-only and can be repeated safely. By default the list  also holds retired and not yet started records; `active=true` keeps only the prices in force now. A service  with no prices comes back as an empty list. Amounts are in the currency of the service, which the records do  not name. The list is cached for all portals for up to an hour, so a change in the accounting service can  take that long to appear. For the current price of every plan and wallet service as the customer sees it, use  `GET api/2.0/portal/payment/quotas`. An unknown service name fails with 500, as does an unreachable  accounting service.
   *
   * REST API Reference for getAccountingServicePrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounting-service-prices/
   *
   * @param serviceName The service whose price list is read, named the way the billing catalogue names it, such as `ai-tools` or  `backup`. Take the value from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`. (required)
   * @param active Whether the answer is narrowed to the prices in force at the moment of the call. Leaving it false also  returns the retired and the not yet started ones, which is what pricing a movement recorded in the past  needs. (optional)
   * @return ServicePriceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ServicePriceArrayWrapper getAccountingServicePrices(@javax.annotation.Nonnull String serviceName, @javax.annotation.Nullable Boolean active) throws ApiException {
    return this.getAccountingServicePrices(serviceName, active, Collections.emptyMap());
  }


  /**
   * Get the service prices from the accounting service
   * Returns the price list of one wallet service as the accounting service keeps it: every price record with its  time unit, cost and resulting price, volume threshold, validity period, status and discount category. Take  the service name from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`. The caller must  be a DocSpace administrator, and the server must have the billing and accounting services configured;  otherwise the call fails with 403. The call is read-only and can be repeated safely. By default the list  also holds retired and not yet started records; `active=true` keeps only the prices in force now. A service  with no prices comes back as an empty list. Amounts are in the currency of the service, which the records do  not name. The list is cached for all portals for up to an hour, so a change in the accounting service can  take that long to appear. For the current price of every plan and wallet service as the customer sees it, use  `GET api/2.0/portal/payment/quotas`. An unknown service name fails with 500, as does an unreachable  accounting service.
   *
   * REST API Reference for getAccountingServicePrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounting-service-prices/
   *
   * @param serviceName The service whose price list is read, named the way the billing catalogue names it, such as `ai-tools` or  `backup`. Take the value from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`. (required)
   * @param active Whether the answer is narrowed to the prices in force at the moment of the call. Leaving it false also  returns the retired and the not yet started ones, which is what pricing a movement recorded in the past  needs. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServicePriceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ServicePriceArrayWrapper getAccountingServicePrices(@javax.annotation.Nonnull String serviceName, @javax.annotation.Nullable Boolean active, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling getAccountingServicePrices");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/accounting/prices/{serviceName}"
      .replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(apiClient.parameterToString(serviceName)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("active", active));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ServicePriceArrayWrapper> localVarReturnType = new TypeReference<ServicePriceArrayWrapper>() {};
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
   * Get the active wallet services
   * Lists the wallet services the portal is running right now: the add-ons its plan pays for that are in the  active state, plus the ones an administrator switched on by hand in the wallet service settings; the Docs Connect  trial is listed as well, although it is not paid from the wallet. Only a DocSpace administrator may call it,  no billing customer is needed for it, and the call is read-only. Every item names the service, its title and  the unit it is measured in, and says whether it is a subscription; a subscribed service also carries the limit  it grants and how much of it is used where that number is known - the editor seats and the editors currently  active for Docs Connect, the purchased units and the units already consumed for disk storage. A service listed  with no limit is one whose usage is not counted this way, not one without a limit. The catalogue of what could  be switched on is `GET api/2.0/portal/payment/walletservices`, and switching one is  `POST api/2.0/portal/payment/servicestate`.
   *
   * REST API Reference for getActiveServices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-active-services/
   *
   * @return ActiveServiceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ActiveServiceArrayWrapper getActiveServices() throws ApiException {
    return this.getActiveServices(Collections.emptyMap());
  }


  /**
   * Get the active wallet services
   * Lists the wallet services the portal is running right now: the add-ons its plan pays for that are in the  active state, plus the ones an administrator switched on by hand in the wallet service settings; the Docs Connect  trial is listed as well, although it is not paid from the wallet. Only a DocSpace administrator may call it,  no billing customer is needed for it, and the call is read-only. Every item names the service, its title and  the unit it is measured in, and says whether it is a subscription; a subscribed service also carries the limit  it grants and how much of it is used where that number is known - the editor seats and the editors currently  active for Docs Connect, the purchased units and the units already consumed for disk storage. A service listed  with no limit is one whose usage is not counted this way, not one without a limit. The catalogue of what could  be switched on is `GET api/2.0/portal/payment/walletservices`, and switching one is  `POST api/2.0/portal/payment/servicestate`.
   *
   * REST API Reference for getActiveServices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-active-services/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ActiveServiceArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ActiveServiceArrayWrapper getActiveServices(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/activeservices";

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

    TypeReference<ActiveServiceArrayWrapper> localVarReturnType = new TypeReference<ActiveServiceArrayWrapper>() {};
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
   * Get AI model prices
   * Returns the price list of the AI features the portal pays for out of its wallet: the chat models with the  price of their prompt and completion tokens, the embedding models, the image models with their per-image  price, and the web search providers with the price of one search. The installation needs both a billing  service and the AI gateway configured, otherwise the answer is 403, and only a DocSpace administrator may read  it; the call is read-only. Token prices are normalised per million tokens, and every price is in the single  `currency` the answer names. Each entry carries the model identifier to use when talking to the AI operations,  its display alias, its provider with the provider icon, and a link to the model's own page. It is a list of  what the models cost and not of what the portal spent - that is `GET api/2.0/portal/payment/customer/usage` -  and it says nothing about which of them are allowed here, which is  `GET api/2.0/portal/payment/ai-model/restrictions`.
   *
   * REST API Reference for getAiPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/
   *
   * @return AiPricesWrapper
   * @throws ApiException if fails to make API call
   */
  public AiPricesWrapper getAiPrices() throws ApiException {
    return this.getAiPrices(Collections.emptyMap());
  }


  /**
   * Get AI model prices
   * Returns the price list of the AI features the portal pays for out of its wallet: the chat models with the  price of their prompt and completion tokens, the embedding models, the image models with their per-image  price, and the web search providers with the price of one search. The installation needs both a billing  service and the AI gateway configured, otherwise the answer is 403, and only a DocSpace administrator may read  it; the call is read-only. Token prices are normalised per million tokens, and every price is in the single  `currency` the answer names. Each entry carries the model identifier to use when talking to the AI operations,  its display alias, its provider with the provider icon, and a link to the model's own page. It is a list of  what the models cost and not of what the portal spent - that is `GET api/2.0/portal/payment/customer/usage` -  and it says nothing about which of them are allowed here, which is  `GET api/2.0/portal/payment/ai-model/restrictions`.
   *
   * REST API Reference for getAiPrices Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPricesWrapper
   * @throws ApiException if fails to make API call
   */
  public AiPricesWrapper getAiPrices(Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<AiPricesWrapper> localVarReturnType = new TypeReference<AiPricesWrapper>() {};
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
   * Hands back the hosted page on which a payment method is attached to the portal's billing account, for the case  where money has to be taken later - a wallet top-up or an automatic one - rather than a plan bought now. A  portal that already has a payment method on file answers with an empty result; a DocSpace administrator may  ask for the page, but once the portal has a billing customer with an e-mail, only its payer may. The call  itself changes nothing and may be repeated: the payment method is stored by the payment provider when the  returned page is completed, after which `GET api/2.0/portal/payment/customerinfo` reports it as set. The URL  is absolute, carries the caller's e-mail, the language of the request and the currency of the region, and  redirects to `successUrl` or `backUrl` when the user finishes or cancels. It buys nothing - a plan is bought  with `PUT api/2.0/portal/payment/url`.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The absolute address the setup page sends the user back to when attaching a payment method is abandoned. It  has to be a well-formed URL and must be reachable by that user rather than by the portal. (required)
   * @param successUrl The absolute address the setup page sends the user to once the payment provider has stored the payment  method. Reaching it means a method is now on file, which `GET api/2.0/portal/payment/customerinfo` confirms;  nothing has been charged. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getCheckoutSetupUrl(@javax.annotation.Nonnull URI backUrl, @javax.annotation.Nonnull URI successUrl) throws ApiException {
    return this.getCheckoutSetupUrl(backUrl, successUrl, Collections.emptyMap());
  }


  /**
   * Get the checkout setup page URL
   * Hands back the hosted page on which a payment method is attached to the portal's billing account, for the case  where money has to be taken later - a wallet top-up or an automatic one - rather than a plan bought now. A  portal that already has a payment method on file answers with an empty result; a DocSpace administrator may  ask for the page, but once the portal has a billing customer with an e-mail, only its payer may. The call  itself changes nothing and may be repeated: the payment method is stored by the payment provider when the  returned page is completed, after which `GET api/2.0/portal/payment/customerinfo` reports it as set. The URL  is absolute, carries the caller's e-mail, the language of the request and the currency of the region, and  redirects to `successUrl` or `backUrl` when the user finishes or cancels. It buys nothing - a plan is bought  with `PUT api/2.0/portal/payment/url`.
   *
   * REST API Reference for getCheckoutSetupUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
   *
   * @param backUrl The absolute address the setup page sends the user back to when attaching a payment method is abandoned. It  has to be a well-formed URL and must be reachable by that user rather than by the portal. (required)
   * @param successUrl The absolute address the setup page sends the user to once the payment provider has stored the payment  method. Reaching it means a method is now on file, which `GET api/2.0/portal/payment/customerinfo` confirms;  nothing has been charged. (required)
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

    localVarQueryParams.addAll(apiClient.parameterToPair("backUrl", backUrl));
    localVarQueryParams.addAll(apiClient.parameterToPair("successUrl", successUrl));
      
    
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
   * Returns the money the portal has in its wallet as the accounting service holds it: the account with its own  currency, one sub-account per currency with the amount on it, and the most recent credit movement. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and a portal that  has never been a customer gets an empty result. The call is read-only. This balance is what the wallet  services are charged against, so it falls as they are used and rises with  `POST api/2.0/portal/payment/deposit`; the movements behind a change are listed by  `GET api/2.0/portal/payment/customer/operations`. Pass `refresh=true` to re-read it from the accounting  service rather than the cache - right after a top-up the cached figure is still the old one.
   *
   * REST API Reference for getCustomerBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
   * @return BalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public BalanceWrapper getCustomerBalance(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getCustomerBalance(refresh, Collections.emptyMap());
  }


  /**
   * Get the customer balance
   * Returns the money the portal has in its wallet as the accounting service holds it: the account with its own  currency, one sub-account per currency with the amount on it, and the most recent credit movement. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and a portal that  has never been a customer gets an empty result. The call is read-only. This balance is what the wallet  services are charged against, so it falls as they are used and rises with  `POST api/2.0/portal/payment/deposit`; the movements behind a change are listed by  `GET api/2.0/portal/payment/customer/operations`. Pass `refresh=true` to re-read it from the accounting  service rather than the cache - right after a top-up the cached figure is still the old one.
   *
   * REST API Reference for getCustomerBalance Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
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
   * Get the wallet top-ups
   * Lists the top-ups of the portal's wallet - the payments into it - one page at a time, which is what a list of  payments with their invoices is built from. A portal that is not a billing customer yet has no top-ups and  gets an empty result rather than an error. Only the payer or the portal owner may read it, as with the  invoices, and the call is read-only. Every filter is optional: `startDate` and `endDate` default to the  portal creation date and the present moment, a value without `Z` or an offset is read in the portal time  zone, and `status` narrows to how a top-up ended. `offset` and `limit` default to 0 and 25 and are echoed next  to `totalQuantity`, `totalPage` and `currentPage`; a negative `offset` or a `limit` outside 1 to 100 fails  with 400. An empty result means the portal is not a billing customer, has no wallet at the accounting service  yet, or that service could not be read; a period without top-ups gives an empty `collection`. A top-up with  `hasInvoice` true has an invoice, opened with `GET api/2.0/portal/payment/customer/deposits/{id}/invoice`.  For the full wallet history, charges and refunds included, use  `GET api/2.0/portal/payment/customer/operations`.
   *
   * REST API Reference for getCustomerDeposits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-deposits/
   *
   * @param startDate The beginning of the period, inclusive, as an ISO 8601 timestamp. A value with neither `Z` nor an offset is  read in the portal time zone, not in the caller's; defaults to the portal creation date. (optional)
   * @param endDate The end of the period, inclusive, as an ISO 8601 timestamp. A value with neither `Z` nor an offset is read in  the portal time zone, not in the caller's; defaults to the moment the call is made. (optional)
   * @param status The outcome to keep. A top-up that is still being settled is reported as pending and may change later, while  the other outcomes are final; every outcome is reported when this is omitted. (optional)
   * @param offset The number of top-ups to skip before the first one returned, for walking through a long history page by page.  Counted after the filters are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of top-ups returned in one page. Defaults to 25 when omitted; the answer echoes the window  back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed without  counting the items. (optional)
   * @return DepositReportWrapper
   * @throws ApiException if fails to make API call
   */
  public DepositReportWrapper getCustomerDeposits(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit) throws ApiException {
    return this.getCustomerDeposits(startDate, endDate, status, offset, limit, Collections.emptyMap());
  }


  /**
   * Get the wallet top-ups
   * Lists the top-ups of the portal's wallet - the payments into it - one page at a time, which is what a list of  payments with their invoices is built from. A portal that is not a billing customer yet has no top-ups and  gets an empty result rather than an error. Only the payer or the portal owner may read it, as with the  invoices, and the call is read-only. Every filter is optional: `startDate` and `endDate` default to the  portal creation date and the present moment, a value without `Z` or an offset is read in the portal time  zone, and `status` narrows to how a top-up ended. `offset` and `limit` default to 0 and 25 and are echoed next  to `totalQuantity`, `totalPage` and `currentPage`; a negative `offset` or a `limit` outside 1 to 100 fails  with 400. An empty result means the portal is not a billing customer, has no wallet at the accounting service  yet, or that service could not be read; a period without top-ups gives an empty `collection`. A top-up with  `hasInvoice` true has an invoice, opened with `GET api/2.0/portal/payment/customer/deposits/{id}/invoice`.  For the full wallet history, charges and refunds included, use  `GET api/2.0/portal/payment/customer/operations`.
   *
   * REST API Reference for getCustomerDeposits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-deposits/
   *
   * @param startDate The beginning of the period, inclusive, as an ISO 8601 timestamp. A value with neither `Z` nor an offset is  read in the portal time zone, not in the caller's; defaults to the portal creation date. (optional)
   * @param endDate The end of the period, inclusive, as an ISO 8601 timestamp. A value with neither `Z` nor an offset is read in  the portal time zone, not in the caller's; defaults to the moment the call is made. (optional)
   * @param status The outcome to keep. A top-up that is still being settled is reported as pending and may change later, while  the other outcomes are final; every outcome is reported when this is omitted. (optional)
   * @param offset The number of top-ups to skip before the first one returned, for walking through a long history page by page.  Counted after the filters are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of top-ups returned in one page. Defaults to 25 when omitted; the answer echoes the window  back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed without  counting the items. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DepositReportWrapper
   * @throws ApiException if fails to make API call
   */
  public DepositReportWrapper getCustomerDeposits(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/deposits";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
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

    TypeReference<DepositReportWrapper> localVarReturnType = new TypeReference<DepositReportWrapper>() {};
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
   * Returns the billing customer behind the portal: the e-mail its billing account is registered to, whether a  payment method is stored for it, and the portal user who is the payer of that account. Only a DocSpace  administrator may read it, and the call is read-only. The answer is empty in two ordinary cases - the  installation has no billing service configured at all, and the portal has never been a customer - so an empty  body is not an error. `payer` is filled in only when the billing e-mail belongs to a portal user; when it does  not, the e-mail is still shown but the field stays empty, and that is what makes every payer-only operation of  this group unreachable for everybody. `refresh=true` re-reads the customer from the billing provider instead  of the cache, which is worth doing right after a payment method has been attached.
   *
   * REST API Reference for getCustomerInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
   * @return CustomerInfoWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerInfoWrapper getCustomerInfo(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getCustomerInfo(refresh, Collections.emptyMap());
  }


  /**
   * Get the customer information
   * Returns the billing customer behind the portal: the e-mail its billing account is registered to, whether a  payment method is stored for it, and the portal user who is the payer of that account. Only a DocSpace  administrator may read it, and the call is read-only. The answer is empty in two ordinary cases - the  installation has no billing service configured at all, and the portal has never been a customer - so an empty  body is not an error. `payer` is filled in only when the billing e-mail belongs to a portal user; when it does  not, the e-mail is still shown but the field stays empty, and that is what makes every payer-only operation of  this group unreachable for everybody. `refresh=true` re-reads the customer from the billing provider instead  of the cache, which is worth doing right after a payment method has been attached.
   *
   * REST API Reference for getCustomerInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
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
   * Get the customer monthly usage
   * Returns what the portal spent from its wallet added up per calendar month, so a client can draw a spending  chart without paging through every movement. Only a DocSpace administrator may read it, a portal with no  billing customer answers with an empty result, and the call is read-only. `startDate` and `endDate` bound the  period, both inclusive, and default to the portal creation date and the present moment; the months are cut in  the portal time zone, so a movement at the edge of a month falls where the portal sees it and not where UTC  does. Each item names its year and month, the total charged in it with the currency, and how many operations  that total came from. The movements behind a month are in `GET api/2.0/portal/payment/customer/operations`,  and the same figures as a file come from `POST api/2.0/portal/payment/customer/usage/monthly/report`.
   *
   * REST API Reference for getCustomerMonthlyUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage/
   *
   * @param startDate The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made. (optional)
   * @return CustomerMonthlyUsageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerMonthlyUsageArrayWrapper getCustomerMonthlyUsage(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate) throws ApiException {
    return this.getCustomerMonthlyUsage(startDate, endDate, Collections.emptyMap());
  }


  /**
   * Get the customer monthly usage
   * Returns what the portal spent from its wallet added up per calendar month, so a client can draw a spending  chart without paging through every movement. Only a DocSpace administrator may read it, a portal with no  billing customer answers with an empty result, and the call is read-only. `startDate` and `endDate` bound the  period, both inclusive, and default to the portal creation date and the present moment; the months are cut in  the portal time zone, so a movement at the edge of a month falls where the portal sees it and not where UTC  does. Each item names its year and month, the total charged in it with the currency, and how many operations  that total came from. The movements behind a month are in `GET api/2.0/portal/payment/customer/operations`,  and the same figures as a file come from `POST api/2.0/portal/payment/customer/usage/monthly/report`.
   *
   * REST API Reference for getCustomerMonthlyUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage/
   *
   * @param startDate The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomerMonthlyUsageArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerMonthlyUsageArrayWrapper getCustomerMonthlyUsage(@javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/monthly";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<CustomerMonthlyUsageArrayWrapper> localVarReturnType = new TypeReference<CustomerMonthlyUsageArrayWrapper>() {};
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
   * Get the monthly usage report status
   * Returns the state of the `xlsx` monthly usage report this user started with  `POST api/2.0/portal/payment/customer/usage/monthly/report`: `percentage` while it is being built,  `isCompleted` when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in  the caller's My documents, and `error` when the build failed. The portal needs a billing customer and the  caller has to be a DocSpace administrator; the call is read-only and is the one to poll. The task is kept per  user and per report kind, so it reports neither another administrator's report nor the operations and service  usage ones, which have their own status operations. An empty result means this user has no monthly usage  report at all - none was started, or the finished one was already picked up or terminated. A completed task is  dropped as soon as the next report is started, so read the file link out of the same answer that first reports  `isCompleted`.
   *
   * REST API Reference for getCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerMonthlyUsageReport() throws ApiException {
    return this.getCustomerMonthlyUsageReport(Collections.emptyMap());
  }


  /**
   * Get the monthly usage report status
   * Returns the state of the `xlsx` monthly usage report this user started with  `POST api/2.0/portal/payment/customer/usage/monthly/report`: `percentage` while it is being built,  `isCompleted` when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in  the caller's My documents, and `error` when the build failed. The portal needs a billing customer and the  caller has to be a DocSpace administrator; the call is read-only and is the one to poll. The task is kept per  user and per report kind, so it reports neither another administrator's report nor the operations and service  usage ones, which have their own status operations. An empty result means this user has no monthly usage  report at all - none was started, or the finished one was already picked up or terminated. A completed task is  dropped as soon as the next report is started, so read the file link out of the same answer that first reports  `isCompleted`.
   *
   * REST API Reference for getCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerMonthlyUsageReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/monthly/report";

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
   * Get the wallet operations
   * Lists the money movements on the portal's wallet - top-ups, the charges of the wallet services, refunds and  corrections - one page at a time, which is what a billing history is built from. Only a DocSpace administrator  may read it, a portal with no billing customer answers with an empty result, and the call is read-only. Every  filter is optional: `startDate` and `endDate` are read in the portal time zone and default to the portal  creation date and the present moment, `serviceName` narrows to particular wallet services and fails with 404  on a name this installation does not sell, `participantName`, `type` and `status` narrow to who caused a  movement and how it ended, and `credit` and `debit` include or exclude the two directions. `offset` and  `limit` page through the result and default to 0 and 25, `orderBy` and `orderType` sort it, and the answer  repeats them next to `totalQuantity`, `totalPage` and `currentPage` so a client can page without counting. The  same data as a downloadable file is `POST api/2.0/portal/payment/customer/operationsreport`, and the figures  added up per service are `GET api/2.0/portal/payment/customer/usage`.
   *
   * REST API Reference for getCustomerOperations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
   *
   * @param offset The number of movements to skip before the first one returned, for walking through a long history page by  page. Counted after the filters and the ordering are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of movements returned in one page. Defaults to 25 when omitted; the answer echoes the  window back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed  without counting the items. (optional)
   * @param serviceName The wallet services whose movements are kept, named the way the billing catalogue names them - `backup`,  `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field of  `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not sell  fails the call with 404, and an omitted list keeps every service. A bare string is accepted in place of an  array for backward compatibility. (optional)
   * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, so a  movement at the edge of the period falls where the portal sees it; defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
   * @param participantName The participant whose movements are kept - the account the accounting service records as the cause of a  movement. A movement caused by a portal user carries that user ID here, and one caused by the portal itself  carries the customer name; surrounding whitespace is trimmed, and an omitted value keeps every participant. (optional)
   * @param credit Whether movements that add money to the wallet - top-ups, refunds and corrections in the portal's favour -  are kept. Both directions are reported when neither this nor `debit` is given. (optional)
   * @param debit Whether movements that take money out of the wallet - the charges of the wallet services - are kept. Both  directions are reported when neither this nor `credit` is given. (optional)
   * @param type The kind of movement to keep, which says what caused the money to move rather than how it ended. Every kind  is reported when it is omitted. (optional)
   * @param status The outcome to keep. A movement that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted. (optional)
   * @param orderBy The name of the field the movements are sorted by, spelled as the accounting service names it, such as  `StartDate` or `ServiceName`. Surrounding whitespace is trimmed, and the accounting service applies its own  ordering when this is omitted. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable List<String> serviceName, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable OperationType type, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType) throws ApiException {
    return this.getCustomerOperations(offset, limit, serviceName, startDate, endDate, participantName, credit, debit, type, status, orderBy, orderType, Collections.emptyMap());
  }


  /**
   * Get the wallet operations
   * Lists the money movements on the portal's wallet - top-ups, the charges of the wallet services, refunds and  corrections - one page at a time, which is what a billing history is built from. Only a DocSpace administrator  may read it, a portal with no billing customer answers with an empty result, and the call is read-only. Every  filter is optional: `startDate` and `endDate` are read in the portal time zone and default to the portal  creation date and the present moment, `serviceName` narrows to particular wallet services and fails with 404  on a name this installation does not sell, `participantName`, `type` and `status` narrow to who caused a  movement and how it ended, and `credit` and `debit` include or exclude the two directions. `offset` and  `limit` page through the result and default to 0 and 25, `orderBy` and `orderType` sort it, and the answer  repeats them next to `totalQuantity`, `totalPage` and `currentPage` so a client can page without counting. The  same data as a downloadable file is `POST api/2.0/portal/payment/customer/operationsreport`, and the figures  added up per service are `GET api/2.0/portal/payment/customer/usage`.
   *
   * REST API Reference for getCustomerOperations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
   *
   * @param offset The number of movements to skip before the first one returned, for walking through a long history page by  page. Counted after the filters and the ordering are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of movements returned in one page. Defaults to 25 when omitted; the answer echoes the  window back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed  without counting the items. (optional)
   * @param serviceName The wallet services whose movements are kept, named the way the billing catalogue names them - `backup`,  `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field of  `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not sell  fails the call with 404, and an omitted list keeps every service. A bare string is accepted in place of an  array for backward compatibility. (optional)
   * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, so a  movement at the edge of the period falls where the portal sees it; defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
   * @param participantName The participant whose movements are kept - the account the accounting service records as the cause of a  movement. A movement caused by a portal user carries that user ID here, and one caused by the portal itself  carries the customer name; surrounding whitespace is trimmed, and an omitted value keeps every participant. (optional)
   * @param credit Whether movements that add money to the wallet - top-ups, refunds and corrections in the portal's favour -  are kept. Both directions are reported when neither this nor `debit` is given. (optional)
   * @param debit Whether movements that take money out of the wallet - the charges of the wallet services - are kept. Both  directions are reported when neither this nor `credit` is given. (optional)
   * @param type The kind of movement to keep, which says what caused the money to move rather than how it ended. Every kind  is reported when it is omitted. (optional)
   * @param status The outcome to keep. A movement that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted. (optional)
   * @param orderBy The name of the field the movements are sorted by, spelled as the accounting service names it, such as  `StartDate` or `ServiceName`. Surrounding whitespace is trimmed, and the accounting service applies its own  ordering when this is omitted. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ReportWrapper getCustomerOperations(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable List<String> serviceName, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable Boolean credit, @javax.annotation.Nullable Boolean debit, @javax.annotation.Nullable OperationType type, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "serviceName", serviceName));
    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("participantName", participantName));
    localVarQueryParams.addAll(apiClient.parameterToPair("credit", credit));
    localVarQueryParams.addAll(apiClient.parameterToPair("debit", debit));
    localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
    localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderType", orderType));
      
    
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
   * Get the operations report status
   * Returns the state of the `xlsx` wallet operations report this user started with  `POST api/2.0/portal/payment/customer/operationsreport`: `percentage` while it is being built, `isCompleted`  when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it never reports another administrator's report, nor the service usage and monthly usage ones, which  have their own status operations. An empty result means this user has no operations report at all - none was  started, or the finished one was already picked up or terminated. A completed task is dropped as soon as the  next report is started, so read the file link out of the same answer that first reports `isCompleted`.
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
   * Get the operations report status
   * Returns the state of the `xlsx` wallet operations report this user started with  `POST api/2.0/portal/payment/customer/operationsreport`: `percentage` while it is being built, `isCompleted`  when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it never reports another administrator's report, nor the service usage and monthly usage ones, which  have their own status operations. An empty result means this user has no operations report at all - none was  started, or the finished one was already picked up or terminated. A completed task is dropped as soon as the  next report is started, so read the file link out of the same answer that first reports `isCompleted`.
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
   * Get the customer service usage
   * Returns how much of each wallet service the portal consumed and what that cost, added up per service instead  of listed per movement. Only a DocSpace administrator may read it, a portal with no billing customer answers  with an empty result, and the call is read-only. The filters are optional: `serviceName` narrows to particular  services and fails with 404 on a name this installation does not sell, `participantName` and `status` narrow  to who consumed and how the operation ended, `startDate` and `endDate` bound the period in the portal time  zone, `metadata` matches the key and value pairs a service records with its usage, and `offset`, `limit`,  `orderBy` and `orderType` page and sort the result. Amounts come with the unit the service is sold in, except  AI tools, whose consumption is reported in tokens rather than in AI credits. The individual charges behind  these totals are `GET api/2.0/portal/payment/customer/operations`, and the same figures as a downloadable file  are `POST api/2.0/portal/payment/customer/usage/report`.
   *
   * REST API Reference for getCustomerServiceUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage/
   *
   * @param serviceName The wallet services whose consumption is added up, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list covers every service. (optional)
   * @param participantName The participant whose consumption is added up - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value covers every participant. (optional)
   * @param status The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is counted when this is omitted. (optional)
   * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
   * @param metadata The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be counted. The keys are chosen by the service that writes them, so read them  off the `metadata` of the records already returned rather than guessing; an omitted map counts every record. (optional)
   * @param offset The number of per-service totals to skip before the first one returned. Counted after the filters and the  ordering are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of per-service totals returned in one page. Defaults to 25 when omitted; the answer echoes  the window back with its paging information, so the next `offset` can be computed without counting the items. (optional)
   * @param orderBy The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
   * @return CustomerServiceUsageReportWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerServiceUsageReportWrapper getCustomerServiceUsage(@javax.annotation.Nullable List<String> serviceName, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable Map<String, String> metadata, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType) throws ApiException {
    return this.getCustomerServiceUsage(serviceName, participantName, status, startDate, endDate, metadata, offset, limit, orderBy, orderType, Collections.emptyMap());
  }


  /**
   * Get the customer service usage
   * Returns how much of each wallet service the portal consumed and what that cost, added up per service instead  of listed per movement. Only a DocSpace administrator may read it, a portal with no billing customer answers  with an empty result, and the call is read-only. The filters are optional: `serviceName` narrows to particular  services and fails with 404 on a name this installation does not sell, `participantName` and `status` narrow  to who consumed and how the operation ended, `startDate` and `endDate` bound the period in the portal time  zone, `metadata` matches the key and value pairs a service records with its usage, and `offset`, `limit`,  `orderBy` and `orderType` page and sort the result. Amounts come with the unit the service is sold in, except  AI tools, whose consumption is reported in tokens rather than in AI credits. The individual charges behind  these totals are `GET api/2.0/portal/payment/customer/operations`, and the same figures as a downloadable file  are `POST api/2.0/portal/payment/customer/usage/report`.
   *
   * REST API Reference for getCustomerServiceUsage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage/
   *
   * @param serviceName The wallet services whose consumption is added up, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list covers every service. (optional)
   * @param participantName The participant whose consumption is added up - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value covers every participant. (optional)
   * @param status The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is counted when this is omitted. (optional)
   * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date. (optional)
   * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
   * @param metadata The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be counted. The keys are chosen by the service that writes them, so read them  off the `metadata` of the records already returned rather than guessing; an omitted map counts every record. (optional)
   * @param offset The number of per-service totals to skip before the first one returned. Counted after the filters and the  ordering are applied, and starts at 0 when omitted. (optional)
   * @param limit The maximum number of per-service totals returned in one page. Defaults to 25 when omitted; the answer echoes  the window back with its paging information, so the next `offset` can be computed without counting the items. (optional)
   * @param orderBy The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomerServiceUsageReportWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomerServiceUsageReportWrapper getCustomerServiceUsage(@javax.annotation.Nullable List<String> serviceName, @javax.annotation.Nullable String participantName, @javax.annotation.Nullable OperationStatus status, @javax.annotation.Nullable OffsetDateTime startDate, @javax.annotation.Nullable OffsetDateTime endDate, @javax.annotation.Nullable Map<String, String> metadata, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String orderBy, @javax.annotation.Nullable OperationOrderType orderType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "serviceName", serviceName));
    localVarQueryParams.addAll(apiClient.parameterToPair("participantName", participantName));
    localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
    localVarQueryParams.addAll(apiClient.parameterToPair("startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));
    localVarQueryParameterBaseName = "metadata";
    if (metadata != null) {
      for (Map.Entry<String, ?> _metadataEntry : metadata.entrySet()) {
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata[" + _metadataEntry.getKey() + "]", _metadataEntry.getValue()));
      }
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderType", orderType));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<CustomerServiceUsageReportWrapper> localVarReturnType = new TypeReference<CustomerServiceUsageReportWrapper>() {};
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
   * Get the service usage report status
   * Returns the state of the `xlsx` service usage report this user started with  `POST api/2.0/portal/payment/customer/usage/report`: `percentage` while it is being built, `isCompleted` when  it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it reports neither another administrator's report nor the operations and monthly usage ones, which  have their own status operations. An empty result means this user has no service usage report at all - none  was started, or the finished one was already picked up or terminated. A completed task is dropped as soon as  the next report is started, so read the file link out of the same answer that first reports `isCompleted`.
   *
   * REST API Reference for getCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerServiceUsageReport() throws ApiException {
    return this.getCustomerServiceUsageReport(Collections.emptyMap());
  }


  /**
   * Get the service usage report status
   * Returns the state of the `xlsx` service usage report this user started with  `POST api/2.0/portal/payment/customer/usage/report`: `percentage` while it is being built, `isCompleted` when  it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it reports neither another administrator's report nor the operations and monthly usage ones, which  have their own status operations. An empty result means this user has no service usage report at all - none  was started, or the finished one was already picked up or terminated. A completed task is dropped as soon as  the next report is started, so read the file link out of the same answer that first reports `isCompleted`.
   *
   * REST API Reference for getCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getCustomerServiceUsageReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/report";

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
   * Get the top-up invoice
   * Hands back the address of the page on which the billing provider shows the invoice for one top-up of the  portal's wallet, so a client can open or download it. The top-up is named by the `id` that  `GET api/2.0/portal/payment/customer/deposits` returns, and only one listed there with `hasInvoice` true has an  invoice to show. Only the payer or the portal owner may read it, as with the billing account page, and the  call changes nothing. The address is absolute and points to the billing provider rather than to the portal;  it is asked for anew on every call, so request it when the user is about to open the invoice instead of  storing it. A top-up this portal does not have, one without an invoice, or a portal that is not a billing  customer answers 404, and an `id` that is not a number fails with 400. An installation without a billing  service answers 403, and 402 means the billing or the accounting service rejected the request or did not  answer, which a later retry may get past.
   *
   * REST API Reference for getDepositInvoice Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deposit-invoice/
   *
   * @param id The ID of the top-up, taken from the `id` field of `GET api/2.0/portal/payment/customer/deposits`. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getDepositInvoice(@javax.annotation.Nonnull Long id) throws ApiException {
    return this.getDepositInvoice(id, Collections.emptyMap());
  }


  /**
   * Get the top-up invoice
   * Hands back the address of the page on which the billing provider shows the invoice for one top-up of the  portal's wallet, so a client can open or download it. The top-up is named by the `id` that  `GET api/2.0/portal/payment/customer/deposits` returns, and only one listed there with `hasInvoice` true has an  invoice to show. Only the payer or the portal owner may read it, as with the billing account page, and the  call changes nothing. The address is absolute and points to the billing provider rather than to the portal;  it is asked for anew on every call, so request it when the user is about to open the invoice instead of  storing it. A top-up this portal does not have, one without an invoice, or a portal that is not a billing  customer answers 404, and an `id` that is not a number fails with 400. An installation without a billing  service answers 403, and 402 means the billing or the accounting service rejected the request or did not  answer, which a later retry may get past.
   *
   * REST API Reference for getDepositInvoice Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deposit-invoice/
   *
   * @param id The ID of the top-up, taken from the `id` field of `GET api/2.0/portal/payment/customer/deposits`. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getDepositInvoice(@javax.annotation.Nonnull Long id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDepositInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/deposits/{id}/invoice"
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
   * Get the global service limit
   * Returns the spending limit on the AI services for every user - the same ceiling applied to each user separately,  for any user without a personal limit in force. Only a DocSpace administrator may read it, an installation  without a billing service answers 403, and the call is read-only. It comes without spending, since that is  counted per user: read it for each user from `GET api/2.0/portal/payment/servicelimit/participants`; `periodEnd`  still says when the current period ends for everyone. When no  such limit has been set, or it was deleted, the answer is 200 with a null `response`; create the limit with  `POST api/2.0/portal/payment/servicelimit` and the scope `Global`. A switched-off limit is still returned, with  `enabled` false. A portal with no billing customer answers 404.
   *
   * REST API Reference for getGlobalServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-global-service-limit/
   *
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getGlobalServiceLimit() throws ApiException {
    return this.getGlobalServiceLimit(Collections.emptyMap());
  }


  /**
   * Get the global service limit
   * Returns the spending limit on the AI services for every user - the same ceiling applied to each user separately,  for any user without a personal limit in force. Only a DocSpace administrator may read it, an installation  without a billing service answers 403, and the call is read-only. It comes without spending, since that is  counted per user: read it for each user from `GET api/2.0/portal/payment/servicelimit/participants`; `periodEnd`  still says when the current period ends for everyone. When no  such limit has been set, or it was deleted, the answer is 200 with a null `response`; create the limit with  `POST api/2.0/portal/payment/servicelimit` and the scope `Global`. A switched-off limit is still returned, with  `enabled` false. A portal with no billing customer answers 404.
   *
   * REST API Reference for getGlobalServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-global-service-limit/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getGlobalServiceLimit(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/global";

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

    TypeReference<ServiceLimitWrapper> localVarReturnType = new TypeReference<ServiceLimitWrapper>() {};
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
   * Get the user service limits
   * Lists, one page at a time, the spending limit on the AI services in force for each portal user, with what the  user spent against it in the current period and what is left. Only a DocSpace administrator may read it, an  installation without a billing service answers 403, a portal with no billing customer answers 404, and the call  is read-only; a portal with no limits gets an empty page. A user's own limit wins over the one for every user: an item with the scope `Custom` is a  personal limit, one with `Global` the limit for every user, its ID repeated for each user it applies to.  Switched-off limits are not listed, and a user who has not used the AI services yet may be missing. `offset`  and `limit` page through the result and default to 0 and 25, and the answer repeats them next to  `totalQuantity`, `totalPage` and `currentPage`; `orderBy` and `orderType` sort it, the newest limits first by  default.
   *
   * REST API Reference for getParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-participant-service-limits/
   *
   * @param offset The number of limits to skip before the first one returned, counted in the sort order of the list. (optional)
   * @param limit The largest number of limits one page holds. (optional)
   * @param orderBy The field the list is sorted by: the user a limit applies to, or the moment it was created. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. (optional)
   * @return ServiceLimitReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitReportWrapper getParticipantServiceLimits(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable ServiceLimitOrderBy orderBy, @javax.annotation.Nullable OperationOrderType orderType) throws ApiException {
    return this.getParticipantServiceLimits(offset, limit, orderBy, orderType, Collections.emptyMap());
  }


  /**
   * Get the user service limits
   * Lists, one page at a time, the spending limit on the AI services in force for each portal user, with what the  user spent against it in the current period and what is left. Only a DocSpace administrator may read it, an  installation without a billing service answers 403, a portal with no billing customer answers 404, and the call  is read-only; a portal with no limits gets an empty page. A user's own limit wins over the one for every user: an item with the scope `Custom` is a  personal limit, one with `Global` the limit for every user, its ID repeated for each user it applies to.  Switched-off limits are not listed, and a user who has not used the AI services yet may be missing. `offset`  and `limit` page through the result and default to 0 and 25, and the answer repeats them next to  `totalQuantity`, `totalPage` and `currentPage`; `orderBy` and `orderType` sort it, the newest limits first by  default.
   *
   * REST API Reference for getParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-participant-service-limits/
   *
   * @param offset The number of limits to skip before the first one returned, counted in the sort order of the list. (optional)
   * @param limit The largest number of limits one page holds. (optional)
   * @param orderBy The field the list is sorted by: the user a limit applies to, or the moment it was created. (optional)
   * @param orderType The direction the field named in `orderBy` is sorted in. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitReportWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitReportWrapper getParticipantServiceLimits(@javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable ServiceLimitOrderBy orderBy, @javax.annotation.Nullable OperationOrderType orderType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/participants";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("orderType", orderType));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ServiceLimitReportWrapper> localVarReturnType = new TypeReference<ServiceLimitReportWrapper>() {};
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
   * Get the billing account page
   * Hands back the address of the portal page on which the billing account is managed - the payment method on  file, the invoices and the receipts - so a client can link to it instead of assembling the address itself. The  portal must already have a billing customer: one that has never had it gets an empty result, and an  installation without a billing service answers 403. Only the payer or the portal owner may read it, and the  call changes nothing. The value is relative to the portal root (`payment.ashx`), and the optional `backUrl` is  appended to it as a query parameter so the page can send the user back where they came from. It is not a  checkout page: a plan is bought with `PUT api/2.0/portal/payment/url` and a payment method is attached with  `GET api/2.0/portal/payment/checkoutsetupurl`.
   *
   * REST API Reference for getPaymentAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
   *
   * @param backUrl The absolute address the billing account page should offer as its way back. It is appended to the returned  portal-relative address as a query parameter rather than followed here, and omitting it yields the bare  address of the page. (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPaymentAccount(@javax.annotation.Nullable URI backUrl) throws ApiException {
    return this.getPaymentAccount(backUrl, Collections.emptyMap());
  }


  /**
   * Get the billing account page
   * Hands back the address of the portal page on which the billing account is managed - the payment method on  file, the invoices and the receipts - so a client can link to it instead of assembling the address itself. The  portal must already have a billing customer: one that has never had it gets an empty result, and an  installation without a billing service answers 403. Only the payer or the portal owner may read it, and the  call changes nothing. The value is relative to the portal root (`payment.ashx`), and the optional `backUrl` is  appended to it as a query parameter so the page can send the user back where they came from. It is not a  checkout page: a plan is bought with `PUT api/2.0/portal/payment/url` and a payment method is attached with  `GET api/2.0/portal/payment/checkoutsetupurl`.
   *
   * REST API Reference for getPaymentAccount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
   *
   * @param backUrl The absolute address the billing account page should offer as its way back. It is appended to the returned  portal-relative address as a query parameter rather than followed here, and omitting it yields the bare  address of the page. (optional)
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
   * Get the billing currencies
   * Tells a client which currency the portal is billed in: the default currency of the portal region always comes  first, followed by the currency resolved for the current request when that one differs, so the answer holds  one or two items. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Each item carries the country code of the region, the currency symbol and the  native name of the currency; the first item is the currency the amounts from  `GET api/2.0/portal/payment/prices` are expressed in. These are the currencies of the subscription prices, and  they are not the accounting currencies the wallet is topped up in - those come with the balance in  `GET api/2.0/portal/payment/customer/balance`.
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
   * Get the billing currencies
   * Tells a client which currency the portal is billed in: the default currency of the portal region always comes  first, followed by the currency resolved for the current request when that one differs, so the answer holds  one or two items. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Each item carries the country code of the region, the currency symbol and the  native name of the currency; the first item is the currency the amounts from  `GET api/2.0/portal/payment/prices` are expressed in. These are the currencies of the subscription prices, and  they are not the accounting currencies the wallet is topped up in - those come with the balance in  `GET api/2.0/portal/payment/customer/balance`.
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
   * Get the purchasable quotas
   * Lists the quotas the portal can be put on - the paid plans and the wallet services - each with its price, its  features and the limits it grants, which is what a pricing page is built from. Nothing has to be called first,  the caller needs the permission to edit the portal settings, and the call is read-only. Only quotas marked  visible are listed, newest first, and the two optional filters narrow that: `wallet` selects the wallet  services (`true`) or the subscription plans (`false`), `additional` selects the add-ons to a plan (`true`) or  the plans themselves (`false`), and an omitted filter keeps both kinds. A portal on a non-profit quota is a  special case - asking for `additional=false` returns that single quota and nothing else, because no other plan  may be bought for it. The quota the portal is actually on is not marked here; read it from  `GET api/2.0/portal/payment/quota`.
   *
   * REST API Reference for getPaymentQuotas Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
   *
   * @param wallet Which side of the catalogue is listed: `true` keeps the services paid out of the portal wallet, `false` keeps  the subscription plans, and omitting it keeps both. (optional)
   * @param additional Which layer of the catalogue is listed: `true` keeps the add-ons that extend a plan, `false` keeps the plans  themselves, and omitting it keeps both. (optional)
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getPaymentQuotas(@javax.annotation.Nullable Boolean wallet, @javax.annotation.Nullable Boolean additional) throws ApiException {
    return this.getPaymentQuotas(wallet, additional, Collections.emptyMap());
  }


  /**
   * Get the purchasable quotas
   * Lists the quotas the portal can be put on - the paid plans and the wallet services - each with its price, its  features and the limits it grants, which is what a pricing page is built from. Nothing has to be called first,  the caller needs the permission to edit the portal settings, and the call is read-only. Only quotas marked  visible are listed, newest first, and the two optional filters narrow that: `wallet` selects the wallet  services (`true`) or the subscription plans (`false`), `additional` selects the add-ons to a plan (`true`) or  the plans themselves (`false`), and an omitted filter keeps both kinds. A portal on a non-profit quota is a  special case - asking for `additional=false` returns that single quota and nothing else, because no other plan  may be bought for it. The quota the portal is actually on is not marked here; read it from  `GET api/2.0/portal/payment/quota`.
   *
   * REST API Reference for getPaymentQuotas Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
   *
   * @param wallet Which side of the catalogue is listed: `true` keeps the services paid out of the portal wallet, `false` keeps  the subscription plans, and omitting it keeps both. (optional)
   * @param additional Which layer of the catalogue is listed: `true` keeps the add-ons that extend a plan, `false` keeps the plans  themselves, and omitting it keeps both. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return QuotaArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaArrayWrapper getPaymentQuotas(@javax.annotation.Nullable Boolean wallet, @javax.annotation.Nullable Boolean additional, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPair("additional", additional));
      
    
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
   * Starts the purchase of a monthly paid plan for this portal by handing back the hosted checkout page the buyer  has to open; nothing is bought until that page is completed. The portal must have no paid plan yet - a portal  whose plan is already paid gets an empty result and changes its subscription through  `PUT api/2.0/portal/payment/update` instead - and the product name in `quantity` must be one of the monthly,  non-wallet plans listed by `GET api/2.0/portal/payment/quotas`. Only a DocSpace administrator may call it. The  call itself changes nothing on the portal and may be repeated: the money is taken by the payment provider on  the checkout page, and the plan becomes active once the provider confirms it. The returned URL is absolute and  single-purpose - it carries the caller's e-mail, the language of the request and the currency of the request  region, and it redirects to `successUrl` or `backUrl` when the buyer finishes or cancels. Exactly one product  per call is accepted and its quantity has to be greater than zero; yearly and wallet products are refused, and  wallet services are bought with `PUT api/2.0/portal/payment/updatewallet` instead.
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
   * Starts the purchase of a monthly paid plan for this portal by handing back the hosted checkout page the buyer  has to open; nothing is bought until that page is completed. The portal must have no paid plan yet - a portal  whose plan is already paid gets an empty result and changes its subscription through  `PUT api/2.0/portal/payment/update` instead - and the product name in `quantity` must be one of the monthly,  non-wallet plans listed by `GET api/2.0/portal/payment/quotas`. Only a DocSpace administrator may call it. The  call itself changes nothing on the portal and may be repeated: the money is taken by the payment provider on  the checkout page, and the plan becomes active once the provider confirms it. The returned URL is absolute and  single-purpose - it carries the caller's e-mail, the language of the request and the currency of the request  region, and it redirects to `successUrl` or `backUrl` when the buyer finishes or cancels. Exactly one product  per call is accepted and its quantity has to be greater than zero; yearly and wallet products are refused, and  wallet services are bought with `PUT api/2.0/portal/payment/updatewallet` instead.
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
   * Get the product prices
   * Lists what one unit of every purchasable product costs, keyed by the product name that `quantity` takes in the  purchase operations, so a client can price a plan or a wallet service without reading the whole quota list.  Nothing has to be called first, and the caller needs the permission to edit the portal settings, which portal  administrators and the owner have. The call is read-only. Prices are given in the one currency resolved for  this request from the portal region, which `GET api/2.0/portal/payment/currencies` reports; a product with no  price in that currency comes back as `0` rather than being left out, so a zero means unpriced and not free.  The list covers the products on offer, not the portal's own plan - the plan in force, with its limits and its  usage, is `GET api/2.0/portal/payment/quota`.
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
   * Get the product prices
   * Lists what one unit of every purchasable product costs, keyed by the product name that `quantity` takes in the  purchase operations, so a client can price a plan or a wallet service without reading the whole quota list.  Nothing has to be called first, and the caller needs the permission to edit the portal settings, which portal  administrators and the owner have. The call is read-only. Prices are given in the one currency resolved for  this request from the portal region, which `GET api/2.0/portal/payment/currencies` reports; a product with no  price in that currency comes back as `0` rather than being left out, so a zero means unpriced and not free.  The list covers the products on offer, not the portal's own plan - the plan in force, with its limits and its  usage, is `GET api/2.0/portal/payment/quota`.
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
   * Get the current plan and limits
   * Returns the quota the portal is on - its paid plan or the free one - with the limits its features grant and how  much of each is already used. Any signed-in member except a guest may call it. The call is read-only; the plan  comes from the cache, and `refresh=true` re-reads it from the billing service, a remote call meant for right  after a purchase. The answer is trimmed to the caller's user type: a DocSpace administrator or the owner gets  the price, the due date and all features, a room administrator only the `manager`, `room`, `total_size` and  `statistic` features, and a user only `total_size`. For both of the latter `price` is an empty object and  `dueDate` is omitted, while the storage quota settings (`usersQuota`, `roomsQuota`, `aiAgentsQuota`,  `tenantCustomQuota`) come back as for an administrator. The quotas that could be bought instead are  `GET api/2.0/portal/payment/quotas`. A guest is refused with 403.
   *
   * REST API Reference for getQuotaPaymentInformation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
   * @return QuotaWrapper
   * @throws ApiException if fails to make API call
   */
  public QuotaWrapper getQuotaPaymentInformation(@javax.annotation.Nullable Boolean refresh) throws ApiException {
    return this.getQuotaPaymentInformation(refresh, Collections.emptyMap());
  }


  /**
   * Get the current plan and limits
   * Returns the quota the portal is on - its paid plan or the free one - with the limits its features grant and how  much of each is already used. Any signed-in member except a guest may call it. The call is read-only; the plan  comes from the cache, and `refresh=true` re-reads it from the billing service, a remote call meant for right  after a purchase. The answer is trimmed to the caller's user type: a DocSpace administrator or the owner gets  the price, the due date and all features, a room administrator only the `manager`, `room`, `total_size` and  `statistic` features, and a user only `total_size`. For both of the latter `price` is an empty object and  `dueDate` is omitted, while the storage quota settings (`usersQuota`, `roomsQuota`, `aiAgentsQuota`,  `tenantCustomQuota`) come back as for an administrator. The quotas that could be bought instead are  `GET api/2.0/portal/payment/quotas`. A guest is refused with 403.
   *
   * REST API Reference for getQuotaPaymentInformation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
   *
   * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
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
   * Returns the AI chat models that are barred on this portal - the ones no user of it may pick for a  conversation, whatever the price list offers. Only a DocSpace administrator may read it, and the call is  read-only. When the installation has no billing service or AI is not enabled for the portal, the answer is an  empty set instead of an error, which is indistinguishable from a portal that restricts nothing. An empty  `models` therefore means every model in `GET api/2.0/portal/payment/ai-prices` may be used. The set names the  barred models and not the allowed ones; replace it with `PUT api/2.0/portal/payment/ai-model/restrictions`.
   *
   * REST API Reference for getRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/
   *
   * @return RestrictedAiModelsWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedAiModelsWrapper getRestrictedAiModels() throws ApiException {
    return this.getRestrictedAiModels(Collections.emptyMap());
  }


  /**
   * Get restricted AI models
   * Returns the AI chat models that are barred on this portal - the ones no user of it may pick for a  conversation, whatever the price list offers. Only a DocSpace administrator may read it, and the call is  read-only. When the installation has no billing service or AI is not enabled for the portal, the answer is an  empty set instead of an error, which is indistinguishable from a portal that restricts nothing. An empty  `models` therefore means every model in `GET api/2.0/portal/payment/ai-prices` may be used. The set names the  barred models and not the allowed ones; replace it with `PUT api/2.0/portal/payment/ai-model/restrictions`.
   *
   * REST API Reference for getRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return RestrictedAiModelsWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedAiModelsWrapper getRestrictedAiModels(Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<RestrictedAiModelsWrapper> localVarReturnType = new TypeReference<RestrictedAiModelsWrapper>() {};
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
   * Get a service limit
   * Returns one spending limit on the AI services of the portal by its ID - the limit of the portal as a whole, the  one for every user, or a personal one. Only a DocSpace administrator may read it, an installation without a  billing service answers 403, and the call is read-only. The limit comes back with its scope, thresholds, their  currency and unit, the period and whether it is in force, but without its spending: that comes with  `GET api/2.0/portal/payment/servicelimit/total` for the portal and with  `GET api/2.0/portal/payment/servicelimit/participants` for each user. A portal with no billing customer, and an  ID that does not exist, belongs to another portal or is not a limit on the AI services, answer 404.
   *
   * REST API Reference for getServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-service-limit/
   *
   * @param id The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits. (required)
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getServiceLimit(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getServiceLimit(id, Collections.emptyMap());
  }


  /**
   * Get a service limit
   * Returns one spending limit on the AI services of the portal by its ID - the limit of the portal as a whole, the  one for every user, or a personal one. Only a DocSpace administrator may read it, an installation without a  billing service answers 403, and the call is read-only. The limit comes back with its scope, thresholds, their  currency and unit, the period and whether it is in force, but without its spending: that comes with  `GET api/2.0/portal/payment/servicelimit/total` for the portal and with  `GET api/2.0/portal/payment/servicelimit/participants` for each user. A portal with no billing customer, and an  ID that does not exist, belongs to another portal or is not a limit on the AI services, answer 404.
   *
   * REST API Reference for getServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-service-limit/
   *
   * @param id The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getServiceLimit(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getServiceLimit");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/{id}"
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

    TypeReference<ServiceLimitWrapper> localVarReturnType = new TypeReference<ServiceLimitWrapper>() {};
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
   * Get the subscription balance information
   * Reports in money how much of the portal's paid subscription period is still unused - the credit that  `POST api/2.0/portal/payment/subscription/movetowallet` would carry over to the wallet if the subscription  were ended now. The portal must have a billing customer and a plan in the paid state; a plan that is not paid  answers 402, and a paid plan without a subscription row gives 404. Only the payer - the portal user whose  e-mail is the billing customer's e-mail - may read it, and the call is read-only. The answer states the total  cost of the current period with its currency, the start and the end of that period in UTC, the moment the  unused part is measured up to, the days already elapsed, and the remaining balance both in the subscription  currency and converted to the wallet currency. Every figure is computed for the instant of the request, so it  changes between calls.
   *
   * REST API Reference for getSubscriptionBalanceInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-subscription-balance-info/
   *
   * @return SubscriptionBalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public SubscriptionBalanceWrapper getSubscriptionBalanceInfo() throws ApiException {
    return this.getSubscriptionBalanceInfo(Collections.emptyMap());
  }


  /**
   * Get the subscription balance information
   * Reports in money how much of the portal's paid subscription period is still unused - the credit that  `POST api/2.0/portal/payment/subscription/movetowallet` would carry over to the wallet if the subscription  were ended now. The portal must have a billing customer and a plan in the paid state; a plan that is not paid  answers 402, and a paid plan without a subscription row gives 404. Only the payer - the portal user whose  e-mail is the billing customer's e-mail - may read it, and the call is read-only. The answer states the total  cost of the current period with its currency, the start and the end of that period in UTC, the moment the  unused part is measured up to, the days already elapsed, and the remaining balance both in the subscription  currency and converted to the wallet currency. Every figure is computed for the instant of the request, so it  changes between calls.
   *
   * REST API Reference for getSubscriptionBalanceInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-subscription-balance-info/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return SubscriptionBalanceWrapper
   * @throws ApiException if fails to make API call
   */
  public SubscriptionBalanceWrapper getSubscriptionBalanceInfo(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/subscription/balance";

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

    TypeReference<SubscriptionBalanceWrapper> localVarReturnType = new TypeReference<SubscriptionBalanceWrapper>() {};
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
   * Get the wallet service settings
   * Returns which wallet services an administrator has switched on for this portal by hand, as opposed to the ones  its plan pays for. Only a DocSpace administrator may read it, an installation without a billing service  answers 403, no billing customer is needed, and the call is read-only. `enabledServices` holds the names of  those services and is empty when none was switched on. This is the stored setting and not the state of the  portal: a service the plan brings with it is active without appearing here, so the honest answer to what is  running is `GET api/2.0/portal/payment/activeservices`. One entry is changed with  `POST api/2.0/portal/payment/servicestate`.
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
   * Get the wallet service settings
   * Returns which wallet services an administrator has switched on for this portal by hand, as opposed to the ones  its plan pays for. Only a DocSpace administrator may read it, an installation without a billing service  answers 403, no billing customer is needed, and the call is read-only. `enabledServices` holds the names of  those services and is empty when none was switched on. This is the stored setting and not the state of the  portal: a service the plan brings with it is active without appearing here, so the honest answer to what is  running is `GET api/2.0/portal/payment/activeservices`. One entry is changed with  `POST api/2.0/portal/payment/servicestate`.
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
   * Get the auto top-up settings
   * Returns the portal's automatic wallet top-up settings - whether it is on, the balance that triggers a  charge, the balance it is topped up to, and the currency both are expressed in. Any DocSpace  administrator may read them, and unlike the operation that changes them this one needs neither a  billing customer nor a configured billing service, so it answers on a portal that has never paid for  anything. It is read-only and changes nothing.  A portal that has never configured top-up gets the defaults rather than an empty result: `enabled` is  false, `currency` is null, and `minBalance` and `upToBalance` are 0. Those two zeros are outside the  ranges `POST api/2.0/portal/payment/topupsettings` accepts - 5 to 1000 and 6 to 5000 - so the answer  cannot be sent straight back to it; supply real values instead. `lastModified` is  `0001-01-01T00:00:00` until the settings are stored for the first time.  `lowBalanceThreshold` and `lowBalanceNotified` are maintained by the portal itself: they are reported  here, but cannot be written.
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
   * Get the auto top-up settings
   * Returns the portal's automatic wallet top-up settings - whether it is on, the balance that triggers a  charge, the balance it is topped up to, and the currency both are expressed in. Any DocSpace  administrator may read them, and unlike the operation that changes them this one needs neither a  billing customer nor a configured billing service, so it answers on a portal that has never paid for  anything. It is read-only and changes nothing.  A portal that has never configured top-up gets the defaults rather than an empty result: `enabled` is  false, `currency` is null, and `minBalance` and `upToBalance` are 0. Those two zeros are outside the  ranges `POST api/2.0/portal/payment/topupsettings` accepts - 5 to 1000 and 6 to 5000 - so the answer  cannot be sent straight back to it; supply real values instead. `lastModified` is  `0001-01-01T00:00:00` until the settings are stored for the first time.  `lowBalanceThreshold` and `lowBalanceNotified` are maintained by the portal itself: they are reported  here, but cannot be written.
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
   * Get the portal service limit
   * Returns the spending limit on the AI services for the portal as a whole - the ceiling the spending of every user  counts towards - together with what was spent against it in the current period and what is left. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and the call is  read-only. The limit is checked in addition to the limits  of the users, so a user can be stopped by it before reaching their own. The spending includes the expected cost  of AI operations still in progress. When no such limit has been set, or it was deleted, the answer is 200 with a  null `response`; create the limit with `POST api/2.0/portal/payment/servicelimit` and the scope `Total`. A  switched-off limit is still returned, with `enabled` false. A portal with no billing customer answers 404.
   *
   * REST API Reference for getTotalServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-total-service-limit/
   *
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getTotalServiceLimit() throws ApiException {
    return this.getTotalServiceLimit(Collections.emptyMap());
  }


  /**
   * Get the portal service limit
   * Returns the spending limit on the AI services for the portal as a whole - the ceiling the spending of every user  counts towards - together with what was spent against it in the current period and what is left. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and the call is  read-only. The limit is checked in addition to the limits  of the users, so a user can be stopped by it before reaching their own. The spending includes the expected cost  of AI operations still in progress. When no such limit has been set, or it was deleted, the answer is 200 with a  null `response`; create the limit with `POST api/2.0/portal/payment/servicelimit` and the scope `Total`. A  switched-off limit is still returned, with `enabled` false. A portal with no billing customer answers 404.
   *
   * REST API Reference for getTotalServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-total-service-limit/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper getTotalServiceLimit(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/total";

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

    TypeReference<ServiceLimitWrapper> localVarReturnType = new TypeReference<ServiceLimitWrapper>() {};
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
   * Get a wallet service
   * Returns one wallet service by name, for a client that already knows which service it needs and does not want  the whole catalogue. `service` is the name of the service - `Storage`, `Backup`, `AITools`, `Admin`,  `DocsCloud`, `DocsCloudDevPack` or `AISearch` - and a name this installation does not sell answers 404.  Nothing has to be called first, the caller needs the permission to edit the portal settings, and the call is  read-only. The answer has the same shape as one item of `GET api/2.0/portal/payment/walletservices` - the  price of a unit, the unit, the limits the service grants and its service name - except that the variants of a  service are not grouped into `innerServices` here, because a single service is looked up directly. The price  is in the currency resolved for the request.
   *
   * REST API Reference for getWalletService Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
   *
   * @param service The service to look up, given by its catalogue name. A service this installation does not sell answers 404,  and the whole catalogue is `GET api/2.0/portal/payment/walletservices`. (required)
   * @return WalletServiceWrapper
   * @throws ApiException if fails to make API call
   */
  public WalletServiceWrapper getWalletService(@javax.annotation.Nonnull TenantWalletService service) throws ApiException {
    return this.getWalletService(service, Collections.emptyMap());
  }


  /**
   * Get a wallet service
   * Returns one wallet service by name, for a client that already knows which service it needs and does not want  the whole catalogue. `service` is the name of the service - `Storage`, `Backup`, `AITools`, `Admin`,  `DocsCloud`, `DocsCloudDevPack` or `AISearch` - and a name this installation does not sell answers 404.  Nothing has to be called first, the caller needs the permission to edit the portal settings, and the call is  read-only. The answer has the same shape as one item of `GET api/2.0/portal/payment/walletservices` - the  price of a unit, the unit, the limits the service grants and its service name - except that the variants of a  service are not grouped into `innerServices` here, because a single service is looked up directly. The price  is in the currency resolved for the request.
   *
   * REST API Reference for getWalletService Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
   *
   * @param service The service to look up, given by its catalogue name. A service this installation does not sell answers 404,  and the whole catalogue is `GET api/2.0/portal/payment/walletservices`. (required)
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
   * Lists every service the portal may pay for out of its wallet - extra administrators, disk storage, backup, AI  tools, AI search and Docs Connect - with the price of a unit, the unit it is sold in and whether the portal has  it switched on. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Services that are variants of one another are folded together: the visible one  carries the rest in its `innerServices`, so a client renders one card per group. The AI services are left out  entirely when AI is not enabled for the portal. This is the catalogue and not the state of the portal - what  is actually running is `GET api/2.0/portal/payment/activeservices`, one service on its own is  `GET api/2.0/portal/payment/walletservice`, and switching one on or off is  `POST api/2.0/portal/payment/servicestate`.
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
   * Lists every service the portal may pay for out of its wallet - extra administrators, disk storage, backup, AI  tools, AI search and Docs Connect - with the price of a unit, the unit it is sold in and whether the portal has  it switched on. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Services that are variants of one another are folded together: the visible one  carries the rest in its `innerServices`, so a client renders one card per group. The AI services are left out  entirely when AI is not enabled for the portal. This is the catalogue and not the state of the portal - what  is actually running is `GET api/2.0/portal/payment/activeservices`, one service on its own is  `GET api/2.0/portal/payment/walletservice`, and switching one on or off is  `POST api/2.0/portal/payment/servicestate`.
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
   * Move the subscription to the wallet
   * Ends the portal's paid subscription and moves it onto the wallet: the unused balance of the running period is  credited to the wallet, the wallet is topped up from the payment method on file if that credit does not cover  the purchase, and the requested number of administrators is then bought as a wallet service. The portal needs  a billing customer with a payment method set and a plan in the paid state, `quantity` has to name the  administrators wallet product, and the number asked for may not be below the administrators the portal already  has - read the credit that will be carried over from `GET api/2.0/portal/payment/subscription/balance` first.  Only the payer may call it. The call is mutating, spends money and cannot be undone: the subscription is ended  before the purchase is attempted, so a failure in the second half leaves the portal on the wallet with the  money credited but the administrators unbought, and a repeat would then buy them a second time. It is limited  to ten requests a minute per user by default. The result is `true` when the administrators were bought.
   *
   * REST API Reference for moveSubscriptionToWallet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-subscription-to-wallet/
   *
   * @param quantityRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper moveSubscriptionToWallet(@javax.annotation.Nullable QuantityRequestDto quantityRequestDto) throws ApiException {
    return this.moveSubscriptionToWallet(quantityRequestDto, Collections.emptyMap());
  }


  /**
   * Move the subscription to the wallet
   * Ends the portal's paid subscription and moves it onto the wallet: the unused balance of the running period is  credited to the wallet, the wallet is topped up from the payment method on file if that credit does not cover  the purchase, and the requested number of administrators is then bought as a wallet service. The portal needs  a billing customer with a payment method set and a plan in the paid state, `quantity` has to name the  administrators wallet product, and the number asked for may not be below the administrators the portal already  has - read the credit that will be carried over from `GET api/2.0/portal/payment/subscription/balance` first.  Only the payer may call it. The call is mutating, spends money and cannot be undone: the subscription is ended  before the purchase is attempted, so a failure in the second half leaves the portal on the wallet with the  money credited but the administrators unbought, and a repeat would then buy them a second time. It is limited  to ten requests a minute per user by default. The result is `true` when the administrators were bought.
   *
   * REST API Reference for moveSubscriptionToWallet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-subscription-to-wallet/
   *
   * @param quantityRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper moveSubscriptionToWallet(@javax.annotation.Nullable QuantityRequestDto quantityRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = quantityRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/subscription/movetowallet";

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
   * Contact the sales team
   * Sends the portal's message to the ONLYOFFICE sales team - the contact-sales form behind a request for a quote,  an invoice or a plan that cannot be bought online. `email` has to be a well-formed address and is where the  answer will go, while `userName` and `message` say who is asking and what for; all three are required and none  may be empty. Only a DocSpace administrator may call it. Nothing on the portal changes: no plan, no quota and  no payment is touched, a message is mailed out and the request is written to the portal audit trail. There is  no response body - status 200 means the message was handed to the mail service - and the call is not  idempotent, so a repeat sends a second message. It is limited to ten requests a minute per user by default and  answers 429 above that.
   *
   * REST API Reference for sendPaymentRequest Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
   *
   * @param salesRequestDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendPaymentRequest(@javax.annotation.Nullable SalesRequestDto salesRequestDto) throws ApiException {
    this.sendPaymentRequest(salesRequestDto, Collections.emptyMap());
  }


  /**
   * Contact the sales team
   * Sends the portal's message to the ONLYOFFICE sales team - the contact-sales form behind a request for a quote,  an invoice or a plan that cannot be bought online. `email` has to be a well-formed address and is where the  answer will go, while `userName` and `message` say who is asking and what for; all three are required and none  may be empty. Only a DocSpace administrator may call it. Nothing on the portal changes: no plan, no quota and  no payment is touched, a message is mailed out and the request is written to the portal audit trail. There is  no response body - status 200 means the message was handed to the mail service - and the call is not  idempotent, so a repeat sends a second message. It is limited to ten requests a minute per user by default and  answers 429 above that.
   *
   * REST API Reference for sendPaymentRequest Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
   *
   * @param salesRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void sendPaymentRequest(@javax.annotation.Nullable SalesRequestDto salesRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = salesRequestDto;
    
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
      "application/json"
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
   * Set the user service limits
   * Sets the same personal spending limit on the AI services for each of the listed portal users in one call,  replacing the personal limit any of them already has and switching it on, so it is how a ceiling is rolled out  to a group of users. The portal needs a billing customer, and the caller needs the permission to edit the portal  settings as well as DocSpace administrator rights. At least one of `amountValue` and `quantityValue` must be  given, every user in `userIds` must exist on the portal, and a user listed twice is limited once. One call takes  at most 1000 users; split a larger group into several calls. Unlike  `PUT api/2.0/portal/payment/servicelimit`, this sets the whole limit: a threshold left out is removed, and the  period may change, though a lifetime limit set to lifetime again keeps counting from where it was. Each personal  limit applies instead of the one for every user, and the limit of the portal is checked on top. The call is mutating and idempotent, and it is written to the portal audit trail. The answer is  the number of personal limits that were set; the result is listed by  `GET api/2.0/portal/payment/servicelimit/participants`.
   *
   * REST API Reference for setParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-participant-service-limits/
   *
   * @param setParticipantServiceLimitsRequestDto  (optional)
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper setParticipantServiceLimits(@javax.annotation.Nullable SetParticipantServiceLimitsRequestDto setParticipantServiceLimitsRequestDto) throws ApiException {
    return this.setParticipantServiceLimits(setParticipantServiceLimitsRequestDto, Collections.emptyMap());
  }


  /**
   * Set the user service limits
   * Sets the same personal spending limit on the AI services for each of the listed portal users in one call,  replacing the personal limit any of them already has and switching it on, so it is how a ceiling is rolled out  to a group of users. The portal needs a billing customer, and the caller needs the permission to edit the portal  settings as well as DocSpace administrator rights. At least one of `amountValue` and `quantityValue` must be  given, every user in `userIds` must exist on the portal, and a user listed twice is limited once. One call takes  at most 1000 users; split a larger group into several calls. Unlike  `PUT api/2.0/portal/payment/servicelimit`, this sets the whole limit: a threshold left out is removed, and the  period may change, though a lifetime limit set to lifetime again keeps counting from where it was. Each personal  limit applies instead of the one for every user, and the limit of the portal is checked on top. The call is mutating and idempotent, and it is written to the portal audit trail. The answer is  the number of personal limits that were set; the result is listed by  `GET api/2.0/portal/payment/servicelimit/participants`.
   *
   * REST API Reference for setParticipantServiceLimits Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-participant-service-limits/
   *
   * @param setParticipantServiceLimitsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper setParticipantServiceLimits(@javax.annotation.Nullable SetParticipantServiceLimitsRequestDto setParticipantServiceLimitsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setParticipantServiceLimitsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit/participants";

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

    TypeReference<Int32Wrapper> localVarReturnType = new TypeReference<Int32Wrapper>() {};
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
   * Set restricted AI models
   * Replaces the whole set of AI chat models barred on this portal: the body is the complete set that is to hold,  so adding one restriction means sending the new model together with the ones already restricted, lifting one  means leaving it out, and an empty set lifts them all. Read the current set from  `GET api/2.0/portal/payment/ai-model/restrictions` and the model identifiers from  `GET api/2.0/portal/payment/ai-prices` before calling. The installation needs a billing service and the AI  gateway configured, the portal needs a billing customer and the AI tools wallet service switched on with  `POST api/2.0/portal/payment/servicestate`, and the caller needs the permission to edit the portal settings as  well as DocSpace administrator rights. The call is mutating and idempotent - sending the same set twice leaves  the same state - and it is written to the portal audit trail. It takes effect on the next AI request, so a  conversation already open on a model that has just been barred cannot go on with it. The stored set comes  back in the answer. While AI tools is off the call is refused with 403 instead of being stored, because the  read reports an empty set then and nothing written could be read back.
   *
   * REST API Reference for setRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/
   *
   * @param setRestrictedAiModelsRequestDto  (optional)
   * @return RestrictedAiModelsWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedAiModelsWrapper setRestrictedAiModels(@javax.annotation.Nullable SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto) throws ApiException {
    return this.setRestrictedAiModels(setRestrictedAiModelsRequestDto, Collections.emptyMap());
  }


  /**
   * Set restricted AI models
   * Replaces the whole set of AI chat models barred on this portal: the body is the complete set that is to hold,  so adding one restriction means sending the new model together with the ones already restricted, lifting one  means leaving it out, and an empty set lifts them all. Read the current set from  `GET api/2.0/portal/payment/ai-model/restrictions` and the model identifiers from  `GET api/2.0/portal/payment/ai-prices` before calling. The installation needs a billing service and the AI  gateway configured, the portal needs a billing customer and the AI tools wallet service switched on with  `POST api/2.0/portal/payment/servicestate`, and the caller needs the permission to edit the portal settings as  well as DocSpace administrator rights. The call is mutating and idempotent - sending the same set twice leaves  the same state - and it is written to the portal audit trail. It takes effect on the next AI request, so a  conversation already open on a model that has just been barred cannot go on with it. The stored set comes  back in the answer. While AI tools is off the call is refused with 403 instead of being stored, because the  read reports an empty set then and nothing written could be read back.
   *
   * REST API Reference for setRestrictedAiModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/
   *
   * @param setRestrictedAiModelsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RestrictedAiModelsWrapper
   * @throws ApiException if fails to make API call
   */
  public RestrictedAiModelsWrapper setRestrictedAiModels(@javax.annotation.Nullable SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<RestrictedAiModelsWrapper> localVarReturnType = new TypeReference<RestrictedAiModelsWrapper>() {};
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
   * Set the auto top-up settings
   * Switches the portal's automatic wallet top-up on or off and sets its thresholds: while it is on, the payment  method on file is charged whenever the wallet balance falls below `minBalance`, enough to bring it up to  `upToBalance`, in `currency`. The portal needs a billing customer whose wallet balance exists - a portal that  has never had one answers 404, so top the wallet up once with `POST api/2.0/portal/payment/deposit` first -  and only the payer may change the settings. The body replaces the stored settings as a whole and an omitted  body resets them to the defaults; `minBalance` is accepted between 5 and 1000 and `upToBalance` between 6 and  5000, and `upToBalance` has to be greater than `minBalance`, so that a top-up lifts the wallet above the balance  that triggers it. The low-balance warning state (`lowBalanceThreshold`, `lowBalanceNotified`) and `lastModified` may be  sent for compatibility but are ignored: the portal keeps the values it had. The call is mutating and  idempotent, it charges nothing by itself, it is written to the portal audit trail, and switching the top-up on also re-arms the low-balance warning. The settings as they were stored come  back in the answer.
   *
   * REST API Reference for setTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
   *
   * @param tenantWalletSettingsRequestDto  (optional)
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper setTenantWalletSettings(@javax.annotation.Nullable TenantWalletSettingsRequestDto tenantWalletSettingsRequestDto) throws ApiException {
    return this.setTenantWalletSettings(tenantWalletSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Set the auto top-up settings
   * Switches the portal's automatic wallet top-up on or off and sets its thresholds: while it is on, the payment  method on file is charged whenever the wallet balance falls below `minBalance`, enough to bring it up to  `upToBalance`, in `currency`. The portal needs a billing customer whose wallet balance exists - a portal that  has never had one answers 404, so top the wallet up once with `POST api/2.0/portal/payment/deposit` first -  and only the payer may change the settings. The body replaces the stored settings as a whole and an omitted  body resets them to the defaults; `minBalance` is accepted between 5 and 1000 and `upToBalance` between 6 and  5000, and `upToBalance` has to be greater than `minBalance`, so that a top-up lifts the wallet above the balance  that triggers it. The low-balance warning state (`lowBalanceThreshold`, `lowBalanceNotified`) and `lastModified` may be  sent for compatibility but are ignored: the portal keeps the values it had. The call is mutating and  idempotent, it charges nothing by itself, it is written to the portal audit trail, and switching the top-up on also re-arms the low-balance warning. The settings as they were stored come  back in the answer.
   *
   * REST API Reference for setTenantWalletSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
   *
   * @param tenantWalletSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantWalletSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantWalletSettingsWrapper setTenantWalletSettings(@javax.annotation.Nullable TenantWalletSettingsRequestDto tenantWalletSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantWalletSettingsRequestDto;
    
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
   * Terminate the monthly usage report
   * Stops the `xlsx` monthly usage report this user has running and drops its task, for a report that was started  for the wrong period or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/monthly/report` can still answer for a moment afterwards. The call  is safe to repeat and does nothing at all when this user has no such report running: there is no response  body, and status 200 says the stop was requested, not that a report was really stopped. It leaves the  operations and service usage reports alone, and a report that had already finished keeps its file in My  documents.
   *
   * REST API Reference for terminateCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-monthly-usage-report/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerMonthlyUsageReport() throws ApiException {
    this.terminateCustomerMonthlyUsageReport(Collections.emptyMap());
  }


  /**
   * Terminate the monthly usage report
   * Stops the `xlsx` monthly usage report this user has running and drops its task, for a report that was started  for the wrong period or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/monthly/report` can still answer for a moment afterwards. The call  is safe to repeat and does nothing at all when this user has no such report running: there is no response  body, and status 200 says the stop was requested, not that a report was really stopped. It leaves the  operations and service usage reports alone, and a report that had already finished keeps its file in My  documents.
   *
   * REST API Reference for terminateCustomerMonthlyUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-monthly-usage-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerMonthlyUsageReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/monthly/report";

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
   * Terminate the operations report
   * Stops the `xlsx` wallet operations report this user has running and drops its task, for a report that was  started with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has  to be a DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/operationsreport` can still answer for a moment afterwards. The call is  safe to repeat and does nothing at all when this user has no report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. A report that had already  finished keeps its file in My documents - nothing is deleted from there.
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
   * Terminate the operations report
   * Stops the `xlsx` wallet operations report this user has running and drops its task, for a report that was  started with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has  to be a DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/operationsreport` can still answer for a moment afterwards. The call is  safe to repeat and does nothing at all when this user has no report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. A report that had already  finished keeps its file in My documents - nothing is deleted from there.
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
   * Terminate the service usage report
   * Stops the `xlsx` service usage report this user has running and drops its task, for a report that was started  with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/report` can still answer for a moment afterwards. The call is safe  to repeat and does nothing at all when this user has no such report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. It leaves the operations and  monthly usage reports alone, and a report that had already finished keeps its file in My documents.
   *
   * REST API Reference for terminateCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-service-usage-report/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerServiceUsageReport() throws ApiException {
    this.terminateCustomerServiceUsageReport(Collections.emptyMap());
  }


  /**
   * Terminate the service usage report
   * Stops the `xlsx` service usage report this user has running and drops its task, for a report that was started  with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/report` can still answer for a moment afterwards. The call is safe  to repeat and does nothing at all when this user has no such report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. It leaves the operations and  monthly usage reports alone, and a report that had already finished keeps its file in My documents.
   *
   * REST API Reference for terminateCustomerServiceUsageReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-service-usage-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateCustomerServiceUsageReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/customer/usage/report";

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
   * Top up the wallet
   * Charges the payment method on file and adds the amount to the portal's wallet, the balance every wallet  service is paid from. The portal needs a billing customer with a payment method set - attach one with  `GET api/2.0/portal/payment/checkoutsetupurl` - `currency` has to be one of the accounting currencies this  installation supports, and `amount` is a whole number of currency units between 1 and 999999. Only the payer  may call it. The call takes money and is not idempotent in any way: two identical requests charge twice, so a  client must not retry it blindly after a timeout, and it is limited to ten requests a minute per user by  default. A successful top-up pushes the new balance to the portal clients over their socket connection and  re-arms the low-balance notification. The result is `true` when the payment provider accepted the charge; read  the resulting balance back from `GET api/2.0/portal/payment/customer/balance`.
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
   * Top up the wallet
   * Charges the payment method on file and adds the amount to the portal's wallet, the balance every wallet  service is paid from. The portal needs a billing customer with a payment method set - attach one with  `GET api/2.0/portal/payment/checkoutsetupurl` - `currency` has to be one of the accounting currencies this  installation supports, and `amount` is a whole number of currency units between 1 and 999999. Only the payer  may call it. The call takes money and is not idempotent in any way: two identical requests charge twice, so a  client must not retry it blindly after a timeout, and it is limited to ten requests a minute per user by  default. A successful top-up pushes the new balance to the portal clients over their socket connection and  re-arms the low-balance notification. The result is `true` when the payment provider accepted the charge; read  the resulting balance back from `GET api/2.0/portal/payment/customer/balance`.
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
   * Change the subscription quantity
   * Changes how many units of the plan the portal is paying for - the number of administrators it covers - and  lets the payment provider bill the difference against the payment method already on file. The portal must have  a billing customer and a plan bought through `PUT api/2.0/portal/payment/url`, and while the portal is on a  priced plan the product name in `quantity` has to be that same plan, which `GET api/2.0/portal/payment/quota`  reports, because a subscription is changed here and not swapped. Only the payer - the portal user whose e-mail  is the billing customer's e-mail - may call it. The call is mutating and charges money, and it is guarded  against a double submission: once the new quantity is in effect, repeating the same request fails with 400  because that quantity is already set. The result is `true` when the provider accepted the change and `false`  when it declined it without an error. Exactly one product per call is accepted, the operation is limited to  ten requests a minute per user by default and answers 429 above that, and wallet services are not bought here  - use `PUT api/2.0/portal/payment/updatewallet` for those.
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
   * Change the subscription quantity
   * Changes how many units of the plan the portal is paying for - the number of administrators it covers - and  lets the payment provider bill the difference against the payment method already on file. The portal must have  a billing customer and a plan bought through `PUT api/2.0/portal/payment/url`, and while the portal is on a  priced plan the product name in `quantity` has to be that same plan, which `GET api/2.0/portal/payment/quota`  reports, because a subscription is changed here and not swapped. Only the payer - the portal user whose e-mail  is the billing customer's e-mail - may call it. The call is mutating and charges money, and it is guarded  against a double submission: once the new quantity is in effect, repeating the same request fails with 400  because that quantity is already set. The result is `true` when the provider accepted the change and `false`  when it declined it without an error. Exactly one product per call is accepted, the operation is limited to  ten requests a minute per user by default and answers 429 above that, and wallet services are not bought here  - use `PUT api/2.0/portal/payment/updatewallet` for those.
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
   * Update a service limit
   * Changes the thresholds of an existing spending limit on the AI services, or switches it off and back on with  `enabled`. The portal needs a billing customer, and the caller needs the permission to edit the portal settings  as well as DocSpace administrator rights. Only the given fields change: an omitted threshold keeps its value, so  a threshold once set cannot be removed here - delete the limit with  `DELETE api/2.0/portal/payment/servicelimit/{id}` and create it anew with  `POST api/2.0/portal/payment/servicelimit`, which is also the way to change its scope, user or period. A  switched-off limit stops restricting the AI services at once. The call is mutating and idempotent, it is written  to the portal audit trail, and a new threshold applies from the very next operation; lowering it below what was  already spent blocks the AI services until the period ends. An ID that does not exist, belongs to another portal  or is not a limit on the AI services answers 404.
   *
   * REST API Reference for updateServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-service-limit/
   *
   * @param updateServiceLimitRequestDto  (optional)
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper updateServiceLimit(@javax.annotation.Nullable UpdateServiceLimitRequestDto updateServiceLimitRequestDto) throws ApiException {
    return this.updateServiceLimit(updateServiceLimitRequestDto, Collections.emptyMap());
  }


  /**
   * Update a service limit
   * Changes the thresholds of an existing spending limit on the AI services, or switches it off and back on with  `enabled`. The portal needs a billing customer, and the caller needs the permission to edit the portal settings  as well as DocSpace administrator rights. Only the given fields change: an omitted threshold keeps its value, so  a threshold once set cannot be removed here - delete the limit with  `DELETE api/2.0/portal/payment/servicelimit/{id}` and create it anew with  `POST api/2.0/portal/payment/servicelimit`, which is also the way to change its scope, user or period. A  switched-off limit stops restricting the AI services at once. The call is mutating and idempotent, it is written  to the portal audit trail, and a new threshold applies from the very next operation; lowering it below what was  already spent blocks the AI services until the period ends. An ID that does not exist, belongs to another portal  or is not a limit on the AI services answers 404.
   *
   * REST API Reference for updateServiceLimit Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-service-limit/
   *
   * @param updateServiceLimitRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ServiceLimitWrapper
   * @throws ApiException if fails to make API call
   */
  public ServiceLimitWrapper updateServiceLimit(@javax.annotation.Nullable UpdateServiceLimitRequestDto updateServiceLimitRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateServiceLimitRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/payment/servicelimit";

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

    TypeReference<ServiceLimitWrapper> localVarReturnType = new TypeReference<ServiceLimitWrapper>() {};
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
   * Change a wallet service quantity
   * Buys more units of a wallet service - extra administrators, disk storage, backup, AI tools, AI search or  Docs Connect - or writes down the quantity that service will have after the next renewal, depending on  `productQuantityType`. With `Add` (1) the units are bought at once and paid out of the portal wallet, so the  wallet needs a sub-account in the accounting currency and enough money on it; with `Set` (0) nothing is  charged now and the quantity only takes effect in the next period, where an empty or zero quantity cancels a  change scheduled earlier. `Renew` and `Sub` are not accepted here. The portal needs a billing customer and the  caller has to be a DocSpace administrator; a service that is an add-on to the plan also needs the plan itself  to be paid, otherwise the answer is 402. Minimum quantities apply - disk storage starts at 100 units, the  Docs Connect Dev Pack at 10, and the administrators may not be fewer than the portal already has - and in  the `Add` form they are checked only while the portal does not hold that service yet. Asking for the Docs Connect  plan in the `Set` form while Docs Connect Dev Pack is active schedules the reversion to it at the next period,  while the upgrade in the other direction is not done here at all: use  `POST api/2.0/settings/docscloud/switchtodevpack`. The result is `true` when the change was accepted; the call  is mutating, spends money in its `Add` form and is limited to ten requests a minute per user by default. Price  the same purchase without paying for it with `PUT api/2.0/portal/payment/calculatewallet`.
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
   * Change a wallet service quantity
   * Buys more units of a wallet service - extra administrators, disk storage, backup, AI tools, AI search or  Docs Connect - or writes down the quantity that service will have after the next renewal, depending on  `productQuantityType`. With `Add` (1) the units are bought at once and paid out of the portal wallet, so the  wallet needs a sub-account in the accounting currency and enough money on it; with `Set` (0) nothing is  charged now and the quantity only takes effect in the next period, where an empty or zero quantity cancels a  change scheduled earlier. `Renew` and `Sub` are not accepted here. The portal needs a billing customer and the  caller has to be a DocSpace administrator; a service that is an add-on to the plan also needs the plan itself  to be paid, otherwise the answer is 402. Minimum quantities apply - disk storage starts at 100 units, the  Docs Connect Dev Pack at 10, and the administrators may not be fewer than the portal already has - and in  the `Add` form they are checked only while the portal does not hold that service yet. Asking for the Docs Connect  plan in the `Set` form while Docs Connect Dev Pack is active schedules the reversion to it at the next period,  while the upgrade in the other direction is not done here at all: use  `POST api/2.0/settings/docscloud/switchtodevpack`. The result is `true` when the change was accepted; the call  is mutating, spends money in its `Add` form and is limited to ten requests a minute per user by default. Price  the same purchase without paying for it with `PUT api/2.0/portal/payment/calculatewallet`.
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
