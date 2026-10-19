

# TenantAuditSettingsDto

How long the portal keeps its login history and its audit trail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loginHistoryLifeTime** | **Integer** | How many days login events are kept, from 1 to 180; 180 when the portal never changed it. |  [optional] |
|**auditTrailLifeTime** | **Integer** | How many days audit trail events are kept, from 1 to 180; 180 when the portal never changed it. |  [optional] |
|**lastModified** | **OffsetDateTime** | When the pair was last stored; when it never was, the moment it was read instead. |  [optional] |



