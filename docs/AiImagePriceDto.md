

# AiImagePriceDto

What an image model charges: the tokens of the request and the images that come out of it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **Double** | The cost of one million tokens sent to the image model, which is the prompt describing the picture. |  [optional] |
|**completion** | **Double** | The cost of one million tokens the image model writes back alongside the picture. |  [optional] |
|**image** | **Double** | The cost of one produced image, charged on top of the token amounts above. |  [optional] |



