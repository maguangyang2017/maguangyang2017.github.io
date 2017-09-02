<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
	Cookie[] cookies = request.getCookies();
	boolean flag = false;
	Map<String ,Cookie> maps = new HashMap<String,Cookie>();
	if(cookies!=null) {
		for (Cookie c : cookies) {
			maps.put(c.getName(), c);
		}
		Cookie c = maps.get("id");
		if (c == null) {
			response.sendRedirect("/logon.html");
		} else if (Integer.parseInt(c.getValue()) == 0) {
			response.sendRedirect("/logon.html");
		}
	}

%>

<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>用户权限管理系统</title>

	<link href="resources/plugins/fullPage/jquery.fullPage.css" rel="stylesheet"/>
	<link href="resources/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="resources/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
	<link href="resources/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
	<link href="resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet"/>
	<link href="resources/css/admin.css" rel="stylesheet"/>
	<style>
	/** skins **/
	#zheng-upms-server #header {background: #29A176;}
	#zheng-upms-server .content_tab{background: #29A176;}
	#zheng-upms-server .s-profile>a{background: url(resources/images/zheng-upms.png) left top no-repeat;}
	
	#zheng-cms-admin #header {background: #455EC5;}
	#zheng-cms-admin .content_tab{background: #455EC5;}
	#zheng-cms-admin .s-profile>a{background: url(resources/images/zheng-cms.png) left top no-repeat;}
	
	#zheng-pay-admin #header {background: #F06292;}
	#zheng-pay-admin .content_tab{background: #F06292;}
	#zheng-pay-admin .s-profile>a{background: url(resources/images/zheng-pay.png) left top no-repeat;}
	
	#zheng-ucenter-home #header {background: #6539B4;}
	#zheng-ucenter-home .content_tab{background: #6539B4;}
	#zheng-ucenter-home .s-profile>a{background: url(resources/images/zheng-ucenter.png) left top no-repeat;}
	
	#zheng-oss-web #header {background: #0B8DE5;}
	#zheng-oss-web .content_tab{background: #0B8DE5;}
	#zheng-oss-web .s-profile>a{background: url(resources/images/zheng-oss.png) left top no-repeat;}
	
	/*#test #header {background: test;}*/
	/*#test .content_tab{background: test;}*/
	/*#test .s-profile>a{background: url(test) left top no-repeat;}*/
	</style>
</head>
<body>
<header id="header">
	<ul id="menu">
		<li id="guide" class="line-trigger">
			<div class="line-wrap">
				<div class="line top"></div>
				<div class="line center"></div>
				<div class="line bottom"></div>
			</div>
		</li>
		<li id="logo" class="hidden-xs">
			<a href="index.jsp">
				<img src="resources/images/logo.png"/>
			</a>
			<span id="system_title">权限管理系统</span>
		</li>
		<li class="pull-right">
			<ul class="hi-menu">
				<!-- 搜索 -->
				<li class="dropdown">
					<a class="waves-effect waves-light" data-toggle="dropdown" href="javascript:;">
						<i class="him-icon zmdi zmdi-search"></i>
					</a>
					<ul class="dropdown-menu dm-icon pull-right">
						<form id="search-form" class="form-inline">
							<div class="input-group">
								<input id="keywords" type="text" name="keywords" class="form-control" placeholder="搜索"/>
								<div class="input-group-btn">
									<button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
								</div>
							</div>
						</form>
					</ul>
				</li>
				<li class="dropdown">
					<a class="waves-effect waves-light" data-toggle="dropdown" href="javascript:;">
						<i class="him-icon zmdi zmdi-dropbox"></i>
					</a>
					<ul class="dropdown-menu dm-icon pull-right">
						<li class="skin-switch">
							请选择系统切换
						</li>
						<li class="divider"></li>
						<li>
							<a class="waves-effect switch-systems" href="javascript:;" systemid="1" systemname="zheng-upms-server" systemtitle="权限管理系统"><i class="zmdi zmdi-shield-security"></i> 权限管理系统</a>
						</li>
						
						<li>
							<a class="waves-effect switch-systems" href="javascript:;" systemid="2" systemname="zheng-cms-admin" systemtitle="内容管理系统"><i class="zmdi zmdi-wikipedia"></i> 内容管理系统</a>
						</li>
						
						<li>
							<a class="waves-effect switch-systems" href="javascript:;" systemid="3" systemname="zheng-pay-admin" systemtitle="支付管理系统"><i class="zmdi zmdi-paypal-alt"></i> 支付管理系统</a>
						</li>
						
						<li>
							<a class="waves-effect switch-systems" href="javascript:;" systemid="4" systemname="zheng-ucenter-home" systemtitle="用户管理系统"><i class="zmdi zmdi-account"></i> 用户管理系统</a>
						</li>
						
						<li>
							<a class="waves-effect switch-systems" href="javascript:;" systemid="5" systemname="zheng-oss-web" systemtitle="存储管理系统"><i class="zmdi zmdi-cloud"></i> 存储管理系统</a>
						</li>
					</ul>
				</li>
				<li class="dropdown">
					<a class="waves-effect waves-light" data-toggle="dropdown" href="javascript:;">
						<i class="him-icon zmdi zmdi-more-vert"></i>
					</a>
					<ul class="dropdown-menu dm-icon pull-right">
						<li class="hidden-xs">
							<a class="waves-effect" data-ma-action="fullscreen" href="javascript:fullPage();"><i class="zmdi zmdi-fullscreen"></i> 全屏模式</a>
						</li>
						<li>
							<a class="waves-effect" data-ma-action="clear-localstorage" href="javascript:;"><i class="zmdi zmdi-delete"></i> 清除缓存</a>
						</li>
						<li>
							<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-face"></i> 隐私管理</a>
						</li>
						<li>
							<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-settings"></i> 系统设置</a>
						</li>
						<li>
							<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-run"></i> 退出登录</a>
						</li>
					</ul>
				</li>
			</ul>
		</li>
	</ul>
