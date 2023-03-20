package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
