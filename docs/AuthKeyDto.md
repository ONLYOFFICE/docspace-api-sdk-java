

# AuthKeyDto

One key of an authorization provider or a storage, with how the settings form shows it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The authorization key name. |  |
|**value** | **String** | The authorization key value. |  |
|**title** | **String** | The authorization key title. |  [optional] |
|**type** | **String** | The field type: text, password, select, toggle. |  [optional] |
|**options** | **List&lt;String&gt;** | The list of options for select type fields. |  [optional] |
|**dependsOn** | **String** | The name of another key this field depends on for visibility. |  [optional] |
|**dependsOnValue** | **String** | The value of the `dependsOn` key that makes this field visible. |  [optional] |



