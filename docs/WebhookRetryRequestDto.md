

# WebhookRetryRequestDto

Which past webhook deliveries are sent again.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;Integer&gt;** | The delivery records to send again, by the `id` values `GET api/2.0/settings/webhooks/log` reports. The bound  is per call: a longer batch has to be split into several calls. |  [optional] |



