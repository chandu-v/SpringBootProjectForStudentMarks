package com.student.marks.springboot.Bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    @ManyToOne
    private Department department;

    @ManyToMany
    private List<Certificate> certificates;
    public Employee() {
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<Certificate> getCertificates() {
        return certificates;
    }
    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
    public Employee(int empId, String empName, Department department, List<Certificate> certificates) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.certificates = certificates;
    }
    


    
}
