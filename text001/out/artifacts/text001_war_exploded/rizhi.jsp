<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/13
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>日志记录</title>
    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/bootstrap-table-1.11.0/bootstrap-table.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/jquery-confirm/jquery-confirm.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/select2/css/select2.min.css" rel="stylesheet"/>

    <link href="/resources/css/common.css" rel="stylesheet"/>
</head>
<body>
<div id="main">
    <div id="toolbar">
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增类型</a>--%>
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="updateAction()"><i class="zmdi zmdi-edit"></i> 编辑类型</a>--%>
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除类型</a>--%>
    </div>
    <table id="table"></table>
</div>

<script src="/resources/plugins/jquery.1.12.4.min.js"></script>
<script src="/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/plugins/bootstrap-table-1.11.0/bootstrap-table.min.js"></script>
<script src="/resources/plugins/bootstrap-table-1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="/resources/plugins/waves-0.7.5/waves.min.js"></script>
<script src="/resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
<script src="/resources/plugins/select2/js/select2.min.js"></script>

<script src="/resources/js/common.js"></script>
<script>
    var $table = $('#table');
    $(function() {
        $(document).on('focus', 'input[type="text"]', function() {
            $(this).parent().find('label').addClass('active');
        }).on('blur', 'input[type="text"]', function() {
            if ($(this).val() == '') {
                $(this).parent().find('label').removeClass('active');
            }
        });
        // bootstrap table初始化
        // http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
        $table.bootstrapTable({
            url: '/manage/index/rizhi',
            height: getHeight(),
            striped: true,
            search: true,
            searchOnEnterKey: true,
            showRefresh: true,
            showToggle: true,
            showColumns: true,
            minimumCountColumns: 2,
            showPaginationSwitch: true,
            clickToSelect: true,
            detailView: true,
            detailFormatter: 'detailFormatter',
            pagination: true,
            paginationLoop: false,
            classes: 'table table-hover',
            smartDisplay: false,
            idField: 'id',
            sortName: 'id',
            sortOrder: 'desc',
            escape: true,
            searchOnEnterKey: true,
            idField: 'id',
            maintainSelected: true,
            toolbar: '#toolbar',
            columns: [
                {field: 'state', checkbox: true},
                {field: 'id', title: '编号', halign: 'center',align:"center"},
                {field: 'caozuo', title: '操作',halign: 'center',align:"center"},
                {field: 'user', title: '操作用户', halign: 'center',align:"center"},
                {field: 'ctime', title: '操作时间',halign: 'center',align:"center"},
//                {field: 'haoshi', title: '耗时', halign: 'center',align:"center"},
                {field: 'url', title: '请求路径', halign: 'center',align:"center"},
                {field: 'qtype', title: '请求类型', halign: 'center',align:"center"},
                {field: 'canshu', title: '请求参数', halign: 'center',align:"center"},
                {field: 'uip', title: '用户标识', halign: 'center',align:"center"},
                {field: 'biaoshi', title: 'IP地址', halign: 'center',align:"center"},
                {field: 'quanxian', title: '权限值', halign: 'center',align:"center"}
            ]
        }).on('all.bs.table', function (e, name, args) {
            $('[data-toggle="tooltip"]').tooltip();
            $('[data-toggle="popover"]').popover();
        });
    });
</script>
</body>
</html>