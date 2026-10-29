

# ServiceLimitReportDto

A page of the spending limits in force for the portal users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collection** | [**List&lt;ServiceLimitDto&gt;**](ServiceLimitDto.md) | The limits of this page, one per user; empty when no limit applies to any user or the page is past the end. |  [optional] |
|**offset** | **Integer** | The number of limits skipped before this page. |  [optional] |
|**limit** | **Integer** | The page size the page was read with. |  [optional] |
|**totalPage** | **Integer** | The number of pages the whole list takes at this page size. |  [optional] |
|**currentPage** | **Integer** | The number of this page, starting from 1. |  [optional] |
|**totalQuantity** | **Integer** | The number of users with a limit in force across all pages. |  [optional] |



