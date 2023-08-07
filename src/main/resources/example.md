# 授权日志

* 包含5个接口

## list - /authorization_log/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束  | 描述  | 示例  |
|-----------------|--------|-----|-----|-----|-----|
| name            | String | 是   | -   || -   |
| creatorUsername | String | 是   | -   || -   |
| creatorFullname | String | 是   | -   || -   |
| ownerUsername   | String | 是   | -   || -   |
| ownerFullname   | String | 是   | -   || -   |
| hostname        | String | 是   | -   || -   |
| ip              | String | 是   | -   || -   |
| levelId         | Long   | 是   | -   || -   |
| startTimeDesc   | String | 是   | -   || -   |
| endTimeDesc     | String | 是   | -   || -   |

### **响应参数**

* 无

## load - /authorization_log/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## editOwner - /authorization_log/edit_owner

* 请求方式 POST -

### 接口描述

editOwner

### **请求参数**

| 参数名称    | 类型   | 必选  | 约束  | 描述  | 示例  |
|---------|------|-----|-----|-----|-----|
| fileIds | Set  | 是   | -   || -   |
| ownerId | Long | 是   | -   || -   |

### **响应参数**

* 无

## filePermission - /authorization_log/permissions

* 请求方式 GET -

### 接口描述

filePermission

### **请求参数**

| 参数名称           | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------------|--------|-----|-----|-----|-----|
| authorizeLogId | Long   | 是   | -   || -   |
| keyword        | String | 是   | -   || -   |

### **响应参数**

* 无

## organizationPermission - /authorization_log/organization/permission

* 请求方式 GET -

### 接口描述

organizationPermission

### **请求参数**

| 参数名称           | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------------|--------|-----|-----|-----|-----|
| authorizeLogId | Long   | 是   | -   || -   |
| keyword        | String | 是   | -   || -   |

### **响应参数**

* 无

# AlarmSettingController

* 包含4个接口

## list - /alarm_setting/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

* 无

### **响应参数**

* 无

## load - /alarm_setting/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## editSetting - /alarm_setting/edit

* 请求方式 POST -

### 接口描述

editSetting

### **请求参数**

| 参数名称   | 类型                                                | 必选  | 约束  | 描述  | 示例  |
|--------|---------------------------------------------------|-----|-----|-----|-----|
| id     | Long                                              | 是   | -   || -   |
| config | com.secsmart.common.dto.alarm.AbstractAlarmConfig | 是   | -   || -   |

### **响应参数**

* 无

## enable - /alarm_setting/enable

* 请求方式 POST -

### 接口描述

enable

### **请求参数**

| 参数名称    | 类型                                  | 必选  | 约束  | 描述  | 示例  |
|---------|-------------------------------------|-----|-----|-----|-----|
| id      | Long                                | 是   | -   || -   |
| enabled | Boolean                             | 是   | -   || -   |
| type    | com.secsmart.common.enums.AlarmType | 是   | -   || -   |

### **响应参数**

* 无

# BackupRestoreController

* 包含11个接口

## list - /backup_restore/history

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
| page | int | 是   | -   || -   |
| rows | int | 是   | -   || -   |

### **响应参数**

* 无

## getNextTime - /backup_restore/next_time

* 请求方式 GET -

### 接口描述

getNextTime

### **请求参数**

* 无

### **响应参数**

* 无

## backup - /backup_restore/backup

* 请求方式 GET -

### 接口描述

backup

### **请求参数**

* 无

### **响应参数**

* 无

## backupAll - /backup_restore/backup_all

* 请求方式 GET -

### 接口描述

backupAll

### **请求参数**

* 无

### **响应参数**

* 无

## loadBackupSetting - /backup_restore/setting/load

* 请求方式 GET -

### 接口描述

loadBackupSetting

### **请求参数**

* 无

### **响应参数**

* 无

## editBackupSetting - /backup_restore/setting/edit

* 请求方式 POST -

### 接口描述

editBackupSetting

### **请求参数**

| 参数名称          | 类型                                                   | 必选  | 约束  | 描述  | 示例  |
|---------------|------------------------------------------------------|-----|-----|-----|-----|
| id            | Long                                                 | 是   | -   || -   |
| triggerConfig | com.secsmart.common.dto.backup.AbstractTriggerConfig | 是   | -   || -   |

### **响应参数**

* 无

## restore - /backup_restore/restore

* 请求方式 POST -

### 接口描述

restore

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## delete - /backup_restore/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## export - /backup_restore/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## importBackupFile - /backup_restore/import

* 请求方式 POST -

### 接口描述

importBackupFile

### **请求参数**

* 无

### **响应参数**

* 无

## dataBinding - /backup_restore

* 请求方式 -

### 接口描述

dataBinding

### **请求参数**

* 无

### **响应参数**

* 无

# UpgradePackageController

* 包含6个接口

## add - /upgrade_package/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称             | 类型   | 必选  | 约束  | 描述  | 示例  |
|------------------|------|-----|-----|-----|-----|
| upgradePackageId | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /upgrade_package/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## list - /upgrade_package/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

* 无

### **响应参数**

* 无

## load - /upgrade_package/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## execute - /upgrade_package/execute

* 请求方式 POST -

### 接口描述

execute

### **请求参数**

| 参数名称           | 类型   | 必选  | 约束  | 描述  | 示例  |
|----------------|------|-----|-----|-----|-----|
| organizationId | Long | 是   | -   || -   |
| clientIds      | List | 是   | -   || -   |
| id             | Long | 是   | -   || -   |

### **响应参数**

* 无

## sync - /upgrade_package/async

* 请求方式 GET -

### 接口描述

sync

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# 加密策略

* 包含5个接口

## add - /encryption_policy/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                                             | 类型                                              | 必选  | 约束  | 描述  | 示例  |
|--------------------------------------------------|-------------------------------------------------|-----|-----|-----|-----|
| userPrivilege                                    | Set                                             | 是   | -   || -   |
| fileRightList                                    | List                                            | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long                                            | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String                                          | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Boolean                                         | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Boolean                                         | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Boolean                                         | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Boolean                                         | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Boolean                                         | 是   | -   || -   |
| faultLeaveTime                                   | Integer                                         | 是   | -   || -   |
| activeLeaveTime                                  | Integer                                         | 是   | -   || -   |
| screen                                           | Boolean                                         | 是   | -   || -   |
| screenRuleId                                     | Long                                            | 是   | -   || -   |
| uploadLog                                        | Boolean                                         | 是   | -   || -   |
| printSnapshot                                    | Boolean                                         | 是   | -   || -   |
| printer                                          | Boolean                                         | 是   | -   || -   |
| printerRuleId                                    | Long                                            | 是   | -   || -   |
| printerMonitor                                   | Boolean                                         | 是   | -   || -   |
| monType                                          | Boolean                                         | 是   | -   || -   |
| printerList                                      | List                                            | 是   | -   || -   |
| softwareGroupIds                                 | Set                                             | 是   | -   || -   |
| openLimit                                        | Integer                                         | 是   | -   || -   |
| openTime                                         | Integer                                         | 是   | -   || -   |
| outgoingReadWatermark                            | Boolean                                         | 是   | -   || -   |
| outgoingReadWatermarkSelect                      | com.secsmart.common.enums.OutgoingWatermarkType | 是   | -   || -   |
| outgoingReadWatermarkId                          | Long                                            | 是   | -   || -   |
| outgoingPrintWatermark                           | Boolean                                         | 是   | -   || -   |
| outgoingPrintWatermarkSelect                     | com.secsmart.common.enums.OutgoingWatermarkType | 是   | -   || -   |
| outgoingPrintWatermarkId                         | Long                                            | 是   | -   || -   |

### **响应参数**

* 无

## list - /encryption_policy/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称    | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------|--------|-----|-----|-----|-----|
| keyword | String | 是   | -   || -   |

### **响应参数**

* 无

## load - /encryption_policy/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /encryption_policy/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /encryption_policy/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# AlarmEventController

* 包含5个接口

## list - /alarm/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称               | 类型      | 必选  | 约束  | 描述  | 示例  |
|--------------------|---------|-----|-----|-----|-----|
| severityLevels     | List    | 是   | -   || -   |
| alarmType          | List    | 是   | -   || -   |
| discoveryStartDate | String  | 是   | -   || -   |
| discoveryEndDate   | String  | 是   | -   || -   |
| restored           | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## load - /alarm/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## sendMail - /alarm/send_mail

* 请求方式 POST -

### 接口描述

sendMail

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------------------|---------|-----|-----|-----|-----|
| id                  | Long    | 是   | -   || -   |
| subject             | String  | 是   | -   || -   |
| presetReceiver      | boolean | 是   | -   || -   |
| securityAuditor     | boolean | 是   | -   || -   |
| others              | List    | 是   | -   || -   |
| additionalReceivers | List    | 是   | -   || -   |

### **响应参数**

* 无

## recovery - /alarm/recovery

* 请求方式 POST -

### 接口描述

recovery

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| ids                    | List                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## delete - /alarm/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

# DataFiledController

* 包含7个接口

## savedInfo - /data_filed/saved_info

* 请求方式 GET -

### 接口描述

savedInfo

### **请求参数**

* 无

### **响应参数**

* 无

## savedInfo - /data_filed/history/list

* 请求方式 GET -

### 接口描述

savedInfo

### **请求参数**

* 无

### **响应参数**

* 无

## historyRename - /data_filed/history/rename

* 请求方式 POST -

### 接口描述

historyRename

### **请求参数**

| 参数名称 | 类型     | 必选  | 约束  | 描述  | 示例  |
|------|--------|-----|-----|-----|-----|
| id   | Long   | 是   | -   || -   |
| name | String | 是   | -   || -   |

### **响应参数**

* 无

## immediate - /data_filed/filed

* 请求方式 GET -

### 接口描述

immediate

### **请求参数**

* 无

### **响应参数**

* 无

## historyDelete - /data_filed/history/delete

* 请求方式 POST -

### 接口描述

historyDelete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## configLoad - /data_filed/config/load

* 请求方式 GET -

### 接口描述

configLoad

### **请求参数**

* 无

### **响应参数**

* 无

## configLoad - /data_filed/config/edit

* 请求方式 POST -

### 接口描述

configLoad

### **请求参数**

| 参数名称                            | 类型                  | 必选  | 约束  | 描述  | 示例  |
|---------------------------------|---------------------|-----|-----|-----|-----|
| delayed                         | int                 | 是   | -   || -   |
| maxCount                        | int                 | 是   | -   || -   |
| filedByCount                    | boolean             | 是   | -   || -   |
| filedBySize                     | boolean             | 是   | -   || -   |
| enabledAlarmStatusList          | boolean             | 是   | -   || -   |
| enabledAlarmBeforeDays          | boolean             | 是   | -   || -   |
| enabledLogBeforeDays            | boolean             | 是   | -   || -   |
| enabledDripEventBeforeDays      | boolean             | 是   | -   || -   |
| enabledEventAuditResultTypeList | boolean             | 是   | -   || -   |
| enabledEventStatusList          | boolean             | 是   | -   || -   |
| enabledSeverityList             | boolean             | 是   | -   || -   |
| enabledEventBeforeDays          | boolean             | 是   | -   || -   |
| timeUnit                        | FiledConfigTimeUnit | 是   | -   || -   |
| maxSize                         | int                 | 是   | -   || -   |
| sizeUnit                        | FileConfigSizeUnit  | 是   | -   || -   |
| conditionType                   | FiledConditionType  | 是   | -   || -   |
| eventBeforeDays                 | int                 | 是   | -   || -   |
| severityList                    | List                | 是   | -   || -   |
| logBeforeDays                   | int                 | 是   | -   || -   |
| alarmBeforeDays                 | int                 | 是   | -   || -   |
| alarmStatusList                 | List                | 是   | -   || -   |
| enabledFindScanDate             | boolean             | 是   | -   || -   |
| findScanDate                    | int                 | 是   | -   || -   |
| enableScanTaskStatus            | boolean             | 是   | -   || -   |

### **响应参数**

* 无

