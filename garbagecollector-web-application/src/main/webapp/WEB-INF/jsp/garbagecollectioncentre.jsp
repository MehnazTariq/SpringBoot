<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="form">
		<form action="saveGarbageCollectionCentre" method="post"
			onsubmit="saveGarbageCollectionCentre">
			<table>
				<tr>
					<td>Collector is available</td>
					<td><input type="radio" id="isCollectorAvailable"
						name="isCollectorAvailable" VALUE="yes" CHECKED></td> Yes

					<td><input type="radio" id="isCollectorAvailable"
						name="isCollectorAvailable" VALUE="no"></td> No

					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>




</body>
</html>