package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Schoolclass;
import org.springframework.data.repository.CrudRepository;

public interface ClassnameRepository extends CrudRepository<Schoolclass, Long> {

}
