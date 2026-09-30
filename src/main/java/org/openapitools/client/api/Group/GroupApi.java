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

package org.openapitools.client.api.Group;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.GroupArrayWrapper;
import org.openapitools.client.model.GroupRequestDto;
import org.openapitools.client.model.GroupSummaryArrayWrapper;
import org.openapitools.client.model.GroupWrapper;
import org.openapitools.client.model.MembersRequest;
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
   * Creates a group with the given name and, optionally, a manager and a first set of members.  The caller needs the permissions to edit groups and to add and remove users.  The name is required and cannot be blank, and unlike the operations that add members later, this one checks  every listed account upfront and rejects the whole call with 400 if any of them is unusable - a guest, a  disabled account or an ID that matches nobody.  The call is not idempotent: names are not unique, so repeating it creates a second group with the same name.  Creating a group raises a `GroupCreated` webhook, and the answer holds the new group with its members  included.  Members can be changed afterwards through `PUT api/2.0/group/{id}` or the dedicated member operations.
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
   * Creates a group with the given name and, optionally, a manager and a first set of members.  The caller needs the permissions to edit groups and to add and remove users.  The name is required and cannot be blank, and unlike the operations that add members later, this one checks  every listed account upfront and rejects the whole call with 400 if any of them is unusable - a guest, a  disabled account or an ID that matches nobody.  The call is not idempotent: names are not unique, so repeating it creates a second group with the same name.  Creating a group raises a `GroupCreated` webhook, and the answer holds the new group with its members  included.  Members can be changed afterwards through `PUT api/2.0/group/{id}` or the dedicated member operations.
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
   * Adds the listed accounts to a group, keeping the members it already has.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Accounts that cannot be group members - a guest, a disabled account or an ID that matches nobody - are  silently skipped instead of failing the call, so compare the members in the answer with what was sent to see  what was actually applied.  The call is idempotent for an account that is already a member, and it does not change who manages the group;  use `PUT api/2.0/group/{id}/manager` for that.  The answer is the group with its members after the addition.  To replace the whole list instead of extending it, use `POST api/2.0/group/{id}/members`.
   *
   * REST API Reference for addMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper addMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.addMembersTo(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Add group members
   * Adds the listed accounts to a group, keeping the members it already has.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Accounts that cannot be group members - a guest, a disabled account or an ID that matches nobody - are  silently skipped instead of failing the call, so compare the members in the answer with what was sent to see  what was actually applied.  The call is idempotent for an account that is already a member, and it does not change who manages the group;  use `PUT api/2.0/group/{id}/manager` for that.  The answer is the group with its members after the addition.  To replace the whole list instead of extending it, use `POST api/2.0/group/{id}/members`.
   *
   * REST API Reference for addMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
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
   * Deletes a group and withdraws the access it had been granted to rooms, folders and files.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The removal is permanent and cannot be undone, and it affects sharing: everything that was shared with the  group loses that share, so members who had access only through this group lose it too.  The accounts themselves are kept - only their membership disappears.  The call answers 204 with no body and raises a `GroupDeleted` webhook; a second call with the same ID answers  404 rather than succeeding again.  To empty a group without deleting it, move its members away with  `PUT api/2.0/group/{fromId}/members/{toId}` or remove them through `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for deleteGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
   *
   * @param id The ID of the group to delete, taken from the route. It has to be a group that has not been deleted already,  otherwise the operation answers 404. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(@javax.annotation.Nonnull UUID id) throws ApiException {
    this.deleteGroup(id, Collections.emptyMap());
  }


  /**
   * Delete a group
   * Deletes a group and withdraws the access it had been granted to rooms, folders and files.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The removal is permanent and cannot be undone, and it affects sharing: everything that was shared with the  group loses that share, so members who had access only through this group lose it too.  The accounts themselves are kept - only their membership disappears.  The call answers 204 with no body and raises a `GroupDeleted` webhook; a second call with the same ID answers  404 rather than succeeding again.  To empty a group without deleting it, move its members away with  `PUT api/2.0/group/{fromId}/members/{toId}` or remove them through `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for deleteGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
   *
   * @param id The ID of the group to delete, taken from the route. It has to be a group that has not been deleted already,  otherwise the operation answers 404. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
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
   * Get a group
   * Returns one group by its ID, with its name, its manager and - when asked for - the accounts that belong to  it.  The caller needs the permission to read groups, and the ID has to belong to a group that has not been  deleted, otherwise the operation answers 404.  The call is read-only, and the member list is left out unless `includeMembers` is set to true, so ask for it  only when the members are actually needed.  Use `GET api/2.0/group` to look a group up by name or to page through them all.
   *
   * REST API Reference for getGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
   *
   * @param id The ID of the group to read, taken from the route. It has to be a group that has not been deleted, otherwise  the operation answers 404. (required)
   * @param includeMembers Whether to fill in the member list of the group. It defaults to true, so set it to false when only the name  and the manager are needed and the group may be large. (optional)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper getGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nullable Boolean includeMembers) throws ApiException {
    return this.getGroup(id, includeMembers, Collections.emptyMap());
  }


  /**
   * Get a group
   * Returns one group by its ID, with its name, its manager and - when asked for - the accounts that belong to  it.  The caller needs the permission to read groups, and the ID has to belong to a group that has not been  deleted, otherwise the operation answers 404.  The call is read-only, and the member list is left out unless `includeMembers` is set to true, so ask for it  only when the members are actually needed.  Use `GET api/2.0/group` to look a group up by name or to page through them all.
   *
   * REST API Reference for getGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
   *
   * @param id The ID of the group to read, taken from the route. It has to be a group that has not been deleted, otherwise  the operation answers 404. (required)
   * @param includeMembers Whether to fill in the member list of the group. It defaults to true, so set it to false when only the name  and the manager are needed and the group may be large. (optional)
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
   * Returns every group the account with the ID in the route belongs to, as a flat list of ID and name pairs.  The caller needs the permission to read groups.  The call is read-only, is not paged, and answers an empty list both for an account that belongs to no group  and for an ID that matches no account, so an empty answer does not prove the account exists.  The entries are summaries and carry neither the manager nor the members - read `GET api/2.0/group/{id}` for  the full picture of one of them.
   *
   * REST API Reference for getGroupByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
   *
   * @param userid The ID of the account whose groups are listed, taken from the route. An ID that matches no account yields an  empty list rather than 404. (required)
   * @return GroupSummaryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupSummaryArrayWrapper getGroupByUserId(@javax.annotation.Nonnull UUID userid) throws ApiException {
    return this.getGroupByUserId(userid, Collections.emptyMap());
  }


  /**
   * Get user groups
   * Returns every group the account with the ID in the route belongs to, as a flat list of ID and name pairs.  The caller needs the permission to read groups.  The call is read-only, is not paged, and answers an empty list both for an account that belongs to no group  and for an ID that matches no account, so an empty answer does not prove the account exists.  The entries are summaries and carry neither the manager nor the members - read `GET api/2.0/group/{id}` for  the full picture of one of them.
   *
   * REST API Reference for getGroupByUserId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
   *
   * @param userid The ID of the account whose groups are listed, taken from the route. An ID that matches no account yields an  empty list rather than 404. (required)
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
   * Returns the groups of the portal, one page at a time, with the summary information about each of them - the  ID, the name and the manager - but without the member list.  The caller needs the permission to read groups.  The call is read-only, and the number of groups that match the filters is reported in the total count of the  response, so a client can page through them with `count` and `startIndex`.  Narrow the result with `filterValue` on the group name, with `userId` to keep only the groups that account  belongs to, and with `manager` set to true to keep only the groups it manages; order it with `sortBy` and  `sortOrder`, and an unknown `sortBy` falls back to sorting by title.  The entries carry no members - read `GET api/2.0/group/{id}` with `includeMembers` for one group, or  `GET api/2.0/group/user/{userid}` to find the groups of a single account.
   *
   * REST API Reference for getGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
   *
   * @param userId Keeps only the groups the account with this ID takes part in. Omit it to search every group of the portal. (optional)
   * @param manager Narrows `userId` down to the groups that account manages, instead of every group it belongs to. It has no  effect on its own and defaults to false. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param sortBy What to order the groups by: `Title`, `Manager` or `MembersCount`, compared without regard to case. Any other  value, and omitting the field, orders by title. (optional)
   * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroups(@javax.annotation.Nullable UUID userId, @javax.annotation.Nullable Boolean manager, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroups(userId, manager, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get groups
   * Returns the groups of the portal, one page at a time, with the summary information about each of them - the  ID, the name and the manager - but without the member list.  The caller needs the permission to read groups.  The call is read-only, and the number of groups that match the filters is reported in the total count of the  response, so a client can page through them with `count` and `startIndex`.  Narrow the result with `filterValue` on the group name, with `userId` to keep only the groups that account  belongs to, and with `manager` set to true to keep only the groups it manages; order it with `sortBy` and  `sortOrder`, and an unknown `sortBy` falls back to sorting by title.  The entries carry no members - read `GET api/2.0/group/{id}` with `includeMembers` for one group, or  `GET api/2.0/group/user/{userid}` to find the groups of a single account.
   *
   * REST API Reference for getGroups Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
   *
   * @param userId Keeps only the groups the account with this ID takes part in. Omit it to search every group of the portal. (optional)
   * @param manager Narrows `userId` down to the groups that account manages, instead of every group it belongs to. It has no  effect on its own and defaults to false. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param sortBy What to order the groups by: `Title`, `Manager` or `MembersCount`, compared without regard to case. Any other  value, and omitting the field, orders by title. (optional)
   * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group. (optional)
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
   * Moves every member of one group into another group, emptying the first one.  The caller needs the permissions to edit groups and to add and remove users, and both IDs have to belong to  groups that have not been deleted, otherwise the operation answers 404.  The source group is kept, only without members, so delete it separately through  `DELETE api/2.0/group/{id}` if it is no longer needed.  Members that cannot be group members any more are silently skipped rather than failing the call, and an  account that already belongs to the destination is simply left there.  The answer is the destination group with its members, not the source one.  To move a chosen few instead of everybody, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for moveMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
   *
   * @param fromId The ID of the group the members are taken from. It is emptied but not deleted, and it has to be a group that  has not been deleted already. (required)
   * @param toId The ID of the group the members are moved into. It is the group the answer describes, and it has to be a  group that has not been deleted already. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper moveMembersTo(@javax.annotation.Nonnull UUID fromId, @javax.annotation.Nonnull UUID toId) throws ApiException {
    return this.moveMembersTo(fromId, toId, Collections.emptyMap());
  }


  /**
   * Move group members
   * Moves every member of one group into another group, emptying the first one.  The caller needs the permissions to edit groups and to add and remove users, and both IDs have to belong to  groups that have not been deleted, otherwise the operation answers 404.  The source group is kept, only without members, so delete it separately through  `DELETE api/2.0/group/{id}` if it is no longer needed.  Members that cannot be group members any more are silently skipped rather than failing the call, and an  account that already belongs to the destination is simply left there.  The answer is the destination group with its members, not the source one.  To move a chosen few instead of everybody, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for moveMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
   *
   * @param fromId The ID of the group the members are taken from. It is emptied but not deleted, and it has to be a group that  has not been deleted already. (required)
   * @param toId The ID of the group the members are moved into. It is the group the answer describes, and it has to be a  group that has not been deleted already. (required)
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
   * Removes the listed accounts from a group, leaving the rest of its members in place.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The accounts themselves are kept; only their membership in this group ends, together with the access they had  through it.  The call is idempotent and forgiving: an ID that is not a member, and one that matches no account at all, are  both skipped without an error, and an empty list simply changes nothing.  The answer is the group with the members that remain.  Emptying a group cannot be done through `POST api/2.0/group/{id}/members`, which needs at least one valid  account, so list every member here, or move them away with `PUT api/2.0/group/{fromId}/members/{toId}`.
   *
   * REST API Reference for removeMembersFrom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper removeMembersFrom(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.removeMembersFrom(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Remove group members
   * Removes the listed accounts from a group, leaving the rest of its members in place.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The accounts themselves are kept; only their membership in this group ends, together with the access they had  through it.  The call is idempotent and forgiving: an ID that is not a member, and one that matches no account at all, are  both skipped without an error, and an empty list simply changes nothing.  The answer is the group with the members that remain.  Emptying a group cannot be done through `POST api/2.0/group/{id}/members`, which needs at least one valid  account, so list every member here, or move them away with `PUT api/2.0/group/{fromId}/members/{toId}`.
   *
   * REST API Reference for removeMembersFrom Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
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
   * Makes an account the manager of a group, replacing whoever managed it before.  The caller needs the permissions to edit groups and to add and remove users.  Both the group and the account have to exist: the operation answers 404 when the ID in the route matches no  live group and also when `userId` matches no account, so the message of the error says which of the two was  not found.  The account is added to the group at the same time, so a manager does not have to be a member beforehand, and  the previous manager stays in the group as an ordinary member.  A group has one manager, which makes the call idempotent when it names the account that manages it already.  The answer is the group with its new manager.  To change the members rather than the manager, use `PUT api/2.0/group/{id}/members`.
   *
   * REST API Reference for setGroupManager Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
   *
   * @param id The ID of the group whose manager is set, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param setManagerRequest The account to make the manager of the group. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setGroupManager(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull SetManagerRequest setManagerRequest) throws ApiException {
    return this.setGroupManager(id, setManagerRequest, Collections.emptyMap());
  }


  /**
   * Set a group manager
   * Makes an account the manager of a group, replacing whoever managed it before.  The caller needs the permissions to edit groups and to add and remove users.  Both the group and the account have to exist: the operation answers 404 when the ID in the route matches no  live group and also when `userId` matches no account, so the message of the error says which of the two was  not found.  The account is added to the group at the same time, so a manager does not have to be a member beforehand, and  the previous manager stays in the group as an ordinary member.  A group has one manager, which makes the call idempotent when it names the account that manages it already.  The answer is the group with its new manager.  To change the members rather than the manager, use `PUT api/2.0/group/{id}/members`.
   *
   * REST API Reference for setGroupManager Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
   *
   * @param id The ID of the group whose manager is set, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param setManagerRequest The account to make the manager of the group. (required)
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
   * Replaces the whole member list of a group with the accounts given in the request, removing everybody who is  not in that list.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  At least one of the listed accounts has to be usable as a group member, otherwise the call is rejected with  400 and the group is left untouched; the accounts that cannot be members - a guest, a disabled account or an  ID that matches nobody - are then silently skipped while the rest are applied.  The replacement is not atomic: the current members are removed first and the new ones added afterwards, so a  failure in between can leave the group empty.  The answer is the group with the members it ends up with, which is why it should be read instead of assuming  the request was applied verbatim.  To add or remove a few accounts without touching the others, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for setMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper setMembersTo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull MembersRequest membersRequest) throws ApiException {
    return this.setMembersTo(id, membersRequest, Collections.emptyMap());
  }


  /**
   * Replace group members
   * Replaces the whole member list of a group with the accounts given in the request, removing everybody who is  not in that list.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  At least one of the listed accounts has to be usable as a group member, otherwise the call is rejected with  400 and the group is left untouched; the accounts that cannot be members - a guest, a disabled account or an  ID that matches nobody - are then silently skipped while the rest are applied.  The replacement is not atomic: the current members are removed first and the new ones added afterwards, so a  failure in between can leave the group empty.  The answer is the group with the members it ends up with, which is why it should be read instead of assuming  the request was applied verbatim.  To add or remove a few accounts without touching the others, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
   *
   * REST API Reference for setMembersTo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
   *
   * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. (required)
   * @param membersRequest The accounts to add, replace with, or remove. (required)
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
   * Changes the name and the manager of a group and adds or removes members, in one call.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Every field is optional and the ones that are left out are kept: omitting `groupName` keeps the current name,  and omitting `groupManager` keeps the current manager rather than clearing it.  Accounts in `membersToAdd` that cannot be group members - a guest, a disabled account or an ID that matches  nobody - are silently skipped instead of failing the call, so compare the members in the answer with what was  sent to see what was actually applied.  Members are added first and removed afterwards, an account listed in both lists therefore ends up removed,  and removing an account that is not a member changes nothing.  The change raises a `GroupUpdated` webhook, and the answer holds the group as it is after the update.
   *
   * REST API Reference for updateGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
   *
   * @param id The ID of the group to update, taken from the route. It has to be a group that has not been deleted,  otherwise the operation answers 404. (required)
   * @param updateGroupRequest The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing. (required)
   * @return GroupWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupWrapper updateGroup(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UpdateGroupRequest updateGroupRequest) throws ApiException {
    return this.updateGroup(id, updateGroupRequest, Collections.emptyMap());
  }


  /**
   * Update a group
   * Changes the name and the manager of a group and adds or removes members, in one call.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Every field is optional and the ones that are left out are kept: omitting `groupName` keeps the current name,  and omitting `groupManager` keeps the current manager rather than clearing it.  Accounts in `membersToAdd` that cannot be group members - a guest, a disabled account or an ID that matches  nobody - are silently skipped instead of failing the call, so compare the members in the answer with what was  sent to see what was actually applied.  Members are added first and removed afterwards, an account listed in both lists therefore ends up removed,  and removing an account that is not a member changes nothing.  The change raises a `GroupUpdated` webhook, and the answer holds the group as it is after the update.
   *
   * REST API Reference for updateGroup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
   *
   * @param id The ID of the group to update, taken from the route. It has to be a group that has not been deleted,  otherwise the operation answers 404. (required)
   * @param updateGroupRequest The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing. (required)
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
