

# ChangeHistory

The change to make to a revision group of a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The version the change applies to; 0 means the current version of the file. |  |
|**continueVersion** | **Boolean** | What to do with the revision group: `false` completes the named version, storing its content again as a fresh  version that opens a new group, while `true` folds the last group back into the group before it, so the next  save continues that revision. |  [optional] |



