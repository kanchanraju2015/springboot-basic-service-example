package com.briz.springbootservicedemoexample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeService eserv;
@RequestMapping("/test")
public String test()
{
	return "this is service demo test";
}
@RequestMapping("/save/employee")// single employee
public String save(@RequestBody Employee employee)
{
	eserv.addEmployee(employee);
	return "Data is saved into Database";// service is manipulated here 
}
@RequestMapping("/save/employees")// multiple employees
public List<Employee> addEmployees(@RequestBody List<Employee> employees)
{
	return eserv.addEmployees(employees);
}
@RequestMapping("/all")
public List<Employee> all()
{
	return eserv.allemp();
}
@RequestMapping("/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return eserv.geById(id);
}
@RequestMapping("/update/{id}")
public Employee upd(@RequestBody Employee employee,@PathVariable int id)
{
return eserv.update(id,employee);	
}
}
