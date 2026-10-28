

# SaveCompanyInfoRequest

The company the installation is branded for, as shown on the About page and in letters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyName** | **String** | The company name. |  [optional] |
|**site** | **URI** | The company website, as an absolute URL. |  [optional] |
|**email** | **String** | The contact email address. |  [optional] |
|**address** | **String** | The postal address. |  [optional] |
|**phone** | **String** | The contact phone number. |  [optional] |
|**isLicensor** | **Boolean** | Accepted for compatibility with earlier clients and not read: saved details are never those of the licensor, so the server always stores `false`. |  [optional] |
|**hideAbout** | **Boolean** | Whether the About page is hidden. |  [optional] |
|**lastModified** | **OffsetDateTime** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |



