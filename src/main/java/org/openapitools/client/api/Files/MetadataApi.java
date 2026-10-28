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

import org.openapitools.client.model.AssignMetadataTemplates;
import org.openapitools.client.model.CreateMetadataTemplateRequestDto;
import org.openapitools.client.model.CustomFieldValueArrayWrapper;
import org.openapitools.client.model.EntryMetadataWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.MetadataFieldRequest;
import org.openapitools.client.model.MetadataFieldWrapper;
import org.openapitools.client.model.MetadataOperationWrapper;
import org.openapitools.client.model.MetadataTemplateArrayWrapper;
import org.openapitools.client.model.MetadataTemplateWrapper;
import org.openapitools.client.model.SetCustomFields;
import org.openapitools.client.model.SetMetadataValues;
import org.openapitools.client.model.UpdateFolderMetadataTemplateRequest;
import org.openapitools.client.model.UpdateMetadataFieldRequest;
import org.openapitools.client.model.UpdateMetadataTemplate;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class MetadataApi extends BaseApi {

  public MetadataApi() {
    super(Configuration.getDefaultApiClient());
  }

  public MetadataApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Assign templates to a file
   * Assigns one or more metadata templates to a file, so its fields can be filled with  `PUT api/2.0/files/metadata/file/{fileId}/values`. The caller needs the right to edit the file. The assignment writes  no values and is idempotent: a template the file already carries is skipped, the others are added, an empty list  changes nothing. The call finishes in the request, nothing runs in the background. A template a cascading folder above  the file already provides stays inherited. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404. To take a template off the file use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`.
   *
   * REST API Reference for assignFileTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-file-templates/
   *
   * @param fileId The file ID. (required)
   * @param assignMetadataTemplates The parameters for assigning templates. (required)
   * @throws ApiException if fails to make API call
   */
  public void assignFileTemplates(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull AssignMetadataTemplates assignMetadataTemplates) throws ApiException {
    this.assignFileTemplates(fileId, assignMetadataTemplates, Collections.emptyMap());
  }


  /**
   * Assign templates to a file
   * Assigns one or more metadata templates to a file, so its fields can be filled with  `PUT api/2.0/files/metadata/file/{fileId}/values`. The caller needs the right to edit the file. The assignment writes  no values and is idempotent: a template the file already carries is skipped, the others are added, an empty list  changes nothing. The call finishes in the request, nothing runs in the background. A template a cascading folder above  the file already provides stays inherited. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404. To take a template off the file use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`.
   *
   * REST API Reference for assignFileTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-file-templates/
   *
   * @param fileId The file ID. (required)
   * @param assignMetadataTemplates The parameters for assigning templates. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void assignFileTemplates(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull AssignMetadataTemplates assignMetadataTemplates, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = assignMetadataTemplates;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling assignFileTemplates");
    }
    
    // verify the required parameter 'assignMetadataTemplates' is set
    if (assignMetadataTemplates == null) {
      throw new ApiException(400, "Missing the required parameter 'assignMetadataTemplates' when calling assignFileTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/file/{fileId}/templates"
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
   * Assign templates to a folder
   * Assigns one or more metadata templates to a folder or a room and, with `cascade` set, propagates them to every  folder and file below it. The caller needs the right to create in the folder (a room manager or a content  creator); for a room that is its manager. The assignment itself finishes in the request and writes no values. The  cascade is asynchronous: a pass is queued that assigns the templates to the whole subtree and copies the values the  folder holds, and the answer is that pass with the `templateIds` it propagates. Poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true; a failed pass  reports its `error` there. The `conflictResolveType` decides what happens to a value an entry already holds: `Skip`  keeps it, `Overwrite` replaces it with the folder's value. A folder inside the subtree that cascades the same  template keeps its own values for its content. Without a cascade the answer is a completed operation without an identifier;  a template that already cascades keeps cascading, it is turned off with  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`. A caller without the right to create in the  folder is answered with 403; a folder, or a template, that does not exist with 404.
   *
   * REST API Reference for assignFolderTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-folder-templates/
   *
   * @param folderId The folder ID. (required)
   * @param assignMetadataTemplates The parameters for assigning templates. (required)
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper assignFolderTemplates(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull AssignMetadataTemplates assignMetadataTemplates) throws ApiException {
    return this.assignFolderTemplates(folderId, assignMetadataTemplates, Collections.emptyMap());
  }


  /**
   * Assign templates to a folder
   * Assigns one or more metadata templates to a folder or a room and, with `cascade` set, propagates them to every  folder and file below it. The caller needs the right to create in the folder (a room manager or a content  creator); for a room that is its manager. The assignment itself finishes in the request and writes no values. The  cascade is asynchronous: a pass is queued that assigns the templates to the whole subtree and copies the values the  folder holds, and the answer is that pass with the `templateIds` it propagates. Poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true; a failed pass  reports its `error` there. The `conflictResolveType` decides what happens to a value an entry already holds: `Skip`  keeps it, `Overwrite` replaces it with the folder's value. A folder inside the subtree that cascades the same  template keeps its own values for its content. Without a cascade the answer is a completed operation without an identifier;  a template that already cascades keeps cascading, it is turned off with  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`. A caller without the right to create in the  folder is answered with 403; a folder, or a template, that does not exist with 404.
   *
   * REST API Reference for assignFolderTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-folder-templates/
   *
   * @param folderId The folder ID. (required)
   * @param assignMetadataTemplates The parameters for assigning templates. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper assignFolderTemplates(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull AssignMetadataTemplates assignMetadataTemplates, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = assignMetadataTemplates;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling assignFolderTemplates");
    }
    
    // verify the required parameter 'assignMetadataTemplates' is set
    if (assignMetadataTemplates == null) {
      throw new ApiException(400, "Missing the required parameter 'assignMetadataTemplates' when calling assignFolderTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/templates"
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

    TypeReference<MetadataOperationWrapper> localVarReturnType = new TypeReference<MetadataOperationWrapper>() {};
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
   * Add a metadata field
   * Adds a field to an existing metadata template. Only a DocSpace admin can change templates. The field name must be  unique within the template regardless of case and at most 255 characters, the type must be one of the published ones,  a choice field needs at least one option and unique option values, a field of another type takes no options. A  field without `order` is placed after the last field of the template. The entries the template is already  assigned to get the field without a value: nothing is written on them and no cascade runs. The answer is the  created field with its generated option identifiers. A template that does not exist is answered with 404, an  invalid field with 400.
   *
   * REST API Reference for createField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-field/
   *
   * @param templateId The template ID. (required)
   * @param metadataFieldRequest The parameters of the field. (required)
   * @return MetadataFieldWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataFieldWrapper createField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull MetadataFieldRequest metadataFieldRequest) throws ApiException {
    return this.createField(templateId, metadataFieldRequest, Collections.emptyMap());
  }


  /**
   * Add a metadata field
   * Adds a field to an existing metadata template. Only a DocSpace admin can change templates. The field name must be  unique within the template regardless of case and at most 255 characters, the type must be one of the published ones,  a choice field needs at least one option and unique option values, a field of another type takes no options. A  field without `order` is placed after the last field of the template. The entries the template is already  assigned to get the field without a value: nothing is written on them and no cascade runs. The answer is the  created field with its generated option identifiers. A template that does not exist is answered with 404, an  invalid field with 400.
   *
   * REST API Reference for createField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-field/
   *
   * @param templateId The template ID. (required)
   * @param metadataFieldRequest The parameters of the field. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataFieldWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataFieldWrapper createField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull MetadataFieldRequest metadataFieldRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = metadataFieldRequest;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createField");
    }
    
    // verify the required parameter 'metadataFieldRequest' is set
    if (metadataFieldRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'metadataFieldRequest' when calling createField");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}/fields"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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

    TypeReference<MetadataFieldWrapper> localVarReturnType = new TypeReference<MetadataFieldWrapper>() {};
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
   * Create a metadata template
   * Creates a metadata template for the whole portal, optionally with its fields in one call. Only a DocSpace admin can  create templates. The template name must be unique on the portal regardless of case, at most 255 characters, and the  name `System` is reserved. Every field needs a name unique within the template and a type from the published set; a  choice field requires at least one option and the options must be unique, a field of another type takes no options.  A field without `order` is placed after the fields that have one, in the order of the request. The template and  its fields are stored together: an invalid field rejects the whole request and nothing is created.  The answer is the created template with its fields and the generated option identifiers, which the values written  with `PUT api/2.0/files/metadata/file/{fileId}/values` refer to. A name already in use or an invalid field is  answered with 400; the request of a member who is not a DocSpace admin with 403.
   *
   * REST API Reference for createTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-template/
   *
   * @param createMetadataTemplateRequestDto  (optional)
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper createTemplate(@javax.annotation.Nullable CreateMetadataTemplateRequestDto createMetadataTemplateRequestDto) throws ApiException {
    return this.createTemplate(createMetadataTemplateRequestDto, Collections.emptyMap());
  }


  /**
   * Create a metadata template
   * Creates a metadata template for the whole portal, optionally with its fields in one call. Only a DocSpace admin can  create templates. The template name must be unique on the portal regardless of case, at most 255 characters, and the  name `System` is reserved. Every field needs a name unique within the template and a type from the published set; a  choice field requires at least one option and the options must be unique, a field of another type takes no options.  A field without `order` is placed after the fields that have one, in the order of the request. The template and  its fields are stored together: an invalid field rejects the whole request and nothing is created.  The answer is the created template with its fields and the generated option identifiers, which the values written  with `PUT api/2.0/files/metadata/file/{fileId}/values` refer to. A name already in use or an invalid field is  answered with 400; the request of a member who is not a DocSpace admin with 403.
   *
   * REST API Reference for createTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-template/
   *
   * @param createMetadataTemplateRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper createTemplate(@javax.annotation.Nullable CreateMetadataTemplateRequestDto createMetadataTemplateRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createMetadataTemplateRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates";

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

    TypeReference<MetadataTemplateWrapper> localVarReturnType = new TypeReference<MetadataTemplateWrapper>() {};
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
   * Delete a metadata field
   * Deletes a metadata field from its template together with every value written for it on any file, folder or room of  the portal. Only a DocSpace admin can change templates. The deletion is irreversible: the affected entries lose the  value at once, their search documents are rebuilt and the clients viewing them are told to refresh. The template and  its other fields stay as they are. A field that does not exist, or that belongs to another template than the one in  the route, is answered with 404.
   *
   * REST API Reference for deleteField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-field/
   *
   * @param templateId The template ID. (required)
   * @param fieldId The field ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull Integer fieldId) throws ApiException {
    this.deleteField(templateId, fieldId, Collections.emptyMap());
  }


  /**
   * Delete a metadata field
   * Deletes a metadata field from its template together with every value written for it on any file, folder or room of  the portal. Only a DocSpace admin can change templates. The deletion is irreversible: the affected entries lose the  value at once, their search documents are rebuilt and the clients viewing them are told to refresh. The template and  its other fields stay as they are. A field that does not exist, or that belongs to another template than the one in  the route, is answered with 404.
   *
   * REST API Reference for deleteField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-field/
   *
   * @param templateId The template ID. (required)
   * @param fieldId The field ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull Integer fieldId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteField");
    }
    
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling deleteField");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)))
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fieldId)));

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
   * Delete a metadata template
   * Deletes a metadata template together with its fields, its assignments and every value written for its fields on any  file, folder or room of the portal. Only a DocSpace admin can delete templates. The deletion is irreversible and there  is no confirmation: the affected entries lose the template at once, their search documents are rebuilt and the clients  viewing them are told to refresh. A template that does not exist, or was already deleted, is answered with 404.  To take the template off a single entry and keep it for the others use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}` instead.
   *
   * REST API Reference for deleteTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-template/
   *
   * @param templateId The template ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplate(@javax.annotation.Nonnull Integer templateId) throws ApiException {
    this.deleteTemplate(templateId, Collections.emptyMap());
  }


  /**
   * Delete a metadata template
   * Deletes a metadata template together with its fields, its assignments and every value written for its fields on any  file, folder or room of the portal. Only a DocSpace admin can delete templates. The deletion is irreversible and there  is no confirmation: the affected entries lose the template at once, their search documents are rebuilt and the clients  viewing them are told to refresh. A template that does not exist, or was already deleted, is answered with 404.  To take the template off a single entry and keep it for the others use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}` instead.
   *
   * REST API Reference for deleteTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-template/
   *
   * @param templateId The template ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplate(@javax.annotation.Nonnull Integer templateId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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
   * Get cascade progress
   * Reports the cascade pass of a folder started by `PUT api/2.0/files/metadata/folder/{folderId}/templates` or by  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`: the running one, otherwise the most recent  one. The caller needs read access to the folder, the call is read-only. `templateIds` names the templates the pass  propagates, so a client can show the progress next to the right template; `progress` is the share of the subtree  processed, `isCompleted` tells the pass is over and `error` carries the reason of a failed one; a completed pass  without an error has written every template and value it was asked for. A folder that never cascaded, or whose  passes were already dropped, is answered with a completed operation without an identifier and with empty  `templateIds` rather than with an error. A folder that does not exist is answered with 404.
   *
   * REST API Reference for getCascadeProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cascade-progress/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper getCascadeProgress(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getCascadeProgress(folderId, Collections.emptyMap());
  }


  /**
   * Get cascade progress
   * Reports the cascade pass of a folder started by `PUT api/2.0/files/metadata/folder/{folderId}/templates` or by  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`: the running one, otherwise the most recent  one. The caller needs read access to the folder, the call is read-only. `templateIds` names the templates the pass  propagates, so a client can show the progress next to the right template; `progress` is the share of the subtree  processed, `isCompleted` tells the pass is over and `error` carries the reason of a failed one; a completed pass  without an error has written every template and value it was asked for. A folder that never cascaded, or whose  passes were already dropped, is answered with a completed operation without an identifier and with empty  `templateIds` rather than with an error. A folder that does not exist is answered with 404.
   *
   * REST API Reference for getCascadeProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cascade-progress/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper getCascadeProgress(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getCascadeProgress");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/templates/progress"
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

    TypeReference<MetadataOperationWrapper> localVarReturnType = new TypeReference<MetadataOperationWrapper>() {};
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
   * Get file metadata
   * Returns the metadata of a file: the templates assigned to it, directly or inherited from a cascading folder above  it, each with its fields, and the custom text fields set on the file. The caller needs read access to the file: a  member of the portal, or an anonymous caller through an external link that grants access to the file or to a  folder above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field the file holds no value for comes without a `value`.  A file never cascades, so every template reports `cascade` false and no `conflictResolveType`; whether it was  inherited from a folder above is not told apart from a direct assignment. The custom fields are name and value  pairs and are not part of any template. A file without metadata is answered with empty lists, not with an error.  The same shape is returned by `PUT api/2.0/files/metadata/file/{fileId}/values` after a write. A request with  neither a session nor a link key is answered with 401; a file the caller cannot read with 403, a file that does  not exist with 404.
   *
   * REST API Reference for getFileMetadata Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-metadata/
   *
   * @param fileId The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. (required)
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper getFileMetadata(@javax.annotation.Nonnull Integer fileId) throws ApiException {
    return this.getFileMetadata(fileId, Collections.emptyMap());
  }


  /**
   * Get file metadata
   * Returns the metadata of a file: the templates assigned to it, directly or inherited from a cascading folder above  it, each with its fields, and the custom text fields set on the file. The caller needs read access to the file: a  member of the portal, or an anonymous caller through an external link that grants access to the file or to a  folder above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field the file holds no value for comes without a `value`.  A file never cascades, so every template reports `cascade` false and no `conflictResolveType`; whether it was  inherited from a folder above is not told apart from a direct assignment. The custom fields are name and value  pairs and are not part of any template. A file without metadata is answered with empty lists, not with an error.  The same shape is returned by `PUT api/2.0/files/metadata/file/{fileId}/values` after a write. A request with  neither a session nor a link key is answered with 401; a file the caller cannot read with 403, a file that does  not exist with 404.
   *
   * REST API Reference for getFileMetadata Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-metadata/
   *
   * @param fileId The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper getFileMetadata(@javax.annotation.Nonnull Integer fileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/file/{fileId}"
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

    TypeReference<EntryMetadataWrapper> localVarReturnType = new TypeReference<EntryMetadataWrapper>() {};
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
   * Get folder metadata
   * Returns the metadata of a folder or a room: the templates assigned to it, directly or inherited from a cascading  folder above it, each with its fields, and the custom text fields set on it. The caller needs read access to the  folder: a member of the portal, or an anonymous caller through an external link to the folder or to a folder  above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field without a value on the folder comes without `value`. Each  template reports whether this folder cascades it to its content in `cascade`, with the rule of that cascade in  `conflictResolveType`, absent while it does not; an inherited template reports false unless this folder cascades it  on its own. The custom fields are name and value pairs outside any template. A folder without metadata is answered  with empty lists. The cascade is changed with `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`.  A request with neither a session nor a link key is answered with 401; a folder the caller cannot read with 403, a  folder that does not exist with 404.
   *
   * REST API Reference for getFolderMetadata Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-metadata/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper getFolderMetadata(@javax.annotation.Nonnull Integer folderId) throws ApiException {
    return this.getFolderMetadata(folderId, Collections.emptyMap());
  }


  /**
   * Get folder metadata
   * Returns the metadata of a folder or a room: the templates assigned to it, directly or inherited from a cascading  folder above it, each with its fields, and the custom text fields set on it. The caller needs read access to the  folder: a member of the portal, or an anonymous caller through an external link to the folder or to a folder  above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field without a value on the folder comes without `value`. Each  template reports whether this folder cascades it to its content in `cascade`, with the rule of that cascade in  `conflictResolveType`, absent while it does not; an inherited template reports false unless this folder cascades it  on its own. The custom fields are name and value pairs outside any template. A folder without metadata is answered  with empty lists. The cascade is changed with `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`.  A request with neither a session nor a link key is answered with 401; a folder the caller cannot read with 403, a  folder that does not exist with 404.
   *
   * REST API Reference for getFolderMetadata Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-metadata/
   *
   * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper getFolderMetadata(@javax.annotation.Nonnull Integer folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}"
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

    TypeReference<EntryMetadataWrapper> localVarReturnType = new TypeReference<EntryMetadataWrapper>() {};
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
   * Get a metadata template
   * Returns one metadata template with its fields, in their display order, and the options of its choice fields. Any  member of the portal can read a template, the call is read-only. Use it to resolve the template identifiers a file or  a folder reports in `assignedMetadataTemplates` into names and fields. A template that does not exist is answered  with 404.
   *
   * REST API Reference for getTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-template/
   *
   * @param templateId The template ID. (required)
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper getTemplate(@javax.annotation.Nonnull Integer templateId) throws ApiException {
    return this.getTemplate(templateId, Collections.emptyMap());
  }


  /**
   * Get a metadata template
   * Returns one metadata template with its fields, in their display order, and the options of its choice fields. Any  member of the portal can read a template, the call is read-only. Use it to resolve the template identifiers a file or  a folder reports in `assignedMetadataTemplates` into names and fields. A template that does not exist is answered  with 404.
   *
   * REST API Reference for getTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-template/
   *
   * @param templateId The template ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper getTemplate(@javax.annotation.Nonnull Integer templateId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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

    TypeReference<MetadataTemplateWrapper> localVarReturnType = new TypeReference<MetadataTemplateWrapper>() {};
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
   * Get metadata templates
   * Lists the metadata templates of the portal with their fields, the dictionary a file, a folder or a room is described  with. Any member of the portal can read it, the list is the same for everyone. The call is read-only. The templates  come back ordered by their creation, each with its fields in their display order and the choice options of the choice  fields; the `visible` parameter narrows the list to the templates shown in the pickers or to the hidden ones, without  it both are returned. The author and the last editor of a template come as user objects with the display name and  the avatar, so a list needs no lookup of its own per author. An empty list means the portal has no templates yet.  The custom text fields set on the entries are not templates and are not listed here: read them on the entry with  `GET api/2.0/files/metadata/file/{fileId}`.
   *
   * REST API Reference for getTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-templates/
   *
   * @param visible Filters the templates by their visibility. (optional)
   * @return MetadataTemplateArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateArrayWrapper getTemplates(@javax.annotation.Nullable Boolean visible) throws ApiException {
    return this.getTemplates(visible, Collections.emptyMap());
  }


  /**
   * Get metadata templates
   * Lists the metadata templates of the portal with their fields, the dictionary a file, a folder or a room is described  with. Any member of the portal can read it, the list is the same for everyone. The call is read-only. The templates  come back ordered by their creation, each with its fields in their display order and the choice options of the choice  fields; the `visible` parameter narrows the list to the templates shown in the pickers or to the hidden ones, without  it both are returned. The author and the last editor of a template come as user objects with the display name and  the avatar, so a list needs no lookup of its own per author. An empty list means the portal has no templates yet.  The custom text fields set on the entries are not templates and are not listed here: read them on the entry with  `GET api/2.0/files/metadata/file/{fileId}`.
   *
   * REST API Reference for getTemplates Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-templates/
   *
   * @param visible Filters the templates by their visibility. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataTemplateArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateArrayWrapper getTemplates(@javax.annotation.Nullable Boolean visible, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("visible", visible));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<MetadataTemplateArrayWrapper> localVarReturnType = new TypeReference<MetadataTemplateArrayWrapper>() {};
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
   * Set file custom fields
   * Sets the custom text fields of a file: free-form name and value pairs that need no template. The caller needs the  right to edit the file. A field is addressed by its name regardless of case: a listed name gets the value, a null or  empty value removes the field from the file, the names not listed are left alone, so a partial request is safe. A name  the portal has not seen yet creates the field for the whole portal, and a name no entry holds a value for any more is  dropped, so the set of names follows the values. A name is at most 255 characters, a value at most 8000, a name may  be listed once and a file holds at most 50 custom fields. The write finishes in the request; the values take part in  the free text search and in the `metadataFilters` of the listings. The answer is the custom fields of the file  after the write. An empty list, a blank, repeated or over-long name, an over-long value or more than 50 fields is  answered with 400; a file the caller cannot edit with 403; a file that does not exist with 404.
   *
   * REST API Reference for setFileCustomFields Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-custom-fields/
   *
   * @param fileId The file ID. (required)
   * @param setCustomFields The custom fields to set. (required)
   * @return CustomFieldValueArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomFieldValueArrayWrapper setFileCustomFields(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SetCustomFields setCustomFields) throws ApiException {
    return this.setFileCustomFields(fileId, setCustomFields, Collections.emptyMap());
  }


  /**
   * Set file custom fields
   * Sets the custom text fields of a file: free-form name and value pairs that need no template. The caller needs the  right to edit the file. A field is addressed by its name regardless of case: a listed name gets the value, a null or  empty value removes the field from the file, the names not listed are left alone, so a partial request is safe. A name  the portal has not seen yet creates the field for the whole portal, and a name no entry holds a value for any more is  dropped, so the set of names follows the values. A name is at most 255 characters, a value at most 8000, a name may  be listed once and a file holds at most 50 custom fields. The write finishes in the request; the values take part in  the free text search and in the `metadataFilters` of the listings. The answer is the custom fields of the file  after the write. An empty list, a blank, repeated or over-long name, an over-long value or more than 50 fields is  answered with 400; a file the caller cannot edit with 403; a file that does not exist with 404.
   *
   * REST API Reference for setFileCustomFields Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-custom-fields/
   *
   * @param fileId The file ID. (required)
   * @param setCustomFields The custom fields to set. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomFieldValueArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomFieldValueArrayWrapper setFileCustomFields(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SetCustomFields setCustomFields, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setCustomFields;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling setFileCustomFields");
    }
    
    // verify the required parameter 'setCustomFields' is set
    if (setCustomFields == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomFields' when calling setFileCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/file/{fileId}/customfields"
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

    TypeReference<CustomFieldValueArrayWrapper> localVarReturnType = new TypeReference<CustomFieldValueArrayWrapper>() {};
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
   * Set file metadata values
   * Writes the values of metadata fields on a file. The caller needs the right to edit the file: a member with editing  access, or an anonymous caller through an external link that grants editing, with the link key in the  `Request-Token` header or in the `share` query parameter; a link that grants viewing, commenting, reviewing or  form filling only is refused. Every field must belong to a template the file carries, assigned with  `PUT api/2.0/files/metadata/file/{fileId}/templates` or inherited from a cascading folder, and a field may be  listed once. A value carries exactly the member of its type: `stringValue` for a text field of at most 8000  characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a choice field, a single option  for a single choice; an empty value clears the field. A date without a time zone offset is read as UTC. The write  finishes in the request, the file is re-indexed for the metadata filters at once. The custom text fields are not  written here: use `PUT api/2.0/files/metadata/file/{fileId}/customFields`. The answer is the whole metadata of the  file after the write, the same shape `GET api/2.0/files/metadata/file/{fileId}` returns. A value of the wrong type,  a field of a template the file does not carry, a field listed twice or a custom field is answered with 400; a  request with neither a session nor a link key with 401; a file the caller cannot edit with 403; a file or a field  that does not exist with 404.
   *
   * REST API Reference for setFileValues Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-values/
   *
   * @param fileId The file ID. (required)
   * @param setMetadataValues The parameters for setting values. (required)
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper setFileValues(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SetMetadataValues setMetadataValues) throws ApiException {
    return this.setFileValues(fileId, setMetadataValues, Collections.emptyMap());
  }


  /**
   * Set file metadata values
   * Writes the values of metadata fields on a file. The caller needs the right to edit the file: a member with editing  access, or an anonymous caller through an external link that grants editing, with the link key in the  `Request-Token` header or in the `share` query parameter; a link that grants viewing, commenting, reviewing or  form filling only is refused. Every field must belong to a template the file carries, assigned with  `PUT api/2.0/files/metadata/file/{fileId}/templates` or inherited from a cascading folder, and a field may be  listed once. A value carries exactly the member of its type: `stringValue` for a text field of at most 8000  characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a choice field, a single option  for a single choice; an empty value clears the field. A date without a time zone offset is read as UTC. The write  finishes in the request, the file is re-indexed for the metadata filters at once. The custom text fields are not  written here: use `PUT api/2.0/files/metadata/file/{fileId}/customFields`. The answer is the whole metadata of the  file after the write, the same shape `GET api/2.0/files/metadata/file/{fileId}` returns. A value of the wrong type,  a field of a template the file does not carry, a field listed twice or a custom field is answered with 400; a  request with neither a session nor a link key with 401; a file the caller cannot edit with 403; a file or a field  that does not exist with 404.
   *
   * REST API Reference for setFileValues Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-values/
   *
   * @param fileId The file ID. (required)
   * @param setMetadataValues The parameters for setting values. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper setFileValues(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull SetMetadataValues setMetadataValues, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setMetadataValues;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling setFileValues");
    }
    
    // verify the required parameter 'setMetadataValues' is set
    if (setMetadataValues == null) {
      throw new ApiException(400, "Missing the required parameter 'setMetadataValues' when calling setFileValues");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/file/{fileId}/values"
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

    TypeReference<EntryMetadataWrapper> localVarReturnType = new TypeReference<EntryMetadataWrapper>() {};
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
   * Set folder custom fields
   * Sets the custom text fields of a folder or a room: free-form name and value pairs that need no template. The  caller needs the right to create in the folder (a room manager or a content creator); for a room that is its  manager. A field is addressed by its name regardless of case: a listed name gets the value, a null or empty value  removes the field, the names not listed are left alone. A new name creates the field for the whole portal, and a  name no entry holds a value for any more is dropped. A name is at most 255 characters, a value at most 8000, a name  may be listed once and a folder holds at most 50 custom fields. The custom fields never cascade to the content of  the folder. The write finishes in the request. The answer is the custom fields of the folder after the write. An empty list, a  blank, repeated or over-long name, an over-long value or more than 50 fields is answered with 400; a caller  without the right to create in the folder with 403; a folder that does not exist with 404.
   *
   * REST API Reference for setFolderCustomFields Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-custom-fields/
   *
   * @param folderId The folder ID. (required)
   * @param setCustomFields The custom fields to set. (required)
   * @return CustomFieldValueArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomFieldValueArrayWrapper setFolderCustomFields(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SetCustomFields setCustomFields) throws ApiException {
    return this.setFolderCustomFields(folderId, setCustomFields, Collections.emptyMap());
  }


  /**
   * Set folder custom fields
   * Sets the custom text fields of a folder or a room: free-form name and value pairs that need no template. The  caller needs the right to create in the folder (a room manager or a content creator); for a room that is its  manager. A field is addressed by its name regardless of case: a listed name gets the value, a null or empty value  removes the field, the names not listed are left alone. A new name creates the field for the whole portal, and a  name no entry holds a value for any more is dropped. A name is at most 255 characters, a value at most 8000, a name  may be listed once and a folder holds at most 50 custom fields. The custom fields never cascade to the content of  the folder. The write finishes in the request. The answer is the custom fields of the folder after the write. An empty list, a  blank, repeated or over-long name, an over-long value or more than 50 fields is answered with 400; a caller  without the right to create in the folder with 403; a folder that does not exist with 404.
   *
   * REST API Reference for setFolderCustomFields Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-custom-fields/
   *
   * @param folderId The folder ID. (required)
   * @param setCustomFields The custom fields to set. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CustomFieldValueArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public CustomFieldValueArrayWrapper setFolderCustomFields(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SetCustomFields setCustomFields, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setCustomFields;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling setFolderCustomFields");
    }
    
    // verify the required parameter 'setCustomFields' is set
    if (setCustomFields == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomFields' when calling setFolderCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/customfields"
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

    TypeReference<CustomFieldValueArrayWrapper> localVarReturnType = new TypeReference<CustomFieldValueArrayWrapper>() {};
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
   * Set folder metadata values
   * Writes the values of metadata fields on a folder or a room. The caller needs the right to create in the folder (a  room manager or a content creator); for a room that is its manager. Every field must belong to a template the  folder carries, assigned with `PUT api/2.0/files/metadata/folder/{folderId}/templates` or inherited from a  cascading folder, and a field may be listed once. A value carries exactly the member of its type: `stringValue` for  a text field of at most 8000 characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a  choice field; an empty value clears the field. The write finishes in the request and touches the folder only: to  push the new values down a cascading folder run the cascade again with `Overwrite`. The custom text fields are written with  `PUT api/2.0/files/metadata/folder/{folderId}/customFields`. The answer is the whole metadata of the folder after  the write. A value of the wrong type, a field listed twice, a custom field or a field of a template the folder  does not carry is answered with 400; a caller without the right to create in the folder with 403; a folder or a  field that does not exist with 404.
   *
   * REST API Reference for setFolderValues Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-values/
   *
   * @param folderId The folder ID. (required)
   * @param setMetadataValues The parameters for setting values. (required)
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper setFolderValues(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SetMetadataValues setMetadataValues) throws ApiException {
    return this.setFolderValues(folderId, setMetadataValues, Collections.emptyMap());
  }


  /**
   * Set folder metadata values
   * Writes the values of metadata fields on a folder or a room. The caller needs the right to create in the folder (a  room manager or a content creator); for a room that is its manager. Every field must belong to a template the  folder carries, assigned with `PUT api/2.0/files/metadata/folder/{folderId}/templates` or inherited from a  cascading folder, and a field may be listed once. A value carries exactly the member of its type: `stringValue` for  a text field of at most 8000 characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a  choice field; an empty value clears the field. The write finishes in the request and touches the folder only: to  push the new values down a cascading folder run the cascade again with `Overwrite`. The custom text fields are written with  `PUT api/2.0/files/metadata/folder/{folderId}/customFields`. The answer is the whole metadata of the folder after  the write. A value of the wrong type, a field listed twice, a custom field or a field of a template the folder  does not carry is answered with 400; a caller without the right to create in the folder with 403; a folder or a  field that does not exist with 404.
   *
   * REST API Reference for setFolderValues Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-values/
   *
   * @param folderId The folder ID. (required)
   * @param setMetadataValues The parameters for setting values. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return EntryMetadataWrapper
   * @throws ApiException if fails to make API call
   */
  public EntryMetadataWrapper setFolderValues(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull SetMetadataValues setMetadataValues, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setMetadataValues;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling setFolderValues");
    }
    
    // verify the required parameter 'setMetadataValues' is set
    if (setMetadataValues == null) {
      throw new ApiException(400, "Missing the required parameter 'setMetadataValues' when calling setFolderValues");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/values"
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

    TypeReference<EntryMetadataWrapper> localVarReturnType = new TypeReference<EntryMetadataWrapper>() {};
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
   * Unassign a template from a file
   * Removes a metadata template from a file together with the values of its fields. The caller needs the right to edit  the file. The removal is irreversible for the values, the template itself stays on the portal and on the other  entries. It applies to a directly assigned template and to one inherited from a cascading folder alike; a later  cascade from that folder assigns it again. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404.
   *
   * REST API Reference for unassignFileTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-file-template/
   *
   * @param fileId The file ID. (required)
   * @param templateId The template ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void unassignFileTemplate(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull Integer templateId) throws ApiException {
    this.unassignFileTemplate(fileId, templateId, Collections.emptyMap());
  }


  /**
   * Unassign a template from a file
   * Removes a metadata template from a file together with the values of its fields. The caller needs the right to edit  the file. The removal is irreversible for the values, the template itself stays on the portal and on the other  entries. It applies to a directly assigned template and to one inherited from a cascading folder alike; a later  cascade from that folder assigns it again. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404.
   *
   * REST API Reference for unassignFileTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-file-template/
   *
   * @param fileId The file ID. (required)
   * @param templateId The template ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void unassignFileTemplate(@javax.annotation.Nonnull Integer fileId, @javax.annotation.Nonnull Integer templateId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling unassignFileTemplate");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling unassignFileTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/file/{fileId}/templates/{templateId}"
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fileId)))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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
   * Unassign a template from a folder
   * Removes a metadata template from a folder or a room together with the values of its fields. The caller needs the  right to create content in the folder, that is a room manager or a content creator; for a room that is its  manager. When the template was cascaded from this folder, the  cascade stops here: the folders and files below keep the template and their values as a direct assignment of their  own, and there is no bulk rollback. To take the template off them as well, remove it entry by entry with  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`. A pass of the cascade still running is stopped  for this template. To stop the cascade and keep the template and its values on the folder use  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}` with `cascade` false instead. A caller  without the right to create in the folder is answered with 403; a folder, or a template, that does not exist with 404.
   *
   * REST API Reference for unassignFolderTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-folder-template/
   *
   * @param folderId The folder ID. (required)
   * @param templateId The template ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void unassignFolderTemplate(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull Integer templateId) throws ApiException {
    this.unassignFolderTemplate(folderId, templateId, Collections.emptyMap());
  }


  /**
   * Unassign a template from a folder
   * Removes a metadata template from a folder or a room together with the values of its fields. The caller needs the  right to create content in the folder, that is a room manager or a content creator; for a room that is its  manager. When the template was cascaded from this folder, the  cascade stops here: the folders and files below keep the template and their values as a direct assignment of their  own, and there is no bulk rollback. To take the template off them as well, remove it entry by entry with  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`. A pass of the cascade still running is stopped  for this template. To stop the cascade and keep the template and its values on the folder use  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}` with `cascade` false instead. A caller  without the right to create in the folder is answered with 403; a folder, or a template, that does not exist with 404.
   *
   * REST API Reference for unassignFolderTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-folder-template/
   *
   * @param folderId The folder ID. (required)
   * @param templateId The template ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void unassignFolderTemplate(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull Integer templateId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling unassignFolderTemplate");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling unassignFolderTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/templates/{templateId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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
   * Update a metadata field
   * Changes the name, the type, the options or the display order of a metadata field. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value. The type can be changed only while no entry  holds a value for the field, and an option can be removed only while no entry has selected it; a new option is sent  without an identifier and gets one in the answer. A new name must be unique within the template regardless of case.  The values already written are left as they are. The field is addressed through its own template: a field reached  through another template's route is answered with 404, the same as a field that does not exist. A conflicting name,  a type change on a field with values or the removal of an option in use is answered with 400.
   *
   * REST API Reference for updateField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-field/
   *
   * @param templateId The template ID. (required)
   * @param fieldId The field ID. (required)
   * @param updateMetadataFieldRequest The parameters of the field update. (required)
   * @return MetadataFieldWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataFieldWrapper updateField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull Integer fieldId, @javax.annotation.Nonnull UpdateMetadataFieldRequest updateMetadataFieldRequest) throws ApiException {
    return this.updateField(templateId, fieldId, updateMetadataFieldRequest, Collections.emptyMap());
  }


  /**
   * Update a metadata field
   * Changes the name, the type, the options or the display order of a metadata field. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value. The type can be changed only while no entry  holds a value for the field, and an option can be removed only while no entry has selected it; a new option is sent  without an identifier and gets one in the answer. A new name must be unique within the template regardless of case.  The values already written are left as they are. The field is addressed through its own template: a field reached  through another template's route is answered with 404, the same as a field that does not exist. A conflicting name,  a type change on a field with values or the removal of an option in use is answered with 400.
   *
   * REST API Reference for updateField Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-field/
   *
   * @param templateId The template ID. (required)
   * @param fieldId The field ID. (required)
   * @param updateMetadataFieldRequest The parameters of the field update. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataFieldWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataFieldWrapper updateField(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull Integer fieldId, @javax.annotation.Nonnull UpdateMetadataFieldRequest updateMetadataFieldRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMetadataFieldRequest;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateField");
    }
    
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling updateField");
    }
    
    // verify the required parameter 'updateMetadataFieldRequest' is set
    if (updateMetadataFieldRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMetadataFieldRequest' when calling updateField");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)))
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(apiClient.parameterToString(fieldId)));

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

    TypeReference<MetadataFieldWrapper> localVarReturnType = new TypeReference<MetadataFieldWrapper>() {};
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
   * Update a template assignment on a folder
   * Turns the cascade of a metadata template the folder or the room already carries on or off, without taking the  template off the folder. The template must be assigned first, with `PUT api/2.0/files/metadata/folder/{folderId}/templates`  or inherited from a folder above. The caller needs the right to create in the folder (a room manager  or a content creator); for a room that is its manager. With `cascade` true the template is marked as cascading with  the given `conflictResolveType`, an inherited assignment becomes the folder's own, and the pass the assignment runs  is queued, also when the cascade was already on: the answer is that pass, poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true. With `cascade` false  the folder keeps the template and its values, the entries below keep them as their own, entries created later no  longer inherit the template from this folder, a running pass stops at its next batch, and the answer is a completed  operation without an identifier; `conflictResolveType` is ignored and a cascade already off stays so. A caller  without the right to create in the folder is answered with 403; a folder or a template that does not exist, or a  template the folder does not carry, with 404.
   *
   * REST API Reference for updateFolderTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-folder-template/
   *
   * @param folderId The folder ID. (required)
   * @param templateId The ID of a template the folder already carries. (required)
   * @param updateFolderMetadataTemplateRequest The new state of the assignment. (required)
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper updateFolderTemplate(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull UpdateFolderMetadataTemplateRequest updateFolderMetadataTemplateRequest) throws ApiException {
    return this.updateFolderTemplate(folderId, templateId, updateFolderMetadataTemplateRequest, Collections.emptyMap());
  }


  /**
   * Update a template assignment on a folder
   * Turns the cascade of a metadata template the folder or the room already carries on or off, without taking the  template off the folder. The template must be assigned first, with `PUT api/2.0/files/metadata/folder/{folderId}/templates`  or inherited from a folder above. The caller needs the right to create in the folder (a room manager  or a content creator); for a room that is its manager. With `cascade` true the template is marked as cascading with  the given `conflictResolveType`, an inherited assignment becomes the folder's own, and the pass the assignment runs  is queued, also when the cascade was already on: the answer is that pass, poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true. With `cascade` false  the folder keeps the template and its values, the entries below keep them as their own, entries created later no  longer inherit the template from this folder, a running pass stops at its next batch, and the answer is a completed  operation without an identifier; `conflictResolveType` is ignored and a cascade already off stays so. A caller  without the right to create in the folder is answered with 403; a folder or a template that does not exist, or a  template the folder does not carry, with 404.
   *
   * REST API Reference for updateFolderTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-folder-template/
   *
   * @param folderId The folder ID. (required)
   * @param templateId The ID of a template the folder already carries. (required)
   * @param updateFolderMetadataTemplateRequest The new state of the assignment. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataOperationWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataOperationWrapper updateFolderTemplate(@javax.annotation.Nonnull Integer folderId, @javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull UpdateFolderMetadataTemplateRequest updateFolderMetadataTemplateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateFolderMetadataTemplateRequest;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling updateFolderTemplate");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateFolderTemplate");
    }
    
    // verify the required parameter 'updateFolderMetadataTemplateRequest' is set
    if (updateFolderMetadataTemplateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateFolderMetadataTemplateRequest' when calling updateFolderTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/folder/{folderId}/templates/{templateId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(apiClient.parameterToString(folderId)))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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

    TypeReference<MetadataOperationWrapper> localVarReturnType = new TypeReference<MetadataOperationWrapper>() {};
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
   * Update a metadata template
   * Renames a metadata template or changes whether it is shown in the pickers. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value, the fields are not touched here and are  changed with `PUT api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}`. The new name follows the rules  of the creation: unique on the portal regardless of case and at most 255 characters. The answer is the whole template  with its fields. A template that does not exist is answered with 404, a name already in use or too long with 400.
   *
   * REST API Reference for updateTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-template/
   *
   * @param templateId The template ID. (required)
   * @param updateMetadataTemplate The parameters for updating the template. (required)
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper updateTemplate(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull UpdateMetadataTemplate updateMetadataTemplate) throws ApiException {
    return this.updateTemplate(templateId, updateMetadataTemplate, Collections.emptyMap());
  }


  /**
   * Update a metadata template
   * Renames a metadata template or changes whether it is shown in the pickers. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value, the fields are not touched here and are  changed with `PUT api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}`. The new name follows the rules  of the creation: unique on the portal regardless of case and at most 255 characters. The answer is the whole template  with its fields. A template that does not exist is answered with 404, a name already in use or too long with 400.
   *
   * REST API Reference for updateTemplate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-template/
   *
   * @param templateId The template ID. (required)
   * @param updateMetadataTemplate The parameters for updating the template. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return MetadataTemplateWrapper
   * @throws ApiException if fails to make API call
   */
  public MetadataTemplateWrapper updateTemplate(@javax.annotation.Nonnull Integer templateId, @javax.annotation.Nonnull UpdateMetadataTemplate updateMetadataTemplate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateMetadataTemplate;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplate");
    }
    
    // verify the required parameter 'updateMetadataTemplate' is set
    if (updateMetadataTemplate == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMetadataTemplate' when calling updateTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/metadata/templates/{templateId}"
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(apiClient.parameterToString(templateId)));

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

    TypeReference<MetadataTemplateWrapper> localVarReturnType = new TypeReference<MetadataTemplateWrapper>() {};
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
