package com.student.marks.springboot.Marks;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {

    @Autowired
    MarksRepository marksRepository;

    public Optional<Marks> getAllMarks(int id) {
        return this.marksRepository.findById(id);
    }

    public List<Marks> getAllMarksOfStudent(int id) {
        return this.marksRepository.findAllByStudentId(id);
    }

    public void addMarks(Marks marks){
        this.marksRepository.save(marks);
    }
    
}
