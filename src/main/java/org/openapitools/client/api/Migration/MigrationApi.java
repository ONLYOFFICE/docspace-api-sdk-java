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

package org.openapitools.client.api.Migration;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.ErrorApiResponse;
import org.openapitools.client.model.FinishDto;
import org.openapitools.client.model.MigrationApiInfo;
import org.openapitools.client.model.MigrationStatusWrapper;
import org.openapitools.client.model.STRINGArrayWrapper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class MigrationApi extends BaseApi {

  public MigrationApi() {
    super(Configuration.getDefaultApiClient());
  }

  public MigrationApi(ApiClient apiClient) {
    super(apiClient);
  }


  /**
   * Cancel migration
   * Stops the parse pass queued for this portal and deletes the backup uploaded for it - the way back from a wrong  archive or a wrong migrator name. Nothing has to be called first and a DocSpace administrator is required; the  request is only queued, so the parse ends shortly after the call returns and  `GET api/2.0/migration/status` stops reporting it. The call is destructive for the uploaded data: the whole  upload folder is removed and the backup has to be sent to `migrationFileUpload.ashx` again before a new parse.  It is idempotent - cancelling when nothing is running still answers 200 - and it undoes nothing that was  already written to the portal. Only the parse stage is stopped, the job whose `parseResult.operation` is  `parse`: an import started by `POST api/2.0/migration/migrate` keeps running, and a finished import is  discarded with `POST api/2.0/migration/clear` instead.
   *
   * REST API Reference for cancelMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-migration/
   *
   * @throws ApiException if fails to make API call
   */
  public void cancelMigration() throws ApiException {
    this.cancelMigration(Collections.emptyMap());
  }


  /**
   * Cancel migration
   * Stops the parse pass queued for this portal and deletes the backup uploaded for it - the way back from a wrong  archive or a wrong migrator name. Nothing has to be called first and a DocSpace administrator is required; the  request is only queued, so the parse ends shortly after the call returns and  `GET api/2.0/migration/status` stops reporting it. The call is destructive for the uploaded data: the whole  upload folder is removed and the backup has to be sent to `migrationFileUpload.ashx` again before a new parse.  It is idempotent - cancelling when nothing is running still answers 200 - and it undoes nothing that was  already written to the portal. Only the parse stage is stopped, the job whose `parseResult.operation` is  `parse`: an import started by `POST api/2.0/migration/migrate` keeps running, and a finished import is  discarded with `POST api/2.0/migration/clear` instead.
   *
   * REST API Reference for cancelMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-migration/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void cancelMigration(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/cancel";

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

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Clear migration
   * Discards a finished import and deletes the data uploaded for it, freeing the portal for the next one. Call it  once `GET api/2.0/migration/status` reports `isCompleted` for a job whose `parseResult.operation` is  `migration`; a DocSpace administrator is required. Only the queued job and the temporary upload folder go -  the users, groups and files already imported stay in the portal - so the call destroys migration data alone,  and it is idempotent: clearing twice, or with nothing to clear, still answers 200. Like the other write  operations here it is only queued, and once it has run `GET api/2.0/migration/status` returns an empty result  and `GET api/2.0/migration/logs` answers 404, so download the log before calling it. A parse that is still  running is not affected - stop that with `POST api/2.0/migration/cancel` - and  `POST api/2.0/migration/finish` performs the same clean-up itself, which makes this call unnecessary after it.
   *
   * REST API Reference for clearMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/clear-migration/
   *
   * @throws ApiException if fails to make API call
   */
  public void clearMigration() throws ApiException {
    this.clearMigration(Collections.emptyMap());
  }


  /**
   * Clear migration
   * Discards a finished import and deletes the data uploaded for it, freeing the portal for the next one. Call it  once `GET api/2.0/migration/status` reports `isCompleted` for a job whose `parseResult.operation` is  `migration`; a DocSpace administrator is required. Only the queued job and the temporary upload folder go -  the users, groups and files already imported stay in the portal - so the call destroys migration data alone,  and it is idempotent: clearing twice, or with nothing to clear, still answers 200. Like the other write  operations here it is only queued, and once it has run `GET api/2.0/migration/status` returns an empty result  and `GET api/2.0/migration/logs` answers 404, so download the log before calling it. A parse that is still  running is not affected - stop that with `POST api/2.0/migration/cancel` - and  `POST api/2.0/migration/finish` performs the same clean-up itself, which makes this call unnecessary after it.
   *
   * REST API Reference for clearMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/clear-migration/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void clearMigration(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/clear";

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

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Finish migration
   * Closes a completed import: it can send every user the import created the activation email they need before  they can sign in, and it then discards the job and the data uploaded for it. Call it once  `GET api/2.0/migration/status` reports `isCompleted` for the import; a DocSpace administrator is required, and  with `isSendWelcomeEmail` set to true the job must still be in the queue, so do not clear it first. That flag  decides what happens to the imported people: true mails the activation link to each of them who has not  activated their account yet and skips the ones that are already active, false ends the import quietly and  leaves inviting them for later. The call writes to the portal and is not idempotent - the emails go out again  on every call - while its second half repeats what `POST api/2.0/migration/clear` does, removing the finished  job and the uploaded backup and leaving everything already imported in place. It answers with an empty body,  after which `GET api/2.0/migration/status` returns an empty result and `GET api/2.0/migration/logs` answers  404, so download the log first.
   *
   * REST API Reference for finishMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finish-migration/
   *
   * @param finishDto  (optional)
   * @throws ApiException if fails to make API call
   */
  public void finishMigration(@javax.annotation.Nullable FinishDto finishDto) throws ApiException {
    this.finishMigration(finishDto, Collections.emptyMap());
  }


  /**
   * Finish migration
   * Closes a completed import: it can send every user the import created the activation email they need before  they can sign in, and it then discards the job and the data uploaded for it. Call it once  `GET api/2.0/migration/status` reports `isCompleted` for the import; a DocSpace administrator is required, and  with `isSendWelcomeEmail` set to true the job must still be in the queue, so do not clear it first. That flag  decides what happens to the imported people: true mails the activation link to each of them who has not  activated their account yet and skips the ones that are already active, false ends the import quietly and  leaves inviting them for later. The call writes to the portal and is not idempotent - the emails go out again  on every call - while its second half repeats what `POST api/2.0/migration/clear` does, removing the finished  job and the uploaded backup and leaving everything already imported in place. It answers with an empty body,  after which `GET api/2.0/migration/status` returns an empty result and `GET api/2.0/migration/logs` answers  404, so download the log first.
   *
   * REST API Reference for finishMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finish-migration/
   *
   * @param finishDto  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void finishMigration(@javax.annotation.Nullable FinishDto finishDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = finishDto;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/finish";

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

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Get migration logs
   * Downloads the log of the parse or import the portal currently holds - the step-by-step record behind the  numbers and the single error message of `GET api/2.0/migration/status`, and the place where the reason for a  skipped user or file is written. The portal has to hold such a job, started by  `POST api/2.0/migration/init/{migratorName}` or `POST api/2.0/migration/migrate` and not yet removed by  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish`, otherwise the call answers 404; a DocSpace  administrator is required and the call is read-only and idempotent. The body is not JSON: it is  `text/plain; charset=UTF-8` sent as an attachment named `migration.log`, one line per step with the progress  it reported. Each job writes its own log, so this always returns the log of the job that  `GET api/2.0/migration/status` describes, and while that job runs the file keeps growing - a call made early  returns only the part written so far and may be repeated later for the rest.
   *
   * REST API Reference for getMigrationLogs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-logs/
   *
   * @throws ApiException if fails to make API call
   */
  public void getMigrationLogs() throws ApiException {
    this.getMigrationLogs(Collections.emptyMap());
  }


  /**
   * Get migration logs
   * Downloads the log of the parse or import the portal currently holds - the step-by-step record behind the  numbers and the single error message of `GET api/2.0/migration/status`, and the place where the reason for a  skipped user or file is written. The portal has to hold such a job, started by  `POST api/2.0/migration/init/{migratorName}` or `POST api/2.0/migration/migrate` and not yet removed by  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish`, otherwise the call answers 404; a DocSpace  administrator is required and the call is read-only and idempotent. The body is not JSON: it is  `text/plain; charset=UTF-8` sent as an attachment named `migration.log`, one line per step with the progress  it reported. Each job writes its own log, so this always returns the log of the job that  `GET api/2.0/migration/status` describes, and while that job runs the file keeps growing - a call made early  returns only the part written so far and may be repeated later for the rest.
   *
   * REST API Reference for getMigrationLogs Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-logs/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void getMigrationLogs(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/logs";

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

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Get migration status
   * Returns how far the parse or the import queued for this portal has got and, once it stopped, what it produced  - the one place where every other operation in this group reports what it did. Any of them may be polled from  here as soon as it returns; a DocSpace administrator is required and the call is read-only and idempotent.  `progress` is the share of the job that is done, from 0 to 100, and `isCompleted` turns true when the job  stopped whether it succeeded or not, so read `error` as well: it stays empty while nothing went wrong and  otherwise holds the message that ended the job. `parseResult` carries what the migrator has read so far -  after a parse pass the users, groups and unreadable archives to edit and post to  `POST api/2.0/migration/migrate`, and during an import also `successedUsers` and `failedUsers` - and its  `operation` field, `parse` or `migration`, tells the two stages apart. The result is empty with status 200  when the portal has no job at all, because none was ever started or because  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish` has removed the last one; an empty answer is  therefore not an error. Line-by-line detail behind the numbers is in `GET api/2.0/migration/logs`.
   *
   * REST API Reference for getMigrationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-status/
   *
   * @return MigrationStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public MigrationStatusWrapper getMigrationStatus() throws ApiException {
    return this.getMigrationStatus(Collections.emptyMap());
  }


  /**
   * Get migration status
   * Returns how far the parse or the import queued for this portal has got and, once it stopped, what it produced  - the one place where every other operation in this group reports what it did. Any of them may be polled from  here as soon as it returns; a DocSpace administrator is required and the call is read-only and idempotent.  `progress` is the share of the job that is done, from 0 to 100, and `isCompleted` turns true when the job  stopped whether it succeeded or not, so read `error` as well: it stays empty while nothing went wrong and  otherwise holds the message that ended the job. `parseResult` carries what the migrator has read so far -  after a parse pass the users, groups and unreadable archives to edit and post to  `POST api/2.0/migration/migrate`, and during an import also `successedUsers` and `failedUsers` - and its  `operation` field, `parse` or `migration`, tells the two stages apart. The result is empty with status 200  when the portal has no job at all, because none was ever started or because  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish` has removed the last one; an empty answer is  therefore not an error. Line-by-line detail behind the numbers is in `GET api/2.0/migration/logs`.
   *
   * REST API Reference for getMigrationStatus Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-status/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return MigrationStatusWrapper
   * @throws ApiException if fails to make API call
   */
  public MigrationStatusWrapper getMigrationStatus(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/status";

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

    TypeReference<MigrationStatusWrapper> localVarReturnType = new TypeReference<MigrationStatusWrapper>() {};
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
   * Get available migrators
   * Lists the source products this installation can import a portal from, as the migrator names every other  operation in this group expects. Nothing has to be called first, a DocSpace administrator is required as  everywhere here, and the call is read-only and idempotent. The answer is a plain list of names such as  `GoogleWorkspace`, `Nextcloud` or `Workspace`, never localized and ordered as the migrators are registered;  pass one of them as `migratorName` to `POST api/2.0/migration/init/{migratorName}`, where the match ignores  case. The list depends on the installation rather than on the portal, so it does not change while the portal  runs, and a name that is not in it is not rejected by the operation that takes it - the queued job ends with  the failure reported in `error` of `GET api/2.0/migration/status`.
   *
   * REST API Reference for listMigrations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/list-migrations/
   *
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper listMigrations() throws ApiException {
    return this.listMigrations(Collections.emptyMap());
  }


  /**
   * Get available migrators
   * Lists the source products this installation can import a portal from, as the migrator names every other  operation in this group expects. Nothing has to be called first, a DocSpace administrator is required as  everywhere here, and the call is read-only and idempotent. The answer is a plain list of names such as  `GoogleWorkspace`, `Nextcloud` or `Workspace`, never localized and ordered as the migrators are registered;  pass one of them as `migratorName` to `POST api/2.0/migration/init/{migratorName}`, where the match ignores  case. The list depends on the installation rather than on the portal, so it does not change while the portal  runs, and a name that is not in it is not rejected by the operation that takes it - the queued job ends with  the failure reported in `error` of `GET api/2.0/migration/status`.
   *
   * REST API Reference for listMigrations Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/list-migrations/
   *
   * @param additionalHeaders additionalHeaders for this call
   * @return STRINGArrayWrapper
   * @throws ApiException if fails to make API call
   */
  public STRINGArrayWrapper listMigrations(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/list";

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

    TypeReference<STRINGArrayWrapper> localVarReturnType = new TypeReference<STRINGArrayWrapper>() {};
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
   * Start migration
   * Starts the import itself: the users, the groups and the files selected in the request body are created on this  portal from the backup that the parse pass has read. Run `POST api/2.0/migration/init/{migratorName}` first  and wait for `isCompleted` in `GET api/2.0/migration/status`, then send `parseResult` from that answer back  here with `shouldImport` set on the users and groups to take and the `import...Files` flags set for the  content to copy. A DocSpace administrator is required, and importing a user as `DocSpaceAdmin` additionally  requires the caller to be the portal owner unless a user with that email is an administrator of this portal  already, otherwise the whole call is rejected with 403 before anything is imported. The job is queued and the  call answers with an empty body at once: watch `progress`, `successedUsers`, `failedUsers` and `error` in  `GET api/2.0/migration/status` and read what each step did from `GET api/2.0/migration/logs`. The import  writes to the portal and cannot be undone, and a repeat is no help: a call made while the job runs is ignored,  and once the job has ended the uploaded backup is deleted, so a new call has nothing to read until the archive  is uploaded and parsed again. When the import is done, close it with `POST api/2.0/migration/finish`, which can  also mail the imported users their activation link.
   *
   * REST API Reference for startMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-migration/
   *
   * @param migrationApiInfo  (optional)
   * @throws ApiException if fails to make API call
   */
  public void startMigration(@javax.annotation.Nullable MigrationApiInfo migrationApiInfo) throws ApiException {
    this.startMigration(migrationApiInfo, Collections.emptyMap());
  }


  /**
   * Start migration
   * Starts the import itself: the users, the groups and the files selected in the request body are created on this  portal from the backup that the parse pass has read. Run `POST api/2.0/migration/init/{migratorName}` first  and wait for `isCompleted` in `GET api/2.0/migration/status`, then send `parseResult` from that answer back  here with `shouldImport` set on the users and groups to take and the `import...Files` flags set for the  content to copy. A DocSpace administrator is required, and importing a user as `DocSpaceAdmin` additionally  requires the caller to be the portal owner unless a user with that email is an administrator of this portal  already, otherwise the whole call is rejected with 403 before anything is imported. The job is queued and the  call answers with an empty body at once: watch `progress`, `successedUsers`, `failedUsers` and `error` in  `GET api/2.0/migration/status` and read what each step did from `GET api/2.0/migration/logs`. The import  writes to the portal and cannot be undone, and a repeat is no help: a call made while the job runs is ignored,  and once the job has ended the uploaded backup is deleted, so a new call has nothing to read until the archive  is uploaded and parsed again. When the import is done, close it with `POST api/2.0/migration/finish`, which can  also mail the imported users their activation link.
   *
   * REST API Reference for startMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-migration/
   *
   * @param migrationApiInfo  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void startMigration(@javax.annotation.Nullable MigrationApiInfo migrationApiInfo, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = migrationApiInfo;
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/migrate";

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

    apiClient.invokeAPI(
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
        null
    );
  }

  /**
   * Parse migration archive
   * Queues a pass that reads the backup already uploaded for this portal with the migrator named in the path and  reports what it holds - the users, the users that carry no email address, the users that exist on this portal  already, the groups and the archives it could not open - so that the caller can choose what to import. Upload  the backup first: `migrationFileUpload.ashx?Init=true` opens a new upload folder and drops the previous one,  then every part of the archive is posted to the same handler with `Name` set to its file name; take  `migratorName` from `GET api/2.0/migration/list`. A DocSpace administrator is required. The call only queues  the job and answers at once with an empty body: poll `GET api/2.0/migration/status` until `isCompleted` is  true, then read what was found from `parseResult` and any failure from `error`. Nothing is imported here and  the portal is not changed - the parse result is the body to edit and send to  `POST api/2.0/migration/migrate`. A portal runs one job at a time, so a call made while another parse or  import is still running is ignored instead of reported, and a backup bigger than the portal's total storage  quota ends the job with an error rather than failing this call.
   *
   * REST API Reference for uploadAndInitializeMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-and-initialize-migration/
   *
   * @param migratorName The migrator that knows the format of the uploaded backup. It has to be one of the names  `GET api/2.0/migration/list` reports for this installation, spelled exactly as listed. (required)
   * @throws ApiException if fails to make API call
   */
  public void uploadAndInitializeMigration(@javax.annotation.Nonnull String migratorName) throws ApiException {
    this.uploadAndInitializeMigration(migratorName, Collections.emptyMap());
  }


  /**
   * Parse migration archive
   * Queues a pass that reads the backup already uploaded for this portal with the migrator named in the path and  reports what it holds - the users, the users that carry no email address, the users that exist on this portal  already, the groups and the archives it could not open - so that the caller can choose what to import. Upload  the backup first: `migrationFileUpload.ashx?Init=true` opens a new upload folder and drops the previous one,  then every part of the archive is posted to the same handler with `Name` set to its file name; take  `migratorName` from `GET api/2.0/migration/list`. A DocSpace administrator is required. The call only queues  the job and answers at once with an empty body: poll `GET api/2.0/migration/status` until `isCompleted` is  true, then read what was found from `parseResult` and any failure from `error`. Nothing is imported here and  the portal is not changed - the parse result is the body to edit and send to  `POST api/2.0/migration/migrate`. A portal runs one job at a time, so a call made while another parse or  import is still running is ignored instead of reported, and a backup bigger than the portal's total storage  quota ends the job with an error rather than failing this call.
   *
   * REST API Reference for uploadAndInitializeMigration Operation
   * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-and-initialize-migration/
   *
   * @param migratorName The migrator that knows the format of the uploaded backup. It has to be one of the names  `GET api/2.0/migration/list` reports for this installation, spelled exactly as listed. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void uploadAndInitializeMigration(@javax.annotation.Nonnull String migratorName, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migratorName' is set
    if (migratorName == null) {
      throw new ApiException(400, "Missing the required parameter 'migratorName' when calling uploadAndInitializeMigration");
    }
    
    // create path and map variables
    String localVarPath = "/api/2.0/migration/init/{migratorName}"
      .replaceAll("\\{" + "migratorName" + "\\}", apiClient.escapeString(apiClient.parameterToString(migratorName)));

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

    apiClient.invokeAPI(
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
        null
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
