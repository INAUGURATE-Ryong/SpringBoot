package com.test.departmentservice.repositories;

import com.test.departmentservice.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
