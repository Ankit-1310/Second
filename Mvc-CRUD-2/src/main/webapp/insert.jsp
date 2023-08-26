<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div algin="center">
		<h1>Student Registration Form</h1>
		<h1>${status}</h1>
		<form action="add" method="POST">
			<table>
				<tr>
					<td>Student Id</td>
					<td><input type="text" name="sid" placeholder="Enter Sid"></td>
				</tr>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="name" placeholder="Enter Name"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"
						placeholder="Enter address"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" />
				</tr>
			</table>
		</form>
	</div>
</body>
</html>