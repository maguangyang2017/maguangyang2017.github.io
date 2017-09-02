<%--
  Created by IntelliJ IDEA.
  User: 马光阳
  Date: 2017/7/8
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <ul id="ztree" class="ztree"></ul>

</div>
<script>
    var ztree = $("#ztree");

//
//
//    zNodes = [
//        {
//            "checked": false,
//            "id": 1,
//            "name": "系统组织管理",
//            "open": true,
//            "pId": 0
//        },
//        {
//            "checked": false,
//            "id": 2,
//            "name": "系统管理",
//            "open": true,
//            "pId": 1
//        },
//        {
//            "checked": false,
//            "id": 3,
//            "name": "组织管理",
//            "open": true,
//            "pId": 1
//        },
//        {
//            "checked": false,
//            "id": 4,
//            "name": "角色用户管理",
//            "open": true,
//            "pId": 0
//        },
//        {
//            "checked": false,
//            "id": 5,
//            "name": "用户管理",
//            "open": true,
//            "pId": 4
//        },
//        {
//            "checked": false,
//            "id": 6,
//            "name": "角色管理",
//            "open": true,
//            "pId": 4
//        },
//        {
//            "checked": false,
//            "id": 7,
//            "name": "ww管理",
//            "open": true,
//            "pId": 1
//        }
//    ]
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
    $(document).ready(function(){
        $.get("/quanxian?m=getAll","",function(data){
//            alert(data);
            zTreeObj = $.fn.zTree.init(ztree, setting,data);
            var nodes = zTreeObj.getCheckedNodes();
            console.log(nodes);
        },"JSON");

    });
</script>
