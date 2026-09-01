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

package org.openapitools.client.api.AI;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.AiAttachment;
import org.openapitools.client.model.AiAttachmentsLinkToMessageRequest;
import org.openapitools.client.model.AiAttachmentsSaveFileRequest;
import org.openapitools.client.model.AiAttachmentsSaveFilesManyRequest;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AttachmentsApi extends BaseApi {

  public AttachmentsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Delete
   * Permanently deletes one attachment, whether it is still a draft or already linked to a message.
   *
   * REST API Reference for aiAttachmentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAttachmentsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete
   * Permanently deletes one attachment, whether it is still a draft or already linked to a message.
   *
   * REST API Reference for aiAttachmentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDelete(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiAttachmentsDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/delete";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Delete many
   * Permanently deletes a batch of attachments in a single round trip.
   *
   * REST API Reference for aiAttachmentsDeleteMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
   *
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDeleteMany(@javax.annotation.Nonnull List<String> requestBody) throws ApiException {
    return this.aiAttachmentsDeleteMany(requestBody, Collections.emptyMap());
  }


  /**
   * Delete many
   * Permanently deletes a batch of attachments in a single round trip.
   *
   * REST API Reference for aiAttachmentsDeleteMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
   *
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDeleteMany(@javax.annotation.Nonnull List<String> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiAttachmentsDeleteMany");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/delete-many";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Get
   * Returns one attachment by identifier.
   *
   * REST API Reference for aiAttachmentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
   *
   * @param body  (required)
   * @return AiAttachment
   * @throws ApiException if fails to make API call
   */
  public AiAttachment aiAttachmentsGet(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAttachmentsGet(body, Collections.emptyMap());
  }


  /**
   * Get
   * Returns one attachment by identifier.
   *
   * REST API Reference for aiAttachmentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiAttachment
   * @throws ApiException if fails to make API call
   */
  public AiAttachment aiAttachmentsGet(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiAttachmentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/get";

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

    TypeReference<AiAttachment> localVarReturnType = new TypeReference<AiAttachment>() {};
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
   * Get many
   * Returns a batch of attachments, preserving the requested order; an identifier that no longer exists comes back empty.
   *
   * REST API Reference for aiAttachmentsGetMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
   *
   * @param requestBody  (required)
   * @return List&lt;AiAttachment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiAttachment> aiAttachmentsGetMany(@javax.annotation.Nonnull List<String> requestBody) throws ApiException {
    return this.aiAttachmentsGetMany(requestBody, Collections.emptyMap());
  }


  /**
   * Get many
   * Returns a batch of attachments, preserving the requested order; an identifier that no longer exists comes back empty.
   *
   * REST API Reference for aiAttachmentsGetMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
   *
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiAttachment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiAttachment> aiAttachmentsGetMany(@javax.annotation.Nonnull List<String> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiAttachmentsGetMany");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/get-many";

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

    TypeReference<List<AiAttachment>> localVarReturnType = new TypeReference<List<AiAttachment>>() {};
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
   * Link to message
   * Binds draft attachments to the chat message that owns them, once that message has been persisted, so deleting the message removes them too. Identifiers that no longer exist are skipped.
   *
   * REST API Reference for aiAttachmentsLinkToMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/
   *
   * @param aiAttachmentsLinkToMessageRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsLinkToMessage(@javax.annotation.Nonnull AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest) throws ApiException {
    return this.aiAttachmentsLinkToMessage(aiAttachmentsLinkToMessageRequest, Collections.emptyMap());
  }


  /**
   * Link to message
   * Binds draft attachments to the chat message that owns them, once that message has been persisted, so deleting the message removes them too. Identifiers that no longer exist are skipped.
   *
   * REST API Reference for aiAttachmentsLinkToMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/
   *
   * @param aiAttachmentsLinkToMessageRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsLinkToMessage(@javax.annotation.Nonnull AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAttachmentsLinkToMessageRequest;
    
    // verify the required parameter 'aiAttachmentsLinkToMessageRequest' is set
    if (aiAttachmentsLinkToMessageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAttachmentsLinkToMessageRequest' when calling aiAttachmentsLinkToMessage");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/link-to-message";

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

    TypeReference<AiSuccessResponse> localVarReturnType = new TypeReference<AiSuccessResponse>() {};
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
   * Save file
   * Stores one file attachment as a draft, carrying the host-extracted text of the file. Prefer `save-files-many` when adding several files at once so they land as one round trip.
   *
   * REST API Reference for aiAttachmentsSaveFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/
   *
   * @param aiAttachmentsSaveFileRequest  (required)
   * @return AiAttachment
   * @throws ApiException if fails to make API call
   */
  public AiAttachment aiAttachmentsSaveFile(@javax.annotation.Nonnull AiAttachmentsSaveFileRequest aiAttachmentsSaveFileRequest) throws ApiException {
    return this.aiAttachmentsSaveFile(aiAttachmentsSaveFileRequest, Collections.emptyMap());
  }


  /**
   * Save file
   * Stores one file attachment as a draft, carrying the host-extracted text of the file. Prefer `save-files-many` when adding several files at once so they land as one round trip.
   *
   * REST API Reference for aiAttachmentsSaveFile Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/
   *
   * @param aiAttachmentsSaveFileRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiAttachment
   * @throws ApiException if fails to make API call
   */
  public AiAttachment aiAttachmentsSaveFile(@javax.annotation.Nonnull AiAttachmentsSaveFileRequest aiAttachmentsSaveFileRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAttachmentsSaveFileRequest;
    
    // verify the required parameter 'aiAttachmentsSaveFileRequest' is set
    if (aiAttachmentsSaveFileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAttachmentsSaveFileRequest' when calling aiAttachmentsSaveFile");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/save-file";

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

    TypeReference<AiAttachment> localVarReturnType = new TypeReference<AiAttachment>() {};
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
   * Save files many
   * Stores a batch of file attachments as drafts in a single round trip. The returned records keep the order of the input.
   *
   * REST API Reference for aiAttachmentsSaveFilesMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/
   *
   * @param aiAttachmentsSaveFilesManyRequest  (required)
   * @return List&lt;AiAttachment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiAttachment> aiAttachmentsSaveFilesMany(@javax.annotation.Nonnull AiAttachmentsSaveFilesManyRequest aiAttachmentsSaveFilesManyRequest) throws ApiException {
    return this.aiAttachmentsSaveFilesMany(aiAttachmentsSaveFilesManyRequest, Collections.emptyMap());
  }


  /**
   * Save files many
   * Stores a batch of file attachments as drafts in a single round trip. The returned records keep the order of the input.
   *
   * REST API Reference for aiAttachmentsSaveFilesMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/
   *
   * @param aiAttachmentsSaveFilesManyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiAttachment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiAttachment> aiAttachmentsSaveFilesMany(@javax.annotation.Nonnull AiAttachmentsSaveFilesManyRequest aiAttachmentsSaveFilesManyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAttachmentsSaveFilesManyRequest;
    
    // verify the required parameter 'aiAttachmentsSaveFilesManyRequest' is set
    if (aiAttachmentsSaveFilesManyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAttachmentsSaveFilesManyRequest' when calling aiAttachmentsSaveFilesMany");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/save-files-many";

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

    TypeReference<List<AiAttachment>> localVarReturnType = new TypeReference<List<AiAttachment>>() {};
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
