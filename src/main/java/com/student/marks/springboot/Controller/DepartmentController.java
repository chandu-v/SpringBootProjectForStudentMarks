package com.student.marks.springboot.Controller;

import java.util.List;
import java.util.Optional;

import com.student.marks.springboot.Bean.Department;
import com.student.marks.springboot.Service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/department", method = RequestMethod.GET) 
    public List<Department> findAll() {
        return this.departmentService.findAll();
    }

    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET) 
    public Optional<Department> findById(@PathVariable int id) {
        return this.departmentService.findById(id);
    }

    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public void save(@RequestBody Department department) {
        this.departmentService.save(department);
    }
}
