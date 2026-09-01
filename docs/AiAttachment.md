

# AiAttachment

Persistent record for a single attachment (file or image) referenced from a user message. Files carry extracted text in `content`; images carry base64 data in `base64`. Metadata (`title`, `path`, `type`) is always present for display purposes regardless of whether the heavy payload is loaded.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Storage-assigned UUID. |  |
|**kind** | [**KindEnum**](#KindEnum) | file | image. |  |
|**source** | [**SourceEnum**](#SourceEnum) | Origin of the attachment. `user` — uploaded by the user in the composer (the default when unset, for backward compatibility). `tool` — produced by a tool call (e.g. `generate_image`). Lets the integrator's adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source. |  [optional] |
|**title** | **String** | Display label (filename or user-visible title). |  |
|**content** | **String** | Extracted text for files. |  [optional] |
|**base64** | **String** | Base64 data URL for images. |  [optional] |
|**path** | **String** | Original host file path (for files). |  [optional] |
|**type** | **BigDecimal** | ONLYOFFICE file type code (for files). |  [optional] |
|**messageId** | **String** | Owning message id once linked. Unset while the attachment is a draft. |  [optional] |
|**threadId** | **String** | Owning thread id once linked. Unset while the attachment is a draft. |  [optional] |
|**entityId** | **String** | Opaque scope token (entity / room) the attachment was created in. Drafts carry it so an entity switch keeps in-flight composer state isolated; once linked to a message the field is redundant with the thread's own entity binding. |  [optional] |
|**createdAt** | **BigDecimal** | Storage-assigned creation timestamp. |  |
|**canAnalyze** | **Boolean** | Whether the attached form can be analyzed. |  [optional] |
|**formKeys** | [**List&lt;AiAttachmentFormKeysInner&gt;**](AiAttachmentFormKeysInner.md) | Keys of the fields inside the form. `key` is the field identifier, `text` its human-readable label. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |
| IMAGE | &quot;image&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| TOOL | &quot;tool&quot; |



