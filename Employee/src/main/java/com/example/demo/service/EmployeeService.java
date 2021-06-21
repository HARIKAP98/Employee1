package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.example.demo.model.EmplyoeeDetails;

@Service
public class EmployeeService {
	private static List<EmplyoeeDetails> employees = new ArrayList<EmplyoeeDetails>();
	private static int emplyoeeCount=3;
	
	static
	{
		employees.add(new EmplyoeeDetails(1,"abc",10000,2));
		employees.add(new EmplyoeeDetails(2,"def",20000,3));
		employees.add(new EmplyoeeDetails(3,"ghi",30000,4));
	}
	
	public List<EmplyoeeDetails> retrieveEmployees()
	{
		List<EmplyoeeDetails> filteredEmployees = new ArrayList<EmplyoeeDetails>();
		
		for(EmplyoeeDetails employee : employees)
		{
			
			filteredEmployees.add(employee);
			
		}
		return filteredEmployees;
	}
	
	public EmplyoeeDetails retrieveEmployee(int id)
	{
		
		for(EmplyoeeDetails employee : employees)
		{
			if(employee.getEmpid() == id)
			{
				return employee;
			}	
		}
		return null;
	}
	
	public void updateEmployee(EmplyoeeDetails employee)
	{
		employees.remove(employee);
		employees.add(employee);
	}
	public void createEmployee(String empname, int salary, int experience)
	{
		employees.add(new EmplyoeeDetails(++emplyoeeCount, empname, salary, experience));
	}
	
	public void deleteEmployee(int id)
	{
		Iterator<EmplyoeeDetails> iterator = employees.iterator();
		while(iterator.hasNext())
		{
			EmplyoeeDetails employee = iterator.next();
			if(employee.getEmpid() == id)
			{
				iterator.remove();
			}
		}
	}
}

/*
<form:form method="post" modelAttribute="employee">
<form:hidden path="empid"/>
<fieldset class="form-group">
<form:label path="empname">Employee Name </form:label> <input type="text" path="empname" name="empname"/> <br><br>
<form:label path="salary">Employee Salary </form:label> <input type="text" path="salary" name="salary"/><br><br>
<form:label path="experience">Employee Experience </form:label> <input type="text" path="experience" name="experience"/><br><br>
</fieldset>
<button type="submit" class="btn btn-success">Create</button>
</form:form>
*/