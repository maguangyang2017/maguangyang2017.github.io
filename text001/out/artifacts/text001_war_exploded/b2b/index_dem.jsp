<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%
    Cookie[] cookies = request.getCookies();
    Map<String,Cookie> map = new HashMap<String,Cookie>();
    if(cookies!=null){
        for(Cookie c:cookies){
            map.put(c.getName(),c);
        }
        Cookie c = map.get("name");
        if(c!=null){
            if(c.getValue().equals("")){
                if(!c.getValue().equals("")){
                    response.sendRedirect("/admin/user/logon");
                }
            }
        }
    }
%>

<%--<%--%>
    <%--Cookie[] cookies = request.getCookies();--%>
    <%--Map<String,Cookie> map = new HashMap<String,Cookie>();--%>
    <%--request.setAttribute("login","1");--%>
    <%--if(cookies==null){--%>
        <%--request.setAttribute("login","0");--%>
    <%--}else{--%>
        <%--for(Cookie c:cookies){--%>
            <%--map.put(c.getName(),c);--%>
        <%--}--%>
        <%--Cookie c = map.get("userid2");--%>
        <%--if(c==null){--%>
            <%--request.setAttribute("login","0");--%>
        <%--}else if(Integer.parseInt(c.getValue())==0){--%>
            <%--request.setAttribute("login","0");--%>
        <%--}--%>
    <%--}--%>
<%--%>--%>
<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/7/4
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>志趣网</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/plugins/fullPage/jquery.fullPage.css" rel="stylesheet"/>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet"/>

    <script src="/resources/plugins/jquery.1.12.4.min.js"></script>
    <script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <script src="/resources/plugins/waves-0.7.5/waves.min.js"></script>
    <script src="/resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="/resources/plugins/BootstrapMenu.min.js"></script>
    <script src="/resources/plugins/device.min.js"></script>
    <script src="/resources/plugins/fullPage/jquery.fullPage.min.js"></script>
    <script src="/resources/plugins/fullPage/jquery.jdirk.min.js"></script>
    <script src="/resources/plugins/jquery.cookie.js"></script>
    <style>
        ._top{width: 100%; height: 120px; border-bottom: 2px solid rgb(214, 214, 214); padding-top:15px; box-sizing: border-box }
        .nav_index{border: none; width: 800px; position: relative;}
        ._nav{height: 46px;width: 400px; clear: both; position: absolute; right:  60px; bottom: 0px}
        .logo a,.logo img,.logo span{display: block;}
        .logo  a{float: left}
        .logo span {font-size: 36px; font-family: '宋体'; font-weight: bold; line-height: 73px; float: left}
        ._login .btn-default:hover{background: none;}
        ._content{width: 950px; height: auto; overflow: hidden; margin: 20px auto;}
        #test{padding-left:10px; position: absolute; top: 0px; right: 0px; width: 170px; height: 30px; background: rgba(0,0,0,0.5); color: #fff;}
        #test h5{ margin: 0px;padding: 0px; line-height: 30px}
    </style>