# CertificateController

* 包含3个接口

## loadCert - /cert/load

* 请求方式 GET -

### 接口描述

loadCert

### **请求参数**

* 无

### **响应参数**

* 无

## uploadCert - /cert/upload

* 请求方式 POST -

### 接口描述

uploadCert

### **请求参数**

| 参数名称     | 类型                                              | 必选  | 约束         | 描述  | 示例  |
|----------|-------------------------------------------------|-----|------------|-----|-----|
| keyStore | org.springframework.web.multipart.MultipartFile | 是   | -          || -   |
| alias    | String                                          | 是   | <br>格式：不为空 || -   |
| password | String                                          | 是   | -          || -   |
| type     | String                                          | 是   | -          || -   |

### **响应参数**

* 无

## createCert - /cert/create

* 请求方式 POST -

### 接口描述

createCert

### **请求参数**

| 参数名称                       | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------------------------|--------|-----|-----|-----|-----|
| issuedToCommonName         | String | 是   | -   || -   |
| issuedToOrganizationalUnit | String | 是   | -   || -   |
| issuedToOrganization       | String | 是   | -   || -   |
| issuedToCountry            | String | 是   | -   || -   |
| notAfter                   | Date   | 是   | -   || -   |
| password                   | String | 是   | -   || -   |
| ips                        | List   | 是   | -   || -   |
| domainNames                | List   | 是   | -   || -   |

### **响应参数**

* 无

# SoftwareController

* 包含19个接口

## add - /software/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束               | 描述  | 示例  |
|------|------------------------------------------|-----|------------------|-----|-----|
| name | String                                   | 是   | <br>格式：不为空且不全为空格 || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -                || -   |

### **响应参数**

* 无

## list - /software/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称       | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------------|------------------------------------------|-----|-----|-----|-----|
| keyword    | String                                   | 是   | -   || -   |
| ignoreCase | Boolean                                  | 是   | -   || -   |
| type       | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## edit - /software/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /software/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## all - /software/all

* 请求方式 GET -

### 接口描述

all

### **请求参数**

* 无

### **响应参数**

* 无

## addProgram - /software/program/add

* 请求方式 POST -

### 接口描述

addProgram

### **请求参数**

| 参数名称       | 类型     | 必选  | 约束               | 描述  | 示例  |
|------------|--------|-----|------------------|-----|-----|
| softwareId | Long   | 是   | -                || -   |
| name       | String | 是   | <br>格式：不为空且不全为空格 || -   |
| process    | String | 是   | -                || -   |
| include    | List   | 是   | -                || -   |
| exclude    | List   | 是   | -                || -   |

### **响应参数**

* 无

## editProgram - /software/program/edit

* 请求方式 POST -

### 接口描述

editProgram

### **请求参数**

| 参数名称            | 类型   | 必选  | 约束  | 描述  | 示例  |
|-----------------|------|-----|-----|-----|-----|
| id              | Long | 是   | -   || -   |
| forbiddenDll    | List | 是   | -   || -   |
| allowSocket     | List | 是   | -   || -   |
| forbiddenSocket | List | 是   | -   || -   |
| functionControl | List | 是   | -   || -   |
| forbiddenWindow | List | 是   | -   || -   |

### **响应参数**

* 无

## deleteProgram - /software/program/delete

* 请求方式 POST -

### 接口描述

deleteProgram

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## editProcess - /software/program/edit_process

* 请求方式 POST -

### 接口描述

editProcess

### **请求参数**

| 参数名称 | 类型     | 必选  | 约束  | 描述  | 示例  |
|------|--------|-----|-----|-----|-----|
| id   | Long   | 是   | -   || -   |
| name | String | 是   | -   || -   |

### **响应参数**

* 无

## editInclude - /software/program/include

* 请求方式 POST -

### 接口描述

editInclude

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## editExclude - /software/program/exclude

* 请求方式 POST -

### 接口描述

editExclude

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## editDll - /software/program/dll

* 请求方式 POST -

### 接口描述

editDll

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## allowSocket - /software/program/allow_socket

* 请求方式 POST -

### 接口描述

allowSocket

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | List                                     | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## forbiddenSocket - /software/program/forbidden_socket

* 请求方式 POST -

### 接口描述

forbiddenSocket

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | List                                     | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## functionControl - /software/program/debug

* 请求方式 POST -

### 接口描述

functionControl

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |
| list | Set  | 是   | -   || -   |

### **响应参数**

* 无

## forbiddenWindow - /software/program/window

* 请求方式 POST -

### 接口描述

forbiddenWindow

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## analysis - /software/analysis

* 请求方式 POST -

### 接口描述

analysis

### **请求参数**

* 无

### **响应参数**

* 无

## imports - /software/import

* 请求方式 POST -

### 接口描述

imports

### **请求参数**

| 参数名称                                                                                                                                             | 类型      | 必选  | 约束  | 描述  | 示例  |
|--------------------------------------------------------------------------------------------------------------------------------------------------|---------|-----|-----|-----|-----|
| windows                                                                                                                                          | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | Boolean | 是   | -   || -   |
| mac                                                                                                                                              | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | Boolean | 是   | -   || -   |
| linux                                                                                                                                            | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                 | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## export - /software/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

# ClientCertificateController

* 包含1个接口

## downloadCert - /dldcert

* 请求方式 POST -

### 接口描述

downloadCert

### **请求参数**

| 参数名称     | 类型                                   | 必选  | 约束  | 描述  | 示例  |
|----------|--------------------------------------|-----|-----|-----|-----|
| clientID | String                               | 是   | -   || -   |
| type     | com.secsmart.common.enums.ClientType | 是   | -   || -   |
| ip       | String                               | 是   | -   || -   |

### **响应参数**

| 参数名称              | 类型                                                       | 必选  | 描述  | 示例  |
|-------------------|----------------------------------------------------------|-----|-----|-----|
| errorCode         | int                                                      | 是   || -   |
| errorMessage      | String                                                   | 是   || -   |
| serverNode        | com.secsmart.messenger.resource.bean.ServiceRegisterBean | 是   || -   |
| certificate       | String                                                   | 是   || -   |
| serverAddress     | String                                                   | 是   || -   |
| communicationPort | int                                                      | 是   || -   |

# DocumentLevelController

* 包含6个接口

## list - /document_level/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称    | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------|--------|-----|-----|-----|-----|
| keyword | String | 是   | -   || -   |

### **响应参数**

* 无

## all - /document_level/all

* 请求方式 GET -

### 接口描述

all

### **请求参数**

* 无

### **响应参数**

* 无

## load - /document_level/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## add - /document_level/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称    | 类型      | 必选  | 约束              | 描述  | 示例  |
|---------|---------|-----|-----------------|-----|-----|
| weight  | Integer | 是   | -               || -   |
| ordinal | Integer | 是   | <br>值：最大值为`999` || -   |

### **响应参数**

* 无

## edit - /document_level/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /document_level/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# ApprovalTemplateController

* 包含8个接口

## list - /approval_template/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| keyword                | String                                   | 是   | -   || -                                                                   |
| type                   | com.secsmart.common.enums.ApprovalType   | 是   | -   || -                                                                   |
| types                  | List                                     | 是   | -   | 后端自动组装                                                              | -   |

### **响应参数**

* 无

## add - /approval_template/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                    | 类型                                     | 必选  | 约束  | 描述  | 示例  |
|-------------------------|----------------------------------------|-----|-----|-----|-----|
| type                    | com.secsmart.common.enums.ApprovalType | 是   | -   || -   |
| everyOne                | boolean                                | 是   | -   || -   |
| userIds                 | Set                                    | 是   | -   || -   |
| organizationIds         | Set                                    | 是   | -   || -   |
| notify                  | boolean                                | 是   | -   || -   |
| notifyCycle             | int                                    | 是   | -   || -   |
| timeoutPass             | boolean                                | 是   | -   || -   |
| timeoutPassPeriod       | int                                    | 是   | -   || -   |
| approvalTemplateNodeIds | List                                   | 是   | -   || -   |
| isOpenReadWatermark     | boolean                                | 是   | -   || -   |
| isOpenPrintWatermark    | boolean                                | 是   | -   || -   |
| readWatermarkId         | Long                                   | 是   | -   || -   |
| printWatermarkId        | Long                                   | 是   | -   || -   |

### **响应参数**

* 无

## load - /approval_template/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /approval_template/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /approval_template/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## add - /approval_template/node/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称               | 类型      | 必选  | 约束                | 描述  | 示例  |
|--------------------|---------|-----|-------------------|-----|-----|
| name               | String  | 是   | <br>长度：`0` ~ `50` || -   |
| jointlySign        | boolean | 是   | -                 || -   |
| manager            | boolean | 是   | -                 || -   |
| userIds            | List    | 是   | -                 || -   |
| approvalTemplateId | Long    | 是   | -                 || -   |
| step               | Integer | 是   | -                 || -   |

### **响应参数**

* 无

## approvalTemplateNodeLoad - /approval_template/node/load

* 请求方式 GET -

### 接口描述

approvalTemplateNodeLoad

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## add - /approval_template/node/edit

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# OperatorLogController

* 包含5个接口

## queryOperationLog - /operator_log/list

* 请求方式 GET -

### 接口描述

queryOperationLog

### **请求参数**

| 参数名称            | 类型                                     | 必选  | 约束  | 描述  | 示例  |
|-----------------|----------------------------------------|-----|-----|-----|-----|
| user            | String                                 | 是   | -   || -   |
| fullName        | String                                 | 是   | -   || -   |
| ip              | String                                 | 是   | -   || -   |
| deviceName      | String                                 | 是   | -   || -   |
| operatorType    | com.secsmart.common.enums.AuditLogType | 是   | -   || -   |
| operatorContent | String                                 | 是   | -   || -   |
| moduleName      | String                                 | 是   | -   || -   |
| startTimeDesc   | String                                 | 是   | -   || -   |
| endTimeDesc     | String                                 | 是   | -   || -   |

### **响应参数**

* 无

## loadOperationLogDetail - /operator_log/load

* 请求方式 GET -

### 接口描述

loadOperationLogDetail

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## addRemark - /operator_log/remark

* 请求方式 POST -

### 接口描述

addRemark

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束                  | 描述  | 示例  |
|----------|--------|-----|---------------------|-----|-----|
| recordId | Long   | 是   | -                   || -   |
| remark   | String | 是   | <br>长度：`0` ~ `1000` || -   |

### **响应参数**

* 无

## 系统日志导出 - /operator_log/export

* 请求方式 GET -

### 接口描述

系统日志导出

### **请求参数**

| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
| ids  | Set | 是   | -   || -   |

### **响应参数**

* 无

## 导出所有系统日志 - /operator_log/export_all

* 请求方式 GET -

### 接口描述

导出所有系统日志

### **请求参数**

| 参数名称            | 类型                                     | 必选  | 约束  | 描述  | 示例  |
|-----------------|----------------------------------------|-----|-----|-----|-----|
| user            | String                                 | 是   | -   || -   |
| fullName        | String                                 | 是   | -   || -   |
| ip              | String                                 | 是   | -   || -   |
| deviceName      | String                                 | 是   | -   || -   |
| operatorType    | com.secsmart.common.enums.AuditLogType | 是   | -   || -   |
| operatorContent | String                                 | 是   | -   || -   |
| moduleName      | String                                 | 是   | -   || -   |
| startTimeDesc   | String                                 | 是   | -   || -   |
| endTimeDesc     | String                                 | 是   | -   || -   |

### **响应参数**

* 无

# OpenUserController

* 包含5个接口

## add - /open_user/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束         | 描述  | 示例  |
|---------------------|---------|-----|------------|-----|-----|
| accessIpList        | List    | 是   | -          || -   |
| enabledAccessIpList | boolean | 是   | -          || -   |
| openResourceTypes   | List    | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## edit - /open_user/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## load - /open_user/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## list - /open_user/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称    | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------|--------|-----|-----|-----|-----|
| keyword | String | 是   | -   || -   |

### **响应参数**

* 无

## delete - /open_user/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# TmpController

