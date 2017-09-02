<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/16 0016
  Time: 上午 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/bootstrap-table-1.11.0/bootstrap-table.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>



</head>

<body>
<div id="toolbar">toolbar</div>
<table id="table"></table>




<%--JSTL表达式--%>
<%--<table>--%>
    <%--<c:forEach items="${requestScope.users}" var="u">--%>
        <%--<tr>--%>
            <%--<td>--%>
                <%--<c:out value="${u.id}"></c:out>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<c:out value="${u.name}"></c:out>--%>
            <%--</td>--%>
            <%--<td >--%>
                <%--<a href="/manage/user/update?id=${u.id}">修改</a>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<a href=""></a>删除--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<script language="JavaScript">--%>
            <%--function xiugai() {--%>
                <%--window.location.href="http://localhost:8080/users/update.jsp?id=";--%>
            <%--}--%>
        <%--</script>--%>
    <%--</c:forEach>--%>
<%--</table>--%>
<script src="/resources/plugins/jquery.1.12.4.min.js"></script>
<script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/plugins/bootstrap-table-1.11.0/bootstrap-table.min.js"></script>
<script src="/resources/plugins/bootstrap-table-1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="/resources/plugins/waves-0.7.5/waves.min.js"></script>
<script>
    $('#table').bootstrapTable({
        search: true,
        searchText:"请输入姓名",
        toolbar:"#toolbar",
        showRefresh:true,
        showPaginationSwitch:true,
        pagination:true,
        pageNumber:1,
        pageSize:10,
        pageList:[10,20,30,40,100],

        columns: [{
            field: 'id',
            title: 'Item ID'
        }, {
            field: 'name',
            title: 'Item Name'
        }, {
            field: 'price',
            title: 'Item Price'
        }]
    });


</script>
</body>
</html>
