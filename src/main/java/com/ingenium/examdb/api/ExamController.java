package com.ingenium.examdb.api;

import com.ingenium.examdb.classes.Exam;
import com.ingenium.examdb.database.ExamRepository;
import com.ingenium.examdb.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examdb")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/students/{studentid}/exams")
    public List<Exam> studentexams(@PathVariable long studentid){
        return examService.getAllExamsByStudent(studentid);
    }

    @PostMapping("/students/{studentid}/exams")
    public Exam createExam(@PathVariable long studentid, @RequestBody Exam exam){
        return examService.createExam(studentid, exam.getSubject());
    }

}
