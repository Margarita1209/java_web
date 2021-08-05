<%@ page language="java" contentType="text/html; charset=ISO-8859-8"
    pageEncoding="ISO-8859-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-8">
	<title>Formulario Mascota</title>
</head>
<body>
<form action="Dogs">
		<h1>Created a Dog</h1>
		<h3>Name:</h3>
			<input type="text" name="name">
		<h3>Breed:</h3>
			<input type="text" name="breed">
		<h3>Weight:</h3>
			<input type="text" name="weight">
		<input type="submit" value="Enviar">
	</form>
	
	<form action="Cats">
		<h1>Created a Cat</h1>
		<h3>Name:</h3>
			<input type="text" name="name">
		<h3>Breed:</h3>
			<input type="text" name="breed">
		<h3>Weight:</h3>
			<input type="text" name="weight">
		<input type="submit" value="Enviar">
	</form>

</body>
</html>