<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de adoptados</title>
</head>
<body>
	<table style="text-align:center" width=700>
			<tr>
				<th><spring:message code="usuario.dni"/></th>
				<th><spring:message code="usuario.nombre"/></th>
				<th><spring:message code="usuario.correo"/></th>
				<th><spring:message code="usuario.telefono"/></th>
				<th><spring:message code="usuario.direccion"/></th>		
			</tr>
				<tr>
					<td>${usuario.dni}</td> 
					<td>${usuario.nombre}</td> 
					<td>${usuario.correo}</td>
					<td>${usuario.telefono}</td>  
					<td>${usuario.direccion}</td> 
					<td></td>
				</tr>
		</table>
		<br>
		<a href="inicioAdm"><spring:message code="accion.inicio"/></a>
</body>
</html>