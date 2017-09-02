<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/4
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    *{margin: 0; padding: 0;}
    .supply{width: 590px; height: auto; overflow: hidden; margin: 50px; }
    .supply a{color: #0066CC; text-decoration: none;}
    .supply a:hover{color: #000000; text-decoration: underline;}
    .sup_title{width: 100%; height: 30px; border-bottom: 2px solid #5DB30A;}
    .sup_title>a:first-child{width: 75px; height: 30px; box-sizing: border-box; border: 1px solid #5B9400; border-radius: 4px 4px 0 0; float: left; margin-left: 10px; background: linear-gradient(#9BC644,#5BA32B); line-height: 30px; text-align: center; font-size: 14px; font-weight: 700; color: #fff;}
    .sup_title>span:last-child{float: right; font-size: 12px; line-height: 30px;}
    .content{width: 590px; height:360px; overflow: hidden;  border: 1px solid #EBEBEB; box-sizing: border-box; padding: 5px;}
    .info{width: 280px; height: auto; overflow: hidden; padding-bottom: 10px; font-size: 12px; float: left;margin-right: 15px}
    .info:nth-child(even){margin-right: 0px}
    .info a{line-height: 20px;}
    .info h2{width: 100%; height: 25px; line-height: 25px; font-size: 15px; background: linear-gradient(#E8F7DD,#FBFDF8);}
</style>
<script src="/resources/js/jquery-3.2.1.min.js"></script>
<body>

<form onsubmit="return false">
    <%--<div class="supply">--%>
        <%--<div class="content">--%>
            <%--<c:forEach items="${type}" var="sup">--%>
                <%--<div class="info">--%>
                    <%--<h2 id="info_${sup.id}"><a href="#">${sup.title}</a></h2>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
    <%--</div>--%>
    <div style="float: left;background-color: #00B83F;border-radius: 5px 5px 0px 0px;height: 40px;width: 100px;line-height: 40px;text-align: center;font-size: 22px;color: #FFFFFF;">新闻</div>
    <br/>
    <div style="height: 2px;width: 100%;background-color:#00ff00 ; margin-bottom: 20px;margin-top: 20px"></div>
    <div class="form-group">
            <c:forEach items="${news}" var="t">
                <div>

                    <span><a>[娱乐]</a></span>
                    <span  selected="selected"  ><a href="/news/new?m=getId&id=${t.id}" style="text-decoration: none">${t.title}</a></span>
                    <span style="float: right;"><a>${t.ctime}</a></span>
                </div>
            </c:forEach>
    </div>
</form>
</body>
</html>
