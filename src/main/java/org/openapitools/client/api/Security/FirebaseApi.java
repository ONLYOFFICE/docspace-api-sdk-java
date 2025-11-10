/*
 * (c) Copyright Ascensio System SIA 2025
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

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.FireBaseUserWrapper;
import org.openapitools.client.model.FirebaseRequestsDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FirebaseApi extends BaseApi {

  public FirebaseApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FirebaseApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Save the Documents Firebase device token
   * Saves the Firebase device token specified in the request for the Documents application.
   *
   * REST API Reference for docRegisterPusnNotificationDevice Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/doc-register-pusn-notification-device/
   *
   * @param firebaseRequestsDto  (optional)
   * @return FireBaseUserWrapper
   * @throws ApiException if fails to make API call
   */
  public FireBaseUserWrapper docRegisterPusnNotificationDevice(@javax.annotation.Nullable FirebaseRequestsDto firebaseRequestsDto) throws ApiException {
    return this.docRegisterPusnNotificationDevice(firebaseRequestsDto, Collections.emptyMap());
  }


  /**
   * Save the Documents Firebase device token
   * Saves the Firebase device token specified in the request for the Documents application.
   *
   * REST API Reference for docRegisterPusnNotificationDevice Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/doc-register-pusn-notification-device/
   *
   * @param firebaseRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FireBaseUserWrapper
   * @throws ApiException if fails to make API call
   */
  public FireBaseUserWrapper docRegisterPusnNotificationDevice(@javax.annotation.Nullable FirebaseRequestsDto firebaseRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = firebaseRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/push/docregisterdevice";

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

    TypeReference<FireBaseUserWrapper> localVarReturnType = new TypeReference<FireBaseUserWrapper>() {};
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
   * Subscribe to Documents push notification
   * Subscribes to the Documents push notification.
   *
   * REST API Reference for subscribeDocumentsPushNotification Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/subscribe-documents-push-notification/
   *
   * @param firebaseRequestsDto  (optional)
   * @return FireBaseUserWrapper
   * @throws ApiException if fails to make API call
   */
  public FireBaseUserWrapper subscribeDocumentsPushNotification(@javax.annotation.Nullable FirebaseRequestsDto firebaseRequestsDto) throws ApiException {
    return this.subscribeDocumentsPushNotification(firebaseRequestsDto, Collections.emptyMap());
  }


  /**
   * Subscribe to Documents push notification
   * Subscribes to the Documents push notification.
   *
   * REST API Reference for subscribeDocumentsPushNotification Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/subscribe-documents-push-notification/
   *
   * @param firebaseRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FireBaseUserWrapper
   * @throws ApiException if fails to make API call
   */
  public FireBaseUserWrapper subscribeDocumentsPushNotification(@javax.annotation.Nullable FirebaseRequestsDto firebaseRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = firebaseRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/push/docsubscribe";

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

    TypeReference<FireBaseUserWrapper> localVarReturnType = new TypeReference<FireBaseUserWrapper>() {};
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
