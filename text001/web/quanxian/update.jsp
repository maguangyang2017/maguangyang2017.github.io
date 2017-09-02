<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/7
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form onsubmit="return false">
    <div class="form-group">
        <label for="input1up">权限</label>
        <input id="input1up" type="text" value="${quanxian.qname}" class="form-control">
    </div>
    <div class="form-group">
        <label for="input3up">url</label>
        <input id="input3up"  type="text" value="${quanxian.urll}" class="form-control">
    </div>
</form>
