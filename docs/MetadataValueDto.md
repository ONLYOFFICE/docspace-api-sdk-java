

# MetadataValueDto

The value of a metadata field on an entry. Exactly one of the value properties is set, the one matching the field type:  `stringValue` for a string field, `numberValue` for a number field, `dateValue` for a date field,  `optionIds` for a single or multiple choice field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stringValue** | **String** | The string value. |  [optional] |
|**numberValue** | **Long** | The number value. |  [optional] |
|**dateValue** | [**ApiDateTime**](ApiDateTime.md) | The date value. |  [optional] |
|**optionIds** | **List&lt;UUID&gt;** | The selected choice option IDs. |  [optional] |



