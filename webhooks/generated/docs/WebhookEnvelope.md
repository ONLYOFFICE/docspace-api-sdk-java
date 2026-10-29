

# WebhookEnvelope

The body of every delivery. `payload` is narrowed by `event.trigger` per x-docspace-trigger-payloads.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | [**WebhookEventInfo**](WebhookEventInfo.md) |  |  [optional] |
|**payload** | **Object** | The user, group, file, folder, room, agent or form submission the event is about. Its schema follows from &#x60;event.trigger&#x60;: a user.* event carries a user, a file.* event a file, and so on. |  [optional] |
|**webhook** | [**WebhookConfigInfo**](WebhookConfigInfo.md) |  |  [optional] |



