package com.ingenium.examdb.service;

import com.ingenium.examdb.classes.Exam;
import com.ingenium.examdb.database.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public List<Exam> getAllExamsByStudent(long studentid){
        return examRepository.findExamsByStudentId(studentid);
    }

    public Exam createExam(Exam exam){
        exam.setId(null);
        exam = examRepository.save(exam);
        return exam;
    }
}
