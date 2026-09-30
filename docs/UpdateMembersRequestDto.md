

# UpdateMembersRequestDto

The request parameters for updating the user information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIds** | **List&lt;UUID&gt;** | The accounts the operation applies to. System accounts are dropped from the list without an error, and the  remaining ones are processed in the order they are given. |  [optional] |
|**resendAll** | **Boolean** | Reaches every pending account of the portal instead of the ones in `userIds`. It is read only by  `PUT api/2.0/people/invite` and is ignored by every other operation that binds this body. |  [optional] |



