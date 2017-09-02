<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/16
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%--<link href="/js/jquery.js" rel="stylesheet"/>--%>
    <style>
        .aa{width:75px;height: 30px;line-height: 30px;background-color: #777777}
        div span { float: left;}
        *{list-style: none}
    </style>
</head>
<body>
<div style="width: 80%;margin: 0 auto">
    <div style="width: 600px;">
        <div  style="text-align: center" ><h2>${qiu1.qtitle}</h2></div>
        <div  style="text-align: center; color: #777777;" >发表于：${qiu1.qtime}</div>
        <div style="width: 600px;">
            <div>
            <span class="aa">发布时间</span><span style="width: 225px;height: 30px;"> </span>
            <span class="aa">国家地区</span><span style="width: 225px;height: 30px;"> </span>
            </div>
            <span class="aa">发布人</span><span style="width: 225px;height: 30px;"> </span>
            <span class="aa">公司</span><span style="width: 225px;height: 30px;"> </span>
            <span class="aa">地址</span><span style="width: 225px;height: 30px;"></span>
            <span class="aa">网站</span><span style="width: 225px;height: 30px;"></span>
            <span class="aa">邮件</span><span style="width: 225px;height: 30px;">${ti2.shangwu}</span>
            <span class="aa">手机</span><span style="width: 225px;height: 30px;">${ti2.shouji}</span>
            <span class="aa">电话</span><span style="width: 225px;height: 30px;">${ti2.shouji}</span>
            <span class="aa">QQ</span><span style="width: 225px;height: 30px;"></span>
            <span class="aa">用户级别</span><span style="width: 225px;height: 30px;"></span>
            <span class="aa">加入时间</span><span style="width: 225px;height: 30px;"></span>
            <span class="aa">报价</span><span style="width: 225px;height: 30px; color: #000; line-height: 30px">暂无报价</span>
            <span class="aa">留言咨询</span><span style="width: 225px;height: 30px; color: #000;line-height: 30px"><a href="/gongqiu/liuyan.jsp">让我联系您</a></span>
        </div>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <div  style="text-align: center;font-size: 19px;margin-top: 50px" >${qiu1.neirong}</div>
        <br/>


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
    </div>
    <%--<div style="width: 80%;margin: 0 auto">--%>
        <%--<div class="form-group">--%>
            <%--<div  style="text-align: center" ><h2>${gong1.gtitle}</h2></div>--%>
            <%--<div  style="text-align: center; color: #777777;" >发表于：${gong1.gtime}</div>--%>
        <%--</div>--%>
    <%--</div>--%>
</div>
<script src="/resources/js/jquery-3.2.1.min.js"></script>
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
            });
        </script>

</body>
</html>
