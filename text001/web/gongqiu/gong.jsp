<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/5
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div><a href="/denglu.jsp" style=" text-decoration: none;font-size: 20px">返回首页</a></div>
    <!-- 加载编辑器的容器 -->
    <script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="/utf8-jsp/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="/utf8-jsp/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container');
        var ee = UE.getContent();
        //对编辑器的操作最好在编辑器ready之后再做
        ee.ready(function() {
            //获取html内容，返回: <p>hello</p>
            var html = ee.getContent();
            //获取纯文本内容，返回: hello
            var txt = ee.getContentTxt();
        });
    </script>
    <button onclick="tijiao()" id="tijiao"><a></a>发布信息</button>
    <form method="POST" action="/manage/file" enctype="multipart/form-data">
        <input type="file" name="file1"/>
        <input type="submit" value="提交"/>
    </form>
    <%--<form action="/index/gongying?m=add" method="POST" accept-charset="UTF-8">--%>
        <%--<input type="text" style="height: 40px;width: 300px" name="tijiao"/>--%>
        <%--<input type="submit" value="提交"/>--%>
    <%--</form>--%>
    <%--<a href="/fileupload.jsp">上传文件</a>--%>

    <script>
        function tijiao(){
            var gtitle = $("#container").val();
            $.post("/index/gongying?m=add",{"gtitle":gtitle,},function (msg) {
                alert(msg.message);
            },"JSON")
        }

    </script>
</body>
</html>
