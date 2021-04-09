package com.student.marks.springboot.Controller;

import java.util.List;

import com.student.marks.springboot.Bean.Certificate;
import com.student.marks.springboot.Service.CertificateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {
    
    @Autowired
    CertificateService certificateService;

    @RequestMapping(value = "/certificate", method = RequestMethod.GET)
    public List<Certificate> findAll() {
        return this.certificateService.findAll();
    }

    @RequestMapping(value = "/certificate/{id}", method = RequestMethod.GET)
    public Certificate findById(@PathVariable int id) {
        return this.findById(id);
    }

    @RequestMapping(value = "/certificate",method = RequestMethod.POST) 
    public void save(@RequestBody Certificate certificate) {
        this.certificateService.save(certificate);
    }

}
