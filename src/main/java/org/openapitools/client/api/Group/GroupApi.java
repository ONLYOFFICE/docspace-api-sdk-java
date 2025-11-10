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

import org.openapitools.client.model.GroupArrayWrapper;
import org.openapitools.client.model.GroupRequestDto;
import org.openapitools.client.model.GroupSummaryArrayWrapper;
import org.openapitools.client.model.GroupWrapper;
import org.openapitools.client.model.MembersRequest;
import org.openapitools.client.model.NoContentResultWrapper;
import org.openapitools.client.model.SetManagerRequest;
import org.openapitools.client.model.SortOrder;
import java.util.UUID;
import org.openapitools.client.model.UpdateGroupRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class GroupApi extends BaseApi {

  public GroupApi() {
    super(Configuration.getDefaultApiClient());
  }

  public GroupApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public GroupApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Add a new group
   * Adds a new group with the group manager, name, and members specified in the request.
   *
   * REST API Reference for addGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-group/
   *
   * @param groupRequestDto  (optional)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper addGroup(@javax.annotation.Nullable GroupRequestDto groupRequestDto) throws ApiException {
    return this.addGroup(groupRequestDto, Collections.emptyMap());
  }


  /**
   * Add a new group
   * Adds a new group with the group manager, name, and members specified in the request.
   *
   * REST API Reference for addGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-group/
   *
   * @param groupRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper addGroup(@javax.annotation.Nullable GroupRequestDto groupRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = groupRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/group";

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

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Add group members
   * Adds new group members to the group with the ID specified in the request.
   *
   * REST API Reference for addMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper addMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.addMembersTo(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Add group members
   * Adds new group members to the group with the ID specified in the request.
   *
   * REST API Reference for addMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper addMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = membersRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addMembersTo");
    }
    
    // verify the required parameter 'membersRequest' is set
    if (membersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'membersRequest' when calling addMembersTo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}/members"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Delete a group
   * Deletes a group with the ID specified in the request from the list of groups on the portal.
   *
   * REST API Reference for deleteGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
   *
   * @param id The group ID. (required)
   * @return NoContentResultWrapper
   * @throws ApiException if fails to make API call
   */
  public NoContentResultWrapper deleteGroup(@javax.annotation.Nonnull UUID id) throws ApiException {
    return this.deleteGroup(id, Collections.emptyMap());
  }


  /**
   * Delete a group
   * Deletes a group with the ID specified in the request from the list of groups on the portal.
   *
   * REST API Reference for deleteGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
   *
   * @param id The group ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return NoContentResultWrapper
   * @throws ApiException if fails to make API call
   */
  public NoContentResultWrapper deleteGroup(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}"
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

    TypeReference<NoContentResultWrapper> localVarReturnType = new TypeReference<NoContentResultWrapper>() {};
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
   * Get a group
   * Returns the detailed information about the selected group.   **Note**: This method returns full group information.
   *
   * REST API Reference for getGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
   *
   * @param id The group ID. (required)
   * @param includeMembers Specifies whether to include the group members or not. (optional)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper getGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nullable Boolean includeMembers) throws ApiException {
    return this.getGroup(id, includeMembers, Collections.emptyMap());
  }


  /**
   * Get a group
   * Returns the detailed information about the selected group.   **Note**: This method returns full group information.
   *
   * REST API Reference for getGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
   *
   * @param id The group ID. (required)
   * @param includeMembers Specifies whether to include the group members or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper getGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nullable Boolean includeMembers, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("includeMembers", includeMembers));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Get user groups
   * Returns a list of groups for the user with the ID specified in the request.
   *
   * REST API Reference for getGroupByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
   *
   * @param userid The user ID. (required)
   * @return GroupSummaryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupSummaryArrayWrapper getGroupByUserId(@javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getGroupByUserId(userid, Collections.emptyMap());
  }


  /**
   * Get user groups
   * Returns a list of groups for the user with the ID specified in the request.
   *
   * REST API Reference for getGroupByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupSummaryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupSummaryArrayWrapper getGroupByUserId(@javax.annotation.Nonnull UUID userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getGroupByUserId");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/user/{userid}"
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

    TypeReference<GroupSummaryArrayWrapper> localVarReturnType = new TypeReference<GroupSummaryArrayWrapper>() {};
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
   * Get groups
   * Returns the general information about all the groups, such as group ID and group manager.   **Note**: This method returns partial group information.
   *
   * REST API Reference for getGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
   *
   * @param userId The user ID. (optional)
   * @param manager Specifies if the user is a manager or not. (optional)
   * @param count The number of records to retrieve. (optional)
   * @param startIndex The starting index for paginated results. (optional)
   * @param sortBy Specifies the property used to sort the query results. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching group data. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroups(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable Boolean manager, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroups(userId, manager, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get groups
   * Returns the general information about all the groups, such as group ID and group manager.   **Note**: This method returns partial group information.
   *
   * REST API Reference for getGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
   *
   * @param userId The user ID. (optional)
   * @param manager Specifies if the user is a manager or not. (optional)
   * @param count The number of records to retrieve. (optional)
   * @param startIndex The starting index for paginated results. (optional)
   * @param sortBy Specifies the property used to sort the query results. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching group data. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroups(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable Boolean manager, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/group";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPair("manager", manager));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
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

    TypeReference<GroupArrayWrapper> localVarReturnType = new TypeReference<GroupArrayWrapper>() {};
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
   * Move group members
   * Moves all the members from the selected group to another one specified in the request.
   *
   * REST API Reference for moveMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
   *
   * @param fromId The group ID to move from. (required)
   * @param toId The group ID to move to. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper moveMembersTo(@javax.annotation.Nonnull UUID fromId, @javax.annotation.Nonnull UUID toId) throws ApiException {
    return this.moveMembersTo(fromId, toId, Collections.emptyMap());
  }


  /**
   * Move group members
   * Moves all the members from the selected group to another one specified in the request.
   *
   * REST API Reference for moveMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
   *
   * @param fromId The group ID to move from. (required)
   * @param toId The group ID to move to. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper moveMembersTo(@javax.annotation.Nonnull UUID fromId, @javax.annotation.Nonnull UUID toId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fromId' is set
    if (fromId == null) {
      throw new ApiException(400, "Missing the required parameter 'fromId' when calling moveMembersTo");
    }
    
    // verify the required parameter 'toId' is set
    if (toId == null) {
      throw new ApiException(400, "Missing the required parameter 'toId' when calling moveMembersTo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{fromId}/members/{toId}"
      .replaceAll("\\{" + "fromId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fromId)))
      .replaceAll("\\{" + "toId" + "\\}", apiClient.escapeString(apiClient.parameterToString(toId)));

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

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Remove group members
   * Removes the group members specified in the request from the selected group.
   *
   * REST API Reference for removeMembersFrom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper removeMembersFrom(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.removeMembersFrom(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Remove group members
   * Removes the group members specified in the request from the selected group.
   *
   * REST API Reference for removeMembersFrom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper removeMembersFrom(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = membersRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeMembersFrom");
    }
    
    // verify the required parameter 'membersRequest' is set
    if (membersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'membersRequest' when calling removeMembersFrom");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}/members"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Set a group manager
   * Sets a user with the ID specified in the request as a group manager.
   *
   * REST API Reference for setGroupManager Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
   *
   * @param id The group ID. (required)
   * @param setManagerRequest The request for setting a group manager. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setGroupManager(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull SetManagerRequest setManagerRequest) throws ApiException {
    return this.setGroupManager(id, setManagerRequest, Collections.emptyMap());
  }


  /**
   * Set a group manager
   * Sets a user with the ID specified in the request as a group manager.
   *
   * REST API Reference for setGroupManager Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
   *
   * @param id The group ID. (required)
   * @param setManagerRequest The request for setting a group manager. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setGroupManager(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull SetManagerRequest setManagerRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setManagerRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setGroupManager");
    }
    
    // verify the required parameter 'setManagerRequest' is set
    if (setManagerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setManagerRequest' when calling setGroupManager");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}/manager"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Replace group members
   * Replaces the group members with those specified in the request.
   *
   * REST API Reference for setMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.setMembersTo(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Replace group members
   * Replaces the group members with those specified in the request.
   *
   * REST API Reference for setMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
   *
   * @param id The group ID. (required)
   * @param membersRequest The member request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = membersRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setMembersTo");
    }
    
    // verify the required parameter 'membersRequest' is set
    if (membersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'membersRequest' when calling setMembersTo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}/members"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
   * Update a group
   * Updates the existing group changing the group manager, name, and/or members.
   *
   * REST API Reference for updateGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
   *
   * @param id The group ID. (required)
   * @param updateGroupRequest The request for updating a group. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper updateGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UpdateGroupRequest updateGroupRequest) throws ApiException {
    return this.updateGroup(id, updateGroupRequest, Collections.emptyMap());
  }


  /**
   * Update a group
   * Updates the existing group changing the group manager, name, and/or members.
   *
   * REST API Reference for updateGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
   *
   * @param id The group ID. (required)
   * @param updateGroupRequest The request for updating a group. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper updateGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UpdateGroupRequest updateGroupRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateGroupRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateGroup");
    }
    
    // verify the required parameter 'updateGroupRequest' is set
    if (updateGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateGroupRequest' when calling updateGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<GroupWrapper> localVarReturnType = new TypeReference<GroupWrapper>() {};
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
