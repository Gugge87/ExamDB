package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Exam;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamRepository extends CrudRepository<Exam, Long> {
    List<Exam> findExamsByStudentId(Long studentid);

}
