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

<h1>¿Que desea hacer?</h1>
	<a href="listarParaAdopt"><spring:message code="lista.adoptar"/></a>
	<br><br>
	<a href="adoptados"><spring:message code="lista.adoptados"/></a>
	<br><br>
	<a href="voluntariado"><spring:message code="lista.voluntariado"/></a>
	<br><br>
	<a href="citas"><spring:message code="lista.citas"/></a>	
	<br><br>
	<a href="cerrar"><spring:message code="cerrar.sesion"/></a>	
</body>
</html>