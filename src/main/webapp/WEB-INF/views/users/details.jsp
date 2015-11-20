<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情</title>
</head>
<body>
	<table class="table table-condensed table-hover">
  		<thead>
  			<tr><th class="text-center">用户ID</th><th class="text-center">姓名</th><th class="text-center">昵称</th><th class="text-center">Emial</th></tr>
  		</thead>
  		<tbody><tr><td>${user.id}</td><td>${user.name}</td><td>${user.username}</td><td>${user.email}</td></tr></tbody>
	</table>
</body>
</html>