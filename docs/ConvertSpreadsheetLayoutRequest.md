

# ConvertSpreadsheetLayoutRequest

How a spreadsheet converted to PDF is laid out on the page. A field left out takes the document service default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ignorePrintArea** | **Boolean** | Whether the print area chosen in the spreadsheet is ignored; false converts only that area. |  [optional] |
|**orientation** | **String** | The page orientation of the output PDF file: portrait or landscape. |  [optional] |
|**fitToHeight** | **Integer** | The number of pages the converted area is fitted into in height; 0 does not fit it. |  [optional] |
|**scale** | **Integer** | The scale of the output PDF file, in percent. |  [optional] |
|**fitToWidth** | **Integer** | The number of pages the converted area is fitted into in width; 0 does not fit it. |  [optional] |
|**headings** | **Boolean** | Whether the row and column headings are printed in the output PDF file. |  [optional] |
|**gridLines** | **Boolean** | Whether the grid lines are printed in the output PDF file. |  [optional] |
|**margins** | [**ConvertSpreadsheetMarginsRequest**](ConvertSpreadsheetMarginsRequest.md) | The margins of the output PDF file. |  [optional] |
|**pageSize** | [**ConvertSpreadsheetPageSizeRequest**](ConvertSpreadsheetPageSizeRequest.md) | The page size of the output PDF file. |  [optional] |



