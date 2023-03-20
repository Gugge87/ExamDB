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

    public List<Exam> getAllExamsByStudent(Long studentid){
        return examRepository.findAllByStudentId(studentid);
    }
}
