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

import org.openapitools.client.model.AiActionType;
import org.openapitools.client.model.AiAssignmentMutationResult;
import org.openapitools.client.model.AiAssignmentsAssignRequest;
import org.openapitools.client.model.AiAssignmentsCascadeProfileDeleteRequest;
import org.openapitools.client.model.AiBulkAssignmentResult;
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiResolvedAssignment;
import org.openapitools.client.model.AiSuccessResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class AssignmentsApi extends BaseApi {

  public AssignmentsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AssignmentsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Bind a profile to an action
   * Binds a profile to one AI action portal-wide, creating the assignment or replacing it in place, and returns the result. Both `actionType` and `profileId` are required. The profile's declared capabilities are checked against the action, so a model that cannot generate images cannot be bound to `ImageGeneration` - the `Default` slot is exempt, because it stands in for every action. There is no room-scoped form of this write: a room's own binding is created by the agent that owns it, while reads accept an `entityId`.
   *
   * REST API Reference for aiAssignmentsAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/
   *
   * @param aiAssignmentsAssignRequest  (required)
   * @return AiAssignmentMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiAssignmentMutationResult aiAssignmentsAssign(@javax.annotation.Nonnull AiAssignmentsAssignRequest aiAssignmentsAssignRequest) throws ApiException {
    return this.aiAssignmentsAssign(aiAssignmentsAssignRequest, Collections.emptyMap());
  }


  /**
   * Bind a profile to an action
   * Binds a profile to one AI action portal-wide, creating the assignment or replacing it in place, and returns the result. Both `actionType` and `profileId` are required. The profile's declared capabilities are checked against the action, so a model that cannot generate images cannot be bound to `ImageGeneration` - the `Default` slot is exempt, because it stands in for every action. There is no room-scoped form of this write: a room's own binding is created by the agent that owns it, while reads accept an `entityId`.
   *
   * REST API Reference for aiAssignmentsAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/
   *
   * @param aiAssignmentsAssignRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiAssignmentMutationResult
   * @throws ApiException if fails to make API call
   */
  public AiAssignmentMutationResult aiAssignmentsAssign(@javax.annotation.Nonnull AiAssignmentsAssignRequest aiAssignmentsAssignRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAssignmentsAssignRequest;
    
    // verify the required parameter 'aiAssignmentsAssignRequest' is set
    if (aiAssignmentsAssignRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAssignmentsAssignRequest' when calling aiAssignmentsAssign");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/assign";

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

    TypeReference<AiAssignmentMutationResult> localVarReturnType = new TypeReference<AiAssignmentMutationResult>() {};
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
   * Bulk assign
   * Applies many action-to-profile bindings in one write, which is how a settings screen saves the whole set. The body is a plain map of action type to profile ID, and every entry is validated before anything is written: one unknown action or one non-string profile ID rejects the request whole, so the set is never left half-applied. Each entry behaves as the single assign operation does, capability checks included. The answer carries the resulting assignment set.
   *
   * REST API Reference for aiAssignmentsBulkAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
   *
   * @param requestBody A map of action type to profile ID. Every key has to be a known action type and every value a profile ID; one bad entry rejects the whole map. (required)
   * @return AiBulkAssignmentResult
   * @throws ApiException if fails to make API call
   */
  public AiBulkAssignmentResult aiAssignmentsBulkAssign(@javax.annotation.Nonnull Map<String, String> requestBody) throws ApiException {
    return this.aiAssignmentsBulkAssign(requestBody, Collections.emptyMap());
  }


  /**
   * Bulk assign
   * Applies many action-to-profile bindings in one write, which is how a settings screen saves the whole set. The body is a plain map of action type to profile ID, and every entry is validated before anything is written: one unknown action or one non-string profile ID rejects the request whole, so the set is never left half-applied. Each entry behaves as the single assign operation does, capability checks included. The answer carries the resulting assignment set.
   *
   * REST API Reference for aiAssignmentsBulkAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
   *
   * @param requestBody A map of action type to profile ID. Every key has to be a known action type and every value a profile ID; one bad entry rejects the whole map. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiBulkAssignmentResult
   * @throws ApiException if fails to make API call
   */
  public AiBulkAssignmentResult aiAssignmentsBulkAssign(@javax.annotation.Nonnull Map<String, String> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling aiAssignmentsBulkAssign");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/bulk-assign";

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

    TypeReference<AiBulkAssignmentResult> localVarReturnType = new TypeReference<AiBulkAssignmentResult>() {};
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
   * Cascade profile delete
   * Detaches a profile from every assignment that points at it, which is the cleanup step before the profile itself is removed. The `Default` slot is promoted to the first remaining profile, or dropped when none is left, and every other slot holding the profile is cleared. `profileId` is required and may be sent in the body or as a query parameter. `DELETE api/2.0/ai/profiles/delete` already does this, so call it directly only when the profile is being removed by some other means.
   *
   * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
   *
   * @param aiAssignmentsCascadeProfileDeleteRequest The profile to detach from every assignment. May be sent as the `profileId` query parameter instead of in the body. (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsCascadeProfileDelete(@javax.annotation.Nonnull AiAssignmentsCascadeProfileDeleteRequest aiAssignmentsCascadeProfileDeleteRequest) throws ApiException {
    return this.aiAssignmentsCascadeProfileDelete(aiAssignmentsCascadeProfileDeleteRequest, Collections.emptyMap());
  }


  /**
   * Cascade profile delete
   * Detaches a profile from every assignment that points at it, which is the cleanup step before the profile itself is removed. The `Default` slot is promoted to the first remaining profile, or dropped when none is left, and every other slot holding the profile is cleared. `profileId` is required and may be sent in the body or as a query parameter. `DELETE api/2.0/ai/profiles/delete` already does this, so call it directly only when the profile is being removed by some other means.
   *
   * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
   *
   * @param aiAssignmentsCascadeProfileDeleteRequest The profile to detach from every assignment. May be sent as the `profileId` query parameter instead of in the body. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsCascadeProfileDelete(@javax.annotation.Nonnull AiAssignmentsCascadeProfileDeleteRequest aiAssignmentsCascadeProfileDeleteRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = aiAssignmentsCascadeProfileDeleteRequest;
    
    // verify the required parameter 'aiAssignmentsCascadeProfileDeleteRequest' is set
    if (aiAssignmentsCascadeProfileDeleteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aiAssignmentsCascadeProfileDeleteRequest' when calling aiAssignmentsCascadeProfileDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/cascade-profile-delete";

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
   * Get all assignments
   * Returns every action-to-profile binding of a scope as one map, which is what a settings screen loads. `entityId` narrows it to a room and has to name one the caller can open; a room that is not an agent room degrades to the portal-wide set rather than answering empty, and omitting the parameter reads the portal-wide set directly. Actions with no binding are simply absent from the map. The `Default` slot is reported as an entry of its own rather than being folded into the others.
   *
   * REST API Reference for aiAssignmentsGetAllAssignments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, String> aiAssignmentsGetAllAssignments(@javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiAssignmentsGetAllAssignments(entityId, Collections.emptyMap());
  }


  /**
   * Get all assignments
   * Returns every action-to-profile binding of a scope as one map, which is what a settings screen loads. `entityId` narrows it to a room and has to name one the caller can open; a room that is not an agent room degrades to the portal-wide set rather than answering empty, and omitting the parameter reads the portal-wide set directly. Actions with no binding are simply absent from the map. The `Default` slot is reported as an entry of its own rather than being folded into the others.
   *
   * REST API Reference for aiAssignmentsGetAllAssignments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/
   *
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, String> aiAssignmentsGetAllAssignments(@javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/get-all-assignments";

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

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<Map<String, String>> localVarReturnType = new TypeReference<Map<String, String>>() {};
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
   * Get assignment
   * Returns the profile bound to one AI action, without applying the `Default` fallback - an empty answer means this action has no profile of its own, not that nothing is configured. `actionType` is required and is read from the query. Use `GET api/2.0/ai/assignments/resolve-for-action` to learn which profile would actually serve the action. This reads the portal-wide binding and accepts no `entityId`.
   *
   * REST API Reference for aiAssignmentsGetAssignment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String aiAssignmentsGetAssignment(@javax.annotation.Nonnull String actionType) throws ApiException {
    return this.aiAssignmentsGetAssignment(actionType, Collections.emptyMap());
  }


  /**
   * Get assignment
   * Returns the profile bound to one AI action, without applying the `Default` fallback - an empty answer means this action has no profile of its own, not that nothing is configured. `actionType` is required and is read from the query. Use `GET api/2.0/ai/assignments/resolve-for-action` to learn which profile would actually serve the action. This reads the portal-wide binding and accepts no `entityId`.
   *
   * REST API Reference for aiAssignmentsGetAssignment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String aiAssignmentsGetAssignment(@javax.annotation.Nonnull String actionType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'actionType' is set
    if (actionType == null) {
      throw new ApiException(400, "Missing the required parameter 'actionType' when calling aiAssignmentsGetAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/get-assignment";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("actionType", actionType));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
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
   * Resolve for action
   * Returns the profile that will serve one AI action, falling back to the `Default` slot when the action has no profile of its own. `actionType` is required and has to be one of the known actions - an unknown or misspelled value is rejected rather than resolved to the default. `entityId` narrows the lookup to a room, and a room with no assignment of its own degrades to the portal-wide one. This fails when neither slot is set or the bound profile is gone, so use `GET api/2.0/ai/assignments/try-resolve-for-action` when an unconfigured portal should answer empty instead.
   *
   * REST API Reference for aiAssignmentsResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiAssignmentsResolveForAction(actionType, entityId, Collections.emptyMap());
  }


  /**
   * Resolve for action
   * Returns the profile that will serve one AI action, falling back to the `Default` slot when the action has no profile of its own. `actionType` is required and has to be one of the known actions - an unknown or misspelled value is rejected rather than resolved to the default. `entityId` narrows the lookup to a room, and a room with no assignment of its own degrades to the portal-wide one. This fails when neither slot is set or the bound profile is gone, so use `GET api/2.0/ai/assignments/try-resolve-for-action` when an unconfigured portal should answer empty instead.
   *
   * REST API Reference for aiAssignmentsResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'actionType' is set
    if (actionType == null) {
      throw new ApiException(400, "Missing the required parameter 'actionType' when calling aiAssignmentsResolveForAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/resolve-for-action";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("actionType", actionType));
    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiResolvedAssignment> localVarReturnType = new TypeReference<AiResolvedAssignment>() {};
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
   * Try resolve for action
   * Returns the profile that will serve one AI action, exactly as `GET api/2.0/ai/assignments/resolve-for-action` does, but answers with an empty result rather than failing when nothing is configured. `actionType` is required and is validated the same way, and `entityId` narrows the lookup to a room. This is the operation to call when the absence of a profile is a normal state to render - a settings screen, or a feature that hides itself. Both operations are read-only.
   *
   * REST API Reference for aiAssignmentsTryResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsTryResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nullable String entityId) throws ApiException {
    return this.aiAssignmentsTryResolveForAction(actionType, entityId, Collections.emptyMap());
  }


  /**
   * Try resolve for action
   * Returns the profile that will serve one AI action, exactly as `GET api/2.0/ai/assignments/resolve-for-action` does, but answers with an empty result rather than failing when nothing is configured. `actionType` is required and is validated the same way, and `entityId` narrows the lookup to a room. This is the operation to call when the absence of a profile is a normal state to render - a settings screen, or a feature that hides itself. Both operations are read-only.
   *
   * REST API Reference for aiAssignmentsTryResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/
   *
   * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. (required)
   * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsTryResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nullable String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'actionType' is set
    if (actionType == null) {
      throw new ApiException(400, "Missing the required parameter 'actionType' when calling aiAssignmentsTryResolveForAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/try-resolve-for-action";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("actionType", actionType));
    localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "cookieAuth", "bearerAuth" };

    TypeReference<AiResolvedAssignment> localVarReturnType = new TypeReference<AiResolvedAssignment>() {};
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
   * Clear an action's profile
   * Clears the portal-wide binding of one AI action, after which the action falls back to the `Default` slot. `actionType` is required and may be sent in the body or as a query parameter. An action whose slot is already empty is not reported as an error - the call answers success either way, so it is safe to repeat. Clearing `Default` itself leaves the actions that relied on it unresolvable.
   *
   * REST API Reference for aiAssignmentsUnassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsUnassign(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAssignmentsUnassign(body, Collections.emptyMap());
  }


  /**
   * Clear an action's profile
   * Clears the portal-wide binding of one AI action, after which the action falls back to the `Default` slot. `actionType` is required and may be sent in the body or as a query parameter. An action whose slot is already empty is not reported as an error - the call answers success either way, so it is safe to repeat. Clearing `Default` itself leaves the actions that relied on it unresolvable.
   *
   * REST API Reference for aiAssignmentsUnassign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsUnassign(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiAssignmentsUnassign");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/ai/assignments/unassign";

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
