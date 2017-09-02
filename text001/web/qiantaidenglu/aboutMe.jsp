<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/7/5
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>个人中心</title>
    <link href="../resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="/resources/js/jquery-3.2.1.min.js"></script>
    <script src="../resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <script>
        function qieHuan(url) {
            if(url==$('#external-frame').attr('src')){
                $('#external-frame').attr('src', $('#external-frame').attr('src'));
            }
            $("#external-frame").attr({src:url});
        }
    </script>
    <style>
        .list-group-item{font-size: 18px; text-align: center}

    </style>
</head>
<body style="background: #DEDEDE">
<div class="container" style="width: 1200px; border-radius: 7px; margin: 80px auto 0; background: #FFFFFF; box-shadow: 20px 20px 15px #999999;">
    <div class="row">
        <div class="col-lg-3" style="height: 700px; background: #FFFFFF; border-right: 1px solid #999999; padding: 0; border-radius: 5px; position: relative;z-index: 100">
            <div class="list-group" id="ziliaoka">
                <a href="#" class="list-group-item active">
                    <img src="/resources/images/9bf09c8a144a5c094dfc88fc1e611d50.jpg" style="border-radius: 50%; width: 80px;">
                    <br>
                    <span>name</span>
                </a>
                <a href="javascript:qieHuan('/manage/login/ziliao?m=getall');" class="list-group-item">个人资料</a>
                <a href="javascript:qieHuan('/index/qiu?m=index');" class="list-group-item">求购信息</a>
                <a href="javascript:qieHuan('/index/gongying?m=getAllInfo&page=1');" class="list-group-item">供应信息</a>
                <a href="javascript:qieHuan('/index/geren/fabu?m=add');" class="list-group-item">发布信息</a>
                <a href="javascript:qieHuan('/index/geren/liuyan?m=add');" class="list-group-item">留言信息</a>
                <a href="/b2b/index.jsp" class="list-group-item">返回首页</a>
                <script>
                    //退出登录
                    function logout(){
                        $.get("/admin/user/zqwlogin?m=exits",function (txt) {
                            alert("退出了");
                            location.reload();
                        },"text")
                    }
//                    function logon() {
//                        $.get("/webFronts/manage/user?m=logon","",function () {
//                            location.href="/webFronts/index.jsp";
//                        });
//                    }
                </script>
               <a href="javascript:logon();" class="list-group-item">退出登录</a>
            </div>
        </div>
        <div class="col-lg-9" id="aaa" style="height: 700px; overflow: auto; padding: 0;">
            <%--页面--%>
            <iframe src="/admin/user/zqwlogin" frameborder="0" scrolling="no" id="external-frame" onload="setIframeHeight(this)" style="width: 100%">
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
    </div>

</div>




</body>
</html>
