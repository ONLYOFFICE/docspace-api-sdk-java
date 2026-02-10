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

package org.openapitools.client.api.Files;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AceShortWrapperArrayWrapper;
import org.openapitools.client.model.BaseBatchRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ChangeOwnerRequestDto;
import org.openapitools.client.model.ExternalShareRequestParam;
import org.openapitools.client.model.ExternalShareWrapper;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.GroupMemberSecurityRequestArrayWrapper;
import org.openapitools.client.model.MentionMessageWrapper;
import org.openapitools.client.model.MentionWrapperArrayWrapper;
import org.openapitools.client.model.SecurityInfoRequestDto;
import org.openapitools.client.model.SecurityInfoSimpleRequestDto;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class SharingApi extends BaseApi {

  public SharingApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SharingApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Apply external data password
   * Applies a password specified in the request to get the external data.
   *
   * REST API Reference for applyExternalSharePassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/
   *
   * @param key The unique document identifier. (required)
   * @param externalShareRequestParam The external data share request parameters. (required)
   * @return ExternalShareWrapper
   * @throws ApiException if fails to make API call
   */
  public ExternalShareWrapper applyExternalSharePassword(@javax.annotation.Nonnull String key, @javax.annotation.Nonnull ExternalShareRequestParam externalShareRequestParam) throws ApiException {
    return this.applyExternalSharePassword(key, externalShareRequestParam, Collections.emptyMap());
  }


  /**
   * Apply external data password
   * Applies a password specified in the request to get the external data.
   *
   * REST API Reference for applyExternalSharePassword Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/
   *
   * @param key The unique document identifier. (required)
   * @param externalShareRequestParam The external data share request parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ExternalShareWrapper
   * @throws ApiException if fails to make API call
   */
  public ExternalShareWrapper applyExternalSharePassword(@javax.annotation.Nonnull String key, @javax.annotation.Nonnull ExternalShareRequestParam externalShareRequestParam, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = externalShareRequestParam;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling applyExternalSharePassword");
    }
    
    // verify the required parameter 'externalShareRequestParam' is set
    if (externalShareRequestParam == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShareRequestParam' when calling applyExternalSharePassword");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/share/{key}/password"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(apiClient.parameterToString(key)));

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ExternalShareWrapper> localVarReturnType = new TypeReference<ExternalShareWrapper>() {};
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
   * Change the file owner
   * Changes the owner of the file with the ID specified in the request.
   *
   * REST API Reference for changeFileOwner Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/
   *
   * @param changeOwnerRequestDto  (optional)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper changeFileOwner(@javax.annotation.Nullable ChangeOwnerRequestDto changeOwnerRequestDto) throws ApiException {
    return this.changeFileOwner(changeOwnerRequestDto, Collections.emptyMap());
  }


  /**
   * Change the file owner
   * Changes the owner of the file with the ID specified in the request.
   *
   * REST API Reference for changeFileOwner Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/
   *
   * @param changeOwnerRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper changeFileOwner(@javax.annotation.Nullable ChangeOwnerRequestDto changeOwnerRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = changeOwnerRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/owner";

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

    TypeReference<FileEntryBaseArrayWrapper> localVarReturnType = new TypeReference<FileEntryBaseArrayWrapper>() {};
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
   * Get the external data
   * Returns the external data by the key specified in the request.
   *
   * REST API Reference for getExternalShareData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/
   *
   * @param key The unique key of the external shared data. (required)
   * @param fileId The unique document identifier. (optional)
   * @param folderId The unique folder identifier. (optional)
   * @return ExternalShareWrapper
   * @throws ApiException if fails to make API call
   */
  public ExternalShareWrapper getExternalShareData(@javax.annotation.Nonnull String key, @javax.annotation.Nullable String fileId, @javax.annotation.Nullable String folderId) throws ApiException {
    return this.getExternalShareData(key, fileId, folderId, Collections.emptyMap());
  }


  /**
   * Get the external data
   * Returns the external data by the key specified in the request.
   *
   * REST API Reference for getExternalShareData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/
   *
   * @param key The unique key of the external shared data. (required)
   * @param fileId The unique document identifier. (optional)
   * @param folderId The unique folder identifier. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ExternalShareWrapper
   * @throws ApiException if fails to make API call
   */
  public ExternalShareWrapper getExternalShareData(@javax.annotation.Nonnull String key, @javax.annotation.Nullable String fileId, @javax.annotation.Nullable String folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getExternalShareData");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/share/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(apiClient.parameterToString(key)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("fileId", fileId));
    localVarQueryParams.addAll(apiClient.parameterToPair("folderId", folderId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ExternalShareWrapper> localVarReturnType = new TypeReference<ExternalShareWrapper>() {};
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
   * Get the shared file information
   * Returns the detailed information about the shared file with the ID specified in the request.
   *
   * REST API Reference for getFileSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFileSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFileSecurityInfo(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get the shared file information
   * Returns the detailed information about the shared file with the ID specified in the request.
   *
   * REST API Reference for getFileSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFileSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFileSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/share"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * Get the shared folder information
   * Returns the detailed information about the shared folder with the ID specified in the request.
   *
   * REST API Reference for getFolderSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/
   *
   * @param id The folder unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderSecurityInfo(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get the shared folder information
   * Returns the detailed information about the shared folder with the ID specified in the request.
   *
   * REST API Reference for getFolderSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/
   *
   * @param id The folder unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderSecurityInfo(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFolderSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{id}/share"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * Get file group members with security information
   * Returns the group members with their file security information.
   *
   * REST API Reference for getGroupsMembersWithFileSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/
   *
   * @param fileId The file ID. (required)
   * @param groupId The group ID. (required)
   * @param count The number of items to be retrieved in the current query. (optional)
   * @param startIndex The starting index for the query result set. (optional)
   * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
   * @return GroupMemberSecurityRequestArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UUID groupId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Get file group members with security information
   * Returns the group members with their file security information.
   *
   * REST API Reference for getGroupsMembersWithFileSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/
   *
   * @param fileId The file ID. (required)
   * @param groupId The group ID. (required)
   * @param count The number of items to be retrieved in the current query. (optional)
   * @param startIndex The starting index for the query result set. (optional)
   * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupMemberSecurityRequestArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UUID groupId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getGroupsMembersWithFileSecurity");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupsMembersWithFileSecurity");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/group/{groupId}/share"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    TypeReference<GroupMemberSecurityRequestArrayWrapper> localVarReturnType = new TypeReference<GroupMemberSecurityRequestArrayWrapper>() {};
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
   * Get folder group members with security information
   * Returns the group members with their folder security information.
   *
   * REST API Reference for getGroupsMembersWithFolderSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/
   *
   * @param folderId The folder ID. (required)
   * @param groupId The group ID. (required)
   * @param count The number of items to be retrieved in the current query. (optional)
   * @param startIndex The starting index for the query result set. (optional)
   * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
   * @return GroupMemberSecurityRequestArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull UUID groupId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue, Collections.emptyMap());
  }


  /**
   * Get folder group members with security information
   * Returns the group members with their folder security information.
   *
   * REST API Reference for getGroupsMembersWithFolderSecurity Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/
   *
   * @param folderId The folder ID. (required)
   * @param groupId The group ID. (required)
   * @param count The number of items to be retrieved in the current query. (optional)
   * @param startIndex The starting index for the query result set. (optional)
   * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupMemberSecurityRequestArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull UUID groupId, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getGroupsMembersWithFolderSecurity");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupsMembersWithFolderSecurity");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/group/{groupId}/share"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    TypeReference<GroupMemberSecurityRequestArrayWrapper> localVarReturnType = new TypeReference<GroupMemberSecurityRequestArrayWrapper>() {};
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
   * Get the sharing rights
   * Returns the sharing rights for all the files and folders specified in the request.
   *
   * REST API Reference for getSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/
   *
   * @param baseBatchRequestDto  (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getSecurityInfo(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.getSecurityInfo(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Get the sharing rights
   * Returns the sharing rights for all the files and folders specified in the request.
   *
   * REST API Reference for getSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getSecurityInfo(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/share";

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

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * Get user access rights by file ID
   * Returns a list of users with their access rights to the file with the ID specified in the request.
   *
   * REST API Reference for getSharedUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/
   *
   * @param fileId The file unique identifier. (required)
   * @return MentionWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MentionWrapperArrayWrapper getSharedUsers(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getSharedUsers(fileId, Collections.emptyMap());
  }


  /**
   * Get user access rights by file ID
   * Returns a list of users with their access rights to the file with the ID specified in the request.
   *
   * REST API Reference for getSharedUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MentionWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MentionWrapperArrayWrapper getSharedUsers(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getSharedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/sharedusers"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

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

    TypeReference<MentionWrapperArrayWrapper> localVarReturnType = new TypeReference<MentionWrapperArrayWrapper>() {};
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
   * Remove the sharing rights
   * Removes the sharing rights from all the files and folders specified in the request.
   *
   * REST API Reference for removeSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/
   *
   * @param baseBatchRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper removeSecurityInfo(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.removeSecurityInfo(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Remove the sharing rights
   * Removes the sharing rights from all the files and folders specified in the request.
   *
   * REST API Reference for removeSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper removeSecurityInfo(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/share";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Send the mention message
   * Sends a message to the users who are mentioned in the file with the ID specified in the request.
   *
   * REST API Reference for sendEditorNotify Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/
   *
   * @param fileId The file ID with the mention message. (required)
   * @param mentionMessageWrapper The mention message. (optional)
   * @return AceShortWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AceShortWrapperArrayWrapper sendEditorNotify(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable MentionMessageWrapper mentionMessageWrapper) throws ApiException {
    return this.sendEditorNotify(fileId, mentionMessageWrapper, Collections.emptyMap());
  }


  /**
   * Send the mention message
   * Sends a message to the users who are mentioned in the file with the ID specified in the request.
   *
   * REST API Reference for sendEditorNotify Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/
   *
   * @param fileId The file ID with the mention message. (required)
   * @param mentionMessageWrapper The mention message. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AceShortWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public AceShortWrapperArrayWrapper sendEditorNotify(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable MentionMessageWrapper mentionMessageWrapper, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = mentionMessageWrapper;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling sendEditorNotify");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/sendeditornotify"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

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

    TypeReference<AceShortWrapperArrayWrapper> localVarReturnType = new TypeReference<AceShortWrapperArrayWrapper>() {};
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
   * Share a file
   * Sets the sharing settings to a file with the ID specified in the request.
   *
   * REST API Reference for setFileSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/
   *
   * @param fileId The file ID. (required)
   * @param securityInfoSimpleRequestDto The parameters of the security information simple request. (required)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setFileSecurityInfo(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto) throws ApiException {
    return this.setFileSecurityInfo(fileId, securityInfoSimpleRequestDto, Collections.emptyMap());
  }


  /**
   * Share a file
   * Sets the sharing settings to a file with the ID specified in the request.
   *
   * REST API Reference for setFileSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/
   *
   * @param fileId The file ID. (required)
   * @param securityInfoSimpleRequestDto The parameters of the security information simple request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setFileSecurityInfo(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = securityInfoSimpleRequestDto;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling setFileSecurityInfo");
    }
    
    // verify the required parameter 'securityInfoSimpleRequestDto' is set
    if (securityInfoSimpleRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'securityInfoSimpleRequestDto' when calling setFileSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/share"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

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

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * Share a folder
   * Sets the sharing settings to a folder with the ID specified in the request.
   *
   * REST API Reference for setFolderSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/
   *
   * @param folderId The folder ID. (required)
   * @param securityInfoSimpleRequestDto The parameters of the security information simple request. (required)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setFolderSecurityInfo(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto) throws ApiException {
    return this.setFolderSecurityInfo(folderId, securityInfoSimpleRequestDto, Collections.emptyMap());
  }


  /**
   * Share a folder
   * Sets the sharing settings to a folder with the ID specified in the request.
   *
   * REST API Reference for setFolderSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/
   *
   * @param folderId The folder ID. (required)
   * @param securityInfoSimpleRequestDto The parameters of the security information simple request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setFolderSecurityInfo(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = securityInfoSimpleRequestDto;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling setFolderSecurityInfo");
    }
    
    // verify the required parameter 'securityInfoSimpleRequestDto' is set
    if (securityInfoSimpleRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'securityInfoSimpleRequestDto' when calling setFolderSecurityInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/share"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)));

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

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * Set the sharing rights
   * Sets the sharing rights to all the files and folders specified in the request.
   *
   * REST API Reference for setSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/
   *
   * @param securityInfoRequestDto  (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setSecurityInfo(@javax.annotation.Nullable SecurityInfoRequestDto securityInfoRequestDto) throws ApiException {
    return this.setSecurityInfo(securityInfoRequestDto, Collections.emptyMap());
  }


  /**
   * Set the sharing rights
   * Sets the sharing rights to all the files and folders specified in the request.
   *
   * REST API Reference for setSecurityInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/
   *
   * @param securityInfoRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper setSecurityInfo(@javax.annotation.Nullable SecurityInfoRequestDto securityInfoRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = securityInfoRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/share";

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

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
