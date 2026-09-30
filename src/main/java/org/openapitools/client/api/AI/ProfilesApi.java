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
import org.openapitools.client.model.AiProfilesListProviderModels400Response;
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
   * Create a provider profile
   * Creates an AI provider profile - the endpoint, credentials and model that a chat round runs on - and returns it. The name has to be unique, the credentials are probed against the live provider before anything is stored, and the portal's first profile also takes the `Default` assignment slot. Two inputs are refused outright: a `baseUrl` pointing at a private network address, and `providerType: external`, which delegates transport to the host application and therefore cannot work for a profile the server manages. On a portal running the AI gateway, profiles are managed centrally and this operation answers 403.
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
   * Create a provider profile
   * Creates an AI provider profile - the endpoint, credentials and model that a chat round runs on - and returns it. The name has to be unique, the credentials are probed against the live provider before anything is stored, and the portal's first profile also takes the `Default` assignment slot. Two inputs are refused outright: a `baseUrl` pointing at a private network address, and `providerType: external`, which delegates transport to the host application and therefore cannot work for a profile the server manages. On a portal running the AI gateway, profiles are managed centrally and this operation answers 403.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Delete a provider profile
   * Deletes an AI provider profile and cleans up every assignment pointing at it: the `Default` slot moves to the first remaining profile and the other slots are left unbound. The ID is required and may be sent in the body or as a query parameter. An unknown ID is not reported - the call answers success without deleting anything. Threads already bound to the profile keep the stored reference, so a round on such a thread falls back to whatever the scope resolves to.
   *
   * REST API Reference for aiProfilesDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
   *
   * @param body The ID of the profile to delete, as a bare JSON string. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiProfilesDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiProfilesDelete(body, Collections.emptyMap());
  }


  /**
   * Delete a provider profile
   * Deletes an AI provider profile and cleans up every assignment pointing at it: the `Default` slot moves to the first remaining profile and the other slots are left unbound. The ID is required and may be sent in the body or as a query parameter. An unknown ID is not reported - the call answers success without deleting anything. Threads already bound to the profile keep the stored reference, so a round on such a thread falls back to whatever the scope resolves to.
   *
   * REST API Reference for aiProfilesDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
   *
   * @param body The ID of the profile to delete, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Get a provider profile
   * Returns one AI provider profile by its ID, with its secrets stripped: neither the API key nor the custom headers are ever sent back, on any portal. The ID is required and is read from the query, and an unknown one answers 404. The `baseUrl` in the answer is the one that was stored, not the internal gateway address a round actually dials, so it cannot be used to reach the provider directly. Use `GET api/2.0/ai/profiles/list` to enumerate profiles instead of reading them one by one.
   *
   * REST API Reference for aiProfilesGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/
   *
   * @param id The AI provider profile identifier. (required)
   * @return AiProfilesGetById200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesGetById200Response aiProfilesGetById(@javax.annotation.Nonnull String id) throws ApiException {
    return this.aiProfilesGetById(id, Collections.emptyMap());
  }


  /**
   * Get a provider profile
   * Returns one AI provider profile by its ID, with its secrets stripped: neither the API key nor the custom headers are ever sent back, on any portal. The ID is required and is read from the query, and an unknown one answers 404. The `baseUrl` in the answer is the one that was stored, not the internal gateway address a round actually dials, so it cannot be used to reach the provider directly. Use `GET api/2.0/ai/profiles/list` to enumerate profiles instead of reading them one by one.
   *
   * REST API Reference for aiProfilesGetById Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/
   *
   * @param id The AI provider profile identifier. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * List provider profiles
   * Lists the portal's AI provider profiles with their secrets stripped, the same way the single-profile read does. It takes no parameters and is not paginated, because a portal holds few profiles. On a portal running the AI gateway the answer is synthesised from the gateway's own catalogue rather than from stored records. The IDs in the answer are what the assignment operations and every round's `profileId` accept.
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
   * List provider profiles
   * Lists the portal's AI provider profiles with their secrets stripped, the same way the single-profile read does. It takes no parameters and is not paginated, because a portal holds few profiles. On a portal running the AI gateway the answer is synthesised from the gateway's own catalogue rather than from stored records. The IDs in the answer are what the assignment operations and every round's `profileId` accept.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Lists the models a stored profile's provider currently offers, asking the provider itself rather than reading a cached list. `profileId` is required and is read from the query. A failure is reported with the provider's own verdict: an unusable key comes back as 400 and a provider that is unreachable or broken as 502, while a missing profile or a caller without access keeps the status the portal gave it. Use `POST api/2.0/ai/profiles/list-provider-models` to probe an endpoint that has no profile yet.
   *
   * REST API Reference for aiProfilesListModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/
   *
   * @param profileId The AI provider profile identifier. (required)
   * @return List&lt;AiModel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AiModel> aiProfilesListModels(@javax.annotation.Nonnull String profileId) throws ApiException {
    return this.aiProfilesListModels(profileId, Collections.emptyMap());
  }


  /**
   * List models
   * Lists the models a stored profile's provider currently offers, asking the provider itself rather than reading a cached list. `profileId` is required and is read from the query. A failure is reported with the provider's own verdict: an unusable key comes back as 400 and a provider that is unreachable or broken as 502, while a missing profile or a caller without access keeps the status the portal gave it. Use `POST api/2.0/ai/profiles/list-provider-models` to probe an endpoint that has no profile yet.
   *
   * REST API Reference for aiProfilesListModels Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/
   *
   * @param profileId The AI provider profile identifier. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Lists the models an endpoint offers for credentials supplied in the request, before any profile exists - this is what a provider-setup form calls to fill its model picker. `providerType` and `baseUrl` are both required, and a 400 for either names the offending input in a `field` member so the form can highlight it; a `baseUrl` pointing at a private network address is refused as well. For `providerType: onlyoffice` the answer comes from the portal gateway's catalogue, which carries richer capability data than the provider's own listing and matches what `GET api/2.0/ai/profiles/list` reports; a portal without that gateway falls back to asking the provider. A provider that is unreachable or broken is reported as 502, and one that rejects the key as 400.
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
   * Lists the models an endpoint offers for credentials supplied in the request, before any profile exists - this is what a provider-setup form calls to fill its model picker. `providerType` and `baseUrl` are both required, and a 400 for either names the offending input in a `field` member so the form can highlight it; a `baseUrl` pointing at a private network address is refused as well. For `providerType: onlyoffice` the answer comes from the portal gateway's catalogue, which carries richer capability data than the provider's own listing and matches what `GET api/2.0/ai/profiles/list` reports; a portal without that gateway falls back to asking the provider. A provider that is unreachable or broken is reported as 502, and one that rejects the key as 400.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Test a profile's provider
   * Probes a stored profile's credentials against its provider and reports the outcome in the answer, writing nothing - this is what a Test button calls so that a failure does not commit anything. `profileId` is required and may be sent in the body or as a query parameter. The result is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload. To validate credentials that are not stored yet, use `POST api/2.0/ai/profiles/list-provider-models`.
   *
   * REST API Reference for aiProfilesTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
   *
   * @param body The ID of the profile to probe, as a bare JSON string. (required)
   * @return AiProfilesTestConnection200Response
   * @throws ApiException if fails to make API call
   */
  public AiProfilesTestConnection200Response aiProfilesTestConnection(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiProfilesTestConnection(body, Collections.emptyMap());
  }


  /**
   * Test a profile's provider
   * Probes a stored profile's credentials against its provider and reports the outcome in the answer, writing nothing - this is what a Test button calls so that a failure does not commit anything. `profileId` is required and may be sent in the body or as a query parameter. The result is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload. To validate credentials that are not stored yet, use `POST api/2.0/ai/profiles/list-provider-models`.
   *
   * REST API Reference for aiProfilesTestConnection Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
   *
   * @param body The ID of the profile to probe, as a bare JSON string. (required)
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
   * Update a provider profile
   * Replaces a stored AI provider profile and returns it, re-checking name uniqueness and probing the credentials against the live provider again. The same two inputs are refused as on create - a private-network `baseUrl` and `providerType: external` - and the whole profile is overwritten by the one supplied rather than merged. On a portal running the AI gateway this answers 403, because profiles are managed centrally there. A profile that is bound to an action or an agent keeps those bindings.
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
   * Update a provider profile
   * Replaces a stored AI provider profile and returns it, re-checking name uniqueness and probing the credentials against the live provider again. The same two inputs are refused as on create - a private-network `baseUrl` and `providerType: external` - and the whole profile is overwritten by the one supplied rather than merged. On a portal running the AI gateway this answers 403, because profiles are managed centrally there. A profile that is bound to an action or an agent keeps those bindings.
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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

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
