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


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SearchApi extends BaseApi {

  public SearchApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Search groups for a file
   * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a file
   * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFilesShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/file/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
   * Search groups for a file (third-party storage)
   * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a file (third-party storage)
   * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
   *
   * REST API Reference for getGroupsWithFilesShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFilesShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFilesShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/file/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
   * Search groups for a folder
   * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a folder
   * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFoldersShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/folder/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
   * Search groups for a folder (third-party storage)
   * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a folder (third-party storage)
   * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
   *
   * REST API Reference for getGroupsWithFoldersShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithFoldersShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithFoldersShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/folder/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
   * Search groups for a room
   * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a room
   * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithRoomsShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/room/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
   * Search groups for a room (third-party storage)
   * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Search groups for a room (third-party storage)
   * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
   *
   * REST API Reference for getGroupsWithRoomsShared Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
   *
   * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. (required)
   * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
   * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
   * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
   * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupArrayWrapper getGroupsWithRoomsShared(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Boolean excludeShared, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGroupsWithRoomsShared");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/group/room/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("excludeShared", excludeShared));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
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
