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

package org.openapitools.client.api.Security;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AuditReportFormat;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.LoginEventArrayWrapper;
import org.openapitools.client.model.MessageAction;
import java.time.OffsetDateTime;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class LoginHistoryApi extends BaseApi {

  public LoginHistoryApi() {
    super(Configuration.getDefaultApiClient());
  }

  public LoginHistoryApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public LoginHistoryApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Start the login history report generation
   * Starts generating the login history report (XLSX by default, or CSV) and saves it to My documents.
   *
   * REST API Reference for createLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
   *
   * @param format The output file format of the report. Defaults to XLSX. (optional)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createLoginHistoryReport(@javax.annotation.Nullable AuditReportFormat format) throws ApiException {
    return this.createLoginHistoryReport(format, Collections.emptyMap());
  }


  /**
   * Start the login history report generation
   * Starts generating the login history report (XLSX by default, or CSV) and saves it to My documents.
   *
   * REST API Reference for createLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
   *
   * @param format The output file format of the report. Defaults to XLSX. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createLoginHistoryReport(@javax.annotation.Nullable AuditReportFormat format, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/login/report";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
      
    
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
   * Get login history
   * Returns all the latest user login activity, including successful logins and error logs.
   *
   * REST API Reference for getLastLoginEvents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-login-events/
   *
   * @return LoginEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public LoginEventArrayWrapper getLastLoginEvents() throws ApiException {
    return this.getLastLoginEvents(Collections.emptyMap());
  }


  /**
   * Get login history
   * Returns all the latest user login activity, including successful logins and error logs.
   *
   * REST API Reference for getLastLoginEvents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-login-events/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return LoginEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public LoginEventArrayWrapper getLastLoginEvents(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/login/last";

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

    TypeReference<LoginEventArrayWrapper> localVarReturnType = new TypeReference<LoginEventArrayWrapper>() {};
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
   * Get filtered login events
   * Returns a list of the login events by the parameters specified in the request.
   *
   * REST API Reference for getLoginEventsByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-events-by-filter/
   *
   * @param userId The ID of the user whose login events are being queried. (optional)
   * @param action The login-related action to filter events by. (optional)
   * @param from The starting date and time for filtering login events. (optional)
   * @param to The ending date and time for filtering login events. (optional)
   * @param count The number of login events to retrieve in the query. (optional)
   * @param startIndex The starting index for fetching a subset of login events from the query results. (optional)
   * @return LoginEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public LoginEventArrayWrapper getLoginEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getLoginEventsByFilter(userId, action, from, to, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get filtered login events
   * Returns a list of the login events by the parameters specified in the request.
   *
   * REST API Reference for getLoginEventsByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-events-by-filter/
   *
   * @param userId The ID of the user whose login events are being queried. (optional)
   * @param action The login-related action to filter events by. (optional)
   * @param from The starting date and time for filtering login events. (optional)
   * @param to The ending date and time for filtering login events. (optional)
   * @param count The number of login events to retrieve in the query. (optional)
   * @param startIndex The starting index for fetching a subset of login events from the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return LoginEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public LoginEventArrayWrapper getLoginEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/login/filter";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPair("action", action));
    localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
    localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
      
    if (this.fields != null)
      localVarHeaderParams.put("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<LoginEventArrayWrapper> localVarReturnType = new TypeReference<LoginEventArrayWrapper>() {};
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
   * Get the login history report generation status
   * Returns the status of generating the login history report.
   *
   * REST API Reference for getLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-history-report/
   *
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getLoginHistoryReport() throws ApiException {
    return this.getLoginHistoryReport(Collections.emptyMap());
  }


  /**
   * Get the login history report generation status
   * Returns the status of generating the login history report.
   *
   * REST API Reference for getLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-history-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getLoginHistoryReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/login/report";

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
   * Terminate the login history report generation
   * Terminates generating the login history report.
   *
   * REST API Reference for terminateLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-login-history-report/
   *
   * @throws ApiException if fails to make API call
   */
  public void terminateLoginHistoryReport() throws ApiException {
    this.terminateLoginHistoryReport(Collections.emptyMap());
  }


  /**
   * Terminate the login history report generation
   * Terminates generating the login history report.
   *
   * REST API Reference for terminateLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-login-history-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateLoginHistoryReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/login/report";

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
