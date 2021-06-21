<html>
<title>
My First Application
</title>
<body>
<h1>Welcome to Employee page</h1>
<br>
<h3>You can perform these operations:</h3>
<br>
<div class="container">
<table class="table table-striped">
<tbody>
<tr>
<td>Create Employee</td>
<td>
<input type="button" value="Create" onclick="window.location='/create-employee'" >
</td>
</tr>
<tr>
<td>Update Employee</td>
<td>
<input type="button" value="Update" onclick="window.location='/list-employees'" >
</td>
</tr>
<tr>
<td>Delete Employee</td>
<td>
<input type="button" value="Delete" onclick="window.location='/list-employees'" >
</td>
</tr>
<tr>
<td>Retrieve Employee</td>
<td>
<input type="button" value="Retrieve" onclick="window.location='/list-employees'" >
</td>
</tr>
</tbody>
</table>
</div>
<br>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>