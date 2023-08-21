
# FormDataController

* 包含3个接口

## test - /formData/test

* 请求方式 GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE - 

### 接口描述

test

### **请求参数**

| 参数名称 | 类型 | 必选 | 约束 | 描述 | 示例 |
|------|-----|-----|-----|-----|-----|
|type|String|是|-| |-|
|data|String|是|-| |-|

### **响应参数**


* 无

## test2 - /formData/test2

* 请求方式 GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE - 

### 接口描述

test2

### **请求参数**

| 参数名称 | 类型 | 必选 | 约束 | 描述 | 示例 |
|------|-----|-----|-----|-----|-----|
|name|String|是|<br>格式：不为空|名称||
|desc|String|是|<br>长度：`0` ~ `100`| ||
|fruitEnums|Enum&lt;FruitEnums&gt;|是|-| |APPLE<br>BANANA<br>Orange|
|password|String|是|<br>长度：`0` ~ `0x7fffffff`|密码<br>长度 8 - 20||
|sub|Object&lt;SubTO&gt;|是|-| ||
|└─&nbsp;foo|String|是|-| ||
|└─&nbsp;bar|int|是|-| ||
|└─&nbsp;childTO|Object&lt;ChildTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是|-| ||
|subTOList|List&lt;SubTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;foo|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;bar|int|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;childTO|Object&lt;ChildTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是|-| ||
|ids|List&lt;Long&gt;|是|-| ||

### **响应参数**

| 参数名称 | 类型 | 必选 | 描述 | 示例 |
|---------|------|-------|-------|------|
|name|String|是|名称||
|desc|String|是| ||
|fruitEnums|Enum&lt;FruitEnums&gt;|是| |APPLE<br>BANANA<br>Orange|
|password|String|是|密码<br>长度 8 - 20||
|sub|Object&lt;SubTO&gt;|是| ||
|└─&nbsp;foo|String|是| ||
|└─&nbsp;bar|int|是| ||
|└─&nbsp;childTO|Object&lt;ChildTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是| ||
|subTOList|List&lt;SubTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;foo|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;bar|int|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;childTO|Object&lt;ChildTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是| ||
|ids|List&lt;Long&gt;|是| ||

## test3 - /formData/add

* 请求方式 GET, POST - 

### 接口描述

test3

### **请求参数**

| 参数名称 | 类型 | 必选 | 约束 | 描述 | 示例 |
|------|-----|-----|-----|-----|-----|
|name|String|是|-|名称||
|desc|String|是|-| ||
|fruitEnums|Enum&lt;FruitEnums&gt;|是|-| |APPLE<br>BANANA<br>Orange|
|password|String|是|-|密码<br>长度 8 - 20||
|sub|Object&lt;SubTO&gt;|是|-| ||
|└─&nbsp;foo|String|是|-| ||
|└─&nbsp;bar|int|是|-| ||
|└─&nbsp;childTO|Object&lt;ChildTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是|-| ||
|subTOList|List&lt;SubTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;foo|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;bar|int|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;childTO|Object&lt;ChildTO&gt;|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是|-| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是|-| ||
|ids|List&lt;Long&gt;|是|-| ||

### **响应参数**

| 参数名称 | 类型 | 必选 | 描述 | 示例 |
|---------|------|-------|-------|------|
|name|String|是|名称||
|desc|String|是| ||
|fruitEnums|Enum&lt;FruitEnums&gt;|是| |APPLE<br>BANANA<br>Orange|
|password|String|是|密码<br>长度 8 - 20||
|sub|Object&lt;SubTO&gt;|是| ||
|└─&nbsp;foo|String|是| ||
|└─&nbsp;bar|int|是| ||
|└─&nbsp;childTO|Object&lt;ChildTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是| ||
|subTOList|List&lt;SubTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;foo|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;bar|int|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;childTO|Object&lt;ChildTO&gt;|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;left|String|是| ||
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─&nbsp;right|int|是| ||
|ids|List&lt;Long&gt;|是| ||
