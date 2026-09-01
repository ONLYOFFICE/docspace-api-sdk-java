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
   * Assign
   * 
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
   * Assign
   * 
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiAssignmentsBulkAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
   *
   * @param requestBody  (required)
   * @return AiBulkAssignmentResult
   * @throws ApiException if fails to make API call
   */
  public AiBulkAssignmentResult aiAssignmentsBulkAssign(@javax.annotation.Nonnull Map<String, String> requestBody) throws ApiException {
    return this.aiAssignmentsBulkAssign(requestBody, Collections.emptyMap());
  }


  /**
   * Bulk assign
   * 
   *
   * REST API Reference for aiAssignmentsBulkAssign Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
   *
   * @param requestBody  (required)
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
   *
   * @param body  (required)
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsCascadeProfileDelete(@javax.annotation.Nonnull String body) throws ApiException {
    return this.aiAssignmentsCascadeProfileDelete(body, Collections.emptyMap());
  }


  /**
   * Cascade profile delete
   * 
   *
   * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
   *
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiSuccessResponse
   * @throws ApiException if fails to make API call
   */
  public AiSuccessResponse aiAssignmentsCascadeProfileDelete(@javax.annotation.Nonnull String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aiAssignmentsCascadeProfileDelete");
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
   * Get all assignments
   * 
   *
   * REST API Reference for aiAssignmentsGetAllAssignments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/
   *
   * @param entityId  (required)
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, String> aiAssignmentsGetAllAssignments(@javax.annotation.Nonnull String entityId) throws ApiException {
    return this.aiAssignmentsGetAllAssignments(entityId, Collections.emptyMap());
  }


  /**
   * Get all assignments
   * 
   *
   * REST API Reference for aiAssignmentsGetAllAssignments Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/
   *
   * @param entityId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, String> aiAssignmentsGetAllAssignments(@javax.annotation.Nonnull String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling aiAssignmentsGetAllAssignments");
    }
    
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiAssignmentsGetAssignment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/
   *
   * @param actionType  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String aiAssignmentsGetAssignment(@javax.annotation.Nonnull String actionType) throws ApiException {
    return this.aiAssignmentsGetAssignment(actionType, Collections.emptyMap());
  }


  /**
   * Get assignment
   * 
   *
   * REST API Reference for aiAssignmentsGetAssignment Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/
   *
   * @param actionType  (required)
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiAssignmentsResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/
   *
   * @param actionType  (required)
   * @param entityId  (required)
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nonnull String entityId) throws ApiException {
    return this.aiAssignmentsResolveForAction(actionType, entityId, Collections.emptyMap());
  }


  /**
   * Resolve for action
   * 
   *
   * REST API Reference for aiAssignmentsResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/
   *
   * @param actionType  (required)
   * @param entityId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nonnull String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'actionType' is set
    if (actionType == null) {
      throw new ApiException(400, "Missing the required parameter 'actionType' when calling aiAssignmentsResolveForAction");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling aiAssignmentsResolveForAction");
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

    String[] localVarAuthNames = new String[] {  };

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
   * 
   *
   * REST API Reference for aiAssignmentsTryResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/
   *
   * @param actionType  (required)
   * @param entityId  (required)
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsTryResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nonnull String entityId) throws ApiException {
    return this.aiAssignmentsTryResolveForAction(actionType, entityId, Collections.emptyMap());
  }


  /**
   * Try resolve for action
   * 
   *
   * REST API Reference for aiAssignmentsTryResolveForAction Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/
   *
   * @param actionType  (required)
   * @param entityId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AiResolvedAssignment
   * @throws ApiException if fails to make API call
   */
  public AiResolvedAssignment aiAssignmentsTryResolveForAction(@javax.annotation.Nonnull String actionType, @javax.annotation.Nonnull String entityId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'actionType' is set
    if (actionType == null) {
      throw new ApiException(400, "Missing the required parameter 'actionType' when calling aiAssignmentsTryResolveForAction");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling aiAssignmentsTryResolveForAction");
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

    String[] localVarAuthNames = new String[] {  };

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
   * Unassign
   * 
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
   * Unassign
   * 
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
