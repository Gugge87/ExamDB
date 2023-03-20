package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Long> {

}
