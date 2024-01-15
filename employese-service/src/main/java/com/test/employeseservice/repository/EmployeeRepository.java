package com.test.employeseservice.repository;
import com.test.employeseservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
