

# FilesSettingsDto

Everything a client needs to work with documents in this portal: the format tables, the address templates, the  upload limits, the portal-wide switches and the preferences of the calling account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extsImagePreviewed** | **List&lt;String&gt;** | Images the portal can show in its own viewer. Anything outside the list has to be downloaded to be seen. |  [optional] |
|**extsMediaPreviewed** | **List&lt;String&gt;** | Audio and video the portal can play in its own player. |  [optional] |
|**extsWebPreviewed** | **List&lt;String&gt;** | Documents the editor can open read-only. A format that is here but not in the edited list can be viewed and  not changed. |  [optional] |
|**extsWebEdited** | **List&lt;String&gt;** | Documents the editor can open for editing. Uploading a format outside this list and outside the convertible  list leaves a file that can only be downloaded. |  [optional] |
|**extsWebEncrypt** | **List&lt;String&gt;** | Documents that can be edited inside a private room, where the content is encrypted on the client. |  [optional] |
|**extsWebReviewed** | **List&lt;String&gt;** | Documents that support the reviewing mode, so that granting review access to them is meaningful. |  [optional] |
|**extsWebCustomFilterEditing** | **List&lt;String&gt;** | Spreadsheets that support the custom filter mode, where a filter applied by one editor does not disturb the  others. |  [optional] |
|**extsWebRestrictedEditing** | **List&lt;String&gt;** | Documents that can only be filled in or commented on rather than edited freely, whatever access the caller  holds. |  [optional] |
|**extsWebCommented** | **List&lt;String&gt;** | Documents that support comments, so that granting comment access to them is meaningful. |  [optional] |
|**extsWebTemplate** | **List&lt;String&gt;** | Documents the portal treats as templates to create new files from. |  [optional] |
|**extsMustConvert** | **List&lt;String&gt;** | Formats that cannot be edited as they are and are converted on upload or on first opening. Which target each  one has is in the convertible table below. |  [optional] |
|**extsConvertible** | **Map&lt;String, List&lt;String&gt;&gt;** | The conversion map of the portal: for each source extension, the extensions it can be converted into. Use it  to fill the target format of a conversion request instead of guessing one. |  [optional] |
|**extsUploadable** | **List&lt;String&gt;** | Formats the portal offers to create and upload as documents. It is not an upload filter: files of other  formats are stored as they are. |  [optional] |
|**extsArchive** | **List&lt;String&gt;** | Formats recognised as archives, which is what decides the archive icon and the offer to unpack. |  [optional] |
|**extsVideo** | **List&lt;String&gt;** | Formats classified as video. The classification lists drive icons and the media filters of the listing  operations, and are wider than what the built-in player can show. |  [optional] |
|**extsAudio** | **List&lt;String&gt;** | Formats classified as audio. |  [optional] |
|**extsImage** | **List&lt;String&gt;** | Formats classified as images. |  [optional] |
|**extsSpreadsheet** | **List&lt;String&gt;** | Formats classified as spreadsheets. |  [optional] |
|**extsPresentation** | **List&lt;String&gt;** | Formats classified as presentations. |  [optional] |
|**extsDocument** | **List&lt;String&gt;** | Formats classified as text documents. |  [optional] |
|**extsDiagram** | **List&lt;String&gt;** | Formats classified as diagrams. |  [optional] |
|**internalFormats** | [**FilesSettingsDtoInternalFormats**](FilesSettingsDtoInternalFormats.md) |  |  [optional] |
|**masterFormExtension** | **String** | The extension of a fillable form template in this portal. It is configurable, so read it rather than assuming  the product default. |  [optional] |
|**paramVersion** | **String** | The name of the query parameter that pins a document address to one version. Append it to the addresses below  instead of composing a version address by hand. |  [optional] |
|**paramOutType** | **String** | The name of the query parameter that asks a download address for a converted copy in another format. |  [optional] |
|**fileDownloadUrlString** | **URI** | The template of the address a file is downloaded from: substitute the file identifier for the `{0}`  placeholder. Add the version and output-type parameters named above for a particular version or format. |  [optional] |
|**fileWebViewerUrlString** | **String** | The template of the address that opens a file in the viewer inside the portal, with `{0}` for the file  identifier. It is a portal-relative address, meant to be opened in a browser rather than called as an API. |  [optional] |
|**fileWebViewerExternalUrlString** | **URI** | The same viewer address as an absolute one, for a message or a page outside the portal. |  [optional] |
|**fileWebEditorUrlString** | **String** | The template of the address that opens a file for editing inside the portal, with `{0}` for the file  identifier. Whether the session really becomes editable still depends on the access the caller holds. |  [optional] |
|**fileWebEditorExternalUrlString** | **URI** | The same editing address as an absolute one, for use outside the portal. |  [optional] |
|**fileRedirectPreviewUrlString** | **URI** | The template of the address that sends the browser on to whichever viewer or editor suits the file, with `{0}`  for the file identifier. Use it when the kind of the file is not known in advance. |  [optional] |
|**fileThumbnailUrlString** | **URI** | The template of the address a file thumbnail is fetched from, with `{0}` for the file identifier. A thumbnail  is built in the background, so the address can answer with nothing for a while after the file appears. |  [optional] |
|**confirmDelete** | **Boolean** | Whether the caller asked to be prompted before a deletion. Written by `PUT api/2.0/files/changedeleteconfrim`. |  [optional] |
|**enableThirdParty** | **Boolean** | Whether this portal allows third-party storages to be connected at all. It is set portal-wide by an  administrator, so a member sees it as read-only. |  [optional] |
|**externalShare** | **Boolean** | Whether links that open an entry without a portal account may be created in this portal. Set portal-wide by an  administrator. |  [optional] |
|**externalShareSocialMedia** | **Boolean** | Whether the share-to-network buttons are offered next to an external link. It is reported as false whenever  external sharing itself is off. |  [optional] |
|**storeOriginalFiles** | **Boolean** | Whether the caller's uploads keep the original file when the portal converts them. With false the conversion  replaces the uploaded file with a new version of it. |  [optional] |
|**keepNewFileName** | **Boolean** | Whether the caller asked for new documents to be created with the default name instead of being prompted for  one. |  [optional] |
|**displayFileExtension** | **Boolean** | Whether the caller asked to see extensions in file titles. Stored titles always carry the extension whatever  this says. |  [optional] |
|**showQuickActions** | **Boolean** | Specifies whether to display the quick action buttons. |  [optional] |
|**convertNotify** | **Boolean** | Whether the caller is told about the result of a conversion. There is no operation in this document that  writes it. |  [optional] |
|**hideConfirmCancelOperation** | **Boolean** | Whether the prompt shown before a running operation is abandoned is hidden for the caller. |  [optional] |
|**hideConfirmConvertSave** | **Boolean** | Whether the prompt that offers to keep a copy in the original format on conversion is hidden for the caller.  Once true it cannot be turned back through the API. |  [optional] |
|**hideConfirmConvertOpen** | **Boolean** | Whether the prompt that offers to open the conversion result is hidden for the caller. Once true it cannot be  turned back through the API. |  [optional] |
|**hideConfirmRoomLifetime** | **Boolean** | Whether the warning shown before the lifetime settings of a room are changed is hidden for the caller. |  [optional] |
|**defaultOrder** | [**OrderBy**](OrderBy.md) | The ordering the listing operations fall back to when a request names none. It follows the last order the  caller asked a listing for, so it changes on its own as the account is used. |  [optional] |
|**forcesave** | **Boolean** | Whether the editor writes a document back to storage while the session is still open. It is on for every  portal and cannot be switched off. |  [optional] |
|**storeForcesave** | **Boolean** | Whether those intermediate saves are kept as separate versions. They are not, in any portal: they update the  current version instead. |  [optional] |
|**recentSection** | **Boolean** | Whether the Recent section is offered to the caller among the section roots. |  [optional] |
|**favoritesSection** | **Boolean** | Whether the Favorites section is offered to the caller among the section roots. |  [optional] |
|**templatesSection** | **Boolean** | Whether the Templates section is offered to the caller among the section roots. |  [optional] |
|**downloadTarGz** | **Boolean** | The archive format the caller's multi-item downloads are packed into: true for `.tar.gz`, false for `.zip`. |  [optional] |
|**automaticallyCleanUp** | [**AutoCleanUpData**](AutoCleanUpData.md) | The trash auto-clearing setting of the caller, the same pair `GET api/2.0/files/settings/autocleanup` returns. |  [optional] |
|**canSearchByContent** | **Boolean** | Whether documents in this portal can be searched by what is inside them and not only by title. It depends on  the full-text search service being configured and having indexed the portal. |  [optional] |
|**defaultSharingAccessRights** | [**List&lt;DefaultSharingAccessRightsEnum&gt;**](#List&lt;DefaultSharingAccessRightsEnum&gt;) | The access rights the sharing dialog offers the caller by default. The portal normalises the set it stores, so  this can be shorter than what was last sent. |  [optional] |
|**maxUploadThreadCount** | **Integer** | How many upload requests the portal accepts from one account at a time. Sending more than this in parallel  gets the extra ones refused rather than queued. |  [optional] |
|**chunkUploadSize** | **Long** | The size in bytes of one chunk of a chunked upload. Split a large file exactly along this size: a chunk that  does not match is refused by the upload session. |  [optional] |
|**openEditorInSameTab** | **Boolean** | Whether the caller asked for documents to open in the current browser tab. |  [optional] |
|**organizeRoomsGrouping** | **Boolean** | Whether the caller asked to see rooms arranged by the groups they belong to. |  [optional] |
|**defaultShareLinkInternal** | **Boolean** | The kind of external link this portal offers first: true for a link only its own accounts can open, false for  one anyone holding it can open. |  [optional] |
|**externalShareApplyToDocuments** | **Boolean** | Whether the external sharing restriction covers personal documents. It matters only while external sharing is  off. |  [optional] |
|**externalShareApplyToRooms** | **Boolean** | Whether the external sharing restriction covers rooms, including making a new one public. It matters only  while external sharing is off. |  [optional] |
|**blockExistingLinksOnRestrict** | **Boolean** | Whether links created before the restriction stop opening as well, rather than only new ones being refused. |  [optional] |
|**extsFilesVectorized** | **List&lt;String&gt;** | Formats whose content can be indexed for the AI features of the portal. A file outside the list is left out of  that index. |  [optional] |
|**maxVectorizationFileSize** | **Long** | The largest file size in bytes that is indexed for the AI features. A larger file is skipped even when its  format is listed above. |  [optional] |



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



