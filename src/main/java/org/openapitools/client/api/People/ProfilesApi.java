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

import org.openapitools.client.model.Culture;
import org.openapitools.client.model.EmployeeArrayWrapper;
import org.openapitools.client.model.EmployeeFullArrayWrapper;
import org.openapitools.client.model.EmployeeFullWrapper;
import org.openapitools.client.model.InviteUsersRequestDto;
import org.openapitools.client.model.MemberRequestDto;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.UpdateMemberRequestDto;
import org.openapitools.client.model.UpdateMembersRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ProfilesApi extends BaseApi {

  public ProfilesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ProfilesApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public ProfilesApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Add a user
   * Adds a new portal user with the first name, last name, email address, and several optional parameters specified in the request.
   *
   * REST API Reference for addMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-member/
   *
   * @param memberRequestDto  (optional)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper addMember(@javax.annotation.Nullable MemberRequestDto memberRequestDto) throws ApiException {
    return this.addMember(memberRequestDto, Collections.emptyMap());
  }


  /**
   * Add a user
   * Adds a new portal user with the first name, last name, email address, and several optional parameters specified in the request.
   *
   * REST API Reference for addMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-member/
   *
   * @param memberRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper addMember(@javax.annotation.Nullable MemberRequestDto memberRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = memberRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people";

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Delete a user
   * Deletes a user with the ID specified in the request from the portal.
   *
   * REST API Reference for deleteMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member/
   *
   * @param userid The user ID. (required)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper deleteMember(@javax.annotation.Nonnull String userid) throws ApiException {
    return this.deleteMember(userid, Collections.emptyMap());
  }


  /**
   * Delete a user
   * Deletes a user with the ID specified in the request from the portal.
   *
   * REST API Reference for deleteMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper deleteMember(@javax.annotation.Nonnull String userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling deleteMember");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType
    );
  }

  /**
   * Delete my profile
   * Deletes the current user profile.
   *
   * REST API Reference for deleteProfile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-profile/
   *
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper deleteProfile() throws ApiException {
    return this.deleteProfile(Collections.emptyMap());
  }


  /**
   * Delete my profile
   * Deletes the current user profile.
   *
   * REST API Reference for deleteProfile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-profile/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper deleteProfile(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/@self";

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType
    );
  }

  /**
   * Get profiles
   * Returns a list of profiles for all the portal users.
   *
   * REST API Reference for getAllProfiles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-profiles/
   *
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param filterBy Specifies the filter criteria for user-related queries. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The text value used as an additional filter criterion for profiles retrieval. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getAllProfiles(@javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getAllProfiles(count, startIndex, filterBy, sortBy, sortOrder, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get profiles
   * Returns a list of profiles for all the portal users.
   *
   * REST API Reference for getAllProfiles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-profiles/
   *
   * @param count The maximum number of items to be retrieved in the response. (optional)
   * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
   * @param filterBy Specifies the filter criteria for user-related queries. (optional)
   * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
   * @param filterValue The text value used as an additional filter criterion for profiles retrieval. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getAllProfiles(@javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
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
   * Get user claims
   * Returns the user claims.
   *
   * REST API Reference for getClaims Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/
   *
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getClaims() throws ApiException {
    return this.getClaims(Collections.emptyMap());
  }


  /**
   * Get user claims
   * Returns the user claims.
   *
   * REST API Reference for getClaims Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper getClaims(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/tokendiagnostics";

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
   * Get a profile by user email
   * Returns the detailed information about a profile of the user with the email specified in the request.
   *
   * REST API Reference for getProfileByEmail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-email/
   *
   * @param email The user email address. (optional)
   * @param culture Culture (optional)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getProfileByEmail(@javax.annotation.Nullable String email, @javax.annotation.Nullable String culture) throws ApiException {
    return this.getProfileByEmail(email, culture, Collections.emptyMap());
  }


  /**
   * Get a profile by user email
   * Returns the detailed information about a profile of the user with the email specified in the request.
   *
   * REST API Reference for getProfileByEmail Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-email/
   *
   * @param email The user email address. (optional)
   * @param culture Culture (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getProfileByEmail(@javax.annotation.Nullable String email, @javax.annotation.Nullable String culture, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/email";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("email", email));
    localVarQueryParams.addAll(apiClient.parameterToPair("culture", culture));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Get a profile by user ID
   * Returns the detailed information about a profile of the user with the ID specified in the request.
   *
   * REST API Reference for getProfileByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-user-id/
   *
   * @param userid The user ID. (required)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getProfileByUserId(@javax.annotation.Nonnull String userid) throws ApiException {
    return this.getProfileByUserId(userid, Collections.emptyMap());
  }


  /**
   * Get a profile by user ID
   * Returns the detailed information about a profile of the user with the ID specified in the request.
   *
   * REST API Reference for getProfileByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-user-id/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getProfileByUserId(@javax.annotation.Nonnull String userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getProfileByUserId");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Get my profile
   * Returns the detailed information about the current user profile.
   *
   * REST API Reference for getSelfProfile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-self-profile/
   *
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getSelfProfile() throws ApiException {
    return this.getSelfProfile(Collections.emptyMap());
  }


  /**
   * Get my profile
   * Returns the detailed information about the current user profile.
   *
   * REST API Reference for getSelfProfile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-self-profile/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper getSelfProfile(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/@self";

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Invite users
   * Invites users specified in the request to the current portal.
   *
   * REST API Reference for inviteUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/invite-users/
   *
   * @param inviteUsersRequestDto  (optional)
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper inviteUsers(@javax.annotation.Nullable InviteUsersRequestDto inviteUsersRequestDto) throws ApiException {
    return this.inviteUsers(inviteUsersRequestDto, Collections.emptyMap());
  }


  /**
   * Invite users
   * Invites users specified in the request to the current portal.
   *
   * REST API Reference for inviteUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/invite-users/
   *
   * @param inviteUsersRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeArrayWrapper inviteUsers(@javax.annotation.Nullable InviteUsersRequestDto inviteUsersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = inviteUsersRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/invite";

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

    TypeReference<EmployeeArrayWrapper> localVarReturnType = new TypeReference<EmployeeArrayWrapper>() {};
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
   * Delete users
   * Deletes a list of the users with the IDs specified in the request.
   *
   * REST API Reference for removeUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-users/
   *
   * @param updateMembersRequestDto  (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper removeUsers(@javax.annotation.Nullable UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.removeUsers(updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Delete users
   * Deletes a list of the users with the IDs specified in the request.
   *
   * REST API Reference for removeUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-users/
   *
   * @param updateMembersRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper removeUsers(@javax.annotation.Nullable UpdateMembersRequestDto updateMembersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMembersRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/delete";

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
   * Resend activation emails
   * Resends emails to the users who have not activated their emails.
   *
   * REST API Reference for resendUserInvites Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-user-invites/
   *
   * @param updateMembersRequestDto  (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper resendUserInvites(@javax.annotation.Nullable UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.resendUserInvites(updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Resend activation emails
   * Resends emails to the users who have not activated their emails.
   *
   * REST API Reference for resendUserInvites Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-user-invites/
   *
   * @param updateMembersRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper resendUserInvites(@javax.annotation.Nullable UpdateMembersRequestDto updateMembersRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMembersRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/invite";

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
   * Send instructions to change email
   * Sends a message to the user email with the instructions to change the email address connected to the portal.
   *
   * REST API Reference for sendEmailChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
   *
   * @param updateMemberRequestDto  (optional)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendEmailChangeInstructions(@javax.annotation.Nullable UpdateMemberRequestDto updateMemberRequestDto) throws ApiException {
    return this.sendEmailChangeInstructions(updateMemberRequestDto, Collections.emptyMap());
  }


  /**
   * Send instructions to change email
   * Sends a message to the user email with the instructions to change the email address connected to the portal.
   *
   * REST API Reference for sendEmailChangeInstructions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
   *
   * @param updateMemberRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper sendEmailChangeInstructions(@javax.annotation.Nullable UpdateMemberRequestDto updateMemberRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMemberRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/email";

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
   * Update a user
   * Updates the data for the selected portal user with the first name, last name, email address, and/or optional parameters specified in the request.
   *
   * REST API Reference for updateMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member/
   *
   * @param userid The user ID. (required)
   * @param updateMemberRequestDto The request parameters for updating the user information. (required)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper updateMember(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull UpdateMemberRequestDto updateMemberRequestDto) throws ApiException {
    return this.updateMember(userid, updateMemberRequestDto, Collections.emptyMap());
  }


  /**
   * Update a user
   * Updates the data for the selected portal user with the first name, last name, email address, and/or optional parameters specified in the request.
   *
   * REST API Reference for updateMember Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member/
   *
   * @param userid The user ID. (required)
   * @param updateMemberRequestDto The request parameters for updating the user information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper updateMember(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull UpdateMemberRequestDto updateMemberRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMemberRequestDto;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling updateMember");
    }
    
    // verify the required parameter 'updateMemberRequestDto' is set
    if (updateMemberRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMemberRequestDto' when calling updateMember");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
   * Update a user culture code
   * Updates the user culture code with the parameters specified in the request.
   *
   * REST API Reference for updateMemberCulture Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-culture/
   *
   * @param userid The user ID. (required)
   * @param culture The culture code parameters. (optional)
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper updateMemberCulture(@javax.annotation.Nonnull String userid, @javax.annotation.Nullable Culture culture) throws ApiException {
    return this.updateMemberCulture(userid, culture, Collections.emptyMap());
  }


  /**
   * Update a user culture code
   * Updates the user culture code with the parameters specified in the request.
   *
   * REST API Reference for updateMemberCulture Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-culture/
   *
   * @param userid The user ID. (required)
   * @param culture The culture code parameters. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EmployeeFullWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullWrapper updateMemberCulture(@javax.annotation.Nonnull String userid, @javax.annotation.Nullable Culture culture, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = culture;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling updateMemberCulture");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/culture"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<EmployeeFullWrapper> localVarReturnType = new TypeReference<EmployeeFullWrapper>() {};
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
