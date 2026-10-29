

# SetParticipantServiceLimitsRequestDto

The personal spending limit on the AI services to set for each of several portal users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIds** | **List&lt;UUID&gt;** | The IDs of the portal users the limit is set for, as returned in `id` by the people operations. |  |
|**amountValue** | **Double** | The most money the AI services may cost each user per period, in their currency, which cannot be chosen. Zero  blocks the AI services completely. |  [optional] |
|**quantityValue** | **Integer** | The largest quantity the AI services may consume per period for each user, in their common unit. Zero blocks the  AI services completely. |  [optional] |
|**period** | **ServiceLimitPeriod** | The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets. |  [optional] |



