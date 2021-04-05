package com.student.marks.springboot.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students")
    public List<Student> getStudentDetails(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/students",method = RequestMethod.POST) 
    public void addStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
    }

    @RequestMapping(value = "/students",method = RequestMethod.PUT) 
    public void updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
    }
}
