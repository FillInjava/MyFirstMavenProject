<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
     --%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title><t:insertAttribute name="title" ignore="true" /></title>
 <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
 <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" rel="stylesheet"> 
</head>
<body>
<div class="container">
	<table class="table table-hover text-center"> 
	    <tr> 
	        <td colspan="2"><t:insertAttribute name="top" /></td> 
	    </tr> 
	    <tr> 
	        <td><t:insertAttribute name="content" /></td> 
	        <td><t:insertAttribute name="side" /></td> 
	    </tr> 
	    <tr> 
	        <td colspan="2"><t:insertAttribute name="footer" /></td> 
	    </tr> 
	</table> 
</div>
 
<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
 <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
