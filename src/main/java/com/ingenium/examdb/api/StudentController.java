package com.ingenium.examdb.api;

import com.ingenium.examdb.classes.Exam;
import com.ingenium.examdb.classes.Student;
import com.ingenium.examdb.service.ExamService;
import com.ingenium.examdb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examdb")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/schoolclasses/{schoolclassid}/students")
    public List<Student> students(@PathVariable long schoolclassid){
        return studentService.getAllStudents(schoolclassid);
    }
}
