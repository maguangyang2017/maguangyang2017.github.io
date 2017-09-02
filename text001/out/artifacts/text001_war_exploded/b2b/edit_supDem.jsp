<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/7/5
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>

<%
    Cookie[] cookies = request.getCookies();
    Map<String,Cookie> map = new HashMap<String,Cookie>();
    if(cookies==null){
        response.getWriter().write("您未登录账户不能发布信息，<a href=\"/zqwlogin.jsp\" target=\"_blank\">点击登录</a> | <a href=\"/zhuce.jsp\" target=\"_blank\">点击注册</a>");
        return;
    }else{
        for(Cookie c:cookies){
            map.put(c.getName(),c);
        }
        Cookie c = map.get("name");
        if(c==null){
            response.getWriter().write("您未登录账户不能发布信息，<a href=\"/zqwlogin.jsp\" target=\"_blank\">点击登录</a> | <a href=\"/zhuce.jsp\" target=\"_blank\">点击注册</a>");
            return;
        }else if(c.getValue().equals("")){
            response.getWriter().write("您未登录账户不能发布信息，<a href=\"/zqwlogin.jsp\" target=\"_blank\">点击登录</a>|<a href=\"/zhuce.jsp\" target=\"_blank\">点击注册</a>");
            return;
        }
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑发布供求信息</title>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/jquery-confirm/jquery-confirm.min.css" rel="stylesheet"/>
    <script src="/resources/js/jquery-3.2.1.min.js"></script>
    <script src="/resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
    <script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <style>
        .form-group{clear: both; height: auto; overflow: hidden;margin-top: 15px}
        .control-label{text-align: right; line-height: 30px}
        ::-webkit-scrollbar {
            width: 14px;
            height: 14px;
        }
        ::-webkit-scrollbar-track,
        ::-webkit-scrollbar-thumb {
            border-radius: 999px;
            border: 5px solid transparent;
        }

        ::-webkit-scrollbar-track {
            box-shadow: 1px 1px 5px rgba(0,0,0,.2) inset;
        }

        ::-webkit-scrollbar-thumb {
            min-height: 20px;
            background-clip: content-box;
            box-shadow: 0 0 0 5px rgba(0,0,0,.2) inset;
        }

        ::-webkit-scrollbar-corner {
            background: transparent;
        }
    </style>
</head>
<body>
<div class="panel panel-primary" style="width: 900px; height: 690px; overflow: hidden; border: none">
    <div class="panel-heading">
        <h3 class="panel-title">发布供求<a href="javascript:window.location.href=document.referrer;" style="float: right">返回</a> </h3>
    </div>
    <div style="height: 650px; width: 100%; overflow: auto">
        <div class="form-group">
            <label for="select1" class="col-sm-2 control-label">选择发布：</label>
            <div class="col-sm-10" style="width: 200px">
                <select id="select1" class="form-control">
                    <option value="-1" selected="selected">请选择</option>
                    <option value="0">求购信息</option>
                    <option value="1">供应信息</option>
                    <option value="2">产品库</option>
                    <option value="3">公司库</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">分类类型：</label>
            <div class="col-sm-10" style="width: 200px">
                <select id="select2" class="form-control" style="float: left; margin-right: 10px">
                    <option value="-1" selected="selected">请选择父类型</option>
                    <c:forEach items="${supply}" var="sup">
                        <option value="${sup.id}">${sup.title}</option>
                    </c:forEach>
                </select>
                <select id="select3" class="form-control" style="float:left;">
                    <option value="-1" selected="selected">请选择子类型</option>

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="input1" class="col-sm-2 control-label">标题：</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="input1" value="" placeholder="请输入标题">
            </div>
        </div>
        <div class="form-group">
            <label for="input1" class="col-sm-2 control-label">简介：</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="input2" value="" placeholder="请输入简介，不超过30字">
            </div>
        </div>
        <div class="form-group">
            <label for="input1" class="col-sm-2 control-label">报价：</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="input3" value="" placeholder="请输入报价">
            </div>
        </div>
        <div class="form-group">
            <label for="input1" class="col-sm-2 control-label">详细地址：</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="input4" value="" placeholder="请输入详细地址">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">内容：</label>
            <div class="col-sm-10">
                <form action="/uEditor" method="post" enctype="multipart/form-data">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="content" type="text/plain"></script>
                </form>
                <!-- 配置文件 -->
                <script type="text/javascript" src="/utf8-jsp/ueditor.config.js"></script>
                <!-- 编辑器源码文件 -->
                <script type="text/javascript" src="/utf8-jsp/ueditor.all.js"></script>
                <script type="text/javascript" charset="utf-8" src="/utf8-jsp/ueditor-patch-149.js"></script>
                <!-- 实例化编辑器 -->
                <script type="text/javascript">
                    var ue = UE.getEditor('container');

                </script>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <button type="button" class="btn btn-default" onclick="sSubmit()">发布提交</button>
            </div>
        </div>
        <br>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("#select2").change(function () {
            $.get('/manage/type/index',{"pid":$("#select2").val()},function (json) {
                var htm = "<option value=\"-1\" selected=\"selected\">请选择子类型</option>";
                for(i = 0 ;i<json.length;i++){
                    htm+="<option value=\""+json[i].id+"\">"+json[i].title+"</soption>";
                }
                $("#select3").html(htm);
            },'json');
        });
    });
    function sSubmit() {
        var title = $("#input1").val();//标题
        var description = $("#input2").val();//简介
        var price = $("#input3").val();//报价
        var address = $("#input4").val();//详细地址
        var content = ue.getContent();//内容
        var sdType = $("#select1").val();//供求
        var fTypeId = $("#select2").val();//父类型
        var zTypeId = $("#select3").val();//子类型
        if(title==""){
            $.alert("标题不能为空！");
        }else if(content==""){
            $.alert("内容不能为空！");
        }else if(sdType<0||sdType>3){
            $.alert("请正确选择发布信息类型！");
        }
        $.get("/index/fabu?m=add",{'title':title,'fTypeId':fTypeId,'zTypeId':zTypeId,'description':description,'price':price,'address':address,'content':content,'sdType':sdType},function (json) {
            $.alert(json);
//            location.href="/b2b/index.jsp";
//            if(sdType==0){
//                location.href="/adminMag/page/supDem?m=udemAll";
//            }else if(sdType==1){
//                location.href="/webFronts/supDem/message?m=usupAll";
//            }
        },'text');
    }
</script>
</body>
</html>