* 包含4个接口

## pathVariable - /tmp/path/{test}/{hello}

* 请求方式 GET -

### 接口描述

pathVariable

### **请求参数**

| 参数名称  | 类型     | 必选  | 约束  | 描述  | 示例  |
|-------|--------|-----|-----|-----|-----|
| test  | String | 是   | -   || -   |
| hello | String | 是   | -   || -   |

### **响应参数**

* 无

## test - /tmp/test

* 请求方式 GET -

### 接口描述

test

### **请求参数**

* 无

### **响应参数**

* 无

## test - /tmp/test/{hello}

* 请求方式 GET -

### 接口描述

test

### **请求参数**

| 参数名称  | 类型     | 必选  | 约束  | 描述  | 示例  |
|-------|--------|-----|-----|-----|-----|
| hello | String | 是   | -   || -   |

### **响应参数**

* 无

## query - /tmp/query

* 请求方式 GET -

### 接口描述

query

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# AuthorityController

* 包含4个接口

## exportMachineCode - /authority/export_machine_code

* 请求方式 GET -

### 接口描述

exportMachineCode

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------|--------|-----|-----|-----|-----|
| clientId | String | 是   | -   || -   |

### **响应参数**

* 无

## importAuthority - /authority/import_authority

* 请求方式 POST -

### 接口描述

importAuthority

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------|--------|-----|-----|-----|-----|
| clientId | String | 是   | -   || -   |

### **响应参数**

* 无

## codeList - /authority/list

* 请求方式 GET -

### 接口描述

codeList

### **请求参数**

* 无

### **响应参数**

* 无

## updateSysTime - /authority/update_sys_time

* 请求方式 POST -

### 接口描述

updateSysTime

### **请求参数**

| 参数名称    | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------|---------|-----|-----|-----|-----|
| auto    | Boolean | 是   | -   || -   |
| dateStr | String  | 是   | -   || -   |
| timeStr | String  | 是   | -   || -   |

### **响应参数**

* 无

# CustomSettingController

* 包含9个接口

## list - /custom_setting/list

* 请求方式 POST -

### 接口描述

list

### **请求参数**

* 无

### **响应参数**

* 无

## add - /custom_setting/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称              | 类型     | 必选  | 约束                | 描述  | 示例  |
|-------------------|--------|-----|-------------------|-----|-----|
| serialVersionUID  | long   | 是   | -                 || -   |
| corporateName     | String | 是   | <br>长度：`1` ~ `50` || -   |
| outerBrandName    | String | 是   | <br>长度：`1` ~ `50` || -   |
| outerBrandImageId | Long   | 是   | -                 || -   |
| innerBrandName    | String | 是   | <br>长度：`1` ~ `50` || -   |
| innerBrandImageId | Long   | 是   | -                 || -   |
| foldImageId       | Long   | 是   | -                 || -   |
| iconId            | Long   | 是   | -                 || -   |

### **响应参数**

* 无

## edit - /custom_setting/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## downloadOuterBrandImage - /custom_setting/download_outer_brand_image

* 请求方式 GET -

### 接口描述

downloadOuterBrandImage

### **请求参数**

* 无

### **响应参数**

* 无

## downloadInnerBrandImage - /custom_setting/download_inner_brand_image

* 请求方式 GET -

### 接口描述

downloadInnerBrandImage

### **请求参数**

* 无

### **响应参数**

* 无

## load - /custom_setting/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

## downloadFoldImage - /custom_setting/download_fold_image

* 请求方式 GET -

### 接口描述

downloadFoldImage

### **请求参数**

* 无

### **响应参数**

* 无

## reset - /custom_setting/reset

* 请求方式 POST -

### 接口描述

reset

### **请求参数**

* 无

### **响应参数**

* 无

## preview - /custom_setting/preview

* 请求方式 GET -

### 接口描述

preview

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# DsmController

* 包含8个接口

## info - /dsm/info

* 请求方式 GET -

### 接口描述

info

### **请求参数**

* 无

### **响应参数**

* 无

## logo - /dsm/logo.png

* 请求方式 GET -

### 接口描述

logo

### **请求参数**

* 无

### **响应参数**

* 无

## collapsedLogo - /dsm/collapsed-logo.png

* 请求方式 GET -

### 接口描述

collapsedLogo

### **请求参数**

* 无

### **响应参数**

* 无

## loginLogo - /dsm/login-logo.png

* 请求方式 GET -

### 接口描述

loginLogo

### **请求参数**

* 无

### **响应参数**

* 无

## logonBg - /dsm/login-bg.jpg

* 请求方式 GET -

### 接口描述

logonBg

### **请求参数**

* 无

### **响应参数**

* 无

## favicon - /dsm/favicon.ico

* 请求方式 GET -

### 接口描述

favicon

### **请求参数**

* 无

### **响应参数**

* 无

## getHttpHeaders - /dsm

* 请求方式 -

### 接口描述

getHttpHeaders

### **请求参数**

* 无

### **响应参数**

* 无

## readFile - /dsm

* 请求方式 -

### 接口描述

readFile

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------|--------|-----|-----|-----|-----|
| filePath | String | 是   | -   || -   |

### **响应参数**

* 无

# 文件操作日志

* 包含6个接口

## list - /file_operate_log/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称          | 类型                                    | 必选  | 约束  | 描述  | 示例  |
|---------------|---------------------------------------|-----|-----|-----|-----|
| name          | String                                | 是   | -   || -   |
| username      | String                                | 是   | -   || -   |
| ip            | String                                | 是   | -   || -   |
| computerName  | String                                | 是   | -   || -   |
| startTimeDesc | String                                | 是   | -   || -   |
| endTimeDesc   | String                                | 是   | -   || -   |
| type          | com.secsmart.common.enums.FileLogType | 是   | -   || -   |
| levelId       | Long                                  | 是   | -   || -   |
| result        | String                                | 是   | -   || -   |
| filePath      | String                                | 是   | -   || -   |
| ignoreCase    | Boolean                               | 是   | -   || -   |

### **响应参数**

* 无

## load - /file_operate_log/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /file_operate_log/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## export - /file_operate_log/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型      | 必选  | 约束  | 描述  | 示例  |
|------|---------|-----|-----|-----|-----|
| ids  | Set     | 是   | -   || -   |
| all  | boolean | 是   | -   || -   |

### **响应参数**

* 无

## exportAll - /file_operate_log/export_all

* 请求方式 GET -

### 接口描述

exportAll

### **请求参数**

| 参数名称          | 类型                                    | 必选  | 约束  | 描述  | 示例  |
|---------------|---------------------------------------|-----|-----|-----|-----|
| name          | String                                | 是   | -   || -   |
| username      | String                                | 是   | -   || -   |
| ip            | String                                | 是   | -   || -   |
| computerName  | String                                | 是   | -   || -   |
| startTimeDesc | String                                | 是   | -   || -   |
| endTimeDesc   | String                                | 是   | -   || -   |
| type          | com.secsmart.common.enums.FileLogType | 是   | -   || -   |
| levelId       | Long                                  | 是   | -   || -   |
| result        | String                                | 是   | -   || -   |
| filePath      | String                                | 是   | -   || -   |
| ignoreCase    | Boolean                               | 是   | -   || -   |

### **响应参数**

* 无

## export - /file_operate_log

* 请求方式 -

### 接口描述

export

### **请求参数**

* 无

### **响应参数**

* 无

# OrganizationController

* 包含12个接口

## addOrganization - /organization/add

* 请求方式 POST -

### 接口描述

addOrganization

### **请求参数**

| 参数名称       | 类型     | 必选  | 约束               | 描述  | 示例  |
|------------|--------|-----|------------------|-----|-----|
| superOrgId | Long   | 是   | -                || -   |
| name       | String | 是   | <br>格式：不为空且不全为空格 || -   |

### **响应参数**

* 无

## load - /organization/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

## loadOnlyOrg - /organization/load_only_org

* 请求方式 GET -

### 接口描述

loadOnlyOrg

### **请求参数**

* 无

### **响应参数**

* 无

## loadAll - /organization/relaxed/load

* 请求方式 GET -

### 接口描述

loadAll

### **请求参数**

* 无

### **响应参数**

* 无

## editOrganization - /organization/edit

* 请求方式 POST -

### 接口描述

editOrganization

### **请求参数**

| 参数名称 | 类型     | 必选  | 约束         | 描述  | 示例  |
|------|--------|-----|------------|-----|-----|
| id   | Long   | 是   | -          || -   |
| name | String | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## deleteOrganization - /organization/delete

* 请求方式 POST -

### 接口描述

deleteOrganization

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## listManagers - /organization/load_managers

* 请求方式 GET -

### 接口描述

listManagers

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## addManager - /organization/add_managers

* 请求方式 POST -

### 接口描述

addManager

### **请求参数**

| 参数名称  | 类型     | 必选  | 约束  | 描述  | 示例  |
|-------|--------|-----|-----|-----|-----|
| email | String | 是   | -   || -   |

### **响应参数**

* 无

## deleteManager - /organization/delete_managers

* 请求方式 POST -

### 接口描述

deleteManager

### **请求参数**

| 参数名称           | 类型   | 必选  | 约束  | 描述  | 示例  |
|----------------|------|-----|-----|-----|-----|
| id             | Long | 是   | -   || -   |
| organizationId | Long | 是   | -   || -   |

### **响应参数**

* 无

## bindDocumentLevel - /organization/bind_document_level

* 请求方式 POST -

### 接口描述

bindDocumentLevel

### **请求参数**

| 参数名称 | 类型      | 必选  | 约束  | 描述  | 示例  |
|------|---------|-----|-----|-----|-----|
| all  | boolean | 是   | -   || -   |

### **响应参数**

* 无

## updateEncryptionPolicy - /organization/update_enc_policy

* 请求方式 POST -

### 接口描述

updateEncryptionPolicy

### **请求参数**

| 参数名称               | 类型   | 必选  | 约束         | 描述  | 示例  |
|--------------------|------|-----|------------|-----|-----|
| ids                | Set  | 是   | <br>格式：不为空 || -   |
| encryptionPolicyId | Long | 是   | -          || -   |

### **响应参数**

* 无

## updateOrganizeEncryptionPolicy - /organization/update_organize_enc_policy

* 请求方式 POST -

### 接口描述

updateOrganizeEncryptionPolicy

### **请求参数**

| 参数名称               | 类型      | 必选  | 约束  | 描述  | 示例  |
|--------------------|---------|-----|-----|-----|-----|
| encryptionPolicyId | Long    | 是   | -   || -   |
| organizationId     | Long    | 是   | -   || -   |
| all                | boolean | 是   | -   || -   |

### **响应参数**

* 无

# LoginLogController

* 包含5个接口

## list - /login_log/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称          | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------------|--------|-----|-----|-----|-----|
| username      | String | 是   | -   || -   |
| fullname      | String | 是   | -   || -   |
| ip            | String | 是   | -   || -   |
| deviceName    | String | 是   | -   || -   |
| operation     | String | 是   | -   || -   |
| type          | Type   | 是   | -   || -   |
| startTimeDesc | String | 是   | -   || -   |
| endTimeDesc   | String | 是   | -   || -   |

### **响应参数**

* 无

## delete - /login_log/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## save - /login_log/save

* 请求方式 POST -

### 接口描述

save

### **请求参数**

| 参数名称       | 类型     | 必选  | 约束               | 描述  | 示例  |
|------------|--------|-----|------------------|-----|-----|
| username   | String | 是   | <br>格式：不为空且不全为空格 || -   |
| fullname   | String | 是   | <br>格式：不为空且不全为空格 || -   |
| ip         | String | 是   | <br>格式：不为空且不全为空格 || -   |
| deviceName | String | 是   | <br>格式：不为空且不全为空格 || -   |
| operation  | String | 是   | <br>格式：不为空且不全为空格 || -   |
| type       | Type   | 是   | -                || -   |

### **响应参数**

* 无

## export - /login_log/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
| ids  | Set | 是   | -   || -   |

### **响应参数**

* 无

## exportAll - /login_log/export_all

