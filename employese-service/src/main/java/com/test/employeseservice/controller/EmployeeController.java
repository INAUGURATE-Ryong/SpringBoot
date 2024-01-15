package com.test.employeseservice.controller;

import com.test.employeseservice.entities.Employee;
import com.test.employeseservice.services.EmployeeService;
import com.test.employeseservice.services.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		
		Employee savedemployee = employeeService.saveEmployee(employee);
		
		return new ResponseEntity<>(savedemployee, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ResponseDto> getEmployee(@PathVariable("id") Long employeeId) {
		
		ResponseDto responseDto = employeeService.getEmployee(employeeId);
		
		return ResponseEntity.ok(responseDto);
	}
}

/*
	POST, http://localhost:8082/api/employees
	{
		"employeeId":1,
		"employeeName": "kingsmile",
		"departmentId": 1
	}
	
	POST, http://localhost:8082/api/employees
	{
		"employeeId":2,
		"employeeName": "yuna",
		"departmentId": 2
	}
 */

