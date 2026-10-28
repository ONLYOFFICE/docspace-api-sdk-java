

# UpdateMetadataFieldRequest

The parameters of a metadata field update. Every property is optional: a property that is omitted keeps its current value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The new field name. |  [optional] |
|**type** | **MetadataFieldType** | The new field type. The type can be changed only while the field has no values. |  [optional] |
|**options** | [**List&lt;MetadataFieldOptionRequest&gt;**](MetadataFieldOptionRequest.md) | The new choice options of the field. The options in use cannot be removed. |  [optional] |
|**order** | **Integer** | The new display position of the field inside the template: the fields are shown by it ascending. |  [optional] |



