

# ScheduleDto

The backup schedule of a portal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storageType** | **BackupStorageType** | The storage the scheduled archives are written to, reported as a number rather than as the name the  schedule was created with. |  |
|**storageParams** | **Map&lt;String, String&gt;** | The settings of the storage, as an object keyed by parameter name - not as the array of key and value  pairs the schedule was created with, so it cannot be sent back unchanged. For every storage type  except `ThirdPartyConsumer` the `folderId` key is built from the stored base path. |  |
|**cronParams** | [**CronParams**](CronParams.md) | When the backup runs, read back from the stored cron expression. `day` is 0 for a daily schedule,  because a daily one has no day. |  |
|**backupsStored** | **Integer** | The number of scheduled copies kept. It is null, not 0, when the schedule keeps an unlimited number. |  [optional] |
|**lastBackupTime** | **OffsetDateTime** | The date and time the schedule last ran at. It is `0001-01-01T00:00:00` until the schedule has run  for the first time. |  |
|**dump** | **Boolean** | Specifies whether this schedule backs up the whole server instead of one portal. |  |



