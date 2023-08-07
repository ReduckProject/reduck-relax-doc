<%
for(apiGroup in apiGroupList){
%>

# ${apiGroup.name}

* 包含${apiGroup.apis.~size}个接口
  <%
  for(api in apiGroup.apis){
  var requestParams = api.requestParams;
  var responseParams = api.responseParams;
  %>

## ${api.name} - ${apiGroup.urlPrefix}${api.url}

* 请求方式 ${api.requestMethod} - ${api.contentType}

### 接口描述

${api.desc}

### **请求参数**

<%
if(isNotEmpty(requestParams)){
%>
| 参数名称 | 类型 | 必选 | 约束 | 描述 | 示例 |
|------|-----|-----|-----|-----|-----|
<%
for(requestParam in requestParams){
%>
|${htmlSpaceEscape(requestParam.name)}|${requestParam.type}|${requestParam.requireDesc}|${htmlLineSeparatorEscape(
requestParam.constraintDesc)}|${htmlLineSeparatorEscape(requestParam.desc)}|${htmlLineSeparatorEscape(
requestParam.example)}|
<% } %>
<% } else {%>

* 无
  <% } %>

### **响应参数**

<%
if(isNotEmpty(responseParams)) {
%>
| 参数名称 | 类型 | 必选 | 描述 | 示例 |
|---------|------|-------|-------|------|
<%
for(responseParam in responseParams){
%>
|${htmlSpaceEscape(responseParam.name)}|${responseParam.type}|${responseParam.requireDesc}|${htmlLineSeparatorEscape(
responseParam.desc)}|${htmlLineSeparatorEscape(responseParam.example)}|
<% } %>
<% } else {%>

* 无
  <% } %>
  <% } %>
  <% } %>