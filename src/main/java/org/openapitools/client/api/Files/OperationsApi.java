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

import org.openapitools.client.model.BaseBatchRequestDto;
import org.openapitools.client.model.BatchRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CheckConversionRequestDtoInteger;
import org.openapitools.client.model.CheckDestFolderWrapper;
import org.openapitools.client.model.ChunkedUploadSessionResponseIntegerWrapper;
import org.openapitools.client.model.ChunkedUploadSessionResponseWrapperIntegerWrapper;
import org.openapitools.client.model.ConversationResultArrayWrapper;
import org.openapitools.client.model.DeleteBatchRequestDto;
import org.openapitools.client.model.DeleteVersionBatchRequestDto;
import org.openapitools.client.model.DownloadRequestDto;
import org.openapitools.client.model.DuplicateRequestDto;
import java.io.File;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileOperationType;
import org.openapitools.client.model.FileOperationWrapper;
import org.openapitools.client.model.SessionRequest;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.UpdateComment;
import org.openapitools.client.model.UploadSessionResponseIntegerWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class OperationsApi extends BaseApi {

  public OperationsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OperationsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Aborts an in-progress file upload session.
   * This method allows users to cancel an ongoing upload session identified by the session ID.  Once the session is aborted, the associated resources will be cleaned up, and the session will no longer accept further uploads.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session ID. (required)
   * @param folderId The folder ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void abortUploadSession(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nonnull Integer folderId) throws ApiException {
    this.abortUploadSession(sessionId, folderId, Collections.emptyMap());
  }


  /**
   * Aborts an in-progress file upload session.
   * This method allows users to cancel an ongoing upload session identified by the session ID.  Once the session is aborted, the associated resources will be cleaned up, and the session will no longer accept further uploads.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session ID. (required)
   * @param folderId The folder ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void abortUploadSession(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling abortUploadSession");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling abortUploadSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/session/{sessionId}"
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)))
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
   * Add favorite files and folders
   * Adds files and folders with the IDs specified in the request to the favorite list.
   *
   * REST API Reference for addFavorites Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/
   *
   * @param baseBatchRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper addFavorites(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.addFavorites(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Add favorite files and folders
   * Adds files and folders with the IDs specified in the request to the favorite list.
   *
   * REST API Reference for addFavorites Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper addFavorites(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/favorites";

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
   * Bulk download
   * Starts the download process of files and folders with the IDs specified in the request.
   *
   * REST API Reference for bulkDownload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/
   *
   * @param downloadRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper bulkDownload(@javax.annotation.Nullable DownloadRequestDto downloadRequestDto) throws ApiException {
    return this.bulkDownload(downloadRequestDto, Collections.emptyMap());
  }


  /**
   * Bulk download
   * Starts the download process of files and folders with the IDs specified in the request.
   *
   * REST API Reference for bulkDownload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/
   *
   * @param downloadRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper bulkDownload(@javax.annotation.Nullable DownloadRequestDto downloadRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = downloadRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/bulkdownload";

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

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Get conversion status
   * Checks the conversion status of a file with the ID specified in the request.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file ID to check conversion status. (required)
   * @param start Specifies whether a conversion operation is started or not. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper checkConversionStatus(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Boolean start) throws ApiException {
    return this.checkConversionStatus(fileId, start, Collections.emptyMap());
  }


  /**
   * Get conversion status
   * Checks the conversion status of a file with the ID specified in the request.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file ID to check conversion status. (required)
   * @param start Specifies whether a conversion operation is started or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper checkConversionStatus(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Boolean start, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling checkConversionStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/checkconversion"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ConversationResultArrayWrapper> localVarReturnType = new TypeReference<ConversationResultArrayWrapper>() {};
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
   * Move or copy files to a folder
   * Checks if files or folders can be moved or copied to the specified folder, moves or copies them, and returns their information.
   *
   * REST API Reference for checkMoveOrCopyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
   *
   * @param inDto The request parameters for copying/moving files. (optional)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper checkMoveOrCopyBatchItems(@javax.annotation.Nullable BatchRequestDto inDto) throws ApiException {
    return this.checkMoveOrCopyBatchItems(inDto, Collections.emptyMap());
  }


  /**
   * Move or copy files to a folder
   * Checks if files or folders can be moved or copied to the specified folder, moves or copies them, and returns their information.
   *
   * REST API Reference for checkMoveOrCopyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
   *
   * @param inDto The request parameters for copying/moving files. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper checkMoveOrCopyBatchItems(@javax.annotation.Nullable BatchRequestDto inDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/move";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryStringJoiner.add(inDto.toUrlQueryString());
      
    
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
   * Check for moving or copying files to a folder
   * Checks if files can be moved or copied to the specified folder.
   *
   * REST API Reference for checkMoveOrCopyDestFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
   *
   * @param inDto The request parameters for copying/moving files. (optional)
   * @return CheckDestFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public CheckDestFolderWrapper checkMoveOrCopyDestFolder(@javax.annotation.Nullable BatchRequestDto inDto) throws ApiException {
    return this.checkMoveOrCopyDestFolder(inDto, Collections.emptyMap());
  }


  /**
   * Check for moving or copying files to a folder
   * Checks if files can be moved or copied to the specified folder.
   *
   * REST API Reference for checkMoveOrCopyDestFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
   *
   * @param inDto The request parameters for copying/moving files. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return CheckDestFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public CheckDestFolderWrapper checkMoveOrCopyDestFolder(@javax.annotation.Nullable BatchRequestDto inDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/checkdestfolder";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryStringJoiner.add(inDto.toUrlQueryString());
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<CheckDestFolderWrapper> localVarReturnType = new TypeReference<CheckDestFolderWrapper>() {};
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
   * Copy to the folder
   * Copies all the selected files and folders to the folder with the ID specified in the request.
   *
   * REST API Reference for copyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/
   *
   * @param batchRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper copyBatchItems(@javax.annotation.Nullable BatchRequestDto batchRequestDto) throws ApiException {
    return this.copyBatchItems(batchRequestDto, Collections.emptyMap());
  }


  /**
   * Copy to the folder
   * Copies all the selected files and folders to the folder with the ID specified in the request.
   *
   * REST API Reference for copyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/
   *
   * @param batchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper copyBatchItems(@javax.annotation.Nullable BatchRequestDto batchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = batchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/copy";

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
   * Chunked upload
   * Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @return ChunkedUploadSessionResponseWrapperIntegerWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ChunkedUploadSessionResponseWrapperIntegerWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSession(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Chunked upload
   * Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseWrapperIntegerWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ChunkedUploadSessionResponseWrapperIntegerWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionRequest;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createUploadSession");
    }
    
    // verify the required parameter 'sessionRequest' is set
    if (sessionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionRequest' when calling createUploadSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/upload/create_session"
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

    TypeReference<ChunkedUploadSessionResponseWrapperIntegerWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseWrapperIntegerWrapper>() {};
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
   * Creates a session for uploading a file to a specific folder in chunks.
   * The session allows the user to upload a file in smaller chunks to the folder identified by its ID.  The file information, such as name, size, and additional metadata, must be provided in the request.  This method facilitates large file upload scenarios by enabling chunked file uploads.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @return ChunkedUploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseIntegerWrapper createUploadSessionInFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSessionInFolder(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Creates a session for uploading a file to a specific folder in chunks.
   * The session allows the user to upload a file in smaller chunks to the folder identified by its ID.  The file information, such as name, size, and additional metadata, must be provided in the request.  This method facilitates large file upload scenarios by enabling chunked file uploads.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseIntegerWrapper createUploadSessionInFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionRequest;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createUploadSessionInFolder");
    }
    
    // verify the required parameter 'sessionRequest' is set
    if (sessionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionRequest' when calling createUploadSessionInFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/session"
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

    TypeReference<ChunkedUploadSessionResponseIntegerWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseIntegerWrapper>() {};
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
   * Delete files and folders
   * Deletes the files and folders with the IDs specified in the request.
   *
   * REST API Reference for deleteBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/
   *
   * @param deleteBatchRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteBatchItems(@javax.annotation.Nullable DeleteBatchRequestDto deleteBatchRequestDto) throws ApiException {
    return this.deleteBatchItems(deleteBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Delete files and folders
   * Deletes the files and folders with the IDs specified in the request.
   *
   * REST API Reference for deleteBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/
   *
   * @param deleteBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteBatchItems(@javax.annotation.Nullable DeleteBatchRequestDto deleteBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/delete";

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
   * Delete favorite files and folders (using body parameters)
   * Removes files and folders with the IDs specified in the request from the favorite list. This method uses the body parameters.
   *
   * REST API Reference for deleteFavoritesFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/
   *
   * @param baseBatchRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteFavoritesFromBody(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.deleteFavoritesFromBody(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Delete favorite files and folders (using body parameters)
   * Removes files and folders with the IDs specified in the request from the favorite list. This method uses the body parameters.
   *
   * REST API Reference for deleteFavoritesFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteFavoritesFromBody(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/favorites";

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
   * Delete file versions
   * Deletes the file versions with the IDs specified in the request.
   *
   * REST API Reference for deleteFileVersions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
   *
   * @param deleteVersionBatchRequestDto  (optional)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteFileVersions(@javax.annotation.Nullable DeleteVersionBatchRequestDto deleteVersionBatchRequestDto) throws ApiException {
    return this.deleteFileVersions(deleteVersionBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Delete file versions
   * Deletes the file versions with the IDs specified in the request.
   *
   * REST API Reference for deleteFileVersions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
   *
   * @param deleteVersionBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper deleteFileVersions(@javax.annotation.Nullable DeleteVersionBatchRequestDto deleteVersionBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteVersionBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/deleteversion";

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

    TypeReference<FileOperationWrapper> localVarReturnType = new TypeReference<FileOperationWrapper>() {};
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
   * Duplicate files and folders
   * Duplicates all the selected files and folders.
   *
   * REST API Reference for duplicateBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/
   *
   * @param duplicateRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper duplicateBatchItems(@javax.annotation.Nullable DuplicateRequestDto duplicateRequestDto) throws ApiException {
    return this.duplicateBatchItems(duplicateRequestDto, Collections.emptyMap());
  }


  /**
   * Duplicate files and folders
   * Duplicates all the selected files and folders.
   *
   * REST API Reference for duplicateBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/
   *
   * @param duplicateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper duplicateBatchItems(@javax.annotation.Nullable DuplicateRequestDto duplicateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = duplicateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/duplicate";

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
   * Empty the Trash folder
   * Deletes all the files and folders from the Trash folder.
   *
   * REST API Reference for emptyTrash Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
   *
   * @param single Specifies whether to return only the current operation (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper emptyTrash(@javax.annotation.Nullable Boolean single) throws ApiException {
    return this.emptyTrash(single, Collections.emptyMap());
  }


  /**
   * Empty the Trash folder
   * Deletes all the files and folders from the Trash folder.
   *
   * REST API Reference for emptyTrash Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
   *
   * @param single Specifies whether to return only the current operation (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper emptyTrash(@javax.annotation.Nullable Boolean single, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/emptytrash";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Single", single));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Finalize an upload session
   * Finalizes the upload session by processing the uploaded file chunks and marking the upload as complete.  This method consolidates chunked uploads into a complete file if required, sends notifications about the upload event,  and performs any additional cleanup or related actions, such as socket updates and webhook publishing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The session ID. (required)
   * @return UploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseIntegerWrapper finalizeSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId) throws ApiException {
    return this.finalizeSession(folderId, sessionId, Collections.emptyMap());
  }


  /**
   * Finalize an upload session
   * Finalizes the upload session by processing the uploaded file chunks and marking the upload as complete.  This method consolidates chunked uploads into a complete file if required, sends notifications about the upload event,  and performs any additional cleanup or related actions, such as socket updates and webhook publishing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The session ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseIntegerWrapper finalizeSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling finalizeSession");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling finalizeSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/session/{sessionId}/finalize"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

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

    TypeReference<UploadSessionResponseIntegerWrapper> localVarReturnType = new TypeReference<UploadSessionResponseIntegerWrapper>() {};
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
   * Get active file operations
   * Returns a list of all the active file operations.
   *
   * REST API Reference for getOperationStatuses Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
   *
   * @param id The ID of the file operation. (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatuses(@javax.annotation.Nullable String id) throws ApiException {
    return this.getOperationStatuses(id, Collections.emptyMap());
  }


  /**
   * Get active file operations
   * Returns a list of all the active file operations.
   *
   * REST API Reference for getOperationStatuses Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
   *
   * @param id The ID of the file operation. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatuses(@javax.annotation.Nullable String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("id", id));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Get file operation statuses
   * Retrieves the statuses of operations filtered by the specified operation type.
   *
   * REST API Reference for getOperationStatusesByType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
   *
   * @param operationType Specifies the type of file operation to be retrieved. (required)
   * @param id The ID of the file operation. (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatusesByType(@javax.annotation.Nonnull FileOperationType operationType, @javax.annotation.Nullable String id) throws ApiException {
    return this.getOperationStatusesByType(operationType, id, Collections.emptyMap());
  }


  /**
   * Get file operation statuses
   * Retrieves the statuses of operations filtered by the specified operation type.
   *
   * REST API Reference for getOperationStatusesByType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
   *
   * @param operationType Specifies the type of file operation to be retrieved. (required)
   * @param id The ID of the file operation. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatusesByType(@javax.annotation.Nonnull FileOperationType operationType, @javax.annotation.Nullable String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'operationType' is set
    if (operationType == null) {
      throw new ApiException(400, "Missing the required parameter 'operationType' when calling getOperationStatusesByType");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/{operationType}"
      .replaceAll("\\{" + "operationType" + "\\}", apiClient.escapeString(apiClient.parameterToString(operationType)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("id", id));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Mark as read
   * Marks the files and folders with the IDs specified in the request as read.
   *
   * REST API Reference for markAsRead Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/
   *
   * @param baseBatchRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper markAsRead(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.markAsRead(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Mark as read
   * Marks the files and folders with the IDs specified in the request as read.
   *
   * REST API Reference for markAsRead Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper markAsRead(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/markasread";

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
   * Move or copy to a folder
   * Moves or copies all the selected files and folders to the folder with the ID specified in the request.
   *
   * REST API Reference for moveBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/
   *
   * @param batchRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper moveBatchItems(@javax.annotation.Nullable BatchRequestDto batchRequestDto) throws ApiException {
    return this.moveBatchItems(batchRequestDto, Collections.emptyMap());
  }


  /**
   * Move or copy to a folder
   * Moves or copies all the selected files and folders to the folder with the ID specified in the request.
   *
   * REST API Reference for moveBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/
   *
   * @param batchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper moveBatchItems(@javax.annotation.Nullable BatchRequestDto batchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = batchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/move";

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
   * Start file conversion
   * Starts a conversion operation of a file with the ID specified in the request.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file ID to start conversion proccess. (required)
   * @param checkConversionRequestDtoInteger The parameters for checking file conversion. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable CheckConversionRequestDtoInteger checkConversionRequestDtoInteger) throws ApiException {
    return this.startFileConversion(fileId, checkConversionRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * Start file conversion
   * Starts a conversion operation of a file with the ID specified in the request.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file ID to start conversion proccess. (required)
   * @param checkConversionRequestDtoInteger The parameters for checking file conversion. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable CheckConversionRequestDtoInteger checkConversionRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = checkConversionRequestDtoInteger;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling startFileConversion");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/checkconversion"
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

    TypeReference<ConversationResultArrayWrapper> localVarReturnType = new TypeReference<ConversationResultArrayWrapper>() {};
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
   * Finish active operations
   * Finishes an operation with the ID specified in the request or all the active operations.
   *
   * REST API Reference for terminateTasks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
   *
   * @param id The operation unique identifier. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper terminateTasks(@javax.annotation.Nonnull String id) throws ApiException {
    return this.terminateTasks(id, Collections.emptyMap());
  }


  /**
   * Finish active operations
   * Finishes an operation with the ID specified in the request or all the active operations.
   *
   * REST API Reference for terminateTasks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
   *
   * @param id The operation unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper terminateTasks(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling terminateTasks");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/fileops/terminate/{id}"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileOperationArrayWrapper> localVarReturnType = new TypeReference<FileOperationArrayWrapper>() {};
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
   * Update a comment
   * Updates a comment in a file with the ID specified in the request.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file ID where the comment is located. (required)
   * @param updateComment The parameters for updating a comment. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateFileComment(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UpdateComment updateComment) throws ApiException {
    return this.updateFileComment(fileId, updateComment, Collections.emptyMap());
  }


  /**
   * Update a comment
   * Updates a comment in a file with the ID specified in the request.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file ID where the comment is located. (required)
   * @param updateComment The parameters for updating a comment. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateFileComment(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UpdateComment updateComment, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateComment;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateFileComment");
    }
    
    // verify the required parameter 'updateComment' is set
    if (updateComment == null) {
      throw new ApiException(400, "Missing the required parameter 'updateComment' when calling updateFileComment");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/comment"
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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Handles the upload of a chunk for an existing upload session.
   * This method allows the caller to upload a specific chunk of a file to an ongoing upload session.  The session is identified by the session ID provided in the request. The chunk can be of any size  within the limits allowed during the session initialization. Each chunk must be uploaded in the  correct order for the server to process it appropriately.  The server updates the upload session status and stores the progress information after processing  each chunk. The updated session details are returned in the response.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The upload session ID. (required)
   * @param chunkNumber The chunk number. (optional)
   * @param _file The file chunk to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file chunk content from the HTTP request form for chunked upload operations.  The file chunk is accessed via the IFormFile interface which provides access to the chunk content and length. (optional)
   * @return ChunkedUploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseIntegerWrapper uploadAsyncSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadAsyncSession(folderId, sessionId, chunkNumber, _file, Collections.emptyMap());
  }


  /**
   * Handles the upload of a chunk for an existing upload session.
   * This method allows the caller to upload a specific chunk of a file to an ongoing upload session.  The session is identified by the session ID provided in the request. The chunk can be of any size  within the limits allowed during the session initialization. Each chunk must be uploaded in the  correct order for the server to process it appropriately.  The server updates the upload session status and stores the progress information after processing  each chunk. The updated session details are returned in the response.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The upload session ID. (required)
   * @param chunkNumber The chunk number. (optional)
   * @param _file The file chunk to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file chunk content from the HTTP request form for chunked upload operations.  The file chunk is accessed via the IFormFile interface which provides access to the chunk content and length. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseIntegerWrapper uploadAsyncSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling uploadAsyncSession");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling uploadAsyncSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/session/{sessionId}/upload"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ChunkNumber", chunkNumber));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (_file != null)
      localVarFormParams.put("File", _file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ChunkedUploadSessionResponseIntegerWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseIntegerWrapper>() {};
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
   * Resumes an ongoing file upload session for uploading additional chunks of data.
   * This method allows continuing an interrupted or partially completed file upload session by uploading subsequent data chunks.  The server will validate each uploaded chunk, update the session state, and respond with the status of the current upload. Once  the total bytes uploaded match the total file size, the file upload process is finalized and related events are triggered.  If the file is newly uploaded, the server responds with a 201 Created status upon completion. If it overwrites an existing file,  versioning information is updated accordingly. The method also triggers associated webhooks and socket notifications to reflect  the updated file state.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The upload session ID. (required)
   * @param _file The file to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file content from the HTTP request form.  The file is accessed via the IFormFile interface which provides access to the file name, content type, length, and stream. (optional)
   * @return UploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseIntegerWrapper uploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadSession(folderId, sessionId, _file, Collections.emptyMap());
  }


  /**
   * Resumes an ongoing file upload session for uploading additional chunks of data.
   * This method allows continuing an interrupted or partially completed file upload session by uploading subsequent data chunks.  The server will validate each uploaded chunk, update the session state, and respond with the status of the current upload. Once  the total bytes uploaded match the total file size, the file upload process is finalized and related events are triggered.  If the file is newly uploaded, the server responds with a 201 Created status upon completion. If it overwrites an existing file,  versioning information is updated accordingly. The method also triggers associated webhooks and socket notifications to reflect  the updated file state.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder ID. (required)
   * @param sessionId The upload session ID. (required)
   * @param _file The file to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file content from the HTTP request form.  The file is accessed via the IFormFile interface which provides access to the file name, content type, length, and stream. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UploadSessionResponseIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseIntegerWrapper uploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling uploadSession");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling uploadSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/session/{sessionId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

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

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<UploadSessionResponseIntegerWrapper> localVarReturnType = new TypeReference<UploadSessionResponseIntegerWrapper>() {};
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
      "multipart/form-data"
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
