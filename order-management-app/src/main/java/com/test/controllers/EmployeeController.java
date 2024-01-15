package com.test.controllers;

import com.test.entities.Employee;
import com.test.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public List<Employee> getEmploteeAll(){
        return employeeService.getEmployeeAll();
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PostMapping("{id}")
    public ResponseEntity updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee){
        Employee result = employeeService.updateEmployee(employeeId,employee);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable String id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
