

# MetadataValueRequest

The parameters of a metadata field value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldId** | **Integer** | The field ID. |  |
|**stringValue** | **String** | The string value. |  [optional] |
|**numberValue** | **Long** | The number value. |  [optional] |
|**dateValue** | **OffsetDateTime** | The date value. A value without a time zone offset is treated as UTC, the same way the metadata filters treat their date bounds. |  [optional] |
|**optionIds** | **List&lt;UUID&gt;** | The selected choice option IDs. |  [optional] |



