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
				<th><spring:message code="animal.nombre"/></th>
				<th><spring:message code="animal.edad"/></th>
				<th><spring:message code="animal.castrado"/></th>
				<th><spring:message code="animal.color"/></th>
				<th><spring:message code="animal.raza"/></th>
				<th><spring:message code="animal.tipo"/></th>
				<th><spring:message code="animal.sexo"/></th>
				<th><spring:message code="animal.fecha"/></th>	
			</tr>
			<c:forEach items="${adoptados}" var="item">
				<tr>
			
					<td>${item.nombre}</td> 
					<td>${item.edad}</td>
					<td>${item.castrado}</td>
					<td>${item.color.color}</td>
					<td>${item.raza.raza}</td>
					<td>${item.tipo.tipo}</td>
					<td>${item.sexo.sexo}</td>	
					<td>${item.fechaAdopcion}</td>		
					<td></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<a href="inicioUser"><spring:message code="accion.inicio"/></a>

</body>
</html>