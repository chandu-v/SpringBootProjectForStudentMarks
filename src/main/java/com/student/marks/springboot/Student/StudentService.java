package com.student.marks.springboot.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return (List<Student>) this.studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return this.studentRepository.findById(id);
    }

    public void addStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void deletStudent(int id) {
        this.studentRepository.deleteById(id);
    }
}
