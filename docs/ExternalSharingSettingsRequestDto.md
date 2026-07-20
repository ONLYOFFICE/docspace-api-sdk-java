

# ExternalSharingSettingsRequestDto

The Access Control external sharing settings request parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalShare** | **Boolean** | Specifies whether external (public) link creation is allowed. |  [optional] |
|**defaultShareLinkInternal** | **Boolean** | Specifies the default sharing link type: true = DocSpace users only, false = Anyone with the link.  Relevant only when ExternalShare is true. |  [optional] |
|**externalShareApplyToDocuments** | **Boolean** | When external sharing is restricted, specifies whether to apply the restriction to the My Documents section.  Relevant only when ExternalShare is false. |  [optional] |
|**externalShareApplyToRooms** | **Boolean** | When external sharing is restricted, specifies whether to apply the restriction to the Rooms section.  Relevant only when ExternalShare is false. |  [optional] |
|**blockExistingLinksOnRestrict** | **Boolean** | When external sharing is restricted, specifies whether to block existing public links immediately.  Relevant only when ExternalShare is false. |  [optional] |



