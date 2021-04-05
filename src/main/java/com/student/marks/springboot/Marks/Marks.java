package com.student.marks.springboot.Marks;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.student.marks.springboot.Student.Student;

@Entity
public class Marks {
    
    @ManyToOne
    private Student student;
    @Id
    private int id;
    private int m1;
    private int m2;
    private int m3;
    public Marks() {
    }
    
    public Marks(int studentId, int id, int m1, int m2, int m3) {
        this.student = new Student(studentId, "");
        this.id = id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public int getM1() {
        return m1;
    }
    public void setM1(int m1) {
        this.m1 = m1;
    }
    public int getM2() {
        return m2;
    }
    public void setM2(int m2) {
        this.m2 = m2;
    }
    public int getM3() {
        return m3;
    }
    public void setM3(int m3) {
        this.m3 = m3;
    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

}
