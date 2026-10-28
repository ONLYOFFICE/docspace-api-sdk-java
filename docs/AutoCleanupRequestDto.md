

# AutoCleanupRequestDto

The trash auto-clearing setting to store: the on/off flag together with the interval.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**set** | **Boolean** | Whether the caller's trash is cleared automatically: with true an item is removed for good once it has been in  the trash longer than the interval below, with false the portal removes nothing and waits for the trash to be  emptied by hand. |  [optional] |
|**gap** | **DateToAutoCleanUp** | How long an item may stay in the trash before it is removed for good. It is written from every request,  including one that switches clearing off, so send it together with the flag instead of expecting the stored  interval to be kept. |  [optional] |



