<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/18
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td tr{
            width:auto;
            height: 40px;}
    </style>
</head>
<body>
<c:forEach items="${fabu}" var="t">
    <table>
        <tr>
            <td>
                标题——${t.title}
            </td>
        </tr>
        <tr>
            <td>
                地址——${t.address}
            </td>
        </tr>
        <tr>
            <td>
                内容——${t.content}
            </td>
        </tr>
    </table>
    <%--<div style="height: 60px;width: 100%;">--%>
        <%--<span style="float: left;"></span>--%>
        <%--<span style="float: left;"></span>--%>
        <%--<span style="float: left;"></span>--%>
    <%--</div>--%>
</c:forEach>
</body>
</html>
