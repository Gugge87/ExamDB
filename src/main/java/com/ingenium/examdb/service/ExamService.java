package com.ingenium.examdb.service;

import com.ingenium.examdb.classes.Exam;
import com.ingenium.examdb.classes.Student;
import com.ingenium.examdb.classes.Subject;
import com.ingenium.examdb.database.ExamRepository;
import com.ingenium.examdb.database.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<Exam> getAllExamsByStudent(long studentid){
        return examRepository.findExamsByStudentId(studentid);
    }

    public Exam createExam(long studentid, Subject subject){
        Optional<Student> studento = studentRepository.findById(studentid);

        if (studento.isPresent()) {
            Student student = studento.get();
            Exam exam = new Exam();
            exam.setSubject(subject);
            exam.setStudent(student);
            return examRepository.save(exam);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
        }
    }
}
