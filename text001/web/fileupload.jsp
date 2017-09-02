<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/10
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
    <form method="POST" action="/manage/file" enctype="multipart/form-data">
        <input type="file" name="file1"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
