package com.student.marks.springboot.Service;

import java.util.List;
import java.util.Optional;

import com.student.marks.springboot.Bean.Employee;
import com.student.marks.springboot.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return (List<Employee>) this.employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id) {
        return this.employeeRepository.findById(id);
    }

    public void save(Employee emp) {
        this.employeeRepository.save(emp);
    }

    public List<Employee> findAllByDepartmentId(int departmentId) {
        return this.employeeRepository.findAllByDepartmentDeptId(departmentId);
    }
}
