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

import org.openapitools.client.model.ExportMessageRequestBodyInteger;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class MessagesApi extends BaseApi {

  public MessagesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Export a single AI message to a document
   * Exports a specific AI chat message as a document into the specified folder. The system verifies that the message exists  and belongs to a chat accessible by the current user, then publishes an asynchronous export task to the event bus.  The exported document will be created in the target folder with the given title once the background task completes.
   *
   * REST API Reference for exportMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-message/
   *
   * @param messageId The unique identifier of the AI chat message to export. (required)
   * @param exportMessageRequestBodyInteger The export parameters including destination folder and file title. (required)
   * @throws ApiException if fails to make API call
   */
  public void exportMessage(@javax.annotation.Nonnull Integer messageId, @javax.annotation.Nonnull ExportMessageRequestBodyInteger exportMessageRequestBodyInteger) throws ApiException {
    this.exportMessage(messageId, exportMessageRequestBodyInteger, Collections.emptyMap());
  }


  /**
   * Export a single AI message to a document
   * Exports a specific AI chat message as a document into the specified folder. The system verifies that the message exists  and belongs to a chat accessible by the current user, then publishes an asynchronous export task to the event bus.  The exported document will be created in the target folder with the given title once the background task completes.
   *
   * REST API Reference for exportMessage Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-message/
   *
   * @param messageId The unique identifier of the AI chat message to export. (required)
   * @param exportMessageRequestBodyInteger The export parameters including destination folder and file title. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void exportMessage(@javax.annotation.Nonnull Integer messageId, @javax.annotation.Nonnull ExportMessageRequestBodyInteger exportMessageRequestBodyInteger, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = exportMessageRequestBodyInteger;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling exportMessage");
    }
    
    // verify the required parameter 'exportMessageRequestBodyInteger' is set
    if (exportMessageRequestBodyInteger == null) {
      throw new ApiException(400, "Missing the required parameter 'exportMessageRequestBodyInteger' when calling exportMessage");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/messages/{messageId}/export"
      .replaceAll("\\{" + "messageId" + "\\}", apiClient.escapeString(apiClient.parameterToString(messageId)));

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
