package com.ingenium.examdb.service;

import com.ingenium.examdb.classes.Student;
import com.ingenium.examdb.database.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(long schoolclassid){
        return studentRepository.findAllStudentsBySchoolclassIdOrderByLastname(schoolclassid);
    }

}
