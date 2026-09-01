

# AiChatEvent

Discriminated event emitted by the streaming methods of  {@link  AIEngine } . The engine never invokes user-supplied middleware or callbacks directly — every observable side-effect is encoded as a  {@link  ChatEvent }  so the same stream can be replayed over SSE, WebSocket, or in-process.  Pause point: `tool-call-pending` is the only stop. The UI must execute the tool itself (consulting `autoAllow` to decide between the silent path and the approve dialog) and resume via  {@link  AIEngine.approveToolCall }  or  {@link  AIEngine.denyToolCall } .  Other variants are pure data:  - `message-start` / `message-delta` / `message-end` — assistant   reply lifecycle. - `message-incomplete` — the provider returned an error or   incomplete status. - `thread-title` — auto-generated title ready for a new thread.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids. |  |
|**message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**idx** | **BigDecimal** |  |  [optional] |
|**threadId** | **String** |  |  [optional] |
|**autoAllow** | **Boolean** | The consumer should execute the tool without prompting the user. True when the tool is in the persisted always-allow list, or the tool itself opts in via `TMCPItem.requireApproval === false` (host tools default to this). For a client-side tool with a server-side engine, this lets the engine return the pending call already flagged auto-allow so the client runs it and streams the result back without a dialog round-trip. |  [optional] |
|**serverExecuted** | **Boolean** | Set when the tool is served by a server-side system source: the consumer must NOT execute it locally — only show the approval UI (unless `autoAllow`) and resume via `approveToolCall` (no `result` needed) / `denyToolCall`. The engine runs it in-engine. |  [optional] |
|**title** | **String** |  |  [optional] |
|**profileId** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER_MESSAGE_STORED | &quot;user-message-stored&quot; |
| MESSAGE_START | &quot;message-start&quot; |
| MESSAGE_DELTA | &quot;message-delta&quot; |
| MESSAGE_END | &quot;message-end&quot; |
| MESSAGE_INCOMPLETE | &quot;message-incomplete&quot; |
| TOOL_CALL_PENDING | &quot;tool-call-pending&quot; |
| THREAD_TITLE | &quot;thread-title&quot; |



