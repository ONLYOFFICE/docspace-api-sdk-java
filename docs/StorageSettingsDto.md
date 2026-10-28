

# StorageSettingsDto

The storage the portal keeps its data in, or serves its static content from.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**module** | **String** | The storage module, or `null` when the built-in storage is used. |  [optional] |
|**props** | **Map&lt;String, String&gt;** | The connection properties stored for the module. |  [optional] |
|**lastModified** | **OffsetDateTime** | When the settings were last stored. |  [optional] |



