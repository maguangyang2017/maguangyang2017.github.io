<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/19 0019
  Time: 上午 9:25
  To change this template use File | Settings | File Templates.
BeanUtils
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Title</title>
    <script src="/resources/plugins/jquery.1.12.4.min.js"></script>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/jquery-confirm/jquery-confirm.min.css" rel="stylesheet"/>
    <script src="/resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
    <link href="/resources/css/common.css" rel="stylesheet"/>
    <script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>

</head>
<body>
<form action="/manage/user/add" method="post" onsubmit="return sun()">
    <input type="text" name="username" />
    <input type="submit" value="submit"/>
</form>
<select id="geng">
    <%
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
        out.print(simpleDateFormat.format(new Date()));
    %>

</select>

<button onclick="chan()">更新</button>

<a href="/users/chan?method=add">曾</a>
<a href="/users/chan?method=delete">删除</a>
<a href="/users/chan?method=update">修改</a>
<a href="/users/chan?method=select">查询</a>
<div id="createDialog" class="crudDialog" >
    <form>
        <div class="form-group">
            <label for="input1">标题</label>
            <input id="input1" type="text" class="form-control">
        </div>
        <div class="form-group">
            <label for="input2">名称</label>
            <input id="input2" type="text" class="form-control">
        </div>
        <div class="form-group">
            <label for="input3">根目录</label>
            <input id="input3" type="text" class="form-control">
        </div>
        <div class="form-group">
            <label for="input4">图标</label>
            <input id="input4" type="text" class="form-control">
        </div>
    </form>
</div>


<script>
    $(document).on('focus', 'input[type="text"]', function() {
        $(this).parent().find('label').addClass('active');
    }).on('blur', 'input[type="text"]', function() {
        if ($(this).val() == '') {
            $(this).parent().find('label').removeClass('active');
        }
    });
    function sun(){
        if($("input[name='username']").val()==""){
            alert("用户名不能为空");
        }else {
            $.post("/users/chan", {"method": "update", "username": $("input[name='username']").val()}, function (text) {
                alert(text);
            }, "text")
        }

        return false;
    }


function chan() {
    $.confirm({
        type: 'dark',
        animationSpeed: 300,
        title: '新增系统',
        content: $("#createDialog").html(),
        buttons: {
            confirm: {
                text: '确认',
                btnClass: 'waves-effect waves-button',
                action: function () {
                    //用户点击了确认执行的代码
                    $.alert('确认');
                }
            },
            cancel: {
                text: '取消',
                btnClass: 'waves-effect waves-button',
                action:function(){
                    //用户点击取消
                    alert("取消");
                }
            }
        }
    });


    //var obj = {"name":"gaoxin","age":19,"sex":"战士"};
    //alert(obj.name);


//    $.get("/users/chan",{"method":"add","age":"19"}, function(data){
//        alert("Data Loaded: " + data);
//        //var d = eval(data);//将字符串执行成js代码
//        console.log(data);
//        var str  = "";
//        for(i = 0;i<data.length;i++){
//           str+="<option value='"+data[i].id+"'>"+data[i].name+"</option>";
//        }
//        $("#geng").html(str);
//    },"json");
//    $.ajax({
//        type: "GET",
//        url:"/users/chan",
//        success: function(html){
//            $("#geng").html(html);
//        }
//    });

//    var xmlhttp;
//    if (window.XMLHttpRequest)
//    {// code for IE7+, Firefox, Chrome, Opera, Safari
//        xmlhttp=new XMLHttpRequest();
//    }
//    else
//    {// code for IE6, IE5
//        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
//    }
//    //发起请求
//    xmlhttp.open("GET","/users/chan",true);
//    xmlhttp.send();
//    xmlhttp.onreadystatechange=function()
//    {
//        if (xmlhttp.readyState==4 && xmlhttp.status==200)
//        {
//            //请求并返回成功
//            document.getElementById("geng").innerHTML = xmlhttp.responseText;
//        }
//    }

}


</script>

</body>

</html>
