

# MetadataValueRequest

The parameters of a metadata field value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldId** | **Integer** | The field ID. |  |
|**stringValue** | **String** | The string value. |  [optional] |
|**numberValue** | **Long** | The number value: a whole number of at most 2^53-1 (9007199254740991) in magnitude, the largest integer a JSON  client reads exactly. A larger one is refused rather than stored and returned rounded. |  [optional] |
|**dateValue** | **OffsetDateTime** | The date value. A value without a time zone offset is treated as UTC, the same way the metadata filters treat their date bounds. |  [optional] |
|**optionIds** | **List&lt;UUID&gt;** | The selected choice option IDs. |  [optional] |



