

# CustomColorThemesSettingsDto

The colour themes the portal offers, which of them is applied, and how many the plan allows.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**themes** | [**List&lt;CustomColorThemesSettingsItem&gt;**](CustomColorThemesSettingsItem.md) | Every theme the portal can apply, ordered by ID, with the built-in ones first because they were created  first. It is never empty - the built-in themes cannot be deleted - and a custom theme is one whose ID is  higher than the built-in ones. |  [optional] |
|**selected** | **Integer** | The ID of the theme in `themes` that is currently applied to the whole portal. Deleting the applied theme  moves it to the lowest remaining ID, so it can change without anyone having chosen a new one. |  [optional] |
|**limit** | **Integer** | How many entries `themes` may hold in total, built-in ones included; `0` means the plan caps nothing. Once  the cap is reached `PUT api/2.0/settings/colortheme` drops a new theme silently instead of failing, so  compare this with the length of `themes` to tell whether a save took effect. |  [optional] |



