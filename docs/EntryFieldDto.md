

# EntryFieldDto

A metadata template field with its value on the entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The field ID. |  [optional] |
|**name** | **String** | The field name. |  [optional] |
|**type** | **MetadataFieldType** | The field type. |  [optional] |
|**options** | [**List&lt;MetadataFieldOptionDto&gt;**](MetadataFieldOptionDto.md) | The choice options of the field. |  [optional] |
|**order** | **Integer** | The field display order inside the template. |  [optional] |
|**value** | [**MetadataValueDto**](MetadataValueDto.md) | The value of the field on the entry, or `null` when the entry holds no value for it. |  [optional] |



