

# AiAiSendStreamBody

Shared body of the two streaming send endpoints (`sendWithStream` and its OpenAI-framed twin) — the `Chat` action is implied, so there is no `actionType`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threadId** | **String** | Target thread; a new one is created (with an auto title) when omitted. |  [optional] |
|**userMessage** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | The user turn to send. |  |
|**actionArgs** | [**AiAiActionArgs**](AiAiActionArgs.md) | Per-request engine options: extra tools, reasoning, prompt override. |  [optional] |
|**entityId** | **String** | Optional entity (room) scope for profile resolution. |  [optional] |
|**profileId** | **String** | Session-level profile override for this request only. |  [optional] |



