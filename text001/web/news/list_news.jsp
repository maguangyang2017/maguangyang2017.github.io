<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/6/30
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>志趣新闻</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/news.css"/>
    <style>
        *{margin: 0;padding: 0}
        ul,li{list-style: none}
    </style>
    <script src="/resources/js/jquery-3.2.1.min.js"></script>
</head>
<body>
    <div class="box">
        <div class="box_title">
            <a href="#">志趣新闻</a>
            <a href="#">查看更多</a>
        </div>
        <div class="box_content">
            <ul class="boxc_ul">
                <c:forEach items="${news}" var="t">
                    <li><p><a href="/news/new?id=${t.id}">${t.title}</a></p><span>${t.ctime}</span></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</body>
</html>
