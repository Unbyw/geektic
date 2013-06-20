<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/geektic/css/bootstrap.css">
<link rel="stylesheet" href="/geektic/css/bootstrap-responsive.css">
<link rel="stylesheet" href="/geektic/css/bootstrap.min.css">
<link rel="stylesheet" href="/geektic/css/bootstrap-responsive.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${pageTitle}</title>
</head>
<body>
	<h1>Bienvenue sur la recherche</h1>
	<form method="post" action="search"> 
		<label> Nickname:<Input type="text" name="nickname"></label>
		<ul>
			<c:forEach var="interest" items = "${interests}">
				<li><c:out value ="${interest.label}"/><input type="checkbox" name="interest" value="${interest.id}"></li>
			</c:forEach>	
		</ul>
		<ul>
			<li>Male<input type="checkbox" name ="sexe" value="male"></li>
			<li>Female<input type="checkbox" name ="sexe" value="female"></li>
			<li>Shemale<input type="checkbox" name ="sexe" value="shemale"></li>
		</ul>
		<input type="submit" value="Say Hello"/> 
	</form>
	
	<c:forEach var="geek" items = "${geeks}">
		<li><c:out value ="${geek.nickname}"/></li>
	</c:forEach>
</body>
</html>