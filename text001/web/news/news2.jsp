<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/11
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form onsubmit="return false">
    <div class="form-group">
        <c:forEach items="${news}" var="t">
            <div>
                <div  selected="selected"  ><a>${t.title}</a></div>
                <div><a>${t.content}</a></div>
            </div>
        </c:forEach>
    </div>
</form>
</body>
</html>
