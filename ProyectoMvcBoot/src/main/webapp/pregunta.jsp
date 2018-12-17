<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Admin</title>
</head>
<body>

<h1>¿Quiere adoptar otro animal?</h1>

	<form action="listarParaAdopt?Lang=es">
		<input type="submit" value=<spring:message code="accion.si"/>>
	</form>
	
	<form action="/inicioUser?Lang=es">
		<input type="submit" value=<spring:message code="accion.no"/>>
	</form>
	
</body>
</html>