

# MigrationApiInfo

The migration API information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**migratorName** | **String** | The migrator name. |  [optional] |
|**operation** | **String** | The migration operation. |  [optional] |
|**failedArchives** | **List&lt;String&gt;** | The list of failed archives. |  [optional] |
|**users** | [**List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of migrating users. |  [optional] |
|**withoutEmailUsers** | [**List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of migrating users without email. |  [optional] |
|**existUsers** | [**List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of existing migrating users. |  [optional] |
|**groups** | [**List&lt;MigratingApiGroup&gt;**](MigratingApiGroup.md) | The list of migrating groups. |  [optional] |
|**importPersonalFiles** | **Boolean** | Specifies whether to import personal files or not. |  [optional] |
|**importSharedFiles** | **Boolean** | Specifies whether to import shared files or not. |  [optional] |
|**importSharedFolders** | **Boolean** | Specifies whether to import shared folders or not. |  [optional] |
|**importCommonFiles** | **Boolean** | Specifies whether to import common files or not. |  [optional] |
|**importProjectFiles** | **Boolean** | Specifies whether to import project files or not. |  [optional] |
|**importGroups** | **Boolean** | Specifies whether to import groups or not. |  [optional] |
|**successedUsers** | **Integer** | The number of successfully migrated users. |  [optional] |
|**failedUsers** | **Integer** | The number of unsuccessfully migrated users. |  [optional] |
|**files** | **List&lt;String&gt;** | The list of migrated files. |  [optional] |
|**errors** | **List&lt;String&gt;** | The list of migration errors. |  [optional] |



