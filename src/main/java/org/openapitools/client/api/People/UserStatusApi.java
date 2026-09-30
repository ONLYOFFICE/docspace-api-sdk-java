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
import org.openapitools.client.model.ErrorApiResponse;
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
   * Returns a page of the accounts that are in one particular state - the status is taken from the route - with  the full profile of each of them.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Narrow it with `filterValue` on the name and the email; setting `filterBy` to `group` makes the same  `filterValue` the ID of the group to keep the members of, and because the value is then applied as the text  filter as well, that combination normally matches nothing - use `GET api/2.0/people/filter` with `groupId`  to filter by group.  `GET api/2.0/people` is the same operation fixed to the `Active` status.
   *
   * REST API Reference for getByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
   *
   * @param status The account state to list, taken from the route: `Active` for working accounts, `Terminated` for disabled  ones, `Pending` for open invitations, or `All` for every state. (required)
   * @param filterBy The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. (optional)
   * @param sortBy What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. (optional)
   * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
   * @param filterSeparator The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. (optional)
   * @param filterValue The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter. (optional)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper getByStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nullable String filterBy, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterSeparator, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getByStatus(status, filterBy, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue, Collections.emptyMap());
  }


  /**
   * Get profiles by status
   * Returns a page of the accounts that are in one particular state - the status is taken from the route - with  the full profile of each of them.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Narrow it with `filterValue` on the name and the email; setting `filterBy` to `group` makes the same  `filterValue` the ID of the group to keep the members of, and because the value is then applied as the text  filter as well, that combination normally matches nothing - use `GET api/2.0/people/filter` with `groupId`  to filter by group.  `GET api/2.0/people` is the same operation fixed to the `Active` status.
   *
   * REST API Reference for getByStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
   *
   * @param status The account state to list, taken from the route: `Active` for working accounts, `Terminated` for disabled  ones, `Pending` for open invitations, or `All` for every state. (required)
   * @param filterBy The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. (optional)
   * @param sortBy What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. (optional)
   * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
   * @param filterSeparator The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. (optional)
   * @param filterValue The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter. (optional)
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
   * Set my activation status
   * Sets the activation state of the calling account, which is how a person finishes confirming their email  address after following the link they were sent.  The request has to carry the confirmation token from that link rather than an ordinary session, and the  account must be allowed to edit its own profile.  Despite taking a list, it accepts exactly one ID and that ID has to be the calling account: an empty list,  more than one entry, or somebody else's ID is answered with 400, so it cannot be used to activate other  people.  Setting `Activated` on the portal owner sends the administrator welcome email, once per portal.  The change raises a `UserUpdated` webhook, and the answer holds the profile in its new state - or nothing at  all when the account has meanwhile disappeared, which is skipped without an error.  The account status is a different thing and is changed through `PUT api/2.0/people/status/{status}`.
   *
   * REST API Reference for updateUserActivationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
   *
   * @param activationstatus The activation state to set on the calling account, taken from the route: `NotActivated`, `Activated`,  `Pending` or `AutoGenerated`. (required)
   * @param updateMembersRequestDto The account to change. Only `userIds` is read, it has to hold exactly one entry, and that entry has to be the  calling account; `resendAll` is ignored here. (required)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserActivationStatus(@javax.annotation.Nonnull EmployeeActivationStatus activationstatus, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.updateUserActivationStatus(activationstatus, updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Set my activation status
   * Sets the activation state of the calling account, which is how a person finishes confirming their email  address after following the link they were sent.  The request has to carry the confirmation token from that link rather than an ordinary session, and the  account must be allowed to edit its own profile.  Despite taking a list, it accepts exactly one ID and that ID has to be the calling account: an empty list,  more than one entry, or somebody else's ID is answered with 400, so it cannot be used to activate other  people.  Setting `Activated` on the portal owner sends the administrator welcome email, once per portal.  The change raises a `UserUpdated` webhook, and the answer holds the profile in its new state - or nothing at  all when the account has meanwhile disappeared, which is skipped without an error.  The account status is a different thing and is changed through `PUT api/2.0/people/status/{status}`.
   *
   * REST API Reference for updateUserActivationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
   *
   * @param activationstatus The activation state to set on the calling account, taken from the route: `NotActivated`, `Activated`,  `Pending` or `AutoGenerated`. (required)
   * @param updateMembersRequestDto The account to change. Only `userIds` is read, it has to hold exactly one entry, and that entry has to be the  calling account; `resendAll` is ignored here. (required)
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
   * Enables or disables several portal accounts at once, which is the way to suspend somebody without deleting  them and to bring them back later.  Only `Active` and `Terminated` are accepted in the route; any other status answers 400.  The caller needs the permission to edit users, and the whole list is checked before anything is applied: a  system account, an LDAP account, the portal owner, the caller themselves, or - unless the caller is the  portal owner - a DocSpace administrator rejects the entire call with 403 and changes nothing.  Disabling ends every session of the account and takes its seat back, while enabling takes a seat again and  can therefore answer 402 when the tariff or the user quota has none left; the accounts are then processed one  by one, so a quota failure partway through leaves the earlier ones enabled.  Enabling only affects accounts that were disabled, and an account that had never filled in its name comes  back as `Pending` rather than `Active` when it still has an unused invitation, so read the `status` in the  answer instead of assuming it matches the request.  Each changed account raises a `UserUpdated` webhook, and disabling is what  `DELETE api/2.0/people/{userid}` requires before it will delete an account.
   *
   * REST API Reference for updateUserStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
   *
   * @param status The state to put the listed accounts into, taken from the route. Only `Active`, which enables an account,  and `Terminated`, which disables it, are accepted; any other value is rejected with 400. (required)
   * @param updateMembersRequestDto The accounts to enable or disable. Only `userIds` is read by this operation; `resendAll` belongs to the  invitation operations and is ignored here. (required)
   * @return EmployeeFullArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EmployeeFullArrayWrapper updateUserStatus(@javax.annotation.Nonnull EmployeeStatus status, @javax.annotation.Nonnull UpdateMembersRequestDto updateMembersRequestDto) throws ApiException {
    return this.updateUserStatus(status, updateMembersRequestDto, Collections.emptyMap());
  }


  /**
   * Change a user status
   * Enables or disables several portal accounts at once, which is the way to suspend somebody without deleting  them and to bring them back later.  Only `Active` and `Terminated` are accepted in the route; any other status answers 400.  The caller needs the permission to edit users, and the whole list is checked before anything is applied: a  system account, an LDAP account, the portal owner, the caller themselves, or - unless the caller is the  portal owner - a DocSpace administrator rejects the entire call with 403 and changes nothing.  Disabling ends every session of the account and takes its seat back, while enabling takes a seat again and  can therefore answer 402 when the tariff or the user quota has none left; the accounts are then processed one  by one, so a quota failure partway through leaves the earlier ones enabled.  Enabling only affects accounts that were disabled, and an account that had never filled in its name comes  back as `Pending` rather than `Active` when it still has an unused invitation, so read the `status` in the  answer instead of assuming it matches the request.  Each changed account raises a `UserUpdated` webhook, and disabling is what  `DELETE api/2.0/people/{userid}` requires before it will delete an account.
   *
   * REST API Reference for updateUserStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
   *
   * @param status The state to put the listed accounts into, taken from the route. Only `Active`, which enables an account,  and `Terminated`, which disables it, are accepted; any other value is rejected with 400. (required)
   * @param updateMembersRequestDto The accounts to enable or disable. Only `userIds` is read by this operation; `resendAll` belongs to the  invitation operations and is ignored here. (required)
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
