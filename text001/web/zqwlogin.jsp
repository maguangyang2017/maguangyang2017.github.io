<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/17
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie[] cookies = request.getCookies();
    Map<String,Cookie> map = new HashMap<String,Cookie>();
    if(cookies!=null){
        for(Cookie c:cookies){
            map.put(c.getName(),c);
        }
        Cookie c = map.get("name");
        if(c!=null){
            if(Integer.parseInt(c.getValue())!=0){
                if(!c.getValue().equals("")){
                    response.sendRedirect("/admin/user/logon");
                }
            }
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1 style="text-align: center">志趣网用户登录</h1>
<div style="width: 50%; height: 50%;text-align: center">
    <div style="text-align: center">您好!欢迎您登录到志趣网信息管理系统!</div>
    <form onsubmit="return false">
        <p>用户名：<input name="name" id="username" type="text" placeholder="user"/></p>
        <p>密码：<input name="password" id="password" type="password" placeholder="psaa"/></p>
        <div><input name="image"/>验证码</div>
        <div>
            <image src="/image" onclick="this.src='/image?'+new Date().toTimeString()" width="100" height="30"/>
        </div>
        <p><a><input  type="submit" id="denglu" value="登录" onclick="login()"/></a></p>
    </form>
</div>

<script src="resources/plugins/jquery.1.12.4.min.js"></script>
<script src="resources/plugins/checkbix/js/checkbix.min.js"></script>
<script src="resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
<script src="resources/plugins/jquery.cookie.js"/>
<script src="resources/js/login.js"></script>
<script type="text/javascript">
    Checkbix.init();
    if($.cookie("id")!=null){
        location.href="/b2b/index.jsp";
    }
    function login(){
        var username = $("#username").val();
        var password = $("#password").val();
        if(username==""){
            $.alert("用户名不能为空哦");
            return ;
        }
        if( password ==""){
            $.alert("密码不能为空哦");
            return ;
        }
        $.post("/admin/user/zqwlogin/login?m=login",{"name":username,"password":password},function(txt){
            if(txt.status==1){
                //用户名不正确
                $.alert(txt.message);
            }
            if(txt.status ==2){
                //密码不正确
                $.alert(txt.message);
            }
            if(txt.status==3){
                //用户已经封禁
                $.alert(txt.message);
            }
            if( txt.status ==4){
                //申诉中，请等待
                $.alert(txt.message);
            }
            if(txt.status == 0){
                //正常
                location.href="/b2b/index.jsp";
            }
        },"json")
    }


</script>

</body>
</html>
