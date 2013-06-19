<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap-responsive.css">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap-responsive.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${pageTitle}</title>
</head>
<body>
	<h1>Bienvenue sur la recherche</h1>
	<form method="post" action="search"> 
		<ul>
			<c:forEach var="interests" items = "${interests}">
				<li><c:out value ="${interests.label}"/><input type="radio" name="interest" value="${interests.id}"></li>
			</c:forEach>	
		</ul>
		<ul>
			<li>male<input type="checkbox" name ="sexe" value ="male"></li>
			<li>female<input type="checkbox" name ="sexe" value ="female"></li>
			<li>shemale<input type="checkbox" name ="sexe" value ="shemale"></li>
		</ul>
	<input type="submit" value="Say Hello"/> </form>
</body>
</html>