* 请求方式 GET -

### 接口描述

exportAll

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束  | 描述  | 示例  |
|-----------------|--------|-----|-----|-----|-----|
| username        | String | 是   | -   || -   |
| fullname        | String | 是   | -   || -   |
| ip              | String | 是   | -   || -   |
| deviceName      | String | 是   | -   || -   |
| operation       | String | 是   | -   || -   |
| type            | Type   | 是   | -   || -   |
| startUploadDate | String | 是   | -   || -   |
| endUploadDate   | String | 是   | -   || -   |

### **响应参数**

* 无

# 全局配置

* 包含8个接口

## allowSocket - /global_config/allow_socket

* 请求方式 POST -

### 接口描述

allowSocket

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | List                                     | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## forbiddenSocket - /global_config/forbidden_socket

* 请求方式 POST -

### 接口描述

forbiddenSocket

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | List                                     | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## forbiddenWindow - /global_config/window

* 请求方式 POST -

### 接口描述

forbiddenWindow

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## dll - /global_config/dll

* 请求方式 POST -

### 接口描述

dll

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## forbiddenProcess - /global_config/forbidden_process

* 请求方式 POST -

### 接口描述

forbiddenProcess

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## allowProcess - /global_config/allow_process

* 请求方式 POST -

### 接口描述

allowProcess

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## addExclude - /global_config/exclude

* 请求方式 POST -

### 接口描述

addExclude

### **请求参数**

| 参数名称 | 类型                                       | 必选  | 约束  | 描述  | 示例  |
|------|------------------------------------------|-----|-----|-----|-----|
| id   | Long                                     | 是   | -   || -   |
| list | Set                                      | 是   | -   || -   |
| type | com.secsmart.common.enums.TerminalOsType | 是   | -   || -   |

### **响应参数**

* 无

## load - /global_config/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

# WatermarkRuleController

* 包含5个接口

## add - /watermark_rule/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称             | 类型                 | 必选  | 约束               | 描述  | 示例  |
|------------------|--------------------|-----|------------------|-----|-----|
| name             | String             | 是   | <br>格式：不为空且不全为空格 || -   |
| description      | String             | 是   | -                || -   |
| wordWatermark    | WordWatermarkTO    | 是   | -                || -   |
| pictureWatermark | PictureWatermarkTO | 是   | -                || -   |
| qrCodeWatermark  | QrCodeWatermarkTO  | 是   | -                || -   |
| hideWatermark    | HideWatermarkTO    | 是   | -                || -   |

### **响应参数**

* 无

## edit - /watermark_rule/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## list - /watermark_rule/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称       | 类型      | 必选  | 约束  | 描述  | 示例  |
|------------|---------|-----|-----|-----|-----|
| keyword    | String  | 是   | -   || -   |
| ignoreCase | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## load - /watermark_rule/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /watermark_rule/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# ApprovalMonitoringController

* 包含2个接口

## listMonitor - /approval_monitoring/list

* 请求方式 GET -

### 接口描述

listMonitor

### **请求参数**

| 参数名称          | 类型                                     | 必选  | 约束  | 描述  | 示例  |
|---------------|----------------------------------------|-----|-----|-----|-----|
| templateName  | String                                 | 是   | -   || -   |
| type          | com.secsmart.common.enums.ApprovalType | 是   | -   || -   |
| statuses      | List                                   | 是   | -   || -   |
| startTimeDesc | String                                 | 是   | -   || -   |
| endTimeDesc   | String                                 | 是   | -   || -   |
| currentNode   | String                                 | 是   | -   || -   |
| appUserName   | String                                 | 是   | -   || -   |

### **响应参数**

* 无

## load - /approval_monitoring/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

# OutgoingLogController

* 包含6个接口

## list - /outgoing_log/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称          | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------------|--------|-----|-----|-----|-----|
| username      | String | 是   | -   || -   |
| name          | String | 是   | -   || -   |
| startTimeDesc | String | 是   | -   || -   |
| endTimeDesc   | String | 是   | -   || -   |
| ip            | String | 是   | -   || -   |
| deviceName    | String | 是   | -   || -   |
| levelId       | Long   | 是   | -   || -   |
| fileInfo      | String | 是   | -   || -   |

### **响应参数**

* 无

## load - /outgoing_log/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /outgoing_log/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## download - /outgoing_log/download

* 请求方式 GET -

### 接口描述

download

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## exportAll - /outgoing_log/export

* 请求方式 GET -

### 接口描述

exportAll

### **请求参数**

| 参数名称 | 类型      | 必选  | 约束  | 描述  | 示例  |
|------|---------|-----|-----|-----|-----|
| ids  | Set     | 是   | -   || -   |
| all  | boolean | 是   | -   || -   |

### **响应参数**

* 无

## export - /outgoing_log

* 请求方式 -

### 接口描述

export

### **请求参数**

* 无

### **响应参数**

* 无

# ApprovalProcessController

* 包含14个接口

## pendingList - /approval_process/ "/pending_list

* 请求方式 GET -

### 接口描述

pendingList

### **请求参数**

| 参数名称                        | 类型                                                    | 必选  | 约束  | 描述                                                                  | 示例  |
|-----------------------------|-------------------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                          | long                                                  | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                      | Long                                                  | 是   | -   | 用户ID                                                                | -   |
| modifyPassword              | boolean                                               | 是   | -   | 是否需要修改密码                                                            | -   |
| operator                    | boolean                                               | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                      | com.secsmart.common.enums.OperatorStatus              | 是   | -   | 操作员状态                                                               | -   |
| operatorType                | com.secsmart.common.enums.OperatorType                | 是   | -   | 操作员类型                                                               | -   |
| email                       | String                                                | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername                | String                                                | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                      | String                                                | 是   | -   || -                                                                   |
| ldapHost                    | String                                                | 是   | -   || -                                                                   |
| builtin                     | boolean                                               | 是   | -   | 是否是内置操作员                                                            | -   |
| organization                | Long                                                  | 是   | -   | 部门ID                                                                | -   |
| organizations               | Set                                                   | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization            | boolean                                               | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds             | Set                                                   | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization      | boolean                                               | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds       | Set                                                   | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds                | Set                                                   | 是   | -   || -                                                                   |
| approvalProcessNodeInfoEnum | com.secsmart.common.enums.ApprovalProcessNodeInfoEnum | 是   | -   || -                                                                   |
| type                        | com.secsmart.common.enums.ApprovalType                | 是   | -   | 模板类型                                                                | -   |
| userIds                     | List                                                  | 是   | -   || -                                                                   |

### **响应参数**

* 无

## myList - /approval_process/my_list

* 请求方式 GET -

### 接口描述

myList

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| startTimeDesc          | String                                   | 是   | -   | 提交时间, 开始时间                                                          | -   |
| endTimeDesc            | String                                   | 是   | -   | 提交时间， 结束时间                                                          | -   |
| templateType           | String                                   | 是   | -   | 模板类型<br>当前仅有邮件模板                                                    | -   |
| templateName           | String                                   | 是   | -   | 模板名称                                                                | -   |
| userId                 | Long                                     | 是   | -   | 当前登录用户ID                                                            | -   |
| statuses               | List                                     | 是   | -   || -                                                                   |
| approveStatusList      | List                                     | 是   | -   | 当前状态                                                                | -   |
| appUserName            | String                                   | 是   | -   | 申请人                                                                 | -   |
| currentNode            | String                                   | 是   | -   || -                                                                   |
| type                   | com.secsmart.common.enums.ApprovalType   | 是   | -   | 模板类型                                                                | -   |

### **响应参数**

* 无

## approvedList - /approval_process/approved_list

* 请求方式 GET -

### 接口描述

approvedList

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| type                   | com.secsmart.common.enums.ApprovalType   | 是   | -   | 模板类型                                                                | -   |
| templateName           | String                                   | 是   | -   | 模板名称                                                                | -   |
| userId                 | Long                                     | 是   | -   | 当前登录用户ID                                                            | -   |
| approveStatusList      | List                                     | 是   | -   | 当前状态                                                                | -   |
| appUserName            | String                                   | 是   | -   | 申请人                                                                 | -   |
| currentNode            | String                                   | 是   | -   | 当前节点                                                                | -   |
| startTimeDesc          | String                                   | 是   | -   | 提交时间, 开始时间                                                          | -   |
| endTimeDesc            | String                                   | 是   | -   | 提交时间， 结束时间                                                          | -   |

### **响应参数**

* 无

## loadSubmit - /approval_process/load_submit

* 请求方式 GET -

### 接口描述

loadSubmit

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## loadApproving - /approval_process/load_approving

* 请求方式 GET -

### 接口描述

loadApproving

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## loadApproved - /approval_process/load_approved

* 请求方式 GET -

### 接口描述

loadApproved

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| id                     | Long                                     | 是   | -   || -                                                                   |

### **响应参数**

* 无

## launchProcess - /approval_process/submit

* 请求方式 POST -

### 接口描述

launchProcess

### **请求参数**

| 参数名称   | 类型     | 必选  | 约束         | 描述  | 示例  |
|--------|--------|-----|------------|-----|-----|
| id     | Long   | 是   | -          || -   |
| reason | String | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## agreeProcess - /approval_process/agree

* 请求方式 POST -

### 接口描述

agreeProcess

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| nodeId                 | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## rejectProcess - /approval_process/reject

* 请求方式 POST -

### 接口描述

rejectProcess

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| memo                   | String                                   | 是   | -   || -                                                                   |
| nodeId                 | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## deliverProcess - /approval_process/deliver

* 请求方式 POST -

### 接口描述

deliverProcess

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| userId                 | Long                                     | 是   | -   || -                                                                   |
| nodeId                 | Long                                     | 是   | -   || -                                                                   |
| reason                 | String                                   | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## downloadFile - /approval_process/download_file

* 请求方式 GET -

### 接口描述

downloadFile

### **请求参数**

| 参数名称    | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------|---------|-----|-----|-----|-----|
| id      | Long    | 是   | -   || -   |
| decrypt | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## export - /approval_process/download_add_time_file

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## downloadOdcFile - /approval_process/download_odc_file

* 请求方式 GET -

### 接口描述

downloadOdcFile

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## cancelProcess - /approval_process/cancel

* 请求方式 POST -

### 接口描述

cancelProcess

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | Long                                     | 是   | -   || -                                                                   |
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

# 资源管理接口

* 包含2个接口

## 获取自身的权限 - /system/resource/menu_tree

* 请求方式 GET -

### 接口描述

获取自身的权限

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## 获取所有的权限

<p>
基于三权分离原则，所有权限即为当前用户可操作的权限 - /system/resource/permission_tree
* 请求方式 GET - 
### 接口描述
获取所有的权限
<p>
基于三权分离原则，所有权限即为当前用户可操作的权限
### **请求参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|id|long|是|-|操作员或者用户ID|-|
|userId|Long|是|-|用户ID|-|
|modifyPassword|boolean|是|-|是否需要修改密码|-|
|operator|boolean|是|-|是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录）|-|
|status|com.secsmart.common.enums.OperatorStatus|是|-|操作员状态|-|
|operatorType|com.secsmart.common.enums.OperatorType|是|-|操作员类型|-|
|email|String|是|-|邮箱|-|
|ldapUsername|String|是|-|ldap 用户名|-|
|ldapDn|String|是|-||-|
|ldapHost|String|是|-||-|
|builtin|boolean|是|-|是否是内置操作员|-|
|organization|Long|是|-|部门ID|-|
|organizations|Set|是|-|所属部门及其子部门ID|-|
|rootOrganization|boolean|是|-|是否是根节点部门管理员|-|
|organizationIds|Set|是|-|管理的部门ID（包含子部门）|-|
|rootManageOrganization|boolean|是|-|是否是根部门的部门文档管理员|-|
|manageOrganizationIds|Set|是|-|文档管理管理员管理的部门ID（包含其子部门）|-|
|agentUserIds|Set|是|-||-|

### **响应参数**

* 无

# 文件打印日志

* 包含5个接口

## listPrint - /file_print_log/list

