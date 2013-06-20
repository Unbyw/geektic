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
				<li><a href="<%=request.getContextPath()%>">Home</a></li>
				<li><a href="<%=request.getContextPath()%>/search">Search</a></li>
				<li><a href="<%=request.getContextPath()%>">Top Geek</a></li>
				<li><a href="<%=request.getContextPath()%>">Flop Geek</a></li>
			</ul>
		</div>
	</section>
	<h1>Bienvenue sur la recherche</h1>
	<form method="post" action="search"> 
		<label> Nickname:<Input type="text" name="nickname"></label>
		<ul>
			<c:forEach var="interest" items = "${interests}">
				<li><c:out value ="${interest.label}"/><input type="checkbox" name="interests" value="${interest.id}"></li>
			</c:forEach>	
		</ul>
		<ul>
			<li>Male<input type="checkbox" name ="sexes" value="male"></li>
			<li>Female<input type="checkbox" name ="sexes" value="female"></li>
			<li>Shemale<input type="checkbox" name ="sexes" value="shemale"></li>
		</ul>
		<input type="submit" value="Say Hello"/> 
	</form>
	
	<c:forEach var="geek" items = "${geeks}">
		<li><a href="<%=request.getContextPath()%>/profile/${geek.id}"><c:out value ="${geek.nickname}"/></a></li>
	</c:forEach>
</body>
</html>