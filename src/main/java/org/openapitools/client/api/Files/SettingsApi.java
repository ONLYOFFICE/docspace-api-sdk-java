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

import org.openapitools.client.model.AutoCleanUpDataWrapper;
import org.openapitools.client.model.AutoCleanupRequestDto;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.CheckDocServiceUrlRequestDto;
import org.openapitools.client.model.DisplayRequestDto;
import org.openapitools.client.model.DocServiceUrlWrapper;
import org.openapitools.client.model.FileShareArrayWrapper;
import org.openapitools.client.model.FilesSettingsWrapper;
import org.openapitools.client.model.HideConfirmConvertRequestDto;
import org.openapitools.client.model.ICompressWrapper;
import org.openapitools.client.model.ModuleWrapper;
import org.openapitools.client.model.SettingsRequestDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SettingsApi extends BaseApi {

  public SettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeAccessToThirdparty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper changeAccessToThirdparty(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.changeAccessToThirdparty(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeAccessToThirdparty Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper changeAccessToThirdparty(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/thirdparty";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for changeAutomaticallyCleanUp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/
   *
   * @param autoCleanupRequestDto  (optional)
   * @return AutoCleanUpDataWrapper
   * @throws ApiException if fails to make API call
   */
  public AutoCleanUpDataWrapper changeAutomaticallyCleanUp(@javax.annotation.Nullable AutoCleanupRequestDto autoCleanupRequestDto) throws ApiException {
    return this.changeAutomaticallyCleanUp(autoCleanupRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeAutomaticallyCleanUp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/
   *
   * @param autoCleanupRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return AutoCleanUpDataWrapper
   * @throws ApiException if fails to make API call
   */
  public AutoCleanUpDataWrapper changeAutomaticallyCleanUp(@javax.annotation.Nullable AutoCleanupRequestDto autoCleanupRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = autoCleanupRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/autocleanup";

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

    TypeReference<AutoCleanUpDataWrapper> localVarReturnType = new TypeReference<AutoCleanUpDataWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for changeDefaultAccessRights Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/
   *
   * @param requestBody Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). (optional)
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper changeDefaultAccessRights(@javax.annotation.Nullable List<Integer> requestBody) throws ApiException {
    return this.changeDefaultAccessRights(requestBody, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeDefaultAccessRights Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/
   *
   * @param requestBody Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FileShareArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public FileShareArrayWrapper changeDefaultAccessRights(@javax.annotation.Nullable List<Integer> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/dafaultaccessrights";

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

    TypeReference<FileShareArrayWrapper> localVarReturnType = new TypeReference<FileShareArrayWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for changeDeleteConfirm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper changeDeleteConfirm(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.changeDeleteConfirm(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeDeleteConfirm Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper changeDeleteConfirm(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/changedeleteconfrim";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for changeDownloadZipFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip-from-body/
   *
   * @param displayRequestDto  (optional)
   * @return ICompressWrapper
   * @throws ApiException if fails to make API call
   */
  public ICompressWrapper changeDownloadZipFromBody(@javax.annotation.Nullable DisplayRequestDto displayRequestDto) throws ApiException {
    return this.changeDownloadZipFromBody(displayRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for changeDownloadZipFromBody Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip-from-body/
   *
   * @param displayRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ICompressWrapper
   * @throws ApiException if fails to make API call
   */
  public ICompressWrapper changeDownloadZipFromBody(@javax.annotation.Nullable DisplayRequestDto displayRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = displayRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/downloadtargz";

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

    TypeReference<ICompressWrapper> localVarReturnType = new TypeReference<ICompressWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for checkDocServiceUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/
   *
   * @param checkDocServiceUrlRequestDto  (optional)
   * @return DocServiceUrlWrapper
   * @throws ApiException if fails to make API call
   */
  public DocServiceUrlWrapper checkDocServiceUrl(@javax.annotation.Nullable CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto) throws ApiException {
    return this.checkDocServiceUrl(checkDocServiceUrlRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for checkDocServiceUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/
   *
   * @param checkDocServiceUrlRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocServiceUrlWrapper
   * @throws ApiException if fails to make API call
   */
  public DocServiceUrlWrapper checkDocServiceUrl(@javax.annotation.Nullable CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = checkDocServiceUrlRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/docservice";

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

    TypeReference<DocServiceUrlWrapper> localVarReturnType = new TypeReference<DocServiceUrlWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for displayFileExtension Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper displayFileExtension(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.displayFileExtension(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for displayFileExtension Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper displayFileExtension(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/displayfileextension";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for displayRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/
   *
   * @param displayRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper displayRecent(@javax.annotation.Nullable DisplayRequestDto displayRequestDto) throws ApiException {
    return this.displayRecent(displayRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for displayRecent Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/
   *
   * @param displayRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper displayRecent(@javax.annotation.Nullable DisplayRequestDto displayRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = displayRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/displayrecent";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for externalShare Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/
   *
   * @param displayRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper externalShare(@javax.annotation.Nullable DisplayRequestDto displayRequestDto) throws ApiException {
    return this.externalShare(displayRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for externalShare Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/
   *
   * @param displayRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper externalShare(@javax.annotation.Nullable DisplayRequestDto displayRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = displayRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/external";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for externalShareSocialMedia Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/
   *
   * @param displayRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper externalShareSocialMedia(@javax.annotation.Nullable DisplayRequestDto displayRequestDto) throws ApiException {
    return this.externalShareSocialMedia(displayRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for externalShareSocialMedia Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/
   *
   * @param displayRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper externalShareSocialMedia(@javax.annotation.Nullable DisplayRequestDto displayRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = displayRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/externalsocialmedia";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for forcesave Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper forcesave() throws ApiException {
    return this.forcesave(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for forcesave Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper forcesave(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/forcesave";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getAutomaticallyCleanUp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/
   *
   * @return AutoCleanUpDataWrapper
   * @throws ApiException if fails to make API call
   */
  public AutoCleanUpDataWrapper getAutomaticallyCleanUp() throws ApiException {
    return this.getAutomaticallyCleanUp(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getAutomaticallyCleanUp Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return AutoCleanUpDataWrapper
   * @throws ApiException if fails to make API call
   */
  public AutoCleanUpDataWrapper getAutomaticallyCleanUp(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/autocleanup";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AutoCleanUpDataWrapper> localVarReturnType = new TypeReference<AutoCleanUpDataWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getDocServiceUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/
   *
   * @param version Specifies whether to return the editor version or not. (optional)
   * @return DocServiceUrlWrapper
   * @throws ApiException if fails to make API call
   */
  public DocServiceUrlWrapper getDocServiceUrl(@javax.annotation.Nullable Boolean version) throws ApiException {
    return this.getDocServiceUrl(version, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getDocServiceUrl Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/
   *
   * @param version Specifies whether to return the editor version or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return DocServiceUrlWrapper
   * @throws ApiException if fails to make API call
   */
  public DocServiceUrlWrapper getDocServiceUrl(@javax.annotation.Nullable Boolean version, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/docservice";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<DocServiceUrlWrapper> localVarReturnType = new TypeReference<DocServiceUrlWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getFilesModule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/
   *
   * @return ModuleWrapper
   * @throws ApiException if fails to make API call
   */
  public ModuleWrapper getFilesModule() throws ApiException {
    return this.getFilesModule(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFilesModule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return ModuleWrapper
   * @throws ApiException if fails to make API call
   */
  public ModuleWrapper getFilesModule(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/info";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<ModuleWrapper> localVarReturnType = new TypeReference<ModuleWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for getFilesSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/
   *
   * @return FilesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public FilesSettingsWrapper getFilesSettings() throws ApiException {
    return this.getFilesSettings(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for getFilesSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return FilesSettingsWrapper
   * @throws ApiException if fails to make API call
   */
  public FilesSettingsWrapper getFilesSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<FilesSettingsWrapper> localVarReturnType = new TypeReference<FilesSettingsWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for hideConfirmCancelOperation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper hideConfirmCancelOperation(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.hideConfirmCancelOperation(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for hideConfirmCancelOperation Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper hideConfirmCancelOperation(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/hideconfirmcanceloperation";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for hideConfirmConvert Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/
   *
   * @param hideConfirmConvertRequestDto  (optional)
   * @return ModuleWrapper
   * @throws ApiException if fails to make API call
   */
  public ModuleWrapper hideConfirmConvert(@javax.annotation.Nullable HideConfirmConvertRequestDto hideConfirmConvertRequestDto) throws ApiException {
    return this.hideConfirmConvert(hideConfirmConvertRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for hideConfirmConvert Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/
   *
   * @param hideConfirmConvertRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ModuleWrapper
   * @throws ApiException if fails to make API call
   */
  public ModuleWrapper hideConfirmConvert(@javax.annotation.Nullable HideConfirmConvertRequestDto hideConfirmConvertRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = hideConfirmConvertRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/hideconfirmconvert";

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

    TypeReference<ModuleWrapper> localVarReturnType = new TypeReference<ModuleWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for hideConfirmRoomLifetime Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper hideConfirmRoomLifetime(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.hideConfirmRoomLifetime(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for hideConfirmRoomLifetime Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper hideConfirmRoomLifetime(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/hideconfirmroomlifetime";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for isAvailablePrivacyRoomSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-available-privacy-room-settings/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper isAvailablePrivacyRoomSettings() throws ApiException {
    return this.isAvailablePrivacyRoomSettings(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for isAvailablePrivacyRoomSettings Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-available-privacy-room-settings/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper isAvailablePrivacyRoomSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/@privacy/available";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for keepNewFileName Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper keepNewFileName(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.keepNewFileName(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for keepNewFileName Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper keepNewFileName(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/keepnewfilename";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for setOpenEditorInSameTab Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper setOpenEditorInSameTab(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.setOpenEditorInSameTab(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for setOpenEditorInSameTab Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper setOpenEditorInSameTab(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/settings/openeditorinsametab";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for storeForcesave Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper storeForcesave() throws ApiException {
    return this.storeForcesave(Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for storeForcesave Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper storeForcesave(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/storeforcesave";

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for storeOriginal Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper storeOriginal(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.storeOriginal(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for storeOriginal Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper storeOriginal(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/storeoriginal";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * 
   * 
   *
   * REST API Reference for updateFileIfExist Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/
   *
   * @param settingsRequestDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateFileIfExist(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto) throws ApiException {
    return this.updateFileIfExist(settingsRequestDto, Collections.emptyMap());
  }


  /**
   * 
   * 
   *
   * REST API Reference for updateFileIfExist Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/
   *
   * @param settingsRequestDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper updateFileIfExist(@javax.annotation.Nullable SettingsRequestDto settingsRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsRequestDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/files/updateifexist";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
