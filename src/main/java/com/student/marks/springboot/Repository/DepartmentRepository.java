package com.student.marks.springboot.Repository;

import com.student.marks.springboot.Bean.Department;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
    
}
