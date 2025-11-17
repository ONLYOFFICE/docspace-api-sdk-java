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

import org.openapitools.client.model.ActionType;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.AuditEventArrayWrapper;
import org.openapitools.client.model.EntryType;
import org.openapitools.client.model.LocationType;
import org.openapitools.client.model.MessageAction;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.ProductType;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TenantAuditSettingsWrapper;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AuditTrailDataApi extends BaseApi {

  public AuditTrailDataApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AuditTrailDataApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public AuditTrailDataApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Generate the audit trail report
   * Generates the audit trail report.
   *
   * REST API Reference for createAuditTrailReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createAuditTrailReport() throws ApiException {
    return this.createAuditTrailReport(Collections.emptyMap());
  }


  /**
   * Generate the audit trail report
   * Generates the audit trail report.
   *
   * REST API Reference for createAuditTrailReport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createAuditTrailReport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/events/report";

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
   * Get filtered audit trail data
   * Returns a list of the audit events by the parameters specified in the request.
   *
   * REST API Reference for getAuditEventsByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-events-by-filter/
   *
   * @param userId The ID of the user who triggered the audit event. (optional)
   * @param moduleType The location where the audit event occurred. (optional)
   * @param actionType The type of action performed in the audit event (e.g., Create, Update, Delete). (optional)
   * @param action The specific action that occurred within the audit event. (optional)
   * @param entryType The type of audit entry (e.g., Folder, User, File). (optional)
   * @param target The target object affected by the audit event (e.g., document ID, user account). (optional)
   * @param from The starting date and time for filtering audit events. (optional)
   * @param to The ending date and time for filtering audit events. (optional)
   * @param count The maximum number of audit event records to retrieve. (optional)
   * @param startIndex The index of the first audit event record to retrieve in a paged query. (optional)
   * @return AuditEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AuditEventArrayWrapper getAuditEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable LocationType moduleType, @javax.annotation.Nullable ActionType actionType, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable EntryType entryType, @javax.annotation.Nullable String target, @javax.annotation.Nullable ApiDateTime from, @javax.annotation.Nullable ApiDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getAuditEventsByFilter(userId, moduleType, actionType, action, entryType, target, from, to, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get filtered audit trail data
   * Returns a list of the audit events by the parameters specified in the request.
   *
   * REST API Reference for getAuditEventsByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-events-by-filter/
   *
   * @param userId The ID of the user who triggered the audit event. (optional)
   * @param moduleType The location where the audit event occurred. (optional)
   * @param actionType The type of action performed in the audit event (e.g., Create, Update, Delete). (optional)
   * @param action The specific action that occurred within the audit event. (optional)
   * @param entryType The type of audit entry (e.g., Folder, User, File). (optional)
   * @param target The target object affected by the audit event (e.g., document ID, user account). (optional)
   * @param from The starting date and time for filtering audit events. (optional)
   * @param to The ending date and time for filtering audit events. (optional)
   * @param count The maximum number of audit event records to retrieve. (optional)
   * @param startIndex The index of the first audit event record to retrieve in a paged query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuditEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AuditEventArrayWrapper getAuditEventsByFilter(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable LocationType moduleType, @javax.annotation.Nullable ActionType actionType, @javax.annotation.Nullable MessageAction action, @javax.annotation.Nullable EntryType entryType, @javax.annotation.Nullable String target, @javax.annotation.Nullable ApiDateTime from, @javax.annotation.Nullable ApiDateTime to, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/events/filter";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPair("moduleType", moduleType));
    localVarQueryParams.addAll(apiClient.parameterToPair("actionType", actionType));
    localVarQueryParams.addAll(apiClient.parameterToPair("action", action));
    localVarQueryParams.addAll(apiClient.parameterToPair("entryType", entryType));
    localVarQueryParams.addAll(apiClient.parameterToPair("target", target));
    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", from.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", from.getTimeZoneOffset()));
    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", to.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", to.getTimeZoneOffset()));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
      
    if (this.fields != null)
      localVarHeaderParams.put.Add("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<AuditEventArrayWrapper> localVarReturnType = new TypeReference<AuditEventArrayWrapper>() {};
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
   * Get the audit trail settings
   * Returns the audit trail settings.
   *
   * REST API Reference for getAuditSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/
   *
   * @return TenantAuditSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAuditSettingsWrapper getAuditSettings() throws ApiException {
    return this.getAuditSettings(Collections.emptyMap());
  }


  /**
   * Get the audit trail settings
   * Returns the audit trail settings.
   *
   * REST API Reference for getAuditSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantAuditSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAuditSettingsWrapper getAuditSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/settings/lifetime";

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

    TypeReference<TenantAuditSettingsWrapper> localVarReturnType = new TypeReference<TenantAuditSettingsWrapper>() {};
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
   * Get audit trail mappers
   * Returns the mappers for the audit trail types.
   *
   * REST API Reference for getAuditTrailMappers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/
   *
   * @param productType The type of product related to the audit trail. (optional)
   * @param moduleType The location associated with the audit trail. (optional)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAuditTrailMappers(@javax.annotation.Nullable ProductType productType, @javax.annotation.Nullable LocationType moduleType) throws ApiException {
    return this.getAuditTrailMappers(productType, moduleType, Collections.emptyMap());
  }


  /**
   * Get audit trail mappers
   * Returns the mappers for the audit trail types.
   *
   * REST API Reference for getAuditTrailMappers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/
   *
   * @param productType The type of product related to the audit trail. (optional)
   * @param moduleType The location associated with the audit trail. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAuditTrailMappers(@javax.annotation.Nullable ProductType productType, @javax.annotation.Nullable LocationType moduleType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/mappers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("productType", productType));
    localVarQueryParams.addAll(apiClient.parameterToPair("moduleType", moduleType));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

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
   * Get audit trail types
   * Returns all the available audit trail types.
   *
   * REST API Reference for getAuditTrailTypes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAuditTrailTypes() throws ApiException {
    return this.getAuditTrailTypes(Collections.emptyMap());
  }


  /**
   * Get audit trail types
   * Returns all the available audit trail types.
   *
   * REST API Reference for getAuditTrailTypes Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getAuditTrailTypes(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/types";

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
   * Get audit trail data
   * Returns a list of the latest changes (creation, modification, deletion, etc.) made by users to the entities on the portal.
   *
   * REST API Reference for getLastAuditEvents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-audit-events/
   *
   * @return AuditEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AuditEventArrayWrapper getLastAuditEvents() throws ApiException {
    return this.getLastAuditEvents(Collections.emptyMap());
  }


  /**
   * Get audit trail data
   * Returns a list of the latest changes (creation, modification, deletion, etc.) made by users to the entities on the portal.
   *
   * REST API Reference for getLastAuditEvents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-audit-events/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AuditEventArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AuditEventArrayWrapper getLastAuditEvents(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/events/last";

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

    TypeReference<AuditEventArrayWrapper> localVarReturnType = new TypeReference<AuditEventArrayWrapper>() {};
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
   * Set the audit trail settings
   * Sets the audit trail settings for the current portal.
   *
   * REST API Reference for setAuditSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/
   *
   * @param tenantAuditSettingsWrapper  (optional)
   * @return TenantAuditSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAuditSettingsWrapper setAuditSettings(@javax.annotation.Nullable TenantAuditSettingsWrapper tenantAuditSettingsWrapper) throws ApiException {
    return this.setAuditSettings(tenantAuditSettingsWrapper, Collections.emptyMap());
  }


  /**
   * Set the audit trail settings
   * Sets the audit trail settings for the current portal.
   *
   * REST API Reference for setAuditSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/
   *
   * @param tenantAuditSettingsWrapper  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return TenantAuditSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public TenantAuditSettingsWrapper setAuditSettings(@javax.annotation.Nullable TenantAuditSettingsWrapper tenantAuditSettingsWrapper, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tenantAuditSettingsWrapper;
    
    // create path and map variables
    String localVarPath = "/api/2.0/security/audit/settings/lifetime";

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

    TypeReference<TenantAuditSettingsWrapper> localVarReturnType = new TypeReference<TenantAuditSettingsWrapper>() {};
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
