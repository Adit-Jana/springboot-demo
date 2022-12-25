package com.wolf.springboot.demo.service;

import com.wolf.springboot.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getDepartmentList();

    public Department getDepartmentById(Long id);

    public void deleteDepartmentById(Long departmentId);
}
