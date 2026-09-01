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
import org.openapitools.client.model.AiSuccessResponse;
import org.openapitools.client.model.AiTMCPItem;
import org.openapitools.client.model.AiToolsAddCustomServerRequest;
import org.openapitools.client.model.AiToolsBulkResult;
import org.openapitools.client.model.AiToolsMutationResult;
import org.openapitools.client.model.AiToolsRemoveCustomServerRequest;
import org.openapitools.client.model.AiToolsReplaceAllCustomServersRequest;
import org.openapitools.client.model.AiToolsSetAllowAlwaysRequest;
import org.openapitools.client.model.AiToolsSetDisabledRequest;
import org.openapitools.client.model.AiToolsUpdateCustomServerRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ToolsApi extends BaseApi {

  public ToolsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ToolsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Add custom server
   * Registers a custom MCP server in the scope under the given name.
   *
   * REST API Reference for aiToolsAddCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/
   *
   * @param aiToolsAddCustomServerRequest  (required)
   * @return AiToolsMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsMutationResult aiToolsAddCustomServer(@javax.annotation.Nonnull AiToolsAddCustomServerRequest aiToolsAddCustomServerRequest) throws ApiException {
    return this.aiToolsAddCustomServer(aiToolsAddCustomServerRequest, Collections.emptyMap());
  }


  /**
   * Add custom server
   * Registers a custom MCP server in the scope under the given name.
   *
   * REST API Reference for aiToolsAddCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/
   *
   * @param aiToolsAddCustomServerRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiToolsMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsMutationResult aiToolsAddCustomServer(@javax.annotation.Nonnull AiToolsAddCustomServerRequest aiToolsAddCustomServerRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsAddCustomServerRequest;
    
    // verify the required parameter 'aiToolsAddCustomServerRequest' is set
    if (aiToolsAddCustomServerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsAddCustomServerRequest' when calling aiToolsAddCustomServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/add-custom-server";

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

    TypeReference<AiToolsMutationResult> localVarReturnType = new TypeReference<AiToolsMutationResult>() {};
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
   * Get allow always
   * Lists the tools on the always-allow list of the scope.
   *
   * REST API Reference for aiToolsGetAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public List<String> aiToolsGetAllowAlways(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsGetAllowAlways(entityId, Collections.emptyMap());
  }


  /**
   * Get allow always
   * Lists the tools on the always-allow list of the scope.
   *
   * REST API Reference for aiToolsGetAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public List<String> aiToolsGetAllowAlways(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/get-allow-always";

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

    TypeReference<List<String>> localVarReturnType = new TypeReference<List<String>>() {};
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
   * Get custom server
   * Returns the configuration of one custom MCP server, or an empty result when it is not registered.
   *
   * REST API Reference for aiToolsGetCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/
   *
   * @param name The custom MCP server name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object aiToolsGetCustomServer(@javax.annotation.Nonnull String name, @javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsGetCustomServer(name, entityId, Collections.emptyMap());
  }


  /**
   * Get custom server
   * Returns the configuration of one custom MCP server, or an empty result when it is not registered.
   *
   * REST API Reference for aiToolsGetCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/
   *
   * @param name The custom MCP server name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object aiToolsGetCustomServer(@javax.annotation.Nonnull String name, @javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling aiToolsGetCustomServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/get-custom-server";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
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

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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
   * Get disabled
   * Returns the switched-off tools of the scope, grouped by server type.
   *
   * REST API Reference for aiToolsGetDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Map&lt;String, List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<String>> aiToolsGetDisabled(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsGetDisabled(entityId, Collections.emptyMap());
  }


  /**
   * Get disabled
   * Returns the switched-off tools of the scope, grouped by server type.
   *
   * REST API Reference for aiToolsGetDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<String>> aiToolsGetDisabled(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/get-disabled";

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

    TypeReference<Map<String, List<String>>> localVarReturnType = new TypeReference<Map<String, List<String>>>() {};
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
   * Is allow always
   * Tells whether one tool is on the always-allow list.
   *
   * REST API Reference for aiToolsIsAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-allow-always/
   *
   * @param serverType The MCP server type the tool belongs to. (required)
   * @param toolName The tool name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiToolsIsAllowAlways(@javax.annotation.Nonnull String serverType, @javax.annotation.Nonnull String toolName, @javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsIsAllowAlways(serverType, toolName, entityId, Collections.emptyMap());
  }


  /**
   * Is allow always
   * Tells whether one tool is on the always-allow list.
   *
   * REST API Reference for aiToolsIsAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-allow-always/
   *
   * @param serverType The MCP server type the tool belongs to. (required)
   * @param toolName The tool name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiToolsIsAllowAlways(@javax.annotation.Nonnull String serverType, @javax.annotation.Nonnull String toolName, @javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serverType' is set
    if (serverType == null) {
      throw new ApiException(400, "Missing the required parameter 'serverType' when calling aiToolsIsAllowAlways");
    }
    
    // verify the required parameter 'toolName' is set
    if (toolName == null) {
      throw new ApiException(400, "Missing the required parameter 'toolName' when calling aiToolsIsAllowAlways");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/is-allow-always";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("serverType", serverType));
    localVarQueryParams.addAll(apiClient.parameterToPair("toolName", toolName));
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
   * Is tool disabled
   * Tells whether one tool of a server type is switched off.
   *
   * REST API Reference for aiToolsIsToolDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-tool-disabled/
   *
   * @param serverType The MCP server type the tool belongs to. (required)
   * @param toolName The tool name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiToolsIsToolDisabled(@javax.annotation.Nonnull String serverType, @javax.annotation.Nonnull String toolName, @javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsIsToolDisabled(serverType, toolName, entityId, Collections.emptyMap());
  }


  /**
   * Is tool disabled
   * Tells whether one tool of a server type is switched off.
   *
   * REST API Reference for aiToolsIsToolDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-tool-disabled/
   *
   * @param serverType The MCP server type the tool belongs to. (required)
   * @param toolName The tool name. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean aiToolsIsToolDisabled(@javax.annotation.Nonnull String serverType, @javax.annotation.Nonnull String toolName, @javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serverType' is set
    if (serverType == null) {
      throw new ApiException(400, "Missing the required parameter 'serverType' when calling aiToolsIsToolDisabled");
    }
    
    // verify the required parameter 'toolName' is set
    if (toolName == null) {
      throw new ApiException(400, "Missing the required parameter 'toolName' when calling aiToolsIsToolDisabled");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/is-tool-disabled";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("serverType", serverType));
    localVarQueryParams.addAll(apiClient.parameterToPair("toolName", toolName));
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
   * List custom servers
   * Lists the custom MCP servers registered in the scope, keyed by name.
   *
   * REST API Reference for aiToolsListCustomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiToolsListCustomServers(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsListCustomServers(entityId, Collections.emptyMap());
  }


  /**
   * List custom servers
   * Lists the custom MCP servers registered in the scope, keyed by name.
   *
   * REST API Reference for aiToolsListCustomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> aiToolsListCustomServers(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/list-custom-servers";

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

    TypeReference<Map<String, Object>> localVarReturnType = new TypeReference<Map<String, Object>>() {};
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
   * List system tools
   * Lists the tools of the host-configured system MCP servers, grouped by server type. The servers are connected and listed server-side, so the client renders its permission cards from one request and never opens an MCP connection of its own.
   *
   * REST API Reference for aiToolsListSystemTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Map&lt;String, List&lt;AiTMCPItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<AiTMCPItem>> aiToolsListSystemTools(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiToolsListSystemTools(entityId, Collections.emptyMap());
  }


  /**
   * List system tools
   * Lists the tools of the host-configured system MCP servers, grouped by server type. The servers are connected and listed server-side, so the client renders its permission cards from one request and never opens an MCP connection of its own.
   *
   * REST API Reference for aiToolsListSystemTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, List&lt;AiTMCPItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<AiTMCPItem>> aiToolsListSystemTools(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/list-system-tools";

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

    TypeReference<Map<String, List<AiTMCPItem>>> localVarReturnType = new TypeReference<Map<String, List<AiTMCPItem>>>() {};
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
   * Remove custom server
   * Removes a custom MCP server from the registry.
   *
   * REST API Reference for aiToolsRemoveCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/
   *
   * @param aiToolsRemoveCustomServerRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsRemoveCustomServer(@javax.annotation.Nonnull AiToolsRemoveCustomServerRequest aiToolsRemoveCustomServerRequest) throws ApiException {
    return this.aiToolsRemoveCustomServer(aiToolsRemoveCustomServerRequest, Collections.emptyMap());
  }


  /**
   * Remove custom server
   * Removes a custom MCP server from the registry.
   *
   * REST API Reference for aiToolsRemoveCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/
   *
   * @param aiToolsRemoveCustomServerRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsRemoveCustomServer(@javax.annotation.Nonnull AiToolsRemoveCustomServerRequest aiToolsRemoveCustomServerRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsRemoveCustomServerRequest;
    
    // verify the required parameter 'aiToolsRemoveCustomServerRequest' is set
    if (aiToolsRemoveCustomServerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsRemoveCustomServerRequest' when calling aiToolsRemoveCustomServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/remove-custom-server";

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
   * Replace all custom servers
   * Replaces the whole custom MCP server registry of the scope with the supplied map.
   *
   * REST API Reference for aiToolsReplaceAllCustomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/
   *
   * @param aiToolsReplaceAllCustomServersRequest  (required)
   * @return AiToolsBulkResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsBulkResult aiToolsReplaceAllCustomServers(@javax.annotation.Nonnull AiToolsReplaceAllCustomServersRequest aiToolsReplaceAllCustomServersRequest) throws ApiException {
    return this.aiToolsReplaceAllCustomServers(aiToolsReplaceAllCustomServersRequest, Collections.emptyMap());
  }


  /**
   * Replace all custom servers
   * Replaces the whole custom MCP server registry of the scope with the supplied map.
   *
   * REST API Reference for aiToolsReplaceAllCustomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/
   *
   * @param aiToolsReplaceAllCustomServersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiToolsBulkResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsBulkResult aiToolsReplaceAllCustomServers(@javax.annotation.Nonnull AiToolsReplaceAllCustomServersRequest aiToolsReplaceAllCustomServersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsReplaceAllCustomServersRequest;
    
    // verify the required parameter 'aiToolsReplaceAllCustomServersRequest' is set
    if (aiToolsReplaceAllCustomServersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsReplaceAllCustomServersRequest' when calling aiToolsReplaceAllCustomServers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/replace-all-custom-servers";

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

    TypeReference<AiToolsBulkResult> localVarReturnType = new TypeReference<AiToolsBulkResult>() {};
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
   * Set allow always
   * Adds a tool to the always-allow list, or removes it - the tools on that list run without an approval dialog.
   *
   * REST API Reference for aiToolsSetAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/
   *
   * @param aiToolsSetAllowAlwaysRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsSetAllowAlways(@javax.annotation.Nonnull AiToolsSetAllowAlwaysRequest aiToolsSetAllowAlwaysRequest) throws ApiException {
    return this.aiToolsSetAllowAlways(aiToolsSetAllowAlwaysRequest, Collections.emptyMap());
  }


  /**
   * Set allow always
   * Adds a tool to the always-allow list, or removes it - the tools on that list run without an approval dialog.
   *
   * REST API Reference for aiToolsSetAllowAlways Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/
   *
   * @param aiToolsSetAllowAlwaysRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsSetAllowAlways(@javax.annotation.Nonnull AiToolsSetAllowAlwaysRequest aiToolsSetAllowAlwaysRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsSetAllowAlwaysRequest;
    
    // verify the required parameter 'aiToolsSetAllowAlwaysRequest' is set
    if (aiToolsSetAllowAlwaysRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsSetAllowAlwaysRequest' when calling aiToolsSetAllowAlways");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/set-allow-always";

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
   * Set disabled
   * Marks the listed tools of one server type as switched off, so the model is no longer offered them.
   *
   * REST API Reference for aiToolsSetDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/
   *
   * @param aiToolsSetDisabledRequest  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsSetDisabled(@javax.annotation.Nonnull AiToolsSetDisabledRequest aiToolsSetDisabledRequest) throws ApiException {
    return this.aiToolsSetDisabled(aiToolsSetDisabledRequest, Collections.emptyMap());
  }


  /**
   * Set disabled
   * Marks the listed tools of one server type as switched off, so the model is no longer offered them.
   *
   * REST API Reference for aiToolsSetDisabled Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/
   *
   * @param aiToolsSetDisabledRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiToolsSetDisabled(@javax.annotation.Nonnull AiToolsSetDisabledRequest aiToolsSetDisabledRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsSetDisabledRequest;
    
    // verify the required parameter 'aiToolsSetDisabledRequest' is set
    if (aiToolsSetDisabledRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsSetDisabledRequest' when calling aiToolsSetDisabled");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/set-disabled";

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
   * Update custom server
   * Updates the configuration of a registered custom MCP server.
   *
   * REST API Reference for aiToolsUpdateCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/
   *
   * @param aiToolsUpdateCustomServerRequest  (required)
   * @return AiToolsMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsMutationResult aiToolsUpdateCustomServer(@javax.annotation.Nonnull AiToolsUpdateCustomServerRequest aiToolsUpdateCustomServerRequest) throws ApiException {
    return this.aiToolsUpdateCustomServer(aiToolsUpdateCustomServerRequest, Collections.emptyMap());
  }


  /**
   * Update custom server
   * Updates the configuration of a registered custom MCP server.
   *
   * REST API Reference for aiToolsUpdateCustomServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/
   *
   * @param aiToolsUpdateCustomServerRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiToolsMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiToolsMutationResult aiToolsUpdateCustomServer(@javax.annotation.Nonnull AiToolsUpdateCustomServerRequest aiToolsUpdateCustomServerRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiToolsUpdateCustomServerRequest;
    
    // verify the required parameter 'aiToolsUpdateCustomServerRequest' is set
    if (aiToolsUpdateCustomServerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiToolsUpdateCustomServerRequest' when calling aiToolsUpdateCustomServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/tools/update-custom-server";

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

    TypeReference<AiToolsMutationResult> localVarReturnType = new TypeReference<AiToolsMutationResult>() {};
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
