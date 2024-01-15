package com.test.departmentservice.controllers;

import com.test.departmentservice.entities.Department;
import com.test.departmentservice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department saveDepartment = departmentService.saveDepartment(department);
        return new ResponseEntity<>(saveDepartment, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id")Long departmentId) {

        Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);

    }
}
