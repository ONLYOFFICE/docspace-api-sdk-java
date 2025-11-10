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

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.BaseBatchRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ChangeHistory;
import org.openapitools.client.model.CheckFillFormDraft;
import org.openapitools.client.model.ConfigurationIntegerWrapper;
import org.openapitools.client.model.CopyAsJsonElement;
import org.openapitools.client.model.CreateFileJsonElement;
import org.openapitools.client.model.CreateTextOrHtmlFile;
import org.openapitools.client.model.CustomFilterParameters;
import org.openapitools.client.model.Delete;
import org.openapitools.client.model.EditHistoryArrayWrapper;
import org.openapitools.client.model.EditHistoryDataWrapper;
import org.openapitools.client.model.EditorType;
import java.io.File;
import org.openapitools.client.model.FileEntryBaseWrapper;
import org.openapitools.client.model.FileEntryIntegerArrayWrapper;
import org.openapitools.client.model.FileIntegerArrayWrapper;
import org.openapitools.client.model.FileIntegerWrapper;
import org.openapitools.client.model.FileLinkRequest;
import org.openapitools.client.model.FileLinkWrapper;
import org.openapitools.client.model.FileOperationArrayWrapper;
import org.openapitools.client.model.FileReferenceWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.FileShareWrapper;
import org.openapitools.client.model.FillingFormResultIntegerWrapper;
import org.openapitools.client.model.FormRoleArrayWrapper;
import org.openapitools.client.model.GetReferenceDataDtoInteger;
import org.openapitools.client.model.HistoryArrayWrapper;
import org.openapitools.client.model.KeyValuePairBooleanStringWrapper;
import org.openapitools.client.model.LockFileParameters;
import org.openapitools.client.model.ManageFormFillingDtoInteger;
import org.openapitools.client.model.MentionWrapperArrayWrapper;
import org.openapitools.client.model.NoContentResultWrapper;
import org.openapitools.client.model.ObjectArrayWrapper;
import org.openapitools.client.model.ObjectWrapper;
import org.openapitools.client.model.OrderRequestDto;
import org.openapitools.client.model.OrdersRequestDtoInteger;
import org.openapitools.client.model.SaveAsPdfInteger;
import org.openapitools.client.model.SaveFormRoleMappingDtoInteger;
import org.openapitools.client.model.StartEdit;
import org.openapitools.client.model.StringWrapper;
import org.openapitools.client.model.TemplatesRequestDto;
import java.util.UUID;
import org.openapitools.client.model.UpdateFile;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FilesApi extends BaseApi {

  public FilesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FilesApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * 
   * 
   *
   * REST API Reference for addFileToRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/
   *
   * @param fileId The file unique identifier. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper addFileToRecent(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.addFileToRecent(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for addFileToRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper addFileToRecent(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling addFileToRecent");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/recent"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for addTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/
   *
   * @param templatesRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper addTemplates(@javax.annotation.Nullable TemplatesRequestDto templatesRequestDto) throws ApiException {
    return this.addTemplates(templatesRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for addTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/
   *
   * @param templatesRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper addTemplates(@javax.annotation.Nullable TemplatesRequestDto templatesRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = templatesRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/templates";

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
   * 
   * 
   *
   * REST API Reference for changeVersionHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/
   *
   * @param fileId The file Id to change its version history. (required)
   * @param changeHistory The parameters for changing version history. (required)
   * @return FileIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerArrayWrapper changeVersionHistory(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull ChangeHistory changeHistory) throws ApiException {
    return this.changeVersionHistory(fileId, changeHistory, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeVersionHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/
   *
   * @param fileId The file Id to change its version history. (required)
   * @param changeHistory The parameters for changing version history. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerArrayWrapper changeVersionHistory(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull ChangeHistory changeHistory, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = changeHistory;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling changeVersionHistory");
    }
    
    // verify the required parameter 'changeHistory' is set
    if (changeHistory == null) {
      throw new ApiException(400, "Missing the required parameter 'changeHistory' when calling changeVersionHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/history"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerArrayWrapper> localVarReturnType = new TypeReference<FileIntegerArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for checkFillFormDraft Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-fill-form-draft/
   *
   * @param fileId The file ID of the form draft. (required)
   * @param checkFillFormDraft The parameters for checking the form draft filling. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper checkFillFormDraft(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CheckFillFormDraft checkFillFormDraft) throws ApiException {
    return this.checkFillFormDraft(fileId, checkFillFormDraft, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for checkFillFormDraft Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-fill-form-draft/
   *
   * @param fileId The file ID of the form draft. (required)
   * @param checkFillFormDraft The parameters for checking the form draft filling. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper checkFillFormDraft(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CheckFillFormDraft checkFillFormDraft, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = checkFillFormDraft;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling checkFillFormDraft");
    }
    
    // verify the required parameter 'checkFillFormDraft' is set
    if (checkFillFormDraft == null) {
      throw new ApiException(400, "Missing the required parameter 'checkFillFormDraft' when calling checkFillFormDraft");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/masterform/{fileId}/checkfillformdraft"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for copyFileAs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/
   *
   * @param fileId The file ID to copy. (required)
   * @param copyAsJsonElement The parameters for copying a file. (required)
   * @return FileEntryBaseWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseWrapper copyFileAs(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CopyAsJsonElement copyAsJsonElement) throws ApiException {
    return this.copyFileAs(fileId, copyAsJsonElement, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for copyFileAs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/
   *
   * @param fileId The file ID to copy. (required)
   * @param copyAsJsonElement The parameters for copying a file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryBaseWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryBaseWrapper copyFileAs(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CopyAsJsonElement copyAsJsonElement, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = copyAsJsonElement;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling copyFileAs");
    }
    
    // verify the required parameter 'copyAsJsonElement' is set
    if (copyAsJsonElement == null) {
      throw new ApiException(400, "Missing the required parameter 'copyAsJsonElement' when calling copyFileAs");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/copyas"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileEntryBaseWrapper> localVarReturnType = new TypeReference<FileEntryBaseWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for createEditSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/
   *
   * @param fileId The file ID. (required)
   * @param fileSize The file size in bytes. (optional)
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createEditSession(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Long fileSize) throws ApiException {
    return this.createEditSession(fileId, fileSize, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createEditSession Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/
   *
   * @param fileId The file ID. (required)
   * @param fileSize The file size in bytes. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectWrapper createEditSession(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Long fileSize, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling createEditSession");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/edit_session"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("fileSize", fileSize));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for createFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/
   *
   * @param folderId The folder ID for the file creation. (required)
   * @param createFileJsonElement The parameters for creating a file. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFileJsonElement createFileJsonElement) throws ApiException {
    return this.createFile(folderId, createFileJsonElement, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/
   *
   * @param folderId The folder ID for the file creation. (required)
   * @param createFileJsonElement The parameters for creating a file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateFileJsonElement createFileJsonElement, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createFileJsonElement;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createFile");
    }
    
    // verify the required parameter 'createFileJsonElement' is set
    if (createFileJsonElement == null) {
      throw new ApiException(400, "Missing the required parameter 'createFileJsonElement' when calling createFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/file"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for createFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/
   *
   * @param createFileJsonElement  (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createFileInMyDocuments(@javax.annotation.Nullable CreateFileJsonElement createFileJsonElement) throws ApiException {
    return this.createFileInMyDocuments(createFileJsonElement, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/
   *
   * @param createFileJsonElement  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createFileInMyDocuments(@javax.annotation.Nullable CreateFileJsonElement createFileJsonElement, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createFileJsonElement;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my/file";

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
   * 
   * 
   *
   * REST API Reference for createFilePrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/
   *
   * @param id The file ID. (required)
   * @param fileLinkRequest The file external link parameters. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFilePrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FileLinkRequest fileLinkRequest) throws ApiException {
    return this.createFilePrimaryExternalLink(id, fileLinkRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createFilePrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/
   *
   * @param id The file ID. (required)
   * @param fileLinkRequest The file external link parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper createFilePrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FileLinkRequest fileLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = fileLinkRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createFilePrimaryExternalLink");
    }
    
    // verify the required parameter 'fileLinkRequest' is set
    if (fileLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fileLinkRequest' when calling createFilePrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/link"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for createHtmlFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/
   *
   * @param folderId The folder ID to create the text or HTML file. (required)
   * @param createTextOrHtmlFile The parameters for creating an HTML or text file. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createHtmlFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateTextOrHtmlFile createTextOrHtmlFile) throws ApiException {
    return this.createHtmlFile(folderId, createTextOrHtmlFile, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createHtmlFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/
   *
   * @param folderId The folder ID to create the text or HTML file. (required)
   * @param createTextOrHtmlFile The parameters for creating an HTML or text file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createHtmlFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateTextOrHtmlFile createTextOrHtmlFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createTextOrHtmlFile;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createHtmlFile");
    }
    
    // verify the required parameter 'createTextOrHtmlFile' is set
    if (createTextOrHtmlFile == null) {
      throw new ApiException(400, "Missing the required parameter 'createTextOrHtmlFile' when calling createHtmlFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/html"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for createHtmlFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/
   *
   * @param createTextOrHtmlFile  (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createHtmlFileInMyDocuments(@javax.annotation.Nullable CreateTextOrHtmlFile createTextOrHtmlFile) throws ApiException {
    return this.createHtmlFileInMyDocuments(createTextOrHtmlFile, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createHtmlFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/
   *
   * @param createTextOrHtmlFile  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createHtmlFileInMyDocuments(@javax.annotation.Nullable CreateTextOrHtmlFile createTextOrHtmlFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createTextOrHtmlFile;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my/html";

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
   * 
   * 
   *
   * REST API Reference for createTextFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/
   *
   * @param folderId The folder ID to create the text or HTML file. (required)
   * @param createTextOrHtmlFile The parameters for creating an HTML or text file. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createTextFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateTextOrHtmlFile createTextOrHtmlFile) throws ApiException {
    return this.createTextFile(folderId, createTextOrHtmlFile, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createTextFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/
   *
   * @param folderId The folder ID to create the text or HTML file. (required)
   * @param createTextOrHtmlFile The parameters for creating an HTML or text file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createTextFile(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull CreateTextOrHtmlFile createTextOrHtmlFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createTextOrHtmlFile;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling createTextFile");
    }
    
    // verify the required parameter 'createTextOrHtmlFile' is set
    if (createTextOrHtmlFile == null) {
      throw new ApiException(400, "Missing the required parameter 'createTextOrHtmlFile' when calling createTextFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{folderId}/text"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for createTextFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/
   *
   * @param createTextOrHtmlFile  (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createTextFileInMyDocuments(@javax.annotation.Nullable CreateTextOrHtmlFile createTextOrHtmlFile) throws ApiException {
    return this.createTextFileInMyDocuments(createTextOrHtmlFile, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createTextFileInMyDocuments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/
   *
   * @param createTextOrHtmlFile  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper createTextFileInMyDocuments(@javax.annotation.Nullable CreateTextOrHtmlFile createTextOrHtmlFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createTextOrHtmlFile;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@my/text";

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
   * 
   * 
   *
   * REST API Reference for createThumbnails Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/
   *
   * @param baseBatchRequestDto  (optional)
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper createThumbnails(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.createThumbnails(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for createThumbnails Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ObjectArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public ObjectArrayWrapper createThumbnails(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thumbnails";

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

    TypeReference<ObjectArrayWrapper> localVarReturnType = new TypeReference<ObjectArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for deleteFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/
   *
   * @param fileId The file ID to delete. (required)
   * @param delete The parameters for deleting a file. (required)
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull Delete delete) throws ApiException {
    return this.deleteFile(fileId, delete, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/
   *
   * @param fileId The file ID to delete. (required)
   * @param delete The parameters for deleting a file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileOperationArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileOperationArrayWrapper deleteFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull Delete delete, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = delete;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling deleteFile");
    }
    
    // verify the required parameter 'delete' is set
    if (delete == null) {
      throw new ApiException(400, "Missing the required parameter 'delete' when calling deleteFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for deleteRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/
   *
   * @param baseBatchRequestDto  (optional)
   * @return NoContentResultWrapper
   * @throws ApiException if fails to make API call
   */
  public NoContentResultWrapper deleteRecent(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto) throws ApiException {
    return this.deleteRecent(baseBatchRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/
   *
   * @param baseBatchRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return NoContentResultWrapper
   * @throws ApiException if fails to make API call
   */
  public NoContentResultWrapper deleteRecent(@javax.annotation.Nullable BaseBatchRequestDto baseBatchRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = baseBatchRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/recent";

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

    TypeReference<NoContentResultWrapper> localVarReturnType = new TypeReference<NoContentResultWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for deleteTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/
   *
   * @param requestBody The file IDs. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteTemplates(@javax.annotation.Nullable List<Integer> requestBody) throws ApiException {
    return this.deleteTemplates(requestBody, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for deleteTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/
   *
   * @param requestBody The file IDs. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteTemplates(@javax.annotation.Nullable List<Integer> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/templates";

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
   * 
   * 
   *
   * REST API Reference for getAllFormRoles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/
   *
   * @param fileId The file unique identifier. (required)
   * @return FormRoleArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FormRoleArrayWrapper getAllFormRoles(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getAllFormRoles(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getAllFormRoles Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FormRoleArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FormRoleArrayWrapper getAllFormRoles(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getAllFormRoles");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/formroles"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FormRoleArrayWrapper> localVarReturnType = new TypeReference<FormRoleArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getEditDiffUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/
   *
   * @param fileId The file ID. (required)
   * @param version The file version. (optional)
   * @return EditHistoryDataWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryDataWrapper getEditDiffUrl(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version) throws ApiException {
    return this.getEditDiffUrl(fileId, version, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getEditDiffUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/
   *
   * @param fileId The file ID. (required)
   * @param version The file version. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EditHistoryDataWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryDataWrapper getEditDiffUrl(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getEditDiffUrl");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/edit/diff"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<EditHistoryDataWrapper> localVarReturnType = new TypeReference<EditHistoryDataWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getEditHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/
   *
   * @param fileId The file unique identifier. (required)
   * @return EditHistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryArrayWrapper getEditHistory(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getEditHistory(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getEditHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EditHistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryArrayWrapper getEditHistory(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getEditHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/edit/history"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<EditHistoryArrayWrapper> localVarReturnType = new TypeReference<EditHistoryArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getFileHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/
   *
   * @param fileId The file ID of the history request. (required)
   * @param fromDate The start date of the history. (optional)
   * @param toDate The end date of the history. (optional)
   * @param count The number of history entries to retrieve for the file log. (optional)
   * @param startIndex The starting index for retrieving a subset of file history entries. (optional)
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFileHistory(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable ApiDateTime fromDate, @javax.annotation.Nullable ApiDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFileHistory(fileId, fromDate, toDate, count, startIndex, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFileHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/
   *
   * @param fileId The file ID of the history request. (required)
   * @param fromDate The start date of the history. (optional)
   * @param toDate The end date of the history. (optional)
   * @param count The number of history entries to retrieve for the file log. (optional)
   * @param startIndex The starting index for retrieving a subset of file history entries. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return HistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public HistoryArrayWrapper getFileHistory(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable ApiDateTime fromDate, @javax.annotation.Nullable ApiDateTime toDate, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/log"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", fromDate.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", fromDate.getTimeZoneOffset()));
    localVarQueryParams.addAll(apiClient.parameterToPair("utcTime", toDate.getUtcTime()));
    localVarQueryParams.addAll(apiClient.parameterToPair("timeZoneOffset", toDate.getTimeZoneOffset()));
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
   * 
   * 
   *
   * REST API Reference for getFileInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/
   *
   * @param fileId The file ID. (required)
   * @param version The file version. (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper getFileInfo(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version) throws ApiException {
    return this.getFileInfo(fileId, version, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFileInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/
   *
   * @param fileId The file ID. (required)
   * @param version The file version. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper getFileInfo(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getFileLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFileLinks(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFileLinks(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFileLinks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper getFileLinks(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFileLinks");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/links"
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
   * 
   * 
   *
   * REST API Reference for getFilePrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-primary-external-link/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFilePrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getFilePrimaryExternalLink(id, count, startIndex, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFilePrimaryExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-primary-external-link/
   *
   * @param id The file unique identifier. (required)
   * @param count The number of items to retrieve in the request. (optional)
   * @param startIndex The starting index for the query results. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper getFilePrimaryExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFilePrimaryExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/link"
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
   * 
   * 
   *
   * REST API Reference for getFileVersionInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/
   *
   * @param fileId The file unique identifier. (required)
   * @return FileIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerArrayWrapper getFileVersionInfo(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getFileVersionInfo(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFileVersionInfo Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerArrayWrapper getFileVersionInfo(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileVersionInfo");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/history"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerArrayWrapper> localVarReturnType = new TypeReference<FileIntegerArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getFillResult Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/
   *
   * @param fillingSessionId The form-filling session ID. (optional)
   * @return FillingFormResultIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FillingFormResultIntegerWrapper getFillResult(@javax.annotation.Nullable String fillingSessionId) throws ApiException {
    return this.getFillResult(fillingSessionId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFillResult Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/
   *
   * @param fillingSessionId The form-filling session ID. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FillingFormResultIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FillingFormResultIntegerWrapper getFillResult(@javax.annotation.Nullable String fillingSessionId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/fillresult";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("fillingSessionId", fillingSessionId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FillingFormResultIntegerWrapper> localVarReturnType = new TypeReference<FillingFormResultIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getPresignedFileUri Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/
   *
   * @param fileId The file unique identifier. (required)
   * @return FileLinkWrapper
   * @throws ApiException if fails to make API call
   */
  public FileLinkWrapper getPresignedFileUri(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getPresignedFileUri(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getPresignedFileUri Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileLinkWrapper
   * @throws ApiException if fails to make API call
   */
  public FileLinkWrapper getPresignedFileUri(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getPresignedFileUri");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/presigned"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileLinkWrapper> localVarReturnType = new TypeReference<FileLinkWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getPresignedUri Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/
   *
   * @param fileId The file unique identifier. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPresignedUri(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getPresignedUri(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getPresignedUri Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper getPresignedUri(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getPresignedUri");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/presigneduri"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getProtectedFileUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/
   *
   * @param fileId The file unique identifier. (required)
   * @return MentionWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MentionWrapperArrayWrapper getProtectedFileUsers(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getProtectedFileUsers(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getProtectedFileUsers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MentionWrapperArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MentionWrapperArrayWrapper getProtectedFileUsers(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getProtectedFileUsers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/protectusers"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for getReferenceData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/
   *
   * @param getReferenceDataDtoInteger  (optional)
   * @return FileReferenceWrapper
   * @throws ApiException if fails to make API call
   */
  public FileReferenceWrapper getReferenceData(@javax.annotation.Nullable GetReferenceDataDtoInteger getReferenceDataDtoInteger) throws ApiException {
    return this.getReferenceData(getReferenceDataDtoInteger, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getReferenceData Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/
   *
   * @param getReferenceDataDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileReferenceWrapper
   * @throws ApiException if fails to make API call
   */
  public FileReferenceWrapper getReferenceData(@javax.annotation.Nullable GetReferenceDataDtoInteger getReferenceDataDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = getReferenceDataDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/referencedata";

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

    TypeReference<FileReferenceWrapper> localVarReturnType = new TypeReference<FileReferenceWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for isFormPDF Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/
   *
   * @param fileId The file unique identifier. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper isFormPDF(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.isFormPDF(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for isFormPDF Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/
   *
   * @param fileId The file unique identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper isFormPDF(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling isFormPDF");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/isformpdf"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for lockFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/
   *
   * @param fileId The file ID for locking. (required)
   * @param lockFileParameters The parameters for locking a file. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper lockFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull LockFileParameters lockFileParameters) throws ApiException {
    return this.lockFile(fileId, lockFileParameters, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for lockFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/
   *
   * @param fileId The file ID for locking. (required)
   * @param lockFileParameters The parameters for locking a file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper lockFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull LockFileParameters lockFileParameters, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = lockFileParameters;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling lockFile");
    }
    
    // verify the required parameter 'lockFileParameters' is set
    if (lockFileParameters == null) {
      throw new ApiException(400, "Missing the required parameter 'lockFileParameters' when calling lockFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/lock"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for manageFormFilling Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/
   *
   * @param fileId  (required)
   * @param manageFormFillingDtoInteger  (optional)
   * @throws ApiException if fails to make API call
   */
  public void manageFormFilling(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable ManageFormFillingDtoInteger manageFormFillingDtoInteger) throws ApiException {
    this.manageFormFilling(fileId, manageFormFillingDtoInteger, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for manageFormFilling Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/
   *
   * @param fileId  (required)
   * @param manageFormFillingDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void manageFormFilling(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable ManageFormFillingDtoInteger manageFormFillingDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = manageFormFillingDtoInteger;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling manageFormFilling");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/manageformfilling"
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
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for openEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/open-edit-file/
   *
   * @param fileId The file ID to open. (required)
   * @param version The file version to open. (optional)
   * @param view Specifies if the document will be opened for viewing only or not. (optional)
   * @param editorType The editor type to open the file. (optional)
   * @param edit Specifies if the document is opened in the editing mode or not. (optional)
   * @param fill Specifies if the document is opened in the form-filling mode or not. (optional)
   * @return ConfigurationIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ConfigurationIntegerWrapper openEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, @javax.annotation.Nullable Boolean view, @javax.annotation.Nullable EditorType editorType, @javax.annotation.Nullable Boolean edit, @javax.annotation.Nullable Boolean fill) throws ApiException {
    return this.openEditFile(fileId, version, view, editorType, edit, fill, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for openEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/open-edit-file/
   *
   * @param fileId The file ID to open. (required)
   * @param version The file version to open. (optional)
   * @param view Specifies if the document will be opened for viewing only or not. (optional)
   * @param editorType The editor type to open the file. (optional)
   * @param edit Specifies if the document is opened in the editing mode or not. (optional)
   * @param fill Specifies if the document is opened in the form-filling mode or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ConfigurationIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public ConfigurationIntegerWrapper openEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, @javax.annotation.Nullable Boolean view, @javax.annotation.Nullable EditorType editorType, @javax.annotation.Nullable Boolean edit, @javax.annotation.Nullable Boolean fill, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling openEditFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/openedit"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
    localVarQueryParams.addAll(apiClient.parameterToPair("view", view));
    localVarQueryParams.addAll(apiClient.parameterToPair("editorType", editorType));
    localVarQueryParams.addAll(apiClient.parameterToPair("edit", edit));
    localVarQueryParams.addAll(apiClient.parameterToPair("fill", fill));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ConfigurationIntegerWrapper> localVarReturnType = new TypeReference<ConfigurationIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for restoreFileVersion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-file-version/
   *
   * @param fileId The file ID of the restore version. (required)
   * @param version The file version of the restore. (optional)
   * @param url The file version URL of the restore. (optional)
   * @return EditHistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryArrayWrapper restoreFileVersion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, @javax.annotation.Nullable String url) throws ApiException {
    return this.restoreFileVersion(fileId, version, url, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for restoreFileVersion Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-file-version/
   *
   * @param fileId The file ID of the restore version. (required)
   * @param version The file version of the restore. (optional)
   * @param url The file version URL of the restore. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EditHistoryArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public EditHistoryArrayWrapper restoreFileVersion(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Integer version, @javax.annotation.Nullable String url, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling restoreFileVersion");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/restoreversion"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
    localVarQueryParams.addAll(apiClient.parameterToPair("url", url));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<EditHistoryArrayWrapper> localVarReturnType = new TypeReference<EditHistoryArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for saveEditingFileFromForm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/
   *
   * @param fileId The editing file ID from the request. (required)
   * @param fileExtension The editing file extension from the request. (optional)
   * @param downloadUri The URI to download the editing file. (optional)
   * @param _file The request file stream. (optional)
   * @param forcesave Specifies whether to force save the file or not. (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper saveEditingFileFromForm(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable String fileExtension, @javax.annotation.Nullable String downloadUri, @javax.annotation.Nullable File _file, @javax.annotation.Nullable Boolean forcesave) throws ApiException {
    return this.saveEditingFileFromForm(fileId, fileExtension, downloadUri, _file, forcesave, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for saveEditingFileFromForm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/
   *
   * @param fileId The editing file ID from the request. (required)
   * @param fileExtension The editing file extension from the request. (optional)
   * @param downloadUri The URI to download the editing file. (optional)
   * @param _file The request file stream. (optional)
   * @param forcesave Specifies whether to force save the file or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper saveEditingFileFromForm(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable String fileExtension, @javax.annotation.Nullable String downloadUri, @javax.annotation.Nullable File _file, @javax.annotation.Nullable Boolean forcesave, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling saveEditingFileFromForm");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/saveediting"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (fileExtension != null)
      localVarFormParams.put("FileExtension", fileExtension);
if (downloadUri != null)
      localVarFormParams.put("DownloadUri", downloadUri);
if (_file != null)
      localVarFormParams.put("File", _file);
if (forcesave != null)
      localVarFormParams.put("Forcesave", forcesave);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for saveFileAsPdf Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/
   *
   * @param id The file ID to save as PDF. (required)
   * @param saveAsPdfInteger The parameters for saving the file as PDF. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper saveFileAsPdf(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull SaveAsPdfInteger saveAsPdfInteger) throws ApiException {
    return this.saveFileAsPdf(id, saveAsPdfInteger, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for saveFileAsPdf Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/
   *
   * @param id The file ID to save as PDF. (required)
   * @param saveAsPdfInteger The parameters for saving the file as PDF. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper saveFileAsPdf(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull SaveAsPdfInteger saveAsPdfInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = saveAsPdfInteger;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling saveFileAsPdf");
    }
    
    // verify the required parameter 'saveAsPdfInteger' is set
    if (saveAsPdfInteger == null) {
      throw new ApiException(400, "Missing the required parameter 'saveAsPdfInteger' when calling saveFileAsPdf");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/saveaspdf"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for saveFormRoleMapping Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/
   *
   * @param fileId  (required)
   * @param saveFormRoleMappingDtoInteger  (optional)
   * @throws ApiException if fails to make API call
   */
  public void saveFormRoleMapping(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable SaveFormRoleMappingDtoInteger saveFormRoleMappingDtoInteger) throws ApiException {
    this.saveFormRoleMapping(fileId, saveFormRoleMappingDtoInteger, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for saveFormRoleMapping Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/
   *
   * @param fileId  (required)
   * @param saveFormRoleMappingDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void saveFormRoleMapping(@javax.annotation.Nonnull String fileId, @javax.annotation.Nullable SaveFormRoleMappingDtoInteger saveFormRoleMappingDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = saveFormRoleMappingDtoInteger;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling saveFormRoleMapping");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/formrolemapping"
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
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * 
   * 
   *
   * REST API Reference for setCustomFilterTag Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/
   *
   * @param fileId The file ID. (required)
   * @param customFilterParameters The parameters for setting the Custom Filter editing mode. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper setCustomFilterTag(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CustomFilterParameters customFilterParameters) throws ApiException {
    return this.setCustomFilterTag(fileId, customFilterParameters, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setCustomFilterTag Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/
   *
   * @param fileId The file ID. (required)
   * @param customFilterParameters The parameters for setting the Custom Filter editing mode. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper setCustomFilterTag(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull CustomFilterParameters customFilterParameters, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = customFilterParameters;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling setCustomFilterTag");
    }
    
    // verify the required parameter 'customFilterParameters' is set
    if (customFilterParameters == null) {
      throw new ApiException(400, "Missing the required parameter 'customFilterParameters' when calling setCustomFilterTag");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/customfilter"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for setFileExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/
   *
   * @param id The file ID. (required)
   * @param fileLinkRequest The file external link parameters. (required)
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFileExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FileLinkRequest fileLinkRequest) throws ApiException {
    return this.setFileExternalLink(id, fileLinkRequest, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setFileExternalLink Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/
   *
   * @param id The file ID. (required)
   * @param fileLinkRequest The file external link parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareWrapper setFileExternalLink(@javax.annotation.Nonnull Integer id, @javax.annotation.Nonnull FileLinkRequest fileLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = fileLinkRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setFileExternalLink");
    }
    
    // verify the required parameter 'fileLinkRequest' is set
    if (fileLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fileLinkRequest' when calling setFileExternalLink");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{id}/links"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for setFileOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/
   *
   * @param fileId The file unique identifier. (required)
   * @param orderRequestDto The file order information. (optional)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper setFileOrder(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable OrderRequestDto orderRequestDto) throws ApiException {
    return this.setFileOrder(fileId, orderRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setFileOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/
   *
   * @param fileId The file unique identifier. (required)
   * @param orderRequestDto The file order information. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper setFileOrder(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable OrderRequestDto orderRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = orderRequestDto;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling setFileOrder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/{fileId}/order"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for setFilesOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/
   *
   * @param ordersRequestDtoInteger  (optional)
   * @return FileEntryIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryIntegerArrayWrapper setFilesOrder(@javax.annotation.Nullable OrdersRequestDtoInteger ordersRequestDtoInteger) throws ApiException {
    return this.setFilesOrder(ordersRequestDtoInteger, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setFilesOrder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/
   *
   * @param ordersRequestDtoInteger  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileEntryIntegerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileEntryIntegerArrayWrapper setFilesOrder(@javax.annotation.Nullable OrdersRequestDtoInteger ordersRequestDtoInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = ordersRequestDtoInteger;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/order";

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

    TypeReference<FileEntryIntegerArrayWrapper> localVarReturnType = new TypeReference<FileEntryIntegerArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for startEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-edit-file/
   *
   * @param fileId The file ID to start editing. (required)
   * @param startEdit The file parameters to start editing. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper startEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull StartEdit startEdit) throws ApiException {
    return this.startEditFile(fileId, startEdit, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for startEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-edit-file/
   *
   * @param fileId The file ID to start editing. (required)
   * @param startEdit The file parameters to start editing. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper startEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull StartEdit startEdit, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startEdit;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling startEditFile");
    }
    
    // verify the required parameter 'startEdit' is set
    if (startEdit == null) {
      throw new ApiException(400, "Missing the required parameter 'startEdit' when calling startEditFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/startedit"
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   * 
   *
   * REST API Reference for startFillingFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/
   *
   * @param fileId The file ID to start filling. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper startFillingFile(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.startFillingFile(fileId, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for startFillingFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/
   *
   * @param fileId The file ID to start filling. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper startFillingFile(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling startFillingFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/startfilling"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for toggleFileFavorite Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/
   *
   * @param fileId The file ID. (required)
   * @param favorite Specifies if the file is marked as favorite or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper toggleFileFavorite(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Boolean favorite) throws ApiException {
    return this.toggleFileFavorite(fileId, favorite, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for toggleFileFavorite Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/
   *
   * @param fileId The file ID. (required)
   * @param favorite Specifies if the file is marked as favorite or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper toggleFileFavorite(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable Boolean favorite, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling toggleFileFavorite");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/favorites/{fileId}"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("favorite", favorite));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for trackEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/track-edit-file/
   *
   * @param fileId The file ID to track editing changes. (required)
   * @param tabId The tab ID to track editing changes. (optional)
   * @param docKeyForTrack The document key for tracking changes. (optional)
   * @param isFinish Specifies whether to finish file tracking or not. (optional)
   * @return KeyValuePairBooleanStringWrapper
   * @throws ApiException if fails to make API call
   */
  public KeyValuePairBooleanStringWrapper trackEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable UUID tabId, @javax.annotation.Nullable String docKeyForTrack, @javax.annotation.Nullable Boolean isFinish) throws ApiException {
    return this.trackEditFile(fileId, tabId, docKeyForTrack, isFinish, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for trackEditFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/track-edit-file/
   *
   * @param fileId The file ID to track editing changes. (required)
   * @param tabId The tab ID to track editing changes. (optional)
   * @param docKeyForTrack The document key for tracking changes. (optional)
   * @param isFinish Specifies whether to finish file tracking or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return KeyValuePairBooleanStringWrapper
   * @throws ApiException if fails to make API call
   */
  public KeyValuePairBooleanStringWrapper trackEditFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nullable UUID tabId, @javax.annotation.Nullable String docKeyForTrack, @javax.annotation.Nullable Boolean isFinish, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling trackEditFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}/trackeditfile"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("tabId", tabId));
    localVarQueryParams.addAll(apiClient.parameterToPair("docKeyForTrack", docKeyForTrack));
    localVarQueryParams.addAll(apiClient.parameterToPair("isFinish", isFinish));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<KeyValuePairBooleanStringWrapper> localVarReturnType = new TypeReference<KeyValuePairBooleanStringWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for updateFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file/
   *
   * @param fileId The file ID to update. (required)
   * @param updateFile The parameters for updating a file. (required)
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper updateFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UpdateFile updateFile) throws ApiException {
    return this.updateFile(fileId, updateFile, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for updateFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file/
   *
   * @param fileId The file ID to update. (required)
   * @param updateFile The parameters for updating a file. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileIntegerWrapper
   * @throws ApiException if fails to make API call
   */
  public FileIntegerWrapper updateFile(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull UpdateFile updateFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateFile;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateFile");
    }
    
    // verify the required parameter 'updateFile' is set
    if (updateFile == null) {
      throw new ApiException(400, "Missing the required parameter 'updateFile' when calling updateFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/file/{fileId}"
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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FileIntegerWrapper> localVarReturnType = new TypeReference<FileIntegerWrapper>() {};
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

    String[] localVarAuthNames = new String[] {  };

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
