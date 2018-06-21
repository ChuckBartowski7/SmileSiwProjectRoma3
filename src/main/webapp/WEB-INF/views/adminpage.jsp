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
	<h1>Benvenuto Admin!</h1>
	<a href="/visualizzaIscritti">Visualizza Iscritti!</a>
	<br>
	<a href="/visualizzaDonazioni">Visualizza Donazioni Attive!</a>
	<br>
	<a href="/visualizzaCorsi">Visualizza Corsi Attivi!</a>

	<h4>Inserisci nuovo Corso!</h4>



	<form action="/inscorso" method="post">
		Nome Corso:<br> <input type="text" name="nomecorso"><br>
		Durata:<br> <input type="text" name="durata"><br>
		Invia:<br>
		<input type="submit" value="Invia"><br>
	</form>







	<br>
	<br>
	<a href="/indexx">Torna al menu!</a>

</body>
</body>
</html>

