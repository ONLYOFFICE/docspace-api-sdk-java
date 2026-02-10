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

import org.openapitools.client.model.BaseBatchRequestDto;
import org.openapitools.client.model.BatchRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CheckConversionRequestDtoInteger;
import org.openapitools.client.model.CheckDestFolderWrapper;
import org.openapitools.client.model.ConversationResultArrayWrapper;
import org.openapitools.client.model.DeleteBatchRequestDto;
import org.openapitools.client.model.DeleteVersionBatchRequestDto;
import org.openapitools.client.model.DownloadRequestDto;
import org.openapitools.client.model.DuplicateRequestDto;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileOperationType;
import org.openapitools.client.model.FileOperationWrapper;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.SessionRequest;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.UpdateComment;


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
   * Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.   **Note**: Each chunk can have different length but the length should be multiple of &lt;b&gt;512&lt;/b&gt; and greater or equal to &lt;b&gt;10 mb&lt;/b&gt;. Last chunk can have any size.  After the initial response to the request with the &lt;b&gt;200 OK&lt;/b&gt; status, you must get the &lt;em&gt;location&lt;/em&gt; field value from the response. Send all your chunks to this location.  Each chunk must be sent in the exact order the chunks appear in the file.  After receiving each chunk, the server will respond with the current information about the upload session if no errors occurred.  When the number of bytes uploaded is equal to the number of bytes you sent in the initial request, the server responds with the &lt;b&gt;201 Created&lt;/b&gt; status and sends you information about the uploaded file.  Information about created session which includes:  &lt;ul&gt;  &lt;li&gt;&lt;b&gt;id:&lt;/b&gt; unique ID of this upload session,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;created:&lt;/b&gt; UTC time when the session was created,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;expired:&lt;/b&gt; UTC time when the session will expire if no chunks are sent before that time,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;location:&lt;/b&gt; URL where you should send your next chunk,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;bytes_uploaded:&lt;/b&gt; number of bytes uploaded for the specific upload ID,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;bytes_total:&lt;/b&gt; total number of bytes which will be uploaded.&lt;/li&gt;  &lt;/ul&gt;
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSession(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Chunked upload
   * Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.   **Note**: Each chunk can have different length but the length should be multiple of &lt;b&gt;512&lt;/b&gt; and greater or equal to &lt;b&gt;10 mb&lt;/b&gt;. Last chunk can have any size.  After the initial response to the request with the &lt;b&gt;200 OK&lt;/b&gt; status, you must get the &lt;em&gt;location&lt;/em&gt; field value from the response. Send all your chunks to this location.  Each chunk must be sent in the exact order the chunks appear in the file.  After receiving each chunk, the server will respond with the current information about the upload session if no errors occurred.  When the number of bytes uploaded is equal to the number of bytes you sent in the initial request, the server responds with the &lt;b&gt;201 Created&lt;/b&gt; status and sends you information about the uploaded file.  Information about created session which includes:  &lt;ul&gt;  &lt;li&gt;&lt;b&gt;id:&lt;/b&gt; unique ID of this upload session,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;created:&lt;/b&gt; UTC time when the session was created,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;expired:&lt;/b&gt; UTC time when the session will expire if no chunks are sent before that time,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;location:&lt;/b&gt; URL where you should send your next chunk,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;bytes_uploaded:&lt;/b&gt; number of bytes uploaded for the specific upload ID,&lt;/li&gt;  &lt;li&gt;&lt;b&gt;bytes_total:&lt;/b&gt; total number of bytes which will be uploaded.&lt;/li&gt;  &lt;/ul&gt;
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The session folder ID. (required)
   * @param sessionRequest The session parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
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
