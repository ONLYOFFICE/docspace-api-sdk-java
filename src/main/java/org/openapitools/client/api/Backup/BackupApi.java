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

package org.openapitools.client.api.Backup;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.BackupDto;
import org.openapitools.client.model.BackupHistoryRecordArrayWrapper;
import org.openapitools.client.model.BackupProgressWrapper;
import org.openapitools.client.model.BackupRestoreDto;
import org.openapitools.client.model.BackupScheduleDto;
import org.openapitools.client.model.BackupServiceStateWrapper;
import org.openapitools.client.model.BooleanWrapper;
import org.openapitools.client.model.Int32Wrapper;
import java.time.OffsetDateTime;
import org.openapitools.client.model.ScheduleWrapper;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class BackupApi extends BaseApi {

  public BackupApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BackupApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Cancel current backup
   * Cancel current backup.
   *
   * REST API Reference for cancelBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-backup/
   *
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper cancelBackup() throws ApiException {
    return this.cancelBackup(Collections.emptyMap());
  }


  /**
   * Cancel current backup
   * Cancel current backup.
   *
   * REST API Reference for cancelBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-backup/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper cancelBackup(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/cancelbackup";

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
   * Create the backup schedule
   * Creates the backup schedule of the current portal with the parameters specified in the request.
   *
   * REST API Reference for createBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-backup-schedule/
   *
   * @param backupScheduleDto  (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper createBackupSchedule(@javax.annotation.Nullable BackupScheduleDto backupScheduleDto) throws ApiException {
    return this.createBackupSchedule(backupScheduleDto, Collections.emptyMap());
  }


  /**
   * Create the backup schedule
   * Creates the backup schedule of the current portal with the parameters specified in the request.
   *
   * REST API Reference for createBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-backup-schedule/
   *
   * @param backupScheduleDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper createBackupSchedule(@javax.annotation.Nullable BackupScheduleDto backupScheduleDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = backupScheduleDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/createbackupschedule";

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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Delete the backup
   * Deletes the backup with the ID specified in the request.
   *
   * REST API Reference for deleteBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup/
   *
   * @param id The backup ID. (required)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackup(@javax.annotation.Nonnull UUID id) throws ApiException {
    return this.deleteBackup(id, Collections.emptyMap());
  }


  /**
   * Delete the backup
   * Deletes the backup with the ID specified in the request.
   *
   * REST API Reference for deleteBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup/
   *
   * @param id The backup ID. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackup(@javax.annotation.Nonnull UUID id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteBackup");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/deletebackup/{id}"
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

    TypeReference<BooleanWrapper> localVarReturnType = new TypeReference<BooleanWrapper>() {};
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
   * Delete the backup history
   * Deletes the backup history from the current portal.
   *
   * REST API Reference for deleteBackupHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-history/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackupHistory(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.deleteBackupHistory(dump, Collections.emptyMap());
  }


  /**
   * Delete the backup history
   * Deletes the backup history from the current portal.
   *
   * REST API Reference for deleteBackupHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-history/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackupHistory(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/deletebackuphistory";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
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
   * Delete the backup schedule
   * Deletes the backup schedule of the current portal.
   *
   * REST API Reference for deleteBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-schedule/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackupSchedule(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.deleteBackupSchedule(dump, Collections.emptyMap());
  }


  /**
   * Delete the backup schedule
   * Deletes the backup schedule of the current portal.
   *
   * REST API Reference for deleteBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-schedule/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BooleanWrapper
   * @throws ApiException if fails to make API call
   */
  public BooleanWrapper deleteBackupSchedule(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/deletebackupschedule";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
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
   * Get the backup history
   * Returns the history of the started backup.
   *
   * REST API Reference for getBackupHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-history/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return BackupHistoryRecordArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupHistoryRecordArrayWrapper getBackupHistory(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.getBackupHistory(dump, Collections.emptyMap());
  }


  /**
   * Get the backup history
   * Returns the history of the started backup.
   *
   * REST API Reference for getBackupHistory Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-history/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupHistoryRecordArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupHistoryRecordArrayWrapper getBackupHistory(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getbackuphistory";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<BackupHistoryRecordArrayWrapper> localVarReturnType = new TypeReference<BackupHistoryRecordArrayWrapper>() {};
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
   * Get the backup progress
   * Returns the progress of the started backup.
   *
   * REST API Reference for getBackupProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-progress/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper getBackupProgress(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.getBackupProgress(dump, Collections.emptyMap());
  }


  /**
   * Get the backup progress
   * Returns the progress of the started backup.
   *
   * REST API Reference for getBackupProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-progress/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper getBackupProgress(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getbackupprogress";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<BackupProgressWrapper> localVarReturnType = new TypeReference<BackupProgressWrapper>() {};
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
   * Get the backup schedule
   * Returns the backup schedule of the current portal.
   *
   * REST API Reference for getBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-schedule/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return ScheduleWrapper
   * @throws ApiException if fails to make API call
   */
  public ScheduleWrapper getBackupSchedule(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.getBackupSchedule(dump, Collections.emptyMap());
  }


  /**
   * Get the backup schedule
   * Returns the backup schedule of the current portal.
   *
   * REST API Reference for getBackupSchedule Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-schedule/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ScheduleWrapper
   * @throws ApiException if fails to make API call
   */
  public ScheduleWrapper getBackupSchedule(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getbackupschedule";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<ScheduleWrapper> localVarReturnType = new TypeReference<ScheduleWrapper>() {};
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
   * Get the number of backups
   * Returns the number of backups for a period of time. The default is the current calendar month.
   *
   * REST API Reference for getBackupsCount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-count/
   *
   * @param from The from date. (optional)
   * @param to The to date. (optional)
   * @param paid Specifies if the backups are paid or not. (optional)
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper getBackupsCount(@javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to, @javax.annotation.Nullable Boolean paid) throws ApiException {
    return this.getBackupsCount(from, to, paid, Collections.emptyMap());
  }


  /**
   * Get the number of backups
   * Returns the number of backups for a period of time. The default is the current calendar month.
   *
   * REST API Reference for getBackupsCount Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-count/
   *
   * @param from The from date. (optional)
   * @param to The to date. (optional)
   * @param paid Specifies if the backups are paid or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Int32Wrapper
   * @throws ApiException if fails to make API call
   */
  public Int32Wrapper getBackupsCount(@javax.annotation.Nullable OffsetDateTime from, @javax.annotation.Nullable OffsetDateTime to, @javax.annotation.Nullable Boolean paid, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getbackupscount";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
    localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
    localVarQueryParams.addAll(apiClient.parameterToPair("paid", paid));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic", "OAuth2", "ApiKeyBearer", "asc_auth_key", "Bearer", "OpenId" };

    TypeReference<Int32Wrapper> localVarReturnType = new TypeReference<Int32Wrapper>() {};
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
   * Get the backup service state
   * Returns the backup service state.
   *
   * REST API Reference for getBackupsServiceState Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-service-state/
   *
   * @return BackupServiceStateWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupServiceStateWrapper getBackupsServiceState() throws ApiException {
    return this.getBackupsServiceState(Collections.emptyMap());
  }


  /**
   * Get the backup service state
   * Returns the backup service state.
   *
   * REST API Reference for getBackupsServiceState Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-service-state/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupServiceStateWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupServiceStateWrapper getBackupsServiceState(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getservicestate";

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

    TypeReference<BackupServiceStateWrapper> localVarReturnType = new TypeReference<BackupServiceStateWrapper>() {};
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
   * Get the restoring progress
   * Returns the progress of the started restoring process.
   *
   * REST API Reference for getRestoreProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restore-progress/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper getRestoreProgress(@javax.annotation.Nullable Boolean dump) throws ApiException {
    return this.getRestoreProgress(dump, Collections.emptyMap());
  }


  /**
   * Get the restoring progress
   * Returns the progress of the started restoring process.
   *
   * REST API Reference for getRestoreProgress Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restore-progress/
   *
   * @param dump Specifies if a dump will be created or not. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper getRestoreProgress(@javax.annotation.Nullable Boolean dump, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/getrestoreprogress";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("Dump", dump));
      
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BackupProgressWrapper> localVarReturnType = new TypeReference<BackupProgressWrapper>() {};
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
   * Start the backup
   * Starts the backup of the current portal with the parameters specified in the request.
   *
   * REST API Reference for startBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup/
   *
   * @param backupDto  (optional)
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper startBackup(@javax.annotation.Nullable BackupDto backupDto) throws ApiException {
    return this.startBackup(backupDto, Collections.emptyMap());
  }


  /**
   * Start the backup
   * Starts the backup of the current portal with the parameters specified in the request.
   *
   * REST API Reference for startBackup Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup/
   *
   * @param backupDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper startBackup(@javax.annotation.Nullable BackupDto backupDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = backupDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/startbackup";

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

    TypeReference<BackupProgressWrapper> localVarReturnType = new TypeReference<BackupProgressWrapper>() {};
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
   * Start the restoring process
   * Starts the data restoring process of the current portal with the parameters specified in the request.
   *
   * REST API Reference for startBackupRestore Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup-restore/
   *
   * @param backupRestoreDto  (optional)
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper startBackupRestore(@javax.annotation.Nullable BackupRestoreDto backupRestoreDto) throws ApiException {
    return this.startBackupRestore(backupRestoreDto, Collections.emptyMap());
  }


  /**
   * Start the restoring process
   * Starts the data restoring process of the current portal with the parameters specified in the request.
   *
   * REST API Reference for startBackupRestore Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup-restore/
   *
   * @param backupRestoreDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return BackupProgressWrapper
   * @throws ApiException if fails to make API call
   */
  public BackupProgressWrapper startBackupRestore(@javax.annotation.Nullable BackupRestoreDto backupRestoreDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = backupRestoreDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/backup/startrestore";

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

    TypeReference<BackupProgressWrapper> localVarReturnType = new TypeReference<BackupProgressWrapper>() {};
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
