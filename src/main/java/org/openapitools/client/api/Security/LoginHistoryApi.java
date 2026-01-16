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

import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.LoginEventArrayWrapper;
import org.openapitools.client.model.MessageAction;
import org.openapitools.client.model.StringWrapper;
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
   * Generate the login history report
   * Generates the login history report.
   *
   * REST API Reference for createLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createLoginHistoryReport() throws ApiException {
    return this.createLoginHistoryReport(Collections.emptyMap());
  }


  /**
   * Generate the login history report
   * Generates the login history report.
   *
   * REST API Reference for createLoginHistoryReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createLoginHistoryReport(Map<String, String> additionalHeaders) throws ApiException {
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
  public LoginEventArrayWrapper getLoginEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable ApiDateTime from, @javax.annotation.Nullable ApiDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
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
  public LoginEventArrayWrapper getLoginEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable ApiDateTime from, @javax.annotation.Nullable ApiDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", from.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", from.getTimeZoneOffset()));
    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", to.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", to.getTimeZoneOffset()));
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
