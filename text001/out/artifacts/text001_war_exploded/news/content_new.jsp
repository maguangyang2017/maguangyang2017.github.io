<%--<%@ page import="java.util.Map" %>--%>
<%--<%@ page import="java.util.HashMap" %>--%>
<%--<%--%>
    <%--Cookie[] cookies = request.getCookies();--%>
    <%--Map<String,Cookie> map = new HashMap<String,Cookie>();--%>
    <%--if(cookies==null){--%>
        <%--response.sendRedirect("/users/login.jsp");--%>
    <%--}else{--%>
        <%--for(Cookie c:cookies){--%>
            <%--map.put(c.getName(),c);--%>
        <%--}--%>
        <%--Cookie c = map.get("userid2");--%>
        <%--if(c==null){--%>
            <%--response.sendRedirect("/users/login.jsp");--%>
        <%--}else if(Integer.parseInt(c.getValue())==0){--%>
            <%--response.sendRedirect("/users/login.jsp");--%>
        <%--}--%>
    <%--}--%>
<%--%>--%>
<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/6/30
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻</title>
    <link rel="stylesheet" type="text/css" href="/css/news.css"/>
    <style>
        *{margin: 0;padding: 0}
        ul,li{list-style: none}
        .new_content{width: 100%; height: auto; overflow: hidden; }
        .new_content p{text-indent: 2em; line-height: 25px;font-size: 16px; padding: 0 10px;  margin: 8px 0}
        .box_content h3{text-align: center}
        .box_content>p{text-align: center;color: #666;font-size: 13px; line-height: 20px}
    </style>
</head>
<body>
    <div class="box">
        <div class="box_title">
            <a href="/news/new">志趣新闻</a>
            <a href="#">${new1.newType}</a>
        </div>
        <div class="box_content">
            <br>
            <h3>${new1.title}</h3>
            <p><span>发表于：${new1.ctime}</span></p>
            <br>
            <div class="new_content">
                ${new1.content}
            </div>
        </div>
    </div>
</body>
</html>