* 请求方式 GET -

### 接口描述

listPrint

### **请求参数**

| 参数名称          | 类型                                    | 必选  | 约束  | 描述  | 示例  |
|---------------|---------------------------------------|-----|-----|-----|-----|
| name          | String                                | 是   | -   || -   |
| username      | String                                | 是   | -   || -   |
| ip            | String                                | 是   | -   || -   |
| computerName  | String                                | 是   | -   || -   |
| startTimeDesc | String                                | 是   | -   || -   |
| endTimeDesc   | String                                | 是   | -   || -   |
| type          | com.secsmart.common.enums.FileLogType | 是   | -   || -   |
| levelId       | Long                                  | 是   | -   || -   |
| result        | String                                | 是   | -   || -   |
| filePath      | String                                | 是   | -   || -   |
| ignoreCase    | Boolean                               | 是   | -   || -   |

### **响应参数**

* 无

## delete - /file_print_log/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## export - /file_print_log/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型      | 必选  | 约束  | 描述  | 示例  |
|------|---------|-----|-----|-----|-----|
| ids  | Set     | 是   | -   || -   |
| all  | boolean | 是   | -   || -   |

### **响应参数**

* 无

## exportAll - /file_print_log/export_all

* 请求方式 GET -

### 接口描述

exportAll

### **请求参数**

| 参数名称          | 类型                                    | 必选  | 约束  | 描述  | 示例  |
|---------------|---------------------------------------|-----|-----|-----|-----|
| name          | String                                | 是   | -   || -   |
| username      | String                                | 是   | -   || -   |
| ip            | String                                | 是   | -   || -   |
| computerName  | String                                | 是   | -   || -   |
| startTimeDesc | String                                | 是   | -   || -   |
| endTimeDesc   | String                                | 是   | -   || -   |
| type          | com.secsmart.common.enums.FileLogType | 是   | -   || -   |
| levelId       | Long                                  | 是   | -   || -   |
| result        | String                                | 是   | -   || -   |
| filePath      | String                                | 是   | -   || -   |
| ignoreCase    | Boolean                               | 是   | -   || -   |

### **响应参数**

* 无

## export - /file_print_log

* 请求方式 -

### 接口描述

export

### **请求参数**

* 无

### **响应参数**

* 无

# DocumentController

* 包含5个接口

## mine - /document/mine

* 请求方式 GET -

### 接口描述

mine

### **请求参数**

| 参数名称                    | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|-------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| ownerId                 | Long                                     | 是   | -   || -                                                                   |
| ownerUsername           | String                                   | 是   | -   || -                                                                   |
| creatorUsername         | String                                   | 是   | -   || -                                                                   |
| creatorFullname         | String                                   | 是   | -   || -                                                                   |
| startCreateTimeDesc     | String                                   | 是   | -   || -                                                                   |
| endCreateTimeDesc       | String                                   | 是   | -   || -                                                                   |
| hostname                | String                                   | 是   | -   || -                                                                   |
| ip                      | String                                   | 是   | -   || -                                                                   |
| levelId                 | Long                                     | 是   | -   || -                                                                   |
| fileIds                 | List                                     | 是   | -   || -                                                                   |
| ownerships              | Collection                               | 是   | -   || -                                                                   |
| userDistributed         | Boolean                                  | 是   | -   || -                                                                   |
| organizationDistributed | Boolean                                  | 是   | -   || -                                                                   |
| organizationIds         | Collection                               | 是   | -   || -                                                                   |
| userId                  | Long                                     | 是   | -   || -                                                                   |
| id                      | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                  | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword          | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator                | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                  | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType            | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                   | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername            | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                  | String                                   | 是   | -   || -                                                                   |
| ldapHost                | String                                   | 是   | -   || -                                                                   |
| builtin                 | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization            | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations           | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization        | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds         | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization  | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds   | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds            | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## organization - /document/organization

* 请求方式 GET -

### 接口描述

organization

### **请求参数**

| 参数名称                    | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|-------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| ownerId                 | Long                                     | 是   | -   || -                                                                   |
| ownerUsername           | String                                   | 是   | -   || -                                                                   |
| creatorUsername         | String                                   | 是   | -   || -                                                                   |
| creatorFullname         | String                                   | 是   | -   || -                                                                   |
| startCreateTimeDesc     | String                                   | 是   | -   || -                                                                   |
| endCreateTimeDesc       | String                                   | 是   | -   || -                                                                   |
| hostname                | String                                   | 是   | -   || -                                                                   |
| ip                      | String                                   | 是   | -   || -                                                                   |
| levelId                 | Long                                     | 是   | -   || -                                                                   |
| fileIds                 | List                                     | 是   | -   || -                                                                   |
| ownerships              | Collection                               | 是   | -   || -                                                                   |
| userDistributed         | Boolean                                  | 是   | -   || -                                                                   |
| organizationDistributed | Boolean                                  | 是   | -   || -                                                                   |
| organizationIds         | Collection                               | 是   | -   || -                                                                   |
| userId                  | Long                                     | 是   | -   || -                                                                   |
| id                      | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                  | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword          | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator                | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                  | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType            | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                   | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername            | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                  | String                                   | 是   | -   || -                                                                   |
| ldapHost                | String                                   | 是   | -   || -                                                                   |
| builtin                 | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization            | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations           | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization        | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds         | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization  | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds   | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds            | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## licensable - /document/licensable

* 请求方式 GET -

### 接口描述

licensable

### **请求参数**

| 参数名称                    | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|-------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| ownerId                 | Long                                     | 是   | -   || -                                                                   |
| ownerUsername           | String                                   | 是   | -   || -                                                                   |
| creatorUsername         | String                                   | 是   | -   || -                                                                   |
| creatorFullname         | String                                   | 是   | -   || -                                                                   |
| startCreateTimeDesc     | String                                   | 是   | -   || -                                                                   |
| endCreateTimeDesc       | String                                   | 是   | -   || -                                                                   |
| hostname                | String                                   | 是   | -   || -                                                                   |
| ip                      | String                                   | 是   | -   || -                                                                   |
| levelId                 | Long                                     | 是   | -   || -                                                                   |
| fileIds                 | List                                     | 是   | -   || -                                                                   |
| ownerships              | Collection                               | 是   | -   || -                                                                   |
| userDistributed         | Boolean                                  | 是   | -   || -                                                                   |
| organizationDistributed | Boolean                                  | 是   | -   || -                                                                   |
| organizationIds         | Collection                               | 是   | -   || -                                                                   |
| userId                  | Long                                     | 是   | -   || -                                                                   |
| id                      | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                  | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword          | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator                | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                  | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType            | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                   | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername            | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                  | String                                   | 是   | -   || -                                                                   |
| ldapHost                | String                                   | 是   | -   || -                                                                   |
| builtin                 | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization            | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations           | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization        | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds         | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization  | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds   | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds            | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## edit - /document/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称                                             | 类型      | 必选  | 约束  | 描述  | 示例  |
|--------------------------------------------------|---------|-----|-----|-----|-----|
| id                                               | Long    | 是   | -   || -   |
| filePermissions                                  | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Integer | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Integer | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| organizationFilePermission                       | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Integer | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Integer | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |

### **响应参数**

* 无

## load - /document/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# TimeConfigController

* 包含2个接口

## currentTime - /time/current

* 请求方式 GET -

### 接口描述

currentTime

### **请求参数**

* 无

### **响应参数**

* 无

## edit - /time/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称     | 类型                                    | 必选  | 约束  | 描述  | 示例  |
|----------|---------------------------------------|-----|-----|-----|-----|
| timeZone | com.secsmart.common.enums.GmtTimeZone | 是   | -   || -   |
| mode     | com.secsmart.common.enums.GetTimeMode | 是   | -   || -   |
| ip       | String                                | 是   | -   || -   |
| time     | String                                | 是   | -   || -   |

### **响应参数**

* 无

# PreSignLoginController

* 包含1个接口

## preSignLogin - /pre_sign_login/terminal

* 请求方式 GET -

### 接口描述

preSignLogin

### **请求参数**

| 参数名称         | 类型     | 必选  | 约束  | 描述  | 示例  |
|--------------|--------|-----|-----|-----|-----|
| username     | String | 是   | -   || -   |
| preSignToken | String | 是   | -   || -   |
| timestamp    | String | 是   | -   || -   |
| type         | String | 是   | -   || -   |
| id           | String | 是   | -   || -   |
| sign         | String | 是   | -   || -   |

### **响应参数**

* 无

# MailCenterController

* 包含4个接口

## loadMailConfig - /mail_center/load

* 请求方式 GET -

### 接口描述

loadMailConfig

### **请求参数**

* 无

### **响应参数**

* 无

## editMailConfig - /mail_center/edit

* 请求方式 POST -

### 接口描述

editMailConfig

### **请求参数**

| 参数名称       | 类型      | 必选  | 约束               | 描述  | 示例  |
|------------|---------|-----|------------------|-----|-----|
| id         | Long    | 是   | -                || -   |
| host       | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| port       | Integer | 是   | -                || -   |
| useSSL     | boolean | 是   | -                || -   |
| username   | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| password   | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| senderName | String  | 是   | -                || -   |

### **响应参数**

* 无

## testSend - /mail_center/test

* 请求方式 POST -

### 接口描述

testSend

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束               | 描述  | 示例  |
|----------|--------|-----|------------------|-----|-----|
| subject  | String | 是   | -                || -   |
| receiver | String | 是   | <br>格式：不为空且不全为空格 || -   |
| content  | String | 是   | -                || -   |

### **响应参数**

* 无

## onMailConfigModificationEvent - /mail_center

* 请求方式 -

### 接口描述

onMailConfigModificationEvent

### **请求参数**

* 无

### **响应参数**

* 无

# SystemController

* 包含3个接口

## restart - /system/restart

* 请求方式 .GET, .POST -

### 接口描述

restart

### **请求参数**

* 无

### **响应参数**

* 无

## license - /system/license

* 请求方式 GET -

### 接口描述

license

### **请求参数**

* 无

### **响应参数**

* 无

## setApplicationContext -

* 请求方式 -

### 接口描述

setApplicationContext

### **请求参数**

* 无

### **响应参数**

* 无

# SyslogConfigController

* 包含2个接口

## edit - /syslog_config/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称         | 类型                                         | 必选  | 约束  | 描述  | 示例  |
|--------------|--------------------------------------------|-----|-----|-----|-----|
| enable       | boolean                                    | 是   | -   || -   |
| ip           | String                                     | 是   | -   || -   |
| protocolType | com.secsmart.common.enums.ProtocolType     | 是   | -   || -   |
| port         | String                                     | 是   | -   || -   |
| reportType   | com.secsmart.common.enums.SyslogReportType | 是   | -   || -   |
| interval     | int                                        | 是   | -   || -   |
| runLog       | boolean                                    | 是   | -   || -   |
| deviceStatus | boolean                                    | 是   | -   || -   |
| systemAlarm  | boolean                                    | 是   | -   || -   |

### **响应参数**

* 无

## load - /syslog_config/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

# ServerInfoController

* 包含1个接口

## loadServerInfo - /server/info

* 请求方式 GET -

### 接口描述

loadServerInfo

### **请求参数**

* 无

### **响应参数**

* 无

# InstallController

* 包含2个接口

## download - /install/download

* 请求方式 GET -

### 接口描述

download

### **请求参数**

* 无

### **响应参数**

* 无

## list - /install/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

* 无

### **响应参数**

* 无

# DataCenterController

* 包含2个接口

## edit - /data_center/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称                                       | 类型            | 必选  | 约束  | 描述  | 示例  |
|--------------------------------------------|---------------|-----|-----|-----|-----|
| snmpConfig                                 | SnmpConfigDTO | 是   | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| com.secsmart.common.enums.SnmpVersion      | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| int                                        | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
| syslogConfig                               | SyslogDTO     | 是   | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| com.secsmart.common.enums.ProtocolType     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| com.secsmart.common.enums.SyslogReportType | 是             | -   || -   |
|| int                                        | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| boolean                                    | 是             | -   || -   |
| ssoConfig                                  | SsoConfigDTO  | 是   | -   || -   |
|| boolean                                    | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |
|| String                                     | 是             | -   || -   |

