<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="app.name"/></title>
</head>
<body>
	<form:form modelAttribute="animal" action="guardar">
		<form:hidden path="idanimales" />
		<table>
		
		<tr><td><spring:message code="animal.nombre"/></td><td><form:input path="nombre" /></td>
		<td><form:errors path="nombre" cssClass="error" /></td></tr>
		
		<tr><td><spring:message code="animal.edad"/></td><td><form:input path="edad" /></td>
		<td><form:errors path="edad" cssClass="error" /></td></tr>
		
		<tr><td><spring:message code="animal.castrado"/></td><td><form:checkbox path="castrado" /></td></tr>
		
		<tr><td><spring:message code="animal.color"/></td><td><form:select path="color.idcolor"
		 items="${listaColor}" itemLabel="color" itemValue="idcolor"/></td></tr>
		 
		<tr><td><spring:message code="animal.raza"/></td><td><form:select path="raza.idraza"
		 items="${listaRaza}" itemLabel="raza" itemValue="idraza"/></td></tr>
		 
		<tr><td><spring:message code="animal.tipo"/></td><td><form:select path="tipo.idtipo"
		 items="${listaTipoAnimal}" itemLabel="tipo" itemValue="idtipo"/></td></tr>
		
		<tr><td><spring:message code="animal.sexo"/></td><td><form:select path="sexo.idsexo"
		 items="${listaSexo}" itemLabel="sexo" itemValue="idsexo"/></td></tr>
		 
		<tr><td><input type="submit" value="<spring:message code="accion.guardar"/>"/></td></tr>
		</table>
	</form:form>
	<br>
	${msg}
	<br>
	<a href="listarNoAdopt"><spring:message code="accion.listar"/></a>
</body>
</html>