</header>
<section id="main">
	<!-- 左侧导航区 -->
	<aside id="sidebar">
		<!-- 个人资料区 -->
		<div class="s-profile">
			<a class="waves-effect waves-light" href="javascript:;">
				<div class="sp-pic">
					<img src="resources/images/avatar.jpg"/>
				</div>
				<div class="sp-info">
					${cookie.get("username").value}
					<i class="zmdi zmdi-caret-down"></i>
				</div>
			</a>
			<ul class="main-menu">
				<li>
					<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-account"></i> 个人资料</a>
				</li>
				<li>
					<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-face"></i> 隐私管理</a>
				</li>
				<li>
					<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-settings"></i> 系统设置</a>
				</li>
				<li>
					<a class="waves-effect" href="javascript:logout();"><i class="zmdi zmdi-run"></i> 退出登录</a>
				</li>
			</ul>
		</div>
		<!-- /个人资料区 -->
		<!-- 菜单区 -->
		<ul class="main-menu">
			<li>
			<a class="waves-effect" href="javascript:Tab.addTab('首页', 'home');"><i class="zmdi zmdi-home"></i> 首页</a>
			</li>
			<li class="sub-menu system_menus system_1 0">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 系统组织管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('系统管理', 'crud.html');">系统管理</a></li>
				<li><a class="waves-effect" href="javascript:Tab.addTab('留言管理', '/liuyan.jsp');">留言管理</a></li>
				<%--<li><a class="waves-effect" href="javascript:Tab.addTab('组织管理', '/quanxian/quanxianguanli.jsp');">组织管理</a></li>--%>
				<li><a class="waves-effect" href="javascript:Tab.addTab('组织管理', '/adminMag/page/supDem?m=all');">发布管理</a></li>

			</ul>
			</li>
			<li class="sub-menu system_menus system_1 3">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts"></i> 角色用户管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('角色管理', '/lanjie/juese');">角色管理</a></li>
				<li><a class="waves-effect" href="javascript:Tab.addTab('用户管理', '/lanjie/yonghu');">用户管理</a></li>
			</ul>
			</li>
			<li class="sub-menu system_menus system_1 6">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-lock-outline"></i> 权限资源管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('权限管理', '/quanxian/quanxina.jsp');">权限管理</a></li>
			</ul>
			</li>
			<li class="sub-menu system_menus system_1 7">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-more"></i> 其他数据管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('类型管理', '/manage/type/index');">类型管理</a></li>

				<%--<li><a class="waves-effect" href="javascript:Tab.addTab('会话管理', '/manage/session/index');">会话管理</a></li>--%>
				<li><a class="waves-effect" href="javascript:Tab.addTab('日志记录', '/lanjie/rizhi');">日志记录</a></li>
				<li><a class="waves-effect" href="javascript:Tab.addTab('新闻管理', '/lanjie/new');">新闻管理</a></li>
			</ul>
			</li>
			<li class="sub-menu system_menus system_2 12" style="display:none;">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-menu"></i> 标签类目管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('标签管理', '/manage/tag/index');">标签管理</a></li>
				<li><a class="waves-effect" href="javascript:Tab.addTab('类目管理', '/manage/category/index');">类目管理</a></li>
			</ul>
			</li>
			<li class="sub-menu system_menus system_2 15" style="display:none;">
			<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-collection-text"></i> 文章内容管理</a>
			<ul>
				<li><a class="waves-effect" href="javascript:Tab.addTab('文章管理', '/manage/article/index');">文章管理</a></li>
				<li><a class="waves-effect" href="javascript:Tab.addTab('回收管理', '/manage/article/recycle');">回收管理</a></li>
			</ul>
			</li>
			<li>
			<div class="upms-version">
				&copy; ZHENG-UPMS V1.0.0
			</div>
			</li>
		</ul>
		<!-- /菜单区 -->
	</aside>
	<!-- /左侧导航区 -->
	<section id="content">
		<div class="content_tab">
			<div class="tab_left">
				<a class="waves-effect waves-light" href="javascript:;"><i class="zmdi zmdi-chevron-left"></i></a>
			</div>
			<div class="tab_right">
				<a class="waves-effect waves-light" href="javascript:;"><i class="zmdi zmdi-chevron-right"></i></a>
			</div>
			<ul id="tabs" class="tabs">
				<li id="tab_home" data-index="home" data-closeable="false" class="cur">
					<a class="waves-effect waves-light">首页</a>
				</li>
			</ul>
		</div>
		<div class="content_main">
			<div id="iframe_home" class="iframe cur">
				<p><h4>通用用户权限管理系统 <i style="color:#c00">(此站仅为静态页演示)</i></h4></p>
				<p><b>演示地址</b>：<a href="http://www.zhangshuzheng.cn/zhengAdmin" target="_blank">http://www.zhangshuzheng.cn/zhengAdmin</a></p>
				<p><b>系统简介</b>：本系统是基于RBAC授权和基于用户授权的细粒度权限控制通用平台，并提供单点登录、会话管理和日志管理。接入的系统可自由定义组织、角色、权限、资源等。</p><br/>
				<p><h4>系统功能概述：</h4></p>
				<p><b>系统组织管理</b>：系统和组织增加、删除、修改、查询功能。</p>
				<p><b>用户角色管理</b>：用户和角色增加、删除、修改、查询功能。</p>
				<p><b>资源权限管理</b>：资源和权限增加、删除、修改、查询功能。</p>
				<p><b>权限分配管理</b>：提供给角色和用户的权限增加、删除、修改、查询功能。</p>
				<p><b>单点登录(SSO)</b>：提供统一用户单点登录认证、用户鉴权功能。</p>
				<p><b>用户会话管理</b>：提供分布式用户会话管理</p>
				<p><b>操作日志管理</b>：提供记录用户登录、操作等日志。</p><br/>
				<p><h4>对外接口概述：</h4></p>
				<p><b>系统组织数据接口</b>、<b>用户角色数据接口</b>、<b>资源权限数据接口</b>、<b>单点登录(SSO)接口</b>、<b>用户鉴权接口</b></p><br/>
				<p><h4>关于作者</h4></p>
				<p><b>姓　　名</b>：张恕征</p>
				<p><b>电子邮箱</b>：469741414@qq.com</p>
			</div>
		</div>
	</section>
</section>
<footer id="footer"></footer>

<script src="resources/plugins/jquery.1.12.4.min.js"></script>
<script src="resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="resources/plugins/waves-0.7.5/waves.min.js"></script>
<script src="resources/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="resources/plugins/BootstrapMenu.min.js"></script>
<script src="resources/plugins/device.min.js"></script>
<script src="resources/plugins/fullPage/jquery.fullPage.min.js"></script>
<script src="resources/plugins/fullPage/jquery.jdirk.min.js"></script>
<script src="resources/plugins/jquery.cookie.js"></script>

<script src="resources/js/admin.js"></script>
<script>
	function logout(){
		$.get("/admin/user/logon",function (txt) {
			alert("退出了");
			location.reload();
		},"text")
	}
</script>
</body>
</html>