package com.student.marks.springboot.Bean;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    
    @Id
    private int deptId;
    private String departmentName;
    private String address;

    public Department() {}

    public Department(int deptId, String departmentName, String address) {
        this.deptId = deptId;
        this.departmentName = departmentName;
        this.address = address;
    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    

}
