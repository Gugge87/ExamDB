package com.ingenium.examdb.service;

import com.ingenium.examdb.classes.Schoolclass;
import com.ingenium.examdb.database.ClassnameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolclassService {
    @Autowired
    private ClassnameRepository classnameRepository;

    public List<Schoolclass> getAllClassnames(){
        return classnameRepository.findAllByOrderByNameAsc();
    }

}
