<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/6
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>求购</title>
<form onsubmit="return false">
    <div style="float: left;background-color: #00B83F;border-radius: 5px 5px 0px 0px;height: 40px;width: 100px;line-height: 40px;text-align: center;font-size: 22px;color: #FFFFFF;">供应信息</div>
    <%--<div style="float: right; font-size: 20px"><a href="/zqwlogin.html" name="shou" style="text-decoration: none ;" target=“myFrameId”>发布求购信息</a></div>--%>
    <br/>

    <div style="height: 2px;width: 100%;background-color:#00ff00 ; margin-bottom: 20px;margin-top: 20px"></div>
    <div class="form-group">
        <c:forEach items="${qiu}" var="t">
            <div style="height: 80px;width: 100%;">
                <div style="border-bottom: 2px dashed #777777;width: 100%;">
                <span><a>[娱乐]</a></span>
                <span  selected="selected" style="margin-left: 30px"><a href="/index/qiu?m=geteId&id=${t.id}" style="text-decoration: none">${t.qtitle}</a></span>
                <span style="float: right;"><a >${t.qtime}</a></span>
                </div>
            </div>
        </c:forEach>
    </div>
</form>
    </div>
    <script type="text/javascript" charset="utf-8" src="/utf8-jsp/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/utf8-jsp/ueditor.all.js"> </script>
    <script type="text/javascript" charset="utf-8" src="/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
    <style type="text/css">
        div{
            width:100%;
        }
    </style>
</head>
<body>
<%--<div>--%>
    <%--<script id="editor" type="text/plain" style="width:1024px;height:500px;"></script>--%>
<%--</div>--%>
<%--<div id="btns">--%>
    <%--<div>--%>
        <%--<button onclick="getAllHtml()">获得整个html的内容</button>--%>
        <%--<button onclick="getContent()">获得内容</button>--%>
        <%--<button onclick="setContent()">写入内容</button>--%>
        <%--<button onclick="setContent(true)">追加内容</button>--%>
        <%--<button onclick="getContentTxt()">获得纯文本</button>--%>
        <%--<button onclick="getPlainTxt()">获得带格式的纯文本</button>--%>
        <%--<button onclick="hasContent()">判断是否有内容</button>--%>
        <%--<button onclick="setFocus()">使编辑器获得焦点</button>--%>
        <%--<button onmousedown="isFocus(event)">编辑器是否获得焦点</button>--%>
        <%--<button onmousedown="setblur(event)" >编辑器失去焦点</button>--%>

    <%--</div>--%>
    <%--<div>--%>
        <%--<button onclick="getText()">获得当前选中的文本</button>--%>
        <%--<button onclick="insertHtml()">插入给定的内容</button>--%>
        <%--<button id="enable" onclick="setEnabled()">可以编辑</button>--%>
        <%--<button onclick="setDisabled()">不可编辑</button>--%>
        <%--<button onclick=" UE.getEditor('editor').setHide()">隐藏编辑器</button>--%>
        <%--<button onclick=" UE.getEditor('editor').setShow()">显示编辑器</button>--%>
        <%--<button onclick=" UE.getEditor('editor').setHeight(300)">设置高度为300默认关闭了自动长高</button>--%>
    <%--</div>--%>

    <%--<div>--%>
        <%--<button onclick="getLocalData()" >获取草稿箱内容</button>--%>
        <%--<button onclick="clearLocalData()" >清空草稿箱</button>--%>
    <%--</div>--%>

<%--</div>--%>
<%--<div>--%>
    <%--<button onclick="createEditor()">--%>
        <%--创建编辑器</button>--%>
    <%--<button onclick="deleteEditor()">--%>
        <%--删除编辑器</button>--%>
<%--</div>--%>

