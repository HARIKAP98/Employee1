<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>
Employees list
</title>
<body>
<a href="/welcome">Home</a>
<h2>Here are the list of employees:</h2>

<table class="table table-striped">
<thead>
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Salary</th>
<th>Experience</th>
<th></th>
<th></th>
</tr>
<tbody>
<c:forEach items="${employees}" var="item">

<tr>
<td>${item.empid}</td>
<td>${item.empname}</td>
<td>${item.salary}</td>
<td>${item.experience}</td>
<td><a type= "button" class= "btn btn-success" href="/update-employee?id=${item.empid}"> Update</a>
<td><a type= "button" class= "btn btn-warning" href="/delete-employee?id=${item.empid}"> Delete</a>
</tr>

</c:forEach>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</tbody>
</table>
<a href="/create-employee"><h3>Create</h3></a>
</body>
</html>