### **响应参数**

* 无

## load - /data_center/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

# RoleController

* 包含9个接口

## list - /system/role/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称          | 类型                                     | 必选  | 约束  | 描述  | 示例  |
|---------------|----------------------------------------|-----|-----|-----|-----|
| operatorType  | com.secsmart.common.enums.OperatorType | 是   | -   || -   |
| types         | List                                   | 是   | -   || -   |
| name          | String                                 | 是   | -   || -   |
| startTimeDesc | String                                 | 是   | -   || -   |
| endTimeDesc   | String                                 | 是   | -   || -   |
| creator       | String                                 | 是   | -   || -   |

### **响应参数**

* 无

## add - /system/role/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称        | 类型                                 | 必选  | 约束         | 描述  | 示例  |
|-------------|------------------------------------|-----|------------|-----|-----|
| resourceIds | List                               | 是   | <br>格式：不为空 || -   |
| type        | com.secsmart.common.enums.RoleType | 是   | -          || -   |

### **响应参数**

* 无

## load - /system/role/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /system/role/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /system/role/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## datapermissionEdit - /system/role/data_permission/edit

* 请求方式 POST -

### 接口描述

datapermissionEdit

### **请求参数**

| 参数名称          | 类型      | 必选  | 约束  | 描述       | 示例  |
|---------------|---------|-----|-----|----------|-----|
| id            | long    | 是   | -   || -        |
| orgApprove    | boolean | 是   | -   | 是否开启部门审核 | -   |
| allowDownLoad | boolean | 是   | -   | 是否允许下载   | -   |

### **响应参数**

* 无

## dataPermissionList - /system/role/data_permission/list

* 请求方式 GET -

### 接口描述

dataPermissionList

### **请求参数**

* 无

### **响应参数**

* 无

## dataPermissionDetail - /system/role/data_permission/detail

* 请求方式 GET -

### 接口描述

dataPermissionDetail

### **请求参数**

* 无

### **响应参数**

* 无

## dataPermissionLoad - /system/role/data_permission/load

* 请求方式 GET -

### 接口描述

dataPermissionLoad

### **请求参数**

* 无

### **响应参数**

* 无

# TerminalVersionController

* 包含6个接口

## add - /terminal_version/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称           | 类型                                       | 必选  | 约束               | 描述  | 示例  |
|----------------|------------------------------------------|-----|------------------|-----|-----|
| fileId         | Long                                     | 是   | -                || -   |
| serverIp       | String                                   | 是   | <br>格式：不为空且不全为空格 || -   |
| serverPort     | Integer                                  | 是   | -                || -   |
| terminalOsType | com.secsmart.common.enums.TerminalOsType | 是   | -                || -   |
| clientType     | com.secsmart.common.enums.ClientType     | 是   | -                || -   |

### **响应参数**

* 无

## add - /terminal_version/edit

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称        | 类型      | 必选  | 约束               | 描述  | 示例  |
|-------------|---------|-----|------------------|-----|-----|
| id          | Long    | 是   | -                || -   |
| name        | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| description | String  | 是   | -                || -   |
| serverIp    | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| serverPort  | Integer | 是   | -                || -   |

### **响应参数**

* 无

## load - /terminal_version/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## list - /terminal_version/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称    | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------|--------|-----|-----|-----|-----|
| keyword | String | 是   | -   || -   |

### **响应参数**

* 无

## delete - /terminal_version/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## setDefault - /terminal_version/default

* 请求方式 POST -

### 接口描述

setDefault

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# FileController

* 包含3个接口

## 通用文件上传接口，根据type区分上传用途，比如是上传证书，上传策略，上传其他等等 {@link MultipartFile#getOriginalFilename()}获取文件名称（含后缀名） - /file/upload

* 请求方式 POST -

### 接口描述

通用文件上传接口，根据type区分上传用途，比如是上传证书，上传策略，上传其他等等 {@link MultipartFile#getOriginalFilename()
}获取文件名称（含后缀名）

### **请求参数**

| 参数名称        | 类型     | 必选  | 约束  | 描述  | 示例  |
|-------------|--------|-----|-----|-----|-----|
| description | String | 是   | -   || -   |
| id          | Long   | 是   | -   || -   |

### **响应参数**

* 无

## 下载文件 - /file/download

* 请求方式 GET -

### 接口描述

下载文件

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## image - /file/image

* 请求方式 GET -

### 接口描述

image

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# 高可用相关接口

* 包含1个接口

## HA模式下判断当前主机是否是master - /ha/is_master

* 请求方式 POST -

### 接口描述

HA模式下判断当前主机是否是master

### **请求参数**

| 参数名称   | 类型     | 必选  | 约束  | 描述  | 示例  |
|--------|--------|-----|-----|-----|-----|
| params | String | 是   | -   || -   |

### **响应参数**

* 无

# UpgradeRecordController

* 包含3个接口

## list - /upgrade_record/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称    | 类型     | 必选  | 约束  | 描述  | 示例  |
|---------|--------|-----|-----|-----|-----|
| keyword | String | 是   | -   || -   |

### **响应参数**

* 无

## detailList - /upgrade_record/detail/list

* 请求方式 GET -

### 接口描述

detailList

### **请求参数**

| 参数名称             | 类型     | 必选  | 约束  | 描述  | 示例  |
|------------------|--------|-----|-----|-----|-----|
| id               | Long   | 是   | -   || -   |
| ip               | String | 是   | -   || -   |
| organizationName | String | 是   | -   || -   |
| fullname         | String | 是   | -   || -   |
| username         | String | 是   | -   || -   |
| status           | String | 是   | -   || -   |

### **响应参数**

* 无

## detailDelete - /upgrade_record/detail/delete

* 请求方式 POST -

### 接口描述

detailDelete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

# DocumentManagerController

* 包含3个接口

## addManager - /document/manager/add

* 请求方式 POST -

### 接口描述

addManager

### **请求参数**

| 参数名称    | 类型   | 必选  | 约束         | 描述  | 示例  |
|---------|------|-----|------------|-----|-----|
| id      | Long | 是   | -          || -   |
| bindIds | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## listManager - /document/manager/list

* 请求方式 GET -

### 接口描述

listManager

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束  | 描述  | 示例  |
|-----------------|--------|-----|-----|-----|-----|
| organizationId  | Long   | 是   | -   || -   |
| keyword         | String | 是   | -   || -   |
| organizationIds | Set    | 是   | -   || -   |

### **响应参数**

* 无

## deleteManager - /document/manager/delete

* 请求方式 POST -

### 接口描述

deleteManager

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# 软件组

* 包含5个接口

## add - /software_group/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称        | 类型     | 必选  | 约束                 | 描述  | 示例  |
|-------------|--------|-----|--------------------|-----|-----|
| name        | String | 是   | <br>长度：`0` ~ `50`  || -   |
| description | String | 是   | <br>长度：`0` ~ `500` || -   |
| softwareIds | Set    | 是   | <br>格式：不为空         || -   |

### **响应参数**

* 无

## list - /software_group/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称          | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------------|---------|-----|-----|-----|-----|
| name          | String  | 是   | -   || -   |
| startTimeDesc | String  | 是   | -   || -   |
| endTimeDesc   | String  | 是   | -   || -   |
| creator       | String  | 是   | -   || -   |
| ignoreCase    | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## load - /software_group/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /software_group/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /software_group/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# TerminalController

* 包含7个接口

## load - /terminal/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /terminal/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## uninstall - /terminal/uninstall

* 请求方式 POST -

### 接口描述

uninstall

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## bindUser - /terminal/bind_user

* 请求方式 POST -

### 接口描述

bindUser

### **请求参数**

| 参数名称   | 类型   | 必选  | 约束  | 描述  | 示例  |
|--------|------|-----|-----|-----|-----|
| id     | Long | 是   | -   || -   |
| bindId | Long | 是   | -   || -   |

### **响应参数**

* 无

## loginType - /terminal/login_type

* 请求方式 POST -

### 接口描述

loginType

### **请求参数**

| 参数名称      | 类型                                  | 必选  | 约束  | 描述  | 示例  |
|-----------|-------------------------------------|-----|-----|-----|-----|
| loginType | com.secsmart.common.enums.LoginType | 是   | -   || -   |

### **响应参数**

* 无

## encryptList - /terminal/encrypt/list

* 请求方式 GET -

### 接口描述

encryptList

### **请求参数**

| 参数名称                | 类型                                       | 必选  | 约束  | 描述            | 示例  |
|---------------------|------------------------------------------|-----|-----|---------------|-----|
| osType              | com.secsmart.common.enums.TerminalOsType | 是   | -   || -             |
| terminalVersion     | String                                   | 是   | -   || -             |
| userFullname        | String                                   | 是   | -   || -             |
| organizationId      | Long                                     | 是   | -   || -             |
| organizationIds     | Collection                               | 是   | -   || -             |
| clientType          | com.secsmart.common.enums.ClientType     | 是   | -   || -             |
| state               | com.secsmart.common.enums.TerminalState  | 是   | -   | 以下条件从缓存进行匹配搜索 | -   |
| online              | Long                                     | 是   | -   || -             |
| offline             | Long                                     | 是   | -   || -             |
| ip                  | String                                   | 是   | -   || -             |
| mac                 | String                                   | 是   | -   || -             |
| startUpdateTimeDesc | String                                   | 是   | -   || -             |
| endUpdateTimeDesc   | String                                   | 是   | -   || -             |
| uninstall           | boolean                                  | 是   | -   || -             |
| currentTime         | Long                                     | 是   | -   || -             |

### **响应参数**

* 无

## encryptionPolicy - /terminal/bind/policy

* 请求方式 POST -

### 接口描述

encryptionPolicy

### **请求参数**

| 参数名称   | 类型   | 必选  | 约束  | 描述  | 示例  |
|--------|------|-----|-----|-----|-----|
| bindId | Long | 是   | -   || -   |
| ids    | List | 是   | -   || -   |

### **响应参数**

* 无

# HomeController

* 包含12个接口

## decryptTodayCount - /home/decryptTodayCount

* 请求方式 GET -

### 接口描述

decryptTodayCount

### **请求参数**

* 无

### **响应参数**

* 无

## authorizeCount - /home/authorizeCount

* 请求方式 GET -

### 接口描述

authorizeCount

### **请求参数**

* 无

### **响应参数**

* 无

## authorizeTodayCount - /home/authorizeTodayCount

* 请求方式 GET -

### 接口描述

authorizeTodayCount

### **请求参数**

* 无

### **响应参数**

* 无

## authorizeFileCount - /home/encryptionFileCount

* 请求方式 GET -

### 接口描述

authorizeFileCount

### **请求参数**

| 参数名称           | 类型   | 必选  | 约束  | 描述  | 示例  |
|----------------|------|-----|-----|-----|-----|
| userId         | Long | 是   | -   || -   |
| organizationId | Long | 是   | -   || -   |

### **响应参数**

* 无

## decryptTop - /home/decryptTop

* 请求方式 GET -

### 接口描述

decryptTop

### **请求参数**

* 无

### **响应参数**

* 无

## printTop - /home/printTop

* 请求方式 GET -

### 接口描述

printTop

### **请求参数**

* 无

### **响应参数**

* 无

## encryptionIncrease - /home/encryption_increase

* 请求方式 GET -

### 接口描述

encryptionIncrease

### **请求参数**

* 无

### **响应参数**

* 无

## encryptionCount - /home/encryption_count

* 请求方式 GET -

### 接口描述

encryptionCount

### **请求参数**

* 无

### **响应参数**

* 无

## online - /home/online

* 请求方式 GET -

### 接口描述

online

### **请求参数**

* 无

### **响应参数**

* 无

## clientLogin - /home/client_login

* 请求方式 GET -

### 接口描述

clientLogin

### **请求参数**

* 无

### **响应参数**

* 无

