package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAllStudentsBySchoolclassIdOrderByLastname(Long schoolclassid);

}
