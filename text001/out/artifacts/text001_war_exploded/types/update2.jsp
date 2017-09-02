<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/3
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form onsubmit="return false">
    <div class="form-group">
        <label for="input1up">标题</label>
        <input id="input1up" type="text" value="${news1.title}" class="form-control">
    </div>
    <div class="form-group">
        <label for="input3up">新闻</label>
        <input id="input3up"  type="text" value="${news1.content}" class="form-control">
    </div>
</form>