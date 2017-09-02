<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/17
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${ti1}" var="t">
    <div style="height: 80px;width: 100%;">
        <div style="border-bottom: 2px dashed #777777;width: 100%;">
            <span  selected="selected" style="margin-left: 30px">名字${t.name}</span>
            <span >邮箱${t.shangwu}</span>
            <br/>
            <span >手机${t.shouji}</span>
        </div>
    </div>
</c:forEach>
</body>
</html>
