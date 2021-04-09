package com.student.marks.springboot.Bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Certificate {
    
    @Id
    private int certificateId;
    private String certificateName;

    @OneToMany(mappedBy = "certificates")
    private List<Employee> employees;
    public Certificate() {
    }
    public Certificate(int certificateId, String certificateName, List<Employee> employees) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.employees = employees;
    }
    public int getCertificateId() {
        return certificateId;
    }
    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }
    public String getCertificateName() {
        return certificateName;
    }
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
   
    
}
