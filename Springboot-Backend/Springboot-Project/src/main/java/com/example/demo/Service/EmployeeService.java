package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
	
	List<Employee>getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}
