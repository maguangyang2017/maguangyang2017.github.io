<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/5
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%--%>
    <%--Cookie[] cookies = request.getCookies();--%>
    <%--boolean flag = false;--%>
    <%--Map<String ,Cookie> maps = new HashMap<String,Cookie>();--%>
    <%--for(Cookie c:cookies){--%>
        <%--maps.put(c.getName(),c);--%>
    <%--}--%>
    <%--Cookie c = maps.get("id");--%>
    <%--if(c==null){--%>
        <%--response.sendRedirect("/zqwlogin.html");--%>
    <%--}else if(Integer.parseInt(c.getValue())==0){--%>
        <%--response.sendRedirect("/zqwlogon.html");--%>
    <%--}--%>


<%--%>--%>
<html>
<head>
    <title>志趣网</title>
    <link href="../resources/plugins/fullPage/jquery.fullPage.css" rel="stylesheet"/>
    <link href="../resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="../resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
    <link href="../resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet"/>

    <script src="../resources/plugins/jquery.1.12.4.min.js"></script>
    <script src="../resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <script src="../resources/plugins/waves-0.7.5/waves.min.js"></script>
    <script src="../resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="../resources/plugins/BootstrapMenu.min.js"></script>
    <script src="../resources/plugins/device.min.js"></script>
    <script src="../resources/plugins/fullPage/jquery.fullPage.min.js"></script>
    <script src="../resources/plugins/fullPage/jquery.jdirk.min.js"></script>
    <script src="../resources/plugins/jquery.cookie.js"></script>
    <style>
        ._top{width: 100%; height: 120px; border-bottom: 2px solid rgb(214, 214, 214); padding-top:15px; box-sizing: border-box }
        .nav_index{border: none; width: 800px; position: relative;}
        ._nav{height: 46px;width: 400px; clear: both; position: absolute; right:  0px; bottom: 0px}
        .logo a,.logo img,.logo span{display: block;}
        .logo  a{float: left}
        .logo span {font-size: 36px; font-family: '宋体'; font-weight: bold; line-height: 73px; float: left}
        ._login .btn-default:hover{background: none;}
        ._content{width: 950px; height: auto; overflow: hidden; margin: 20px auto;}
        #test{position: absolute; top: 10px; right: 10px; width: 130px; height: 60px; background: #555; color: #fff; font-size: 13px;}
    </style>
</head>
<body>
<div>
    <div>

        <script>
            $(document).ready(function () {
                var menuYloc = $("#test").offset().top();
                $(window).scroll(function () {
                    var offsetTop = menuYloc + $(window).scrollTop() + "px";
                    $("#test").animate({ top: offsetTop }, { duration: 600, queue: false });
                });
            });
        </script>
    </div>
    <div class="_top">
        <div class="container" style="width: 950px; height: 105px; position:relative">
            <div class="col-lg-5" style="height: 105px; padding-top: 8px; box-sizing: border-box">
                <div class="logo">
                    <span>志趣网</span>
                </div>
            </div>
            <div class="col-lg-7" style="height: 105px; position: relative;">
                <div style="float: right">
                    <div class="btn-group _login" id="login_" role="group" aria-label="...">
                        <button type="button" class="btn" onclick="location.href='/zqwlogin.html'">登录</button>
                        <button type="button" class="btn btn-default" onclick="location.href='/zhuce.jsp'">注册</button>
                    </div>
                    <script>
                        $('._login .btn').on('click', function () {
                            $(".btn").addClass("btn-default");
                            $(this).removeClass('btn-default');
                        })
                    </script>
                    <div class="btn-group" role="group" id="user_">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                            ${cookie.get("username2").value}
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="/qiantaidenglu/aboutMe.jsp">个人中心</a></li>
                            <script>
                                //退出登录
                                function logout(){
                                    $.get("/admin/user/zqwlogin?m=exits",function (txt) {
                                        alert("退出了");
                                        location.reload();
                                    },"text")
                                }
//                                function logon() {
//                                    $.get("/admin/user/zqwlogin?m=exits","",function () {
//                                        window.location.reload();
//                                    });
//                                }
                            </script>
                            <li><a href="javascript:logout();">退出登录</a></li>
                            <li><a href="#">设置</a></li>
                        </ul>
                    </div>
                </div>
                <script>
                    $(document).ready(function () {
                        var login = ${login};
                        if(login==0){
                            $("#user_").css({"display":"none"});
                        }else if(login==1){
                            $("#login_").css({"display":"none"});
                        }
                    });
                </script>
                <div class="_nav">
                    <ul class="nav nav-tabs nav_index" role="tablist" style="clear: both">
                        <li role="presentation" class="active"><a href="#" onclick="qiehuan('/manage/login/type?m=fuji')" aria-controls="home" role="tab" data-toggle="tab">首页</a></li>
                        <li role="presentation"><a href="#" onclick="qiehuan('/news/new?m=index')" aria-controls="news" role="tab" data-toggle="tab">新闻</a></li>
                        <li role="presentation"><a href="#" onclick="qiehuan('/index/qiu?m=index')" aria-controls="buying" role="tab" data-toggle="tab">求购信息</a></li>
                        <li role="presentation"><a href="#" onclick="qiehuan('/index/gongying?m=index')" aria-controls="supply" role="tab" data-toggle="tab">供应信息</a></li>
                    </ul>
                    <script>
                        function qiehuan(url) {
                            if(url==$('#external-frame').attr('src')){
                                $('#external-frame').attr('src', $('#external-frame').attr('src'));
                            }
                            $("#external-frame").attr({src:url});
                        }
                    </script>
                </div>

            </div>
        </div>
    </div>
    <!-- Nav tabs -->


    <!-- Tab panes -->
    <div class="_content">
        <div class="tab-content" style="clear: both">
            <div role="tabpanel" class="tab-pane active" id="home">
                <iframe src="/manage/login/type?m=fuji" frameborder="0" scrolling="no" id="external-frame" onload="setIframeHeight(this)" style="width: 100%">
                </iframe>
                <script>
                    function setIframeHeight(iframe) {
                        if (iframe) {
                            var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
                            if (iframeWin.document.body) {
                                iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
                            }
                        }
                    };

                    window.onload = function () {
                        setIframeHeight(document.getElementById('external-frame'));
                    };
                </script>
            </div>
            <%--<div role="tabpanel" class="tab-pane" id="news">...</div>--%>
            <%--<div role="tabpanel" class="tab-pane" id="buying">...</div>--%>
            <%--<div role="tabpanel" class="tab-pane" id="supply">...</div>--%>
        </div>
    </div>


</div>
<br>
<br>
<br>
<br>

</body>
</html>
