<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Order</title>
</head>
<body>

<div class="page-title">New Order</div>
	<div class="customer-new-order">
	<h3>Customer New Order</h3>
		<form action="saveOrderDetails" method="post" modelAttribute="${newOrderDetails}" onsubmit="saveOrderDetails">
			<table>
				<tr>

					<td>Customer ID</td>
					<td><input id="custid" name="custid"
						value="${newOrderDetails.customerDetails.custid}"></td>
					<td>GC Location</td>
					<td><input id="gclocid" name=gclocid
						value="${newOrderDetails.gclocid}"></td>
					<td>Distance</td>
					<td><input id="distance" name="distance"
						value="${newOrderDetails.distance}"></td>
					<td>Order Status</td>
					<td><input id="orderstatus" name="orderstatus"
						value="${newOrderDetails.orderstatus}"></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>




</body>
</html>