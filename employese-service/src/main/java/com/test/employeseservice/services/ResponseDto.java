package com.test.employeseservice.services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

	private DepartmentDto department;
	private EmployeeDto employee;
}
