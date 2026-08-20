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

import org.openapitools.client.model.AddMcpServerRequestBody;
import org.openapitools.client.model.AddRoomServersRequestBody;
import org.openapitools.client.model.ConnectServerRequestBody;
import org.openapitools.client.model.DeleteRoomServersRequestBody;
import org.openapitools.client.model.DeleteServersRequestBody;
import org.openapitools.client.model.McpServerArrayWrapper;
import org.openapitools.client.model.McpServerShortArrayWrapper;
import org.openapitools.client.model.McpServerShortWrapper;
import org.openapitools.client.model.McpServerStatusArrayWrapper;
import org.openapitools.client.model.McpServerStatusWrapper;
import org.openapitools.client.model.McpServerWrapper;
import org.openapitools.client.model.McpToolArrayWrapper;
import org.openapitools.client.model.SetMcpToolsRequestBody;
import org.openapitools.client.model.SetServerStatusRequestBody;
import java.util.UUID;
import org.openapitools.client.model.UpdateServerRequestBody;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class MCPApi extends BaseApi {

  public MCPApi() {
    super(Configuration.getDefaultApiClient());
  }

  public MCPApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public MCPApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Assign MCP servers to a room
   * Associates one or more MCP servers with a specific room, making them available for AI chat sessions  within that room. A maximum of 5 MCP servers can be assigned to a single room. If OAuth-based servers  are included, each room member will need to individually authorize their connection.  Requires room edit permissions.
   *
   * REST API Reference for addRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-servers/
   *
   * @param roomId Identifier of the room to which MCP servers will be assigned. (required)
   * @param addRoomServersRequestBody Server identifiers to assign. (required)
   * @return McpServerStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusArrayWrapper addRoomServers(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull AddRoomServersRequestBody addRoomServersRequestBody) throws ApiException {
    return this.addRoomServers(roomId, addRoomServersRequestBody, Collections.emptyMap());
  }


  /**
   * Assign MCP servers to a room
   * Associates one or more MCP servers with a specific room, making them available for AI chat sessions  within that room. A maximum of 5 MCP servers can be assigned to a single room. If OAuth-based servers  are included, each room member will need to individually authorize their connection.  Requires room edit permissions.
   *
   * REST API Reference for addRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-servers/
   *
   * @param roomId Identifier of the room to which MCP servers will be assigned. (required)
   * @param addRoomServersRequestBody Server identifiers to assign. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusArrayWrapper addRoomServers(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull AddRoomServersRequestBody addRoomServersRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = addRoomServersRequestBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addRoomServers");
    }
    
    // verify the required parameter 'addRoomServersRequestBody' is set
    if (addRoomServersRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'addRoomServersRequestBody' when calling addRoomServers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

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

    TypeReference<McpServerStatusArrayWrapper> localVarReturnType = new TypeReference<McpServerStatusArrayWrapper>() {};
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
   * Register a custom MCP server
   * Registers a new custom MCP (Model Context Protocol) server for the current tenant.  The system validates the server name (only letters, numbers, underscores, and hyphens are allowed),  checks that it is not reserved or already taken, and then attempts to connect to the provided endpoint  to verify reachability and credentials before persisting the configuration.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for addServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-server/
   *
   * @param addMcpServerRequestBody MCP server registration parameters. (required)
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper addServer(@javax.annotation.Nonnull AddMcpServerRequestBody addMcpServerRequestBody) throws ApiException {
    return this.addServer(addMcpServerRequestBody, Collections.emptyMap());
  }


  /**
   * Register a custom MCP server
   * Registers a new custom MCP (Model Context Protocol) server for the current tenant.  The system validates the server name (only letters, numbers, underscores, and hyphens are allowed),  checks that it is not reserved or already taken, and then attempts to connect to the provided endpoint  to verify reachability and credentials before persisting the configuration.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for addServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-server/
   *
   * @param addMcpServerRequestBody MCP server registration parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper addServer(@javax.annotation.Nonnull AddMcpServerRequestBody addMcpServerRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = addMcpServerRequestBody;
    
    // verify the required parameter 'addMcpServerRequestBody' is set
    if (addMcpServerRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'addMcpServerRequestBody' when calling addServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers";

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

    TypeReference<McpServerWrapper> localVarReturnType = new TypeReference<McpServerWrapper>() {};
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
   * Connect an OAuth-based MCP server in a room
   * Completes the OAuth authorization flow for an MCP server within a specific room on behalf of the  current user. The authorization code obtained from the OAuth provider must be passed in the request body.  Upon successful token exchange, the system verifies connectivity to the server and stores  the credentials for the current user. Requires room edit permissions.
   *
   * REST API Reference for connectServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/connect-server/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server to connect. (required)
   * @param connectServerRequestBody The request body containing additional data necessary for connecting to the server,  such as authentication or operation-specific information. (required)
   * @return McpServerStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusWrapper connectServer(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, @javax.annotation.Nonnull ConnectServerRequestBody connectServerRequestBody) throws ApiException {
    return this.connectServer(roomId, serverId, connectServerRequestBody, Collections.emptyMap());
  }


  /**
   * Connect an OAuth-based MCP server in a room
   * Completes the OAuth authorization flow for an MCP server within a specific room on behalf of the  current user. The authorization code obtained from the OAuth provider must be passed in the request body.  Upon successful token exchange, the system verifies connectivity to the server and stores  the credentials for the current user. Requires room edit permissions.
   *
   * REST API Reference for connectServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/connect-server/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server to connect. (required)
   * @param connectServerRequestBody The request body containing additional data necessary for connecting to the server,  such as authentication or operation-specific information. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusWrapper connectServer(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, @javax.annotation.Nonnull ConnectServerRequestBody connectServerRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = connectServerRequestBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling connectServer");
    }
    
    // verify the required parameter 'serverId' is set
    if (serverId == null) {
      throw new ApiException(400, "Missing the required parameter 'serverId' when calling connectServer");
    }
    
    // verify the required parameter 'connectServerRequestBody' is set
    if (connectServerRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'connectServerRequestBody' when calling connectServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers/{serverId}/connect"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)))
      .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(apiClient.parameterToString(serverId)));

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

    TypeReference<McpServerStatusWrapper> localVarReturnType = new TypeReference<McpServerStatusWrapper>() {};
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
   * Remove MCP servers from a room
   * Detaches one or more MCP servers from the specified room. After removal, the servers will no longer  be available in AI chat sessions within this room. Existing connections and tool configurations for  the removed servers are also cleaned up. Requires room edit permissions.
   *
   * REST API Reference for deleteRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-servers/
   *
   * @param roomId Identifier of the room from which MCP servers will be removed. (required)
   * @param deleteRoomServersRequestBody Server identifiers to remove. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomServers(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull DeleteRoomServersRequestBody deleteRoomServersRequestBody) throws ApiException {
    this.deleteRoomServers(roomId, deleteRoomServersRequestBody, Collections.emptyMap());
  }


  /**
   * Remove MCP servers from a room
   * Detaches one or more MCP servers from the specified room. After removal, the servers will no longer  be available in AI chat sessions within this room. Existing connections and tool configurations for  the removed servers are also cleaned up. Requires room edit permissions.
   *
   * REST API Reference for deleteRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-servers/
   *
   * @param roomId Identifier of the room from which MCP servers will be removed. (required)
   * @param deleteRoomServersRequestBody Server identifiers to remove. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomServers(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull DeleteRoomServersRequestBody deleteRoomServersRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteRoomServersRequestBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoomServers");
    }
    
    // verify the required parameter 'deleteRoomServersRequestBody' is set
    if (deleteRoomServersRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteRoomServersRequestBody' when calling deleteRoomServers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

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
   * Delete MCP servers
   * Permanently removes one or more MCP servers from the current tenant by their IDs.  All room associations and connection data for the deleted servers are also cleaned up.  This action is irreversible. Requires DocSpace administrator privileges.
   *
   * REST API Reference for deleteServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-server/
   *
   * @param deleteServersRequestBody Server identifiers to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServer(@javax.annotation.Nonnull DeleteServersRequestBody deleteServersRequestBody) throws ApiException {
    this.deleteServer(deleteServersRequestBody, Collections.emptyMap());
  }


  /**
   * Delete MCP servers
   * Permanently removes one or more MCP servers from the current tenant by their IDs.  All room associations and connection data for the deleted servers are also cleaned up.  This action is irreversible. Requires DocSpace administrator privileges.
   *
   * REST API Reference for deleteServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-server/
   *
   * @param deleteServersRequestBody Server identifiers to delete. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteServer(@javax.annotation.Nonnull DeleteServersRequestBody deleteServersRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deleteServersRequestBody;
    
    // verify the required parameter 'deleteServersRequestBody' is set
    if (deleteServersRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteServersRequestBody' when calling deleteServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers";

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
   * Disconnect an MCP server in a room
   * Revokes the current user's OAuth connection to an MCP server within the specified room. After  disconnection, the server's tools will no longer be available to this user in AI chat sessions  until they re-authorize. Other room members' connections are not affected.  Requires room edit permissions.
   *
   * REST API Reference for disconnectServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/disconnect-server/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server to disconnect from. (required)
   * @return McpServerStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusWrapper disconnectServer(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId) throws ApiException {
    return this.disconnectServer(roomId, serverId, Collections.emptyMap());
  }


  /**
   * Disconnect an MCP server in a room
   * Revokes the current user's OAuth connection to an MCP server within the specified room. After  disconnection, the server's tools will no longer be available to this user in AI chat sessions  until they re-authorize. Other room members' connections are not affected.  Requires room edit permissions.
   *
   * REST API Reference for disconnectServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/disconnect-server/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server to disconnect from. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusWrapper disconnectServer(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling disconnectServer");
    }
    
    // verify the required parameter 'serverId' is set
    if (serverId == null) {
      throw new ApiException(400, "Missing the required parameter 'serverId' when calling disconnectServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers/{serverId}/disconnect"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)))
      .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(apiClient.parameterToString(serverId)));

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

    TypeReference<McpServerStatusWrapper> localVarReturnType = new TypeReference<McpServerStatusWrapper>() {};
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
   * Get available MCP servers
   * Returns a paginated list of MCP servers that are currently active (enabled) and available for  assignment to rooms. Only servers in the enabled state are included. Each entry contains a compact  summary with the server name, type, icon, and status. Supports pagination via startIndex and count.  The total count of available servers is included in the response metadata.
   *
   * REST API Reference for getAvailableServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-servers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @return McpServerShortArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerShortArrayWrapper getAvailableServers(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.getAvailableServers(startIndex, count, Collections.emptyMap());
  }


  /**
   * Get available MCP servers
   * Returns a paginated list of MCP servers that are currently active (enabled) and available for  assignment to rooms. Only servers in the enabled state are included. Each entry contains a compact  summary with the server name, type, icon, and status. Supports pagination via startIndex and count.  The total count of available servers is included in the response metadata.
   *
   * REST API Reference for getAvailableServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-servers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerShortArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerShortArrayWrapper getAvailableServers(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers/available";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
      
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

    TypeReference<McpServerShortArrayWrapper> localVarReturnType = new TypeReference<McpServerShortArrayWrapper>() {};
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
   * Get MCP servers assigned to a room
   * Returns the list of MCP servers currently assigned to the specified room along with their connection  statuses for the current user. For OAuth-based servers, the connection status reflects whether the  current user has completed authorization. Requires access to the room's AI chat.
   *
   * REST API Reference for getRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-servers/
   *
   * @param roomId Identifier of the room whose assigned MCP servers are being retrieved. (required)
   * @return McpServerStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusArrayWrapper getRoomServers(@javax.annotation.Nonnull Integer roomId) throws ApiException {
    return this.getRoomServers(roomId, Collections.emptyMap());
  }


  /**
   * Get MCP servers assigned to a room
   * Returns the list of MCP servers currently assigned to the specified room along with their connection  statuses for the current user. For OAuth-based servers, the connection status reflects whether the  current user has completed authorization. Requires access to the room's AI chat.
   *
   * REST API Reference for getRoomServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-servers/
   *
   * @param roomId Identifier of the room whose assigned MCP servers are being retrieved. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerStatusArrayWrapper getRoomServers(@javax.annotation.Nonnull Integer roomId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomServers");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)));

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

    TypeReference<McpServerStatusArrayWrapper> localVarReturnType = new TypeReference<McpServerStatusArrayWrapper>() {};
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
   * Get an MCP server by ID
   * Retrieves a summary view of a single MCP server by its unique identifier, including its name,  type, enabled state, and icon. This endpoint returns a compact representation without  sensitive details such as endpoint URL or authentication headers.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for getServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-server/
   *
   * @param id Unique identifier of the MCP server to retrieve. (required)
   * @return McpServerShortWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerShortWrapper getServer(@javax.annotation.Nonnull UUID id) throws ApiException {
    return this.getServer(id, Collections.emptyMap());
  }


  /**
   * Get an MCP server by ID
   * Retrieves a summary view of a single MCP server by its unique identifier, including its name,  type, enabled state, and icon. This endpoint returns a compact representation without  sensitive details such as endpoint URL or authentication headers.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for getServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-server/
   *
   * @param id Unique identifier of the MCP server to retrieve. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerShortWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerShortWrapper getServer(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers/{id}"
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

    TypeReference<McpServerShortWrapper> localVarReturnType = new TypeReference<McpServerShortWrapper>() {};
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
   * Get all MCP servers
   * Returns a paginated list of all MCP servers registered for the current tenant, including both  enabled and disabled servers. Each entry contains the full configuration (endpoint, headers,  icon, type, and status). Supports pagination via the startIndex and count query parameters.  The total number of servers is included in the response metadata.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for getServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-servers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @return McpServerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerArrayWrapper getServers(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count) throws ApiException {
    return this.getServers(startIndex, count, Collections.emptyMap());
  }


  /**
   * Get all MCP servers
   * Returns a paginated list of all MCP servers registered for the current tenant, including both  enabled and disabled servers. Each entry contains the full configuration (endpoint, headers,  icon, type, and status). Supports pagination via the startIndex and count query parameters.  The total number of servers is included in the response metadata.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for getServers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-servers/
   *
   * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
   * @param count The maximum number of items to return per page. Defaults to 100. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerArrayWrapper getServers(@javax.annotation.Nullable Integer startIndex, @javax.annotation.Nullable Integer count, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
      
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

    TypeReference<McpServerArrayWrapper> localVarReturnType = new TypeReference<McpServerArrayWrapper>() {};
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
   * Get MCP server tools in a room
   * Retrieves the full list of tools exposed by an MCP server within the context of a specific room,  along with each tool's enabled or disabled state. Disabled tools will not be invoked during  AI chat sessions in this room. Requires access to the room's AI chat.
   *
   * REST API Reference for getTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tools/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server whose tools are being retrieved. (required)
   * @return McpToolArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpToolArrayWrapper getTools(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId) throws ApiException {
    return this.getTools(roomId, serverId, Collections.emptyMap());
  }


  /**
   * Get MCP server tools in a room
   * Retrieves the full list of tools exposed by an MCP server within the context of a specific room,  along with each tool's enabled or disabled state. Disabled tools will not be invoked during  AI chat sessions in this room. Requires access to the room's AI chat.
   *
   * REST API Reference for getTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tools/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server whose tools are being retrieved. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpToolArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpToolArrayWrapper getTools(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getTools");
    }
    
    // verify the required parameter 'serverId' is set
    if (serverId == null) {
      throw new ApiException(400, "Missing the required parameter 'serverId' when calling getTools");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)))
      .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(apiClient.parameterToString(serverId)));

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

    TypeReference<McpToolArrayWrapper> localVarReturnType = new TypeReference<McpToolArrayWrapper>() {};
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
   * Enable or disable an MCP server
   * Toggles the enabled/disabled state of an MCP server. When a server is disabled, it becomes  unavailable for assignment to rooms and will not be used during AI chat sessions.  Enabling a previously disabled server restores its availability across the tenant.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for setServerStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-server-status/
   *
   * @param id Unique identifier of the MCP server whose status is being changed. (required)
   * @param setServerStatusRequestBody New status value. (required)
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper setServerStatus(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull SetServerStatusRequestBody setServerStatusRequestBody) throws ApiException {
    return this.setServerStatus(id, setServerStatusRequestBody, Collections.emptyMap());
  }


  /**
   * Enable or disable an MCP server
   * Toggles the enabled/disabled state of an MCP server. When a server is disabled, it becomes  unavailable for assignment to rooms and will not be used during AI chat sessions.  Enabling a previously disabled server restores its availability across the tenant.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for setServerStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-server-status/
   *
   * @param id Unique identifier of the MCP server whose status is being changed. (required)
   * @param setServerStatusRequestBody New status value. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper setServerStatus(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull SetServerStatusRequestBody setServerStatusRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setServerStatusRequestBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setServerStatus");
    }
    
    // verify the required parameter 'setServerStatusRequestBody' is set
    if (setServerStatusRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setServerStatusRequestBody' when calling setServerStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers/{id}/status"
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

    TypeReference<McpServerWrapper> localVarReturnType = new TypeReference<McpServerWrapper>() {};
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
   * Configure MCP server tools in a room
   * Updates the set of disabled tools for an MCP server within a specific room. Pass a list of tool names  that should be disabled — all other tools exposed by the server will remain enabled. This allows  room administrators to restrict which MCP capabilities are available during AI chat sessions.  Requires room edit permissions.
   *
   * REST API Reference for setTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tools/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server whose tools are being configured. (required)
   * @param setMcpToolsRequestBody Tool configuration parameters. (required)
   * @return McpToolArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpToolArrayWrapper setTools(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, @javax.annotation.Nonnull SetMcpToolsRequestBody setMcpToolsRequestBody) throws ApiException {
    return this.setTools(roomId, serverId, setMcpToolsRequestBody, Collections.emptyMap());
  }


  /**
   * Configure MCP server tools in a room
   * Updates the set of disabled tools for an MCP server within a specific room. Pass a list of tool names  that should be disabled — all other tools exposed by the server will remain enabled. This allows  room administrators to restrict which MCP capabilities are available during AI chat sessions.  Requires room edit permissions.
   *
   * REST API Reference for setTools Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tools/
   *
   * @param roomId Identifier of the room containing the MCP server. (required)
   * @param serverId Unique identifier of the MCP server whose tools are being configured. (required)
   * @param setMcpToolsRequestBody Tool configuration parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpToolArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public McpToolArrayWrapper setTools(@javax.annotation.Nonnull Integer roomId, @javax.annotation.Nonnull UUID serverId, @javax.annotation.Nonnull SetMcpToolsRequestBody setMcpToolsRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = setMcpToolsRequestBody;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling setTools");
    }
    
    // verify the required parameter 'serverId' is set
    if (serverId == null) {
      throw new ApiException(400, "Missing the required parameter 'serverId' when calling setTools");
    }
    
    // verify the required parameter 'setMcpToolsRequestBody' is set
    if (setMcpToolsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setMcpToolsRequestBody' when calling setTools");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools"
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(apiClient.parameterToString(roomId)))
      .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(apiClient.parameterToString(serverId)));

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

    TypeReference<McpToolArrayWrapper> localVarReturnType = new TypeReference<McpToolArrayWrapper>() {};
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
   * Update a custom MCP server
   * Updates the configuration of an existing custom MCP server identified by its unique ID.  Any combination of fields (name, description, endpoint, headers, icon) can be updated in a single request.  If the endpoint or headers are changed, the system re-validates connectivity by attempting to reach  the new endpoint before saving. Name uniqueness and format rules are enforced on every update.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for updateServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-server/
   *
   * @param id Unique identifier of the MCP server to update. (required)
   * @param updateServerRequestBody Updated server configuration fields. (required)
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper updateServer(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UpdateServerRequestBody updateServerRequestBody) throws ApiException {
    return this.updateServer(id, updateServerRequestBody, Collections.emptyMap());
  }


  /**
   * Update a custom MCP server
   * Updates the configuration of an existing custom MCP server identified by its unique ID.  Any combination of fields (name, description, endpoint, headers, icon) can be updated in a single request.  If the endpoint or headers are changed, the system re-validates connectivity by attempting to reach  the new endpoint before saving. Name uniqueness and format rules are enforced on every update.  Requires DocSpace administrator privileges.
   *
   * REST API Reference for updateServer Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-server/
   *
   * @param id Unique identifier of the MCP server to update. (required)
   * @param updateServerRequestBody Updated server configuration fields. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return McpServerWrapper
   * @throws ApiException if fails to make API call
   */
  public McpServerWrapper updateServer(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UpdateServerRequestBody updateServerRequestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateServerRequestBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateServer");
    }
    
    // verify the required parameter 'updateServerRequestBody' is set
    if (updateServerRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'updateServerRequestBody' when calling updateServer");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/servers/{id}"
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

    TypeReference<McpServerWrapper> localVarReturnType = new TypeReference<McpServerWrapper>() {};
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
