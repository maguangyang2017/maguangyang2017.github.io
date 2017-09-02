<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2017/7/12
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="/resources/plugins/zTree_v3/css/zTreeStyle/zTreeStyle.css" rel="stylesheet" />
<script src="/resources/plugins/zTree_v3/js/jquery.ztree.all.min.js" type="text/javascript"></script>

<div>
    <ul id="ztree" class="ztree"></ul>
</div>
<script>
    var ztree = $("#ztree");
    var setting = {
        check: {
            enable: true
        },
        data: {
            simpleData: {
                enable: true
            }
        }
    };
    var zTreeObj;
    $(document).ready(function () {
        $.get("/manage/juese?m=ajax_all","",function (data) {
            zTreeObj = $.fn.zTree.init(ztree,setting,data);
        },"JSON");
    });
</script>
