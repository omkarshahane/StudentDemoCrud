<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Record</title>
</head>
<body>

<h1>Update Data</h1>

<form action="/update">

Roll No: <input type="text" value="${stud.rollNo}" name="rollNo" readonly="readonly"/><br>
Name : <input type="text" value="${stud.name}" name="sname" /><br>
standard: <input type="text" value="${stud.std}" name="st"/><br>

<input type="submit">
</form>
</body>
</html>