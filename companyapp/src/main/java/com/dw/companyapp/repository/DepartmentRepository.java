package com.dw.companyapp.repository;

import com.dw.companyapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
