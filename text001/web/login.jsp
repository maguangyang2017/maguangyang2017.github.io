<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/17
  Time: 16:22
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
        Cookie c = map.get("username");
        if(c!=null){
            if(c.getValue().equals("")){
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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta name="keywords" content="Ribbon Login Form Responsive Templates, Iphone Compatible Templates, Smartphone Compatible Templates, Ipad Compatible Templates, Flat Responsive Templates"/>
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
    <!--/webfonts-->
</head>
<body>
<!--start-main-->
<h1>Welcome to the background management system</h1>
<div class="login-box">
    <form>
        <input id="username" type="text" class="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
        <input id="password" type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
    </form>
    <div class="remember">
        <a href="#"><p>Remember me</p></a>
        <h4>Forgot your password?<a href="#">Click here.</a></h4>
    </div>
    <div class="clear"> </div>
    <div class="btn">
        <a href="javascript:login()" style="display: block;">LOG IN</a>
    </div>
    <div class="clear"> </div>
</div>
<script src="resources/plugins/jquery.1.12.4.min.js"></script>
<script src="resources/plugins/checkbix/js/checkbix.min.js"></script>
<script src="resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
<script src="resources/plugins/jquery.cookie.js"/>
<script src="resources/js/login.js"></script>
<script type="text/javascript">


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
        $.post("/admin/user/logon",{"username":username,"password":password},function(txt){
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
                location.href="index.jsp";
            }
        },"json")
    }

</script>
</body>
</html>
