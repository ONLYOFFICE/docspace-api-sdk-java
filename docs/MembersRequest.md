

# MembersRequest

The accounts a member operation applies to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**members** | **List&lt;UUID&gt;** | The accounts the operation applies to. When adding or replacing members, an account that is a guest, is  disabled or does not exist is skipped without an error; when removing them, an ID that is not a member is  skipped as well. |  [optional] |



