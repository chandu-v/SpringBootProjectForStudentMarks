package com.student.marks.springboot.Repository;

import java.util.List;

import com.student.marks.springboot.Bean.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
 
    public List<Employee> findAllByDepartmentDeptId(int id);
}
