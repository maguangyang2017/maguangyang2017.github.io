<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/19 0019
  Time: 上午 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="add.jsp"%>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<jsp:include page="add.jsp" ></jsp:include>
<%!
    String s = "! yes";

%>
<%
    String s = "! no";
%>
<form action="/manage/user/updatesave" method="post">
    <input type="text" name="id" value="${requestScope.user.id}" />
    <input type="text" name="name" value="${requestScope.user.name}"/>
    <input type="submit" value="修改" />
</form>
</body>
</html>
