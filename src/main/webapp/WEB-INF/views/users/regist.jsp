<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Regist</title>
</head>
<body>
	<fm:form action="/MyFirstMavenProject/users/regist" modelAttribute="user" method="post" class="form-horizontal">
		  <div class="form-group">
		    <label for="name" class="col-sm-2 control-label">姓名：</label>
		    <div class="col-sm-10">
		      <fm:input path="name" class="form-control" placeholder="name"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="username" class="col-sm-2 control-label">昵称：</label>
		    <div class="col-sm-10">
		      <fm:input path="username" class="form-control" placeholder="username"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="password" class="col-sm-2 control-label">密码：</label>
		    <div class="col-sm-10">
		      <fm:password path="password" class="form-control" placeholder="Password"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
		    <div class="col-sm-10">
		      <fm:input path="email" class="form-control" id="inputEmail3" placeholder="Email"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">确认注册</button>
		    </div>
		  </div>
	</fm:form>
</body>
</html>