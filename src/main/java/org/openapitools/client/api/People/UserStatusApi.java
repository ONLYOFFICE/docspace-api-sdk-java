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

package org.openapitools.client.api.People;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.EmployeeActivationStatus;
import org.openapitools.client.model.EmployeeFullArrayWrapper;
import org.openapitools.client.model.EmployeeStatus;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.UpdateMembersRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class UserStatusApi extends BaseApi {

  public UserStatusApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserStatusApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get profiles by status
   * Returns a list of profiles filtered by the user status.
   *
   * REST API Reference for getByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
   *
   * @param status The user status. (required)
   * @param filterBy Specifies the criteria used to filter the profiles in the request. (optional)
   * @param count The maximum number of user profiles to retrieve. (optional)
   * @param startIndex The starting index for retrieving data in a paginated request. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split multiple filter criteria in a query string. (optional)
   * @param filterValue A string value representing additional filter criteria used in query parameters. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getByStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getByStatus(status, filterBy, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get profiles by status
   * Returns a list of profiles filtered by the user status.
   *
   * REST API Reference for getByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
   *
   * @param status The user status. (required)
   * @param filterBy Specifies the criteria used to filter the profiles in the request. (optional)
   * @param count The maximum number of user profiles to retrieve. (optional)
   * @param startIndex The starting index for retrieving data in a paginated request. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator Represents the separator used to split multiple filter criteria in a query string. (optional)
   * @param filterValue A string value representing additional filter criteria used in query parameters. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getByStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling getByStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/status/{status}"
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(apiClient.parameterToString(status)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
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
   * Set an activation status to the users
   * Sets the required activation status to the list of users with the IDs specified in the request.
   *
   * REST API Reference for updateUserActivationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
   *
   * @param activationstatus The new user activation status. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserActivationStatus(@javax.annotation.Nonnull EmployeeActivationStatus activationstatus, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.updateUserActivationStatus(activationstatus, updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Set an activation status to the users
   * Sets the required activation status to the list of users with the IDs specified in the request.
   *
   * REST API Reference for updateUserActivationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
   *
   * @param activationstatus The new user activation status. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserActivationStatus(@javax.annotation.Nonnull EmployeeActivationStatus activationstatus, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMembersRequestDto;
    
    // verify the required parameter 'activationstatus' is set
    if (activationstatus == null) {
      throw new ApiException(400, "Missing the required parameter 'activationstatus' when calling updateUserActivationStatus");
    }
    
    // verify the required parameter 'updateMembersRequestDto' is set
    if (updateMembersRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMembersRequestDto' when calling updateUserActivationStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/activationstatus/{activationstatus}"
      .replaceAll("\\{" + "activationstatus" + "\\}", apiClient.escapeString(apiClient.parameterToString(activationstatus)));

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

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
   * Change a user status
   * Changes a status of the users with the IDs specified in the request.
   *
   * REST API Reference for updateUserStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
   *
   * @param status The new user status. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.updateUserStatus(status, updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Change a user status
   * Changes a status of the users with the IDs specified in the request.
   *
   * REST API Reference for updateUserStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
   *
   * @param status The new user status. (required)
   * @param updateMembersRequestDto The request parameters for updating the user information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMembersRequestDto;
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updateUserStatus");
    }
    
    // verify the required parameter 'updateMembersRequestDto' is set
    if (updateMembersRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMembersRequestDto' when calling updateUserStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/status/{status}"
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(apiClient.parameterToString(status)));

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

    TypeReference<EmployeeFullArrayWrapper> localVarReturnType = new TypeReference<EmployeeFullArrayWrapper>() {};
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
