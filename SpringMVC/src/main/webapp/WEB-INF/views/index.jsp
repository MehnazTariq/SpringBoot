<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
	<h1>Admission System</h1>
	<hr>

	<div class="form">
		<form action="addStudent" method="post" onsubmit="return validate()">
			<table>
				<tr>
					<td>Enter Student name</td>
					<td><input id="name" name="name"></td>
					<td>Enter Student Age</td>
					<td><input id="age" name="age"></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>