## approvalTemplate - /home/approval_template

* 请求方式 GET -

### 接口描述

approvalTemplate

### **请求参数**

* 无

### **响应参数**

* 无

## outgoing - /home/outgoing

* 请求方式 GET -

### 接口描述

outgoing

### **请求参数**

* 无

### **响应参数**

* 无

# ApiController

* 包含2个接口

## init - /api/init

* 请求方式 POST -

### 接口描述

init

### **请求参数**

* 无

### **响应参数**

* 无

## ldapSync - /api/ldap_sync/{name}

* 请求方式 POST -

### 接口描述

ldapSync

### **请求参数**

| 参数名称 | 类型     | 必选  | 约束  | 描述  | 示例  |
|------|--------|-----|-----|-----|-----|
| name | String | 是   | -   || -   |

### **响应参数**

* 无

# OrganizationDataSourceController

* 包含14个接口

## list - /organization/data_source/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

* 无

### **响应参数**

* 无

## load - /organization/data_source/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## syncRecord - /organization/data_source/sync_record

* 请求方式 GET -

### 接口描述

syncRecord

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## add - /organization/data_source/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                  | 类型                                                         | 必选  | 约束  | 描述  | 示例  |
|-----------------------|------------------------------------------------------------|-----|-----|-----|-----|
| dataSourceName        | String                                                     | 是   | -   || -   |
| dataSourceDescription | String                                                     | 是   | -   || -   |
| importType            | com.secsmart.common.enums.DataSourceImportType             | 是   | -   || -   |
| configInfo            | com.secsmart.common.dto.organization.AbstractOrgDataSource | 是   | -   || -   |

### **响应参数**

* 无

## connectTest - /organization/data_source/connect_test

* 请求方式 POST -

### 接口描述

connectTest

### **请求参数**

| 参数名称                  | 类型                                                         | 必选  | 约束  | 描述  | 示例  |
|-----------------------|------------------------------------------------------------|-----|-----|-----|-----|
| id                    | long                                                       | 是   | -   || -   |
| dataSourceName        | String                                                     | 是   | -   || -   |
| dataSourceDescription | String                                                     | 是   | -   || -   |
| importType            | com.secsmart.common.enums.DataSourceImportType             | 是   | -   || -   |
| configInfo            | com.secsmart.common.dto.organization.ADFormatOrgDataSource | 是   | -   || -   |

### **响应参数**

* 无

## add - /organization/data_source/edit

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## add - /organization/data_source/delete

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## downloadTemplate - /organization/data_source/template/download

* 请求方式 GET -

### 接口描述

downloadTemplate

### **请求参数**

* 无

### **响应参数**

* 无

## importData - /organization/data_source/import

* 请求方式 GET -

### 接口描述

importData

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## downloadManagersTemplate - /organization/data_source/template/download_managers

* 请求方式 GET -

### 接口描述

downloadManagersTemplate

### **请求参数**

* 无

### **响应参数**

* 无

## importManagers - /organization/data_source/import_managers

* 请求方式 POST -

### 接口描述

importManagers

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## importOver - /organization/data_source/import_over

* 请求方式 GET -

### 接口描述

importOver

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## editCron - /organization/data_source/cron/edit

* 请求方式 POST -

### 接口描述

editCron

### **请求参数**

| 参数名称   | 类型                                                | 必选  | 约束  | 描述  | 示例  |
|--------|---------------------------------------------------|-----|-----|-----|-----|
| id     | Long                                              | 是   | -   || -   |
| enable | boolean                                           | 是   | -   || -   |
| cycle  | com.secsmart.common.enums.DataSourceCronCycleType | 是   | -   || -   |
| weeks  | List                                              | 是   | -   || -   |
| hour   | int                                               | 是   | -   || -   |
| minute | int                                               | 是   | -   || -   |

### **响应参数**

* 无

## loadCron - /organization/data_source/cron/load

* 请求方式 GET -

### 接口描述

loadCron

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

# DataDictionaryController

* 包含3个接口

## load - /data_dictionary/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型     | 必选  | 约束  | 描述  | 示例  |
|------|--------|-----|-----|-----|-----|
| name | String | 是   | -   || -   |

### **响应参数**

* 无

## all - /data_dictionary/all

* 请求方式 GET -

### 接口描述

all

### **请求参数**

* 无

### **响应参数**

* 无

## types - /data_dictionary/types

* 请求方式 GET -

### 接口描述

types

### **请求参数**

* 无

### **响应参数**

* 无

# OperatorController

* 包含12个接口

## accessDenied - /system/operator/access_denied

* 请求方式 GET -

### 接口描述

accessDenied

### **请求参数**

* 无

### **响应参数**

* 无

## logoutSuccess - /system/operator/logout_success

* 请求方式 GET -

### 接口描述

logoutSuccess

### **请求参数**

| 参数名称     | 类型     | 必选  | 约束  | 描述  | 示例  |
|----------|--------|-----|-----|-----|-----|
| username | String | 是   | -   || -   |

### **响应参数**

* 无

## add - /system/operator/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                                             | 类型                                       | 必选            | 约束                | 描述                                                                  | 示例  |
|--------------------------------------------------|------------------------------------------|---------------|-------------------|---------------------------------------------------------------------|-----|
| id                                               | long                                     | 是             | -                 | 操作员或者用户ID                                                           | -   |
| userId                                           | Long                                     | 是             | -                 | 用户ID                                                                | -   |
| modifyPassword                                   | boolean                                  | 是             | -                 | 是否需要修改密码                                                            | -   |
| operator                                         | boolean                                  | 是             | -                 | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                                           | com.secsmart.common.enums.OperatorStatus | 是             | -                 | 操作员状态                                                               | -   |
| operatorType                                     | com.secsmart.common.enums.OperatorType   | 是             | -                 | 操作员类型                                                               | -   |
| email                                            | String                                   | 是             | -                 | 邮箱                                                                  | -   |
| ldapUsername                                     | String                                   | 是             | -                 | ldap 用户名                                                            | -   |
| ldapDn                                           | String                                   | 是             | -                 || -                                                                   |
| ldapHost                                         | String                                   | 是             | -                 || -                                                                   |
| builtin                                          | boolean                                  | 是             | -                 | 是否是内置操作员                                                            | -   |
| organization                                     | Long                                     | 是             | -                 | 部门ID                                                                | -   |
| organizations                                    | Set                                      | 是             | -                 | 所属部门及其子部门ID                                                         | -   |
| rootOrganization                                 | boolean                                  | 是             | -                 | 是否是根节点部门管理员                                                         | -   |
| organizationIds                                  | Set                                      | 是             | -                 | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization                           | boolean                                  | 是             | -                 | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds                            | Set                                      | 是             | -                 | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds                                     | Set                                      | 是             | -                 || -                                                                   |
| randomPassword                                   | boolean                                  | 是             | -                 || -                                                                   |
| password                                         | String                                   | 是             | <br>长度：`6` ~ `30` || -                                                                   |
| roles                                            | List                                     | 是             | <br>格式：不为空        || -                                                                   |
| modifyPassword                                   | boolean                                  | 是             | -                 || -                                                                   |
| operatorInfos                                    | List                                     | 是             | <br>格式：不为空        || -                                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String                                   | 是             | <br>格式：不为空        || -                                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String                                   | 是             | <br>格式：不为空        || -                                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | boolean                                  | 是             | -                 || -                                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long                                     | 是             | -                 || -                                                                   |
| loginControlTO                                   | LoginControlTO                           | 是             | -                 || -                                                                   |
|| int                                              | 是                                        | <br>值：最小值为`1` || -                 |
|| List                                             | 是                                        | -             || -                 |
|| boolean                                          | 是                                        | -             || -                 |
|| String                                           | 是                                        | -             || -                 |
|| String                                           | 是                                        | -             || -                 |
|| boolean                                          | 是                                        | -             || -                 |
|| List                                             | 是                                        | -             || -                 |
| organizationIds                                  | Set                                      | 是             | <br>格式：不为空        || -                                                                   |

### **响应参数**

* 无

## changePassword - /system/operator/change_password

* 请求方式 POST -

### 接口描述

changePassword

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束                | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-------------------|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -                 | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -                 | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -                 | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -                 | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -                 | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -                 | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -                 | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -                 | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -                 || -                                                                   |
| ldapHost               | String                                   | 是   | -                 || -                                                                   |
| builtin                | boolean                                  | 是   | -                 | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -                 | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -                 | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -                 | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -                 | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -                 | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -                 | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -                 || -                                                                   |
| id                     | Long                                     | 是   | -                 || -                                                                   |
| oldPassword            | String                                   | 是   | <br>长度：`6` ~ `30` || -                                                                   |
| newPassword            | String                                   | 是   | <br>长度：`6` ~ `30` || -                                                                   |
| confirmNewPassword     | String                                   | 是   | <br>长度：`6` ~ `30` || -                                                                   |

### **响应参数**

* 无

## changePasswordByManager - /system/operator/change_password_by_manager

* 请求方式 POST -

### 接口描述

changePasswordByManager

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## loginUnlock - /system/operator/login_unlock

* 请求方式 POST -

### 接口描述

loginUnlock

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## changePassword - /system/operator/change_email

* 请求方式 POST -

### 接口描述

changePassword

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| id                     | Long                                     | 是   | -   || -                                                                   |
| email                  | String                                   | 是   | -   || -                                                                   |

### **响应参数**

* 无

## operatorList - /system/operator/list

* 请求方式 GET -

### 接口描述

operatorList

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |
| username               | String                                   | 是   | -   | 按照username模糊查询，且忽略大小写                                               | -   |
| parentName             | String                                   | 是   | -   || -                                                                   |
| type                   | com.secsmart.common.enums.OperatorType   | 是   | -   || -                                                                   |

### **响应参数**

* 无

## operatorList - /system/operator/load

* 请求方式 GET -

### 接口描述

operatorList

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /system/operator/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称            | 类型             | 必选            | 约束                         | 描述  | 示例  |
|-----------------|----------------|---------------|----------------------------|-----|-----|
| id              | Long           | 是             | -                          || -   |
| roles           | List           | 是             | <br>格式：不为空                 || -   |
| email           | String         | 是             | <br>格式：不为空                 || -   |
| loginControl    | LoginControlTO | 是             | -                          || -   |
|| int             | 是              | <br>值：最小值为`1` | 最大失败次数                     | -   |
|| List            | 是              | -             | 限制登录时间<br><p><br>星期一 ～ 星期天 | -   |
|| boolean         | 是              | -             | 是否限制登录时间                   | -   |
|| String          | 是              | -             | 限制登录起始时间                   | -   |
|| String          | 是              | -             | 限制登录结束时间                   | -   |
|| boolean         | 是              | -             | 是否限制登录IP                   | -   |
|| List            | 是              | -             | 限制登录IP地址                   | -   |
| organizationIds | Set            | 是             | <br>格式：不为空                 || -   |

### **响应参数**

* 无

## delete - /system/operator/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## getVerifyCode - /system/operator/get_verify_code

* 请求方式 GET -

### 接口描述

getVerifyCode

### **请求参数**

* 无

### **响应参数**

* 无

# ServiceRegisterController

* 包含2个接口

## list - /service_register/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称       | 类型     | 必选  | 约束  | 描述  | 示例  |
|------------|--------|-----|-----|-----|-----|
| keyword    | String | 是   | -   || -   |
| updateTime | Long   | 是   | -   || -   |

### **响应参数**

* 无

## edit - /service_register/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称             | 类型      | 必选  | 约束                | 描述  | 示例  |
|------------------|---------|-----|-------------------|-----|-----|
| id               | Long    | 是   | -                 || -   |
| privateProxyHost | String  | 是   | <br>格式：不为空且不全为空格  || -   |
| privateProxyPort | Integer | 是   | <br>值：最大值为`65535` || -   |
| publicProxyHost  | String  | 是   | <br>格式：不为空且不全为空格  || -   |
| publicProxyPort  | Integer | 是   | <br>值：最大值为`65535` || -   |

### **响应参数**

* 无

