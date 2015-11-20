<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div>
	<ul class="text-left">
	 	<c:forEach items="${users}" var="user">
	 		<s:url value="/users/{id}" var="user_url">
	 			<s:param name="id" value="${user.id}"/>
	 		</s:url>
	 		<li><a href="${user_url}">${user.name}</a></li>
	 	</c:forEach>
	</ul>
</div>