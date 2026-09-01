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
import org.openapitools.client.model.AiExportTextToDocx200Response;
import org.openapitools.client.model.AiExportTextToDocxRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ExportApi extends BaseApi {

  public ExportApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ExportApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Start markdown → docx export
   * Starts an asynchronous markdown-to-docx export. The response only acknowledges the task: the AI Worker converts the content and saves the .docx into the target folder (an agent room resolves to its result-storage subfolder), and completion reaches the client as the usual folder-modified socket event.
   *
   * REST API Reference for aiExportTextToDocx Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/
   *
   * @param aiExportTextToDocxRequest  (required)
   * @return AiExportTextToDocx200Response
   * @throws ApiException if fails to make API call
   */
  public AiExportTextToDocx200Response aiExportTextToDocx(@javax.annotation.Nonnull AiExportTextToDocxRequest aiExportTextToDocxRequest) throws ApiException {
    return this.aiExportTextToDocx(aiExportTextToDocxRequest, Collections.emptyMap());
  }


  /**
   * Start markdown → docx export
   * Starts an asynchronous markdown-to-docx export. The response only acknowledges the task: the AI Worker converts the content and saves the .docx into the target folder (an agent room resolves to its result-storage subfolder), and completion reaches the client as the usual folder-modified socket event.
   *
   * REST API Reference for aiExportTextToDocx Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/
   *
   * @param aiExportTextToDocxRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiExportTextToDocx200Response
   * @throws ApiException if fails to make API call
   */
  public AiExportTextToDocx200Response aiExportTextToDocx(@javax.annotation.Nonnull AiExportTextToDocxRequest aiExportTextToDocxRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiExportTextToDocxRequest;
    
    // verify the required parameter 'aiExportTextToDocxRequest' is set
    if (aiExportTextToDocxRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiExportTextToDocxRequest' when calling aiExportTextToDocx");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/text-to-docx";

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

    TypeReference<AiExportTextToDocx200Response> localVarReturnType = new TypeReference<AiExportTextToDocx200Response>() {};
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
