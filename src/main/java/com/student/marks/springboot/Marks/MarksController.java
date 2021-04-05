package com.student.marks.springboot.Marks;

import java.util.List;

import com.student.marks.springboot.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {
    
    @Autowired
    private MarksService marksService;

    @RequestMapping(value = "/students/{id}/marks") 
    public List<Marks> getAllMarks(@PathVariable int id) {
        return this.marksService.getAllMarksOfStudent(id);
    }

    @RequestMapping(value = "/students/{id}/marks", method = RequestMethod.POST) 
    public void addMarks(@PathVariable int id, @RequestBody Marks marks) {
        marks.setStudent(new Student(id,""));
        this.marksService.addMarks(marks);
    }
}
