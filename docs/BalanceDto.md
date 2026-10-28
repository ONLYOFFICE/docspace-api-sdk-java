

# BalanceDto

Represents a balance with an account number and a list of sub-accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **Integer** | The account number. |  [optional] |
|**subAccountNumber** | **Integer** | The sub-account number. |  [optional] |
|**accountName** | **String** | The account name. |  [optional] |
|**accountCurrency** | **String** | The account currency. |  [optional] |
|**subAccounts** | [**List&lt;SubAccountDto&gt;**](SubAccountDto.md) | A list of sub-accounts. |  [optional] |
|**lastCredit** | [**TransactionInfoDto**](TransactionInfoDto.md) | The most recent credit transaction applied to the account. |  [optional] |



