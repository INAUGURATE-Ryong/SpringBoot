package com.test.services;

import com.test.entities.Employee;
import com.test.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployeeAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(String employeeId, Employee employee) {

        Employee existedEmployee = employeeRepository.findById(employeeId).orElse(null);
        existedEmployee.setEmployeeName(employee.getEmployeeName());
        existedEmployee.setSalary(employee.getSalary());
        return existedEmployee;
    }

    @Override
    public void deleteEmployee(String employeeID) {
        employeeRepository.deleteById(employeeID);

    }
}
