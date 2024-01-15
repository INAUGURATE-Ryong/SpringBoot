package com.test.employeseservice.services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private Long employeeId;
	private String employeeName;
	private Long departmentId;
}
