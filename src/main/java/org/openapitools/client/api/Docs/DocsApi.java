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

package org.openapitools.client.api.Docs;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ConvertFileRequestDto;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.FileOperationWrapper;
import org.openapitools.client.model.FileWrapper;
import org.openapitools.client.model.RunBuilderScriptRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class DocsApi extends BaseApi {

  public DocsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public DocsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Convert a file
   * Converts a portal file into another format and saves the result as a new file, answering with that file. The  caller needs read access to a source that may be copied and the right to create files in `folderId`; without  `folderId` the result goes to the My documents section of the caller, so a guest, who has none, has to pass  it. A file in a private room or in a room with a watermark is not converted, as it would leave the room without  its protection, and no result is saved into such a room. `outputtype` is the only parameter a plain  conversion needs; the other fields are passed to the document service under its own names, while the source  format, name and cache key are taken from the file. The call is mutating and not idempotent: the source is kept,  and each call adds another file under a free name. It answers once the conversion is done, so a large file keeps  the request open. Only files stored in the portal itself are accepted. To convert while copying into another  folder, a third-party one included, use `POST api/2.0/files/file/{fileId}/copyas`; to convert into the portal's  own editable format beside the source, use `PUT api/2.0/files/file/{fileId}/checkconversion`. A missing or  unsupported `outputtype` is refused with 400, and so is a source the document service rejects: a wrong or  missing `password`, or a file too large to convert; retrying the same request will not help. Missing access or a  protected room is refused with 403 and an unknown file or folder with 404, both before any conversion starts. A  result that does not fit the storage quota of the portal, the room or the caller is refused with 402. A  conversion the document service fails is answered with 502: the service may be down or the file damaged; a retry  helps only in the first case.  Raises the `file.created` webhook.
   *
   * REST API Reference for convertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/convert-file/
   *
   * @param convertFileRequestDto  (optional)
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper convertFile(@javax.annotation.Nullable ConvertFileRequestDto convertFileRequestDto) throws ApiException {
    return this.convertFile(convertFileRequestDto, Collections.emptyMap());
  }


  /**
   * Convert a file
   * Converts a portal file into another format and saves the result as a new file, answering with that file. The  caller needs read access to a source that may be copied and the right to create files in `folderId`; without  `folderId` the result goes to the My documents section of the caller, so a guest, who has none, has to pass  it. A file in a private room or in a room with a watermark is not converted, as it would leave the room without  its protection, and no result is saved into such a room. `outputtype` is the only parameter a plain  conversion needs; the other fields are passed to the document service under its own names, while the source  format, name and cache key are taken from the file. The call is mutating and not idempotent: the source is kept,  and each call adds another file under a free name. It answers once the conversion is done, so a large file keeps  the request open. Only files stored in the portal itself are accepted. To convert while copying into another  folder, a third-party one included, use `POST api/2.0/files/file/{fileId}/copyas`; to convert into the portal's  own editable format beside the source, use `PUT api/2.0/files/file/{fileId}/checkconversion`. A missing or  unsupported `outputtype` is refused with 400, and so is a source the document service rejects: a wrong or  missing `password`, or a file too large to convert; retrying the same request will not help. Missing access or a  protected room is refused with 403 and an unknown file or folder with 404, both before any conversion starts. A  result that does not fit the storage quota of the portal, the room or the caller is refused with 402. A  conversion the document service fails is answered with 502: the service may be down or the file damaged; a retry  helps only in the first case.  Raises the `file.created` webhook.
   *
   * REST API Reference for convertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/convert-file/
   *
   * @param convertFileRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper convertFile(@javax.annotation.Nullable ConvertFileRequestDto convertFileRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = convertFileRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/docs/converter";

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

    TypeReference<FileWrapper> localVarReturnType = new TypeReference<FileWrapper>() {};
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
   * Run a document builder script
   * Queues a background run of a document builder script and answers with the operation just started. The script  names portal files by identifier - `builder.OpenFile(1234)` - where the document builder documentation writes  an address; only portal files can be opened, and none from a private room or a room with a watermark, nor is a  result saved into such a room. A script may call OpenFile and SaveFile at most 20 times each, counting every  call written in it. The caller needs edit access to every file the script opens, which may also be copied, and  to each file `outputs` replaces, which must not be locked or open in an editor, and the right to create files in  each folder a result is saved into. Each file the script saves goes where `outputs` says, keyed by the name  given to SaveFile: `fileId` stores it as a new version of that file, `folderId` as a new file there; an unlisted  file goes to `folderId` or to the folder of the opened file. Each entry of `outputs` names exactly one of  `fileId` and `folderId`; `title` goes only with `folderId`, since a replaced file keeps its title, and a result  stored over `fileId` has to be in that file's format. The call is not idempotent: each call is a new run. Poll  `GET api/2.0/files/fileops` with the returned `id` until the operation reports `finished`: `files` then lists  the saved files, a replaced one with its new version, including those saved before a failure, and `error` the  reason a failed build gave. A build that has not finished after 10 minutes is given up and reported as failed. A  caller runs one script at a time: a new request while an earlier one is queued or running is refused with 403,  so wait for `finished` before starting the next. For a plain format change use `POST api/2.0/docs/converter`.  What can be refused in advance fails at once with 400, 403 or 404.  Raises the `file.created` and `file.updated` webhooks for each file the queued script saves: `file.created` for a new file, `file.updated` for an existing one.
   *
   * REST API Reference for runBuilderScript Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/run-builder-script/
   *
   * @param runBuilderScriptRequestDto  (optional)
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper runBuilderScript(@javax.annotation.Nullable RunBuilderScriptRequestDto runBuilderScriptRequestDto) throws ApiException {
    return this.runBuilderScript(runBuilderScriptRequestDto, Collections.emptyMap());
  }


  /**
   * Run a document builder script
   * Queues a background run of a document builder script and answers with the operation just started. The script  names portal files by identifier - `builder.OpenFile(1234)` - where the document builder documentation writes  an address; only portal files can be opened, and none from a private room or a room with a watermark, nor is a  result saved into such a room. A script may call OpenFile and SaveFile at most 20 times each, counting every  call written in it. The caller needs edit access to every file the script opens, which may also be copied, and  to each file `outputs` replaces, which must not be locked or open in an editor, and the right to create files in  each folder a result is saved into. Each file the script saves goes where `outputs` says, keyed by the name  given to SaveFile: `fileId` stores it as a new version of that file, `folderId` as a new file there; an unlisted  file goes to `folderId` or to the folder of the opened file. Each entry of `outputs` names exactly one of  `fileId` and `folderId`; `title` goes only with `folderId`, since a replaced file keeps its title, and a result  stored over `fileId` has to be in that file's format. The call is not idempotent: each call is a new run. Poll  `GET api/2.0/files/fileops` with the returned `id` until the operation reports `finished`: `files` then lists  the saved files, a replaced one with its new version, including those saved before a failure, and `error` the  reason a failed build gave. A build that has not finished after 10 minutes is given up and reported as failed. A  caller runs one script at a time: a new request while an earlier one is queued or running is refused with 403,  so wait for `finished` before starting the next. For a plain format change use `POST api/2.0/docs/converter`.  What can be refused in advance fails at once with 400, 403 or 404.  Raises the `file.created` and `file.updated` webhooks for each file the queued script saves: `file.created` for a new file, `file.updated` for an existing one.
   *
   * REST API Reference for runBuilderScript Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/run-builder-script/
   *
   * @param runBuilderScriptRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationWrapper runBuilderScript(@javax.annotation.Nullable RunBuilderScriptRequestDto runBuilderScriptRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = runBuilderScriptRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/docs/builder";

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
