<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/27 0027
  Time: 上午 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form onsubmit="return false">
    <div class="form-group">
        <select  id="selectpidup"  class="form-group">
            <option value="0">请选择父级</option>
            <c:forEach items="${types}" var="t">
                <c:choose>
                    <c:when test="${type.pid == t.id}">
                        <option value="${t.id}" selected="selected"  >${t.title}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${t.id}">${t.title}</option>
                    </c:otherwise>
                </c:choose>

            </c:forEach>
        </select>
    </div>
    <div class="form-group">
        <label for="input1up">标题</label>
        <input id="input1up" type="text" value="${type.title}" class="form-control">
    </div>
    <div class="form-group">
        <label for="input3up">描述</label>
        <input id="input3up"  type="text" value="${type.description}" class="form-control">
    </div>

</form>

