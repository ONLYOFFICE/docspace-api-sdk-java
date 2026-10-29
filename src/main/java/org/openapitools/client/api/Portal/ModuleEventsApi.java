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

package org.openapitools.client.api.Portal;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.SendModuleEventRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ModuleEventsApi extends BaseApi {

  public ModuleEventsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ModuleEventsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Send a module event
   * Delivers one event from an integration module to the browsers of the portal named by the request host, over  the socket connection every open DocSpace page already keeps. No user session is needed: the caller  identifies itself with the module key in the `X-Module-Key` header, which the installation administrator  issues and allows for a list of portals. Set exactly one addressee - `user`, the e-mail of a portal user,  reaches only that user's open sessions without any subscription, and `room` reaches everyone in the portal  subscribed to `plugin-{module}-{room}`. Browsers receive `plugin:{module}:{event}` with `{ message }`, the  module name taken from the key, never from the body. The call only hands the event over: nothing is stored,  a user with no open session never sees it, and a repeated call delivers it again. Keep `message` a signal to  re-read, such as an unread count. The body is limited to 64 KB. A missing or unknown key fails with 401, a  portal the key is not allowed for with 403, an unknown or inactive user with 404, and invalid names or not  exactly one addressee with 400.
   *
   * REST API Reference for sendModuleEvent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-module-event/
   *
   * @param xModuleKey The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity. (optional)
   * @param sendModuleEventRequest The event to deliver. (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendModuleEvent(@javax.annotation.Nullable String xModuleKey, @javax.annotation.Nullable SendModuleEventRequest sendModuleEventRequest) throws ApiException {
    this.sendModuleEvent(xModuleKey, sendModuleEventRequest, Collections.emptyMap());
  }


  /**
   * Send a module event
   * Delivers one event from an integration module to the browsers of the portal named by the request host, over  the socket connection every open DocSpace page already keeps. No user session is needed: the caller  identifies itself with the module key in the `X-Module-Key` header, which the installation administrator  issues and allows for a list of portals. Set exactly one addressee - `user`, the e-mail of a portal user,  reaches only that user's open sessions without any subscription, and `room` reaches everyone in the portal  subscribed to `plugin-{module}-{room}`. Browsers receive `plugin:{module}:{event}` with `{ message }`, the  module name taken from the key, never from the body. The call only hands the event over: nothing is stored,  a user with no open session never sees it, and a repeated call delivers it again. Keep `message` a signal to  re-read, such as an unread count. The body is limited to 64 KB. A missing or unknown key fails with 401, a  portal the key is not allowed for with 403, an unknown or inactive user with 404, and invalid names or not  exactly one addressee with 400.
   *
   * REST API Reference for sendModuleEvent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-module-event/
   *
   * @param xModuleKey The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity. (optional)
   * @param sendModuleEventRequest The event to deliver. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void sendModuleEvent(@javax.annotation.Nullable String xModuleKey, @javax.annotation.Nullable SendModuleEventRequest sendModuleEventRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sendModuleEventRequest;
    
    // create path and map variables
    String localVarPath = "/api/2.0/portal/moduleevents";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (xModuleKey != null)
      localVarHeaderParams.put("x-Module-Key", apiClient.parameterToString(xModuleKey));
  
    
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
