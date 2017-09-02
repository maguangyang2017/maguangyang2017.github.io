<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/20
  Time: 8:29
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
    <title>留言</title>

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
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增新闻</a>--%>


    </div>
    <table id="table"></table>
</div>
<!-- 新增 -->
<div id="createDialog" class="crudDialog" hidden>
    <form onsubmit="return false">
        <div class="form-group">
            <label for="input1">标题</label>
            <input id="input1" type="text" value="" class="form-control">
        </div>
        <div class="form-group">
            <label for="input3">内容</label>
            <input id="input3"  type="text" value="" class="form-control">
        </div>

    </form>
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
    var servlet_url = "/index/geren/liuyanguanli";
    $("#input1").val("ssss");
    $(function() {
        $(document).on('focus', 'input[news="text"]', function() {
            $(this).parent().find('label').addClass('active');
        }).on('blur', 'input[news="text"]', function() {
            if ($(this).val() == '') {
                $(this).parent().find('label').removeClass('active');
            }
        });
        // bootstrap table初始化
        // http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
        $table.bootstrapTable({
            url: servlet_url+'?m=getall',
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
            classes: 'table table-hover table-no-bordered',

            smartDisplay: false,
            idField: 'id',
            sortName: 'id',
            sortOrder: 'desc',
            escape: true,
            searchOnEnterKey: true,
            maintainSelected: true,
            toolbar: '#toolbar',
            columns: [
                {field: 'state', checkbox: true},
                {field: 'id', title: '编号',  halign: 'center',align:"center"},
                {field: 'name', title: '名字',  halign: 'center',align:"center"},
                {field: 'dian', title: '电话',  halign: 'center',align:"center"},
                {field: 'shou', title: '手机',  halign: 'center',align:"center"},
                {field: 'you', title: '邮箱',  halign: 'center',align:"center"},
                {field: 'content', title: '内容',  halign: 'center',align:"center"},
                {field: 'ctime', title: '创建时间',  halign: 'center',align:"center", formatter: 'timeFormatter'},
                {field: 'action', title: '操作', halign: 'center', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}
            ]
        }).on('all.bs.table', function (e, name, args) {
            $('[data-toggle="tooltip"]').tooltip();
            $('[data-toggle="popover"]').popover();
        });
    });
    function timeFormatter(value,row,index){
        return new Date(row.ctime).format("yyyy-MM-dd");
    }
    function actionFormatter(value, row, index) {
        return [
            '<a class="like" href="javascript:void(0)" data-toggle="tooltip" title="Like"><i class="glyphicon glyphicon-heart"></i></a>　',
            '<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
            '<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
        ].join('');
    }
    window.actionEvents = {
        'click .like': function (e, value, row, index) {
//            alert('You click like icon, row: ' + JSON.stringify(row));
//            console.log(value, row, index);
        },
        'click .edit': function (e, value, row, index) {
//            alert('You click edit icon, row: ' + JSON.stringify(row));
//            $.confirm({
//                content: 'url:'+servlet_url+"?m=getnewbyid&id="+row.id,
//                title: '修改',
//                buttons:{
//                    confirm:{
//                        text:"确定",
//                        action:function(){
//                            $.post(servlet_url+"?m=update",{
//                                id:row.id,
//                                title:$("#input1up").val(),
//                                content:$("#input3up").val()
//                            },function(txt){
//                                //服务器端响应内容回调函数
//                                $.alert(txt.message);
//                                //$("#createDialog").html(ht);
//                                $table.bootstrapTable('refresh');
//                            },"json")
//                        }
//                    },
//                    cancle:{
//                        text:"取消"
//                    }
//
//                }
//            });
//            console.log(value, row, index);
        },
        'click .remove': function (e, value, row, index) {
            removeByUniqueId = row.id;
            alert('You click remove icon, row: ' + JSON.stringify(row));
            $.confirm({
                title:"提示",
                content:"是否永久删除数据？",
                buttons:{
                    confirm:{
                        text:"确定",
                        action:function(){
                            //执行删除操作
                            $.get(servlet_url+"?m=delete",{'id':row.id},function(txt){
                                $.alert(txt.message);

                                $table.bootstrapTable('refresh');
                            },"json");
                        }
                    },
                    cancle:{
                        text:"取消"
                    }
                }
            })
            console.log(value, row, index);
        }
    };
    function detailFormatter(index, row) {
        var html = [];
        $.each(row, function (key, value) {
            html.push('<p><b>' + key + ':</b> ' + value + '</p>');
        });
        return html.join('');
    }
    // 新增
    var ht = $("#createDialog").html();
    function createAction() {

        $("#createDialog").html("");
        $.confirm({
            type: 'dark',
            animationSpeed: 300,
            title: '新增新闻',
            content: ht,
            buttons: {
                confirm: {
                    text: '确认',
                    btnClass: 'waves-effect waves-button',
                    action: function () {

                        var t =$("#input1").val();
                        var desc = $("#input3").val();
                        var pid = $("#selectpid").val();
                        alert(t+"  "+desc);
                        if(t==""){
                            $.alert('标题不能为空');
                        }else{
                            $.get(servlet_url+"?m=add",{"title":t,"content":desc},function(txt) {

                                $("#createDialog").html(ht);
                                $.confirm({
                                    title:"提示",
                                    content:txt.message,
                                    buttons: {
                                        confirm: {
                                            text: '确认',
                                            btnClass: 'waves-effect waves-button',
                                            action: function () {
                                                $table.bootstrapTable('refresh');
                                            }
                                        }
                                    }
                                });
                            },"json");
                        }

                    }
                },
                cancel: {
                    text: '取消',
                    btnClass: 'waves-effect waves-button'
                }
            }
        });
    }
    function deleteAction() {
        var rows = $table.bootstrapTable('getSelections');
        if (rows.length == 0) {
            $.confirm({
                title: false,
                content: '请至少选择一条记录！',
                autoClose: 'cancel|3000',
                backgroundDismiss: true,
                buttons: {
                    cancel: {
                        text: '取消',
                        btnClass: 'waves-effect waves-button'
                    }
                }
            });
        } else {
            $.confirm({
                type: 'red',
                animationSpeed: 300,
                title: false,
                content: '确认删除该新闻吗？',
                buttons: {
                    confirm: {
                        text: '确认',
                        btnClass: 'waves-effect waves-button',
                        action: function () {
                            var ids = new Array();
                            for (var i in rows) {
                                ids.push(rows[i].systemId);
                            }
                            $.alert('删除：id=' + ids.join("-"));
                        }
                    },
                    cancel: {
                        text: '取消',
                        btnClass: 'waves-effect waves-button'
                    }
                }
            });
        }
    }
    Date.prototype.format = function(fmt) {
        var o = {
            "M+" : this.getMonth()+1,                 //月份
            "d+" : this.getDate(),                    //日
            "h+" : this.getHours(),                   //小时
            "m+" : this.getMinutes(),                 //分
            "s+" : this.getSeconds(),                 //秒
            "q+" : Math.floor((this.getMonth()+3)/3), //季度
            "S"  : this.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt)) {
            fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
        }
        for(var k in o) {
            if(new RegExp("("+ k +")").test(fmt)){
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
            }
        }
        return fmt;
    }

</script>
</body>
</html>
