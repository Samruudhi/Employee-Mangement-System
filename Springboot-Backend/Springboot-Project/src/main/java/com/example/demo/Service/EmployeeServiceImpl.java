package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		this.empRepository.save(employee);
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional=empRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}
		else {
			throw new RuntimeException("Employee not found for id::"+id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.empRepository.deleteById(id);
	}

}
