package com.ingenium.examdb.api;

import com.ingenium.examdb.classes.Schoolclass;
import com.ingenium.examdb.service.SchoolclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examdb")
public class ClassnameController {

    @Autowired SchoolclassService schoolclassService;

    @GetMapping("/schoolclasses")
    public List<Schoolclass> classes(){
        return schoolclassService.getAllClassnames();
    }
}
