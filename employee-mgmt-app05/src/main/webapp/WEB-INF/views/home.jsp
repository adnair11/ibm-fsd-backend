<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Employee Management App 06 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form method="GET">
<a href ="add">Add Employee</a><br><br>
<a href ="delete">Delete Employee</a><br><br>
<a href ="update">Update Employee</a><br><br>
<a href ="view">View Employees</a><br><br>
</form>


</body>
</html>