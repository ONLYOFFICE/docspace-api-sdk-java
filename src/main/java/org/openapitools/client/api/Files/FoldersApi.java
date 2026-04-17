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

package org.openapitools.client.api.Files;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.ApplyFilterOption;
import org.openapitools.client.model.CheckUploadRequest;
import org.openapitools.client.model.CreateFolder;
import org.openapitools.client.model.DeleteFolder;
import java.io.File;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileIntegerWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.FileShareWrapper;
import org.openapitools.client.model.FilesStatisticsResultWrapper;
import org.openapitools.client.model.FilterType;
import org.openapitools.client.model.FolderContentIntegerArrayWrapper;
import org.openapitools.client.model.FolderContentIntegerWrapper;
import org.openapitools.client.model.FolderIntegerWrapper;
import org.openapitools.client.model.FolderLinkRequest;
import org.openapitools.client.model.FormsItemArrayWrapper;
import org.openapitools.client.model.HistoryArrayWrapper;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.OrderRequestDto;
import org.openapitools.client.model.STRINGArrayWrapper;
import org.openapitools.client.model.SearchArea;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.StringWrapper;
import java.util.UUID;
import org.openapitools.client.model.UploadRequestDto;
import org.openapitools.client.model.XlsxReportResponseWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class FoldersApi extends BaseApi {

  public FoldersApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FoldersApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public FoldersApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Check file uploads
   * Checks the file uploads to the folder with the ID specified in the request.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder ID. (required)
   * @param checkUploadRequest The request parameters for checking file uploads. (required)
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper checkUpload(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CheckUploadRequest checkUploadRequest) throws ApiException {
    return this.checkUpload(folderId, checkUploadRequest, Collections.emptyMap());
  }


  /**
   * Check file uploads
   * Checks the file uploads to the folder with the ID specified in the request.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder ID. (required)
   * @param checkUploadRequest The request parameters for checking file uploads. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper checkUpload(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CheckUploadRequest checkUploadRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = checkUploadRequest;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling checkUpload");
    }
    
    // verify the required parameter 'checkUploadRequest' is set
    if (checkUploadRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'checkUploadRequest' when calling checkUpload");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/upload/check"
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

    TypeReference<STRINGArrayWrapper> localVarReturnType = new TypeReference<STRINGArrayWrapper>() {};
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
   * Create a folder
   * Creates a new folder with the title specified in the request. The parent folder ID can be also specified.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder ID for the folder creation. (required)
   * @param createFolder The parameters for creating a folder. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.createFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Create a folder
   * Creates a new folder with the title specified in the request. The parent folder ID can be also specified.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder ID for the folder creation. (required)
   * @param createFolder The parameters for creating a folder. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper createFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createFolder;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createFolder");
    }
    
    // verify the required parameter 'createFolder' is set
    if (createFolder == null) {
      throw new ApiException(400, "Missing the required parameter 'createFolder' when calling createFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}"
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

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
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
   * Create primary external link
   * Creates a primary external link by the identifier specified in the request.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder ID. (required)
   * @param folderLinkRequest The folder link parameters. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.createFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Create primary external link
   * Creates a primary external link by the identifier specified in the request.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder ID. (required)
   * @param folderLinkRequest The folder link parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = folderLinkRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createFolderPrimaryExternalLink");
    }
    
    // verify the required parameter 'folderLinkRequest' is set
    if (folderLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'folderLinkRequest' when calling createFolderPrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{id}/link"
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

    TypeReference<FileShareWrapper> localVarReturnType = new TypeReference<FileShareWrapper>() {};
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
   * Generates folder history
   * Generates the activity history of a folder.
   *
   * REST API Reference for createReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
   *
   * @param folderId  (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createReportFolderHistory(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.createReportFolderHistory(folderId, Collections.emptyMap());
  }


  /**
   * Generates folder history
   * Generates the activity history of a folder.
   *
   * REST API Reference for createReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
   *
   * @param folderId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper createReportFolderHistory(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createReportFolderHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/log/report"
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
   * Delete a folder
   * Deletes a folder with the ID specified in the request.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder ID to delete. (required)
   * @param deleteFolder The parameters for deleting a folder. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull DeleteFolder deleteFolder) throws ApiException {
    return this.deleteFolder(folderId, deleteFolder, Collections.emptyMap());
  }


  /**
   * Delete a folder
   * Deletes a folder with the ID specified in the request.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder ID to delete. (required)
   * @param deleteFolder The parameters for deleting a folder. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull DeleteFolder deleteFolder, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteFolder;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling deleteFolder");
    }
    
    // verify the required parameter 'deleteFolder' is set
    if (deleteFolder == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteFolder' when calling deleteFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}"
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

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Generate XLSX report by folder
   * Triggers asynchronous XLSX report generation for the specified form results folder.
   *
   * REST API Reference for generateXlsxByFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/
   *
   * @param folderId The folder unique identifier. (required)
   * @return XlsxReportResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public XlsxReportResponseWrapper generateXlsxByFolder(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.generateXlsxByFolder(folderId, Collections.emptyMap());
  }


  /**
   * Generate XLSX report by folder
   * Triggers asynchronous XLSX report generation for the specified form results folder.
   *
   * REST API Reference for generateXlsxByFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return XlsxReportResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public XlsxReportResponseWrapper generateXlsxByFolder(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling generateXlsxByFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/xlsx"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<XlsxReportResponseWrapper> localVarReturnType = new TypeReference<XlsxReportResponseWrapper>() {};
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
   * Get the Favorites section
   * Returns the detailed list of files and folders located in the Favorites section.
   *
   * REST API Reference for getFavoritesFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getFavoritesFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Favorites section
   * Returns the detailed list of files and folders located in the Favorites section.
   *
   * REST API Reference for getFavoritesFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getFavoritesFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@favorites";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
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

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Get used space of files
   * Returns the used space of files in the root folders.
   *
   * REST API Reference for getFilesUsedSpace Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/
   *
   * @return FilesStatisticsResultWrapper
   * @throws ApiException if fails to make API call
   */
  public FilesStatisticsResultWrapper getFilesUsedSpace() throws ApiException {
    return this.getFilesUsedSpace(Collections.emptyMap());
  }


  /**
   * Get used space of files
   * Returns the used space of files in the root folders.
   *
   * REST API Reference for getFilesUsedSpace Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return FilesStatisticsResultWrapper
   * @throws ApiException if fails to make API call
   */
  public FilesStatisticsResultWrapper getFilesUsedSpace(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/filesusedspace";

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

    TypeReference<FilesStatisticsResultWrapper> localVarReturnType = new TypeReference<FilesStatisticsResultWrapper>() {};
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
   * Get folder form filter
   * Returns the form filter of a folder with the ID specified in the request.
   *
   * REST API Reference for getFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
   *
   * @param folderId The folder unique identifier. (required)
   * @return FormsItemArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FormsItemArrayWrapper getFolder(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolder(folderId, Collections.emptyMap());
  }


  /**
   * Get folder form filter
   * Returns the form filter of a folder with the ID specified in the request.
   *
   * REST API Reference for getFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FormsItemArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FormsItemArrayWrapper getFolder(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/formfilter"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FormsItemArrayWrapper> localVarReturnType = new TypeReference<FormsItemArrayWrapper>() {};
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
   * Get a folder by ID
   * Returns the detailed list of files and folders located in the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder ID. (required)
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param sharedBy The identifier of the user who shared the folder or file. (optional)
   * @param filterType The filter type. (optional)
   * @param roomId The room ID. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders, or all elements from the specified folder. (optional)
   * @param extension Specifies whether to search for the specific file extension. (optional)
   * @param searchArea The search area. (optional)
   * @param formsItemKey The forms item key. (optional)
   * @param formsItemType The forms item type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated request. (optional)
   * @param sortBy The property used for sorting the folder request results. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text value used as a filter parameter for folder content queries. (optional)
   * @param location The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getFolderByFolderId(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer roomId, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location) throws ApiException {
    return this.getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location, Collections.emptyMap());
  }


  /**
   * Get a folder by ID
   * Returns the detailed list of files and folders located in the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder ID. (required)
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param sharedBy The identifier of the user who shared the folder or file. (optional)
   * @param filterType The filter type. (optional)
   * @param roomId The room ID. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders, or all elements from the specified folder. (optional)
   * @param extension Specifies whether to search for the specific file extension. (optional)
   * @param searchArea The search area. (optional)
   * @param formsItemKey The forms item key. (optional)
   * @param formsItemType The forms item type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated request. (optional)
   * @param sortBy The property used for sorting the folder request results. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text value used as a filter parameter for folder content queries. (optional)
   * @param location The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getFolderByFolderId(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer roomId, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderByFolderId");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("sharedBy", sharedBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("roomId", roomId));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
    localVarQueryParams.addAll(apiClient.parameterToPair("extension", extension));
    localVarQueryParams.addAll(apiClient.parameterToPair("searchArea", searchArea));
    localVarQueryParams.addAll(apiClient.parameterToPair("formsItemKey", formsItemKey));
    localVarQueryParams.addAll(apiClient.parameterToPair("formsItemType", formsItemType));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterValue", filterValue));
    localVarQueryParams.addAll(apiClient.parameterToPair("Location", location));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Get folder history
   * Returns the activity history of a folder with a specified identifier.
   *
   * REST API Reference for getFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
   *
   * @param folderId The folder ID of the history request. (required)
   * @param fromDate The start date of the history request. (optional)
   * @param toDate The end date of the history request. (optional)
   * @param count The number of records to retrieve for the folder history. (optional)
   * @param startIndex The starting index from which the history records are retrieved in the request. (optional)
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable ApiDateTime fromDate, @javax.annotation.Nullable ApiDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderHistory(folderId, fromDate, toDate, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get folder history
   * Returns the activity history of a folder with a specified identifier.
   *
   * REST API Reference for getFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
   *
   * @param folderId The folder ID of the history request. (required)
   * @param fromDate The start date of the history request. (optional)
   * @param toDate The end date of the history request. (optional)
   * @param count The number of records to retrieve for the folder history. (optional)
   * @param startIndex The starting index from which the history records are retrieved in the request. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable ApiDateTime fromDate, @javax.annotation.Nullable ApiDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/log"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParameterBaseName = "fromDate";
    localVarQueryStringJoiner.add(fromDate.toUrlQueryString("fromDate"));
    localVarQueryParameterBaseName = "toDate";
    localVarQueryStringJoiner.add(toDate.toUrlQueryString("toDate"));
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

    TypeReference<HistoryArrayWrapper> localVarReturnType = new TypeReference<HistoryArrayWrapper>() {};
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
   * Get folder information
   * Returns the detailed information about a folder with the ID specified in the request.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder unique identifier. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getFolderInfo(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolderInfo(folderId, Collections.emptyMap());
  }


  /**
   * Get folder information
   * Returns the detailed information about a folder with the ID specified in the request.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper getFolderInfo(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
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
   * Get the folder links
   * Returns the links of the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder ID. (required)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderLinks(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getFolderLinks(id, Collections.emptyMap());
  }


  /**
   * Get the folder links
   * Returns the links of the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderLinks(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFolderLinks");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{id}/links"
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
   * Get the folder path
   * Returns a path to the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder unique identifier. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolderPath(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolderPath(folderId, Collections.emptyMap());
  }


  /**
   * Get the folder path
   * Returns a path to the folder with the ID specified in the request.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolderPath(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderPath");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/path"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileEntryBaseArrayWrapper> localVarReturnType = new TypeReference<FileEntryBaseArrayWrapper>() {};
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
   * Get primary external link
   * Returns the primary external link by the identifier specified in the request.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderPrimaryExternalLink(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get primary external link
   * Returns the primary external link by the identifier specified in the request.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFolderPrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{id}/link"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileShareWrapper> localVarReturnType = new TypeReference<FileShareWrapper>() {};
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
   * Get subfolders
   * Returns a list of all the subfolders from a folder with the ID specified in the request.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder unique identifier. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolders(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolders(folderId, Collections.emptyMap());
  }


  /**
   * Get subfolders
   * Returns a list of all the subfolders from a folder with the ID specified in the request.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolders(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolders");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/subfolders"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileEntryBaseArrayWrapper> localVarReturnType = new TypeReference<FileEntryBaseArrayWrapper>() {};
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
   * Get the My documents section
   * Returns the detailed list of files and folders located in the My documents section.
   *
   * REST API Reference for getMyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getMyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the My documents section
   * Returns the detailed list of files and folders located in the My documents section.
   *
   * REST API Reference for getMyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getMyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
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

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Get new folder items
   * Returns a list of all the new items from a folder with the ID specified in the request.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder unique identifier. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getNewFolderItems(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getNewFolderItems(folderId, Collections.emptyMap());
  }


  /**
   * Get new folder items
   * Returns a list of all the new items from a folder with the ID specified in the request.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getNewFolderItems(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getNewFolderItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/news"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileEntryBaseArrayWrapper> localVarReturnType = new TypeReference<FileEntryBaseArrayWrapper>() {};
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
   * Get the Private Room section
   * Returns the detailed list of files and folders located in the Private Room section.
   *
   * REST API Reference for getPrivacyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getPrivacyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Private Room section
   * Returns the detailed list of files and folders located in the Private Room section.
   *
   * REST API Reference for getPrivacyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param count The maximum number of items to retrieve in the request. (optional)
   * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getPrivacyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@privacy";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
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

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Get the Recent section
   * Returns the detailed list of files located in the Recent section.
   *
   * REST API Reference for getRecentFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param searchArea The search area. (optional)
   * @param extension Specifies whether to search for a specific file extension in the Recent folder. (optional)
   * @param count The maximum number of items to return. (optional)
   * @param startIndex The starting position of the results to be returned in the query response. (optional)
   * @param sortBy Specifies the sorting criteria for the folder request. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getRecentFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable List<String> extension, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Recent section
   * Returns the detailed list of files located in the Recent section.
   *
   * REST API Reference for getRecentFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param searchArea The search area. (optional)
   * @param extension Specifies whether to search for a specific file extension in the Recent folder. (optional)
   * @param count The maximum number of items to return. (optional)
   * @param startIndex The starting position of the results to be returned in the query response. (optional)
   * @param sortBy Specifies the sorting criteria for the folder request. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getRecentFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable List<String> extension, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/recent";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
    localVarQueryParams.addAll(apiClient.parameterToPair("searchArea", searchArea));
    localVarQueryParameterBaseName = "extension";
    for (int i=0; i < extension.size(); i++) {
      localVarQueryStringJoiner.add(String.format(java.util.Locale.ROOT, "extension[%d]=%s", i, apiClient.parameterToString(extension.get(i))));
    }
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

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Get filtered sections
   * Returns all the sections matching the parameters specified in the request.
   *
   * REST API Reference for getRootFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param withoutTrash Specifies whether to return the Trash section or not. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter for searching or retrieving folder contents. (optional)
   * @return FolderContentIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerArrayWrapper getRootFolders(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean withoutTrash, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get filtered sections
   * Returns all the sections matching the parameters specified in the request.
   *
   * REST API Reference for getRootFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param withoutTrash Specifies whether to return the Trash section or not. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used as a filter for searching or retrieving folder contents. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerArrayWrapper getRootFolders(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean withoutTrash, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@root";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("withoutTrash", withoutTrash));
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

    TypeReference<FolderContentIntegerArrayWrapper> localVarReturnType = new TypeReference<FolderContentIntegerArrayWrapper>() {};
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
   * Get the Trash section
   * Returns the detailed list of files and folders located in the Trash section.
   *
   * REST API Reference for getTrashFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getTrashFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Trash section
   * Returns the detailed list of files and folders located in the Trash section.
   *
   * REST API Reference for getTrashFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/
   *
   * @param userIdOrGroupId The user or group ID. (optional)
   * @param filterType The filter type. (optional)
   * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
   * @param count The maximum number of items to retrieve in the response. (optional)
   * @param startIndex The starting position of the items to be retrieved. (optional)
   * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
   * @param sortOrder The order in which the results are sorted. (optional)
   * @param filterValue The text used for filtering or searching folder contents. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentIntegerWrapper getTrashFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@trash";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("userIdOrGroupId", userIdOrGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("filterType", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
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

    TypeReference<FolderContentIntegerWrapper> localVarReturnType = new TypeReference<FolderContentIntegerWrapper>() {};
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
   * Insert a file
   * Inserts a file specified in the request to the selected folder by single file uploading.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder ID for inserting a file. (required)
   * @param insertFileFile The file to be inserted. (optional)
   * @param insertFileTitle The file title to be inserted. (optional)
   * @param insertFileCreateNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
   * @param insertFileKeepConvertStatus Specifies whether to keep the file converting status or not. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper insertFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout) throws ApiException {
    return this.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout, Collections.emptyMap());
  }


  /**
   * Insert a file
   * Inserts a file specified in the request to the selected folder by single file uploading.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder ID for inserting a file. (required)
   * @param insertFileFile The file to be inserted. (optional)
   * @param insertFileTitle The file title to be inserted. (optional)
   * @param insertFileCreateNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
   * @param insertFileKeepConvertStatus Specifies whether to keep the file converting status or not. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper insertFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling insertFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/insert"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (insertFileFile != null)
      localVarFormParams.put("InsertFile.File", insertFileFile);
if (insertFileTitle != null)
      localVarFormParams.put("InsertFile.Title", insertFileTitle);
if (insertFileCreateNewIfExist != null)
      localVarFormParams.put("InsertFile.CreateNewIfExist", insertFileCreateNewIfExist);
if (insertFileKeepConvertStatus != null)
      localVarFormParams.put("InsertFile.KeepConvertStatus", insertFileKeepConvertStatus);
if (insertFileStreamCanRead != null)
      localVarFormParams.put("InsertFile.Stream.CanRead", insertFileStreamCanRead);
if (insertFileStreamCanWrite != null)
      localVarFormParams.put("InsertFile.Stream.CanWrite", insertFileStreamCanWrite);
if (insertFileStreamCanSeek != null)
      localVarFormParams.put("InsertFile.Stream.CanSeek", insertFileStreamCanSeek);
if (insertFileStreamCanTimeout != null)
      localVarFormParams.put("InsertFile.Stream.CanTimeout", insertFileStreamCanTimeout);
if (insertFileStreamLength != null)
      localVarFormParams.put("InsertFile.Stream.Length", insertFileStreamLength);
if (insertFileStreamPosition != null)
      localVarFormParams.put("InsertFile.Stream.Position", insertFileStreamPosition);
if (insertFileStreamReadTimeout != null)
      localVarFormParams.put("InsertFile.Stream.ReadTimeout", insertFileStreamReadTimeout);
if (insertFileStreamWriteTimeout != null)
      localVarFormParams.put("InsertFile.Stream.WriteTimeout", insertFileStreamWriteTimeout);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * Insert a file to the My documents section
   * Inserts a file specified in the request to the My documents section by single file uploading.
   *
   * REST API Reference for insertFileToMyFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/
   *
   * @param _file The file to be inserted. (optional)
   * @param title The file title to be inserted. (optional)
   * @param createNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
   * @param keepConvertStatus Specifies whether to keep the file converting status or not. (optional)
   * @param streamCanRead  (optional)
   * @param streamCanWrite  (optional)
   * @param streamCanSeek  (optional)
   * @param streamCanTimeout  (optional)
   * @param streamLength  (optional)
   * @param streamPosition  (optional)
   * @param streamReadTimeout  (optional)
   * @param streamWriteTimeout  (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper insertFileToMyFromBody(@javax.annotation.Nullable File _file, @javax.annotation.Nullable String title, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable Boolean streamCanRead, @javax.annotation.Nullable Boolean streamCanWrite, @javax.annotation.Nullable Boolean streamCanSeek, @javax.annotation.Nullable Boolean streamCanTimeout, @javax.annotation.Nullable Long streamLength, @javax.annotation.Nullable Long streamPosition, @javax.annotation.Nullable Integer streamReadTimeout, @javax.annotation.Nullable Integer streamWriteTimeout) throws ApiException {
    return this.insertFileToMyFromBody(_file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout, Collections.emptyMap());
  }


  /**
   * Insert a file to the My documents section
   * Inserts a file specified in the request to the My documents section by single file uploading.
   *
   * REST API Reference for insertFileToMyFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/
   *
   * @param _file The file to be inserted. (optional)
   * @param title The file title to be inserted. (optional)
   * @param createNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
   * @param keepConvertStatus Specifies whether to keep the file converting status or not. (optional)
   * @param streamCanRead  (optional)
   * @param streamCanWrite  (optional)
   * @param streamCanSeek  (optional)
   * @param streamCanTimeout  (optional)
   * @param streamLength  (optional)
   * @param streamPosition  (optional)
   * @param streamReadTimeout  (optional)
   * @param streamWriteTimeout  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper insertFileToMyFromBody(@javax.annotation.Nullable File _file, @javax.annotation.Nullable String title, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable Boolean streamCanRead, @javax.annotation.Nullable Boolean streamCanWrite, @javax.annotation.Nullable Boolean streamCanSeek, @javax.annotation.Nullable Boolean streamCanTimeout, @javax.annotation.Nullable Long streamLength, @javax.annotation.Nullable Long streamPosition, @javax.annotation.Nullable Integer streamReadTimeout, @javax.annotation.Nullable Integer streamWriteTimeout, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my/insert";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (_file != null)
      localVarFormParams.put("File", _file);
if (title != null)
      localVarFormParams.put("Title", title);
if (createNewIfExist != null)
      localVarFormParams.put("CreateNewIfExist", createNewIfExist);
if (keepConvertStatus != null)
      localVarFormParams.put("KeepConvertStatus", keepConvertStatus);
if (streamCanRead != null)
      localVarFormParams.put("Stream.CanRead", streamCanRead);
if (streamCanWrite != null)
      localVarFormParams.put("Stream.CanWrite", streamCanWrite);
if (streamCanSeek != null)
      localVarFormParams.put("Stream.CanSeek", streamCanSeek);
if (streamCanTimeout != null)
      localVarFormParams.put("Stream.CanTimeout", streamCanTimeout);
if (streamLength != null)
      localVarFormParams.put("Stream.Length", streamLength);
if (streamPosition != null)
      localVarFormParams.put("Stream.Position", streamPosition);
if (streamReadTimeout != null)
      localVarFormParams.put("Stream.ReadTimeout", streamReadTimeout);
if (streamWriteTimeout != null)
      localVarFormParams.put("Stream.WriteTimeout", streamWriteTimeout);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * Rename a folder
   * Renames the selected folder with a new title specified in the request.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder ID for the folder creation. (required)
   * @param createFolder The parameters for creating a folder. (required)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper renameFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.renameFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Rename a folder
   * Renames the selected folder with a new title specified in the request.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder ID for the folder creation. (required)
   * @param createFolder The parameters for creating a folder. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper renameFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createFolder;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling renameFolder");
    }
    
    // verify the required parameter 'createFolder' is set
    if (createFolder == null) {
      throw new ApiException(400, "Missing the required parameter 'createFolder' when calling renameFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}"
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

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
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
   * Set folder order
   * Sets the order of a folder with ID specified in the request.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder unique identifier. (required)
   * @param orderRequestDto The folder order information. (optional)
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper setFolderOrder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto) throws ApiException {
    return this.setFolderOrder(folderId, orderRequestDto, Collections.emptyMap());
  }


  /**
   * Set folder order
   * Sets the order of a folder with ID specified in the request.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder unique identifier. (required)
   * @param orderRequestDto The folder order information. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderIntegerWrapper setFolderOrder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = orderRequestDto;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling setFolderOrder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{folderId}/order"
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

    TypeReference<FolderIntegerWrapper> localVarReturnType = new TypeReference<FolderIntegerWrapper>() {};
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
   * Set the folder external link
   * Sets the folder external link with the ID specified in the request.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder ID. (required)
   * @param folderLinkRequest The folder link parameters. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.setFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Set the folder external link
   * Sets the folder external link with the ID specified in the request.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder ID. (required)
   * @param folderLinkRequest The folder link parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = folderLinkRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setFolderPrimaryExternalLink");
    }
    
    // verify the required parameter 'folderLinkRequest' is set
    if (folderLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'folderLinkRequest' when calling setFolderPrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/folder/{id}/links"
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

    TypeReference<FileShareWrapper> localVarReturnType = new TypeReference<FileShareWrapper>() {};
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
   * Upload a file
   * Uploads a file specified in the request to the selected folder by single file uploading or standart multipart/form-data method.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder ID to upload a file. (required)
   * @param uploadRequestDto The request parameters for uploading a file. (optional)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper uploadFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UploadRequestDto uploadRequestDto) throws ApiException {
    return this.uploadFile(folderId, uploadRequestDto, Collections.emptyMap());
  }


  /**
   * Upload a file
   * Uploads a file specified in the request to the selected folder by single file uploading or standart multipart/form-data method.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder ID to upload a file. (required)
   * @param uploadRequestDto The request parameters for uploading a file. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper uploadFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UploadRequestDto uploadRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = uploadRequestDto;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/upload"
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

    TypeReference<ObjectWrapper> localVarReturnType = new TypeReference<ObjectWrapper>() {};
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
   * Upload a file to the My documents section
   * Uploads a file specified in the request to the My documents section by single file uploading or standart multipart/form-data method.
   *
   * REST API Reference for uploadFileToMy Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
   *
   * @param inDto The request parameters for uploading a file. (optional)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper uploadFileToMy(@javax.annotation.Nullable UploadRequestDto inDto) throws ApiException {
    return this.uploadFileToMy(inDto, Collections.emptyMap());
  }


  /**
   * Upload a file to the My documents section
   * Uploads a file specified in the request to the My documents section by single file uploading or standart multipart/form-data method.
   *
   * REST API Reference for uploadFileToMy Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
   *
   * @param inDto The request parameters for uploading a file. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper uploadFileToMy(@javax.annotation.Nullable UploadRequestDto inDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my/upload";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParameterBaseName = "inDto";
    localVarQueryStringJoiner.add(inDto.toUrlQueryString("inDto"));
      
    
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
