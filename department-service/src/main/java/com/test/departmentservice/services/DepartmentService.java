package com.test.departmentservice.services;

import com.test.departmentservice.entities.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmetId);
}
