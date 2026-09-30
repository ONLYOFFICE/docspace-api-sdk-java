

# ProblemDetail

RFC 7807 problem details returned by the registration API for failed requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **URI** | A URI reference that identifies the problem type. This service sets it to the DocSpace API getting-started page. |  [optional] |
|**title** | **String** | A short, human-readable summary of the problem type, typically the HTTP status reason phrase. |  [optional] |
|**status** | **Integer** | The HTTP status code for this occurrence of the problem. |  [optional] |
|**detail** | **String** | A human-readable explanation specific to this occurrence of the problem. |  [optional] |
|**instance** | **URI** | A URI reference that identifies the specific occurrence, set to the request path. |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | Extension members carried on the problem. Usually empty; validation failures also surface as the top-level errors array. |  [optional] |
|**errors** | [**List&lt;FieldError&gt;**](FieldError.md) | Field-specific validation errors. Present when the request body or parameters failed validation, or when a named scope is not in the tenant catalogue. |  [optional] |



