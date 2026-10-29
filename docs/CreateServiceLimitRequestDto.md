

# CreateServiceLimitRequestDto

The spending limit to create on the AI services: for the portal as a whole, for every user, or for one user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | **ServiceLimitScope** | Whom the limit applies to. |  [optional] |
|**userId** | **UUID** | The ID of the portal user a personal limit is set for, as returned in `id` by the people operations. |  [optional] |
|**amountValue** | **Double** | The most money the AI services may cost per period, in their currency, which cannot be chosen. Zero blocks the  AI services completely. |  [optional] |
|**quantityValue** | **Integer** | The largest quantity the AI services may consume per period, in their common unit. Zero blocks the AI services  completely. |  [optional] |
|**period** | **ServiceLimitPeriod** | The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets. |  [optional] |



