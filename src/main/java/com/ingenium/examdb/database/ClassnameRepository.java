package com.ingenium.examdb.database;

import com.ingenium.examdb.classes.Schoolclass;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClassnameRepository extends CrudRepository<Schoolclass, Long> {
    List<Schoolclass> findAllByOrderByNameAsc();
}
