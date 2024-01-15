package com.test.services;

import com.test.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeAll();
    Employee getEmployeeById(String employeeId);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(String employeeId,Employee employee);
    void deleteEmployee(String employeeID);
}
