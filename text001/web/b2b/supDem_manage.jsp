
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>供求管理</title>

    <link href="/resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/bootstrap-table-1.11.0/bootstrap-table.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/jquery-confirm/jquery-confirm.min.css" rel="stylesheet"/>
    <link href="/resources/plugins/select2/css/select2.min.css" rel="stylesheet"/>

    <!--<link href="/resources/css/common.css" rel="stylesheet"/>-->
    <style>
        body, html {height: 100%; position: relative; font-family: 'Microsoft yahei'; font-size: 13px; font-weight: 400;}
        img {vertical-align: middle;}
        a, a:hover, a:active, a:focus {text-decoration: none; -webkit-user-drag: none; outline: none; color: #000;}
        a i{font-size: 13px;}

        #main{padding: 10px 20px;}

        /* 数据表格 */
        body{font-size: 12px;}
        .table i{font-size: 12px; color: #000;}
        .bootstrap-table .table>thead>tr>th{border-bottom: none;}
        .bootstrap-table .table:not(.table-condensed), .bootstrap-table .table:not(.table-condensed)>tbody>tr>td, .bootstrap-table .table:not(.table-condensed)>tbody>tr>th, .bootstrap-table .table:not(.table-condensed)>tfoot>tr>td, .bootstrap-table .table:not(.table-condensed)>tfoot>tr>th, .bootstrap-table .table:not(.table-condensed)>thead>tr>td{padding: 12px 8px;}
        /* 分页 */
        .pagination>.active>a, .pagination>.active>span, .pagination>.active>a:hover, .pagination>.active>span:hover, .pagination>.active>a:focus, .pagination>.active>span:focus{background: #f5f5f5; color: #000; border-color: #7d7d7d;}
        .pagination>li>a, .pagination>li>span{color: #000;}.dropdown-menu>.active>a, .dropdown-menu>.active>a:hover, .dropdown-menu>.active>a:focus{background-color: #999;}
        /* bootstrap */
        .jconfirm .jconfirm-box .jconfirm-buttons button{-webkit-border-radius: 0; border-radius: 0;}
        .btn:active{-webkit-box-shadow: none; box-shadow: none;}
    </style>
</head>
<body>
<div id="main">
    <div id="toolbar">
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增用户</a>--%>
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="updateAction()"><i class="zmdi zmdi-edit"></i> 编辑用户</a>--%>
        <%--<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除供求</a>--%>
    </div>
    <table id="table"></table>
</div>
<!-- 新增 -->
<!--<div id="createDialog" class="crudDialog" hidden>-->
<!--<form>-->
<!--<div class="form-group">-->
<!--<label for="input1">标题</label>-->
<!--<input id="input1" type="text" class="form-control">-->
<!--</div>-->
<!--<div class="form-group">-->
<!--<label for="input2">名称</label>-->
<!--<input id="input2" type="text" class="form-control">-->
<!--</div>-->
<!--<div class="form-group">-->
<!--<label for="input3">根目录</label>-->
<!--<input id="input3" type="text" class="form-control">-->
<!--</div>-->
<!--<div class="form-group">-->
<!--<label for="input4">图标</label>-->
<!--<input id="input4" type="text" class="form-control">-->
<!--</div>-->
<!--</form>-->
<!--</div>-->
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
            url: '/index/fabu?m=select',
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
            //sidePagination: 'server',
            //silentSort: false,
            smartDisplay: false,
            idField: 'id',
            sortName: 'id',
            sortOrder: 'desc',
            escape: true,
            searchOnEnterKey: true,
            idField: 'systemId',
            maintainSelected: true,
            toolbar: '#toolbar',
//            private int id;//编号
//        private int uid;//发布人
//        private String name;//发布人
//        private UsersBean user;//发布人
//        private String title;//标题
//        private String description;//简介
//        private int price;//报价
//        private String address;//详细地址
//        private String content;//内容
//        private int lid;//留言
//        private Timestamp date;//发布时间
//        private int type;//供求类型
//        private int sdType;//0表示求购，1表示供应
//        private String ssdType;//求购信息||供应信息
//        private int status;//状态：0表示已删除，1表示正常
            columns: [
                {field: 'state', checkbox: true},
                {field: 'id', title: '编号', sortable: true, halign: 'center',align:'center'},
                {field: 'title', title: '供求标题', halign: 'center',align:'center'},
                {field: 'name', title: '发布人',  halign: 'center',align:'center'},
                {field: 'description', title: '简介',  halign: 'center',align:'center'},
                {field: 'price', title: '报价',  halign: 'center',align:'center'},
                {field: 'address', title: '详细地址',  halign: 'center',align:'center'},
//                {field: 'date', title: '发布时间',  halign: 'center',align:'center'},
                {field: 'ssdType', title: '求购/供应/产品库/公司库',  halign: 'center',align:'center'},
                {field: 'content', title: '内容', halign: 'center',align:'center',width:200,visible:false},
//                {field: 'description', title: '简介',  halign: 'center',align:'center'},
                {field: 'date', title: '发布时间', sortable: true, halign: 'center',align:'center'},
                {field: 'action', title: '操作', halign: 'center', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}
            ]
        }).on('all.bs.table', function (e, name, args) {
            $('[data-toggle="tooltip"]').tooltip();
            $('[data-toggle="popover"]').popover();
        });
    });
    function actionFormatter(value, row, index) {
        return [
//            '<a class="like" href="javascript:void(0)" data-toggle="tooltip" title="详细内容"><i class="glyphicon glyphicon-list-alt"></i></a>　',
//            '<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="修改"><i class="glyphicon glyphicon-edit"></i></a>　',
            '<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="删除"><i class="glyphicon glyphicon-remove"></i></a>'
        ].join('');
    }

    window.actionEvents = {
        'click .like': function (e, value, row, index) {
//            alert('You click like icon, row: ' + JSON.stringify(row));
            console.log(value, row, index);
            //详细内容
            $.confirm({
                type: 'dark',
                animationSpeed: 300,
                title: '详细信息',
                content: "url:/webFronts/supDem/message?m=ucPage&id="+row.id,
                columnClass: 'col-md-10',
                buttons: {
                    confirm: {
                        text: '确认',
                        btnClass: 'waves-effect waves-button'
                    },
                    cancel: {
                        text: '取消',
                        btnClass: 'waves-effect waves-button'
                    }
                }
            });
        },
        'click .edit': function (e, value, row, index) {
//            alert('You click edit icon, row: ' + JSON.stringify(row));
            console.log(value, row, index);
            //修改新闻
            var url = "/admin/manage/news?m=edit&id="+row.id;
            $.confirm({
                type: 'dark',
                animationSpeed: 300,
                title: '修改新闻',
                content: "url:"+url,
                columnClass: 'col-md-10',
                buttons: {
                    confirm: {
                        text: '确认',
                        btnClass: 'waves-effect waves-button',
                        action: function () {
                            var id = row.id;//编号
                            var typeID = $("#select1").val();//新闻类型
                            var title = $("#input1").val();//新闻标题
                            var content = $("#textarea1").val();//新闻内容
                            $.post("/admin/manage/news?m=updateNew",{"id":id,"typeID":typeID,"title":title,"content":content},function (msg) {
                                $.alert(msg);
                                $table.bootstrapTable("refresh");
                            },'text');
                        }
                    },
                    cancel: {
                        text: '取消',
                        btnClass: 'waves-effect waves-button'
                    }
                }
            });
        },
        'click .remove': function (e, value, row, index) {
//            alert('You click remove icon, row: ' + JSON.stringify(row));
            //删除供求
            console.log(value, row, index);
            $.post("/admin/manage/supDem?m=delete",{'id':row.id},function (msg) {
                $.alert(msg);
                $table.bootstrapTable("refresh");
            },'text');
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
    function createAction() {
        $.confirm({
            type: 'dark',
            animationSpeed: 300,
            title: '新增新闻',
            content: "url:/admin/manage/news?m=edit",
            columnClass: 'col-md-10',
            buttons: {
                confirm: {
                    text: '确认',
                    btnClass: 'waves-effect waves-button',
                    action: function () {
                        var typeID = $("#select1").val();//新闻类型
                        var title = $("#input1").val();//新闻标题
                        var content = $("#textarea1").val();//新闻内容
                        $.post("/admin/manage/news?m=addNew",{"typeID":typeID,"title":title,"content":content},function (msg) {
                            $.alert(msg);
                            $table.bootstrapTable("refresh");
                        },'text');
                    }
                },
                cancel: {
                    text: '取消',
                    btnClass: 'waves-effect waves-button'
                }
            }
        });
    }
    // 编辑
    function updateAction() {
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
                type: 'blue',
                animationSpeed: 300,
                title: '编辑系统',
                content: $('#createDialog').html(),
                buttons: {
                    confirm: {
                        text: '确认',
                        btnClass: 'waves-effect waves-button',
                        action: function () {
                            $.alert('确认');
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
    // 删除
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
                content: '确认删除该系统吗？',
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
</script>
</body>
</html>