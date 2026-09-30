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

import org.openapitools.client.model.AiCreatePromptInput;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiFolderMutationResult;
import org.openapitools.client.model.AiImportResult;
import org.openapitools.client.model.AiPrompt;
import org.openapitools.client.model.AiPromptBundle;
import org.openapitools.client.model.AiPromptFolder;
import org.openapitools.client.model.AiPromptMutationResult;
import org.openapitools.client.model.AiPromptsImportBundleRequest;
import org.openapitools.client.model.AiPromptsMoveRequest;
import org.openapitools.client.model.AiPromptsRenameFolderRequest;
import org.openapitools.client.model.AiPromptsUpdateRequest;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PromptsApi extends BaseApi {

  public PromptsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PromptsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Save a prompt
   * Saves a new prompt in the caller's own prompt library and returns it. The name has to be non-empty and unique inside its folder, and `folderId` has to name an existing folder - omit it to save the prompt at the root. Prompts are per-user: another user's library is never visible here, and no permission beyond having AI enabled is needed. The answer carries the stored prompt including the ID to use with the update, move and delete operations.
   *
   * REST API Reference for aiPromptsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/
   *
   * @param aiCreatePromptInput  (required)
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsCreate(@javax.annotation.Nonnull AiCreatePromptInput aiCreatePromptInput) throws ApiException {
    return this.aiPromptsCreate(aiCreatePromptInput, Collections.emptyMap());
  }


  /**
   * Save a prompt
   * Saves a new prompt in the caller's own prompt library and returns it. The name has to be non-empty and unique inside its folder, and `folderId` has to name an existing folder - omit it to save the prompt at the root. Prompts are per-user: another user's library is never visible here, and no permission beyond having AI enabled is needed. The answer carries the stored prompt including the ID to use with the update, move and delete operations.
   *
   * REST API Reference for aiPromptsCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/
   *
   * @param aiCreatePromptInput  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsCreate(@javax.annotation.Nonnull AiCreatePromptInput aiCreatePromptInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiCreatePromptInput;
    
    // verify the required parameter 'aiCreatePromptInput' is set
    if (aiCreatePromptInput == null) {
      throw new ApiException(400, "Missing the required parameter 'aiCreatePromptInput' when calling aiPromptsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/create";

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

    TypeReference<AiPromptMutationResult> localVarReturnType = new TypeReference<AiPromptMutationResult>() {};
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
   * Create folder
   * Creates a folder in the caller's prompt library and returns it. The name has to be non-empty and unique across that library. Folders do not nest: there is one flat level, so a folder cannot be created inside another. The answer carries the folder ID to use as `folderId` when saving or moving prompts.
   *
   * REST API Reference for aiPromptsCreateFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
   *
   * @param body The name of the folder to create, as a bare JSON string. (required)
   * @return AiFolderMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiFolderMutationResult aiPromptsCreateFolder(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsCreateFolder(body, Collections.emptyMap());
  }


  /**
   * Create folder
   * Creates a folder in the caller's prompt library and returns it. The name has to be non-empty and unique across that library. Folders do not nest: there is one flat level, so a folder cannot be created inside another. The answer carries the folder ID to use as `folderId` when saving or moving prompts.
   *
   * REST API Reference for aiPromptsCreateFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
   *
   * @param body The name of the folder to create, as a bare JSON string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiFolderMutationResult aiPromptsCreateFolder(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiPromptsCreateFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/create-folder";

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

    TypeReference<AiFolderMutationResult> localVarReturnType = new TypeReference<AiFolderMutationResult>() {};
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
   * Delete a saved prompt
   * Deletes one saved prompt from the caller's library. The ID may be sent in the body or as a query parameter, and it is required. An ID that does not exist, or that belongs to another user, is not reported: the call answers success without deleting anything. The deletion is permanent.
   *
   * REST API Reference for aiPromptsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
   *
   * @param body The ID of the prompt to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete a saved prompt
   * Deletes one saved prompt from the caller's library. The ID may be sent in the body or as a query parameter, and it is required. An ID that does not exist, or that belongs to another user, is not reported: the call answers success without deleting anything. The deletion is permanent.
   *
   * REST API Reference for aiPromptsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
   *
   * @param body The ID of the prompt to delete, as a bare JSON string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDelete(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiPromptsDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/delete";

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
   * Delete folder
   * Deletes a folder together with every prompt inside it, permanently. The ID is required and may be sent in the body or as a query parameter. Unlike deleting a prompt, this checks first: a folder that does not exist, and one that belongs to another user, both answer 404 - the two cases are deliberately indistinguishable, so a foreign folder cannot be probed. Move the prompts out with `PUT api/2.0/ai/prompts/move` first if they should survive.
   *
   * REST API Reference for aiPromptsDeleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
   *
   * @param body The ID of the folder to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDeleteFolder(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsDeleteFolder(body, Collections.emptyMap());
  }


  /**
   * Delete folder
   * Deletes a folder together with every prompt inside it, permanently. The ID is required and may be sent in the body or as a query parameter. Unlike deleting a prompt, this checks first: a folder that does not exist, and one that belongs to another user, both answer 404 - the two cases are deliberately indistinguishable, so a foreign folder cannot be probed. Move the prompts out with `PUT api/2.0/ai/prompts/move` first if they should survive.
   *
   * REST API Reference for aiPromptsDeleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
   *
   * @param body The ID of the folder to delete, as a bare JSON string. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDeleteFolder(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiPromptsDeleteFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/delete-folder";

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
   * Export the prompt library
   * Builds a versioned bundle of every prompt and folder in the caller's library and returns it, with no parameters. The bundle is self-contained: it carries its own format version so an older export can still be read back, and it is the input `POST api/2.0/ai/prompts/import-bundle` expects. This is also the only way to read the whole library at once, since listing is folder-scoped. Nothing is changed by the call.
   *
   * REST API Reference for aiPromptsExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/
   *
   * @return AiPromptBundle
   * @throws ApiException if fails to make API call
   */
  public AiPromptBundle aiPromptsExport() throws ApiException {
    return this.aiPromptsExport(Collections.emptyMap());
  }


  /**
   * Export the prompt library
   * Builds a versioned bundle of every prompt and folder in the caller's library and returns it, with no parameters. The bundle is self-contained: it carries its own format version so an older export can still be read back, and it is the input `POST api/2.0/ai/prompts/import-bundle` expects. This is also the only way to read the whole library at once, since listing is folder-scoped. Nothing is changed by the call.
   *
   * REST API Reference for aiPromptsExport Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPromptBundle
   * @throws ApiException if fails to make API call
   */
  public AiPromptBundle aiPromptsExport(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/export";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiPromptBundle> localVarReturnType = new TypeReference<AiPromptBundle>() {};
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
   * Get a saved prompt
   * Returns one saved prompt by its ID. The ID is required and is read from the query. An ID that is unknown, or that belongs to another user, is not reported as 404: the answer is an empty body with status 200, so treat a missing payload as no such prompt. Prompt IDs come from `GET api/2.0/ai/prompts/list` or from the answer of the create operation.
   *
   * REST API Reference for aiPromptsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
   *
   * @param id The saved prompt identifier. (required)
   * @return AiPrompt
   * @throws ApiException if fails to make API call
   */
  public AiPrompt aiPromptsGetById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiPromptsGetById(id, Collections.emptyMap());
  }


  /**
   * Get a saved prompt
   * Returns one saved prompt by its ID. The ID is required and is read from the query. An ID that is unknown, or that belongs to another user, is not reported as 404: the answer is an empty body with status 200, so treat a missing payload as no such prompt. Prompt IDs come from `GET api/2.0/ai/prompts/list` or from the answer of the create operation.
   *
   * REST API Reference for aiPromptsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
   *
   * @param id The saved prompt identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPrompt
   * @throws ApiException if fails to make API call
   */
  public AiPrompt aiPromptsGetById(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiPromptsGetById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/get-by-id";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiPrompt> localVarReturnType = new TypeReference<AiPrompt>() {};
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
   * Get a prompt folder
   * Returns one folder of the caller's prompt library by its ID, without the prompts inside it. The ID is required and is read from the query. An unknown or foreign ID is not reported as 404: the answer is an empty body with status 200. This differs from the delete operation on the same ID, which does answer 404.
   *
   * REST API Reference for aiPromptsGetFolderById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
   *
   * @param id The prompt folder identifier. (required)
   * @return AiPromptFolder
   * @throws ApiException if fails to make API call
   */
  public AiPromptFolder aiPromptsGetFolderById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiPromptsGetFolderById(id, Collections.emptyMap());
  }


  /**
   * Get a prompt folder
   * Returns one folder of the caller's prompt library by its ID, without the prompts inside it. The ID is required and is read from the query. An unknown or foreign ID is not reported as 404: the answer is an empty body with status 200. This differs from the delete operation on the same ID, which does answer 404.
   *
   * REST API Reference for aiPromptsGetFolderById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
   *
   * @param id The prompt folder identifier. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPromptFolder
   * @throws ApiException if fails to make API call
   */
  public AiPromptFolder aiPromptsGetFolderById(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiPromptsGetFolderById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/get-folder-by-id";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiPromptFolder> localVarReturnType = new TypeReference<AiPromptFolder>() {};
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
   * Import bundle
   * Writes a bundle produced by `GET api/2.0/ai/prompts/export` back into the caller's library. `mode` decides how: `replace` deletes the current prompts and folders before writing, and `merge` writes the bundle on top of what is already there. The folder references inside the bundle are validated before anything is written, so a corrupt bundle is rejected whole rather than applied halfway. `replace` is destructive and cannot be undone - export first if the current library matters.
   *
   * REST API Reference for aiPromptsImportBundle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/
   *
   * @param aiPromptsImportBundleRequest  (required)
   * @return AiImportResult
   * @throws ApiException if fails to make API call
   */
  public AiImportResult aiPromptsImportBundle(@javax.annotation.Nonnull AiPromptsImportBundleRequest aiPromptsImportBundleRequest) throws ApiException {
    return this.aiPromptsImportBundle(aiPromptsImportBundleRequest, Collections.emptyMap());
  }


  /**
   * Import bundle
   * Writes a bundle produced by `GET api/2.0/ai/prompts/export` back into the caller's library. `mode` decides how: `replace` deletes the current prompts and folders before writing, and `merge` writes the bundle on top of what is already there. The folder references inside the bundle are validated before anything is written, so a corrupt bundle is rejected whole rather than applied halfway. `replace` is destructive and cannot be undone - export first if the current library matters.
   *
   * REST API Reference for aiPromptsImportBundle Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/
   *
   * @param aiPromptsImportBundleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiImportResult
   * @throws ApiException if fails to make API call
   */
  public AiImportResult aiPromptsImportBundle(@javax.annotation.Nonnull AiPromptsImportBundleRequest aiPromptsImportBundleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiPromptsImportBundleRequest;
    
    // verify the required parameter 'aiPromptsImportBundleRequest' is set
    if (aiPromptsImportBundleRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiPromptsImportBundleRequest' when calling aiPromptsImportBundle");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/import-bundle";

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

    TypeReference<AiImportResult> localVarReturnType = new TypeReference<AiImportResult>() {};
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
   * List saved prompts
   * Lists the caller's saved prompts, newest first. `folderId` scopes the answer to one folder, and omitting it - or sending it empty - lists the prompts that sit at the root rather than every prompt, because the client fetcher cannot tell an absent value from a null one. There is therefore no way to ask for the whole library in one call: walk the folders from `GET api/2.0/ai/prompts/list-folders`, or take everything at once with `GET api/2.0/ai/prompts/export`. The prompts of other users are never included.
   *
   * REST API Reference for aiPromptsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
   *
   * @param folderId The prompt folder identifier. Omit to list the prompts that sit outside any folder. (optional)
   * @return List&lt;AiPrompt&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPrompt> aiPromptsList(@javax.annotation.Nullable String folderId) throws ApiException {
    return this.aiPromptsList(folderId, Collections.emptyMap());
  }


  /**
   * List saved prompts
   * Lists the caller's saved prompts, newest first. `folderId` scopes the answer to one folder, and omitting it - or sending it empty - lists the prompts that sit at the root rather than every prompt, because the client fetcher cannot tell an absent value from a null one. There is therefore no way to ask for the whole library in one call: walk the folders from `GET api/2.0/ai/prompts/list-folders`, or take everything at once with `GET api/2.0/ai/prompts/export`. The prompts of other users are never included.
   *
   * REST API Reference for aiPromptsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
   *
   * @param folderId The prompt folder identifier. Omit to list the prompts that sit outside any folder. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiPrompt&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPrompt> aiPromptsList(@javax.annotation.Nullable String folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/list";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("folderId", folderId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<List<AiPrompt>> localVarReturnType = new TypeReference<List<AiPrompt>>() {};
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
   * List folders
   * Lists every folder of the caller's prompt library, newest first, with no parameters and no pagination. Folders are flat, so the answer is a single list rather than a tree. The prompts inside them are not included - read those with `GET api/2.0/ai/prompts/list` per folder. Another user's folders are never listed.
   *
   * REST API Reference for aiPromptsListFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/
   *
   * @return List&lt;AiPromptFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPromptFolder> aiPromptsListFolders() throws ApiException {
    return this.aiPromptsListFolders(Collections.emptyMap());
  }


  /**
   * List folders
   * Lists every folder of the caller's prompt library, newest first, with no parameters and no pagination. Folders are flat, so the answer is a single list rather than a tree. The prompts inside them are not included - read those with `GET api/2.0/ai/prompts/list` per folder. Another user's folders are never listed.
   *
   * REST API Reference for aiPromptsListFolders Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiPromptFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPromptFolder> aiPromptsListFolders(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/list-folders";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<List<AiPromptFolder>> localVarReturnType = new TypeReference<List<AiPromptFolder>>() {};
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
   * Move a prompt to a folder
   * Moves a saved prompt into another folder, or to the root when `folderId` is omitted or null. The name is re-validated in the target folder, so the move fails when a prompt of that name already sits there - rename it first with `PUT api/2.0/ai/prompts/update`. Nothing about the prompt other than its folder changes. The answer carries the moved prompt.
   *
   * REST API Reference for aiPromptsMove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/
   *
   * @param aiPromptsMoveRequest  (required)
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsMove(@javax.annotation.Nonnull AiPromptsMoveRequest aiPromptsMoveRequest) throws ApiException {
    return this.aiPromptsMove(aiPromptsMoveRequest, Collections.emptyMap());
  }


  /**
   * Move a prompt to a folder
   * Moves a saved prompt into another folder, or to the root when `folderId` is omitted or null. The name is re-validated in the target folder, so the move fails when a prompt of that name already sits there - rename it first with `PUT api/2.0/ai/prompts/update`. Nothing about the prompt other than its folder changes. The answer carries the moved prompt.
   *
   * REST API Reference for aiPromptsMove Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/
   *
   * @param aiPromptsMoveRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsMove(@javax.annotation.Nonnull AiPromptsMoveRequest aiPromptsMoveRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiPromptsMoveRequest;
    
    // verify the required parameter 'aiPromptsMoveRequest' is set
    if (aiPromptsMoveRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiPromptsMoveRequest' when calling aiPromptsMove");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/move";

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

    TypeReference<AiPromptMutationResult> localVarReturnType = new TypeReference<AiPromptMutationResult>() {};
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
   * Rename folder
   * Renames a folder in the caller's prompt library, validating the new name against the folders already there. The prompts inside it are untouched and keep their IDs. The answer carries the renamed folder. A name that another folder already uses is rejected.
   *
   * REST API Reference for aiPromptsRenameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/
   *
   * @param aiPromptsRenameFolderRequest  (required)
   * @return AiFolderMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiFolderMutationResult aiPromptsRenameFolder(@javax.annotation.Nonnull AiPromptsRenameFolderRequest aiPromptsRenameFolderRequest) throws ApiException {
    return this.aiPromptsRenameFolder(aiPromptsRenameFolderRequest, Collections.emptyMap());
  }


  /**
   * Rename folder
   * Renames a folder in the caller's prompt library, validating the new name against the folders already there. The prompts inside it are untouched and keep their IDs. The answer carries the renamed folder. A name that another folder already uses is rejected.
   *
   * REST API Reference for aiPromptsRenameFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/
   *
   * @param aiPromptsRenameFolderRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiFolderMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiFolderMutationResult aiPromptsRenameFolder(@javax.annotation.Nonnull AiPromptsRenameFolderRequest aiPromptsRenameFolderRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiPromptsRenameFolderRequest;
    
    // verify the required parameter 'aiPromptsRenameFolderRequest' is set
    if (aiPromptsRenameFolderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiPromptsRenameFolderRequest' when calling aiPromptsRenameFolder");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/rename-folder";

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

    TypeReference<AiFolderMutationResult> localVarReturnType = new TypeReference<AiFolderMutationResult>() {};
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
   * Update a saved prompt
   * Changes a saved prompt and returns the stored result. Only the fields present in `updates` are written, so a partial object leaves the rest of the prompt alone. The name and the folder reference are re-validated whenever either changes, which means an update can fail on a name another prompt in the same folder already uses. Use `PUT api/2.0/ai/prompts/move` to change only the folder.
   *
   * REST API Reference for aiPromptsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/
   *
   * @param aiPromptsUpdateRequest  (required)
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsUpdate(@javax.annotation.Nonnull AiPromptsUpdateRequest aiPromptsUpdateRequest) throws ApiException {
    return this.aiPromptsUpdate(aiPromptsUpdateRequest, Collections.emptyMap());
  }


  /**
   * Update a saved prompt
   * Changes a saved prompt and returns the stored result. Only the fields present in `updates` are written, so a partial object leaves the rest of the prompt alone. The name and the folder reference are re-validated whenever either changes, which means an update can fail on a name another prompt in the same folder already uses. Use `PUT api/2.0/ai/prompts/move` to change only the folder.
   *
   * REST API Reference for aiPromptsUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/
   *
   * @param aiPromptsUpdateRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiPromptMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiPromptMutationResult aiPromptsUpdate(@javax.annotation.Nonnull AiPromptsUpdateRequest aiPromptsUpdateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiPromptsUpdateRequest;
    
    // verify the required parameter 'aiPromptsUpdateRequest' is set
    if (aiPromptsUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiPromptsUpdateRequest' when calling aiPromptsUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/prompts/update";

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

    TypeReference<AiPromptMutationResult> localVarReturnType = new TypeReference<AiPromptMutationResult>() {};
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