<%--<script type="text/javascript">--%>

    <%--//实例化编辑器--%>
    <%--//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例--%>
    <%--var ue = UE.getEditor('editor');--%>


    <%--function isFocus(e){--%>
        <%--alert(UE.getEditor('editor').isFocus());--%>
        <%--UE.dom.domUtils.preventDefault(e)--%>
    <%--}--%>
    <%--function setblur(e){--%>
        <%--UE.getEditor('editor').blur();--%>
        <%--UE.dom.domUtils.preventDefault(e)--%>
    <%--}--%>
    <%--function insertHtml() {--%>
        <%--var value = prompt('插入html代码', '');--%>
        <%--UE.getEditor('editor').execCommand('insertHtml', value)--%>
    <%--}--%>
    <%--function createEditor() {--%>
        <%--enableBtn();--%>
        <%--UE.getEditor('editor');--%>
    <%--}--%>
    <%--function getAllHtml() {--%>
        <%--alert(UE.getEditor('editor').getAllHtml())--%>
    <%--}--%>
    <%--function getContent() {--%>
        <%--var arr = [];--%>
        <%--arr.push("使用editor.getContent()方法可以获得编辑器的内容");--%>
        <%--arr.push("内容为：");--%>
        <%--arr.push(UE.getEditor('editor').getContent());--%>
        <%--alert(arr.join("\n"));--%>
    <%--}--%>
    <%--function getPlainTxt() {--%>
        <%--var arr = [];--%>
        <%--arr.push("使用editor.getPlainTxt()方法可以获得编辑器的带格式的纯文本内容");--%>
        <%--arr.push("内容为：");--%>
        <%--arr.push(UE.getEditor('editor').getPlainTxt());--%>
        <%--alert(arr.join('\n'))--%>
    <%--}--%>
    <%--function setContent(isAppendTo) {--%>
        <%--var arr = [];--%>
        <%--arr.push("使用editor.setContent('欢迎使用ueditor')方法可以设置编辑器的内容");--%>
        <%--UE.getEditor('editor').setContent('欢迎使用ueditor', isAppendTo);--%>
        <%--alert(arr.join("\n"));--%>
    <%--}--%>
    <%--function setDisabled() {--%>
        <%--UE.getEditor('editor').setDisabled('fullscreen');--%>
        <%--disableBtn("enable");--%>
    <%--}--%>

    <%--function setEnabled() {--%>
        <%--UE.getEditor('editor').setEnabled();--%>
        <%--enableBtn();--%>
    <%--}--%>

    <%--function getText() {--%>
        <%--//当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容--%>
        <%--var range = UE.getEditor('editor').selection.getRange();--%>
        <%--range.select();--%>
        <%--var txt = UE.getEditor('editor').selection.getText();--%>
        <%--alert(txt)--%>
    <%--}--%>

    <%--function getContentTxt() {--%>
        <%--var arr = [];--%>
        <%--arr.push("使用editor.getContentTxt()方法可以获得编辑器的纯文本内容");--%>
        <%--arr.push("编辑器的纯文本内容为：");--%>
        <%--arr.push(UE.getEditor('editor').getContentTxt());--%>
        <%--alert(arr.join("\n"));--%>
    <%--}--%>
    <%--function hasContent() {--%>
        <%--var arr = [];--%>
        <%--arr.push("使用editor.hasContents()方法判断编辑器里是否有内容");--%>
        <%--arr.push("判断结果为：");--%>
        <%--arr.push(UE.getEditor('editor').hasContents());--%>
        <%--alert(arr.join("\n"));--%>
    <%--}--%>
    <%--function setFocus() {--%>
        <%--UE.getEditor('editor').focus();--%>
    <%--}--%>
    <%--function deleteEditor() {--%>
        <%--disableBtn();--%>
        <%--UE.getEditor('editor').destroy();--%>
    <%--}--%>
    <%--function disableBtn(str) {--%>
        <%--var div = document.getElementById('btns');--%>
        <%--var btns = UE.dom.domUtils.getElementsByTagName(div, "button");--%>
        <%--for (var i = 0, btn; btn = btns[i++];) {--%>
            <%--if (btn.id == str) {--%>
                <%--UE.dom.domUtils.removeAttributes(btn, ["disabled"]);--%>
            <%--} else {--%>
                <%--btn.setAttribute("disabled", "true");--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>
    <%--function enableBtn() {--%>
        <%--var div = document.getElementById('btns');--%>
        <%--var btns = UE.dom.domUtils.getElementsByTagName(div, "button");--%>
        <%--for (var i = 0, btn; btn = btns[i++];) {--%>
            <%--UE.dom.domUtils.removeAttributes(btn, ["disabled"]);--%>
        <%--}--%>
    <%--}--%>

    <%--function getLocalData () {--%>
        <%--alert(UE.getEditor('editor').execCommand( "getlocaldata" ));--%>
    <%--}--%>

    <%--function clearLocalData () {--%>
        <%--UE.getEditor('editor').execCommand( "clearlocaldata" );--%>
        <%--alert("已清空草稿箱")--%>
    <%--}--%>
<%--</script>--%>
<%--<form>--%>
    <%--<input type="submit" value="提交" href=""/>--%>
<%--</form>--%>
</body>
</html>
