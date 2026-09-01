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
   * Create
   * 
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
   * Create
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiPromptsCreateFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
   *
   * @param body  (required)
   * @return AiFolderMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiFolderMutationResult aiPromptsCreateFolder(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsCreateFolder(body, Collections.emptyMap());
  }


  /**
   * Create folder
   * 
   *
   * REST API Reference for aiPromptsCreateFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
   *
   * @param body  (required)
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

    String[] localVarAuthNames = new String[] {  };

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
   * Delete
   * 
   *
   * REST API Reference for aiPromptsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsDelete(body, Collections.emptyMap());
  }


  /**
   * Delete
   * 
   *
   * REST API Reference for aiPromptsDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
   *
   * @param body  (required)
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
   * Delete folder
   * 
   *
   * REST API Reference for aiPromptsDeleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiPromptsDeleteFolder(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiPromptsDeleteFolder(body, Collections.emptyMap());
  }


  /**
   * Delete folder
   * 
   *
   * REST API Reference for aiPromptsDeleteFolder Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
   *
   * @param body  (required)
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
   * Export
   * 
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
   * Export
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * Get by id
   * 
   *
   * REST API Reference for aiPromptsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
   *
   * @param id  (required)
   * @return AiPrompt
   * @throws ApiException if fails to make API call
   */
  public AiPrompt aiPromptsGetById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiPromptsGetById(id, Collections.emptyMap());
  }


  /**
   * Get by id
   * 
   *
   * REST API Reference for aiPromptsGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
   *
   * @param id  (required)
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

    String[] localVarAuthNames = new String[] {  };

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
   * Get folder by id
   * 
   *
   * REST API Reference for aiPromptsGetFolderById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
   *
   * @param id  (required)
   * @return AiPromptFolder
   * @throws ApiException if fails to make API call
   */
  public AiPromptFolder aiPromptsGetFolderById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiPromptsGetFolderById(id, Collections.emptyMap());
  }


  /**
   * Get folder by id
   * 
   *
   * REST API Reference for aiPromptsGetFolderById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
   *
   * @param id  (required)
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
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
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * List
   * 
   *
   * REST API Reference for aiPromptsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
   *
   * @param folderId  (required)
   * @return List&lt;AiPrompt&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPrompt> aiPromptsList(@javax.annotation.Nonnull String folderId) throws ApiException {
    return this.aiPromptsList(folderId, Collections.emptyMap());
  }


  /**
   * List
   * 
   *
   * REST API Reference for aiPromptsList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
   *
   * @param folderId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiPrompt&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiPrompt> aiPromptsList(@javax.annotation.Nonnull String folderId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling aiPromptsList");
    }
    
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
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
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * Move
   * 
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
   * Move
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
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
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * Update
   * 
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
   * Update
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
