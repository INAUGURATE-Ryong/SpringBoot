package com.test.employeseservice.services;

import com.test.employeseservice.entities.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	ResponseDto getEmployee(Long employeeId);
}
