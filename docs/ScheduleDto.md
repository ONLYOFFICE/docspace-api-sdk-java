

# ScheduleDto

The backup schedule parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storageType** | **BackupStorageType** |  |  |
|**storageParams** | **Map&lt;String, String&gt;** | The backup storage parameters. |  |
|**cronParams** | [**CronParams**](CronParams.md) |  |  |
|**backupsStored** | **Integer** | The maximum number of the stored backup copies. |  [optional] |
|**lastBackupTime** | **OffsetDateTime** | The date and time when the last backup was reated. |  |
|**dump** | **Boolean** | Specifies if a dump will be created or not. |  |



