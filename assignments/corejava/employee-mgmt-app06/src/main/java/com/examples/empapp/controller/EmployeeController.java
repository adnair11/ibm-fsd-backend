package com.examples.empapp.controller;


import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examples.empapp.model.Employee;
import com.examples.empapp.service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping(value="/{id}")
	public Employee get(@PathVariable int id) {
		return empService.get(id);
	}


	
	
	@GetMapping
	public List<Employee> getEmployees()
	{
		return empService.getAll();
	}
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE})
	public boolean create(@RequestBody Employee employee) {
		return empService.create(employee);		
	}
	
	@PutMapping(value= "/{id}",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public boolean update(@PathVariable int id,@RequestBody Employee employee) {
		return empService.update(id,employee);
	}
	
	@DeleteMapping(value="/{id}")
	public boolean delete(@PathVariable int id) {
		return empService.delete(id);
	}
	
	
}