# LogoutController

* 包含1个接口

## logout - /logout/success

* 请求方式 POST -

### 接口描述

logout

### **请求参数**

* 无

### **响应参数**

* 无

# LoginController

* 包含2个接口

## success - /login/success

* 请求方式 POST -

### 接口描述

success

### **请求参数**

| 参数名称                   | 类型                                       | 必选  | 约束  | 描述                                                                  | 示例  |
|------------------------|------------------------------------------|-----|-----|---------------------------------------------------------------------|-----|
| id                     | long                                     | 是   | -   | 操作员或者用户ID                                                           | -   |
| userId                 | Long                                     | 是   | -   | 用户ID                                                                | -   |
| modifyPassword         | boolean                                  | 是   | -   | 是否需要修改密码                                                            | -   |
| operator               | boolean                                  | 是   | -   | 是否是操作员登录<br><code>true</code> 操作员，<code>false</code> 普通用户（组织架构用户登录） | -   |
| status                 | com.secsmart.common.enums.OperatorStatus | 是   | -   | 操作员状态                                                               | -   |
| operatorType           | com.secsmart.common.enums.OperatorType   | 是   | -   | 操作员类型                                                               | -   |
| email                  | String                                   | 是   | -   | 邮箱                                                                  | -   |
| ldapUsername           | String                                   | 是   | -   | ldap 用户名                                                            | -   |
| ldapDn                 | String                                   | 是   | -   || -                                                                   |
| ldapHost               | String                                   | 是   | -   || -                                                                   |
| builtin                | boolean                                  | 是   | -   | 是否是内置操作员                                                            | -   |
| organization           | Long                                     | 是   | -   | 部门ID                                                                | -   |
| organizations          | Set                                      | 是   | -   | 所属部门及其子部门ID                                                         | -   |
| rootOrganization       | boolean                                  | 是   | -   | 是否是根节点部门管理员                                                         | -   |
| organizationIds        | Set                                      | 是   | -   | 管理的部门ID（包含子部门）                                                      | -   |
| rootManageOrganization | boolean                                  | 是   | -   | 是否是根部门的部门文档管理员                                                      | -   |
| manageOrganizationIds  | Set                                      | 是   | -   | 文档管理管理员管理的部门ID（包含其子部门）                                              | -   |
| agentUserIds           | Set                                      | 是   | -   || -                                                                   |

### **响应参数**

* 无

## failed - /login/failed

* 请求方式 POST -

### 接口描述

failed

### **请求参数**

* 无

### **响应参数**

* 无

# CustomAddresseeController

* 包含7个接口

## listAll - /custom_addressee/list

* 请求方式 GET -

### 接口描述

listAll

### **请求参数**

* 无

### **响应参数**

* 无

## load - /custom_addressee/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## add - /custom_addressee/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束               | 描述  | 示例  |
|---------------------|---------|-----|------------------|-----|-----|
| recipientName       | String  | 是   | <br>格式：不为空且不全为空格 || -   |
| recipientAddress    | String  | 是   | <br>格式：邮箱        || -   |
| mailingListIncluded | boolean | 是   | -                || -   |

### **响应参数**

* 无

## edit - /custom_addressee/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /custom_addressee/display

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------------------|---------|-----|-----|-----|-----|
| id                  | Long    | 是   | -   || -   |
| mailingListIncluded | boolean | 是   | -   || -   |

### **响应参数**

* 无

## delete - /custom_addressee/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## listAll - /custom_addressee/all

* 请求方式 GET -

### 接口描述

listAll

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------------------|---------|-----|-----|-----|-----|
| mailingListIncluded | Boolean | 是   | -   || -   |

### **响应参数**

* 无

# SecuritySettingController

* 包含2个接口

## edit - /security_setting/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称                  | 类型                                 | 必选  | 约束  | 描述  | 示例  |
|-----------------------|------------------------------------|-----|-----|-----|-----|
| id                    | Long                               | 是   | -   || -   |
| httpMode              | com.secsmart.common.enums.HttpType | 是   | -   || -   |
| enableCode            | Boolean                            | 是   | -   || -   |
| timeoutMinute         | Integer                            | 是   | -   || -   |
| enableRegisterSetting | Boolean                            | 是   | -   || -   |
| securityMinute        | Integer                            | 是   | -   || -   |
| securityNumbers       | Integer                            | 是   | -   || -   |
| securityLockMinute    | Integer                            | 是   | -   || -   |
| enableModifyPassword  | Boolean                            | 是   | -   || -   |
| minPasswordLength     | Integer                            | 是   | -   || -   |
| passwordTypes         | List                               | 是   | -   || -   |
| validPeriod           | Boolean                            | 是   | -   || -   |
| validDays             | Integer                            | 是   | -   || -   |

### **响应参数**

* 无

## load - /security_setting/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

# EncryptionFileController

* 包含4个接口

## list - /encryption_file/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称             | 类型     | 必选  | 约束  | 描述  | 示例  |
|------------------|--------|-----|-----|-----|-----|
| username         | String | 是   | -   || -   |
| fullname         | String | 是   | -   || -   |
| ip               | String | 是   | -   || -   |
| startTimeDesc    | String | 是   | -   || -   |
| endTimeDesc      | String | 是   | -   || -   |
| path             | String | 是   | -   || -   |
| levelId          | Long   | 是   | -   || -   |
| organizationName | String | 是   | -   || -   |
| organizationId   | Long   | 是   | -   || -   |
| organizationIds  | List   | 是   | -   || -   |

### **响应参数**

* 无

## delete - /encryption_file/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## export - /encryption_file/export

* 请求方式 GET -

### 接口描述

export

### **请求参数**

| 参数名称 | 类型      | 必选  | 约束  | 描述  | 示例  |
|------|---------|-----|-----|-----|-----|
| ids  | Set     | 是   | -   || -   |
| all  | boolean | 是   | -   || -   |

### **响应参数**

* 无

## export - /encryption_file

* 请求方式 -

### 接口描述

export

### **请求参数**

* 无

### **响应参数**

* 无

# UserController

* 包含11个接口

## add - /user/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称               | 类型      | 必选  | 约束                                         | 描述  | 示例  |
|--------------------|---------|-----|--------------------------------------------|-----|-----|
| username           | String  | 是   | <br>格式：满足正则表达式`"[0-9a-zA-Z_@\\\\\\-\\.]+"` || -   |
| password           | String  | 是   | <br>格式：不为空且不全为空格                           || -   |
| email              | String  | 是   | <br>格式：邮箱                                  || -   |
| fullname           | String  | 是   | <br>格式：不为空且不全为空格                           || -   |
| encryptionPolicyId | Long    | 是   | -                                          || -   |
| documentLevelId    | Long    | 是   | -                                          || -   |
| manager            | boolean | 是   | -                                          || -   |
| organizationId     | Long    | 是   | -                                          || -   |
| skipPasswordCheck  | boolean | 是   | -                                          || -   |
| adUserName         | String  | 是   | -                                          || -   |
| phoneNo            | String  | 是   | -                                          || -   |
| dn                 | String  | 是   | -                                          || -   |

### **响应参数**

* 无

## load - /user/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## edit - /user/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /user/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| ids  | List | 是   | -   || -   |

### **响应参数**

* 无

## list - /user/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束  | 描述  | 示例  |
|-----------------|--------|-----|-----|-----|-----|
| organizationId  | Long   | 是   | -   || -   |
| keyword         | String | 是   | -   || -   |
| organizationIds | Set    | 是   | -   || -   |

### **响应参数**

* 无

## relaxedList - /user/relaxed/list

* 请求方式 GET -

### 接口描述

relaxedList

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束  | 描述  | 示例  |
|-----------------|--------|-----|-----|-----|-----|
| organizationId  | Long   | 是   | -   || -   |
| keyword         | String | 是   | -   || -   |
| organizationIds | Set    | 是   | -   || -   |

### **响应参数**

* 无

## bindDocumentLevel - /user/bind_document_level

* 请求方式 POST -

### 接口描述

bindDocumentLevel

### **请求参数**

| 参数名称   | 类型   | 必选  | 约束         | 描述  | 示例  |
|--------|------|-----|------------|-----|-----|
| bindId | Long | 是   | -          || -   |
| ids    | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

## enabled - /user/enabled

* 请求方式 POST -

### 接口描述

enabled

### **请求参数**

| 参数名称    | 类型      | 必选  | 约束         | 描述  | 示例  |
|---------|---------|-----|------------|-----|-----|
| ids     | Set     | 是   | <br>格式：不为空 || -   |
| enabled | Boolean | 是   | -          || -   |

### **响应参数**

* 无

## move - /user/move

* 请求方式 POST -

### 接口描述

move

### **请求参数**

| 参数名称           | 类型   | 必选  | 约束         | 描述  | 示例  |
|----------------|------|-----|------------|-----|-----|
| ids            | List | 是   | <br>格式：不为空 || -   |
| organizationId | Long | 是   | -          || -   |

### **响应参数**

* 无

## loadDefaultProperty - /user/loadDefaultProperty

* 请求方式 GET -

### 接口描述

loadDefaultProperty

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## resetPassword - /user/reset_password

* 请求方式 POST -

### 接口描述

resetPassword

### **请求参数**

| 参数名称            | 类型     | 必选  | 约束         | 描述  | 示例  |
|-----------------|--------|-----|------------|-----|-----|
| password        | String | 是   | <br>格式：不为空 || -   |
| confirmPassword | String | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无

# 审批地址设置

* 包含3个接口

## add - /approve_address_setting/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称             | 类型      | 必选  | 约束  | 描述  | 示例  |
|------------------|---------|-----|-----|-----|-----|
| serialVersionUID | long    | 是   | -   || -   |
| innerHost        | String  | 是   | -   || -   |
| innerPort        | String  | 是   | -   || -   |
| outerHost        | String  | 是   | -   || -   |
| outerPort        | String  | 是   | -   || -   |
| enabled          | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## edit - /approve_address_setting/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称             | 类型   | 必选  | 约束  | 描述  | 示例  |
|------------------|------|-----|-----|-----|-----|
| serialVersionUID | long | 是   | -   || -   |
| id               | Long | 是   | -   || -   |

### **响应参数**

* 无

## load - /approve_address_setting/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

* 无

### **响应参数**

* 无

# 授权模板

* 包含5个接口

## add - /authorization_template/add

* 请求方式 POST -

### 接口描述

add

### **请求参数**

| 参数名称                                             | 类型      | 必选  | 约束  | 描述  | 示例  |
|--------------------------------------------------|---------|-----|-----|-----|-----|
| everyOne                                         | boolean | 是   | -   || -   |
| userIds                                          | Set     | 是   | -   || -   |
| organizationIds                                  | Set     | 是   | -   || -   |
| userPrivileges                                   | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Long    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | List    | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | int     | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | int     | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | String  | 是   | -   || -   |

### **响应参数**

* 无

## load - /authorization_template/load

* 请求方式 GET -

### 接口描述

load

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## list - /authorization_template/list

* 请求方式 GET -

### 接口描述

list

### **请求参数**

| 参数名称                | 类型      | 必选  | 约束  | 描述  | 示例  |
|---------------------|---------|-----|-----|-----|-----|
| name                | String  | 是   | -   || -   |
| startCreateTimeDesc | String  | 是   | -   || -   |
| endCreateTimeDesc   | String  | 是   | -   || -   |
| creator             | String  | 是   | -   || -   |
| everyOne            | Boolean | 是   | -   || -   |

### **响应参数**

* 无

## edit - /authorization_template/edit

* 请求方式 POST -

### 接口描述

edit

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束  | 描述  | 示例  |
|------|------|-----|-----|-----|-----|
| id   | Long | 是   | -   || -   |

### **响应参数**

* 无

## delete - /authorization_template/delete

* 请求方式 POST -

### 接口描述

delete

### **请求参数**

| 参数名称 | 类型   | 必选  | 约束         | 描述  | 示例  |
|------|------|-----|------------|-----|-----|
| ids  | List | 是   | <br>格式：不为空 || -   |

### **响应参数**

* 无
