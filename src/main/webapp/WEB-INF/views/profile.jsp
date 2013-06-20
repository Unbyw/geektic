<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/bootstrap.css">
<LINK rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/bootstrap-responsive.css">
<LINK rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<LINK rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Geektic</title>
</head>
<body>
	<section id="header">
		<div id="nav-header">
			<ul>
				<li><a href="/geektic">Home</a></li>
				<li><a href="/geektic/search">Search</a></li>
				<li><a href="<%=request.getContextPath()%>">Top Geek</a></li>
				<li><a href="<%=request.getContextPath()%>">Flop Geek</a></li>
			</ul>
		</div>
	</section>
	<section>
		<h1><c:out value ="${geek.nickname}"/></h1>
		<div id= "">
			<ul>
				<c:forEach var="interest" items = "${geek.interests}">
				<li><c:out value ="${interest.label}"/></li>
				</c:forEach>
			</ul>
		</div>
	</section>
	
	
</body>
</html>