</head>
<body>
<div>
    <%--<div id="test">--%>
        <%--<h5>当前在线人数：<span id="online_number"></span></h5>--%>
    <%--</div>--%>
    <%--<script>--%>
        <%--$(document).ready(function () {--%>
            <%--setInterval(function () {--%>
                <%--$.get("/OnlineNum","",function (msg) {--%>
                    <%--$("#online_number").html(msg);--%>
                <%--},'text');--%>
            <%--},1000)--%>
            <%--var menuYloc = $("#test").offset().top;--%>
            <%--$(window).scroll(function () {--%>
                <%--var offsetTop = menuYloc + $(window).scrollTop() + "px";--%>
                <%--$("#test").animate({ top: offsetTop }, { duration: 600, queue: false });--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
    <div class="_top">
        <div class="container" style="width: 950px; height: 105px; position:relative">
            <div class="col-lg-5" style="height: 105px; padding-top: 8px; box-sizing: border-box">
                <div class="logo">
                    <%--<a href="/b2b/index.jsp"><img src="/resources/images/logo.gif"></a>--%>
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
                            ${cookie.get("username").value}
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="/qiantaidenglu/aboutMe.jsp">个人中心</a></li>
                            <script>
                                //退出登录
                                function logon() {
                                    $.get("/webFronts/manage/user?m=logon","",function () {
                                        window.location.reload();
                                    });
                                }
                            </script>
                            <li><a href="javascript:logon();">退出登录</a></li>
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
                        <li role="presentation"><a href="/b2b/index.jsp" >首页</a></li>
                        <li role="presentation"><a href="/b2b/index_news.jsp" >新闻</a></li>
                        <li role="presentation" class="active"><a href="/webFronts/page/SDEdit?m=indexDem" >求购信息</a></li>
                        <li role="presentation"><a href="/webFronts/page/SDEdit?m=indexSup" >供应信息</a></li>
                        <li role="presentation"><a href="/webFronts/page/SDEdit?m=indexChanpin" >产品库</a></li>
                        <li role="presentation"><a href="/webFronts/page/SDEdit?m=indexGongsi">公司库</a></li>
                    </ul>
                </div>

            </div>
        </div>
    </div>

    <div style="height: 40px; width: 360px; margin: 10px auto">
        <FORM action="/webFronts/sousuo?m=sousuo" method="post" onsubmit="return true">
            <div class="col-lg-12">
                <div class="input-group">
                    <input type="text" class="form-control col-lg-7" name="guanjianzi" placeholder="搜索" value="" style="float: left;">

                    <div class="input-group-btn">
                        <select class="form-control" name="select1" style="width: 80px">
                            <option value="ssnews">新闻</option>
                            <option value="ssb2b">商业</option>
                        </select>
                    </div>
                    <span class="input-group-btn" style="float: left;">
                    <button class="btn btn-default" type="submit">Go!</button>
                </span>
                </div><!-- /input-group -->
            </div><!-- /.col-lg-6 -->
        </FORM>
    </div>
    <!-- Nav tabs -->


    <!-- Tab panes -->
    <div class="_content" style="clear: both">


        <div class="_weizhi" style="width: 100%; height: auto; overflow: hidden">
            <p id="_dangqian">您的位置》<a href="/b2b/index.jsp">志趣</a>》<a href="/webFronts/page/SDEdit?m=indexDem">求购信息</a></p>
            <div class="hangye">
                <label style="float: left; display: block; width: 70px; height: 30px; line-height: 30px"><b>行业:</b></label>
                <p style="float: left; width: 850px; height: auto; overflow: hidden" id="types">
                    <c:forEach items="${supply}" var="sup">
                        <a href="javascript:xuanze('${sup.id}','${sup.title}');" type="button" class="btn btn-link">${sup.title}</a>
                    </c:forEach>
                </p>
            </div>
        </div>


        <div class="tab-content" style="clear: both; width: 650px; height: auto; overflow: hidden; float: left">
            <iframe src="/index/qiu?m=index" marginheight="0" marginwidth="0" frameborder="0" scrolling="no" width="100%" id="iframepage" name="iframepage" onLoad="iFrameHeight()" ></iframe>
            <script type="text/javascript" language="javascript">
                function iFrameHeight() {
                    var ifm= document.getElementById("iframepage");
                    var subWeb = document.frames ? document.frames["iframepage"].document :
                        ifm.contentDocument;
                    if(ifm != null && subWeb != null) {
                        ifm.height = subWeb.body.scrollHeight;
                    }
                }
            </script>
        </div>
        <%--<div class="_content_right" style="width: 280px; height: 600px; float: right">--%>
            <%--<div class="panel panel-primary" style="width: 100%; height: 200px;">--%>
                <%--<div class="panel-heading">--%>
                    <%--<h3 class="panel-title"><a href="#">暂无内容</a></h3>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="panel panel-primary" style="width: 100%; height: 200px;">--%>
                <%--<div class="panel-heading">--%>
                    <%--<h3 class="panel-title"><a href="#">暂无内容</a></h3>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>
</div>
<script>
    var weizhi1 = $("#_dangqian").html();
    var weizhi2 = "";
    function xuanze(fid,title) {
//        /webFronts/supDem/message?m=demAll
        $("#iframepage").attr('src',"/webFronts/supDem/message?m=b2b&sdType=0&fid="+fid);
        $.post('/webFronts/sup_index',{"pid":fid},function (json) {
            var htm = "";
            for(i = 0 ;i<json.length;i++){
                htm+="<a href=\"javascript:xuanze2("+fid+","+json[i].id+",'"+json[i].title+"');\" type=\"button\" class=\"btn btn-link\">"+json[i].title+"</a>";
            }
            alert(htm);
            $("#types").html(htm);
            $("#_dangqian").html(weizhi1+"》<a href=\"javascript:xuanze("+fid+",'"+title+"');\">"+title+"</a>");
            weizhi2 = $("#_dangqian").html();
        },'json');
    }
    function xuanze2(fid,zid,title) {
//        /webFronts/supDem/message?m=demAll
        $("#iframepage").attr('src',"/webFronts/supDem/message?m=b2b&sdType=0&fid="+fid+"&zid="+zid);
        $("#types").html("");
        $("#_dangqian").html(weizhi2+"》<a href=\"javascript:xuanze("+fid+","+zid+",'"+title+"');\">"+title+"</a>");
    }


</script>
<br>
<br>
<br>
<br>

</body>
</html>
