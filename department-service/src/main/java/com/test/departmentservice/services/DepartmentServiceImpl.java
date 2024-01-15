package com.test.departmentservice.services;

import com.test.departmentservice.entities.Department;
import com.test.departmentservice.repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmetId) {
        return departmentRepository.findById(departmetId).get();//.orElse(null);
    }
}
