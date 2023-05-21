<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Name is  ${student.name}</h1>
<h1> Student Id is  ${student.id}</h1>
<h1> Student Date of Birth is  ${student.date}</h1>
<h1> Student Course is  ${student.courses}</h1>
<h1> Student Gender is ${student.gender}</h1>
<h1> Type Of Student is ${student.type}</h1>
<h1>Student Street is ${student.address.street}</h1>
<h1>Student Block is ${student.address.block}</h1>
<h1>Student Near is ${student.address.near}</h1>
<h1>Student City is ${student.address.city}</h1>
<h1>Student State is ${student.address.state}</h1>
</body>
</html>