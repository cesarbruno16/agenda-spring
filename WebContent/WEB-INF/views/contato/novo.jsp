<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Novo Contato</title>
	</head>
	<body>
		<form action="adicionaContato" method="post">
			<form:errors path="contato.nome" cssStyle="color:red"/><br/>
			Nome: <input name="nome" type="text"><br/>
			<form:errors path="contato.email" cssStyle="color:red"/><br/>
			E-mail: <input name="email" type="text"><br/>
			<input type="submit" value="Enviar">
		</form>	
	</body>
</html>