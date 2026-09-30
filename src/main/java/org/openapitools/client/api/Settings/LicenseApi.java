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

import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.ErrorApiResponse;
import java.io.File;
import org.openapitools.client.model.StringWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class LicenseApi extends BaseApi {

  public LicenseApi() {
    super(Configuration.getDefaultApiClient());
  }

  public LicenseApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Activate a license
   * Activates the license staged by `POST api/2.0/settings/license` on this self-hosted Enterprise installation:  it records that the license was accepted, promotes the staged file to the active one and rewrites the  portal-wide quota and tariff from it. Upload a file first: with nothing staged and no license on disk there is  nothing to activate. The caller only has to be signed in, and the activation is recorded in the audit trail.  Repeating the call is safe: the acceptance stamp is written only once and the same license is simply applied  again. Read the outcome from the body rather than the status code - an empty string means the license is now  active, and any other string is a message explaining why it is not: no license key was found, the key is not  correct, the installed edition does not match the license type, or the license is expired or too small for the  current user count. The acceptance stamp survives a failed activation, so a corrected file needs nothing  extra. An installation with no license path configured answers that its pricing plan does not support the  option and changes nothing. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for acceptLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/accept-license/
   *
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper acceptLicense() throws ApiException {
    return this.acceptLicense(Collections.emptyMap());
  }


  /**
   * Activate a license
   * Activates the license staged by `POST api/2.0/settings/license` on this self-hosted Enterprise installation:  it records that the license was accepted, promotes the staged file to the active one and rewrites the  portal-wide quota and tariff from it. Upload a file first: with nothing staged and no license on disk there is  nothing to activate. The caller only has to be signed in, and the activation is recorded in the audit trail.  Repeating the call is safe: the acceptance stamp is written only once and the same license is simply applied  again. Read the outcome from the body rather than the status code - an empty string means the license is now  active, and any other string is a message explaining why it is not: no license key was found, the key is not  correct, the installed edition does not match the license type, or the license is expired or too small for the  current user count. The acceptance stamp survives a failed activation, so a corrected file needs nothing  extra. An installation with no license path configured answers that its pricing plan does not support the  option and changes nothing. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for acceptLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/accept-license/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper acceptLicense(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/license/accept";

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

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
   * Check if a license is required
   * Reports whether this installation still has to be given a license file before it can be used, which is the  question the setup wizard asks before offering its license upload step. No authentication is needed, so it can  be called on a portal nobody has signed in to yet, and the call is read-only. The answer is `true` only for a  self-hosted Enterprise build whose license file is not on disk yet; an open-source or SaaS portal, a portal  configured to let anyone in without an account, an installation whose configuration hides the pricing section,  and one that takes its setup from cloud-image metadata all answer `false`. A `false` answer therefore does not  mean the portal is licensed - it also covers every build that needs no license at all. Nothing here describes  a license already in place, neither its due date nor whether the editing service still accepts it, and the  answer turns to `false` only once a staged file has been activated by `POST api/2.0/settings/license/accept`,  not when it is uploaded. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for getIsLicenseRequired Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-license-required/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getIsLicenseRequired() throws ApiException {
    return this.getIsLicenseRequired(Collections.emptyMap());
  }


  /**
   * Check if a license is required
   * Reports whether this installation still has to be given a license file before it can be used, which is the  question the setup wizard asks before offering its license upload step. No authentication is needed, so it can  be called on a portal nobody has signed in to yet, and the call is read-only. The answer is `true` only for a  self-hosted Enterprise build whose license file is not on disk yet; an open-source or SaaS portal, a portal  configured to let anyone in without an account, an installation whose configuration hides the pricing section,  and one that takes its setup from cloud-image metadata all answer `false`. A `false` answer therefore does not  mean the portal is licensed - it also covers every build that needs no license at all. Nothing here describes  a license already in place, neither its due date nor whether the editing service still accepts it, and the  answer turns to `false` only once a staged file has been activated by `POST api/2.0/settings/license/accept`,  not when it is uploaded. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for getIsLicenseRequired Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-license-required/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper getIsLicenseRequired(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/license/required";

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
   * Refresh the license
   * Re-reads the license file of this self-hosted Enterprise installation and rewrites the portal-wide quota and  tariff from it, so a file replaced on disk or a renewal issued by the vendor takes effect without a restart. A  license staged by `POST api/2.0/settings/license` is promoted to the active one here as well, but the usual  first-time order is upload and then `POST api/2.0/settings/license/accept`; this operation is for later  refreshes. The caller only has to be signed in - no administrator right is checked. Despite the `GET`, the  call rewrites stored data, and it is idempotent: repeating it applies the same license again. The editing  service is asked to confirm the license as part of the check, and the license it reports must match the file.  The answer is `true` when the license was applied and `false` on an installation with no license path  configured at all, such as a SaaS or open-source portal, where nothing is read and nothing changes. A missing  or unreadable file, a mismatched customer or edition, and an editing service that rejects the license all fail  the call instead of answering `false`. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for refreshLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/refresh-license/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper refreshLicense() throws ApiException {
    return this.refreshLicense(Collections.emptyMap());
  }


  /**
   * Refresh the license
   * Re-reads the license file of this self-hosted Enterprise installation and rewrites the portal-wide quota and  tariff from it, so a file replaced on disk or a renewal issued by the vendor takes effect without a restart. A  license staged by `POST api/2.0/settings/license` is promoted to the active one here as well, but the usual  first-time order is upload and then `POST api/2.0/settings/license/accept`; this operation is for later  refreshes. The caller only has to be signed in - no administrator right is checked. Despite the `GET`, the  call rewrites stored data, and it is idempotent: repeating it applies the same license again. The editing  service is asked to confirm the license as part of the check, and the license it reports must match the file.  The answer is `true` when the license was applied and `false` on an installation with no license path  configured at all, such as a SaaS or open-source portal, where nothing is read and nothing changes. A missing  or unreadable file, a mismatched customer or edition, and an editing service that rejects the license all fail  the call instead of answering `false`. The operation stays reachable while the portal is unpaid.
   *
   * REST API Reference for refreshLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/refresh-license/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper refreshLicense(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/license/refresh";

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
   * Upload a license
   * Takes the license file of this self-hosted Enterprise installation as `multipart/form-data` and stages it for  activation; only the first entry of `Files` is read and the rest are ignored. The file is validated but not  put in force here - follow with `POST api/2.0/settings/license/accept` to activate it, and until then the  portal keeps the license it already had. The caller must be a DocSpace administrator, or hold a wizard or  administrator confirmation link while the setup wizard is still unfinished; after the wizard is complete such  a link alone is refused. An earlier staged file is overwritten, so the upload can be repeated safely. The  answer is a localized sentence, not a structured result: `Uploaded successfully` on its own, or the same words  plus the date since when support and updates are not covered, because a file already past its due date is  still accepted. A request carrying no file, and a license whose start date has not arrived yet, are rejected  as invalid; a file that cannot be read as a license, carries no customer id or signature, or was issued for  the other edition fails the call. Whether the editing service accepts it is only checked at activation.
   *
   * REST API Reference for uploadLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-license/
   *
   * @param files The license file, sent as `multipart/form-data`. Only the first entry is read and the rest are ignored, and a  request carrying none is refused with 400. A file that cannot be read as a license, that carries no customer  id or signature, or that was issued for the other edition fails the call; one whose start date has not  arrived yet is refused, while one already past its due date is still accepted. Staging only stores the file -  `POST api/2.0/settings/license/accept` puts it in force - and a file staged earlier is overwritten. (required)
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper uploadLicense(@javax.annotation.Nonnull List<File> files) throws ApiException {
    return this.uploadLicense(files, Collections.emptyMap());
  }


  /**
   * Upload a license
   * Takes the license file of this self-hosted Enterprise installation as `multipart/form-data` and stages it for  activation; only the first entry of `Files` is read and the rest are ignored. The file is validated but not  put in force here - follow with `POST api/2.0/settings/license/accept` to activate it, and until then the  portal keeps the license it already had. The caller must be a DocSpace administrator, or hold a wizard or  administrator confirmation link while the setup wizard is still unfinished; after the wizard is complete such  a link alone is refused. An earlier staged file is overwritten, so the upload can be repeated safely. The  answer is a localized sentence, not a structured result: `Uploaded successfully` on its own, or the same words  plus the date since when support and updates are not covered, because a file already past its due date is  still accepted. A request carrying no file, and a license whose start date has not arrived yet, are rejected  as invalid; a file that cannot be read as a license, carries no customer id or signature, or was issued for  the other edition fails the call. Whether the editing service accepts it is only checked at activation.
   *
   * REST API Reference for uploadLicense Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-license/
   *
   * @param files The license file, sent as `multipart/form-data`. Only the first entry is read and the rest are ignored, and a  request carrying none is refused with 400. A file that cannot be read as a license, that carries no customer  id or signature, or that was issued for the other edition fails the call; one whose start date has not  arrived yet is refused, while one already past its due date is still accepted. Staging only stores the file -  `POST api/2.0/settings/license/accept` puts it in force - and a file staged earlier is overwritten. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringWrapper
   * @throws ApiException if fails to make API call
   */
  public StringWrapper uploadLicense(@javax.annotation.Nonnull List<File> files, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'files' is set
    if (files == null) {
      throw new ApiException(400, "Missing the required parameter 'files' when calling uploadLicense");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/settings/license";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (files != null)
      localVarFormParams.put("Files", files);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<StringWrapper> localVarReturnType = new TypeReference<StringWrapper>() {};
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
