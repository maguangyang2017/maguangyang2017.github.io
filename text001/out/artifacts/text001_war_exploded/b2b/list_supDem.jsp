<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/7/5
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>供应信息</title>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/jquery-confirm/jquery-confirm.min.css" rel="stylesheet"/>
    <script src="/resources/js/jquery-3.2.1.min.js"></script>
    <script src="/resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
    <script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <style>
        ._content{width: 630px; border-bottom: 1px dashed #888888; height: auto; overflow: hidden; padding: 10px 0; margin: 0 10px 10px}
        .thumbnail{float: left; width: 100px; height: 100px; margin: 0;}
        .caption{float: left;width: 520px; margin: 0; padding:  0 10px}
        .caption h3{margin: 0px; padding: 0; width: 100%; height: 25px; line-height: 25px}
        .caption h3 a{float: left; font-size: 20px;}
        .caption h3 span{float: right; font-size: 14px; color: #999999; padding-right: 10px}
        .caption p{padding-top: 5px;font-size: 15px; clear: both}
    </style>
</head>
<body>
<div class="panel panel-primary" style="width: 650px;">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="#">全部信息</a><a href="/webFronts/page/SDEdit?m=edit" style="float: right"><i class="glyphicon glyphicon-plus"></i>发布</a> </h3>
    </div>
    <div class="panel-body">
        <c:forEach items="${list}" var="lst">
            <div class="row">
                <div class="col-sm-12 _content">
                    <a href="/webFronts/supDem/message?m=cPage&id=${lst.id}" class="thumbnail">
                        <img src="${lst.titleImgUrl}" alt="...">
                    </a>
                    <div class="caption">
                        <h3><a href="/webFronts/supDem/message?m=cPage&id=${lst.id}">${lst.title}</a><span>${lst.date}</span></h3>
                        <p>${lst.description}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
