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

package org.openapitools.client.api.Settings;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.NotificationChannelStatusWrapper;
import org.openapitools.client.model.NotificationSettingsRequestsDto;
import org.openapitools.client.model.NotificationSettingsWrapper;
import org.openapitools.client.model.NotificationType;
import org.openapitools.client.model.RoomsNotificationSettingsWrapper;
import org.openapitools.client.model.RoomsNotificationsSettingsRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class NotificationsApi extends BaseApi {

  public NotificationsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public NotificationsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Get notification channels
   * Returns a list of notification channels.
   *
   * REST API Reference for getNotificationChannels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-channels/
   *
   * @return NotificationChannelStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationChannelStatusWrapper getNotificationChannels() throws ApiException {
    return this.getNotificationChannels(Collections.emptyMap());
  }


  /**
   * Get notification channels
   * Returns a list of notification channels.
   *
   * REST API Reference for getNotificationChannels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-channels/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return NotificationChannelStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationChannelStatusWrapper getNotificationChannels(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/notification/channels";

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

    TypeReference<NotificationChannelStatusWrapper> localVarReturnType = new TypeReference<NotificationChannelStatusWrapper>() {};
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
   * Check notification availability
   * Checks if the notification type specified in the request is enabled or not.
   *
   * REST API Reference for getNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-settings/
   *
   * @param type The type of notification to query, specified in the route. (required)
   * @return NotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationSettingsWrapper getNotificationSettings(@javax.annotation.Nonnull NotificationType type) throws ApiException {
    return this.getNotificationSettings(type, Collections.emptyMap());
  }


  /**
   * Check notification availability
   * Checks if the notification type specified in the request is enabled or not.
   *
   * REST API Reference for getNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-settings/
   *
   * @param type The type of notification to query, specified in the route. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return NotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationSettingsWrapper getNotificationSettings(@javax.annotation.Nonnull NotificationType type, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/notification/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(apiClient.parameterToString(type)));

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

    TypeReference<NotificationSettingsWrapper> localVarReturnType = new TypeReference<NotificationSettingsWrapper>() {};
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
   * Get room notification settings
   * Returns a list of rooms with the disabled notifications.
   *
   * REST API Reference for getRoomsNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-notification-settings/
   *
   * @return RoomsNotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomsNotificationSettingsWrapper getRoomsNotificationSettings() throws ApiException {
    return this.getRoomsNotificationSettings(Collections.emptyMap());
  }


  /**
   * Get room notification settings
   * Returns a list of rooms with the disabled notifications.
   *
   * REST API Reference for getRoomsNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-notification-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomsNotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomsNotificationSettingsWrapper getRoomsNotificationSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/notification/rooms";

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

    TypeReference<RoomsNotificationSettingsWrapper> localVarReturnType = new TypeReference<RoomsNotificationSettingsWrapper>() {};
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
   * Enable notifications
   * Enables the notification type specified in the request.
   *
   * REST API Reference for setNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-notification-settings/
   *
   * @param notificationSettingsRequestsDto  (optional)
   * @return NotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationSettingsWrapper setNotificationSettings(@javax.annotation.Nullable NotificationSettingsRequestsDto notificationSettingsRequestsDto) throws ApiException {
    return this.setNotificationSettings(notificationSettingsRequestsDto, Collections.emptyMap());
  }


  /**
   * Enable notifications
   * Enables the notification type specified in the request.
   *
   * REST API Reference for setNotificationSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-notification-settings/
   *
   * @param notificationSettingsRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return NotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public NotificationSettingsWrapper setNotificationSettings(@javax.annotation.Nullable NotificationSettingsRequestsDto notificationSettingsRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = notificationSettingsRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/notification";

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

    TypeReference<NotificationSettingsWrapper> localVarReturnType = new TypeReference<NotificationSettingsWrapper>() {};
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
   * Set room notification status
   * Sets a notification status for a room with the ID specified in the request.
   *
   * REST API Reference for setRoomsNotificationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-rooms-notification-status/
   *
   * @param roomsNotificationsSettingsRequestDto  (optional)
   * @return RoomsNotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomsNotificationSettingsWrapper setRoomsNotificationStatus(@javax.annotation.Nullable RoomsNotificationsSettingsRequestDto roomsNotificationsSettingsRequestDto) throws ApiException {
    return this.setRoomsNotificationStatus(roomsNotificationsSettingsRequestDto, Collections.emptyMap());
  }


  /**
   * Set room notification status
   * Sets a notification status for a room with the ID specified in the request.
   *
   * REST API Reference for setRoomsNotificationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-rooms-notification-status/
   *
   * @param roomsNotificationsSettingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return RoomsNotificationSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public RoomsNotificationSettingsWrapper setRoomsNotificationStatus(@javax.annotation.Nullable RoomsNotificationsSettingsRequestDto roomsNotificationsSettingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = roomsNotificationsSettingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/notification/rooms";

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

    TypeReference<RoomsNotificationSettingsWrapper> localVarReturnType = new TypeReference<RoomsNotificationSettingsWrapper>() {};
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
