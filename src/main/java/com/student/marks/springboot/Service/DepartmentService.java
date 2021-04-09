package com.student.marks.springboot.Service;

import java.util.List;
import java.util.Optional;

import com.student.marks.springboot.Bean.Department;
import com.student.marks.springboot.Repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return (List<Department>) this.departmentRepository.findAll();
    }

    public Optional<Department> findById(int id) {
        return this.departmentRepository.findById(id);
    }

    public void save(Department department) {
        this.departmentRepository.save(department);
    } 
}
