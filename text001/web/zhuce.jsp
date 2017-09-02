<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/3
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <script type="text/javascript" src="js/jquery.js" ></script>
    <style>
        /*body, button, select, textarea, input, label, option, fieldset, legend{font-family: 微软雅黑E\8F6F\96C5\9ED1,Tahoma,Verdana;}*/
        body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, legend, input, textarea, button, p, blockquote, th, td{margin: 0;padding: 0;}
        a,img{border:0;margin: 0;padding: 0;}
        a{text-decoration: none;}
        li{list-style-type:none;}
        .a{text-align: center; width: 100%; height: 50px;margin: 0 auto; text-align: center; line-height: 50px;}
        .b{width:900px; height: 250px; border-bottom: 1px solid black;margin: 0 auto;}
        .b0{width: 900px; height: 30px;}
        .b00{width: 800px; height: 30px;}
        .b1{color: red;}
        .b2{float: right;}
        .b3{width: 820px; height: 200px;margin: 0 auto; margin-top: 20px;}
        .c{width:900px; height:380px;margin: 0 auto;}
        .c1{width: 740px; height: 350px; margin: 0 auto;}
        .d{width: 800px; height: 660px; border-top: 1px solid black; margin: 0 auto;}
        .d1{width:750px; height: 520px;margin: 0 auto;}
        .d1 tr td{float: left;}
        .d2{width: 200px; height: 50px; margin: 0 auto;margin-top: 10px;}
        .dd{width: 100px; height: 200px;}
        .bktxt12{margin-right:30px;}
        .gongying{width:600px;height:1000px;border:1px solid red;margin:0 auto;}
        .xinxi{width:100px;height:50px;background-color: #2ecc71;float:left;text-align:center;line-height:50px;}
    </style>
</head>
<body>
<form action="/index/zhuce" method="post">
    <div class="a"><h3>志趣网用户注册</h3></div>
    <div class="b">
        <div class="b0"><span style="float: left;">基本信息</span><span style="float: right;">打<span class="b1">*</span>为必填项</span></div>
        <table class="b3">
            <tr>
                <td class="b2"><span class="b1">*</span>会员登录名：</td>
                <td><input type="text" name="name" style="width: 350px;" onblur="t(this)"/></td>
                <td><div id="tag1" style="display:block;float: left;">会员登陆名由两个及以上字符组成,不可修改</div><div id="tag" style="display:none;color: red;float:left;">会员登陆名由两个及以上字符组成!</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>密码：</td>
                <td><input type="password" name="password" style="width: 350px;" onblur="t1(this)" id="mm"/></td>
                <td><div id="tag3" style="display:block;float: left;">密码由5-19个英文字母(区分大小写)或数字组成</div><div id="tag2" style="display:none;color: red;float:left;">密码由5-19个英文字母(区分大小写)或数字组成!</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>确认密码：</td>
                <td><input type="password" name="okpassword" style="width: 350px;" onblur="t2(this)" id="qmm"/></td>
                <td><div id="tag5" style="display:block;float: left;">请再次输入您上面填写的密码</div><div id="tag4" style="display:none;color: red;float:left;">两次输入的密码不一致。</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>商务Email:</td>
                <td><input type="text" name="shangwu" style="width: 350px;" onblur="t3(this)"/></td>
                <td><div id="tag7" style="display:block;float: left;">重要!不可修改！</div><div id="tag6" style="display:none;color: red;float:left;"> 电子邮件地址格式不正确。</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>安全Email:</td>
                <td><input type="text" name="anquan" style="width: 350px;" onblur="t4(this)"/></td>
                <td><div id="tag9" style="display:block;float: left;">重要!找回密码必需!</div><div id="tag8" style="display:none;color: red;float:left;"> 邮件地址格式不正确，请重新输入。</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>手机：</td>
                <td><input type="text" name="shouji" style="width: 350px;" onblur="t5(this)"/></td>
                <td><div id="tag11" style="display:block;float: left;">必须认真填写，无法修改!</div><div id="tag10" style="display:none;color: red;float:left;">  请填写正确的手机号码。</div></td>
            </tr>
        </table>
    </div>
    <div class="c">
        <div class="b0"><span style="float: left;">联系方式</span><span style="float: right;">打<span class="b1">*</span>为必填项</span></div>
        <table class="c1">
            <tr>
                <td class="b2"><span class="b1">*</span>公司名称：</td>
                <td><input type="text" name="gongsi" style="width: 350px;"/></td>
                <td><div style="display:block;float: left;">请完整填写在工商局注册的公司全称。</div></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>联系人：</td>
                <td><input type="text" name="lianxiren" style="width: 350px;"/></td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>性别：</td>
                <td><input type="radio" name="xingbie"/>&nbsp;&nbsp;先生&nbsp;&nbsp;<input type="radio" name="xingbie"/>&nbsp;&nbsp;女士</td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>职位：</td>
                <td>
                    <select size="1" style="width: 250px;" name="zhiwei">
                        <option selected="selected">销售人员</option>
                        <option>财务人员</option>
                        <option>行政人员</option>
                        <option>宣传人员</option>
                        <option>业务经理</option>
                        <option>商业顾问</option>
                        <option>管理人员</option>
                        <option>采购人员</option>
                        <option>创始人</option>
                        <option>工程师</option>
                        <option>主任</option>
                        <option>专家</option>
                        <option>其他</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>省份：</td>
                <td valign="top">
                    <select name="shengfen" id="userCorpProvince" style="width:250px">
                        <c:forEach var="sf" items="${requestScope.SF}">
                            <option value="<c:out value="${sf.id}"></c:out>">${sf.name}</option>
                        </c:forEach>
                    </select>
                </td>

            <tr>
                <td class="b2"><span class="b1">*</span>城市：</td>
                <td>
                    <select name="chengshi" id="prov" style="width:250px">

                    </select>
                </td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>公司地址：</td>
                <td><input type="text" name="gongsidizhi" style="width: 350px;"/></td>
                <td><div style="float: left;">请填写公司地址</div></td>
            </tr>
            <tr>
                <td class="b2">邮编：</td>
                <td><input type="text" name="youbian" style="width: 350px;"/></td>
                <td></td>
            </tr>
            <tr>
                <td class="b2">固定电话：</td>
                <td><input type="text" name="gudingdianhua" style="width: 300px;"/></td>
                <td><div style="float: left;">正确格式类似：021-58883128</div></td>
            </tr>
            <tr>
                <td class="b2">传真：</td>
                <td><input type="text" name="chuanzhen" style="width: 300px;"/></td>
                <td><div style="float: left;">正确格式类似：021-58883128</div></td>
            </tr>
            <tr>
                <td class="b2">QQ：</td>
                <td><input type="text" name="qq" style="width: 350px;"/></td>
                <td><div style="float: left;">建议您填写!</div></td>
            </tr>
            <tr>
                <td class="b2">MSN：</td>
                <td><input type="text" name="msn" style="width: 350px;"/></td>
                <td><div style="float: left;">建议您填写!</div></td>
            </tr>
        </table>
    </div>

    <div class="d">
        <div class="b00"><span style="float: left;">公司信息</span><span style="float: right;">打<span class="b1">*</span>为必填项</span></div>
        <div><span class="b1">提示：</span>注册成功后， 请到管理平台的“我的资料”中，尽快完善相关公司信息。上传LOGO图片，并详细填写公司简介的会员， 您还可以免费注册<a href="#">志趣社区</a>会员， 和更多朋友分享自己经验!</div>
        <table class="d1">
            <tr>
                <td class="b2"><span class="b1">*</span>所属类型：</td>
                <td>
                    <select style="width: 250px;" name="suoshutype">
                        <option selected="selected">供应商</option>
                        <option>采购商</option>
                        <option>两者都是</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>企业性质：</td>
                <td>
                    <select style="width: 250px;" name="qiyexingzhi">
                        <option selected="selected">国有</option>
                        <option>集体</option>
                        <option>个体私营</option>
                        <option>外商独资</option>
                        <option>中外合资</option>
                        <option>中外合作</option>
                        <option>国外企业</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>经营模式：</td>
                <td>
                    <select style="width: 250px;" name="jingyingmoshi">
                        <option selected="selected">生产型</option>
                        <option>贸易型</option>
                        <option>服务型</option>
                        <option>其他类型</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>注册资金：</td>
                <td>
                    <select style="width: 250px;" name="money">
                        <option selected="selected">人名币20万元以下</option>
                        <option>人名币20万元-50万元</option>
                        <option>人名币50万元-100万元</option>
                        <option>人名币100万元-200万元</option>
                        <option>人名币200万元-500万元</option>
                        <option>人名币500万元-1000万元</option>
                        <option>人名币1000万元-5000万元</option>
                        <option>人名币5000万元-1亿元</option>
                        <option>人名币元一亿以上</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>年营业额：</td>
                <td>
                    <select style="width: 250px;" name="nianmoney">
                        <option selected="selected">人名币1-20万元</option>
                        <option>人名币20万元-50万元</option>
                        <option>人名币50万元-100万元</option>
                        <option>人名币100万元-200万元</option>
                        <option>人名币200万元-500万元</option>
                        <option>人名币500万元-1000万元</option>
                        <option>人名币1000万元-2000万元</option>
                        <option>人名币2000万元-5000万元</option>
                        <option>人名币5000万元以上</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>雇员数量：</td>
                <td>
                    <select style="width: 250px;" name="guyuan">
                        <option selected="selected">1-5人</option>
                        <option>6-10人</option>
                        <option>11-30人</option>
                        <option>31-50人</option>
                        <option>51-100人</option>
                        <option>100-200人</option>
                        <option>201-500人</option>
                        <option>501-1000人</option>
                        <option>1001-2000人</option>
                        <option>2001-5000人</option>
                        <option>5001-10000人</option>
                        <option>更多</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>主营业务：</td>
                <td><input type="text" name="zhuyingyewu" style="width: 250px;"/></td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>进出口权：</td>
                <td><input type="radio" name="jinchukou"/>&nbsp;&nbsp;有&nbsp;&nbsp;<input type="radio" name="jinchukou"/>&nbsp;&nbsp;无</td>
                <td></td>
            </tr>
            <tr>
                <td class="b2"><span class="b1">*</span>验证码：</td>
                <td>如看不清晰，请点击图片更换</td>
                <td></td>
            </tr>
            <tr>
                <td>请输入：<input type="text" name="yanzhengma" style="width: 400px; background-color: burlywood;"/></td>
            </tr>
        </table>
        <div>更多了解?<input type="checkbox" name="danxuan" />请发送邮件告诉我关于<a href="#">志趣网</a>的更多信息</div>
        <div class="d2">
            <input type="submit" value="提交" id = "tt" name="tijiao" style="width: 80px; height: 30px; margin-right: 20px;"/>
            <input type="button" value="重置" id="chongzhi" style="width: 80px; height: 30px;"/>
        </div>
    </div>
</form>
<script language="JavaScript">
    $.ajax({
        type: "GET",
        url: "/let",
        data: "method=sheng&pid=0",
        success: function(ms){
            $("#userCorpProvince").html(ms);
        }
    });
    function a(va) {
        $.ajax({
            type: "GET",
            url: "/let",
            data: "method=diqu&code="+va,
            success: function(ma){
                $("#prov").html(ma);
            }
        });
    }
    function t(obj){
        var patt1 = new RegExp("[\u4e00-\u9fa5A-Za-z]");
        if(!patt1.test(obj.value)){
            document.getElementById("tag").style.display="block";
            document.getElementById("tag1").style.display="none";
        }else{
            document.getElementById("tag").style.display="none";
            document.getElementById("tag1").style.display="block";
        }
    }
    function t1(obj){
        var patt1 = new RegExp("[a-zA-Z]");
        if(!patt1.test(obj.value)){
            document.getElementById("tag2").style.display="block";
            document.getElementById("tag3").style.display="none";
        }
    }
    function t2(obj){
        var mimaa = document.getElementById("mm");
        var qmima = document.getElementById("qmm");
        var m = mm.value;
        var q = qmm.value;
        if(m==q){
            document.getElementById("tag5").style.display="block";
        }else{
            document.getElementById("tag4").style.display="block";
            document.getElementById("tag5").style.display="none";
        }
    }
    function t3(obj){
        var patt1 = new RegExp("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
        if(!patt1.test(obj.value)){
            document.getElementById("tag6").style.display="block";
            document.getElementById("tag7").style.display="none";
        }
    }
    function t4(obj){
        var patt1 = new RegExp("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
        if(!patt1.test(obj.value)){
            document.getElementById("tag8").style.display="block";
            document.getElementById("tag9").style.display="none";
        }
    }
    function t5(obj){
        var patt1 = new RegExp("^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$");
        if(!patt1.test(obj.value)){
            document.getElementById("tag10").style.display="block";
            document.getElementById("tag11").style.display="none";
        }
    }
    //重置按钮
    function but(){
        location.reload(true);
    }
    //提交按钮
    function tijiao(){

    }
</script>
</body>
</html>
