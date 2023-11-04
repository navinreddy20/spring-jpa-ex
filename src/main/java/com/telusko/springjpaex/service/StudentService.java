package com.telusko.springjpaex.service;

import com.telusko.springjpaex.StudentRepo;
import com.telusko.springjpaex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public void save(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
       return repo.findAll();
    }

}
