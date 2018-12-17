<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Access</title>
</head>
<body>

	<h1>Bienvenido</h1>
	<form:form modelAttribute="usuario" action="acceder">
		<table>
			<tr><td><spring:message code="usuario.user"/> &nbsp;&nbsp;</td>
			<td><form:input path="user" placeholder="Mari1234"/></td>
			<td><form:errors path="user" cssClass="error" /></td></tr>
			
			
			<tr><td><spring:message code="usuario.pass"/> &nbsp;&nbsp;</td>
			<td><form:input type="password" path="pass" placeholder="1234"/></td>
			<td><form:errors path="pass" cssClass="error" /></td></tr>
		
			<tr><td><input type="submit" value="<spring:message code="accion.acceder"/>"></td>
			<td><form:errors path="idusuario" cssClass="error"/></td></tr>
		</table>
	</form:form>
	<a href="registro"><spring:message code="accion.registrarse"/></a>
	<br>
	<a href="login?lang=es"><spring:message code="idioma.es"/></a>
	<a href="login?lang=en"><spring:message code="idioma.en"/></a>
	
</body>
</html>