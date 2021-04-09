package com.student.marks.springboot.Repository;

import com.student.marks.springboot.Bean.Certificate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate,Integer> {
    
}
