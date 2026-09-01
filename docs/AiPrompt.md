

# AiPrompt

Saved prompt template that users can quickly insert into the chat.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique prompt identifier (UUID). |  |
|**name** | **String** | Prompt display name shown in the prompt picker. |  |
|**text** | **String** | Prompt template text. May contain placeholder tokens. |  |
|**folderId** | **String** | Optional parent folder ID. `undefined` means the prompt is at the root level. |  [optional] |
|**createdAt** | **BigDecimal** | Timestamp (ms since epoch) when the prompt was created. |  |
|**updatedAt** | **BigDecimal** | Timestamp (ms since epoch) of the last prompt modification. |  |



