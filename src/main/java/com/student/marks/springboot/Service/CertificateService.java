package com.student.marks.springboot.Service;

import java.util.List;

import com.student.marks.springboot.Bean.Certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {
    
    @Autowired
    CertificateService certificateRepository;

    public List<Certificate> findAll() {
        return this.certificateRepository.findAll();
    }

    public Certificate findById(int id) {
        return this.certificateRepository.findById(id);
    }

    public void save(Certificate certificate) {
        this.certificateRepository.save(certificate);
    }
}
