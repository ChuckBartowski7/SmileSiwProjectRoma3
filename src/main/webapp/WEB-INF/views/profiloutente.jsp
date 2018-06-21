<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/eventikid.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>

<body>

	<h1>Benvenuto Utente</h1>
	${nome}
	<h1>${pageContext.request.userPrincipal.name}</h1>
	<!--   <h1>${prova}</h1> -->
	<H2>I tuoi Dati</H2>
	<br> Username: ${utente.username}
	<br> Password: ${utente.password}
	<br> Abilitato: ${utente.enabled}
	<br>

	<H2>I tuoi corsi</H2>
	<c:forEach var="product" items="${l}">
		<li>${product.nomeCorso}</li>
	</c:forEach>

	<h2>Numero di Corsi frequentati:</h2>${dim}
	<br>
	<br>
	<a href="/indexx">Torna al menu!</a>




</body>
</html>
