

# FilesSettingsDto

The file settings parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extsImagePreviewed** | **List&lt;String&gt;** | The list of extensions of the viewed images. |  [optional] |
|**extsMediaPreviewed** | **List&lt;String&gt;** | The list of extensions of the viewed media files. |  [optional] |
|**extsWebPreviewed** | **List&lt;String&gt;** | The list of extensions of the viewed files. |  [optional] |
|**extsWebEdited** | **List&lt;String&gt;** | The list of extensions of the edited files. |  [optional] |
|**extsWebEncrypt** | **List&lt;String&gt;** | The list of extensions of the encrypted files. |  [optional] |
|**extsWebReviewed** | **List&lt;String&gt;** | The list of extensions of the reviewed files. |  [optional] |
|**extsWebCustomFilterEditing** | **List&lt;String&gt;** | The list of extensions of the custom filter files. |  [optional] |
|**extsWebRestrictedEditing** | **List&lt;String&gt;** | The list of extensions of the files that are restricted for editing. |  [optional] |
|**extsWebCommented** | **List&lt;String&gt;** | The list of extensions of the commented files. |  [optional] |
|**extsWebTemplate** | **List&lt;String&gt;** | The list of extensions of the template files. |  [optional] |
|**extsMustConvert** | **List&lt;String&gt;** | The list of extensions of the files that must be converted. |  [optional] |
|**extsConvertible** | **Map&lt;String, List&lt;String&gt;&gt;** | The list of the convertible extensions. |  [optional] |
|**extsUploadable** | **List&lt;String&gt;** | The list of the uploadable extensions. |  [optional] |
|**extsArchive** | **List&lt;String&gt;** | The list of extensions of the archive files. |  [optional] |
|**extsVideo** | **List&lt;String&gt;** | The list of the video extensions. |  [optional] |
|**extsAudio** | **List&lt;String&gt;** | The list of the audio extensions. |  [optional] |
|**extsImage** | **List&lt;String&gt;** | The list of the image extensions. |  [optional] |
|**extsSpreadsheet** | **List&lt;String&gt;** | The list of the spreadsheet extensions. |  [optional] |
|**extsPresentation** | **List&lt;String&gt;** | The list of the presentation extensions. |  [optional] |
|**extsDocument** | **List&lt;String&gt;** | The list of the text document extensions. |  [optional] |
|**extsDiagram** | **List&lt;String&gt;** | The list of the diagram extensions. |  [optional] |
|**internalFormats** | [**FilesSettingsDtoInternalFormats**](FilesSettingsDtoInternalFormats.md) |  |  [optional] |
|**masterFormExtension** | **String** | The master form extension. |  [optional] |
|**paramVersion** | **String** | The URL parameter which specifies the file version. |  [optional] |
|**paramOutType** | **String** | The URL parameter which specifies the output type of the converted file. |  [optional] |
|**fileDownloadUrlString** | **URI** | The URL to download a file. |  [optional] |
|**fileWebViewerUrlString** | **String** | The URL to the file web viewer. |  [optional] |
|**fileWebViewerExternalUrlString** | **URI** | The external URL to the file web viewer. |  [optional] |
|**fileWebEditorUrlString** | **String** | The URL to the file web editor. |  [optional] |
|**fileWebEditorExternalUrlString** | **URI** | The external URL to the file web editor. |  [optional] |
|**fileRedirectPreviewUrlString** | **URI** | The redirect URL to the file viewer. |  [optional] |
|**fileThumbnailUrlString** | **URI** | The URL to the file thumbnail. |  [optional] |
|**confirmDelete** | **Boolean** | Specifies whether to confirm the file deletion or not. |  [optional] |
|**enableThirdParty** | **Boolean** | Specifies whether to allow users to connect the third-party storages. |  [optional] |
|**externalShare** | **Boolean** | Specifies whether to enable sharing external links to the files. |  [optional] |
|**externalShareSocialMedia** | **Boolean** | Specifies whether to enable sharing files on social media. |  [optional] |
|**storeOriginalFiles** | **Boolean** | Specifies whether to enable storing original files. |  [optional] |
|**keepNewFileName** | **Boolean** | Specifies whether to keep the new file name. |  [optional] |
|**displayFileExtension** | **Boolean** | Specifies whether to display the file extension. |  [optional] |
|**convertNotify** | **Boolean** | Specifies whether to display the conversion notification. |  [optional] |
|**hideConfirmCancelOperation** | **Boolean** | Specifies whether to hide the confirmation dialog for the cancel operation. |  [optional] |
|**hideConfirmConvertSave** | **Boolean** | Specifies whether to hide the confirmation dialog  for saving the file copy in the original format when converting a file. |  [optional] |
|**hideConfirmConvertOpen** | **Boolean** | Specifies whether to hide the confirmation dialog  for opening the conversion result. |  [optional] |
|**hideConfirmRoomLifetime** | **Boolean** | Specifies whether to hide the confirmation dialog about the file lifetime in the room. |  [optional] |
|**defaultOrder** | [**OrderBy**](OrderBy.md) |  |  [optional] |
|**forcesave** | **Boolean** | Specifies whether to forcesave the files or not. |  [optional] |
|**storeForcesave** | **Boolean** | Specifies whether to store the forcesaved file versions or not. |  [optional] |
|**recentSection** | **Boolean** | Specifies if the Recent section is displayed or not. |  [optional] |
|**favoritesSection** | **Boolean** | Specifies if the Favorites section is displayed or not. |  [optional] |
|**templatesSection** | **Boolean** | Specifies if the Templates section is displayed or not. |  [optional] |
|**downloadTarGz** | **Boolean** | Specifies whether to download the .tar.gz files or not. |  [optional] |
|**automaticallyCleanUp** | [**AutoCleanUpData**](AutoCleanUpData.md) |  |  [optional] |
|**canSearchByContent** | **Boolean** | Specifies whether the file can be searched by its content or not. |  [optional] |
|**defaultSharingAccessRights** | [**List&lt;DefaultSharingAccessRightsEnum&gt;**](#List&lt;DefaultSharingAccessRightsEnum&gt;) | The default access rights in sharing settings. |  [optional] |
|**maxUploadThreadCount** | **Integer** | The maximum number of upload threads. |  [optional] |
|**chunkUploadSize** | **Long** | The size of a large file that is uploaded in chunks. |  [optional] |
|**openEditorInSameTab** | **Boolean** | Specifies whether to open the editor in the same tab or not. |  [optional] |
|**organizeRoomsGrouping** | **Boolean** | Specifies whether the grouping of rooms is enabled or not. |  [optional] |
|**defaultShareLinkInternal** | **Boolean** | Specifies the default sharing link type: true = DocSpace users only (internal), false = Anyone with the link. |  [optional] |
|**externalShareApplyToDocuments** | **Boolean** | When external sharing is restricted, specifies whether the restriction applies to the My Documents section. |  [optional] |
|**externalShareApplyToRooms** | **Boolean** | When external sharing is restricted, specifies whether the restriction applies to the Rooms section. |  [optional] |
|**blockExistingLinksOnRestrict** | **Boolean** | When external sharing is restricted, specifies whether existing public links are blocked immediately. |  [optional] |
|**extsFilesVectorized** | **List&lt;String&gt;** | List of extensions available for vectorization |  [optional] |
|**maxVectorizationFileSize** | **Long** | The maximum file size for vectorization |  [optional] |



## Enum: List&lt;DefaultSharingAccessRightsEnum&gt;

| Name | Value |
|---- | -----|
| None | 0 |
| ReadWrite | 1 |
| Read | 2 |
| Restrict | 3 |
| Varies | 4 |
| Review | 5 |
| Comment | 6 |
| FillForms | 7 |
| CustomFilter | 8 |
| RoomManager | 9 |
| Editing | 10 |
| ContentCreator | 11 |



