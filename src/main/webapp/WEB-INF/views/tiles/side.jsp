<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-horizontal">
	  <div class="form-group">
	    <label for="username" class="col-sm-2 control-label">用户名：</label>
	    <div class="col-sm-6">
	      <input type="email" class="form-control" id="username" placeholder="username">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="password" class="col-sm-2 control-label">密码：</label>
	    <div class="col-sm-6">
	      <input type="password" class="form-control" id="password" placeholder="password">
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10 text-left">
	      <div class="checkbox">
	        <label>
	          <input type="checkbox"> 记住密码
	        </label>
	      </div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10 text-left">
	      <button type="submit" class="btn btn-primary">登陆</button>
	      <a class="btn btn-primary" role="button" href="<%=request.getContextPath()%>/users/regist">注册</a>
	    </div>
	  </div>
	</form>
	<script type="text/javascript" src=""></script>
</body>
</html>