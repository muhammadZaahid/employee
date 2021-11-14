package com.zaahid.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaahid.employee.model.Employee;
import com.zaahid.employee.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
		return repo.findAll();
	}
	
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	public Employee get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
}


