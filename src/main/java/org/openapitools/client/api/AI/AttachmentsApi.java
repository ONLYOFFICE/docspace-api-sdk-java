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
   * Delete one attachment
   * Permanently deletes one attachment, whether it is still a draft or already bound to a message. The ID is not validated here, so a malformed one surfaces as an error relayed from storage rather than as a 400, and an ID that does not exist answers success without deleting anything. Deleting a bound attachment leaves the message in place without it. The deletion cannot be undone.
   *
   * REST API Reference for aiAttachmentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
   *
   * @param body The ID of the attachment to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAttachmentsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete one attachment
   * Permanently deletes one attachment, whether it is still a draft or already bound to a message. The ID is not validated here, so a malformed one surfaces as an error relayed from storage rather than as a 400, and an ID that does not exist answers success without deleting anything. Deleting a bound attachment leaves the message in place without it. The deletion cannot be undone.
   *
   * REST API Reference for aiAttachmentsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
   *
   * @param body The ID of the attachment to delete, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Permanently deletes several attachments in one round trip. `ids` is optional and an absent value is treated as an empty list, so a malformed request quietly deletes nothing instead of failing. IDs that do not exist are skipped without being reported, so the answer confirms only that the call was accepted. The deletions cannot be undone.
   *
   * REST API Reference for aiAttachmentsDeleteMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
   *
   * @param requestBody The IDs of the attachments to delete, as a bare JSON array of strings. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsDeleteMany(@javax.annotation.Nonnull List<String> requestBody) throws ApiException {
    return this.aiAttachmentsDeleteMany(requestBody, Collections.emptyMap());
  }


  /**
   * Delete many
   * Permanently deletes several attachments in one round trip. `ids` is optional and an absent value is treated as an empty list, so a malformed request quietly deletes nothing instead of failing. IDs that do not exist are skipped without being reported, so the answer confirms only that the call was accepted. The deletions cannot be undone.
   *
   * REST API Reference for aiAttachmentsDeleteMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
   *
   * @param requestBody The IDs of the attachments to delete, as a bare JSON array of strings. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Get one attachment
   * Returns one attachment by its ID, whether it is still a draft or already bound to a message. The ID is required and has to be a non-empty string. An ID that no longer exists is not reported as 404: the answer is a null body with status 200, so treat a missing payload as no such attachment. Use `POST api/2.0/ai/attachments/get-many` to read several at once.
   *
   * REST API Reference for aiAttachmentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
   *
   * @param body The ID of the attachment to read, as a bare JSON string. (required)
   * @return AiAttachment
   * @throws ApiException if fails to make API call
   */
  public AiAttachment aiAttachmentsGet(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAttachmentsGet(body, Collections.emptyMap());
  }


  /**
   * Get one attachment
   * Returns one attachment by its ID, whether it is still a draft or already bound to a message. The ID is required and has to be a non-empty string. An ID that no longer exists is not reported as 404: the answer is a null body with status 200, so treat a missing payload as no such attachment. Use `POST api/2.0/ai/attachments/get-many` to read several at once.
   *
   * REST API Reference for aiAttachmentsGet Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
   *
   * @param body The ID of the attachment to read, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Returns several attachments in one call, aligned by position with the `ids` that were sent, so the answer can be zipped straight onto the request. An ID that no longer exists leaves its slot empty rather than shortening the list, which is how a caller tells which of them are gone. `ids` has to be present and non-empty - an empty batch is rejected rather than answered with an empty list. Nothing is changed by the call.
   *
   * REST API Reference for aiAttachmentsGetMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
   *
   * @param requestBody The IDs of the attachments to read, as a bare JSON array of strings. The answer is aligned with this array by position. (required)
   * @return List&lt;AiAttachment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiAttachment> aiAttachmentsGetMany(@javax.annotation.Nonnull List<String> requestBody) throws ApiException {
    return this.aiAttachmentsGetMany(requestBody, Collections.emptyMap());
  }


  /**
   * Get many
   * Returns several attachments in one call, aligned by position with the `ids` that were sent, so the answer can be zipped straight onto the request. An ID that no longer exists leaves its slot empty rather than shortening the list, which is how a caller tells which of them are gone. `ids` has to be present and non-empty - an empty batch is rejected rather than answered with an empty list. Nothing is changed by the call.
   *
   * REST API Reference for aiAttachmentsGetMany Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
   *
   * @param requestBody The IDs of the attachments to read, as a bare JSON array of strings. The answer is aligned with this array by position. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Get suggested questions
   * 
   *
   * REST API Reference for aiAttachmentsGetSuggestedQuestions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-suggested-questions/
   *
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsGetSuggestedQuestions(@javax.annotation.Nonnull Map<String, Object> requestBody) throws ApiException {
    return this.aiAttachmentsGetSuggestedQuestions(requestBody, Collections.emptyMap());
  }


  /**
   * Get suggested questions
   * 
   *
   * REST API Reference for aiAttachmentsGetSuggestedQuestions Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-suggested-questions/
   *
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAttachmentsGetSuggestedQuestions(@javax.annotation.Nonnull Map<String, Object> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiAttachmentsGetSuggestedQuestions");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/attachments/suggested-questions";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Link to message
   * Binds draft attachments to the chat message that owns them, after that message has been persisted, so that deleting the message removes them too. All three of `ids`, `messageId` and `threadId` are required, and the references are verified rather than trusted: an unknown message answers 404, a message that belongs to a different thread answers 400, and attachments that no longer exist answer 404 naming each missing ID. That verification exists because the underlying binding call skips unknown IDs silently, which used to report success for a link that had not happened. Drafts stay unbound until this succeeds.
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
   * Binds draft attachments to the chat message that owns them, after that message has been persisted, so that deleting the message removes them too. All three of `ids`, `messageId` and `threadId` are required, and the references are verified rather than trusted: an unknown message answers 404, a message that belongs to a different thread answers 400, and attachments that no longer exist answer 404 naming each missing ID. That verification exists because the underlying binding call skips unknown IDs silently, which used to report success for a link that had not happened. Drafts stay unbound until this succeeds.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Stores one file attachment as a draft and returns it, so its ID can be attached to a message later. `input` carries the host `path` - the DocSpace entry ID the AI backend resolves server-side - the text `content` already extracted from that file, the ONLYOFFICE numeric file `type`, and optionally a `title`; the text is what the model reads, so this operation does not open the file itself. Archives are refused outright, whatever their declared name says. Drafts are not bound to a conversation until `POST api/2.0/ai/attachments/link-to-message` is called, so an unlinked draft outlives the round that created it.
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
   * Stores one file attachment as a draft and returns it, so its ID can be attached to a message later. `input` carries the host `path` - the DocSpace entry ID the AI backend resolves server-side - the text `content` already extracted from that file, the ONLYOFFICE numeric file `type`, and optionally a `title`; the text is what the model reads, so this operation does not open the file itself. Archives are refused outright, whatever their declared name says. Drafts are not bound to a conversation until `POST api/2.0/ai/attachments/link-to-message` is called, so an unlinked draft outlives the round that created it.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Stores several file attachments as drafts in one round trip and returns them in the order they were sent. Each entry is validated exactly as the single-file operation validates its `input`, and the first bad one rejects the whole batch with its index named in the message - nothing is stored. `inputs` has to be present and an array: an absent or null value is a malformed request rather than an empty batch, and only an explicit empty array means no files. Follow up with `POST api/2.0/ai/attachments/link-to-message` to bind the drafts to a message.
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
   * Stores several file attachments as drafts in one round trip and returns them in the order they were sent. Each entry is validated exactly as the single-file operation validates its `input`, and the first bad one rejects the whole batch with its index named in the message - nothing is stored. `inputs` has to be present and an array: an absent or null value is a malformed request rather than an empty batch, and only an explicit empty array means no files. Follow up with `POST api/2.0/ai/attachments/link-to-message` to bind the drafts to a message.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
