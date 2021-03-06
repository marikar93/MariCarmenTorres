<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista para adoptar</title>
</head>
<body>
	<a href="buscar"><spring:message code="accion.nuevo"/></a>
	<br>
	<br>
	<table style="text-align:center" width=700>
			<tr>
				<th><spring:message code="animal.nombre"/></th>
				<th><spring:message code="animal.edad"/></th>
				<th><spring:message code="animal.castrado"/></th>
				<th><spring:message code="animal.color"/></th>
				<th><spring:message code="animal.raza"/></th>
				<th><spring:message code="animal.tipo"/></th>
				<th><spring:message code="animal.sexo"/></th>
				
			</tr>
			<c:forEach items="${lista}" var="item">
				<tr>
			
					<td>${item.nombre}</td> 
					<td>${item.edad}</td>
					<td>${item.castrado}</td>
					<td>${item.color.color}</td>
					<td>${item.raza.raza}</td>
					<td>${item.tipo.tipo}</td>
					<td>${item.sexo.sexo}</td>	
					<td></td>
					<td><a href="guardar?id=${item.idanimales}"><spring:message code="accion.modificar"/></a></td>
					<td>|</td>
					<td><a href="eliminar?id=${item.idanimales}"><spring:message code="accion.eliminar"/></a></td>	
				</tr>
			</c:forEach>
		</table>
		<br>
		<a href="inicioAdm"><spring:message code="accion.inicio"/></a>

</body>
</html>