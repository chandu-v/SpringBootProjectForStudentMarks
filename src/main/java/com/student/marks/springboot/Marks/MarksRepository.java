package com.student.marks.springboot.Marks;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends CrudRepository<Marks,Integer> {

    List<Marks> findAllByStudentId(int id);
    
}
