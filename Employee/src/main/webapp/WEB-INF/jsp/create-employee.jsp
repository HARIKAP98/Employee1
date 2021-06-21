<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>
Create Employee
</title>
<body>
<a href="/welcome">Home</a>
<form:form method="post" modelAttribute="employee">
<form:hidden path="empid"/>
<fieldset class="form-group">
<form:label path="empname">Employee Name </form:label> <input type="text" path="empname" name="empname"/> <br><br>
<form:label path="salary">Employee Salary </form:label> <input type="text" path="salary" name="salary"/><br><br>
<form:label path="experience">Employee Experience </form:label> <input type="text" path="experience" name="experience"/><br><br>
</fieldset>
<button type="submit" class="btn btn-success">Create</button>
</form:form>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>