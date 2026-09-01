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

import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiProfilesTestConnection200Response;
import org.openapitools.client.model.AiSuccessResponse;
import org.openapitools.client.model.AiWebSearchConfig;
import org.openapitools.client.model.AiWebSearchConfigureRequest;
import org.openapitools.client.model.AiWebSearchMutationResult;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class WebSearchApi extends BaseApi {

  public WebSearchApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebSearchApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Clear
   * 
   *
   * REST API Reference for aiWebSearchClear Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchClear(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiWebSearchClear(body, Collections.emptyMap());
  }


  /**
   * Clear
   * 
   *
   * REST API Reference for aiWebSearchClear Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchClear(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiWebSearchClear");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/clear";

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
   * Configure
   * 
   *
   * REST API Reference for aiWebSearchConfigure Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/
   *
   * @param aiWebSearchConfigureRequest  (required)
   * @return AiWebSearchMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiWebSearchMutationResult aiWebSearchConfigure(@javax.annotation.Nonnull AiWebSearchConfigureRequest aiWebSearchConfigureRequest) throws ApiException {
    return this.aiWebSearchConfigure(aiWebSearchConfigureRequest, Collections.emptyMap());
  }


  /**
   * Configure
   * 
   *
   * REST API Reference for aiWebSearchConfigure Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/
   *
   * @param aiWebSearchConfigureRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiWebSearchMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiWebSearchMutationResult aiWebSearchConfigure(@javax.annotation.Nonnull AiWebSearchConfigureRequest aiWebSearchConfigureRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiWebSearchConfigureRequest;
    
    // verify the required parameter 'aiWebSearchConfigureRequest' is set
    if (aiWebSearchConfigureRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiWebSearchConfigureRequest' when calling aiWebSearchConfigure");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/configure";

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

    TypeReference<AiWebSearchMutationResult> localVarReturnType = new TypeReference<AiWebSearchMutationResult>() {};
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
   * Get active config
   * 
   *
   * REST API Reference for aiWebSearchGetActiveConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/
   *
   * @param entityId  (required)
   * @return AiWebSearchConfig
   * @throws ApiException if fails to make API call
   */
  public AiWebSearchConfig aiWebSearchGetActiveConfig(@javax.annotation.Nonnull String entityId) throws ApiException {
    return this.aiWebSearchGetActiveConfig(entityId, Collections.emptyMap());
  }


  /**
   * Get active config
   * 
   *
   * REST API Reference for aiWebSearchGetActiveConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/
   *
   * @param entityId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiWebSearchConfig
   * @throws ApiException if fails to make API call
   */
  public AiWebSearchConfig aiWebSearchGetActiveConfig(@javax.annotation.Nonnull String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling aiWebSearchGetActiveConfig");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/get-active-config";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AiWebSearchConfig> localVarReturnType = new TypeReference<AiWebSearchConfig>() {};
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
   * Is configured
   * 
   *
   * REST API Reference for aiWebSearchIsConfigured Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/
   *
   * @param entityId  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiWebSearchIsConfigured(@javax.annotation.Nonnull String entityId) throws ApiException {
    return this.aiWebSearchIsConfigured(entityId, Collections.emptyMap());
  }


  /**
   * Is configured
   * 
   *
   * REST API Reference for aiWebSearchIsConfigured Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/
   *
   * @param entityId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiWebSearchIsConfigured(@javax.annotation.Nonnull String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling aiWebSearchIsConfigured");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/is-configured";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Boolean> localVarReturnType = new TypeReference<Boolean>() {};
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
   * Web page contents proxied to the portal's active web-search provider
   * 
   *
   * REST API Reference for aiWebSearchPassthroughContents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/
   *
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchPassthroughContents(@javax.annotation.Nonnull Map<String, Object> requestBody) throws ApiException {
    return this.aiWebSearchPassthroughContents(requestBody, Collections.emptyMap());
  }


  /**
   * Web page contents proxied to the portal's active web-search provider
   * 
   *
   * REST API Reference for aiWebSearchPassthroughContents Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/
   *
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchPassthroughContents(@javax.annotation.Nonnull Map<String, Object> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiWebSearchPassthroughContents");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/websearch/v1/contents";

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
   * Web search proxied to the portal's active web-search provider
   * 
   *
   * REST API Reference for aiWebSearchPassthroughSearch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/
   *
   * @param requestBody  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchPassthroughSearch(@javax.annotation.Nonnull Map<String, Object> requestBody) throws ApiException {
    return this.aiWebSearchPassthroughSearch(requestBody, Collections.emptyMap());
  }


  /**
   * Web search proxied to the portal's active web-search provider
   * 
   *
   * REST API Reference for aiWebSearchPassthroughSearch Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/
   *
   * @param requestBody  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchPassthroughSearch(@javax.annotation.Nonnull Map<String, Object> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiWebSearchPassthroughSearch");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/websearch/v1/search";

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
   * Set active config
   * 
   *
   * REST API Reference for aiWebSearchSetActiveConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/
   *
   * @param aiWebSearchConfigureRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchSetActiveConfig(@javax.annotation.Nonnull AiWebSearchConfigureRequest aiWebSearchConfigureRequest) throws ApiException {
    return this.aiWebSearchSetActiveConfig(aiWebSearchConfigureRequest, Collections.emptyMap());
  }


  /**
   * Set active config
   * 
   *
   * REST API Reference for aiWebSearchSetActiveConfig Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/
   *
   * @param aiWebSearchConfigureRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiWebSearchSetActiveConfig(@javax.annotation.Nonnull AiWebSearchConfigureRequest aiWebSearchConfigureRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiWebSearchConfigureRequest;
    
    // verify the required parameter 'aiWebSearchConfigureRequest' is set
    if (aiWebSearchConfigureRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiWebSearchConfigureRequest' when calling aiWebSearchSetActiveConfig");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/set-active-config";

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
   * Test connection
   * 
   *
   * REST API Reference for aiWebSearchTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/
   *
   * @param aiWebSearchConfig  (required)
   * @return AiProfilesTestConnection200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesTestConnection200Response aiWebSearchTestConnection(@javax.annotation.Nonnull AiWebSearchConfig aiWebSearchConfig) throws ApiException {
    return this.aiWebSearchTestConnection(aiWebSearchConfig, Collections.emptyMap());
  }


  /**
   * Test connection
   * 
   *
   * REST API Reference for aiWebSearchTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/
   *
   * @param aiWebSearchConfig  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiProfilesTestConnection200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesTestConnection200Response aiWebSearchTestConnection(@javax.annotation.Nonnull AiWebSearchConfig aiWebSearchConfig, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiWebSearchConfig;
    
    // verify the required parameter 'aiWebSearchConfig' is set
    if (aiWebSearchConfig == null) {
      throw new ApiException(400, "Missing the required parameter 'aiWebSearchConfig' when calling aiWebSearchTestConnection");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/web-search/test-connection";

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
