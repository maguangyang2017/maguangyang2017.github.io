<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/11
  Time: 20:00
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
    <div style="float: left;background-color: #00B83F;border-radius: 5px 5px 0px 0px;height: 40px;width: 100px;line-height: 40px;text-align: center;font-size: 22px;color: #FFFFFF;">供应信息</div>
    <div style="float: right; font-size: 20px"><a href="/zqwlogin.html" name="shou" style="text-decoration: none ;" >发布求购信息</a></div>
    <br/>

    <div style="height: 2px;width: 100%;background-color:#00ff00 ; margin-bottom: 20px;margin-top: 20px"></div>
    <div class="form-group">
        <c:forEach items="${requestScope.list}" var="t">
            <div style="height: 80px;width: 100%;">
                <div style="border-bottom: 2px dashed #777777;width: 100%;">
                <span><a>[娱乐]</a></span>
                <span  selected="selected" style="margin-left: 30px"><a href="/manage/login/ziliao?m=getbyid&id=${t.id}" style="text-decoration: none">${t.gtitle}</a></span>
                <span style="float: right;"><a>${t.gtime}</a></span>
                </div>
            </div>
        </c:forEach>
        <div style="matgin:0 auto;">
            <a href="/index/gongying?m=getAllInfo&page=j" style="display:block;float:left;width:50px;height:25px;line-height:25px;text-align:center;">上一页</a>
            <c:forEach items="${requestScope.fenye}" var="fy">
                <a href="/index/gongying?m=getAllInfo&page=${fy.id}" style="display:block;float:left;width:35px;height:25px;line-height:25px;text-align:center;">${fy.id}</a>
            </c:forEach>
            <a href="/index/gongying?m=getAllInfo&page=z" style="display:block;float:left;width:50px;height:25px;line-height:25px;text-align:center;">下一页</a>
        </div>
    </div>
</form>
</body>
</html>
