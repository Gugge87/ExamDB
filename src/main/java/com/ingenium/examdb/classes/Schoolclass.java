package com.ingenium.examdb.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classname")
public class Schoolclass {
    @Id
    @Column(name = "class_id")
    private long id;
    private String name;

    @OneToMany(mappedBy = "schoolclass")
    private List<Student> studentList;

}
