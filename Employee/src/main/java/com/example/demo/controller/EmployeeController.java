package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import com.example.demo.model.EmplyoeeDetails;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value = "/list-employees", method = RequestMethod.GET)
	public String showEmployees(ModelMap model)
	{
		model.put("employees", service.retrieveEmployees());
		return "list-employees";
	}
	
	@RequestMapping(value = "/create-employee", method = RequestMethod.GET)
	public String showCreateEmployees(ModelMap model)
	{
		model.addAttribute("employee", new EmplyoeeDetails(0,"",0,0));
		return "create-employee";
	}
	
	@RequestMapping(value = "/create-employee", method = RequestMethod.POST)
	public String CreateEmployees(@RequestParam String empname, @RequestParam int salary, @RequestParam int experience, @Valid EmplyoeeDetails employee, BindingResult result)
	{
		service.createEmployee(empname, salary, experience);
		return "redirect:/list-employees";
	}
	
	@RequestMapping(value = "/delete-employee", method = RequestMethod.GET)
	public String deleteEmployees(@RequestParam int id)
	{
		service.deleteEmployee(id);
		return "redirect:/list-employees";
	}
	
	@RequestMapping(value = "/update-employee", method = RequestMethod.GET)
	public String showUpdateEmployees(@RequestParam int id, ModelMap model)
	{
		EmplyoeeDetails employee = service.retrieveEmployee(id);
		model.put("employee", employee);
		return "create-employee";
	}
	
	@RequestMapping(value = "/update-employee", method = RequestMethod.POST)
	public String updateEmployees(@Valid EmplyoeeDetails employee, BindingResult result)
	{
		service.updateEmployee(employee);
		return "redirect:/list-employees";
	}
}
