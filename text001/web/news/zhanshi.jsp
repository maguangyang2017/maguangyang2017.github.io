<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/16
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="width: 80%;margin: 0 auto">
        <div class="form-group">
            <div id="input1up" style="text-align: center" ><h2>${news1.title}</h2></div>
            <div  style="text-align: center; color: #777777;" >发表于：${news1.ctime}</div>
        </div>
        <div class="form-group">

            <div id="input3up"  >${news1.content}</div>
        </div>
    </div>

</body>
</html>
