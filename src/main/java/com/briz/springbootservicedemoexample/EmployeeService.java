
package com.briz.springbootservicedemoexample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // there is no need to create seperate file as interface for methods this is valid 
public class EmployeeService 
{
@Autowired
EmployeeRepository erepo;
public Employee addEmployee(Employee employee)
{
return erepo.save(employee);	
}
List<Employee> addEmployees(List<Employee> employees)
{
return erepo.saveAll(employees);
}
public List<Employee> allemp()
{
	return erepo.findAll();
}
public Optional<Employee> geById(int id)
{
	return erepo.findById(id);
}
public Employee update(int id,Employee employee)
{
employee.setId(id);// this line is must otherwise it will not work 
return erepo.save(employee);
}
}
