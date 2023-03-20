package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Long> {

}
