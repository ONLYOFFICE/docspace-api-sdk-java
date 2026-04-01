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

package org.openapitools.client.api.People;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import java.io.File;
import org.openapitools.client.model.FileUploadResultWrapper;
import org.openapitools.client.model.ThumbnailsDataWrapper;
import org.openapitools.client.model.ThumbnailsRequest;
import org.openapitools.client.model.UpdatePhotoMemberRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PhotosApi extends BaseApi {

  public PhotosApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PhotosApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Create photo thumbnails
   * Creates the user photo thumbnails by coordinates of the original image specified in the request.
   *
   * REST API Reference for createMemberPhotoThumbnails Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-member-photo-thumbnails/
   *
   * @param userid The user ID. (required)
   * @param thumbnailsRequest The thumbnail request. (required)
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper createMemberPhotoThumbnails(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull ThumbnailsRequest thumbnailsRequest) throws ApiException {
    return this.createMemberPhotoThumbnails(userid, thumbnailsRequest, Collections.emptyMap());
  }


  /**
   * Create photo thumbnails
   * Creates the user photo thumbnails by coordinates of the original image specified in the request.
   *
   * REST API Reference for createMemberPhotoThumbnails Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-member-photo-thumbnails/
   *
   * @param userid The user ID. (required)
   * @param thumbnailsRequest The thumbnail request. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper createMemberPhotoThumbnails(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull ThumbnailsRequest thumbnailsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = thumbnailsRequest;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling createMemberPhotoThumbnails");
    }
    
    // verify the required parameter 'thumbnailsRequest' is set
    if (thumbnailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thumbnailsRequest' when calling createMemberPhotoThumbnails");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/photo/thumbnails"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<ThumbnailsDataWrapper> localVarReturnType = new TypeReference<ThumbnailsDataWrapper>() {};
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
   * Delete a user photo
   * Deletes a photo of the user with the ID specified in the request.
   *
   * REST API Reference for deleteMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member-photo/
   *
   * @param userid The user ID. (required)
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper deleteMemberPhoto(@javax.annotation.Nonnull String userid) throws ApiException {
    return this.deleteMemberPhoto(userid, Collections.emptyMap());
  }


  /**
   * Delete a user photo
   * Deletes a photo of the user with the ID specified in the request.
   *
   * REST API Reference for deleteMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member-photo/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper deleteMemberPhoto(@javax.annotation.Nonnull String userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling deleteMemberPhoto");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/photo"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<ThumbnailsDataWrapper> localVarReturnType = new TypeReference<ThumbnailsDataWrapper>() {};
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
   * Get a user photo
   * Returns a photo of the user with the ID specified in the request.
   *
   * REST API Reference for getMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-member-photo/
   *
   * @param userid The user ID. (required)
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper getMemberPhoto(@javax.annotation.Nonnull String userid) throws ApiException {
    return this.getMemberPhoto(userid, Collections.emptyMap());
  }


  /**
   * Get a user photo
   * Returns a photo of the user with the ID specified in the request.
   *
   * REST API Reference for getMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-member-photo/
   *
   * @param userid The user ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper getMemberPhoto(@javax.annotation.Nonnull String userid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling getMemberPhoto");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/photo"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<ThumbnailsDataWrapper> localVarReturnType = new TypeReference<ThumbnailsDataWrapper>() {};
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
   * Update a user photo
   * Updates a photo of the user with the ID specified in the request.
   *
   * REST API Reference for updateMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-photo/
   *
   * @param userid The user ID. (required)
   * @param updatePhotoMemberRequest The request parameters for updating a photo. (required)
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper updateMemberPhoto(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull UpdatePhotoMemberRequest updatePhotoMemberRequest) throws ApiException {
    return this.updateMemberPhoto(userid, updatePhotoMemberRequest, Collections.emptyMap());
  }


  /**
   * Update a user photo
   * Updates a photo of the user with the ID specified in the request.
   *
   * REST API Reference for updateMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-photo/
   *
   * @param userid The user ID. (required)
   * @param updatePhotoMemberRequest The request parameters for updating a photo. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ThumbnailsDataWrapper
   * @throws ApiException if fails to make API call
   */
  public ThumbnailsDataWrapper updateMemberPhoto(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull UpdatePhotoMemberRequest updatePhotoMemberRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updatePhotoMemberRequest;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling updateMemberPhoto");
    }
    
    // verify the required parameter 'updatePhotoMemberRequest' is set
    if (updatePhotoMemberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhotoMemberRequest' when calling updateMemberPhoto");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/photo"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

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

    TypeReference<ThumbnailsDataWrapper> localVarReturnType = new TypeReference<ThumbnailsDataWrapper>() {};
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
   * Upload a user photo
   * Uploads a photo of the user with the ID specified in the request.
   *
   * REST API Reference for uploadMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-member-photo/
   *
   * @param userid The user ID. (required)
   * @param _file The image data. (required)
   * @param autosave Specifies whether to autosave a photo or not. (optional)
   * @return FileUploadResultWrapper
   * @throws ApiException if fails to make API call
   */
  public FileUploadResultWrapper uploadMemberPhoto(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull File _file, @javax.annotation.Nullable Boolean autosave) throws ApiException {
    return this.uploadMemberPhoto(userid, _file, autosave, Collections.emptyMap());
  }


  /**
   * Upload a user photo
   * Uploads a photo of the user with the ID specified in the request.
   *
   * REST API Reference for uploadMemberPhoto Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-member-photo/
   *
   * @param userid The user ID. (required)
   * @param _file The image data. (required)
   * @param autosave Specifies whether to autosave a photo or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileUploadResultWrapper
   * @throws ApiException if fails to make API call
   */
  public FileUploadResultWrapper uploadMemberPhoto(@javax.annotation.Nonnull String userid, @javax.annotation.Nonnull File _file, @javax.annotation.Nullable Boolean autosave, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling uploadMemberPhoto");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadMemberPhoto");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/people/{userid}/photo"
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(apiClient.parameterToString(userid)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (_file != null)
      localVarFormParams.put("File", _file);
if (autosave != null)
      localVarFormParams.put("Autosave", autosave);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<FileUploadResultWrapper> localVarReturnType = new TypeReference<FileUploadResultWrapper>() {};
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
      "multipart/form-data"
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
