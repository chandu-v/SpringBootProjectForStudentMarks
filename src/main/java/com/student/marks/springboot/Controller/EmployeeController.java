package com.student.marks.springboot.Controller;

import java.util.List;
import java.util.Optional;


import com.student.marks.springboot.Bean.Department;
import com.student.marks.springboot.Bean.Employee;
import com.student.marks.springboot.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> findAll() {
        return this.employeeService.findAll();
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET) 
    public Optional<Employee> findById(@PathVariable int id) {
        return this.employeeService.findById(id);
    }

    @RequestMapping(value = "/employee/department/{id}", method = RequestMethod.POST) 
    public void save(@RequestBody Employee employee,@PathVariable int id) {
        Department department = new Department();
        department.setDeptId(id);
        employee.setDepartment(department);
        this.employeeService.save(employee);
    }

}
