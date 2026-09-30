

# ReportDto

One page of the portal wallet's money movements, with the paging figures needed to walk the rest.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collection** | [**List&lt;OperationDto&gt;**](OperationDto.md) | The movements on this page - top-ups, charges, refunds and corrections alike, newest first. It is empty  for a page past the end of the report as well as for a period in which nothing happened. |  [optional] |
|**offset** | **Integer** | How many movements were skipped before this page, echoed from the request so a client need not remember  what it asked for. |  [optional] |
|**limit** | **Integer** | How many movements one page may hold, echoed from the request; it is 25 unless another value was asked  for. A full page is not proof that more exist - compare `currentPage` with `totalPage`. |  [optional] |
|**totalQuantity** | **Long** | How many movements match the filters in total, across every page. |  [optional] |
|**totalPage** | **Integer** | How many pages those movements come to at the current `limit`. |  [optional] |
|**currentPage** | **Integer** | Which of those pages this one is, as the billing service numbers them. Page through by advancing `offset`  rather than this value, which nothing accepts as an argument. |  [optional] |



