

# FirebaseDeviceDto

One mobile device of the calling user registered for push notifications.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The id of the registration. |  [optional] |
|**userId** | **UUID** | The account the device belongs to; always the caller. |  [optional] |
|**tenantId** | **Integer** | The portal the registration belongs to; always the current one. |  [optional] |
|**firebaseDeviceToken** | **String** | The Firebase token the device was issued, as it was sent at registration. |  [optional] |
|**application** | **String** | The application the registration is for; `doc` for the Documents application. |  [optional] |
|**isSubscribed** | **Boolean** | Whether the device is currently sent push notifications. |  [optional] |



