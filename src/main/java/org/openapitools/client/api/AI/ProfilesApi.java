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

import org.openapitools.client.model.AiCreateProfileInput;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiModel;
import org.openapitools.client.model.AiProfile;
import org.openapitools.client.model.AiProfileMutationResult;
import org.openapitools.client.model.AiProfilesGetById200Response;
import org.openapitools.client.model.AiProfilesListProviderModelsRequest;
import org.openapitools.client.model.AiProfilesTestConnection200Response;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ProfilesApi extends BaseApi {

  public ProfilesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ProfilesApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Create
   * 
   *
   * REST API Reference for aiProfilesCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/
   *
   * @param aiCreateProfileInput  (required)
   * @return AiProfileMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiProfileMutationResult aiProfilesCreate(@javax.annotation.Nonnull AiCreateProfileInput aiCreateProfileInput) throws ApiException {
    return this.aiProfilesCreate(aiCreateProfileInput, Collections.emptyMap());
  }


  /**
   * Create
   * 
   *
   * REST API Reference for aiProfilesCreate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/
   *
   * @param aiCreateProfileInput  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProfileMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiProfileMutationResult aiProfilesCreate(@javax.annotation.Nonnull AiCreateProfileInput aiCreateProfileInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiCreateProfileInput;
    
    // verify the required parameter 'aiCreateProfileInput' is set
    if (aiCreateProfileInput == null) {
      throw new ApiException(400, "Missing the required parameter 'aiCreateProfileInput' when calling aiProfilesCreate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/create";

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

    TypeReference<AiProfileMutationResult> localVarReturnType = new TypeReference<AiProfileMutationResult>() {};
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
   * REST API Reference for aiProfilesDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiProfilesDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiProfilesDelete(body, Collections.emptyMap());
  }


  /**
   * Delete
   * 
   *
   * REST API Reference for aiProfilesDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiProfilesDelete(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiProfilesDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/delete";

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
   * Get by id
   * 
   *
   * REST API Reference for aiProfilesGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/
   *
   * @param id  (required)
   * @return AiProfilesGetById200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesGetById200Response aiProfilesGetById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiProfilesGetById(id, Collections.emptyMap());
  }


  /**
   * Get by id
   * 
   *
   * REST API Reference for aiProfilesGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/
   *
   * @param id  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProfilesGetById200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesGetById200Response aiProfilesGetById(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling aiProfilesGetById");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/get-by-id";

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

    TypeReference<AiProfilesGetById200Response> localVarReturnType = new TypeReference<AiProfilesGetById200Response>() {};
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
   * List
   * 
   *
   * REST API Reference for aiProfilesList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/
   *
   * @return List&lt;AiProfile&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiProfile> aiProfilesList() throws ApiException {
    return this.aiProfilesList(Collections.emptyMap());
  }


  /**
   * List
   * 
   *
   * REST API Reference for aiProfilesList Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiProfile&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiProfile> aiProfilesList(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/list";

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

    TypeReference<List<AiProfile>> localVarReturnType = new TypeReference<List<AiProfile>>() {};
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
   * List models
   * 
   *
   * REST API Reference for aiProfilesListModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/
   *
   * @param profileId  (required)
   * @return List&lt;AiModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiModel> aiProfilesListModels(@javax.annotation.Nonnull String profileId) throws ApiException {
    return this.aiProfilesListModels(profileId, Collections.emptyMap());
  }


  /**
   * List models
   * 
   *
   * REST API Reference for aiProfilesListModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/
   *
   * @param profileId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiModel> aiProfilesListModels(@javax.annotation.Nonnull String profileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling aiProfilesListModels");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/list-models";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("profileId", profileId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<List<AiModel>> localVarReturnType = new TypeReference<List<AiModel>>() {};
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
   * List provider models
   * 
   *
   * REST API Reference for aiProfilesListProviderModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/
   *
   * @param aiProfilesListProviderModelsRequest  (required)
   * @return List&lt;AiModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiModel> aiProfilesListProviderModels(@javax.annotation.Nonnull AiProfilesListProviderModelsRequest aiProfilesListProviderModelsRequest) throws ApiException {
    return this.aiProfilesListProviderModels(aiProfilesListProviderModelsRequest, Collections.emptyMap());
  }


  /**
   * List provider models
   * 
   *
   * REST API Reference for aiProfilesListProviderModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/
   *
   * @param aiProfilesListProviderModelsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;AiModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiModel> aiProfilesListProviderModels(@javax.annotation.Nonnull AiProfilesListProviderModelsRequest aiProfilesListProviderModelsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiProfilesListProviderModelsRequest;
    
    // verify the required parameter 'aiProfilesListProviderModelsRequest' is set
    if (aiProfilesListProviderModelsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiProfilesListProviderModelsRequest' when calling aiProfilesListProviderModels");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/list-provider-models";

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

    TypeReference<List<AiModel>> localVarReturnType = new TypeReference<List<AiModel>>() {};
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
   * Test connection
   * 
   *
   * REST API Reference for aiProfilesTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
   *
   * @param body  (required)
   * @return AiProfilesTestConnection200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesTestConnection200Response aiProfilesTestConnection(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiProfilesTestConnection(body, Collections.emptyMap());
  }


  /**
   * Test connection
   * 
   *
   * REST API Reference for aiProfilesTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProfilesTestConnection200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesTestConnection200Response aiProfilesTestConnection(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiProfilesTestConnection");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/test-connection";

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

    TypeReference<AiProfilesTestConnection200Response> localVarReturnType = new TypeReference<AiProfilesTestConnection200Response>() {};
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
   * Update
   * 
   *
   * REST API Reference for aiProfilesUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/
   *
   * @param aiProfile  (required)
   * @return AiProfileMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiProfileMutationResult aiProfilesUpdate(@javax.annotation.Nonnull AiProfile aiProfile) throws ApiException {
    return this.aiProfilesUpdate(aiProfile, Collections.emptyMap());
  }


  /**
   * Update
   * 
   *
   * REST API Reference for aiProfilesUpdate Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/
   *
   * @param aiProfile  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProfileMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiProfileMutationResult aiProfilesUpdate(@javax.annotation.Nonnull AiProfile aiProfile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiProfile;
    
    // verify the required parameter 'aiProfile' is set
    if (aiProfile == null) {
      throw new ApiException(400, "Missing the required parameter 'aiProfile' when calling aiProfilesUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/profiles/update";

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

    TypeReference<AiProfileMutationResult> localVarReturnType = new TypeReference<AiProfileMutationResult>() {};
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
