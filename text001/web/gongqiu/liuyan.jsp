<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/16
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        * {list-style: none}
    </style>
</head>
<body>
<div id="liu" style="margin-top: 20px">
    <ul style="display: block">
        <li style="color: #ff6600">给我留言，我会立即联系您，谢谢!</li>
        <li>姓名<input type="text" id="name" maxlength="18" name="name"></li>
        <li>电话<input type="text" id="dian" maxlength="12" name="dian"></li>
        <li>手机<input type="text" id="shou" maxlength="11" name="shou"></li>
        <li>邮箱<input type="text" id="you" maxlength="18" name="you"></li>
        <li>留言(1000字内)</li>
        <li style="text-indent: 2em; height: 252px"><textarea id="content" cols="80%" maxlength="1000" wrap="hard" style="height: 250px" name="content"></textarea></li>
        <li><input type="button" name="submit" value="提交" id="tijiao" style="width: 100px; height: 25px"></li>
    </ul>
</div>
<script>
    $(document).ready(function () {
        $("#tijiao").click(function () {
            var xid = ${qiu1.id};
            var name = $("#name").val();
            var dian = $("#dian").val();
            var shou = $("#shou").val();
            var you = $("#you").val();
            var content = $("#content").val();
            $.post("/manage/login/liuyan?m=qiu",{"xid":xid,"name":name,"dian":dian,"shou":shou,"you":you,"content":content},function (json) {
                alert(json);
            },'json');
        })
    })
</script>
</body>
</html>
