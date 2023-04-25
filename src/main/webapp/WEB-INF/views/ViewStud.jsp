<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- for tabular view  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW ALL</title>
</head>
<body>
<h1>View All Records</h1>

${list}
<table border="2">
<tr><th>RollNo</th> <th>Name</th><th>Standard</th></tr>
<c:forEach var="s" items="${list}">
<tr>
<td>${s.rollNo}</td>
<td>${s.name}</td>
<td>${s.std}</td>
<td><a href="deleteRecord/${s.rollNo}" >Delete</a></td>
<td><a href="edit/${s.rollNo}">Update</a></td>
</tr>	


</c:forEach>

</table>
</body>
</html>