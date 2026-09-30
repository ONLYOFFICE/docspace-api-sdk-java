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

import org.openapitools.client.model.ApplyFilterOption;
import org.openapitools.client.model.AuditReportFormat;
import org.openapitools.client.model.CheckUploadRequest;
import org.openapitools.client.model.CreateFolder;
import org.openapitools.client.model.DeleteFolder;
import org.openapitools.client.model.DocumentBuilderTaskWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import java.io.File;
import org.openapitools.client.model.FileArrayWrapper;
import org.openapitools.client.model.FileEntryBaseArrayWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.FileShareWrapper;
import org.openapitools.client.model.FileWrapper;
import org.openapitools.client.model.FilesStatisticsResultWrapper;
import org.openapitools.client.model.FilterType;
import org.openapitools.client.model.FolderContentArrayWrapper;
import org.openapitools.client.model.FolderContentWrapper;
import org.openapitools.client.model.FolderLinkRequest;
import org.openapitools.client.model.FolderWrapper;
import org.openapitools.client.model.FormsItemArrayWrapper;
import org.openapitools.client.model.HistoryArrayWrapper;
import org.openapitools.client.model.Location;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OrderRequestDto;
import org.openapitools.client.model.STRINGArrayWrapper;
import org.openapitools.client.model.SearchArea;
import org.openapitools.client.model.SortOrder;
import org.openapitools.client.model.ThirdPartyFileArrayWrapper;
import org.openapitools.client.model.ThirdPartyFileWrapper;
import org.openapitools.client.model.ThirdPartyFolderContentWrapper;
import org.openapitools.client.model.ThirdPartyFolderWrapper;
import java.util.UUID;
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
   * Check for upload conflicts
   * Reports which of the submitted titles already belong to a file in the folder, so an upload can decide in  advance whether to overwrite or to ask for another name. Only the clashing titles come back, unordered and  without repetitions, and an empty array means every name is free. Matching is by title and ignores case, so a  name that differs only in capitalisation is still reported; an existing file that is encrypted is left out,  because an upload cannot take it over. The call changes nothing. It needs the same right as the upload itself,  the right to add content to the folder, which room managers and content creators have and readers, editors and  guests do not; an archived room, a section root and a folder the caller cannot write to are all refused, while  an unknown folder is answered as missing. A request without `filesTitle` is rejected as an invalid request, an  empty list is accepted and answers with an empty array.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder whose contents the names are tested against; take the id from a listing such as  `GET api/2.0/files/@root`. (required)
   * @param checkUploadRequest The names to test against the files the folder already holds. (required)
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper checkUpload(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CheckUploadRequest checkUploadRequest) throws ApiException {
    return this.checkUpload(folderId, checkUploadRequest, Collections.emptyMap());
  }


  /**
   * Check for upload conflicts
   * Reports which of the submitted titles already belong to a file in the folder, so an upload can decide in  advance whether to overwrite or to ask for another name. Only the clashing titles come back, unordered and  without repetitions, and an empty array means every name is free. Matching is by title and ignores case, so a  name that differs only in capitalisation is still reported; an existing file that is encrypted is left out,  because an upload cannot take it over. The call changes nothing. It needs the same right as the upload itself,  the right to add content to the folder, which room managers and content creators have and readers, editors and  guests do not; an archived room, a section root and a folder the caller cannot write to are all refused, while  an unknown folder is answered as missing. A request without `filesTitle` is rejected as an invalid request, an  empty list is accepted and answers with an empty array.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder whose contents the names are tested against; take the id from a listing such as  `GET api/2.0/files/@root`. (required)
   * @param checkUploadRequest The names to test against the files the folder already holds. (required)
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
   * Check for upload conflicts (third-party storage)
   * Reports which of the submitted titles already belong to a file in the folder, so an upload can decide in  advance whether to overwrite or to ask for another name. Only the clashing titles come back, unordered and  without repetitions, and an empty array means every name is free. Matching is by title and ignores case, so a  name that differs only in capitalisation is still reported; an existing file that is encrypted is left out,  because an upload cannot take it over. The call changes nothing. It needs the same right as the upload itself,  the right to add content to the folder, which room managers and content creators have and readers, editors and  guests do not; an archived room, a section root and a folder the caller cannot write to are all refused, while  an unknown folder is answered as missing. A request without `filesTitle` is rejected as an invalid request, an  empty list is accepted and answers with an empty array.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder whose contents the names are tested against; take the id from a listing such as  `GET api/2.0/files/@root`. (required)
   * @param checkUploadRequest The names to test against the files the folder already holds. (required)
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper checkUpload(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CheckUploadRequest checkUploadRequest) throws ApiException {
    return this.checkUpload(folderId, checkUploadRequest, Collections.emptyMap());
  }


  /**
   * Check for upload conflicts (third-party storage)
   * Reports which of the submitted titles already belong to a file in the folder, so an upload can decide in  advance whether to overwrite or to ask for another name. Only the clashing titles come back, unordered and  without repetitions, and an empty array means every name is free. Matching is by title and ignores case, so a  name that differs only in capitalisation is still reported; an existing file that is encrypted is left out,  because an upload cannot take it over. The call changes nothing. It needs the same right as the upload itself,  the right to add content to the folder, which room managers and content creators have and readers, editors and  guests do not; an archived room, a section root and a folder the caller cannot write to are all refused, while  an unknown folder is answered as missing. A request without `filesTitle` is rejected as an invalid request, an  empty list is accepted and answers with an empty array.
   *
   * REST API Reference for checkUpload Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
   *
   * @param folderId The folder whose contents the names are tested against; take the id from a listing such as  `GET api/2.0/files/@root`. (required)
   * @param checkUploadRequest The names to test against the files the folder already holds. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper checkUpload(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CheckUploadRequest checkUploadRequest, Map<String, String> additionalHeaders) throws ApiException {
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
   * Creates a folder inside the folder named in the path and answers with the folder as it was stored. The title  is trimmed, may not be blank and is refused when it is longer than the limit the schema prints; titles are not  required to be unique, so creating the same title twice leaves two folders side by side, which makes the call  mutating and not idempotent. The caller needs the right to create content in the parent, which the room  manager, a content creator and the owner of a personal section have; a member without that right, an archived  parent, and a section root that only holds rooms - Rooms, Forms and AI agents - are all refused, as is a  parent that does not exist. Rooms are not created here: use `POST api/2.0/files/rooms` for those, and this  operation for ordinary folders within them. Members of the room are notified of the new folder. Read the  identifier of the new folder from `id` and fill it with `POST api/2.0/files/{folderId}/upload`.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper createFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.createFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Create a folder
   * Creates a folder inside the folder named in the path and answers with the folder as it was stored. The title  is trimmed, may not be blank and is refused when it is longer than the limit the schema prints; titles are not  required to be unique, so creating the same title twice leaves two folders side by side, which makes the call  mutating and not idempotent. The caller needs the right to create content in the parent, which the room  manager, a content creator and the owner of a personal section have; a member without that right, an archived  parent, and a section root that only holds rooms - Rooms, Forms and AI agents - are all refused, as is a  parent that does not exist. Rooms are not created here: use `POST api/2.0/files/rooms` for those, and this  operation for ordinary folders within them. Members of the room are notified of the new folder. Read the  identifier of the new folder from `id` and fill it with `POST api/2.0/files/{folderId}/upload`.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper createFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderWrapper> localVarReturnType = new TypeReference<FolderWrapper>() {};
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
   * Create a folder (third-party storage)
   * Creates a folder inside the folder named in the path and answers with the folder as it was stored. The title  is trimmed, may not be blank and is refused when it is longer than the limit the schema prints; titles are not  required to be unique, so creating the same title twice leaves two folders side by side, which makes the call  mutating and not idempotent. The caller needs the right to create content in the parent, which the room  manager, a content creator and the owner of a personal section have; a member without that right, an archived  parent, and a section root that only holds rooms - Rooms, Forms and AI agents - are all refused, as is a  parent that does not exist. Rooms are not created here: use `POST api/2.0/files/rooms` for those, and this  operation for ordinary folders within them. Members of the room are notified of the new folder. Read the  identifier of the new folder from `id` and fill it with `POST api/2.0/files/{folderId}/upload`.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper createFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.createFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Create a folder (third-party storage)
   * Creates a folder inside the folder named in the path and answers with the folder as it was stored. The title  is trimmed, may not be blank and is refused when it is longer than the limit the schema prints; titles are not  required to be unique, so creating the same title twice leaves two folders side by side, which makes the call  mutating and not idempotent. The caller needs the right to create content in the parent, which the room  manager, a content creator and the owner of a personal section have; a member without that right, an archived  parent, and a section root that only holds rooms - Rooms, Forms and AI agents - are all refused, as is a  parent that does not exist. Rooms are not created here: use `POST api/2.0/files/rooms` for those, and this  operation for ordinary folders within them. Members of the room are notified of the new folder. Read the  identifier of the new folder from `id` and fill it with `POST api/2.0/files/{folderId}/upload`.
   *
   * REST API Reference for createFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper createFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyFolderWrapper> localVarReturnType = new TypeReference<ThirdPartyFolderWrapper>() {};
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
   * Create the folder primary external link
   * Answers with the primary external link of a folder or a room, creating it on the first call and returning the  one that already exists afterwards, so the operation is idempotent in effect: a second call with other  parameters does not reconfigure the existing link, and changing one is the business of  `PUT api/2.0/files/folder/{id}/links`. The parameters therefore only shape the link at the moment it is born -  `access` its rights, `title` its name, `expirationDate` its lifetime, which is unlimited here unless one is  given, `internal` whether only signed-in members may follow it, `denyDownload` whether the contents may only  be viewed, and `password` a secret to be asked for. Sending `access` with the value that grants nothing  creates no link and answers with nothing. The caller needs the right to manage the links of the room the  folder belongs to, which its manager and a portal administrator acting as room manager have, and a member with  content-creator or read access is refused with 403; an unknown folder is answered with 404. Read the address  from `sharedTo.shareLink`.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.createFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Create the folder primary external link
   * Answers with the primary external link of a folder or a room, creating it on the first call and returning the  one that already exists afterwards, so the operation is idempotent in effect: a second call with other  parameters does not reconfigure the existing link, and changing one is the business of  `PUT api/2.0/files/folder/{id}/links`. The parameters therefore only shape the link at the moment it is born -  `access` its rights, `title` its name, `expirationDate` its lifetime, which is unlimited here unless one is  given, `internal` whether only signed-in members may follow it, `denyDownload` whether the contents may only  be viewed, and `password` a secret to be asked for. Sending `access` with the value that grants nothing  creates no link and answers with nothing. The caller needs the right to manage the links of the room the  folder belongs to, which its manager and a portal administrator acting as room manager have, and a member with  content-creator or read access is refused with 403; an unknown folder is answered with 404. Read the address  from `sharedTo.shareLink`.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
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
   * Create the folder primary external link (third-party storage)
   * Answers with the primary external link of a folder or a room, creating it on the first call and returning the  one that already exists afterwards, so the operation is idempotent in effect: a second call with other  parameters does not reconfigure the existing link, and changing one is the business of  `PUT api/2.0/files/folder/{id}/links`. The parameters therefore only shape the link at the moment it is born -  `access` its rights, `title` its name, `expirationDate` its lifetime, which is unlimited here unless one is  given, `internal` whether only signed-in members may follow it, `denyDownload` whether the contents may only  be viewed, and `password` a secret to be asked for. Sending `access` with the value that grants nothing  creates no link and answers with nothing. The caller needs the right to manage the links of the room the  folder belongs to, which its manager and a portal administrator acting as room manager have, and a member with  content-creator or read access is refused with 403; an unknown folder is answered with 404. Read the address  from `sharedTo.shareLink`.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.createFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Create the folder primary external link (third-party storage)
   * Answers with the primary external link of a folder or a room, creating it on the first call and returning the  one that already exists afterwards, so the operation is idempotent in effect: a second call with other  parameters does not reconfigure the existing link, and changing one is the business of  `PUT api/2.0/files/folder/{id}/links`. The parameters therefore only shape the link at the moment it is born -  `access` its rights, `title` its name, `expirationDate` its lifetime, which is unlimited here unless one is  given, `internal` whether only signed-in members may follow it, `denyDownload` whether the contents may only  be viewed, and `password` a secret to be asked for. Sending `access` with the value that grants nothing  creates no link and answers with nothing. The caller needs the right to manage the links of the room the  folder belongs to, which its manager and a portal administrator acting as room manager have, and a member with  content-creator or read access is refused with 403; an unknown folder is answered with 404. Read the address  from `sharedTo.shareLink`.
   *
   * REST API Reference for createFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
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
   * Start the folder history report generation
   * Queues a background job that renders the history of a folder into a spreadsheet, or into a CSV file when  `format` asks for one, and saves the result in the caller's My documents. The answer is the queued task, not  the report: poll `GET api/2.0/files/folder/{folderId}/log/report` until `isCompleted` is true, then take the  file from `resultFileId`, `resultFileName` and `resultFileUrl`, of which a CSV report fills only the last two.  `from` and `to` limit the exported period; leaving both out exports the whole history. While a report for the  same folder and caller is still running, this call joins it and answers with the running task instead of  starting a second one, so retrying is safe. The caller needs read access to the folder and may not be a guest,  and the portal plan has to include the audit feature - otherwise the call is refused, with 403 for the access  rule and 404 for a folder that does not exist. Only a portal administrator gets the address, browser and  platform columns. Give up a running report with `DELETE api/2.0/files/folder/{folderId}/log/report`.
   *
   * REST API Reference for createReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
   *
   * @param folderId The folder whose history is exported; the report covers the folder itself and the entries inside it. (required)
   * @param format The shape the report is written in: `Xlsx` produces a spreadsheet that is saved as a file of the portal, while  `Csv` produces a comma-separated text file that is uploaded to My documents without being reported back with  a file identifier. (optional)
   * @param from The earliest moment an exported entry may have, read in the time zone of the portal; left out, the report  starts at the oldest entry the portal still keeps. (optional)
   * @param to The latest moment an exported entry may have, read in the time zone of the portal; left out, the report ends  at the newest entry. (optional)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createReportFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable AuditReportFormat format, @javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to) throws ApiException {
    return this.createReportFolderHistory(folderId, format, from, to, Collections.emptyMap());
  }


  /**
   * Start the folder history report generation
   * Queues a background job that renders the history of a folder into a spreadsheet, or into a CSV file when  `format` asks for one, and saves the result in the caller's My documents. The answer is the queued task, not  the report: poll `GET api/2.0/files/folder/{folderId}/log/report` until `isCompleted` is true, then take the  file from `resultFileId`, `resultFileName` and `resultFileUrl`, of which a CSV report fills only the last two.  `from` and `to` limit the exported period; leaving both out exports the whole history. While a report for the  same folder and caller is still running, this call joins it and answers with the running task instead of  starting a second one, so retrying is safe. The caller needs read access to the folder and may not be a guest,  and the portal plan has to include the audit feature - otherwise the call is refused, with 403 for the access  rule and 404 for a folder that does not exist. Only a portal administrator gets the address, browser and  platform columns. Give up a running report with `DELETE api/2.0/files/folder/{folderId}/log/report`.
   *
   * REST API Reference for createReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
   *
   * @param folderId The folder whose history is exported; the report covers the folder itself and the entries inside it. (required)
   * @param format The shape the report is written in: `Xlsx` produces a spreadsheet that is saved as a file of the portal, while  `Csv` produces a comma-separated text file that is uploaded to My documents without being reported back with  a file identifier. (optional)
   * @param from The earliest moment an exported entry may have, read in the time zone of the portal; left out, the report  starts at the oldest entry the portal still keeps. (optional)
   * @param to The latest moment an exported entry may have, read in the time zone of the portal; left out, the report ends  at the newest entry. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper createReportFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable AuditReportFormat format, @javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to, Map<String, String> additionalHeaders) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
    localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
    localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
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
   * Queues the deletion of one folder together with everything inside it, and answers with the file operations of  the caller, the one just created among them. The folder is not gone when the response arrives: poll  `GET api/2.0/files/fileops` until the operation reports `finished`, and read its `error` to learn whether the  deletion succeeded. By default the folder is moved to the Trash section, from where it can be restored;  `immediately=true` discards it for good instead, and inside a room, where there is no Trash, deletion is  always final. `deleteAfter=true` postpones the deletion until the editing sessions on the contents have ended,  so files somebody is working on are not pulled away. The caller needs the right to delete the folder, which  the room manager, a portal administrator acting as room manager and a content creator acting on a folder of  their own have; editing access alone, read access and a guest are refused. The call is destructive. To delete  several items at once use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder to delete, together with everything it holds. (required)
   * @param deleteFolder How the deletion is to be carried out. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull DeleteFolder deleteFolder) throws ApiException {
    return this.deleteFolder(folderId, deleteFolder, Collections.emptyMap());
  }


  /**
   * Delete a folder
   * Queues the deletion of one folder together with everything inside it, and answers with the file operations of  the caller, the one just created among them. The folder is not gone when the response arrives: poll  `GET api/2.0/files/fileops` until the operation reports `finished`, and read its `error` to learn whether the  deletion succeeded. By default the folder is moved to the Trash section, from where it can be restored;  `immediately=true` discards it for good instead, and inside a room, where there is no Trash, deletion is  always final. `deleteAfter=true` postpones the deletion until the editing sessions on the contents have ended,  so files somebody is working on are not pulled away. The caller needs the right to delete the folder, which  the room manager, a portal administrator acting as room manager and a content creator acting on a folder of  their own have; editing access alone, read access and a guest are refused. The call is destructive. To delete  several items at once use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder to delete, together with everything it holds. (required)
   * @param deleteFolder How the deletion is to be carried out. (required)
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
   * Delete a folder (third-party storage)
   * Queues the deletion of one folder together with everything inside it, and answers with the file operations of  the caller, the one just created among them. The folder is not gone when the response arrives: poll  `GET api/2.0/files/fileops` until the operation reports `finished`, and read its `error` to learn whether the  deletion succeeded. By default the folder is moved to the Trash section, from where it can be restored;  `immediately=true` discards it for good instead, and inside a room, where there is no Trash, deletion is  always final. `deleteAfter=true` postpones the deletion until the editing sessions on the contents have ended,  so files somebody is working on are not pulled away. The caller needs the right to delete the folder, which  the room manager, a portal administrator acting as room manager and a content creator acting on a folder of  their own have; editing access alone, read access and a guest are refused. The call is destructive. To delete  several items at once use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder to delete, together with everything it holds. (required)
   * @param deleteFolder How the deletion is to be carried out. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull DeleteFolder deleteFolder) throws ApiException {
    return this.deleteFolder(folderId, deleteFolder, Collections.emptyMap());
  }


  /**
   * Delete a folder (third-party storage)
   * Queues the deletion of one folder together with everything inside it, and answers with the file operations of  the caller, the one just created among them. The folder is not gone when the response arrives: poll  `GET api/2.0/files/fileops` until the operation reports `finished`, and read its `error` to learn whether the  deletion succeeded. By default the folder is moved to the Trash section, from where it can be restored;  `immediately=true` discards it for good instead, and inside a room, where there is no Trash, deletion is  always final. `deleteAfter=true` postpones the deletion until the editing sessions on the contents have ended,  so files somebody is working on are not pulled away. The caller needs the right to delete the folder, which  the room manager, a portal administrator acting as room manager and a content creator acting on a folder of  their own have; editing access alone, read access and a guest are refused. The call is destructive. To delete  several items at once use `PUT api/2.0/files/fileops/delete`.
   *
   * REST API Reference for deleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
   *
   * @param folderId The folder to delete, together with everything it holds. (required)
   * @param deleteFolder How the deletion is to be carried out. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull DeleteFolder deleteFolder, Map<String, String> additionalHeaders) throws ApiException {
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
   * Rebuilds the spreadsheet that gathers the answers submitted to a form, starting from the Complete folder  that holds the filled copies. The answer names the original form the results belong to, says in `isNewFile`  whether the spreadsheet is being created or an existing one rewritten in place, and carries the queued job in  `task`; the file itself is not ready yet, so poll `GET api/2.0/files/file/{fileId}/xlsx` with the identifier  of the form until the task reports completion. The folder has to be the Complete folder of a form-filling  room and has to hold at least one submitted copy whose original form still exists, and the caller needs the  right to maintain that form, which the room manager has. A folder that does not exist, or one that holds  nothing to report on, is answered with 404, and a folder of the wrong kind or a caller without those rights  with 403. The call is mutating: it writes the results file of the form.
   *
   * REST API Reference for generateXlsxByFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return XlsxReportResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public XlsxReportResponseWrapper generateXlsxByFolder(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.generateXlsxByFolder(folderId, Collections.emptyMap());
  }


  /**
   * Generate XLSX report by folder
   * Rebuilds the spreadsheet that gathers the answers submitted to a form, starting from the Complete folder  that holds the filled copies. The answer names the original form the results belong to, says in `isNewFile`  whether the spreadsheet is being created or an existing one rewritten in place, and carries the queued job in  `task`; the file itself is not ready yet, so poll `GET api/2.0/files/file/{fileId}/xlsx` with the identifier  of the form until the task reports completion. The folder has to be the Complete folder of a form-filling  room and has to hold at least one submitted copy whose original form still exists, and the caller needs the  right to maintain that form, which the room manager has. A folder that does not exist, or one that holds  nothing to report on, is answered with 404, and a folder of the wrong kind or a caller without those rights  with 403. The call is mutating: it writes the results file of the form.
   *
   * REST API Reference for generateXlsxByFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
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
   * Returns the caller's own Favorites section: the files and folders this account has marked as favorite,  together with the section folder itself. Favorites are per-account, so the entries another member marked are  not listed here, and a guest sees only their own, usually empty, list. Mark a single file with  `GET api/2.0/files/favorites/{fileId}`, or add and remove batches of files and folders with  `POST api/2.0/files/favorites` and `DELETE api/2.0/files/favorites`. Nothing in the section is modified,  though passing `sortBy` saves the requested order as the default order for this account. Entries the caller  can no longer read, and entries that have been moved to the Trash section, drop out of the listing even  though their favorite mark stays, so the section can shrink without an explicit unmark. `folders` and `files`  hold one page of the section, `total` counts the entries matching the request before `count` and `startIndex`  are applied, and `current` describes the section folder itself.
   *
   * REST API Reference for getFavoritesFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the section unfiltered. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFavoritesFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Favorites section
   * Returns the caller's own Favorites section: the files and folders this account has marked as favorite,  together with the section folder itself. Favorites are per-account, so the entries another member marked are  not listed here, and a guest sees only their own, usually empty, list. Mark a single file with  `GET api/2.0/files/favorites/{fileId}`, or add and remove batches of files and folders with  `POST api/2.0/files/favorites` and `DELETE api/2.0/files/favorites`. Nothing in the section is modified,  though passing `sortBy` saves the requested order as the default order for this account. Entries the caller  can no longer read, and entries that have been moved to the Trash section, drop out of the listing even  though their favorite mark stays, so the section can shrink without an explicit unmark. `folders` and `files`  hold one page of the section, `total` counts the entries matching the request before `count` and `startIndex`  are applied, and `current` describes the section folder itself.
   *
   * REST API Reference for getFavoritesFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the section unfiltered. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFavoritesFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Reports how much storage the portal spends on documents, split by section - My documents, Trash, Rooms,  Archive and, where the feature is on, AI agents - each entry naming the section and the space it takes in  bytes. The figures cover the whole portal rather than the calling account, and moving an entry between  sections moves its space with it, which is why deleting a file to the Trash does not free anything until the  Trash is emptied. Only a caller who may change portal settings, that is the owner and the portal  administrators, is allowed here; a room administrator, an ordinary member and a guest are all refused. The  call is read-only, takes no parameters and answers with the sections in a fixed order. The quota of the portal  as a whole, storage outside documents included, is not part of this answer.
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
   * Reports how much storage the portal spends on documents, split by section - My documents, Trash, Rooms,  Archive and, where the feature is on, AI agents - each entry naming the section and the space it takes in  bytes. The figures cover the whole portal rather than the calling account, and moving an entry between  sections moves its space with it, which is why deleting a file to the Trash does not free anything until the  Trash is emptied. Only a caller who may change portal settings, that is the owner and the portal  administrators, is allowed here; a room administrator, an ordinary member and a guest are all refused. The  call is read-only, takes no parameters and answers with the sections in a fixed order. The quota of the portal  as a whole, storage outside documents included, is not part of this answer.
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
   * Lists the fields the completed forms of a form-filling room carry, each of them a key and the kind of value  behind it, so that a client can offer them as filters. Feed a pair from this list back as `formsItemKey` and  `formsItemType` of `GET api/2.0/files/{folderId}` to keep only the completed forms whose field of that name  holds a value. The fields are read from the search index of one of the forms already gathered, so they appear  once indexing has caught up with the first submission. Only the Complete folder of a form-filling room  carries such fields: for any other folder, for a folder that does not exist and for one that has been deleted  the answer is an empty list rather than a refusal, and the same holds while nothing has been submitted yet.  The operation reads the index alone, changes nothing and needs no authorization.
   *
   * REST API Reference for getFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FormsItemArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FormsItemArrayWrapper getFolder(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolder(folderId, Collections.emptyMap());
  }


  /**
   * Get folder form filter
   * Lists the fields the completed forms of a form-filling room carry, each of them a key and the kind of value  behind it, so that a client can offer them as filters. Feed a pair from this list back as `formsItemKey` and  `formsItemType` of `GET api/2.0/files/{folderId}` to keep only the completed forms whose field of that name  holds a value. The fields are read from the search index of one of the forms already gathered, so they appear  once indexing has caught up with the first submission. Only the Complete folder of a form-filling room  carries such fields: for any other folder, for a folder that does not exist and for one that has been deleted  the answer is an empty list rather than a refusal, and the same holds while nothing has been submitted yet.  The operation reads the index alone, changes nothing and needs no authorization.
   *
   * REST API Reference for getFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Returns one page of the contents of a folder - its subfolders in `folders`, its files in `files`, the folder  itself in `current` and the chain of parents in `pathParts` - and is the operation a client browses the file  tree with. `filterType`, `filterValue`, `extension`, `userIdOrGroupId`, `sharedBy` and `folderType` narrow  what is listed, `applyFilterOption` decides whether those filters bite on the files, on the folders or on  both, and `withSubFolders`, which is on unless it is switched off, lets a narrowed request descend through the  whole subtree instead of the top level alone. `filterValue` is matched against titles and against indexed  document content, and indexing is asynchronous, so a file uploaded a moment ago can be missing from a search  for a short while. `count` and `startIndex` page through the result while `total` counts everything that  matches, and `sortBy` with `sortOrder` both order the page and are saved as the default order of the account.  Reading a room or an ordinary folder clears its new-item marks for the caller. A caller who may not read the  folder is answered with 403, and a folder that does not exist with 404.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder whose contents are listed. Each section root has an operation of its own, such as  `GET api/2.0/files/@my`, and every other folder is opened by the identifier a listing gave for it. (required)
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param sharedBy Restricts the listing to the entries this member shared, which narrows a shared listing down to what one  person handed out. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, spreadsheets, images or one type of room.  Omit it to list every kind the folder holds. (optional)
   * @param roomId Keeps only the entries that lie in this room, which matters when the listing being read gathers entries from  more than one of them. (optional)
   * @param folderType Keeps only the folders of these kinds, each given as the number of a folder type; it is how a listing is  narrowed down to, say, the form-filling folders of a room. (optional)
   * @param excludeSubject Turns `userIdOrGroupId` around: with true the entries of that member or group are the ones left out, with  false they are the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param withSubFolders Whether a narrowed request reaches into the subfolders: with true, which is what an omitted parameter means,  matching entries are gathered from the whole subtree, with false only the top level is read. It makes a  difference only once `filterType`, `userIdOrGroupId` or `filterValue` narrows the request, because an  unfiltered listing always shows the top level alone. (optional)
   * @param extension Keeps only the files carrying one of these extensions, several of them separated by commas; the leading dot is  optional. (optional)
   * @param searchArea Which area a listing that spans several of them is taken from - the active rooms, the archive, the room  templates or the form-filling rooms. A folder that belongs to one area only settles the area itself and  ignores the parameter. (optional)
   * @param formsItemKey Keeps only the completed forms whose form field of this name holds a value. Take the name from  `GET api/2.0/files/{folderId}/formfilter`, and use it in the folder that gathers the completed copies of a  form-filling room. (optional)
   * @param formsItemType The kind of the form field named by `formsItemKey`, taken from the same list; the two are sent together. (optional)
   * @param count The size of one page of the listing. Pair it with `startIndex` to walk through the result, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the listing is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the folder unfiltered. (optional)
   * @param location Where the entries of a tag-based listing have to live to be kept: `Room` keeps what lies in a room,  `Documents` what lies in a personal section, and `Link` what was reached through an external link that is  still valid. It shapes the Favorites and Recent listings and does nothing in an ordinary folder. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFolderByFolderId(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer roomId, @javax.annotation.Nullable List<Integer> folderType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Boolean withSubFolders, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location) throws ApiException {
    return this.getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, folderType, excludeSubject, applyFilterOption, withSubFolders, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location, Collections.emptyMap());
  }


  /**
   * Get a folder by ID
   * Returns one page of the contents of a folder - its subfolders in `folders`, its files in `files`, the folder  itself in `current` and the chain of parents in `pathParts` - and is the operation a client browses the file  tree with. `filterType`, `filterValue`, `extension`, `userIdOrGroupId`, `sharedBy` and `folderType` narrow  what is listed, `applyFilterOption` decides whether those filters bite on the files, on the folders or on  both, and `withSubFolders`, which is on unless it is switched off, lets a narrowed request descend through the  whole subtree instead of the top level alone. `filterValue` is matched against titles and against indexed  document content, and indexing is asynchronous, so a file uploaded a moment ago can be missing from a search  for a short while. `count` and `startIndex` page through the result while `total` counts everything that  matches, and `sortBy` with `sortOrder` both order the page and are saved as the default order of the account.  Reading a room or an ordinary folder clears its new-item marks for the caller. A caller who may not read the  folder is answered with 403, and a folder that does not exist with 404.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder whose contents are listed. Each section root has an operation of its own, such as  `GET api/2.0/files/@my`, and every other folder is opened by the identifier a listing gave for it. (required)
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param sharedBy Restricts the listing to the entries this member shared, which narrows a shared listing down to what one  person handed out. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, spreadsheets, images or one type of room.  Omit it to list every kind the folder holds. (optional)
   * @param roomId Keeps only the entries that lie in this room, which matters when the listing being read gathers entries from  more than one of them. (optional)
   * @param folderType Keeps only the folders of these kinds, each given as the number of a folder type; it is how a listing is  narrowed down to, say, the form-filling folders of a room. (optional)
   * @param excludeSubject Turns `userIdOrGroupId` around: with true the entries of that member or group are the ones left out, with  false they are the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param withSubFolders Whether a narrowed request reaches into the subfolders: with true, which is what an omitted parameter means,  matching entries are gathered from the whole subtree, with false only the top level is read. It makes a  difference only once `filterType`, `userIdOrGroupId` or `filterValue` narrows the request, because an  unfiltered listing always shows the top level alone. (optional)
   * @param extension Keeps only the files carrying one of these extensions, several of them separated by commas; the leading dot is  optional. (optional)
   * @param searchArea Which area a listing that spans several of them is taken from - the active rooms, the archive, the room  templates or the form-filling rooms. A folder that belongs to one area only settles the area itself and  ignores the parameter. (optional)
   * @param formsItemKey Keeps only the completed forms whose form field of this name holds a value. Take the name from  `GET api/2.0/files/{folderId}/formfilter`, and use it in the folder that gathers the completed copies of a  form-filling room. (optional)
   * @param formsItemType The kind of the form field named by `formsItemKey`, taken from the same list; the two are sent together. (optional)
   * @param count The size of one page of the listing. Pair it with `startIndex` to walk through the result, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the listing is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the folder unfiltered. (optional)
   * @param location Where the entries of a tag-based listing have to live to be kept: `Room` keeps what lies in a room,  `Documents` what lies in a personal section, and `Link` what was reached through an external link that is  still valid. It shapes the Favorites and Recent listings and does nothing in an ordinary folder. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFolderByFolderId(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer roomId, @javax.annotation.Nullable List<Integer> folderType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Boolean withSubFolders, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "folderType", folderType));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
    localVarQueryParams.addAll(apiClient.parameterToPair("withSubFolders", withSubFolders));
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Get a folder by ID (third-party storage)
   * Returns one page of the contents of a folder - its subfolders in `folders`, its files in `files`, the folder  itself in `current` and the chain of parents in `pathParts` - and is the operation a client browses the file  tree with. `filterType`, `filterValue`, `extension`, `userIdOrGroupId`, `sharedBy` and `folderType` narrow  what is listed, `applyFilterOption` decides whether those filters bite on the files, on the folders or on  both, and `withSubFolders`, which is on unless it is switched off, lets a narrowed request descend through the  whole subtree instead of the top level alone. `filterValue` is matched against titles and against indexed  document content, and indexing is asynchronous, so a file uploaded a moment ago can be missing from a search  for a short while. `count` and `startIndex` page through the result while `total` counts everything that  matches, and `sortBy` with `sortOrder` both order the page and are saved as the default order of the account.  Reading a room or an ordinary folder clears its new-item marks for the caller. A caller who may not read the  folder is answered with 403, and a folder that does not exist with 404.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder whose contents are listed. Each section root has an operation of its own, such as  `GET api/2.0/files/@my`, and every other folder is opened by the identifier a listing gave for it. (required)
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param sharedBy Restricts the listing to the entries this member shared, which narrows a shared listing down to what one  person handed out. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, spreadsheets, images or one type of room.  Omit it to list every kind the folder holds. (optional)
   * @param roomId Keeps only the entries that lie in this room, which matters when the listing being read gathers entries from  more than one of them. (optional)
   * @param folderType Keeps only the folders of these kinds, each given as the number of a folder type; it is how a listing is  narrowed down to, say, the form-filling folders of a room. (optional)
   * @param excludeSubject Turns `userIdOrGroupId` around: with true the entries of that member or group are the ones left out, with  false they are the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param withSubFolders Whether a narrowed request reaches into the subfolders: with true, which is what an omitted parameter means,  matching entries are gathered from the whole subtree, with false only the top level is read. It makes a  difference only once `filterType`, `userIdOrGroupId` or `filterValue` narrows the request, because an  unfiltered listing always shows the top level alone. (optional)
   * @param extension Keeps only the files carrying one of these extensions, several of them separated by commas; the leading dot is  optional. (optional)
   * @param searchArea Which area a listing that spans several of them is taken from - the active rooms, the archive, the room  templates or the form-filling rooms. A folder that belongs to one area only settles the area itself and  ignores the parameter. (optional)
   * @param formsItemKey Keeps only the completed forms whose form field of this name holds a value. Take the name from  `GET api/2.0/files/{folderId}/formfilter`, and use it in the folder that gathers the completed copies of a  form-filling room. (optional)
   * @param formsItemType The kind of the form field named by `formsItemKey`, taken from the same list; the two are sent together. (optional)
   * @param count The size of one page of the listing. Pair it with `startIndex` to walk through the result, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the listing is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the folder unfiltered. (optional)
   * @param location Where the entries of a tag-based listing have to live to be kept: `Room` keeps what lies in a room,  `Documents` what lies in a personal section, and `Link` what was reached through an external link that is  still valid. It shapes the Favorites and Recent listings and does nothing in an ordinary folder. (optional)
   * @return ThirdPartyFolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderContentWrapper getFolderByFolderId(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable String roomId, @javax.annotation.Nullable List<Integer> folderType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Boolean withSubFolders, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location) throws ApiException {
    return this.getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, folderType, excludeSubject, applyFilterOption, withSubFolders, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location, Collections.emptyMap());
  }


  /**
   * Get a folder by ID (third-party storage)
   * Returns one page of the contents of a folder - its subfolders in `folders`, its files in `files`, the folder  itself in `current` and the chain of parents in `pathParts` - and is the operation a client browses the file  tree with. `filterType`, `filterValue`, `extension`, `userIdOrGroupId`, `sharedBy` and `folderType` narrow  what is listed, `applyFilterOption` decides whether those filters bite on the files, on the folders or on  both, and `withSubFolders`, which is on unless it is switched off, lets a narrowed request descend through the  whole subtree instead of the top level alone. `filterValue` is matched against titles and against indexed  document content, and indexing is asynchronous, so a file uploaded a moment ago can be missing from a search  for a short while. `count` and `startIndex` page through the result while `total` counts everything that  matches, and `sortBy` with `sortOrder` both order the page and are saved as the default order of the account.  Reading a room or an ordinary folder clears its new-item marks for the caller. A caller who may not read the  folder is answered with 403, and a folder that does not exist with 404.
   *
   * REST API Reference for getFolderByFolderId Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
   *
   * @param folderId The folder whose contents are listed. Each section root has an operation of its own, such as  `GET api/2.0/files/@my`, and every other folder is opened by the identifier a listing gave for it. (required)
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param sharedBy Restricts the listing to the entries this member shared, which narrows a shared listing down to what one  person handed out. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, spreadsheets, images or one type of room.  Omit it to list every kind the folder holds. (optional)
   * @param roomId Keeps only the entries that lie in this room, which matters when the listing being read gathers entries from  more than one of them. (optional)
   * @param folderType Keeps only the folders of these kinds, each given as the number of a folder type; it is how a listing is  narrowed down to, say, the form-filling folders of a room. (optional)
   * @param excludeSubject Turns `userIdOrGroupId` around: with true the entries of that member or group are the ones left out, with  false they are the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param withSubFolders Whether a narrowed request reaches into the subfolders: with true, which is what an omitted parameter means,  matching entries are gathered from the whole subtree, with false only the top level is read. It makes a  difference only once `filterType`, `userIdOrGroupId` or `filterValue` narrows the request, because an  unfiltered listing always shows the top level alone. (optional)
   * @param extension Keeps only the files carrying one of these extensions, several of them separated by commas; the leading dot is  optional. (optional)
   * @param searchArea Which area a listing that spans several of them is taken from - the active rooms, the archive, the room  templates or the form-filling rooms. A folder that belongs to one area only settles the area itself and  ignores the parameter. (optional)
   * @param formsItemKey Keeps only the completed forms whose form field of this name holds a value. Take the name from  `GET api/2.0/files/{folderId}/formfilter`, and use it in the folder that gathers the completed copies of a  form-filling room. (optional)
   * @param formsItemType The kind of the form field named by `formsItemKey`, taken from the same list; the two are sent together. (optional)
   * @param count The size of one page of the listing. Pair it with `startIndex` to walk through the result, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the listing is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the folder unfiltered. (optional)
   * @param location Where the entries of a tag-based listing have to live to be kept: `Room` keeps what lies in a room,  `Documents` what lies in a personal section, and `Link` what was reached through an external link that is  still valid. It shapes the Favorites and Recent listings and does nothing in an ordinary folder. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderContentWrapper getFolderByFolderId(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable UUID sharedBy, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable String roomId, @javax.annotation.Nullable List<Integer> folderType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Boolean withSubFolders, @javax.annotation.Nullable String extension, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable String formsItemKey, @javax.annotation.Nullable String formsItemType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, @javax.annotation.Nullable Location location, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "folderType", folderType));
    localVarQueryParams.addAll(apiClient.parameterToPair("excludeSubject", excludeSubject));
    localVarQueryParams.addAll(apiClient.parameterToPair("applyFilterOption", applyFilterOption));
    localVarQueryParams.addAll(apiClient.parameterToPair("withSubFolders", withSubFolders));
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ThirdPartyFolderContentWrapper> localVarReturnType = new TypeReference<ThirdPartyFolderContentWrapper>() {};
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
   * Lists what has happened to a folder and to the entries inside it - creations, renames, uploads, moves,  deletions and changes of access - each record naming the action, the moment it happened and the member behind  it. Records that belong to one action are grouped, so a batch arrives as a single entry carrying the rest of  itself in `related`, and the list runs from the most recent record backwards. `fromDate` and `toDate` narrow  the period, `startIndex` and `count` page through the result, and the number of records matching the request  is reported in the response headers rather than in the body. Any member who can read the folder may read its  history; a caller without access is answered with 403 and a folder that does not exist with 404. When the  folder is a form-filling folder the caller reached through a filling invitation, the history is narrowed to  what that caller may see. The call is read-only. To take the same history away as a spreadsheet, start a  report with `POST api/2.0/files/folder/{folderId}/log/report`.
   *
   * REST API Reference for getFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
   *
   * @param folderId The folder whose activity log is read; the log covers the folder itself and the entries inside it. (required)
   * @param fromDate The earliest moment an entry may have, read in the time zone of the portal; left out, the log starts at the  oldest entry the portal still keeps. (optional)
   * @param toDate The latest moment an entry may have, read in the time zone of the portal; left out, the log ends at the newest  entry. (optional)
   * @param count How many entries one page holds. The number of entries that match the query is reported in the response  headers, not in the body. (optional)
   * @param startIndex How many entries to skip before the page begins, counted from the newest one, so pages are taken by adding the  page size to it. (optional)
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OffsetDateTime fromDate, @javax.annotation.Nullable OffsetDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderHistory(folderId, fromDate, toDate, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get folder history
   * Lists what has happened to a folder and to the entries inside it - creations, renames, uploads, moves,  deletions and changes of access - each record naming the action, the moment it happened and the member behind  it. Records that belong to one action are grouped, so a batch arrives as a single entry carrying the rest of  itself in `related`, and the list runs from the most recent record backwards. `fromDate` and `toDate` narrow  the period, `startIndex` and `count` page through the result, and the number of records matching the request  is reported in the response headers rather than in the body. Any member who can read the folder may read its  history; a caller without access is answered with 403 and a folder that does not exist with 404. When the  folder is a form-filling folder the caller reached through a filling invitation, the history is narrowed to  what that caller may see. The call is read-only. To take the same history away as a spreadsheet, start a  report with `POST api/2.0/files/folder/{folderId}/log/report`.
   *
   * REST API Reference for getFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
   *
   * @param folderId The folder whose activity log is read; the log covers the folder itself and the entries inside it. (required)
   * @param fromDate The earliest moment an entry may have, read in the time zone of the portal; left out, the log starts at the  oldest entry the portal still keeps. (optional)
   * @param toDate The latest moment an entry may have, read in the time zone of the portal; left out, the log ends at the newest  entry. (optional)
   * @param count How many entries one page holds. The number of entries that match the query is reported in the response  headers, not in the body. (optional)
   * @param startIndex How many entries to skip before the page begins, counted from the newest one, so pages are taken by adding the  page size to it. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFolderHistory(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OffsetDateTime fromDate, @javax.annotation.Nullable OffsetDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
    localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
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
   * Returns one folder as an object - its title, its parent, the moments it was created and last changed, the  access the caller has to it, the number of items that are new for them, and the room settings when the folder  is a room - without listing anything inside it. Use it to resolve a folder identifier into something  displayable, and `GET api/2.0/files/{folderId}` when the contents are what is wanted; unlike that operation,  this one leaves the new-item marks of the folder alone. Any member who can read the folder may call it, and an  anonymous caller only through an external link that grants access, everybody else being refused; a folder that  does not exist is answered as not found. The call is read-only. The chain of parents above the folder is not  part of the answer and is read with `GET api/2.0/files/folder/{folderId}/path`.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper getFolderInfo(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolderInfo(folderId, Collections.emptyMap());
  }


  /**
   * Get folder information
   * Returns one folder as an object - its title, its parent, the moments it was created and last changed, the  access the caller has to it, the number of items that are new for them, and the room settings when the folder  is a room - without listing anything inside it. Use it to resolve a folder identifier into something  displayable, and `GET api/2.0/files/{folderId}` when the contents are what is wanted; unlike that operation,  this one leaves the new-item marks of the folder alone. Any member who can read the folder may call it, and an  anonymous caller only through an external link that grants access, everybody else being refused; a folder that  does not exist is answered as not found. The call is read-only. The chain of parents above the folder is not  part of the answer and is read with `GET api/2.0/files/folder/{folderId}/path`.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper getFolderInfo(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FolderWrapper> localVarReturnType = new TypeReference<FolderWrapper>() {};
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
   * Get folder information (third-party storage)
   * Returns one folder as an object - its title, its parent, the moments it was created and last changed, the  access the caller has to it, the number of items that are new for them, and the room settings when the folder  is a room - without listing anything inside it. Use it to resolve a folder identifier into something  displayable, and `GET api/2.0/files/{folderId}` when the contents are what is wanted; unlike that operation,  this one leaves the new-item marks of the folder alone. Any member who can read the folder may call it, and an  anonymous caller only through an external link that grants access, everybody else being refused; a folder that  does not exist is answered as not found. The call is read-only. The chain of parents above the folder is not  part of the answer and is read with `GET api/2.0/files/folder/{folderId}/path`.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper getFolderInfo(@javax.annotation.Nonnull String folderId) throws ApiException {
    return this.getFolderInfo(folderId, Collections.emptyMap());
  }


  /**
   * Get folder information (third-party storage)
   * Returns one folder as an object - its title, its parent, the moments it was created and last changed, the  access the caller has to it, the number of items that are new for them, and the room settings when the folder  is a room - without listing anything inside it. Use it to resolve a folder identifier into something  displayable, and `GET api/2.0/files/{folderId}` when the contents are what is wanted; unlike that operation,  this one leaves the new-item marks of the folder alone. Any member who can read the folder may call it, and an  anonymous caller only through an external link that grants access, everybody else being refused; a folder that  does not exist is answered as not found. The call is read-only. The chain of parents above the folder is not  part of the answer and is read with `GET api/2.0/files/folder/{folderId}/path`.
   *
   * REST API Reference for getFolderInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper getFolderInfo(@javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ThirdPartyFolderWrapper> localVarReturnType = new TypeReference<ThirdPartyFolderWrapper>() {};
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
   * Get folder external links
   * Lists the external links of a folder or a room, each with its identifier, title, address, rights, expiration  date, password flag and download restriction, the primary link among them once it exists. At most the first  hundred links are answered and the number returned is reported in the response headers; there are no paging  parameters here. A folder that has never been shared by link answers with an empty list, and so does a member  who may read the folder but not manage its links - the empty answer therefore means nothing to show you  rather than no links exist. A member without access to the room is refused, an anonymous caller is rejected,  and a folder that does not exist is answered as not found. The call is read-only. Take an identifier from here  to `PUT api/2.0/files/folder/{id}/links` to change or remove that link, and read the primary one alone with  `GET api/2.0/files/folder/{id}/link`.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder or room whose external links are listed. (required)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderLinks(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.getFolderLinks(id, Collections.emptyMap());
  }


  /**
   * Get folder external links
   * Lists the external links of a folder or a room, each with its identifier, title, address, rights, expiration  date, password flag and download restriction, the primary link among them once it exists. At most the first  hundred links are answered and the number returned is reported in the response headers; there are no paging  parameters here. A folder that has never been shared by link answers with an empty list, and so does a member  who may read the folder but not manage its links - the empty answer therefore means nothing to show you  rather than no links exist. A member without access to the room is refused, an anonymous caller is rejected,  and a folder that does not exist is answered as not found. The call is read-only. Take an identifier from here  to `PUT api/2.0/files/folder/{id}/links` to change or remove that link, and read the primary one alone with  `GET api/2.0/files/folder/{id}/link`.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder or room whose external links are listed. (required)
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
   * Get folder external links (third-party storage)
   * Lists the external links of a folder or a room, each with its identifier, title, address, rights, expiration  date, password flag and download restriction, the primary link among them once it exists. At most the first  hundred links are answered and the number returned is reported in the response headers; there are no paging  parameters here. A folder that has never been shared by link answers with an empty list, and so does a member  who may read the folder but not manage its links - the empty answer therefore means nothing to show you  rather than no links exist. A member without access to the room is refused, an anonymous caller is rejected,  and a folder that does not exist is answered as not found. The call is read-only. Take an identifier from here  to `PUT api/2.0/files/folder/{id}/links` to change or remove that link, and read the primary one alone with  `GET api/2.0/files/folder/{id}/link`.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder or room whose external links are listed. (required)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderLinks(@javax.annotation.Nonnull String id) throws ApiException {
    return this.getFolderLinks(id, Collections.emptyMap());
  }


  /**
   * Get folder external links (third-party storage)
   * Lists the external links of a folder or a room, each with its identifier, title, address, rights, expiration  date, password flag and download restriction, the primary link among them once it exists. At most the first  hundred links are answered and the number returned is reported in the response headers; there are no paging  parameters here. A folder that has never been shared by link answers with an empty list, and so does a member  who may read the folder but not manage its links - the empty answer therefore means nothing to show you  rather than no links exist. A member without access to the room is refused, an anonymous caller is rejected,  and a folder that does not exist is answered as not found. The call is read-only. Take an identifier from here  to `PUT api/2.0/files/folder/{id}/links` to change or remove that link, and read the primary one alone with  `GET api/2.0/files/folder/{id}/link`.
   *
   * REST API Reference for getFolderLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
   *
   * @param id The folder or room whose external links are listed. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFolderLinks(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
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
   * Returns the chain of folders that leads to the folder named in the path, ordered from the section root down to  the folder itself, which is the last entry. It is what a breadcrumb trail is built from, and it also tells a  client which section - a room, the personal section, the archive - a bare folder identifier belongs to. Only  the folders the caller may see are part of the chain, so a member who was given access to a folder deep inside  a room gets a shorter path than the room manager does. The caller needs read access to the folder and is  otherwise answered with 403, while a folder that does not exist is answered as not found. The call is  read-only and takes no paging parameters. To go the other way, from a folder down into its contents, call  `GET api/2.0/files/{folderId}`.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolderPath(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolderPath(folderId, Collections.emptyMap());
  }


  /**
   * Get the folder path
   * Returns the chain of folders that leads to the folder named in the path, ordered from the section root down to  the folder itself, which is the last entry. It is what a breadcrumb trail is built from, and it also tells a  client which section - a room, the personal section, the archive - a bare folder identifier belongs to. Only  the folders the caller may see are part of the chain, so a member who was given access to a folder deep inside  a room gets a shorter path than the room manager does. The caller needs read access to the folder and is  otherwise answered with 403, while a folder that does not exist is answered as not found. The call is  read-only and takes no paging parameters. To go the other way, from a folder down into its contents, call  `GET api/2.0/files/{folderId}`.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
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
   * Get the folder path (third-party storage)
   * Returns the chain of folders that leads to the folder named in the path, ordered from the section root down to  the folder itself, which is the last entry. It is what a breadcrumb trail is built from, and it also tells a  client which section - a room, the personal section, the archive - a bare folder identifier belongs to. Only  the folders the caller may see are part of the chain, so a member who was given access to a folder deep inside  a room gets a shorter path than the room manager does. The caller needs read access to the folder and is  otherwise answered with 403, while a folder that does not exist is answered as not found. The call is  read-only and takes no paging parameters. To go the other way, from a folder down into its contents, call  `GET api/2.0/files/{folderId}`.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolderPath(@javax.annotation.Nonnull String folderId) throws ApiException {
    return this.getFolderPath(folderId, Collections.emptyMap());
  }


  /**
   * Get the folder path (third-party storage)
   * Returns the chain of folders that leads to the folder named in the path, ordered from the section root down to  the folder itself, which is the last entry. It is what a breadcrumb trail is built from, and it also tells a  client which section - a room, the personal section, the archive - a bare folder identifier belongs to. Only  the folders the caller may see are part of the chain, so a member who was given access to a folder deep inside  a room gets a shorter path than the room manager does. The caller needs read access to the folder and is  otherwise answered with 403, while a folder that does not exist is answered as not found. The call is  read-only and takes no paging parameters. To go the other way, from a folder down into its contents, call  `GET api/2.0/files/{folderId}`.
   *
   * REST API Reference for getFolderPath Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolderPath(@javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
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
   * Get the folder primary external link
   * Answers with the primary external link of a folder or a room - the one the Copy link action of a client  hands out - with its address in `sharedTo.shareLink`, its rights in `access`, and its title, expiration date,  password flag and download restriction beside them. The link is created on the first read if the folder has  none, with read rights, no password and no expiry, so this operation mutates on that first call and is a plain  read afterwards; repeated calls answer with the same link identifier. The caller needs the right to manage the  links of the room the folder belongs to, which its manager and a portal administrator acting as room manager  have; a member with read access alone is refused with 403 and an anonymous caller is rejected, while a link  that was deliberately revoked is answered with 404 rather than being recreated. The paging parameters are  accepted for compatibility and leave the single link answered here unchanged. Every external link of the same  folder is listed by `GET api/2.0/files/folder/{id}/links`.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. (required)
   * @param count How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. (optional)
   * @param startIndex How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. (optional)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderPrimaryExternalLink(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get the folder primary external link
   * Answers with the primary external link of a folder or a room - the one the Copy link action of a client  hands out - with its address in `sharedTo.shareLink`, its rights in `access`, and its title, expiration date,  password flag and download restriction beside them. The link is created on the first read if the folder has  none, with read rights, no password and no expiry, so this operation mutates on that first call and is a plain  read afterwards; repeated calls answer with the same link identifier. The caller needs the right to manage the  links of the room the folder belongs to, which its manager and a portal administrator acting as room manager  have; a member with read access alone is refused with 403 and an anonymous caller is rejected, while a link  that was deliberately revoked is answered with 404 rather than being recreated. The paging parameters are  accepted for compatibility and leave the single link answered here unchanged. Every external link of the same  folder is listed by `GET api/2.0/files/folder/{id}/links`.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. (required)
   * @param count How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. (optional)
   * @param startIndex How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. (optional)
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Get the folder primary external link (third-party storage)
   * Answers with the primary external link of a folder or a room - the one the Copy link action of a client  hands out - with its address in `sharedTo.shareLink`, its rights in `access`, and its title, expiration date,  password flag and download restriction beside them. The link is created on the first read if the folder has  none, with read rights, no password and no expiry, so this operation mutates on that first call and is a plain  read afterwards; repeated calls answer with the same link identifier. The caller needs the right to manage the  links of the room the folder belongs to, which its manager and a portal administrator acting as room manager  have; a member with read access alone is refused with 403 and an anonymous caller is rejected, while a link  that was deliberately revoked is answered with 404 rather than being recreated. The paging parameters are  accepted for compatibility and leave the single link answered here unchanged. Every external link of the same  folder is listed by `GET api/2.0/files/folder/{id}/links`.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. (required)
   * @param count How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. (optional)
   * @param startIndex How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. (optional)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFolderPrimaryExternalLink(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get the folder primary external link (third-party storage)
   * Answers with the primary external link of a folder or a room - the one the Copy link action of a client  hands out - with its address in `sharedTo.shareLink`, its rights in `access`, and its title, expiration date,  password flag and download restriction beside them. The link is created on the first read if the folder has  none, with read rights, no password and no expiry, so this operation mutates on that first call and is a plain  read afterwards; repeated calls answer with the same link identifier. The caller needs the right to manage the  links of the room the folder belongs to, which its manager and a portal administrator acting as room manager  have; a member with read access alone is refused with 403 and an anonymous caller is rejected, while a link  that was deliberately revoked is answered with 404 rather than being recreated. The paging parameters are  accepted for compatibility and leave the single link answered here unchanged. Every external link of the same  folder is listed by `GET api/2.0/files/folder/{id}/links`.
   *
   * REST API Reference for getFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
   *
   * @param id The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. (required)
   * @param count How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. (optional)
   * @param startIndex How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
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

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

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
   * Lists the folders that sit directly inside the folder named in the path, ordered by title, without their own  contents and without the files that lie beside them. The whole list arrives at once - there are no paging or  filtering parameters here - so for a large folder, or when the files are wanted as well, use  `GET api/2.0/files/{folderId}`, which pages and filters. A folder that holds no subfolders answers with an  empty list. The caller needs read access to the folder, and only the subfolders they may see are listed, so a  member of a room can get fewer entries than its manager; a caller without access is answered with 403, and a  folder that does not exist, or one that has been deleted for good, is answered as not found. The call is  read-only and leaves the new-item marks of the folder alone.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolders(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolders(folderId, Collections.emptyMap());
  }


  /**
   * Get subfolders
   * Lists the folders that sit directly inside the folder named in the path, ordered by title, without their own  contents and without the files that lie beside them. The whole list arrives at once - there are no paging or  filtering parameters here - so for a large folder, or when the files are wanted as well, use  `GET api/2.0/files/{folderId}`, which pages and filters. A folder that holds no subfolders answers with an  empty list. The caller needs read access to the folder, and only the subfolders they may see are listed, so a  member of a room can get fewer entries than its manager; a caller without access is answered with 403, and a  folder that does not exist, or one that has been deleted for good, is answered as not found. The call is  read-only and leaves the new-item marks of the folder alone.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
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
   * Get subfolders (third-party storage)
   * Lists the folders that sit directly inside the folder named in the path, ordered by title, without their own  contents and without the files that lie beside them. The whole list arrives at once - there are no paging or  filtering parameters here - so for a large folder, or when the files are wanted as well, use  `GET api/2.0/files/{folderId}`, which pages and filters. A folder that holds no subfolders answers with an  empty list. The caller needs read access to the folder, and only the subfolders they may see are listed, so a  member of a room can get fewer entries than its manager; a caller without access is answered with 403, and a  folder that does not exist, or one that has been deleted for good, is answered as not found. The call is  read-only and leaves the new-item marks of the folder alone.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolders(@javax.annotation.Nonnull String folderId) throws ApiException {
    return this.getFolders(folderId, Collections.emptyMap());
  }


  /**
   * Get subfolders (third-party storage)
   * Lists the folders that sit directly inside the folder named in the path, ordered by title, without their own  contents and without the files that lie beside them. The whole list arrives at once - there are no paging or  filtering parameters here - so for a large folder, or when the files are wanted as well, use  `GET api/2.0/files/{folderId}`, which pages and filters. A folder that holds no subfolders answers with an  empty list. The caller needs read access to the folder, and only the subfolders they may see are listed, so a  member of a room can get fewer entries than its manager; a caller without access is answered with 403, and a  folder that does not exist, or one that has been deleted for good, is answered as not found. The call is  read-only and leaves the new-item marks of the folder alone.
   *
   * REST API Reference for getFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getFolders(@javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
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
   * Get the Forms section
   * Returns the Forms section: the flat list of form-filling rooms the caller may read. Such rooms are stored  under the Rooms tree but are surfaced only here, so `GET api/2.0/files/rooms` leaves them out of the active  area and lists them when `searchArea` names the forms area instead. The section is not expanded into room  content, so `folders` carries the rooms while `files` comes back empty; to read what is inside one of them,  call `GET api/2.0/files/{folderId}` with the room identifier. Nothing is modified, though passing `sortBy`  saves the requested order as the default order for this account. `filterType`, `filterValue`,  `userIdOrGroupId` and the sorting parameters narrow and order the room list, `count` and `startIndex` page  through it, `total` reports how many rooms match the request in full, and `current` describes the section  folder itself.
   *
   * REST API Reference for getFormsFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-forms-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the section unfiltered. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFormsFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getFormsFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Forms section
   * Returns the Forms section: the flat list of form-filling rooms the caller may read. Such rooms are stored  under the Rooms tree but are surfaced only here, so `GET api/2.0/files/rooms` leaves them out of the active  area and lists them when `searchArea` names the forms area instead. The section is not expanded into room  content, so `folders` carries the rooms while `files` comes back empty; to read what is inside one of them,  call `GET api/2.0/files/{folderId}` with the room identifier. Nothing is modified, though passing `sortBy`  saves the requested order as the default order for this account. `filterType`, `filterValue`,  `userIdOrGroupId` and the sorting parameters narrow and order the room list, `count` and `startIndex` page  through it, `total` reports how many rooms match the request in full, and `current` describes the section  folder itself.
   *
   * REST API Reference for getFormsFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-forms-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by: it is matched as a substring of entry titles and, for files,  against the indexed document content as well. Omit it to list the section unfiltered. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getFormsFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@forms";

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

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Returns the contents of the caller's My documents section, the personal storage that belongs to this account  alone and stays invisible to other members until something in it is shared explicitly. Any authenticated  member that has a personal section can read it; guest accounts are not given one, and the call then answers  404. Nothing in the section is modified, though passing `sortBy` saves the requested order as the default  order for this account. Without a filter only the top level of the section is listed; as soon as `filterType`,  `userIdOrGroupId` or `filterValue` narrows the request, the search descends through the whole subtree.  `filterValue` is matched against titles and against indexed document content, and the index is written  asynchronously, so a file uploaded a moment ago can be missing from a search for a short while. `folders` and  `files` hold one page of the result, `total` counts everything that matches before `count` and `startIndex`  are applied, and `current` describes the section folder. To open a folder inside the section, call  `GET api/2.0/files/{folderId}` with its identifier.
   *
   * REST API Reference for getMyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by, matched as a substring of entry titles. Omit it to list the  section unfiltered. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getMyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the My documents section
   * Returns the contents of the caller's My documents section, the personal storage that belongs to this account  alone and stays invisible to other members until something in it is shared explicitly. Any authenticated  member that has a personal section can read it; guest accounts are not given one, and the call then answers  404. Nothing in the section is modified, though passing `sortBy` saves the requested order as the default  order for this account. Without a filter only the top level of the section is listed; as soon as `filterType`,  `userIdOrGroupId` or `filterValue` narrows the request, the search descends through the whole subtree.  `filterValue` is matched against titles and against indexed document content, and the index is written  asynchronously, so a file uploaded a moment ago can be missing from a search for a short while. `folders` and  `files` hold one page of the result, `total` counts everything that matches before `count` and `startIndex`  are applied, and `current` describes the section folder. To open a folder inside the section, call  `GET api/2.0/files/{folderId}` with its identifier.
   *
   * REST API Reference for getMyFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by, matched as a substring of entry titles. Omit it to list the  section unfiltered. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getMyFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Lists the entries of a folder that are new for the calling member - the files and folders created or changed  there since they last opened it - ordered from the most recently changed backwards. It is what the badge of a  room is filled from, and it is personal: two members of the same room get different answers. Reading this list  does not clear the marks, so the same entries come back until the folder itself is opened with  `GET api/2.0/files/{folderId}`, which does clear them. A folder with nothing new answers with an empty list,  and marks disappear on their own when the entry behind them is deleted or moved out of reach. The caller needs  read access to the folder and is otherwise answered with 403. The whole list arrives at once, without paging  or filtering, and the call is read-only.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getNewFolderItems(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getNewFolderItems(folderId, Collections.emptyMap());
  }


  /**
   * Get new folder items
   * Lists the entries of a folder that are new for the calling member - the files and folders created or changed  there since they last opened it - ordered from the most recently changed backwards. It is what the badge of a  room is filled from, and it is personal: two members of the same room get different answers. Reading this list  does not clear the marks, so the same entries come back until the folder itself is opened with  `GET api/2.0/files/{folderId}`, which does clear them. A folder with nothing new answers with an empty list,  and marks disappear on their own when the entry behind them is deleted or moved out of reach. The caller needs  read access to the folder and is otherwise answered with 403. The whole list arrives at once, without paging  or filtering, and the call is read-only.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
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
   * Get new folder items (third-party storage)
   * Lists the entries of a folder that are new for the calling member - the files and folders created or changed  there since they last opened it - ordered from the most recently changed backwards. It is what the badge of a  room is filled from, and it is personal: two members of the same room get different answers. Reading this list  does not clear the marks, so the same entries come back until the folder itself is opened with  `GET api/2.0/files/{folderId}`, which does clear them. A folder with nothing new answers with an empty list,  and marks disappear on their own when the entry behind them is deleted or moved out of reach. The caller needs  read access to the folder and is otherwise answered with 403. The whole list arrives at once, without paging  or filtering, and the call is read-only.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getNewFolderItems(@javax.annotation.Nonnull String folderId) throws ApiException {
    return this.getNewFolderItems(folderId, Collections.emptyMap());
  }


  /**
   * Get new folder items (third-party storage)
   * Lists the entries of a folder that are new for the calling member - the files and folders created or changed  there since they last opened it - ordered from the most recently changed backwards. It is what the badge of a  room is filled from, and it is personal: two members of the same room get different answers. Reading this list  does not clear the marks, so the same entries come back until the folder itself is opened with  `GET api/2.0/files/{folderId}`, which does clear them. A folder with nothing new answers with an empty list,  and marks disappear on their own when the entry behind them is deleted or moved out of reach. The caller needs  read access to the folder and is otherwise answered with 403. The whole list arrives at once, without paging  or filtering, and the call is read-only.
   *
   * REST API Reference for getNewFolderItems Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseArrayWrapper getNewFolderItems(@javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
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
   * Get the Recent section
   * Returns the Recent section: the files the calling account has opened lately. The section holds files only,  so `folders` comes back empty, and it is personal, so another member's history is not visible here. A file is  added when it is opened and can also be added explicitly with `POST api/2.0/files/file/{fileId}/recent`;  `DELETE api/2.0/files/recent` clears the whole history, and `PUT api/2.0/files/displayrecent` switches the  section on and off for the account, which also decides whether `GET api/2.0/files/@root` includes it. Nothing  in the section is modified, though passing `sortBy` saves the requested order as the default order for this  account. The listing is ordered by the moment the caller last opened each file, newest first, and `sortBy` and  `sortOrder` do not change that order. `files` holds one page, `total` counts the files matching the request  before `count` and `startIndex` are applied, and `current` describes the section folder itself.
   *
   * REST API Reference for getRecentFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the files authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list the whole history. (optional)
   * @param filterType Narrows the listing to a single kind of file, such as documents, spreadsheets or images. Omit it to list every  kind the history holds. (optional)
   * @param excludeSubject Inverts `userIdOrGroupId`: with `true` the files of that member or group are the ones left out of the listing  instead of the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of a listing `filterType` and `filterValue` are applied to. The Recent section holds  files only, so the value does not change what comes back. (optional)
   * @param searchArea The area a listing is taken from. The Recent section is assembled from the caller's own open history rather  than from an area, so the value does not change which files are returned. (optional)
   * @param extension The file extensions the listing is limited to, matched against the end of the file name. The leading dot is  optional, and the parameter is repeated once per extension. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. The Recent section keeps its own newest-first order, so the value does not  reorder this listing. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. The Recent section keeps its own newest-first order, so the value does not reorder this  listing. (optional)
   * @param filterValue The search string the history is filtered by: it is matched as a substring of file titles and against the  indexed document content as well. Omit it to list the whole history. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getRecentFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable List<String> extension, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Recent section
   * Returns the Recent section: the files the calling account has opened lately. The section holds files only,  so `folders` comes back empty, and it is personal, so another member's history is not visible here. A file is  added when it is opened and can also be added explicitly with `POST api/2.0/files/file/{fileId}/recent`;  `DELETE api/2.0/files/recent` clears the whole history, and `PUT api/2.0/files/displayrecent` switches the  section on and off for the account, which also decides whether `GET api/2.0/files/@root` includes it. Nothing  in the section is modified, though passing `sortBy` saves the requested order as the default order for this  account. The listing is ordered by the moment the caller last opened each file, newest first, and `sortBy` and  `sortOrder` do not change that order. `files` holds one page, `total` counts the files matching the request  before `count` and `startIndex` are applied, and `current` describes the section folder itself.
   *
   * REST API Reference for getRecentFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the files authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list the whole history. (optional)
   * @param filterType Narrows the listing to a single kind of file, such as documents, spreadsheets or images. Omit it to list every  kind the history holds. (optional)
   * @param excludeSubject Inverts `userIdOrGroupId`: with `true` the files of that member or group are the ones left out of the listing  instead of the only ones kept. (optional)
   * @param applyFilterOption Chooses which half of a listing `filterType` and `filterValue` are applied to. The Recent section holds  files only, so the value does not change what comes back. (optional)
   * @param searchArea The area a listing is taken from. The Recent section is assembled from the caller's own open history rather  than from an area, so the value does not change which files are returned. (optional)
   * @param extension The file extensions the listing is limited to, matched against the end of the file name. The leading dot is  optional, and the parameter is repeated once per extension. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. The Recent section keeps its own newest-first order, so the value does not  reorder this listing. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. The Recent section keeps its own newest-first order, so the value does not reorder this  listing. (optional)
   * @param filterValue The search string the history is filtered by: it is matched as a substring of file titles and against the  indexed document content as well. Omit it to list the whole history. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getRecentFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean excludeSubject, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable SearchArea searchArea, @javax.annotation.Nullable List<String> extension, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
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
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "extension", extension));
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

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Get the folder history report generation status
   * Reports how far the history report of a folder has got, and is the operation to poll after  `POST api/2.0/files/folder/{folderId}/log/report` has queued one. `percentage` climbs to 100, `isCompleted`  turns true when the job is over however it ended, `error` carries the reason when it failed, and  `resultFileId`, `resultFileName` and `resultFileUrl` name the file that was saved in the caller's My  documents - a CSV report leaving the identifier empty. An empty answer means there is no report for this  folder and caller, either because none was started or because a finished one has already been picked up by an  earlier poll. The caller needs read access to the folder and may not be a guest, and the portal plan has to  include the audit feature; a caller who fails the access rule is answered with 403 and a folder that does not  exist with 404. The call is read-only, and each caller sees only their own report.
   *
   * REST API Reference for getReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-report-folder-history/
   *
   * @param folderId The folder whose history report is being polled. It is the folder that was              passed to the operation that started the report. (required)
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getReportFolderHistory(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getReportFolderHistory(folderId, Collections.emptyMap());
  }


  /**
   * Get the folder history report generation status
   * Reports how far the history report of a folder has got, and is the operation to poll after  `POST api/2.0/files/folder/{folderId}/log/report` has queued one. `percentage` climbs to 100, `isCompleted`  turns true when the job is over however it ended, `error` carries the reason when it failed, and  `resultFileId`, `resultFileName` and `resultFileUrl` name the file that was saved in the caller's My  documents - a CSV report leaving the identifier empty. An empty answer means there is no report for this  folder and caller, either because none was started or because a finished one has already been picked up by an  earlier poll. The caller needs read access to the folder and may not be a guest, and the portal plan has to  include the audit feature; a caller who fails the access rule is answered with 403 and a folder that does not  exist with 404. The call is read-only, and each caller sees only their own report.
   *
   * REST API Reference for getReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-report-folder-history/
   *
   * @param folderId The folder whose history report is being polled. It is the folder that was              passed to the operation that started the report. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocumentBuilderTaskWrapper
   * @throws ApiException if fails to make API call
   */
  public DocumentBuilderTaskWrapper getReportFolderHistory(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getReportFolderHistory");
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

    TypeReference<DocumentBuilderTaskWrapper> localVarReturnType = new TypeReference<DocumentBuilderTaskWrapper>() {};
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
   * Returns every top-level section the calling account can see in one response, each of them a full section  object carrying its own first page of content: Favorites, Recent, Shared with me, My documents,  Trash, Rooms, Forms, Archive and, while AI access is enabled for the portal, AI agents. A section is  left out when the account has none of it, which is why a guest gets no personal section, and Recent is  listed only while it is switched on with `PUT api/2.0/files/displayrecent`. Pass `withoutTrash=true` to drop  the Trash section. The filters, `count` and `startIndex` are applied to each section separately, so  `count=1` returns one entry per section and every section reports its own `total`. Because it builds the  content of all of them, this is the most expensive listing in the module: when a single section is enough,  read it directly, for example with `GET api/2.0/files/@my`. The call modifies nothing in the sections and  leaves their new-item badges untouched, though passing `sortBy` saves the requested order as the default order  for this account.
   *
   * REST API Reference for getRootFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the content listed inside every returned section to a single kind of entry, such as documents, images  or one type of room. Omit it to list every kind the sections hold. (optional)
   * @param withoutTrash Set it to `true` to leave the Trash section out of the returned set of sections; with `false`, or when the  parameter is omitted, the section is returned whenever the account has one of its own. (optional)
   * @param count The size of the content page returned for each section separately, so a value of 1 yields one entry per  section rather than one entry in total. (optional)
   * @param startIndex The number of matching entries skipped in each section before its page begins; add `count` to it to ask for  the next page of every section. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the content of every section is filtered by: it is matched as a substring of entry titles  and, for files, against the indexed document content as well. Omit it to list the sections unfiltered. (optional)
   * @return FolderContentArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentArrayWrapper getRootFolders(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean withoutTrash, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get filtered sections
   * Returns every top-level section the calling account can see in one response, each of them a full section  object carrying its own first page of content: Favorites, Recent, Shared with me, My documents,  Trash, Rooms, Forms, Archive and, while AI access is enabled for the portal, AI agents. A section is  left out when the account has none of it, which is why a guest gets no personal section, and Recent is  listed only while it is switched on with `PUT api/2.0/files/displayrecent`. Pass `withoutTrash=true` to drop  the Trash section. The filters, `count` and `startIndex` are applied to each section separately, so  `count=1` returns one entry per section and every section reports its own `total`. Because it builds the  content of all of them, this is the most expensive listing in the module: when a single section is enough,  read it directly, for example with `GET api/2.0/files/@my`. The call modifies nothing in the sections and  leaves their new-item badges untouched, though passing `sortBy` saves the requested order as the default order  for this account.
   *
   * REST API Reference for getRootFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the content listed inside every returned section to a single kind of entry, such as documents, images  or one type of room. Omit it to list every kind the sections hold. (optional)
   * @param withoutTrash Set it to `true` to leave the Trash section out of the returned set of sections; with `false`, or when the  parameter is omitted, the section is returned whenever the account has one of its own. (optional)
   * @param count The size of the content page returned for each section separately, so a value of 1 yields one entry per  section rather than one entry in total. (optional)
   * @param startIndex The number of matching entries skipped in each section before its page begins; add `count` to it to ask for  the next page of every section. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the content of every section is filtered by: it is matched as a substring of entry titles  and, for files, against the indexed document content as well. Omit it to list the sections unfiltered. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentArrayWrapper getRootFolders(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable Boolean withoutTrash, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderContentArrayWrapper> localVarReturnType = new TypeReference<FolderContentArrayWrapper>() {};
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
   * Returns the caller's Trash section: the files and folders this account has deleted, kept there until they  are restored or discarded. Each member has a Trash of their own and sees only what they deleted themselves.  Restore an entry by moving it back with `PUT api/2.0/files/fileops/move`, or discard the whole section with  `PUT api/2.0/files/fileops/emptytrash`; both start a background operation that is polled through  `GET api/2.0/files/fileops`. This call itself modifies nothing, though passing `sortBy` saves the requested  order as the default order for this account. Only the top level of the section is listed, so the contents of a  deleted folder are not expanded into it, and `filterValue` is matched against titles alone here rather than  against document content. `folders` and `files` hold one page of the result, `total` counts everything that  matches before `count` and `startIndex` are applied, and `current` describes the section folder. An account  that is given no Trash of its own, an outsider for instance, receives 404.
   *
   * REST API Reference for getTrashFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by, matched as a substring of entry titles. Omit it to list the  section unfiltered. (optional)
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getTrashFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue) throws ApiException {
    return this.getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue, Collections.emptyMap());
  }


  /**
   * Get the Trash section
   * Returns the caller's Trash section: the files and folders this account has deleted, kept there until they  are restored or discarded. Each member has a Trash of their own and sees only what they deleted themselves.  Restore an entry by moving it back with `PUT api/2.0/files/fileops/move`, or discard the whole section with  `PUT api/2.0/files/fileops/emptytrash`; both start a background operation that is polled through  `GET api/2.0/files/fileops`. This call itself modifies nothing, though passing `sortBy` saves the requested  order as the default order for this account. Only the top level of the section is listed, so the contents of a  deleted folder are not expanded into it, and `filterValue` is matched against titles alone here rather than  against document content. `folders` and `files` hold one page of the result, `total` counts everything that  matches before `count` and `startIndex` are applied, and `current` describes the section folder. An account  that is given no Trash of its own, an outsider for instance, receives 404.
   *
   * REST API Reference for getTrashFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/
   *
   * @param userIdOrGroupId Restricts the listing to the entries authored by this portal member, or by the members of this group; the same  parameter accepts either kind of identifier. Omit it to list everything the caller can read. (optional)
   * @param filterType Narrows the listing to a single kind of entry, such as documents, images or one type of room. Omit it to list  every kind the section holds. (optional)
   * @param applyFilterOption Chooses which half of the listing `filterType` and `filterValue` are applied to: with `Files` the folders come  back unfiltered, with `Folders` the files do, and with `All` both halves are filtered. (optional)
   * @param count The size of one page of section content. Pair it with `startIndex` to walk the listing, and compare the two  with `total` in the response to see when the last page has been read. (optional)
   * @param startIndex The number of matching entries to skip before the returned page begins; add `count` to it to ask for the next  page. (optional)
   * @param sortBy The name of the field the entries are ordered by, matched case-insensitively against the file sort fields:  `DateAndTime`, `AZ`, `Size`, `Author`, `Type`, `New`, `DateAndTimeCreation`, `RoomType`, `Tags`, `Room`,  `CustomOrder`, `LastOpened` and `UsedSpace`. A recognized value is also saved as the default order of the  account and reused by later listings that omit the parameter, while a value matching none of the fields leaves  that saved order in place. (optional)
   * @param sortOrder The direction in which the `sortBy` field is ordered. It is saved together with `sortBy` as the default order  of the account. (optional)
   * @param filterValue The search string the section is filtered by, matched as a substring of entry titles. Omit it to list the  section unfiltered. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderContentWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderContentWrapper getTrashFolder(@javax.annotation.Nullable UUID userIdOrGroupId, @javax.annotation.Nullable FilterType filterType, @javax.annotation.Nullable ApplyFilterOption applyFilterOption, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable String sortBy, @javax.annotation.Nullable SortOrder sortOrder, @javax.annotation.Nullable String filterValue, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderContentWrapper> localVarReturnType = new TypeReference<FolderContentWrapper>() {};
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
   * Stores a file in the folder named by the path in a single request, taking its name from `title` rather than  from the uploaded part, which is what separates it from `POST api/2.0/files/{folderId}/upload`. The content  may arrive either as a multipart part or as the raw request body. The name is stripped of characters a title  cannot hold and truncated, and `createNewIfExist` settles the clash: false adds a new version to the file that  already carries the name, true keeps both by giving the new one a numeric suffix. The caller needs the right  to add content to the folder, so a reader, an editor and a guest get 403, a section root and an archived room  are refused as well, and an unknown folder gives 404. Formats the portal converts are converted afterwards in  the background; pass `keepConvertStatus` to keep the outcome readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. The answer is the stored file. A large payload belongs in a  chunked session instead.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param insertFileFile The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param insertFileTitle The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param insertFileCreateNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param insertFileKeepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper insertFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout) throws ApiException {
    return this.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout, Collections.emptyMap());
  }


  /**
   * Insert a file
   * Stores a file in the folder named by the path in a single request, taking its name from `title` rather than  from the uploaded part, which is what separates it from `POST api/2.0/files/{folderId}/upload`. The content  may arrive either as a multipart part or as the raw request body. The name is stripped of characters a title  cannot hold and truncated, and `createNewIfExist` settles the clash: false adds a new version to the file that  already carries the name, true keeps both by giving the new one a numeric suffix. The caller needs the right  to add content to the folder, so a reader, an editor and a guest get 403, a section root and an archived room  are refused as well, and an unknown folder gives 404. Formats the portal converts are converted afterwards in  the background; pass `keepConvertStatus` to keep the outcome readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. The answer is the stored file. A large payload belongs in a  chunked session instead.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param insertFileFile The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param insertFileTitle The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param insertFileCreateNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param insertFileKeepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper insertFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout, Map<String, String> additionalHeaders) throws ApiException {
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
   * Insert a file (third-party storage)
   * Stores a file in the folder named by the path in a single request, taking its name from `title` rather than  from the uploaded part, which is what separates it from `POST api/2.0/files/{folderId}/upload`. The content  may arrive either as a multipart part or as the raw request body. The name is stripped of characters a title  cannot hold and truncated, and `createNewIfExist` settles the clash: false adds a new version to the file that  already carries the name, true keeps both by giving the new one a numeric suffix. The caller needs the right  to add content to the folder, so a reader, an editor and a guest get 403, a section root and an archived room  are refused as well, and an unknown folder gives 404. Formats the portal converts are converted afterwards in  the background; pass `keepConvertStatus` to keep the outcome readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. The answer is the stored file. A large payload belongs in a  chunked session instead.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param insertFileFile The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param insertFileTitle The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param insertFileCreateNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param insertFileKeepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @return ThirdPartyFileWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFileWrapper insertFile(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout) throws ApiException {
    return this.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout, Collections.emptyMap());
  }


  /**
   * Insert a file (third-party storage)
   * Stores a file in the folder named by the path in a single request, taking its name from `title` rather than  from the uploaded part, which is what separates it from `POST api/2.0/files/{folderId}/upload`. The content  may arrive either as a multipart part or as the raw request body. The name is stripped of characters a title  cannot hold and truncated, and `createNewIfExist` settles the clash: false adds a new version to the file that  already carries the name, true keeps both by giving the new one a numeric suffix. The caller needs the right  to add content to the folder, so a reader, an editor and a guest get 403, a section root and an archived room  are refused as well, and an unknown folder gives 404. Formats the portal converts are converted afterwards in  the background; pass `keepConvertStatus` to keep the outcome readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. The answer is the stored file. A large payload belongs in a  chunked session instead.
   *
   * REST API Reference for insertFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param insertFileFile The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param insertFileTitle The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param insertFileCreateNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param insertFileKeepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param insertFileStreamCanRead  (optional)
   * @param insertFileStreamCanWrite  (optional)
   * @param insertFileStreamCanSeek  (optional)
   * @param insertFileStreamCanTimeout  (optional)
   * @param insertFileStreamLength  (optional)
   * @param insertFileStreamPosition  (optional)
   * @param insertFileStreamReadTimeout  (optional)
   * @param insertFileStreamWriteTimeout  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFileWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFileWrapper insertFile(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable File insertFileFile, @javax.annotation.Nullable String insertFileTitle, @javax.annotation.Nullable Boolean insertFileCreateNewIfExist, @javax.annotation.Nullable Boolean insertFileKeepConvertStatus, @javax.annotation.Nullable Boolean insertFileStreamCanRead, @javax.annotation.Nullable Boolean insertFileStreamCanWrite, @javax.annotation.Nullable Boolean insertFileStreamCanSeek, @javax.annotation.Nullable Boolean insertFileStreamCanTimeout, @javax.annotation.Nullable Long insertFileStreamLength, @javax.annotation.Nullable Long insertFileStreamPosition, @javax.annotation.Nullable Integer insertFileStreamReadTimeout, @javax.annotation.Nullable Integer insertFileStreamWriteTimeout, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyFileWrapper> localVarReturnType = new TypeReference<ThirdPartyFileWrapper>() {};
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
   * Insert a file into My documents
   * Stores one file in the caller's own My documents section, the personal storage every portal member has, and  returns the stored file. The destination takes no identifier: it is resolved from the calling account and  created on first use, while a guest account has none and is answered as missing (404). Send the content as a  `multipart/form-data` part or as the raw request body, and name it with `title`, which wins over the name of  the uploaded part and has invalid characters replaced before storing. The call is not idempotent: by default a  file of the same title is overwritten as a new version, while `createNewIfExist=true` stores a separate copy  under a title made unique with a numeric suffix; a title held by a file that is locked or open in the editor  cannot be overwritten either, and a second file appears under the same title. Formats listed in  `extsMustConvert` of `GET api/2.0/files/settings` are converted after the response is sent;  `keepConvertStatus=true` keeps that result readable through `GET api/2.0/files/file/{fileId}/checkconversion`,  which otherwise drops it. Files over the single-request size limit or the account's storage quota are refused:  send those through `POST api/2.0/files/{folderId}/upload/create_session`, and use  `POST api/2.0/files/{folderId}/insert` for any other destination.
   *
   * REST API Reference for insertFileToMyFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/
   *
   * @param _file The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param title The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param streamCanRead  (optional)
   * @param streamCanWrite  (optional)
   * @param streamCanSeek  (optional)
   * @param streamCanTimeout  (optional)
   * @param streamLength  (optional)
   * @param streamPosition  (optional)
   * @param streamReadTimeout  (optional)
   * @param streamWriteTimeout  (optional)
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper insertFileToMyFromBody(@javax.annotation.Nullable File _file, @javax.annotation.Nullable String title, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable Boolean streamCanRead, @javax.annotation.Nullable Boolean streamCanWrite, @javax.annotation.Nullable Boolean streamCanSeek, @javax.annotation.Nullable Boolean streamCanTimeout, @javax.annotation.Nullable Long streamLength, @javax.annotation.Nullable Long streamPosition, @javax.annotation.Nullable Integer streamReadTimeout, @javax.annotation.Nullable Integer streamWriteTimeout) throws ApiException {
    return this.insertFileToMyFromBody(_file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout, Collections.emptyMap());
  }


  /**
   * Insert a file into My documents
   * Stores one file in the caller's own My documents section, the personal storage every portal member has, and  returns the stored file. The destination takes no identifier: it is resolved from the calling account and  created on first use, while a guest account has none and is answered as missing (404). Send the content as a  `multipart/form-data` part or as the raw request body, and name it with `title`, which wins over the name of  the uploaded part and has invalid characters replaced before storing. The call is not idempotent: by default a  file of the same title is overwritten as a new version, while `createNewIfExist=true` stores a separate copy  under a title made unique with a numeric suffix; a title held by a file that is locked or open in the editor  cannot be overwritten either, and a second file appears under the same title. Formats listed in  `extsMustConvert` of `GET api/2.0/files/settings` are converted after the response is sent;  `keepConvertStatus=true` keeps that result readable through `GET api/2.0/files/file/{fileId}/checkconversion`,  which otherwise drops it. Files over the single-request size limit or the account's storage quota are refused:  send those through `POST api/2.0/files/{folderId}/upload/create_session`, and use  `POST api/2.0/files/{folderId}/insert` for any other destination.
   *
   * REST API Reference for insertFileToMyFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/
   *
   * @param _file The content to store, sent as a `multipart/form-data` part. The same content may instead be sent as the raw  request body, which is what a client that cannot build a form does; when both are present the form part wins. (optional)
   * @param title The name to store the file under, extension included. It wins over the name of the uploaded part, which is the  reason to choose this operation over the plain upload, and it is the only name available when the content  arrives as a raw body. Characters a title cannot hold are replaced with underscores and the name is cut to 170  characters before the file is stored. (optional)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param streamCanRead  (optional)
   * @param streamCanWrite  (optional)
   * @param streamCanSeek  (optional)
   * @param streamCanTimeout  (optional)
   * @param streamLength  (optional)
   * @param streamPosition  (optional)
   * @param streamReadTimeout  (optional)
   * @param streamWriteTimeout  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileWrapper
   * @throws ApiException if fails to make API call
   */
  public FileWrapper insertFileToMyFromBody(@javax.annotation.Nullable File _file, @javax.annotation.Nullable String title, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable Boolean streamCanRead, @javax.annotation.Nullable Boolean streamCanWrite, @javax.annotation.Nullable Boolean streamCanSeek, @javax.annotation.Nullable Boolean streamCanTimeout, @javax.annotation.Nullable Long streamLength, @javax.annotation.Nullable Long streamPosition, @javax.annotation.Nullable Integer streamReadTimeout, @javax.annotation.Nullable Integer streamWriteTimeout, Map<String, String> additionalHeaders) throws ApiException {
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
   * Rename a folder
   * Gives a folder a new title and answers with the folder as it now stands. The title is trimmed, may not be  blank and is refused when it is longer than the limit the schema prints; a title that matches the current one  leaves the folder untouched, and titles need not be unique among the neighbours. The caller needs the right to  rename the folder, which the room manager, a content creator acting on a folder of their own and the owner of  a personal section have, while a guest is refused with 403 whatever their access; a folder in the Trash  section or in an archived room cannot be renamed either, and a folder that does not exist is answered as  not found. A room may be renamed here as well, in which case the caller needs the right to edit the  room, and `PUT api/2.0/files/rooms/{id}` is the operation that changes its other settings. The call is  mutating and idempotent; on a folder stored in a connected third-party account the identifier of the folder  may change with the title.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper renameFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.renameFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Rename a folder
   * Gives a folder a new title and answers with the folder as it now stands. The title is trimmed, may not be  blank and is refused when it is longer than the limit the schema prints; a title that matches the current one  leaves the folder untouched, and titles need not be unique among the neighbours. The caller needs the right to  rename the folder, which the room manager, a content creator acting on a folder of their own and the owner of  a personal section have, while a guest is refused with 403 whatever their access; a folder in the Trash  section or in an archived room cannot be renamed either, and a folder that does not exist is answered as  not found. A room may be renamed here as well, in which case the caller needs the right to edit the  room, and `PUT api/2.0/files/rooms/{id}` is the operation that changes its other settings. The call is  mutating and idempotent; on a folder stored in a connected third-party account the identifier of the folder  may change with the title.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper renameFolder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderWrapper> localVarReturnType = new TypeReference<FolderWrapper>() {};
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
   * Rename a folder (third-party storage)
   * Gives a folder a new title and answers with the folder as it now stands. The title is trimmed, may not be  blank and is refused when it is longer than the limit the schema prints; a title that matches the current one  leaves the folder untouched, and titles need not be unique among the neighbours. The caller needs the right to  rename the folder, which the room manager, a content creator acting on a folder of their own and the owner of  a personal section have, while a guest is refused with 403 whatever their access; a folder in the Trash  section or in an archived room cannot be renamed either, and a folder that does not exist is answered as  not found. A room may be renamed here as well, in which case the caller needs the right to edit the  room, and `PUT api/2.0/files/rooms/{id}` is the operation that changes its other settings. The call is  mutating and idempotent; on a folder stored in a connected third-party account the identifier of the folder  may change with the title.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper renameFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CreateFolder createFolder) throws ApiException {
    return this.renameFolder(folderId, createFolder, Collections.emptyMap());
  }


  /**
   * Rename a folder (third-party storage)
   * Gives a folder a new title and answers with the folder as it now stands. The title is trimmed, may not be  blank and is refused when it is longer than the limit the schema prints; a title that matches the current one  leaves the folder untouched, and titles need not be unique among the neighbours. The caller needs the right to  rename the folder, which the room manager, a content creator acting on a folder of their own and the owner of  a personal section have, while a guest is refused with 403 whatever their access; a folder in the Trash  section or in an archived room cannot be renamed either, and a folder that does not exist is answered as  not found. A room may be renamed here as well, in which case the caller needs the right to edit the  room, and `PUT api/2.0/files/rooms/{id}` is the operation that changes its other settings. The call is  mutating and idempotent; on a folder stored in a connected third-party account the identifier of the folder  may change with the title.
   *
   * REST API Reference for renameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
   *
   * @param folderId The folder the request is addressed to: when a folder is created it is the parent that receives the new  folder, and when a folder is renamed it is the folder that gets the new title. (required)
   * @param createFolder The title carried by the request body. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper renameFolder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nonnull CreateFolder createFolder, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyFolderWrapper> localVarReturnType = new TypeReference<ThirdPartyFolderWrapper>() {};
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
   * Puts a folder at a given position among the entries of its parent and answers with the folder, its `order`  reporting where it now stands. Positions count from 1, and the entry that held the wanted position, together  with everything after it, is shifted to make room, so the numbering of the parent stays without gaps; a  position beyond the end places the folder last. The value may also be sent as a dotted path, as in 1.2.3, in  which case only its last segment is read. Ordering is what the manual arrangement of a room is built on, and  it only means something in rooms whose contents are indexed - elsewhere the value is stored and ignored. The  caller needs edit access to the folder, which room managers and content creators have, and a member without it  is refused, while a folder that does not exist is answered as not found. The call is mutating and idempotent.  To move several entries in one go use `PUT api/2.0/files/order`.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder to move. (required)
   * @param orderRequestDto The position the folder is to take. (optional)
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper setFolderOrder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto) throws ApiException {
    return this.setFolderOrder(folderId, orderRequestDto, Collections.emptyMap());
  }


  /**
   * Set folder order
   * Puts a folder at a given position among the entries of its parent and answers with the folder, its `order`  reporting where it now stands. Positions count from 1, and the entry that held the wanted position, together  with everything after it, is shifted to make room, so the numbering of the parent stays without gaps; a  position beyond the end places the folder last. The value may also be sent as a dotted path, as in 1.2.3, in  which case only its last segment is read. Ordering is what the manual arrangement of a room is built on, and  it only means something in rooms whose contents are indexed - elsewhere the value is stored and ignored. The  caller needs edit access to the folder, which room managers and content creators have, and a member without it  is refused, while a folder that does not exist is answered as not found. The call is mutating and idempotent.  To move several entries in one go use `PUT api/2.0/files/order`.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder to move. (required)
   * @param orderRequestDto The position the folder is to take. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FolderWrapper
   * @throws ApiException if fails to make API call
   */
  public FolderWrapper setFolderOrder(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<FolderWrapper> localVarReturnType = new TypeReference<FolderWrapper>() {};
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
   * Set folder order (third-party storage)
   * Puts a folder at a given position among the entries of its parent and answers with the folder, its `order`  reporting where it now stands. Positions count from 1, and the entry that held the wanted position, together  with everything after it, is shifted to make room, so the numbering of the parent stays without gaps; a  position beyond the end places the folder last. The value may also be sent as a dotted path, as in 1.2.3, in  which case only its last segment is read. Ordering is what the manual arrangement of a room is built on, and  it only means something in rooms whose contents are indexed - elsewhere the value is stored and ignored. The  caller needs edit access to the folder, which room managers and content creators have, and a member without it  is refused, while a folder that does not exist is answered as not found. The call is mutating and idempotent.  To move several entries in one go use `PUT api/2.0/files/order`.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder to move. (required)
   * @param orderRequestDto The position the folder is to take. (optional)
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper setFolderOrder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto) throws ApiException {
    return this.setFolderOrder(folderId, orderRequestDto, Collections.emptyMap());
  }


  /**
   * Set folder order (third-party storage)
   * Puts a folder at a given position among the entries of its parent and answers with the folder, its `order`  reporting where it now stands. Positions count from 1, and the entry that held the wanted position, together  with everything after it, is shifted to make room, so the numbering of the parent stays without gaps; a  position beyond the end places the folder last. The value may also be sent as a dotted path, as in 1.2.3, in  which case only its last segment is read. Ordering is what the manual arrangement of a room is built on, and  it only means something in rooms whose contents are indexed - elsewhere the value is stored and ignored. The  caller needs edit access to the folder, which room managers and content creators have, and a member without it  is refused, while a folder that does not exist is answered as not found. The call is mutating and idempotent.  To move several entries in one go use `PUT api/2.0/files/order`.
   *
   * REST API Reference for setFolderOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
   *
   * @param folderId The folder to move. (required)
   * @param orderRequestDto The position the folder is to take. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFolderWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFolderWrapper setFolderOrder(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable OrderRequestDto orderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
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

    TypeReference<ThirdPartyFolderWrapper> localVarReturnType = new TypeReference<ThirdPartyFolderWrapper>() {};
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
   * Creates an external link to a folder or a room, or changes or revokes an existing one, and answers with the  link as it now stands. `linkId` decides which: an identifier that is not yet in use, the empty one included,  creates a link, while the identifier of an existing link rewrites it, so the whole set of parameters is  applied every time and a field left out is reset rather than kept. `access` carries the rights the link  grants, and `access` set to the value that denies everything revokes the link instead - the answer is then  empty, and a revoked primary link is not recreated by a later read. `title` names the link for the people who  manage it, `expirationDate` limits its lifetime and is ignored when it lies in the past, `password` asks  visitors for a secret, `denyDownload` leaves them with viewing only, `internal` admits signed-in members  alone, and `primary=true` makes it the primary link of the folder. The caller needs the right to manage the  links of the room, which its manager and a portal administrator acting as room manager have; anyone else is  refused and an unknown folder is answered as not found. The call is mutating.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFolderPrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.setFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Set the folder external link
   * Creates an external link to a folder or a room, or changes or revokes an existing one, and answers with the  link as it now stands. `linkId` decides which: an identifier that is not yet in use, the empty one included,  creates a link, while the identifier of an existing link rewrites it, so the whole set of parameters is  applied every time and a field left out is reset rather than kept. `access` carries the rights the link  grants, and `access` set to the value that denies everything revokes the link instead - the answer is then  empty, and a revoked primary link is not recreated by a later read. `title` names the link for the people who  manage it, `expirationDate` limits its lifetime and is ignored when it lies in the past, `password` asks  visitors for a secret, `denyDownload` leaves them with viewing only, `internal` admits signed-in members  alone, and `primary=true` makes it the primary link of the folder. The caller needs the right to manage the  links of the room, which its manager and a portal administrator acting as room manager have; anyone else is  refused and an unknown folder is answered as not found. The call is mutating.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
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
   * Set the folder external link (third-party storage)
   * Creates an external link to a folder or a room, or changes or revokes an existing one, and answers with the  link as it now stands. `linkId` decides which: an identifier that is not yet in use, the empty one included,  creates a link, while the identifier of an existing link rewrites it, so the whole set of parameters is  applied every time and a field left out is reset rather than kept. `access` carries the rights the link  grants, and `access` set to the value that denies everything revokes the link instead - the answer is then  empty, and a revoked primary link is not recreated by a later read. `title` names the link for the people who  manage it, `expirationDate` limits its lifetime and is ignored when it lies in the past, `password` asks  visitors for a secret, `denyDownload` leaves them with viewing only, `internal` admits signed-in members  alone, and `primary=true` makes it the primary link of the folder. The caller needs the right to manage the  links of the room, which its manager and a portal administrator acting as room manager have; anyone else is  refused and an unknown folder is answered as not found. The call is mutating.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest) throws ApiException {
    return this.setFolderPrimaryExternalLink(id, folderLinkRequest, Collections.emptyMap());
  }


  /**
   * Set the folder external link (third-party storage)
   * Creates an external link to a folder or a room, or changes or revokes an existing one, and answers with the  link as it now stands. `linkId` decides which: an identifier that is not yet in use, the empty one included,  creates a link, while the identifier of an existing link rewrites it, so the whole set of parameters is  applied every time and a field left out is reset rather than kept. `access` carries the rights the link  grants, and `access` set to the value that denies everything revokes the link instead - the answer is then  empty, and a revoked primary link is not recreated by a later read. `title` names the link for the people who  manage it, `expirationDate` limits its lifetime and is ignored when it lies in the past, `password` asks  visitors for a secret, `denyDownload` leaves them with viewing only, `internal` admits signed-in members  alone, and `primary=true` makes it the primary link of the folder. The caller needs the right to manage the  links of the room, which its manager and a portal administrator acting as room manager have; anyone else is  refused and an unknown folder is answered as not found. The call is mutating.
   *
   * REST API Reference for setFolderPrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
   *
   * @param id The folder or room the link belongs to. (required)
   * @param folderLinkRequest The link and the way it is to be shaped. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFolderPrimaryExternalLink(@javax.annotation.Nonnull String id, @javax.annotation.Nonnull FolderLinkRequest folderLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
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
   * Terminate the folder history report generation
   * Gives up the history report the caller has started for a folder with  `POST api/2.0/files/folder/{folderId}/log/report`. The request only asks the background worker to stop, and  the answer carries no body, so a following `GET api/2.0/files/folder/{folderId}/log/report` is what shows the  task ending as cancelled. Asking to terminate when nothing is running is accepted and changes nothing, which  makes the call safe to repeat. A report that has already finished is not undone by this call and its file  stays in My documents. The caller needs read access to the folder and may not be a guest, and the portal  plan has to include the audit feature; a caller who fails the access rule is answered with 403 and a folder  that does not exist with 404. Each caller can only terminate their own report.
   *
   * REST API Reference for terminateReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-report-folder-history/
   *
   * @param folderId The folder whose running history report is to be given up. It is the folder that              was passed to the operation that started the report. (required)
   * @throws ApiException if fails to make API call
   */
  public void terminateReportFolderHistory(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    this.terminateReportFolderHistory(folderId, Collections.emptyMap());
  }


  /**
   * Terminate the folder history report generation
   * Gives up the history report the caller has started for a folder with  `POST api/2.0/files/folder/{folderId}/log/report`. The request only asks the background worker to stop, and  the answer carries no body, so a following `GET api/2.0/files/folder/{folderId}/log/report` is what shows the  task ending as cancelled. Asking to terminate when nothing is running is accepted and changes nothing, which  makes the call safe to repeat. A report that has already finished is not undone by this call and its file  stays in My documents. The caller needs read access to the folder and may not be a guest, and the portal  plan has to include the audit feature; a caller who fails the access rule is answered with 403 and a folder  that does not exist with 404. Each caller can only terminate their own report.
   *
   * REST API Reference for terminateReportFolderHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-report-folder-history/
   *
   * @param folderId The folder whose running history report is to be given up. It is the folder that              was passed to the operation that started the report. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void terminateReportFolderHistory(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling terminateReportFolderHistory");
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
   * Upload a file
   * Stores a file in the folder named by the path in a single multipart request, taking its name from the uploaded  part; use `POST api/2.0/files/{folderId}/insert` when the name has to be given separately or the content is  sent as a raw body. The answer is a list that always holds exactly one file. `createNewIfExist` settles the  clash: false adds a new version to the file that already carries the name, true keeps both by giving the new  one a numeric suffix. `storeOriginalFile` reaches further than this call, because it saves the setting on the  calling account, the same one `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later  uploads. The caller needs the right to add content to the folder, so a reader, an editor and a guest get 403,  a section root and an archived room are refused as well, and an unknown folder gives 404. A request without a  file is rejected as invalid, and a payload above the portal upload limit is refused.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @return FileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileArrayWrapper uploadFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadFile(folderId, createNewIfExist, storeOriginalFile, keepConvertStatus, _file, Collections.emptyMap());
  }


  /**
   * Upload a file
   * Stores a file in the folder named by the path in a single multipart request, taking its name from the uploaded  part; use `POST api/2.0/files/{folderId}/insert` when the name has to be given separately or the content is  sent as a raw body. The answer is a list that always holds exactly one file. `createNewIfExist` settles the  clash: false adds a new version to the file that already carries the name, true keeps both by giving the new  one a numeric suffix. `storeOriginalFile` reaches further than this call, because it saves the setting on the  calling account, the same one `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later  uploads. The caller needs the right to add content to the folder, so a reader, an editor and a guest get 403,  a section root and an archived room are refused as well, and an unknown folder gives 404. A request without a  file is rejected as invalid, and a payload above the portal upload limit is refused.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileArrayWrapper uploadFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
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

    localVarQueryParams.addAll(apiClient.parameterToPair("createNewIfExist", createNewIfExist));
    localVarQueryParams.addAll(apiClient.parameterToPair("storeOriginalFile", storeOriginalFile));
    localVarQueryParams.addAll(apiClient.parameterToPair("keepConvertStatus", keepConvertStatus));
      
    
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

    TypeReference<FileArrayWrapper> localVarReturnType = new TypeReference<FileArrayWrapper>() {};
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
   * Upload a file (third-party storage)
   * Stores a file in the folder named by the path in a single multipart request, taking its name from the uploaded  part; use `POST api/2.0/files/{folderId}/insert` when the name has to be given separately or the content is  sent as a raw body. The answer is a list that always holds exactly one file. `createNewIfExist` settles the  clash: false adds a new version to the file that already carries the name, true keeps both by giving the new  one a numeric suffix. `storeOriginalFile` reaches further than this call, because it saves the setting on the  calling account, the same one `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later  uploads. The caller needs the right to add content to the folder, so a reader, an editor and a guest get 403,  a section root and an archived room are refused as well, and an unknown folder gives 404. A request without a  file is rejected as invalid, and a payload above the portal upload limit is refused.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @return ThirdPartyFileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFileArrayWrapper uploadFile(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadFile(folderId, createNewIfExist, storeOriginalFile, keepConvertStatus, _file, Collections.emptyMap());
  }


  /**
   * Upload a file (third-party storage)
   * Stores a file in the folder named by the path in a single multipart request, taking its name from the uploaded  part; use `POST api/2.0/files/{folderId}/insert` when the name has to be given separately or the content is  sent as a raw body. The answer is a list that always holds exactly one file. `createNewIfExist` settles the  clash: false adds a new version to the file that already carries the name, true keeps both by giving the new  one a numeric suffix. `storeOriginalFile` reaches further than this call, because it saves the setting on the  calling account, the same one `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later  uploads. The caller needs the right to add content to the folder, so a reader, an editor and a guest get 403,  a section root and an archived room are refused as well, and an unknown folder gives 404. A request without a  file is rejected as invalid, and a payload above the portal upload limit is refused.
   *
   * REST API Reference for uploadFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
   *
   * @param folderId The folder that receives the file; take the id from a listing such as `GET api/2.0/files/@root`. A room or an  ordinary folder inside one is accepted, a section root is not. (required)
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThirdPartyFileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyFileArrayWrapper uploadFile(@javax.annotation.Nonnull String folderId, @javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
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

    localVarQueryParams.addAll(apiClient.parameterToPair("createNewIfExist", createNewIfExist));
    localVarQueryParams.addAll(apiClient.parameterToPair("storeOriginalFile", storeOriginalFile));
    localVarQueryParams.addAll(apiClient.parameterToPair("keepConvertStatus", keepConvertStatus));
      
    
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

    TypeReference<ThirdPartyFileArrayWrapper> localVarReturnType = new TypeReference<ThirdPartyFileArrayWrapper>() {};
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
   * Upload a file to My documents
   * Uploads one file into the caller's own My documents section and returns it inside a single-element array; one  request stores exactly one file. The destination takes no identifier: it is resolved from the calling account  and created on first use, while a guest account has none and is answered as missing (404). The body has to be  `multipart/form-data` carrying the file part; a request without it is rejected as invalid, and the stored name  comes from that part, since unlike `POST api/2.0/files/@my/insert` there is no separate title. The call is not  idempotent: by default a file of the same title is overwritten as a new version, while `createNewIfExist=true`  stores a separate copy under a title made unique with a numeric suffix. `storeOriginalFile` is not a  per-request switch: it writes the same account setting as `PUT api/2.0/files/storeoriginal`, which decides  what happens to the formats listed in `extsMustConvert` of `GET api/2.0/files/settings` when they are  converted after the response - false replaces the uploaded file with the converted one, true keeps both;  `keepConvertStatus=true` keeps that conversion result readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. Files over the single-request size limit or the account's  storage quota are refused; send those through `POST api/2.0/files/{folderId}/upload/create_session`.
   *
   * REST API Reference for uploadFileToMy Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
   *
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @return FileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileArrayWrapper uploadFileToMy(@javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file) throws ApiException {
    return this.uploadFileToMy(createNewIfExist, storeOriginalFile, keepConvertStatus, _file, Collections.emptyMap());
  }


  /**
   * Upload a file to My documents
   * Uploads one file into the caller's own My documents section and returns it inside a single-element array; one  request stores exactly one file. The destination takes no identifier: it is resolved from the calling account  and created on first use, while a guest account has none and is answered as missing (404). The body has to be  `multipart/form-data` carrying the file part; a request without it is rejected as invalid, and the stored name  comes from that part, since unlike `POST api/2.0/files/@my/insert` there is no separate title. The call is not  idempotent: by default a file of the same title is overwritten as a new version, while `createNewIfExist=true`  stores a separate copy under a title made unique with a numeric suffix. `storeOriginalFile` is not a  per-request switch: it writes the same account setting as `PUT api/2.0/files/storeoriginal`, which decides  what happens to the formats listed in `extsMustConvert` of `GET api/2.0/files/settings` when they are  converted after the response - false replaces the uploaded file with the converted one, true keeps both;  `keepConvertStatus=true` keeps that conversion result readable through  `GET api/2.0/files/file/{fileId}/checkconversion`. Files over the single-request size limit or the account's  storage quota are refused; send those through `POST api/2.0/files/{folderId}/upload/create_session`.
   *
   * REST API Reference for uploadFileToMy Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
   *
   * @param createNewIfExist Settles the clash with a file already carrying that title: left out, the content is written as the next  version of that file; set to true, both survive and the new one gets a numeric suffix in its title. (optional)
   * @param storeOriginalFile Reaches further than this request: it writes a setting on the calling account, the same one  `PUT api/2.0/files/storeoriginal` writes, and it stays in force for later uploads. True keeps both the  uploaded file and the copy the portal converts it into, false replaces the uploaded file with the converted  one, and leaving it out keeps whatever the account already has. (optional)
   * @param keepConvertStatus Decides whether the outcome of the background conversion outlives the conversion itself. True keeps the queue  record, so `GET api/2.0/files/file/{fileId}/checkconversion` can still report the result or the error; left  out, the record is cleared the moment the conversion ends and that call finds nothing. (optional)
   * @param _file The content to store, sent as a `multipart/form-data` part; the name of that part becomes the title of the  stored file, with characters a title cannot hold replaced and the name cut to 170 characters. A request  without it is rejected as invalid. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileArrayWrapper uploadFileToMy(@javax.annotation.Nullable Boolean createNewIfExist, @javax.annotation.Nullable Boolean storeOriginalFile, @javax.annotation.Nullable Boolean keepConvertStatus, @javax.annotation.Nullable File _file, Map<String, String> additionalHeaders) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPair("createNewIfExist", createNewIfExist));
    localVarQueryParams.addAll(apiClient.parameterToPair("storeOriginalFile", storeOriginalFile));
    localVarQueryParams.addAll(apiClient.parameterToPair("keepConvertStatus", keepConvertStatus));
      
    
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

    TypeReference<FileArrayWrapper> localVarReturnType = new TypeReference<FileArrayWrapper>() {};
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
