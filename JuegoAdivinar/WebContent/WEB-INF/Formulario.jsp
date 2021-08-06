<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Adivina el número</title>
</head>
<body>
	<h1>Bienvenido al juego "Adivina el número"</h1>
	<h2>Estoy pensando en un número entre el 1 y 100</h2>
	<h3>Adivina!</h3>
	<form action="Adivina" method="post">
	<% if(session.getAttribute("boton")=="Try") {  %>
		<input type="text" name="numero">
	<% } %>
		<button><%= session.getAttribute("boton") %></button>
	</form>
	<div>
		<h2> <%= session.getAttribute("aviso") %> </h2>
	</div>
</body>
</html>