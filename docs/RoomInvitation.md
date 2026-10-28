

# RoomInvitation

One membership change in a room: an account or an email address, and the access level it is given.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The address of somebody who has no portal account yet. An invitation is sent to it and an account is created  once it is accepted, so this is the field to use instead of an account identifier when the person is new to  the portal. |  [optional] |
|**id** | **UUID** | The account or the group the entry is about, taken from the portal people and group listings. Leave it out and  give an email address instead to invite somebody who has no account yet. |  [optional] |
|**access** | **FileShare** | What the subject may do in the room. The value 0 removes the subject from the room, and the levels on offer  depend on the kind of room. |  [optional] |



