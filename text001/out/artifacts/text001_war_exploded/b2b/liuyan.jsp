<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/19
  Time: 9:02
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
<c:forEach items="${liuyan}" var="t">
    <table>
        <tr>
            <td>
                名字——${t.name}
            </td>
        </tr>
        <tr>
            <td>
                地址——${t.dian}
            </td>
        </tr>
        <tr>
            <td>
                手机——${t.shou}
            </td>
        </tr>
        <tr>
            <td>
                邮箱——${t.you}
            </td>
        </tr>
        <tr>
            <td>
                内容——${t.content}
            </td>
        </tr>
    </table>
</c:forEach>
</body>
</html>
