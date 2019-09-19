<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-88UTF-859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Delete Carnivorous</h2>
	<form action="DeleteCarnivorousServlet" method="post">
	<p>
		<label for="txtIdCarnivorous">Id Carnivorous:</label>
		<input type="text" id="txtIdCarnivorous" name="txtIdCarnivorous">
	</p>
	<p>
		<input type="submit" value="Borrar Carnivorous">
	</p>
	</form>
</body>
</html>