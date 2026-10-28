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


package samples;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;

import org.openapitools.client.api.Authentication.AuthenticationApi;
import org.openapitools.client.api.Files.FoldersApi;
import org.openapitools.client.api.Rooms.RoomsApi;
import org.openapitools.client.api.Backup.BackupApi;

import org.openapitools.client.model.*;

import java.util.Collections;
public class sample {

    public static void main(String[] args) throws Exception {

        // --- CONFIG ---
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setBasePath("https://your-docspace.onlyoffice.com");

        // --- LOGS ---
        // apiClient.setDebugging(true);

        // --- AUTH ---
        AuthenticationApi authApi = new AuthenticationApi(apiClient);

        AuthRequestDto authDto = new AuthRequestDto();
        authDto.setUserName("example@onlyoffice.com");
        authDto.setPassword("11111111");

        AuthenticationTokenWrapper authResponse = authApi.authenticateMe(authDto);
        String token = authResponse.getResponse().getToken();

        apiClient.setBearerToken(token);

        // --- FOLDERS ---
        FoldersApi foldersApi = new FoldersApi(apiClient);

        FolderContentWrapper myFolder = foldersApi.getMyFolder(null, null, null, 100, 0, null, null, null, null, null, null);
        Integer myFolderId = myFolder.getResponse().getCurrent().getId();
        System.out.println("My folder id: " + myFolderId);

        CreateFolderRequest createDto = new CreateFolderRequest();
        createDto.setTitle("TestTitle");

        FolderWrapper created = foldersApi.createFolder(myFolderId, createDto);
        Integer newFolderId = created.getResponse().getId();
        System.out.println("Created folder: " + newFolderId);

        CreateFolderRequest renameDto = new CreateFolderRequest();
        renameDto.setTitle("Updated title");

        FolderWrapper renamed = foldersApi.renameFolder(newFolderId, renameDto);
        System.out.println("My folder title: " + renamed.getResponse().getTitle());

        DeleteFolderRequest deleteDto = new DeleteFolderRequest();
        deleteDto.setImmediately(true);
        deleteDto.setDeleteAfter(false);

        FileOperationArrayWrapper deleted = foldersApi.deleteFolder(newFolderId, deleteDto);
        System.out.println("Folder deleted status: " + deleted.getStatusCode());

        // --- ROOMS ---
        RoomsApi roomsApi = new RoomsApi(apiClient);

        FolderContentWrapper rooms = roomsApi
            .withFields("current.security,folders.id")
            .getRoomsFolder(
                Collections.emptyList(), null, null, SearchArea.ACTIVE, null,
                null, null, null, null, null,
                null, null, 100, 0, "DateAndTime",
                SortOrder.Descending, null, null, null, null, null
            );

        System.out.println("Rooms status: " + rooms.getStatusCode());

        // --- BACKUP ---
        BackupApi backupApi = new BackupApi(apiClient);

        StartBackupRequestDto backupDto = new StartBackupRequestDto();
        backupDto.setDump(false);
        backupDto.setStorageType(BackupStorageType.DataStore);

        backupApi.startBackup(backupDto);
        System.out.println("Backup started");

        while (true) {
            BackupProgressWrapper progress = backupApi.getBackupProgress(null);
            if (Boolean.TRUE.equals(progress.getResponse().getIsCompleted())) {
                System.out.println("Backup completed");
                break;
            }
            Thread.sleep(1000);
        }
    }
}