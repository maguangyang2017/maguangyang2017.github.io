<%--
  Created by IntelliJ IDEA.
  User: Hai
  Date: 2017/7/16
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>志趣网搜索</title>
    <link href="../resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="../resources/plugins/jquery.1.12.4.min.js"></script>
    <script src="../resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
    <style>
        .logo{width:270px; height: 73px; overflow: hidden; margin: 50px auto;font-size: 36px; font-family: '宋体'; }
        ._content{
            width: 900px; padding: 30px;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            border-top: 2px solid #888888;
            margin: 20px auto;
        }
        ._list{padding-top: 10px}
        ._list li{width: 100%; height: 30px; line-height: 30px; clear: both; box-sizing: border-box; padding: 0 10px}
        ._list label,._list p{float: left}
        ._list label{margin-right: 5px}
        ._list span{float: right; color: #888888}
    </style>
</head>
<body>
<div class="logo">
    <a href="/b2b/index.jsp"><span>志趣网</span></a>
</div>
<div style="height: 40px; width: 500px; margin: 10px auto">
    <div class="col-lg-12">
        <div class="input-group">
            <input type="text" class="form-control col-lg-7" id="guanjianzi" placeholder="搜索" style="float: left;">

            <div class="input-group-btn">
                <select class="form-control" id="select1" style="width: 80px">
                    <option value="ssnews">新闻</option>
                    <option value="ssb2b">商业</option>
                </select>
            </div>
            <span class="input-group-btn" style="float: left;">
                <button class="btn btn-default" type="button" id="sousuo">Go!</button>
            </span>
        </div><!-- /input-group -->
    </div><!-- /.col-lg-6 -->
</div>
<div class="_content">
    <ul class="_list">

    </ul>
</div>
<script>
    function add0(m){return m<10?'0'+m:m }
    function format(shijianchuo)
    {
//shijianchuo是整数，否则要parseInt转换
        var time = new Date(shijianchuo);
        var y = time.getFullYear();
        var m = time.getMonth()+1;
        var d = time.getDate();
        var h = time.getHours();
        var mm = time.getMinutes();
        var s = time.getSeconds();
        return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
    }
    $(document).ready(function () {
        var select1 = "${select1}";
        var guanjianzi = "${guanjianzi}";
        if(guanjianzi==""||select1==""){
            $("._list").html("没有找到符合数据！");
            return;
        }else {
            sousuo(select1,guanjianzi);
        }
    })
    $("#sousuo").on("click","",function () {
        var select1 = $("#select1").val();
        var guanjianzi = $("#guanjianzi").val();
        if(guanjianzi==""){
            alert("请输入搜索关键字！");
            return;
        }
        sousuo(select1,guanjianzi);
    });

    function sousuo(select1,guanjianzi) {
        $.post("/webFronts/sousuo?m="+select1,{'guanjianzi':guanjianzi},function (json) {
            var htm= "";
//            alert(json)
            if(select1=="ssnews"){
                for(i = 0;i<json.length;i++){
                    htm+="<li><p><a href=\"/news/new?id="+json[i].id+"\" target=\"_blank\">"+json[i].title+"</a></p><span>"+format(json[i].date)+"</span></li>\n" +
                        "        ";
                }
            }else if(select1=="ssb2b"){
                for(i = 0;i<json.length;i++){
                    htm+="<li><p><a href=\"/webFronts/supDem/message?m=cPage&id="+json[i].id+"\" target=\"_blank\">"+json[i].title+"</a></p><span>"+format(json[i].date)+"</span></li>\n" +
                        "        ";
                }
            }
            $("._list").html(htm);
            if(json=="[]"||json==""){
                $("._list").html("没有找到符合数据！");
            }
        },'json');
    }


</script>
</body>
</html>
