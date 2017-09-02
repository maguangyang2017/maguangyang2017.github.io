
<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/6/23
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>供应信息</title>
</head>
<style>
    *{margin: 0; padding: 0;}
    .supply{width: 590px; height: auto; overflow: hidden; margin: 50px; }
    .supply a{color: #0066CC; text-decoration: none;}
    .supply a:hover{color: #000000; text-decoration: underline;}
    .sup_title{width: 100%; height: 30px; border-bottom: 2px solid #5DB30A;}
    .sup_title>a:first-child{width: 75px; height: 30px; box-sizing: border-box; border: 1px solid #5B9400; border-radius: 4px 4px 0 0; float: left; margin-left: 10px; background: linear-gradient(#9BC644,#5BA32B); line-height: 30px; text-align: center; font-size: 14px; font-weight: 700; color: #fff;}
    .sup_title>span:last-child{float: right; font-size: 12px; line-height: 30px;}
    .content{width: 590px; height:360px; overflow: hidden;  border: 1px solid #EBEBEB; box-sizing: border-box; padding: 5px;}
    .info{width: 280px; height: auto; overflow: hidden; padding-bottom: 10px; font-size: 12px; float: left;margin-right: 15px}
    .info:nth-child(even){margin-right: 0px}
    .info a{line-height: 20px;}
    .info h2{width: 100%; height: 25px; line-height: 25px; font-size: 15px; background: linear-gradient(#E8F7DD,#FBFDF8);}
</style>
<script src="/resources/js/jquery-3.2.1.min.js"></script>
<script>
    function getInfo(id,pid,title) {
        console.log(id+"---"+pid);
        $.post("/manage/login/type?m=ziji","pid="+pid,function (json) {
            var htm = "";
            for(i = 0 ;i<json.length;i++){
//                "<a href=\"#\">"+map.get(s)+"</a> | "
//                htm+="<a target=\"_blank\">"+json[i].title+"</a>|";
                htm+="<a href=\"/webFronts/page/SDEdit?m=indexSup&sdType=1&fTitle="+title+"&zTitle="+json[i].title+"&fid="+pid+"&zid="+json[i].id+"\"  target=\"_blank\">"+json[i].title+"</a>&nbsp;|&nbsp;";
            }
            $("#"+id).after(htm+"<a href='#'>更多</a>");
        },'json');
    }
</script>
<body>
    <div class="supply">
        <div class="sup_title">
            <a href="#">供应信息</a>
            <span>>><a href="#">查看更多</a></span>
        </div>
        <div class="content">
            <c:forEach items="${type}" var="sup">
                <div class="info">
                    <h2 id="info_${sup.id}"><a href="#">${sup.title}</a></h2>
                    <script>
                        getInfo("info_${sup.id}",${sup.id});
                    </script>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
