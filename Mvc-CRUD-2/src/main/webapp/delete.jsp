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
		<h1>Student Delete Form</h1>
		<h1>${status}</h1>
		<form action="delete" method="POST">
			<table>
				<tr>
					<td><input type="text" name="sid" placeholder="Enter sid"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" />
				</tr>
			</table>
		</form>

	</div>
</body>
</html>