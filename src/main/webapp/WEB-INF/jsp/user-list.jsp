<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理页面</title>
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.5.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.5.3/themes/icon.css">
<script type="text/javascript" src="/js/jquery-easyui-1.5.3/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<h2>用户管理</h2>
	<table class="easyui-datagrid" title="用户列表"
		data-options="singleSelect:true,collapsible:true,url:'/user/list',method:'get',
		pagination:true,pageSize:1,pageList:[1,2,5]">
		<thead>
			<tr>
				<th data-options="field:'id',width:80">id</th>
				<th data-options="field:'username',width:100">用户名</th>
				<th data-options="field:'password',width:80,align:'right'">密码</th>
				<th data-options="field:'phone'">电话</th>
				<th data-options="field:'type'">角色</th>
				<th data-options="field:'createdate',width:100,align:'center'">创建日期</th>
				<th data-options="field:'updatedate',width:100">修改日期</th>
				<th data-options="field:'lastlogindate',align:'center'">最后一次登录时间</th>
			</tr>
		</thead>
	</table>
</body>
</html>