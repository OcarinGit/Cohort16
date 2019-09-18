<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create</h1>
<form action="createServlet" method="post">
	<div>
		<label for="nombre">Nombre  </label>
		<input type="text" id="nombre" name="nombre">
	</div>
	
	<div>
		<label for="edad">Edad  </label>
		<input type="number" id="edad" name="edad">
	</div>
	<div>
		<label for="habitat">Habitat  </label>
		<input type="text" id="habitat" name="habitat">
	</div>
	<input type="submit" value="Crear ya">


</form>

</body>
</html>