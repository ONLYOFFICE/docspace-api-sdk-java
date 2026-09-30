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
import org.openapitools.client.model.CheckConversionRequestDto;
import org.openapitools.client.model.CheckDestFolderWrapper;
import org.openapitools.client.model.ChunkedUploadSessionResponseResponseWrapper;
import org.openapitools.client.model.ChunkedUploadSessionResponseWrapperWrapper;
import org.openapitools.client.model.ConversationResultArrayWrapper;
import org.openapitools.client.model.DeleteBatchRequestDto;
import org.openapitools.client.model.DeleteVersionBatchRequestDto;
import org.openapitools.client.model.DownloadRequestDto;
import org.openapitools.client.model.DuplicateRequestDto;
import org.openapitools.client.model.ErrorApiResponse;
import java.io.File;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileOperationType;
import org.openapitools.client.model.SessionRequest;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.ThirdPartyCheckConversionRequestDto;
import org.openapitools.client.model.ThirdPartyChunkedUploadSessionResponseResponseWrapper;
import org.openapitools.client.model.ThirdPartyChunkedUploadSessionResponseWrapperWrapper;
import org.openapitools.client.model.ThirdPartyUploadSessionResponseWrapper;
import org.openapitools.client.model.UpdateComment;
import org.openapitools.client.model.UploadSessionResponseWrapper;


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
   * Abort an upload session
   * Cancels a chunked upload opened with `POST api/2.0/files/{folderId}/session` and discards the parts already  received, so nothing of it reaches the folder. The session is found by the id in the path alone: the folder  segment is not matched against it, and neither is the account that opened it, which makes the id the only  secret protecting the transfer. The call is destructive and is not safe to repeat, because the record is gone  afterwards: a second attempt, a session already closed by  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize` and a session that expired after twelve hours of  silence all fail rather than answer as missing. Finalizing removes the session too, so there is nothing left  to abort once the file exists. The answer carries no body. An upload that is simply abandoned needs no call at  all, since the session and its buffered parts are dropped when it expires.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session to cancel, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @throws ApiException if fails to make API call
   */
  public void abortUploadSession(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nonnull Integer folderId) throws ApiException {
    this.abortUploadSession(sessionId, folderId, Collections.emptyMap());
  }


  /**
   * Abort an upload session
   * Cancels a chunked upload opened with `POST api/2.0/files/{folderId}/session` and discards the parts already  received, so nothing of it reaches the folder. The session is found by the id in the path alone: the folder  segment is not matched against it, and neither is the account that opened it, which makes the id the only  secret protecting the transfer. The call is destructive and is not safe to repeat, because the record is gone  afterwards: a second attempt, a session already closed by  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize` and a session that expired after twelve hours of  silence all fail rather than answer as missing. Finalizing removes the session too, so there is nothing left  to abort once the file exists. The answer carries no body. An upload that is simply abandoned needs no call at  all, since the session and its buffered parts are dropped when it expires.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session to cancel, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
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
   * Abort an upload session (third-party storage)
   * Cancels a chunked upload opened with `POST api/2.0/files/{folderId}/session` and discards the parts already  received, so nothing of it reaches the folder. The session is found by the id in the path alone: the folder  segment is not matched against it, and neither is the account that opened it, which makes the id the only  secret protecting the transfer. The call is destructive and is not safe to repeat, because the record is gone  afterwards: a second attempt, a session already closed by  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize` and a session that expired after twelve hours of  silence all fail rather than answer as missing. Finalizing removes the session too, so there is nothing left  to abort once the file exists. The answer carries no body. An upload that is simply abandoned needs no call at  all, since the session and its buffered parts are dropped when it expires.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session to cancel, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @throws ApiException if fails to make API call
   */
  public void abortUploadSession(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nonnull String folderId) throws ApiException {
    this.abortUploadSession(sessionId, folderId, Collections.emptyMap());
  }


  /**
   * Abort an upload session (third-party storage)
   * Cancels a chunked upload opened with `POST api/2.0/files/{folderId}/session` and discards the parts already  received, so nothing of it reaches the folder. The session is found by the id in the path alone: the folder  segment is not matched against it, and neither is the account that opened it, which makes the id the only  secret protecting the transfer. The call is destructive and is not safe to repeat, because the record is gone  afterwards: a second attempt, a session already closed by  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize` and a session that expired after twelve hours of  silence all fail rather than answer as missing. Finalizing removes the session too, so there is nothing left  to abort once the file exists. The answer carries no body. An upload that is simply abandoned needs no call at  all, since the session and its buffered parts are dropped when it expires.
   *
   * REST API Reference for abortUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
   *
   * @param sessionId The session to cancel, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void abortUploadSession(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
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
   * Add favorite files and folders
   * Marks the listed files and folders as favorites for the calling account. The favorite list is personal:  nothing changes for other members, and the entries stay where they are stored. Read access to each item is  enough, so a room member with view-only rights and a guest may call it. Items the caller cannot read, ids that  do not exist and encrypted files of a private room are skipped without a word, and the answer is `true` even  when nothing was marked, so read the outcome back from `GET api/2.0/files/@favorites` instead of trusting it.  Numeric ids address entries stored in the portal itself, string ids entries on a connected third-party  account, and both kinds may be sent in one request. The call is mutating but safe to repeat: an item already  marked stays listed once. An entry moved to the Trash keeps its mark and is left out of the listing until it  is restored. `returnSingleOperation` arrives with the shared body and does nothing here. Use  `DELETE api/2.0/files/favorites` to undo, or `GET api/2.0/files/favorites/{fileId}` for a single file.
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
   * Marks the listed files and folders as favorites for the calling account. The favorite list is personal:  nothing changes for other members, and the entries stay where they are stored. Read access to each item is  enough, so a room member with view-only rights and a guest may call it. Items the caller cannot read, ids that  do not exist and encrypted files of a private room are skipped without a word, and the answer is `true` even  when nothing was marked, so read the outcome back from `GET api/2.0/files/@favorites` instead of trusting it.  Numeric ids address entries stored in the portal itself, string ids entries on a connected third-party  account, and both kinds may be sent in one request. The call is mutating but safe to repeat: an item already  marked stays listed once. An entry moved to the Trash keeps its mark and is left out of the listing until it  is restored. `returnSingleOperation` arrives with the shared body and does nothing here. Use  `DELETE api/2.0/files/favorites` to undo, or `GET api/2.0/files/favorites/{fileId}` for a single file.
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
   * Queues a background job that packs the requested files and folders into a single archive, and answers with the  caller's download operations, including the one just started. The archive is not ready when the response  arrives: poll `GET api/2.0/files/fileops` until the operation reports `finished`, then take the address of the  archive from its `url`. Items listed in `fileConvertIds` are converted to the format named there before they  are packed, while the items of `fileIds` are packed as they are. Read access to every listed item is required:  an item the caller may not read fails the whole call with 403, and an id that resolves to nothing is answered  as missing, so filter the selection beforehand. Only one download at a time is allowed per caller, and a  second call made while the first is still running is refused with 403 as well. An empty selection queues  nothing and simply answers with the operations that are already there. An anonymous caller may use the call  for the items covered by the external link they hold.
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
   * Queues a background job that packs the requested files and folders into a single archive, and answers with the  caller's download operations, including the one just started. The archive is not ready when the response  arrives: poll `GET api/2.0/files/fileops` until the operation reports `finished`, then take the address of the  archive from its `url`. Items listed in `fileConvertIds` are converted to the format named there before they  are packed, while the items of `fileIds` are packed as they are. Read access to every listed item is required:  an item the caller may not read fails the whole call with 403, and an id that resolves to nothing is answered  as missing, so filter the selection beforehand. Only one download at a time is allowed per caller, and a  second call made while the first is still running is refused with 403 as well. An empty selection queues  nothing and simply answers with the operations that are already there. An anonymous caller may use the call  for the items covered by the external link they hold.
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
   * Get conversion status
   * Reports how far the conversion of a file has got, as a list that holds one entry while the portal still knows  about that conversion and nothing once it is over. Read `progress`, which counts from 0 to 100, `error` for  the reason a conversion failed, and `file`, which carries the converted file as soon as it exists. Queue the  conversion with `PUT api/2.0/files/file/{fileId}/checkconversion` and poll this operation until the entry  reaches 100 or disappears: a finished entry is handed out once and then dropped, and an entry whose conversion  stopped is discarded a few minutes later, so an empty list means either already reported or never started  rather than an error. The same empty list is the answer for an identifier no file matches. Passing  `start=true` starts the conversion as well, with the format from the portal settings and no password, which  makes that one flag mutating; without it the operation is read-only. The caller needs read access to the file,  and anyone else is refused.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file whose conversion is asked about. (required)
   * @param start Whether to start the conversion as well: `true` queues it with the default output format and no password,  `false` only reports what the portal already knows. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper checkConversionStatus(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Boolean start) throws ApiException {
    return this.checkConversionStatus(fileId, start, Collections.emptyMap());
  }


  /**
   * Get conversion status
   * Reports how far the conversion of a file has got, as a list that holds one entry while the portal still knows  about that conversion and nothing once it is over. Read `progress`, which counts from 0 to 100, `error` for  the reason a conversion failed, and `file`, which carries the converted file as soon as it exists. Queue the  conversion with `PUT api/2.0/files/file/{fileId}/checkconversion` and poll this operation until the entry  reaches 100 or disappears: a finished entry is handed out once and then dropped, and an entry whose conversion  stopped is discarded a few minutes later, so an empty list means either already reported or never started  rather than an error. The same empty list is the answer for an identifier no file matches. Passing  `start=true` starts the conversion as well, with the format from the portal settings and no password, which  makes that one flag mutating; without it the operation is read-only. The caller needs read access to the file,  and anyone else is refused.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file whose conversion is asked about. (required)
   * @param start Whether to start the conversion as well: `true` queues it with the default output format and no password,  `false` only reports what the portal already knows. (optional)
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
   * Get conversion status (third-party storage)
   * Reports how far the conversion of a file has got, as a list that holds one entry while the portal still knows  about that conversion and nothing once it is over. Read `progress`, which counts from 0 to 100, `error` for  the reason a conversion failed, and `file`, which carries the converted file as soon as it exists. Queue the  conversion with `PUT api/2.0/files/file/{fileId}/checkconversion` and poll this operation until the entry  reaches 100 or disappears: a finished entry is handed out once and then dropped, and an entry whose conversion  stopped is discarded a few minutes later, so an empty list means either already reported or never started  rather than an error. The same empty list is the answer for an identifier no file matches. Passing  `start=true` starts the conversion as well, with the format from the portal settings and no password, which  makes that one flag mutating; without it the operation is read-only. The caller needs read access to the file,  and anyone else is refused.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file whose conversion is asked about. (required)
   * @param start Whether to start the conversion as well: `true` queues it with the default output format and no password,  `false` only reports what the portal already knows. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper checkConversionStatus(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable Boolean start) throws ApiException {
    return this.checkConversionStatus(fileId, start, Collections.emptyMap());
  }


  /**
   * Get conversion status (third-party storage)
   * Reports how far the conversion of a file has got, as a list that holds one entry while the portal still knows  about that conversion and nothing once it is over. Read `progress`, which counts from 0 to 100, `error` for  the reason a conversion failed, and `file`, which carries the converted file as soon as it exists. Queue the  conversion with `PUT api/2.0/files/file/{fileId}/checkconversion` and poll this operation until the entry  reaches 100 or disappears: a finished entry is handed out once and then dropped, and an entry whose conversion  stopped is discarded a few minutes later, so an empty list means either already reported or never started  rather than an error. The same empty list is the answer for an identifier no file matches. Passing  `start=true` starts the conversion as well, with the format from the portal settings and no password, which  makes that one flag mutating; without it the operation is read-only. The caller needs read access to the file,  and anyone else is refused.
   *
   * REST API Reference for checkConversionStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
   *
   * @param fileId The file whose conversion is asked about. (required)
   * @param start Whether to start the conversion as well: `true` queues it with the default output format and no password,  `false` only reports what the portal already knows. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper checkConversionStatus(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable Boolean start, Map<String, String> additionalHeaders) throws ApiException {
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
   * Check move or copy conflicts
   * Reports which of the requested files and folders already have a same-named entry in `destFolderId`, so that  the clash can be settled before the move or the copy is started. Nothing is moved, copied or changed by the  call, although the address is shared with `PUT api/2.0/files/fileops/move`: the answer is the part of the  request that clashes, and an empty array means the batch would go through without one. The  `conflictResolveType` of the request is not taken into account — clashing items are reported whatever it says  — and encrypted files are left out of the report. A source id that resolves to nothing is not an error and is  passed over. The caller needs create access to the destination: an archived room and a room the caller cannot  write to are refused with 403, a destination that does not exist is answered as missing, and a request without  `destFolderId` is rejected as an invalid request. To learn whether the destination accepts the files at all  use `GET api/2.0/files/fileops/checkdestfolder`.
   *
   * REST API Reference for checkMoveOrCopyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
   *
   * @param inDto The files and folders to move or copy, the folder they go to, and the way name clashes are settled. (optional)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper checkMoveOrCopyBatchItems(@javax.annotation.Nullable BatchRequestDto inDto) throws ApiException {
    return this.checkMoveOrCopyBatchItems(inDto, Collections.emptyMap());
  }


  /**
   * Check move or copy conflicts
   * Reports which of the requested files and folders already have a same-named entry in `destFolderId`, so that  the clash can be settled before the move or the copy is started. Nothing is moved, copied or changed by the  call, although the address is shared with `PUT api/2.0/files/fileops/move`: the answer is the part of the  request that clashes, and an empty array means the batch would go through without one. The  `conflictResolveType` of the request is not taken into account — clashing items are reported whatever it says  — and encrypted files are left out of the report. A source id that resolves to nothing is not an error and is  passed over. The caller needs create access to the destination: an archived room and a room the caller cannot  write to are refused with 403, a destination that does not exist is answered as missing, and a request without  `destFolderId` is rejected as an invalid request. To learn whether the destination accepts the files at all  use `GET api/2.0/files/fileops/checkdestfolder`.
   *
   * REST API Reference for checkMoveOrCopyBatchItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
   *
   * @param inDto The files and folders to move or copy, the folder they go to, and the way name clashes are settled. (optional)
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
   * Check the destination folder
   * Reports whether the destination folder accepts the listed files, before a move or a copy is started. Only  `fileIds` and `destFolderId` are read from the request: `result` says whether all of the files are accepted,  only some of them or none, and `files` names the ones that are. The check is about what the destination allows  to be stored in it rather than about name clashes — everywhere except a form-filling room every file is  accepted, while a form-filling room accepts only PDF forms, so a text document offered to one comes back as  none accepted. The caller needs create access to the destination, so a room the caller cannot write to and an  archived room are refused with 403, a destination that does not exist is answered as missing, and a request  without `destFolderId` is rejected as an invalid request. Folder ids and the copying options of the request  play no part here. The call changes nothing; for same-named entries at the destination use  `GET api/2.0/files/fileops/move`.
   *
   * REST API Reference for checkMoveOrCopyDestFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
   *
   * @param inDto The files and folders to move or copy, the folder they go to, and the way name clashes are settled. (optional)
   * @return CheckDestFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public CheckDestFolderWrapper checkMoveOrCopyDestFolder(@javax.annotation.Nullable BatchRequestDto inDto) throws ApiException {
    return this.checkMoveOrCopyDestFolder(inDto, Collections.emptyMap());
  }


  /**
   * Check the destination folder
   * Reports whether the destination folder accepts the listed files, before a move or a copy is started. Only  `fileIds` and `destFolderId` are read from the request: `result` says whether all of the files are accepted,  only some of them or none, and `files` names the ones that are. The check is about what the destination allows  to be stored in it rather than about name clashes — everywhere except a form-filling room every file is  accepted, while a form-filling room accepts only PDF forms, so a text document offered to one comes back as  none accepted. The caller needs create access to the destination, so a room the caller cannot write to and an  archived room are refused with 403, a destination that does not exist is answered as missing, and a request  without `destFolderId` is rejected as an invalid request. Folder ids and the copying options of the request  play no part here. The call changes nothing; for same-named entries at the destination use  `GET api/2.0/files/fileops/move`.
   *
   * REST API Reference for checkMoveOrCopyDestFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
   *
   * @param inDto The files and folders to move or copy, the folder they go to, and the way name clashes are settled. (optional)
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
   * Copy files and folders
   * Queues a background job that copies the requested files and folders into `destFolderId`, leaving the originals  where they are, and answers with the caller's move and copy operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`; its `files` and `folders` then name what  was produced. Before starting, `GET api/2.0/files/fileops/move` reports which items already have a same-named  entry at the destination and `conflictResolveType` decides what happens to them, while  `GET api/2.0/files/fileops/checkdestfolder` reports whether the destination accepts the files at all. The  caller needs create access to the destination — room manager or content-creator rights inside a room — and  read access to every source item; anything less is refused with 403. With `content=true` each listed folder is  replaced by its own files and subfolders, so the folder itself is not recreated at the destination. An empty  selection queues nothing and answers with the operations that are already there. To remove the originals  instead use `PUT api/2.0/files/fileops/move`.
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
   * Copy files and folders
   * Queues a background job that copies the requested files and folders into `destFolderId`, leaving the originals  where they are, and answers with the caller's move and copy operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`; its `files` and `folders` then name what  was produced. Before starting, `GET api/2.0/files/fileops/move` reports which items already have a same-named  entry at the destination and `conflictResolveType` decides what happens to them, while  `GET api/2.0/files/fileops/checkdestfolder` reports whether the destination accepts the files at all. The  caller needs create access to the destination — room manager or content-creator rights inside a room — and  read access to every source item; anything less is refused with 403. With `content=true` each listed folder is  replaced by its own files and subfolders, so the folder itself is not recreated at the destination. An empty  selection queues nothing and answers with the operations that are already there. To remove the originals  instead use `PUT api/2.0/files/fileops/move`.
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
   * Deprecated in favour of `POST api/2.0/files/{folderId}/session`, which opens the same session and returns it  without the success envelope used here; new callers should go there. Reserves a chunked upload of a file in  the folder named by the path: the title comes from `fileName`, the declared payload size from `fileSize`, and  the answer carries the session id every later call quotes, the address of the standalone chunk handler, the  moment an idle session is dropped and the reserved byte count. No content is stored yet. Send the payload as  multipart parts to `POST api/2.0/files/{folderId}/session/{sessionId}/upload`, keeping each part within  `chunkUploadSize` from `GET api/2.0/files/settings`, then close the session with  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller needs the right to add content to the  target folder, which room managers and content creators have and readers, editors and guests do not: they get  403, as does a section root such as Rooms or Archive, while an unknown folder is answered as missing. A  payload above the portal limit for chunked uploads is refused before the session exists.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @return ChunkedUploadSessionResponseWrapperWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ChunkedUploadSessionResponseWrapperWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSession(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Chunked upload
   * Deprecated in favour of `POST api/2.0/files/{folderId}/session`, which opens the same session and returns it  without the success envelope used here; new callers should go there. Reserves a chunked upload of a file in  the folder named by the path: the title comes from `fileName`, the declared payload size from `fileSize`, and  the answer carries the session id every later call quotes, the address of the standalone chunk handler, the  moment an idle session is dropped and the reserved byte count. No content is stored yet. Send the payload as  multipart parts to `POST api/2.0/files/{folderId}/session/{sessionId}/upload`, keeping each part within  `chunkUploadSize` from `GET api/2.0/files/settings`, then close the session with  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller needs the right to add content to the  target folder, which room managers and content creators have and readers, editors and guests do not: they get  403, as does a section root such as Rooms or Archive, while an unknown folder is answered as missing. A  payload above the portal limit for chunked uploads is refused before the session exists.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseWrapperWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ChunkedUploadSessionResponseWrapperWrapper createUploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ChunkedUploadSessionResponseWrapperWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseWrapperWrapper>() {};
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
   * Chunked upload (third-party storage)
   * Deprecated in favour of `POST api/2.0/files/{folderId}/session`, which opens the same session and returns it  without the success envelope used here; new callers should go there. Reserves a chunked upload of a file in  the folder named by the path: the title comes from `fileName`, the declared payload size from `fileSize`, and  the answer carries the session id every later call quotes, the address of the standalone chunk handler, the  moment an idle session is dropped and the reserved byte count. No content is stored yet. Send the payload as  multipart parts to `POST api/2.0/files/{folderId}/session/{sessionId}/upload`, keeping each part within  `chunkUploadSize` from `GET api/2.0/files/settings`, then close the session with  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller needs the right to add content to the  target folder, which room managers and content creators have and readers, editors and guests do not: they get  403, as does a section root such as Rooms or Archive, while an unknown folder is answered as missing. A  payload above the portal limit for chunked uploads is refused before the session exists.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @return ThirdPartyChunkedUploadSessionResponseWrapperWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ThirdPartyChunkedUploadSessionResponseWrapperWrapper createUploadSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSession(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Chunked upload (third-party storage)
   * Deprecated in favour of `POST api/2.0/files/{folderId}/session`, which opens the same session and returns it  without the success envelope used here; new callers should go there. Reserves a chunked upload of a file in  the folder named by the path: the title comes from `fileName`, the declared payload size from `fileSize`, and  the answer carries the session id every later call quotes, the address of the standalone chunk handler, the  moment an idle session is dropped and the reserved byte count. No content is stored yet. Send the payload as  multipart parts to `POST api/2.0/files/{folderId}/session/{sessionId}/upload`, keeping each part within  `chunkUploadSize` from `GET api/2.0/files/settings`, then close the session with  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller needs the right to add content to the  target folder, which room managers and content creators have and readers, editors and guests do not: they get  403, as does a section root such as Rooms or Archive, while an unknown folder is answered as missing. A  payload above the portal limit for chunked uploads is refused before the session exists.
   *
   * REST API Reference for createUploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyChunkedUploadSessionResponseWrapperWrapper
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ThirdPartyChunkedUploadSessionResponseWrapperWrapper createUploadSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyChunkedUploadSessionResponseWrapperWrapper> localVarReturnType = new TypeReference<ThirdPartyChunkedUploadSessionResponseWrapperWrapper>() {};
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
   * Create an upload session
   * Opens a chunked upload session for a file in the folder named by the path and returns the session itself,  which is the difference from the deprecated `POST api/2.0/files/{folderId}/upload/create_session` and its  success envelope. The answer gives `id`, quoted by every later call, `location` for the standalone chunk  handler used by clients that bypass this API, `expired`, and `bytes_total` echoing the reserved size. Whether  parts are really needed follows from `fileSize`: below `chunkUploadSize` from `GET api/2.0/files/settings` the  whole payload goes in one `POST api/2.0/files/{folderId}/session/{sessionId}`, which stores the file and  answers 201, and above it the parts go one by one to  `POST api/2.0/files/{folderId}/session/{sessionId}/upload` and the file appears only after  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller must be allowed to add content to the  folder, so readers, editors and guests are refused, a section root is refused as well, and an unknown folder  is answered as missing. Nothing is written until the parts arrive, and an abandoned session disappears twelve  hours later.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @return ChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseResponseWrapper createUploadSessionInFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSessionInFolder(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Create an upload session
   * Opens a chunked upload session for a file in the folder named by the path and returns the session itself,  which is the difference from the deprecated `POST api/2.0/files/{folderId}/upload/create_session` and its  success envelope. The answer gives `id`, quoted by every later call, `location` for the standalone chunk  handler used by clients that bypass this API, `expired`, and `bytes_total` echoing the reserved size. Whether  parts are really needed follows from `fileSize`: below `chunkUploadSize` from `GET api/2.0/files/settings` the  whole payload goes in one `POST api/2.0/files/{folderId}/session/{sessionId}`, which stores the file and  answers 201, and above it the parts go one by one to  `POST api/2.0/files/{folderId}/session/{sessionId}/upload` and the file appears only after  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller must be allowed to add content to the  folder, so readers, editors and guests are refused, a section root is refused as well, and an unknown folder  is answered as missing. Nothing is written until the parts arrive, and an abandoned session disappears twelve  hours later.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseResponseWrapper createUploadSessionInFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ChunkedUploadSessionResponseResponseWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseResponseWrapper>() {};
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
   * Create an upload session (third-party storage)
   * Opens a chunked upload session for a file in the folder named by the path and returns the session itself,  which is the difference from the deprecated `POST api/2.0/files/{folderId}/upload/create_session` and its  success envelope. The answer gives `id`, quoted by every later call, `location` for the standalone chunk  handler used by clients that bypass this API, `expired`, and `bytes_total` echoing the reserved size. Whether  parts are really needed follows from `fileSize`: below `chunkUploadSize` from `GET api/2.0/files/settings` the  whole payload goes in one `POST api/2.0/files/{folderId}/session/{sessionId}`, which stores the file and  answers 201, and above it the parts go one by one to  `POST api/2.0/files/{folderId}/session/{sessionId}/upload` and the file appears only after  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller must be allowed to add content to the  folder, so readers, editors and guests are refused, a section root is refused as well, and an unknown folder  is answered as missing. Nothing is written until the parts arrive, and an abandoned session disappears twelve  hours later.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @return ThirdPartyChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyChunkedUploadSessionResponseResponseWrapper createUploadSessionInFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull SessionRequest sessionRequest) throws ApiException {
    return this.createUploadSessionInFolder(folderId, sessionRequest, Collections.emptyMap());
  }


  /**
   * Create an upload session (third-party storage)
   * Opens a chunked upload session for a file in the folder named by the path and returns the session itself,  which is the difference from the deprecated `POST api/2.0/files/{folderId}/upload/create_session` and its  success envelope. The answer gives `id`, quoted by every later call, `location` for the standalone chunk  handler used by clients that bypass this API, `expired`, and `bytes_total` echoing the reserved size. Whether  parts are really needed follows from `fileSize`: below `chunkUploadSize` from `GET api/2.0/files/settings` the  whole payload goes in one `POST api/2.0/files/{folderId}/session/{sessionId}`, which stores the file and  answers 201, and above it the parts go one by one to  `POST api/2.0/files/{folderId}/session/{sessionId}/upload` and the file appears only after  `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. The caller must be allowed to add content to the  folder, so readers, editors and guests are refused, a section root is refused as well, and an unknown folder  is answered as missing. Nothing is written until the parts arrive, and an abandoned session disappears twelve  hours later.
   *
   * REST API Reference for createUploadSessionInFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param sessionRequest The file the session is opened for, and how a clash with an existing name is settled. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyChunkedUploadSessionResponseResponseWrapper createUploadSessionInFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull SessionRequest sessionRequest, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyChunkedUploadSessionResponseResponseWrapper> localVarReturnType = new TypeReference<ThirdPartyChunkedUploadSessionResponseResponseWrapper>() {};
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
   * Queues a background job that deletes the requested files and folders, and answers with the caller's delete  operations, including the one just started. Poll `GET api/2.0/files/fileops` until the operation reports  `finished`, and read its `error`: a failure on a single item is reported there rather than as a status code.  With `immediately=false` the items are moved to the caller's Trash and can be restored from it, while  `immediately=true` removes them at once and for good; deleting a folder takes everything inside it either way.  The call is destructive and it is not a no-op on repetition — a second call with the same ids deletes whatever  has been restored in the meantime. Access is checked before the job is queued: deleting from a room requires  room manager or content-creator rights, editing or read rights are refused with 403, and an id that resolves  to nothing is answered as missing. An empty selection queues nothing and answers with the operations that are  already there. To clear the Trash itself use `PUT api/2.0/files/fileops/emptytrash`.
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
   * Queues a background job that deletes the requested files and folders, and answers with the caller's delete  operations, including the one just started. Poll `GET api/2.0/files/fileops` until the operation reports  `finished`, and read its `error`: a failure on a single item is reported there rather than as a status code.  With `immediately=false` the items are moved to the caller's Trash and can be restored from it, while  `immediately=true` removes them at once and for good; deleting a folder takes everything inside it either way.  The call is destructive and it is not a no-op on repetition — a second call with the same ids deletes whatever  has been restored in the meantime. Access is checked before the job is queued: deleting from a room requires  room manager or content-creator rights, editing or read rights are refused with 403, and an id that resolves  to nothing is answered as missing. An empty selection queues nothing and answers with the operations that are  already there. To clear the Trash itself use `PUT api/2.0/files/fileops/emptytrash`.
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
   * Delete favorite files and folders
   * Removes the favorite mark from the listed files and folders for the calling account. Nothing is deleted from  storage: the entries keep their place, their content and their sharing, and only disappear from  `GET api/2.0/files/@favorites`; to delete the entries themselves call `PUT api/2.0/files/fileops/delete`  instead. Marks of other members are untouched, and read access to each item is enough to call it. The ids go  into the JSON body documented here; the same route also accepts them as repeated `fileIds` and `folderIds`  query parameters, but only in a request that carries no JSON body at all. Numeric ids address entries stored  in the portal itself, string ids entries on a connected third-party account. The answer is `true` whenever the  request was understood, which an empty request, an id that does not exist and an item that was never marked  all achieve, so it does not report how many marks were dropped. `returnSingleOperation` arrives with the  shared body and does nothing here. Repeating the call is safe. Use `POST api/2.0/files/favorites` to mark  entries again.
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
   * Delete favorite files and folders
   * Removes the favorite mark from the listed files and folders for the calling account. Nothing is deleted from  storage: the entries keep their place, their content and their sharing, and only disappear from  `GET api/2.0/files/@favorites`; to delete the entries themselves call `PUT api/2.0/files/fileops/delete`  instead. Marks of other members are untouched, and read access to each item is enough to call it. The ids go  into the JSON body documented here; the same route also accepts them as repeated `fileIds` and `folderIds`  query parameters, but only in a request that carries no JSON body at all. Numeric ids address entries stored  in the portal itself, string ids entries on a connected third-party account. The answer is `true` whenever the  request was understood, which an empty request, an id that does not exist and an item that was never marked  all achieve, so it does not report how many marks were dropped. `returnSingleOperation` arrives with the  shared body and does nothing here. Repeating the call is safe. Use `POST api/2.0/files/favorites` to mark  entries again.
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
   * Queues a background job that removes the listed versions from the history of one file, and answers with the  caller's delete operations, including the one just started. Poll `GET api/2.0/files/fileops` until the  operation reports `finished`; a failure met while the job runs is reported in its `error` rather than as a  status code. Removal is permanent — deleted versions do not travel through Trash and cannot be restored, while  the file itself stays in place with the versions that are left. Send the numbers that  `GET api/2.0/files/file/{fileId}/history` reports, and send at least one: an empty list is not an empty  request, it deletes the whole file instead. The number of the current version is refused before anything is  queued, while numbers that no longer exist are passed over without a complaint. The caller needs the rights  that deleting the file itself would need, so a member with read-only rights is refused, as are a file in an  archived room and a file that is already in Trash, and a file that does not exist is answered as missing. To  delete the file itself use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFileVersions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
   *
   * @param deleteVersionBatchRequestDto  (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFileVersions(@javax.annotation.Nullable DeleteVersionBatchRequestDto deleteVersionBatchRequestDto) throws ApiException {
    return this.deleteFileVersions(deleteVersionBatchRequestDto, Collections.emptyMap());
  }


  /**
   * Delete file versions
   * Queues a background job that removes the listed versions from the history of one file, and answers with the  caller's delete operations, including the one just started. Poll `GET api/2.0/files/fileops` until the  operation reports `finished`; a failure met while the job runs is reported in its `error` rather than as a  status code. Removal is permanent — deleted versions do not travel through Trash and cannot be restored, while  the file itself stays in place with the versions that are left. Send the numbers that  `GET api/2.0/files/file/{fileId}/history` reports, and send at least one: an empty list is not an empty  request, it deletes the whole file instead. The number of the current version is refused before anything is  queued, while numbers that no longer exist are passed over without a complaint. The caller needs the rights  that deleting the file itself would need, so a member with read-only rights is refused, as are a file in an  archived room and a file that is already in Trash, and a file that does not exist is answered as missing. To  delete the file itself use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFileVersions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
   *
   * @param deleteVersionBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFileVersions(@javax.annotation.Nullable DeleteVersionBatchRequestDto deleteVersionBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
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
   * Duplicate files and folders
   * Queues a background job that copies each requested file and folder next to itself, into the folder where it  already is, and answers with the caller's duplicate operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. The copies keep the name of the original  with a numeric suffix, so nothing is overwritten and every repetition adds one more copy; duplicating a folder  duplicates its content as well. No destination is taken — to place a copy somewhere else use  `PUT api/2.0/files/fileops/copy`. The caller needs the rights that creating an item in that folder would need,  which inside a room means room manager or content-creator rights: read or editing rights, and an item the  caller has no access to at all, are refused with 403. An empty selection queues nothing and answers with the  operations that are already there.
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
   * Queues a background job that copies each requested file and folder next to itself, into the folder where it  already is, and answers with the caller's duplicate operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. The copies keep the name of the original  with a numeric suffix, so nothing is overwritten and every repetition adds one more copy; duplicating a folder  duplicates its content as well. No destination is taken — to place a copy somewhere else use  `PUT api/2.0/files/fileops/copy`. The caller needs the rights that creating an item in that folder would need,  which inside a room means room manager or content-creator rights: read or editing rights, and an item the  caller has no access to at all, are refused with 403. An empty selection queues nothing and answers with the  operations that are already there.
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
   * Queues a background job that permanently removes the content of the caller's own Trash, and answers with the  caller's delete operations, including the one just started. Poll `GET api/2.0/files/fileops` until the  operation reports `finished`. Every authenticated account may empty its own Trash and only its own: no  per-item access check takes place because nothing outside the caller's Trash is touched. With `folderType` the  sweep is narrowed to the items that were originally stored in sections and rooms of the named types, so  clearing what came from personal documents leaves what came from rooms untouched; without the parameter the  whole Trash is emptied. What is removed here cannot be restored afterwards, which is the difference from  `PUT api/2.0/files/fileops/delete`, where `immediately=false` puts items into Trash in the first place.  Calling it on an already empty Trash queues nothing and answers with the operations that are already there.
   *
   * REST API Reference for emptyTrash Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
   *
   * @param single Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every delete operation that the caller has running or unread. (optional)
   * @param folderType Limits the sweep to the items whose original location was inside a section or a room of one of the named  types, leaving the rest of the Trash untouched; without the parameter the whole Trash is emptied. `5` covers  what was deleted from personal documents, `14` what was deleted from rooms. (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper emptyTrash(@javax.annotation.Nullable Boolean single, @javax.annotation.Nullable List<Integer> folderType) throws ApiException {
    return this.emptyTrash(single, folderType, Collections.emptyMap());
  }


  /**
   * Empty the Trash folder
   * Queues a background job that permanently removes the content of the caller's own Trash, and answers with the  caller's delete operations, including the one just started. Poll `GET api/2.0/files/fileops` until the  operation reports `finished`. Every authenticated account may empty its own Trash and only its own: no  per-item access check takes place because nothing outside the caller's Trash is touched. With `folderType` the  sweep is narrowed to the items that were originally stored in sections and rooms of the named types, so  clearing what came from personal documents leaves what came from rooms untouched; without the parameter the  whole Trash is emptied. What is removed here cannot be restored afterwards, which is the difference from  `PUT api/2.0/files/fileops/delete`, where `immediately=false` puts items into Trash in the first place.  Calling it on an already empty Trash queues nothing and answers with the operations that are already there.
   *
   * REST API Reference for emptyTrash Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
   *
   * @param single Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every delete operation that the caller has running or unread. (optional)
   * @param folderType Limits the sweep to the items whose original location was inside a section or a room of one of the named  types, leaving the rest of the Trash untouched; without the parameter the whole Trash is emptied. `5` covers  what was deleted from personal documents, `14` what was deleted from rooms. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper emptyTrash(@javax.annotation.Nullable Boolean single, @javax.annotation.Nullable List<Integer> folderType, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "folderType", folderType));
      
    
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
   * Assembles the parts received so far into the file the session was opened for and closes the session. What  comes out depends on how the session started: one opened against an existing file through  `POST api/2.0/files/file/{fileId}/edit_session` replaces that content in place and keeps the version number,  while one opened against a folder either creates the file or, when a file of the same name was taken over,  stores the content as its next version. A form loses its filling state on the way in. The answer arrives with  201 and carries the identifiers of the file together with the file itself. The call ends the session: the  record and the buffered parts are removed, so it cannot be repeated and there is nothing left to abort  afterwards. Running it before all the declared bytes have arrived assembles whatever is there, so read the  progress from the chunk calls first. An unknown, already closed or expired session id fails instead of  answering as missing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session to assemble, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @return UploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseWrapper finalizeSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId) throws ApiException {
    return this.finalizeSession(folderId, sessionId, Collections.emptyMap());
  }


  /**
   * Finalize an upload session
   * Assembles the parts received so far into the file the session was opened for and closes the session. What  comes out depends on how the session started: one opened against an existing file through  `POST api/2.0/files/file/{fileId}/edit_session` replaces that content in place and keeps the version number,  while one opened against a folder either creates the file or, when a file of the same name was taken over,  stores the content as its next version. A form loses its filling state on the way in. The answer arrives with  201 and carries the identifiers of the file together with the file itself. The call ends the session: the  record and the buffered parts are removed, so it cannot be repeated and there is nothing left to abort  afterwards. Running it before all the declared bytes have arrived assembles whatever is there, so read the  progress from the chunk calls first. An unknown, already closed or expired session id fails instead of  answering as missing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session to assemble, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseWrapper finalizeSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<UploadSessionResponseWrapper> localVarReturnType = new TypeReference<UploadSessionResponseWrapper>() {};
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
   * Finalize an upload session (third-party storage)
   * Assembles the parts received so far into the file the session was opened for and closes the session. What  comes out depends on how the session started: one opened against an existing file through  `POST api/2.0/files/file/{fileId}/edit_session` replaces that content in place and keeps the version number,  while one opened against a folder either creates the file or, when a file of the same name was taken over,  stores the content as its next version. A form loses its filling state on the way in. The answer arrives with  201 and carries the identifiers of the file together with the file itself. The call ends the session: the  record and the buffered parts are removed, so it cannot be repeated and there is nothing left to abort  afterwards. Running it before all the declared bytes have arrived assembles whatever is there, so read the  progress from the chunk calls first. An unknown, already closed or expired session id fails instead of  answering as missing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session to assemble, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @return ThirdPartyUploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyUploadSessionResponseWrapper finalizeSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId) throws ApiException {
    return this.finalizeSession(folderId, sessionId, Collections.emptyMap());
  }


  /**
   * Finalize an upload session (third-party storage)
   * Assembles the parts received so far into the file the session was opened for and closes the session. What  comes out depends on how the session started: one opened against an existing file through  `POST api/2.0/files/file/{fileId}/edit_session` replaces that content in place and keeps the version number,  while one opened against a folder either creates the file or, when a file of the same name was taken over,  stores the content as its next version. A form loses its filling state on the way in. The answer arrives with  201 and carries the identifiers of the file together with the file itself. The call ends the session: the  record and the buffered parts are removed, so it cannot be repeated and there is nothing left to abort  afterwards. Running it before all the declared bytes have arrived assembles whatever is there, so read the  progress from the chunk calls first. An unknown, already closed or expired session id fails instead of  answering as missing.
   *
   * REST API Reference for finalizeSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session to assemble, as returned in `id` when it was created: a 32-character hexadecimal string that  identifies the session on its own. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyUploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyUploadSessionResponseWrapper finalizeSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyUploadSessionResponseWrapper> localVarReturnType = new TypeReference<ThirdPartyUploadSessionResponseWrapper>() {};
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
   * Returns the background file operations of the caller that are still running or whose finished result has not  been read yet, grouped by kind: duplications first, then moves and copies, deletions, downloads and  mark-as-read. This is the polling target for every operation in this section — an operation appears here as  soon as it is queued and carries `progress` from 0 to 100, `finished`, the `error` of a failed item and, for a  download, the address of the archive in `url`. A record is dropped once its finished state has been handed  out, so a completed operation is reported once and an empty array means there is nothing left to report rather  than that the work failed. Pass `id` to follow a single operation; an id that is not among the caller's  operations gives an empty array. Operations are private to the account that started them, an anonymous caller  being scoped to the session of the external link. The call changes nothing. To follow one kind only use  `GET api/2.0/files/fileops/{operationType}`.
   *
   * REST API Reference for getOperationStatuses Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
   *
   * @param id The operation to report on, as returned in `id` when it was started; without it every operation of the caller  is reported. An id that is not among the caller's operations gives an empty answer rather than an error. (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatuses(@javax.annotation.Nullable String id) throws ApiException {
    return this.getOperationStatuses(id, Collections.emptyMap());
  }


  /**
   * Get active file operations
   * Returns the background file operations of the caller that are still running or whose finished result has not  been read yet, grouped by kind: duplications first, then moves and copies, deletions, downloads and  mark-as-read. This is the polling target for every operation in this section — an operation appears here as  soon as it is queued and carries `progress` from 0 to 100, `finished`, the `error` of a failed item and, for a  download, the address of the archive in `url`. A record is dropped once its finished state has been handed  out, so a completed operation is reported once and an empty array means there is nothing left to report rather  than that the work failed. Pass `id` to follow a single operation; an id that is not among the caller's  operations gives an empty array. Operations are private to the account that started them, an anonymous caller  being scoped to the session of the external link. The call changes nothing. To follow one kind only use  `GET api/2.0/files/fileops/{operationType}`.
   *
   * REST API Reference for getOperationStatuses Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
   *
   * @param id The operation to report on, as returned in `id` when it was started; without it every operation of the caller  is reported. An id that is not among the caller's operations gives an empty answer rather than an error. (optional)
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get file operations by type
   * Returns the background file operations of the caller that are of one kind, named by the number in the route:  `1` for a copy, `2` for a deletion, `3` for a download, `4` for a mark-as-read and `7` for a duplication. The  answer carries the same records as `GET api/2.0/files/fileops`, with the same rule that a finished operation  is reported once and then dropped, and `id` narrows it further to a single operation. Moves, kind `0`, cannot  be read through this route: the address `api/2.0/files/fileops/move` belongs to another operation, so read  moves from `GET api/2.0/files/fileops` and pick the records whose `operation` is `0`. A kind that has no queue  of its own — `5` for an import, `6` for a conversion — is accepted and answers with an empty array, while a  number outside the operation type is rejected as an invalid request. The call changes nothing and never shows  another account's operations.
   *
   * REST API Reference for getOperationStatusesByType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
   *
   * @param operationType The kind of operation the answer is limited to. Only the kinds that have a queue of their own ever carry  records — a copy, a deletion, a download, a mark-as-read and a duplication — and moves cannot be read through  this route at all, because its address belongs to another operation. (required)
   * @param id The operation to report on, as returned in `id` when it was started; without it every operation of the caller  is reported. An id that is not among the caller's operations gives an empty answer rather than an error. (optional)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper getOperationStatusesByType(@javax.annotation.Nonnull FileOperationType operationType, @javax.annotation.Nullable String id) throws ApiException {
    return this.getOperationStatusesByType(operationType, id, Collections.emptyMap());
  }


  /**
   * Get file operations by type
   * Returns the background file operations of the caller that are of one kind, named by the number in the route:  `1` for a copy, `2` for a deletion, `3` for a download, `4` for a mark-as-read and `7` for a duplication. The  answer carries the same records as `GET api/2.0/files/fileops`, with the same rule that a finished operation  is reported once and then dropped, and `id` narrows it further to a single operation. Moves, kind `0`, cannot  be read through this route: the address `api/2.0/files/fileops/move` belongs to another operation, so read  moves from `GET api/2.0/files/fileops` and pick the records whose `operation` is `0`. A kind that has no queue  of its own — `5` for an import, `6` for a conversion — is accepted and answers with an empty array, while a  number outside the operation type is rejected as an invalid request. The call changes nothing and never shows  another account's operations.
   *
   * REST API Reference for getOperationStatusesByType Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
   *
   * @param operationType The kind of operation the answer is limited to. Only the kinds that have a queue of their own ever carry  records — a copy, a deletion, a download, a mark-as-read and a duplication — and moves cannot be read through  this route at all, because its address belongs to another operation. (required)
   * @param id The operation to report on, as returned in `id` when it was started; without it every operation of the caller  is reported. An id that is not among the caller's operations gives an empty answer rather than an error. (optional)
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Mark files and folders as read
   * Queues a background job that clears the new-item badge from the requested files and folders for the calling  account, and answers with the caller's mark-as-read operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. Marking a folder clears the badges of  everything inside it as well. Items the caller cannot read are passed over in silence rather than refused, so  the call succeeds even when the whole selection is inaccessible, and an empty selection queues nothing and  answers with the operations that are already there. Repeating the call on items that are already read changes  nothing, and nothing is opened, moved or modified by it — only the caller's own badges are affected, while  other members keep theirs. To see what is currently marked as new use `GET api/2.0/files/{folderId}/news` for  one folder and `GET api/2.0/files/rooms/news` for the rooms of the caller.
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
   * Mark files and folders as read
   * Queues a background job that clears the new-item badge from the requested files and folders for the calling  account, and answers with the caller's mark-as-read operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. Marking a folder clears the badges of  everything inside it as well. Items the caller cannot read are passed over in silence rather than refused, so  the call succeeds even when the whole selection is inaccessible, and an empty selection queues nothing and  answers with the operations that are already there. Repeating the call on items that are already read changes  nothing, and nothing is opened, moved or modified by it — only the caller's own badges are affected, while  other members keep theirs. To see what is currently marked as new use `GET api/2.0/files/{folderId}/news` for  one folder and `GET api/2.0/files/rooms/news` for the rooms of the caller.
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
   * Move files and folders
   * Queues a background job that moves the requested files and folders into `destFolderId`, removing them from  where they were, and answers with the caller's move and copy operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. Before starting,  `GET api/2.0/files/fileops/move` reports which items already have a same-named entry at the destination and  `conflictResolveType` decides what happens to them, while `GET api/2.0/files/fileops/checkdestfolder` reports  whether the destination accepts the files at all. The caller needs create access to the destination and the  right to take the items out of their source, which is why room members with editing or review rights are  refused with 403, and why content-creator rights inside a room allow copying an item out of it but not moving  it. A room cannot be moved this way — use `PUT api/2.0/files/rooms/{id}/archive` instead. To keep the  originals use `PUT api/2.0/files/fileops/copy`. An empty selection queues nothing.
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
   * Move files and folders
   * Queues a background job that moves the requested files and folders into `destFolderId`, removing them from  where they were, and answers with the caller's move and copy operations, including the one just started. Poll  `GET api/2.0/files/fileops` until the operation reports `finished`. Before starting,  `GET api/2.0/files/fileops/move` reports which items already have a same-named entry at the destination and  `conflictResolveType` decides what happens to them, while `GET api/2.0/files/fileops/checkdestfolder` reports  whether the destination accepts the files at all. The caller needs create access to the destination and the  right to take the items out of their source, which is why room members with editing or review rights are  refused with 403, and why content-creator rights inside a room allow copying an item out of it but not moving  it. A room cannot be moved this way — use `PUT api/2.0/files/rooms/{id}/archive` instead. To keep the  originals use `PUT api/2.0/files/fileops/copy`. An empty selection queues nothing.
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
   * Queues the conversion of a file into the portal's own editable format and answers with the conversion entry  the caller is to poll. The whole body may be omitted, in which case the defaults apply. `outputType` names the  target format and, left empty, the portal's default for that kind of document is used; `password` unlocks a  protected source file; `version` converts an older version instead of the current one. `createNewIfExist`  decides where the result goes: with `true` a new file is created beside the source, while with `false`, the  default, the converted file that already exists is replaced. `sync=true` converts inside the request and  answers with the finished result instead of a queue entry, which is only sensible for small documents.  Otherwise poll `GET api/2.0/files/file/{fileId}/checkconversion` until `progress` reaches 100 and take the  converted file from `file`. Only formats the portal has to convert are accepted; anything already editable,  and anything it cannot convert, is answered without work being queued or rejected as an invalid request. The  caller needs read access to the file. The call is mutating and not idempotent.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file to convert. (required)
   * @param checkConversionRequestDto The parameters of the conversion. The whole body may be omitted, in which case the defaults of the portal  apply. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable CheckConversionRequestDto checkConversionRequestDto) throws ApiException {
    return this.startFileConversion(fileId, checkConversionRequestDto, Collections.emptyMap());
  }


  /**
   * Start file conversion
   * Queues the conversion of a file into the portal's own editable format and answers with the conversion entry  the caller is to poll. The whole body may be omitted, in which case the defaults apply. `outputType` names the  target format and, left empty, the portal's default for that kind of document is used; `password` unlocks a  protected source file; `version` converts an older version instead of the current one. `createNewIfExist`  decides where the result goes: with `true` a new file is created beside the source, while with `false`, the  default, the converted file that already exists is replaced. `sync=true` converts inside the request and  answers with the finished result instead of a queue entry, which is only sensible for small documents.  Otherwise poll `GET api/2.0/files/file/{fileId}/checkconversion` until `progress` reaches 100 and take the  converted file from `file`. Only formats the portal has to convert are accepted; anything already editable,  and anything it cannot convert, is answered without work being queued or rejected as an invalid request. The  caller needs read access to the file. The call is mutating and not idempotent.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file to convert. (required)
   * @param checkConversionRequestDto The parameters of the conversion. The whole body may be omitted, in which case the defaults of the portal  apply. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable CheckConversionRequestDto checkConversionRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = checkConversionRequestDto;
    
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
   * Start file conversion (third-party storage)
   * Queues the conversion of a file into the portal's own editable format and answers with the conversion entry  the caller is to poll. The whole body may be omitted, in which case the defaults apply. `outputType` names the  target format and, left empty, the portal's default for that kind of document is used; `password` unlocks a  protected source file; `version` converts an older version instead of the current one. `createNewIfExist`  decides where the result goes: with `true` a new file is created beside the source, while with `false`, the  default, the converted file that already exists is replaced. `sync=true` converts inside the request and  answers with the finished result instead of a queue entry, which is only sensible for small documents.  Otherwise poll `GET api/2.0/files/file/{fileId}/checkconversion` until `progress` reaches 100 and take the  converted file from `file`. Only formats the portal has to convert are accepted; anything already editable,  and anything it cannot convert, is answered without work being queued or rejected as an invalid request. The  caller needs read access to the file. The call is mutating and not idempotent.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file to convert. (required)
   * @param thirdPartyCheckConversionRequestDto The parameters of the conversion. The whole body may be omitted, in which case the defaults of the portal  apply. (optional)
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable ThirdPartyCheckConversionRequestDto thirdPartyCheckConversionRequestDto) throws ApiException {
    return this.startFileConversion(fileId, thirdPartyCheckConversionRequestDto, Collections.emptyMap());
  }


  /**
   * Start file conversion (third-party storage)
   * Queues the conversion of a file into the portal's own editable format and answers with the conversion entry  the caller is to poll. The whole body may be omitted, in which case the defaults apply. `outputType` names the  target format and, left empty, the portal's default for that kind of document is used; `password` unlocks a  protected source file; `version` converts an older version instead of the current one. `createNewIfExist`  decides where the result goes: with `true` a new file is created beside the source, while with `false`, the  default, the converted file that already exists is replaced. `sync=true` converts inside the request and  answers with the finished result instead of a queue entry, which is only sensible for small documents.  Otherwise poll `GET api/2.0/files/file/{fileId}/checkconversion` until `progress` reaches 100 and take the  converted file from `file`. Only formats the portal has to convert are accepted; anything already editable,  and anything it cannot convert, is answered without work being queued or rejected as an invalid request. The  caller needs read access to the file. The call is mutating and not idempotent.
   *
   * REST API Reference for startFileConversion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
   *
   * @param fileId The file to convert. (required)
   * @param thirdPartyCheckConversionRequestDto The parameters of the conversion. The whole body may be omitted, in which case the defaults of the portal  apply. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConversationResultArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ConversationResultArrayWrapper startFileConversion(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable ThirdPartyCheckConversionRequestDto thirdPartyCheckConversionRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = thirdPartyCheckConversionRequestDto;
    
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
   * Cancel file operations
   * Cancels a background file operation of the caller and answers with the operations that are left. Pass the `id`  that was reported when the operation started to stop that one; a call that leaves the trailing route segment  out stops every operation the caller has running, of every kind. Cancelling stops the job where it stands and  does not undo it: what has already been copied, moved or deleted stays that way, so a cancelled batch can  leave part of itself at the destination and part of it at the source, and the result has to be read back  rather than assumed. The cancelled record is dropped from `GET api/2.0/files/fileops` at once, which is why  the answer here is usually empty. An id that is not among the caller's operations cancels nothing and is not  an error. Operations are private to the account that started them, an anonymous caller being scoped to the  session of the external link, so the call can never reach an operation of anyone else.
   *
   * REST API Reference for terminateTasks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
   *
   * @param id The operation to cancel, as returned in `id` when it was started. A call that leaves the route segment out  cancels every operation of the caller, and an id that is not among their operations cancels nothing without  being an error. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper terminateTasks(@javax.annotation.Nonnull String id) throws ApiException {
    return this.terminateTasks(id, Collections.emptyMap());
  }


  /**
   * Cancel file operations
   * Cancels a background file operation of the caller and answers with the operations that are left. Pass the `id`  that was reported when the operation started to stop that one; a call that leaves the trailing route segment  out stops every operation the caller has running, of every kind. Cancelling stops the job where it stands and  does not undo it: what has already been copied, moved or deleted stays that way, so a cancelled batch can  leave part of itself at the destination and part of it at the source, and the result has to be read back  rather than assumed. The cancelled record is dropped from `GET api/2.0/files/fileops` at once, which is why  the answer here is usually empty. An id that is not among the caller's operations cancels nothing and is not  an error. Operations are private to the account that started them, an anonymous caller being scoped to the  session of the external link, so the call can never reach an operation of anyone else.
   *
   * REST API Reference for terminateTasks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
   *
   * @param id The operation to cancel, as returned in `id` when it was started. A call that leaves the route segment out  cancels every operation of the caller, and an id that is not among their operations cancels nothing without  being an error. (required)
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
   * Update a comment
   * Replaces the comment stored on one version of a file - the note that explains what changed in it - and answers  with the comment as it was stored, which is the text cut to the length the portal keeps. `version` names the  version and has to be an existing one: a version that does not exist is rejected as an invalid request, while  a file that does not exist at all is answered as not found. Sending an empty comment clears the note. The  caller needs the right to edit the history of the file, which the room admin, a DocSpace admin acting as room  manager and a member with content-creator rights have; a member with editing access to somebody else's file,  read-only access, a guest and an anonymous caller are all refused. A file that is locked by somebody else or  lies in Trash is refused as well. The call is mutating and idempotent - repeating it with the same text leaves  the same comment. The comments of all versions come back with `GET api/2.0/files/file/{fileId}/edit/history`.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file whose version comment is replaced. (required)
   * @param updateComment The version and the comment to store on it. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateFileComment(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UpdateComment updateComment) throws ApiException {
    return this.updateFileComment(fileId, updateComment, Collections.emptyMap());
  }


  /**
   * Update a comment
   * Replaces the comment stored on one version of a file - the note that explains what changed in it - and answers  with the comment as it was stored, which is the text cut to the length the portal keeps. `version` names the  version and has to be an existing one: a version that does not exist is rejected as an invalid request, while  a file that does not exist at all is answered as not found. Sending an empty comment clears the note. The  caller needs the right to edit the history of the file, which the room admin, a DocSpace admin acting as room  manager and a member with content-creator rights have; a member with editing access to somebody else's file,  read-only access, a guest and an anonymous caller are all refused. A file that is locked by somebody else or  lies in Trash is refused as well. The call is mutating and idempotent - repeating it with the same text leaves  the same comment. The comments of all versions come back with `GET api/2.0/files/file/{fileId}/edit/history`.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file whose version comment is replaced. (required)
   * @param updateComment The version and the comment to store on it. (required)
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
   * Update a comment (third-party storage)
   * Replaces the comment stored on one version of a file - the note that explains what changed in it - and answers  with the comment as it was stored, which is the text cut to the length the portal keeps. `version` names the  version and has to be an existing one: a version that does not exist is rejected as an invalid request, while  a file that does not exist at all is answered as not found. Sending an empty comment clears the note. The  caller needs the right to edit the history of the file, which the room admin, a DocSpace admin acting as room  manager and a member with content-creator rights have; a member with editing access to somebody else's file,  read-only access, a guest and an anonymous caller are all refused. A file that is locked by somebody else or  lies in Trash is refused as well. The call is mutating and idempotent - repeating it with the same text leaves  the same comment. The comments of all versions come back with `GET api/2.0/files/file/{fileId}/edit/history`.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file whose version comment is replaced. (required)
   * @param updateComment The version and the comment to store on it. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateFileComment(@javax.annotation.Nonnull String fileId, @javax.annotation.Nonnull UpdateComment updateComment) throws ApiException {
    return this.updateFileComment(fileId, updateComment, Collections.emptyMap());
  }


  /**
   * Update a comment (third-party storage)
   * Replaces the comment stored on one version of a file - the note that explains what changed in it - and answers  with the comment as it was stored, which is the text cut to the length the portal keeps. `version` names the  version and has to be an existing one: a version that does not exist is rejected as an invalid request, while  a file that does not exist at all is answered as not found. Sending an empty comment clears the note. The  caller needs the right to edit the history of the file, which the room admin, a DocSpace admin acting as room  manager and a member with content-creator rights have; a member with editing access to somebody else's file,  read-only access, a guest and an anonymous caller are all refused. A file that is locked by somebody else or  lies in Trash is refused as well. The call is mutating and idempotent - repeating it with the same text leaves  the same comment. The comments of all versions come back with `GET api/2.0/files/file/{fileId}/edit/history`.
   *
   * REST API Reference for updateFileComment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
   *
   * @param fileId The file whose version comment is replaced. (required)
   * @param updateComment The version and the comment to store on it. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper updateFileComment(@javax.annotation.Nonnull String fileId, @javax.annotation.Nonnull UpdateComment updateComment, Map<String, String> additionalHeaders) throws ApiException {
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
   * Upload a numbered chunk
   * Stores one part of a file under the number given in `chunkNumber`, which is what the ordinary chunked flow  uses: parts are kept by their number rather than by arrival, so a part that failed can be resent under the  same number without restarting the session. Numbering starts at 1, and leaving the number out makes the server  count the parts itself. The answer is always the session, never the file, and this call never completes the  upload: the file appears only after `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. Use  `POST api/2.0/files/{folderId}/session/{sessionId}` instead when the parts go strictly in order and the upload  should complete by itself. A part bigger than `chunkUploadSize` from `GET api/2.0/files/settings` is refused,  so that value is also the size to split the payload by. The first part of a PDF is inspected, and a PDF that  is not a fillable form is refused when the session targets a form-filling room. The session is found by its id  alone.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; a 32-character hexadecimal string. (required)
   * @param chunkNumber The position of this part in the file, counted from 1. Sending the same number again replaces that part  instead of adding one, which is how a failed part is retried; leaving the number out makes the server count  the parts itself. (optional)
   * @param _file The part of the file to store, sent as the multipart field of the same name. It is kept under the number given  beside it, and a part larger than the portal chunk size is refused. (optional)
   * @return ChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseResponseWrapper uploadAsyncSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadAsyncSession(folderId, sessionId, chunkNumber, _file, Collections.emptyMap());
  }


  /**
   * Upload a numbered chunk
   * Stores one part of a file under the number given in `chunkNumber`, which is what the ordinary chunked flow  uses: parts are kept by their number rather than by arrival, so a part that failed can be resent under the  same number without restarting the session. Numbering starts at 1, and leaving the number out makes the server  count the parts itself. The answer is always the session, never the file, and this call never completes the  upload: the file appears only after `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. Use  `POST api/2.0/files/{folderId}/session/{sessionId}` instead when the parts go strictly in order and the upload  should complete by itself. A part bigger than `chunkUploadSize` from `GET api/2.0/files/settings` is refused,  so that value is also the size to split the payload by. The first part of a PDF is inspected, and a PDF that  is not a fillable form is refused when the session targets a form-filling room. The session is found by its id  alone.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; a 32-character hexadecimal string. (required)
   * @param chunkNumber The position of this part in the file, counted from 1. Sending the same number again replaces that part  instead of adding one, which is how a failed part is retried; leaving the number out makes the server count  the parts itself. (optional)
   * @param _file The part of the file to store, sent as the multipart field of the same name. It is kept under the number given  beside it, and a part larger than the portal chunk size is refused. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadSessionResponseResponseWrapper uploadAsyncSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ChunkedUploadSessionResponseResponseWrapper> localVarReturnType = new TypeReference<ChunkedUploadSessionResponseResponseWrapper>() {};
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
   * Upload a numbered chunk (third-party storage)
   * Stores one part of a file under the number given in `chunkNumber`, which is what the ordinary chunked flow  uses: parts are kept by their number rather than by arrival, so a part that failed can be resent under the  same number without restarting the session. Numbering starts at 1, and leaving the number out makes the server  count the parts itself. The answer is always the session, never the file, and this call never completes the  upload: the file appears only after `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. Use  `POST api/2.0/files/{folderId}/session/{sessionId}` instead when the parts go strictly in order and the upload  should complete by itself. A part bigger than `chunkUploadSize` from `GET api/2.0/files/settings` is refused,  so that value is also the size to split the payload by. The first part of a PDF is inspected, and a PDF that  is not a fillable form is refused when the session targets a form-filling room. The session is found by its id  alone.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; a 32-character hexadecimal string. (required)
   * @param chunkNumber The position of this part in the file, counted from 1. Sending the same number again replaces that part  instead of adding one, which is how a failed part is retried; leaving the number out makes the server count  the parts itself. (optional)
   * @param _file The part of the file to store, sent as the multipart field of the same name. It is kept under the number given  beside it, and a part larger than the portal chunk size is refused. (optional)
   * @return ThirdPartyChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyChunkedUploadSessionResponseResponseWrapper uploadAsyncSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadAsyncSession(folderId, sessionId, chunkNumber, _file, Collections.emptyMap());
  }


  /**
   * Upload a numbered chunk (third-party storage)
   * Stores one part of a file under the number given in `chunkNumber`, which is what the ordinary chunked flow  uses: parts are kept by their number rather than by arrival, so a part that failed can be resent under the  same number without restarting the session. Numbering starts at 1, and leaving the number out makes the server  count the parts itself. The answer is always the session, never the file, and this call never completes the  upload: the file appears only after `PUT api/2.0/files/{folderId}/session/{sessionId}/finalize`. Use  `POST api/2.0/files/{folderId}/session/{sessionId}` instead when the parts go strictly in order and the upload  should complete by itself. A part bigger than `chunkUploadSize` from `GET api/2.0/files/settings` is refused,  so that value is also the size to split the payload by. The first part of a PDF is inspected, and a PDF that  is not a fillable form is refused when the session targets a form-filling room. The session is found by its id  alone.
   *
   * REST API Reference for uploadAsyncSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; a 32-character hexadecimal string. (required)
   * @param chunkNumber The position of this part in the file, counted from 1. Sending the same number again replaces that part  instead of adding one, which is how a failed part is retried; leaving the number out makes the server count  the parts itself. (optional)
   * @param _file The part of the file to store, sent as the multipart field of the same name. It is kept under the number given  beside it, and a part larger than the portal chunk size is refused. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyChunkedUploadSessionResponseResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyChunkedUploadSessionResponseResponseWrapper uploadAsyncSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable Integer chunkNumber, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyChunkedUploadSessionResponseResponseWrapper> localVarReturnType = new TypeReference<ThirdPartyChunkedUploadSessionResponseResponseWrapper>() {};
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
   * Upload the next chunk
   * Sends the next part of a file into the session opened for it, as the multipart `File` field, and lets the  server keep count: parts are appended in the order they arrive, so two of these calls must never run in  parallel on one session. While bytes are still missing the answer describes the session and `uploaded` is  false; when the last part completes the declared size the file is written, its upload links are cleared, it is  marked as new for the room, and the answer comes back with 201, `uploaded` true and the whole file in `file`.  A session created for a payload smaller than `chunkUploadSize` from `GET api/2.0/files/settings` finishes on  the first such call and needs no separate finalize step. A part larger than that limit is refused. The first  part of a PDF is inspected, and a PDF that is not a fillable form is refused when the session targets a  form-filling room. The session is addressed by its id, and the folder in the path is not matched against it.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; the parts of one session must be  sent one after another, not in parallel. (required)
   * @param _file The next part of the file, sent as the multipart field of the same name. Parts are appended in the order they  arrive, and a part larger than the portal chunk size is refused. (optional)
   * @return UploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseWrapper uploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadSession(folderId, sessionId, _file, Collections.emptyMap());
  }


  /**
   * Upload the next chunk
   * Sends the next part of a file into the session opened for it, as the multipart `File` field, and lets the  server keep count: parts are appended in the order they arrive, so two of these calls must never run in  parallel on one session. While bytes are still missing the answer describes the session and `uploaded` is  false; when the last part completes the declared size the file is written, its upload links are cleared, it is  marked as new for the room, and the answer comes back with 201, `uploaded` true and the whole file in `file`.  A session created for a payload smaller than `chunkUploadSize` from `GET api/2.0/files/settings` finishes on  the first such call and needs no separate finalize step. A part larger than that limit is refused. The first  part of a PDF is inspected, and a PDF that is not a fillable form is refused when the session targets a  form-filling room. The session is addressed by its id, and the folder in the path is not matched against it.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; the parts of one session must be  sent one after another, not in parallel. (required)
   * @param _file The next part of the file, sent as the multipart field of the same name. Parts are appended in the order they  arrive, and a part larger than the portal chunk size is refused. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UploadSessionResponseWrapper uploadSession(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<UploadSessionResponseWrapper> localVarReturnType = new TypeReference<UploadSessionResponseWrapper>() {};
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
   * Upload the next chunk (third-party storage)
   * Sends the next part of a file into the session opened for it, as the multipart `File` field, and lets the  server keep count: parts are appended in the order they arrive, so two of these calls must never run in  parallel on one session. While bytes are still missing the answer describes the session and `uploaded` is  false; when the last part completes the declared size the file is written, its upload links are cleared, it is  marked as new for the room, and the answer comes back with 201, `uploaded` true and the whole file in `file`.  A session created for a payload smaller than `chunkUploadSize` from `GET api/2.0/files/settings` finishes on  the first such call and needs no separate finalize step. A part larger than that limit is refused. The first  part of a PDF is inspected, and a PDF that is not a fillable form is refused when the session targets a  form-filling room. The session is addressed by its id, and the folder in the path is not matched against it.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; the parts of one session must be  sent one after another, not in parallel. (required)
   * @param _file The next part of the file, sent as the multipart field of the same name. Parts are appended in the order they  arrive, and a part larger than the portal chunk size is refused. (optional)
   * @return ThirdPartyUploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyUploadSessionResponseWrapper uploadSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadSession(folderId, sessionId, _file, Collections.emptyMap());
  }


  /**
   * Upload the next chunk (third-party storage)
   * Sends the next part of a file into the session opened for it, as the multipart `File` field, and lets the  server keep count: parts are appended in the order they arrive, so two of these calls must never run in  parallel on one session. While bytes are still missing the answer describes the session and `uploaded` is  false; when the last part completes the declared size the file is written, its upload links are cleared, it is  marked as new for the room, and the answer comes back with 201, `uploaded` true and the whole file in `file`.  A session created for a payload smaller than `chunkUploadSize` from `GET api/2.0/files/settings` finishes on  the first such call and needs no separate finalize step. A part larger than that limit is refused. The first  part of a PDF is inspected, and a PDF that is not a fillable form is refused when the session targets a  form-filling room. The session is addressed by its id, and the folder in the path is not matched against it.
   *
   * REST API Reference for uploadSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
   *
   * @param folderId The folder the session was opened against. It is part of the route only and is not matched against the  session, which is found by its own id. (required)
   * @param sessionId The session this part belongs to, as returned in `id` when it was created; the parts of one session must be  sent one after another, not in parallel. (required)
   * @param _file The next part of the file, sent as the multipart field of the same name. Parts are appended in the order they  arrive, and a part larger than the portal chunk size is refused. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyUploadSessionResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyUploadSessionResponseWrapper uploadSession(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyUploadSessionResponseWrapper> localVarReturnType = new TypeReference<ThirdPartyUploadSessionResponseWrapper>() {};
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
