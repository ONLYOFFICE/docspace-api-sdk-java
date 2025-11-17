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

import org.openapitools.client.model.CreateWebhooksConfigRequestsDto;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.UnknownWrapper;
import org.openapitools.client.model.UpdateWebhooksConfigRequestsDto;
import org.openapitools.client.model.WebhookGroupStatus;
import org.openapitools.client.model.WebhookRetryRequestsDto;
import org.openapitools.client.model.WebhookTrigger;
import org.openapitools.client.model.WebhooksConfigWithStatusArrayWrapper;
import org.openapitools.client.model.WebhooksConfigWrapper;
import org.openapitools.client.model.WebhooksLogArrayWrapper;
import org.openapitools.client.model.WebhooksLogWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class WebhooksApi extends BaseApi {

  public WebhooksApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    super(apiClient);
  }

  private String fields;

  /**
   * Specifies which fields should be included in the API response.
   * @param fields A comma-separated list of field paths to include in the response
   * @return this (for method chaining)
   */
  public WebhooksApi withFields(String fields) {
      this.fields = fields;
      return this;
  }

  /**
   * Create a webhook
   * Creates a new tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for createWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-webhook/
   *
   * @param createWebhooksConfigRequestsDto  (optional)
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper createWebhook(@javax.annotation.Nullable CreateWebhooksConfigRequestsDto createWebhooksConfigRequestsDto) throws ApiException {
    return this.createWebhook(createWebhooksConfigRequestsDto, Collections.emptyMap());
  }


  /**
   * Create a webhook
   * Creates a new tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for createWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-webhook/
   *
   * @param createWebhooksConfigRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper createWebhook(@javax.annotation.Nullable CreateWebhooksConfigRequestsDto createWebhooksConfigRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createWebhooksConfigRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook";

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

    TypeReference<WebhooksConfigWrapper> localVarReturnType = new TypeReference<WebhooksConfigWrapper>() {};
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
   * Enable a webhook
   * Enables or disables a tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for enableWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-webhook/
   *
   * @param updateWebhooksConfigRequestsDto  (optional)
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper enableWebhook(@javax.annotation.Nullable UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto) throws ApiException {
    return this.enableWebhook(updateWebhooksConfigRequestsDto, Collections.emptyMap());
  }


  /**
   * Enable a webhook
   * Enables or disables a tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for enableWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-webhook/
   *
   * @param updateWebhooksConfigRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper enableWebhook(@javax.annotation.Nullable UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateWebhooksConfigRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook/enable";

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

    TypeReference<WebhooksConfigWrapper> localVarReturnType = new TypeReference<WebhooksConfigWrapper>() {};
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
   * Get webhooks
   * Returns a list of the tenant webhooks.
   *
   * REST API Reference for getTenantWebhooks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-webhooks/
   *
   * @return WebhooksConfigWithStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWithStatusArrayWrapper getTenantWebhooks() throws ApiException {
    return this.getTenantWebhooks(Collections.emptyMap());
  }


  /**
   * Get webhooks
   * Returns a list of the tenant webhooks.
   *
   * REST API Reference for getTenantWebhooks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-webhooks/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksConfigWithStatusArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWithStatusArrayWrapper getTenantWebhooks(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook";

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

    TypeReference<WebhooksConfigWithStatusArrayWrapper> localVarReturnType = new TypeReference<WebhooksConfigWithStatusArrayWrapper>() {};
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
   * Get webhook triggers
   * Returns a list of triggers for a webhook.
   *
   * REST API Reference for getWebhookTriggers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/
   *
   * @return UnknownWrapper
   * @throws ApiException if fails to make API call
   */
  public UnknownWrapper getWebhookTriggers() throws ApiException {
    return this.getWebhookTriggers(Collections.emptyMap());
  }


  /**
   * Get webhook triggers
   * Returns a list of triggers for a webhook.
   *
   * REST API Reference for getWebhookTriggers Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return UnknownWrapper
   * @throws ApiException if fails to make API call
   */
  public UnknownWrapper getWebhookTriggers(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook/triggers";

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

    TypeReference<UnknownWrapper> localVarReturnType = new TypeReference<UnknownWrapper>() {};
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
   * Get webhook logs
   * Returns the logs of the webhook activities.
   *
   * REST API Reference for getWebhooksLogs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/
   *
   * @param deliveryFrom The delivery start time for filtering webhook logs. (optional)
   * @param deliveryTo The delivery end time for filtering webhook logs. (optional)
   * @param hookUri The destination URL where webhooks are delivered. (optional)
   * @param configId The webhook configuration identifier. (optional)
   * @param eventId The unique identifier of the event that triggered the webhook. (optional)
   * @param groupStatus The status of the webhook delivery group. (optional)
   * @param userId The identifier of the user associated with the webhook event. (optional)
   * @param trigger The type of event that triggered the webhook. (optional)
   * @param count The maximum number of webhook log records to return in the query response. (optional)
   * @param startIndex Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries. (optional)
   * @return WebhooksLogArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogArrayWrapper getWebhooksLogs(@javax.annotation.Nullable OffsetDateTime deliveryFrom, @javax.annotation.Nullable OffsetDateTime deliveryTo, @javax.annotation.Nullable String hookUri, @javax.annotation.Nullable Integer configId, @javax.annotation.Nullable Integer eventId, @javax.annotation.Nullable WebhookGroupStatus groupStatus, @javax.annotation.Nullable UUID userId, @javax.annotation.Nullable WebhookTrigger trigger, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex) throws ApiException {
    return this.getWebhooksLogs(deliveryFrom, deliveryTo, hookUri, configId, eventId, groupStatus, userId, trigger, count, startIndex, Collections.emptyMap());
  }


  /**
   * Get webhook logs
   * Returns the logs of the webhook activities.
   *
   * REST API Reference for getWebhooksLogs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/
   *
   * @param deliveryFrom The delivery start time for filtering webhook logs. (optional)
   * @param deliveryTo The delivery end time for filtering webhook logs. (optional)
   * @param hookUri The destination URL where webhooks are delivered. (optional)
   * @param configId The webhook configuration identifier. (optional)
   * @param eventId The unique identifier of the event that triggered the webhook. (optional)
   * @param groupStatus The status of the webhook delivery group. (optional)
   * @param userId The identifier of the user associated with the webhook event. (optional)
   * @param trigger The type of event that triggered the webhook. (optional)
   * @param count The maximum number of webhook log records to return in the query response. (optional)
   * @param startIndex Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksLogArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogArrayWrapper getWebhooksLogs(@javax.annotation.Nullable OffsetDateTime deliveryFrom, @javax.annotation.Nullable OffsetDateTime deliveryTo, @javax.annotation.Nullable String hookUri, @javax.annotation.Nullable Integer configId, @javax.annotation.Nullable Integer eventId, @javax.annotation.Nullable WebhookGroupStatus groupStatus, @javax.annotation.Nullable UUID userId, @javax.annotation.Nullable WebhookTrigger trigger, @javax.annotation.Nullable Integer count, @javax.annotation.Nullable Integer startIndex, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhooks/log";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("deliveryFrom", deliveryFrom));
    localVarQueryParams.addAll(apiClient.parameterToPair("deliveryTo", deliveryTo));
    localVarQueryParams.addAll(apiClient.parameterToPair("hookUri", hookUri));
    localVarQueryParams.addAll(apiClient.parameterToPair("configId", configId));
    localVarQueryParams.addAll(apiClient.parameterToPair("eventId", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPair("groupStatus", groupStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPair("trigger", trigger));
    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("startIndex", startIndex));
      
    if (this.fields != null)
      localVarHeaderParams.put.Add("fields", this.fields);

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<WebhooksLogArrayWrapper> localVarReturnType = new TypeReference<WebhooksLogArrayWrapper>() {};
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
   * Remove a webhook
   * Removes a tenant webhook with the ID specified in the request.
   *
   * REST API Reference for removeWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper removeWebhook(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.removeWebhook(id, Collections.emptyMap());
  }


  /**
   * Remove a webhook
   * Removes a tenant webhook with the ID specified in the request.
   *
   * REST API Reference for removeWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper removeWebhook(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook/{id}"
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

    TypeReference<WebhooksConfigWrapper> localVarReturnType = new TypeReference<WebhooksConfigWrapper>() {};
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
   * Retry a webhook
   * Retries a webhook with the ID specified in the request.
   *
   * REST API Reference for retryWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @return WebhooksLogWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogWrapper retryWebhook(@javax.annotation.Nonnull Integer id) throws ApiException {
    return this.retryWebhook(id, Collections.emptyMap());
  }


  /**
   * Retry a webhook
   * Retries a webhook with the ID specified in the request.
   *
   * REST API Reference for retryWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/
   *
   * @param id The ID extracted from the route parameters. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksLogWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogWrapper retryWebhook(@javax.annotation.Nonnull Integer id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retryWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook/{id}/retry"
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

    TypeReference<WebhooksLogWrapper> localVarReturnType = new TypeReference<WebhooksLogWrapper>() {};
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
   * Retry webhooks
   * Retries all the webhooks with the IDs specified in the request.
   *
   * REST API Reference for retryWebhooks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhooks/
   *
   * @param webhookRetryRequestsDto  (optional)
   * @return WebhooksLogArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogArrayWrapper retryWebhooks(@javax.annotation.Nullable WebhookRetryRequestsDto webhookRetryRequestsDto) throws ApiException {
    return this.retryWebhooks(webhookRetryRequestsDto, Collections.emptyMap());
  }


  /**
   * Retry webhooks
   * Retries all the webhooks with the IDs specified in the request.
   *
   * REST API Reference for retryWebhooks Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhooks/
   *
   * @param webhookRetryRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksLogArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksLogArrayWrapper retryWebhooks(@javax.annotation.Nullable WebhookRetryRequestsDto webhookRetryRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webhookRetryRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook/retry";

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

    TypeReference<WebhooksLogArrayWrapper> localVarReturnType = new TypeReference<WebhooksLogArrayWrapper>() {};
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
   * Update a webhook
   * Updates a tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for updateWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-webhook/
   *
   * @param updateWebhooksConfigRequestsDto  (optional)
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper updateWebhook(@javax.annotation.Nullable UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto) throws ApiException {
    return this.updateWebhook(updateWebhooksConfigRequestsDto, Collections.emptyMap());
  }


  /**
   * Update a webhook
   * Updates a tenant webhook with the parameters specified in the request.
   *
   * REST API Reference for updateWebhook Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-webhook/
   *
   * @param updateWebhooksConfigRequestsDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebhooksConfigWrapper
   * @throws ApiException if fails to make API call
   */
  public WebhooksConfigWrapper updateWebhook(@javax.annotation.Nullable UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateWebhooksConfigRequestsDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/webhook";

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

    TypeReference<WebhooksConfigWrapper> localVarReturnType = new TypeReference<WebhooksConfigWrapper>() {};
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
