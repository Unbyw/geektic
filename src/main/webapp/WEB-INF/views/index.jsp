<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/geektic/css/bootstrap.css">
<link rel="stylesheet" href="/geektic/css/bootstrap-responsive.css">
<link rel="stylesheet" href="/geektic/css/bootstrap.min.css">
<link rel="stylesheet" href="/geektic/css/bootstrap-responsive.min.css">
<title>${pageTitle}</title>
</head>
	<body>
	<section id="header">
		<div id="nav-header">
			<ul>
				<li><a href="/geektic">Home</a></li>
				<li><a href="/geektic/search">Search</a></li>
				<li><a href="">Top Geek</a></li>
				<li><a href="">Flop Geek</a></li>
			</ul>
		</div>
	</section>
		<h1>Bienvenue sur geektic</h1>
		<ul>
			<c:forEach var="mygeeks" items = "${geeks}">
				<li><c:out value ="${mygeeks.nickname}"/></li> 
			</c:forEach>	
		</ul>
	</body>
</html>