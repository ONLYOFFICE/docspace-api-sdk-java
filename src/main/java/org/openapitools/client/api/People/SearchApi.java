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

import org.openapitools.client.model.AccountLoginType;
import org.openapitools.client.model.Area;
import org.openapitools.client.model.EmployeeActivationStatus;
import org.openapitools.client.model.EmployeeArrayWrapper;
import org.openapitools.client.model.EmployeeFullArrayWrapper;
import org.openapitools.client.model.EmployeeStatus;
import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.ObjectArrayWrapper;
import org.openapitools.client.model.Payments;
import org.openapitools.client.model.QuotaFilter;
import org.openapitools.client.model.SortOrder;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SearchApi extends BaseApi {

  public SearchApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public SearchApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Get account entries with file sharing settings
   * Returns the account entries with their sharing settings for a file with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get account entries with file sharing settings
   * Returns the account entries with their sharing settings for a file with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountsEntriesWithFilesShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/accounts/file/{id}/search"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * Get account entries with folder sharing settings
   * Returns the account entries with their sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get account entries with folder sharing settings
   * Returns the account entries with their sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountsEntriesWithFoldersShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/accounts/folder/{id}/search"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * Get account entries
   * Returns the account entries with their sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get account entries
   * Returns the account entries with their sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getAccountsEntriesWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the account sharing settings from the response. (optional)
   * @param includeShared Specifies whether to include the account sharing settings in the response. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The area of the account entries. (optional)
   * @param employeeTypes The list of the user types. (optional)
   * @param count The number of items to retrieve in a request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param filterSeparator Specifies the separator used in filter expressions. (optional)
   * @param filterValue The text filter applied to the accounts search query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper getAccountsEntriesWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountsEntriesWithRoomsShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/accounts/room/{id}/search"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * Search users
   * Returns a list of users matching the search query.
   *
   * REST API Reference for getSearch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-search/
   *
   * @param query The search query. (required)
   * @param filterBy Specifies a filter criteria for the user search query. (optional)
   * @param filterValue The value used for filtering users, allowing additional constraints for the query. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getSearch(@javax.annotation.Nonnull String query, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getSearch(query, filterBy, filterValue, Collections.emptyMap());
  }


  /**
   * Search users
   * Returns a list of users matching the search query.
   *
   * REST API Reference for getSearch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-search/
   *
   * @param query The search query. (required)
   * @param filterBy Specifies a filter criteria for the user search query. (optional)
   * @param filterValue The value used for filtering users, allowing additional constraints for the query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getSearch(@javax.annotation.Nonnull String query, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling getSearch");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/@search/{query}"
      .replaceAll("\\{" + "query" + "\\}", apiClient.escapeString(apiClient.parameterToString(query)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Search users by extended filter
   * Returns a list of users matching the parameters specified in the request.
   *
   * REST API Reference for getSimpleByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-simple-by-filter/
   *
   * @param employeeStatus The user status. (optional)
   * @param groupId The group ID. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param employeeType The user type. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param isAdministrator Specifies if the user is an administrator or not. (optional)
   * @param payments The user payment status. (optional)
   * @param accountLoginType The account login type. (optional)
   * @param quotaFilter The quota filter (All - 0, Default - 1, Custom - 2). (optional)
   * @param withoutGroup Specifies whether the user should be a member of a group or not. (optional)
   * @param excludeGroup Specifies whether the user should be a member of the group with the specified ID. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The filter area. (optional)
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split filter criteria in query parameters. (optional)
   * @param filterValue The search text used to filter results based on user input. (optional)
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper getSimpleByFilter(@javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable UUID groupId, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable EmployeeType employeeType, @javax.annotation.Nullable List<Integer> employeeTypes, @javax.annotation.Nullable Boolean isAdministrator, @javax.annotation.Nullable Payments payments, @javax.annotation.Nullable AccountLoginType accountLoginType, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Boolean withoutGroup, @javax.annotation.Nullable Boolean excludeGroup, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getSimpleByFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Search users by extended filter
   * Returns a list of users matching the parameters specified in the request.
   *
   * REST API Reference for getSimpleByFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-simple-by-filter/
   *
   * @param employeeStatus The user status. (optional)
   * @param groupId The group ID. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param employeeType The user type. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param isAdministrator Specifies if the user is an administrator or not. (optional)
   * @param payments The user payment status. (optional)
   * @param accountLoginType The account login type. (optional)
   * @param quotaFilter The quota filter (All - 0, Default - 1, Custom - 2). (optional)
   * @param withoutGroup Specifies whether the user should be a member of a group or not. (optional)
   * @param excludeGroup Specifies whether the user should be a member of the group with the specified ID. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The filter area. (optional)
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split filter criteria in query parameters. (optional)
   * @param filterValue The search text used to filter results based on user input. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper getSimpleByFilter(@javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable UUID groupId, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable EmployeeType employeeType, @javax.annotation.Nullable List<Integer> employeeTypes, @javax.annotation.Nullable Boolean isAdministrator, @javax.annotation.Nullable Payments payments, @javax.annotation.Nullable AccountLoginType accountLoginType, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Boolean withoutGroup, @javax.annotation.Nullable Boolean excludeGroup, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/simple/filter";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("groupId", groupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("employeeType", employeeType));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("isAdministrator", isAdministrator));
    localVarQueryParams.addAll(apiClient.parameterToPair("payments", payments));
    localVarQueryParams.addAll(apiClient.parameterToPair("accountLoginType", accountLoginType));
    localVarQueryParams.addAll(apiClient.parameterToPair("quotaFilter", quotaFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutGroup", withoutGroup));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeGroup", excludeGroup));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
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
   * Get users with file sharing settings
   * Returns the users with the sharing settings in a file with the ID specified in request.
   *
   * REST API Reference for getUsersWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get users with file sharing settings
   * Returns the users with the sharing settings in a file with the ID specified in request.
   *
   * REST API Reference for getUsersWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUsersWithFilesShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/file/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Get users with folder sharing settings
   * Returns the users with the sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getUsersWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get users with folder sharing settings
   * Returns the users with the sharing settings in a folder with the ID specified in request.
   *
   * REST API Reference for getUsersWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUsersWithFoldersShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/folder/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Get users with room sharing settings
   * Returns the users with the sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getUsersWithRoomShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithRoomShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get users with room sharing settings
   * Returns the users with the sharing settings in a room with the ID specified in request.
   *
   * REST API Reference for getUsersWithRoomShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/
   *
   * @param id The user ID. (required)
   * @param employeeStatus The user status. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param excludeShared Specifies whether to exclude the user sharing settings or not. (optional)
   * @param includeShared Specifies whether to include the user sharing settings or not. (optional)
   * @param invitedByMe Specifies whether the user was invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The user area. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param count The maximum number of users to be retrieved in the request. (optional)
   * @param startIndex The zero-based index of the first record to retrieve in a paged query. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The filter text value used for searching or filtering user results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getUsersWithRoomShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Boolean includeShared, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable List<EmployeeType> employeeTypes, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUsersWithRoomShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/room/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("includeShared", includeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Search users with detailed information by extended filter
   * Returns a list of users with full information about them matching the parameters specified in the request.
   *
   * REST API Reference for searchUsersByExtendedFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-extended-filter/
   *
   * @param employeeStatus The user status. (optional)
   * @param groupId The group ID. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param employeeType The user type. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param isAdministrator Specifies if the user is an administrator or not. (optional)
   * @param payments The user payment status. (optional)
   * @param accountLoginType The account login type. (optional)
   * @param quotaFilter The quota filter (All - 0, Default - 1, Custom - 2). (optional)
   * @param withoutGroup Specifies whether the user should be a member of a group or not. (optional)
   * @param excludeGroup Specifies whether the user should be a member of the group with the specified ID. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The filter area. (optional)
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split filter criteria in query parameters. (optional)
   * @param filterValue The search text used to filter results based on user input. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper searchUsersByExtendedFilter(@javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable UUID groupId, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable EmployeeType employeeType, @javax.annotation.Nullable List<Integer> employeeTypes, @javax.annotation.Nullable Boolean isAdministrator, @javax.annotation.Nullable Payments payments, @javax.annotation.Nullable AccountLoginType accountLoginType, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Boolean withoutGroup, @javax.annotation.Nullable Boolean excludeGroup, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.searchUsersByExtendedFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Search users with detailed information by extended filter
   * Returns a list of users with full information about them matching the parameters specified in the request.
   *
   * REST API Reference for searchUsersByExtendedFilter Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-extended-filter/
   *
   * @param employeeStatus The user status. (optional)
   * @param groupId The group ID. (optional)
   * @param activationStatus The user activation status. (optional)
   * @param employeeType The user type. (optional)
   * @param employeeTypes The list of user types. (optional)
   * @param isAdministrator Specifies if the user is an administrator or not. (optional)
   * @param payments The user payment status. (optional)
   * @param accountLoginType The account login type. (optional)
   * @param quotaFilter The quota filter (All - 0, Default - 1, Custom - 2). (optional)
   * @param withoutGroup Specifies whether the user should be a member of a group or not. (optional)
   * @param excludeGroup Specifies whether the user should be a member of the group with the specified ID. (optional)
   * @param invitedByMe Specifies whether the user is invited by the current user or not. (optional)
   * @param inviterId The inviter ID. (optional)
   * @param area The filter area. (optional)
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split filter criteria in query parameters. (optional)
   * @param filterValue The search text used to filter results based on user input. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper searchUsersByExtendedFilter(@javax.annotation.Nullable EmployeeStatus employeeStatus, @javax.annotation.Nullable UUID groupId, @javax.annotation.Nullable EmployeeActivationStatus activationStatus, @javax.annotation.Nullable EmployeeType employeeType, @javax.annotation.Nullable List<Integer> employeeTypes, @javax.annotation.Nullable Boolean isAdministrator, @javax.annotation.Nullable Payments payments, @javax.annotation.Nullable AccountLoginType accountLoginType, @javax.annotation.Nullable QuotaFilter quotaFilter, @javax.annotation.Nullable Boolean withoutGroup, @javax.annotation.Nullable Boolean excludeGroup, @javax.annotation.Nullable Boolean invitedByMe, @javax.annotation.Nullable UUID inviterId, @javax.annotation.Nullable Area area, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/filter";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("employeeStatus", employeeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("groupId", groupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("activationStatus", activationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("employeeType", employeeType));
    localVarQueryParameterBaseName = "employeeTypes";
    for (int i=0; i < employeeTypes.size(); i++) {
      localVarQueryStringJoiner.add(employeeTypes.get(i).toUrlQueryString(String.format("employeeTypes[%d]", i)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPair("isAdministrator", isAdministrator));
    localVarQueryParams.addAll(apiClient.parameterToPair("payments", payments));
    localVarQueryParams.addAll(apiClient.parameterToPair("accountLoginType", accountLoginType));
    localVarQueryParams.addAll(apiClient.parameterToPair("quotaFilter", quotaFilter));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutGroup", withoutGroup));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeGroup", excludeGroup));
    localVarQueryParams.addAll(apiClient.parameterToPair("invitedByMe", invitedByMe));
    localVarQueryParams.addAll(apiClient.parameterToPair("inviterId", inviterId));
    localVarQueryParams.addAll(apiClient.parameterToPair("area", area));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterSeparator", filterSeparator));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
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

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Search users (using query parameters)
   * Returns a list of users matching the search query. This method uses the query parameters.
   *
   * REST API Reference for searchUsersByQuery Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-query/
   *
   * @param query The search query. (optional)
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper searchUsersByQuery(@javax.annotation.Nullable String query) throws ApiException {
    return this.searchUsersByQuery(query, Collections.emptyMap());
  }


  /**
   * Search users (using query parameters)
   * Returns a list of users matching the search query. This method uses the query parameters.
   *
   * REST API Reference for searchUsersByQuery Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-query/
   *
   * @param query The search query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper searchUsersByQuery(@javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/search";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
      
    
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
   * Search users by status filter
   * Returns a list of users matching the status filter and search query.
   *
   * REST API Reference for searchUsersByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-status/
   *
   * @param status The user status. (required)
   * @param query The advanced search query. (optional)
   * @param filterBy Specifies the criteria used to filter search results in advanced queries. (optional)
   * @param filterValue The value used to filter the search query. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper searchUsersByStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nullable String query, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.searchUsersByStatus(status, query, filterBy, filterValue, Collections.emptyMap());
  }


  /**
   * Search users by status filter
   * Returns a list of users matching the status filter and search query.
   *
   * REST API Reference for searchUsersByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-status/
   *
   * @param status The user status. (required)
   * @param query The advanced search query. (optional)
   * @param filterBy Specifies the criteria used to filter search results in advanced queries. (optional)
   * @param filterValue The value used to filter the search query. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper searchUsersByStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nullable String query, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling searchUsersByStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/status/{status}/search"
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(apiClient.parameterToString(status)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
