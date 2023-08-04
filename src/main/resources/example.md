
# FormDataController
* 包含3个接口

## test - /formData/test
* 请求方式 GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE - 

### **请求参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|type|String|是|-||-|
|data|String|是|-||-|

### **响应参数**
* 无

## test2 - /formData/test2
* 请求方式 GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE - 

### **请求参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|name|String|是|-|名称|-|
|desc|String|是|-||-|
|password|String|是|-|密码<br>长度 8 - 20|-|
|sub|SubTO|是|长度: null ~ null||-|
||String|是|-||-|
||int|是|-||-|
||ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|subTOList|List|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|

### **响应参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|name|String|是|-|名称|-|
|desc|String|是|-||-|
|password|String|是|-|密码<br>长度 8 - 20|-|
|sub|SubTO|是|长度: null ~ null||-|
||String|是|-||-|
||int|是|-||-|
||ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|subTOList|List|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|

## test3 - /formData/add
* 请求方式 .GET, .POST - 

### **请求参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|name|String|是|-|名称|-|
|desc|String|是|-||-|
|password|String|是|-|密码<br>长度 8 - 20|-|
|sub|SubTO|是|长度: null ~ null||-|
||String|是|-||-|
||int|是|-||-|
||ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|subTOList|List|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|

### **响应参数**
| 参数名称 | 类型  | 必选  | 约束  | 描述  | 示例  |
|------|-----|-----|-----|-----|-----|
|name|String|是|-|名称|-|
|desc|String|是|-||-|
|password|String|是|-|密码<br>长度 8 - 20|-|
|sub|SubTO|是|长度: null ~ null||-|
||String|是|-||-|
||int|是|-||-|
||ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|subTOList|List|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|ChildTO|是|长度: null ~ null||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|String|是|-||-|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|int|是|-||-|
