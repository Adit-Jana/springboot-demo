package com.wolf.springboot.demo.controller;

import com.wolf.springboot.demo.entity.Department;
import com.wolf.springboot.demo.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }

    @GetMapping("/department/{id}") //path variable
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);

    }
    @DeleteMapping("/departments/{id}")//path variable
    public String deleteDepartmenById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return departmentId + " deleted successfully.";
    }

}
