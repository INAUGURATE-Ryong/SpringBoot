package com.test.employeseservice.services;
import com.test.employeseservice.entities.Employee;
import com.test.employeseservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private RestTemplate restTemplate;  // 이 부분 EmployeeServiceApplication.java에 추가한다.

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// http://localhost:8081/api/departments/1
	@Override
	public ResponseDto getEmployee(Long employeeId) {
		ResponseDto responseDto = new ResponseDto();
		Employee employee = employeeRepository.findById(employeeId).get();
		
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setEmployeeName(employee.getEmployeeName());
		employeeDto.setDepartmentId(employee.getDepartmentId());
		responseDto.setEmployee(employeeDto);  // append
		
		// http://localhost:8081/api/departments/1
		ResponseEntity<DepartmentDto> responseEntity = 
				restTemplate.getForEntity("http://localhost:8081/api/departments/"+employee.getDepartmentId()
					,DepartmentDto.class);
		
		DepartmentDto departmentDto = responseEntity.getBody();  // 변환
		responseDto.setDepartment(departmentDto);
		return responseDto;
	}
}






