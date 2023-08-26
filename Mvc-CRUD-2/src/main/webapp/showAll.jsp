<%@page import="com.anku.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>
	<div align="center">
		<h1>All Student</h1>
		<%
		List<Student> students = (List<Student>) request.getAttribute("students");
		%>
		<table >
			<tr>
				<th>SID</th>
				<th>NAME</th>
				<th>ADDRESS</th>
			</tr>
			<%
			if (students == null || students.isEmpty()) {
			%>
			<tr>
				<td  colspan="3">No Data found</td>
			</tr>
			<%
			} else {
			for (Student student : students) {
			%>
			<tr>
				<td><%=student.getSid()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getAddress()%></td>
			</tr>
			<%
			}
			}
			%>
		</table>
	</div>
</body>
</html>