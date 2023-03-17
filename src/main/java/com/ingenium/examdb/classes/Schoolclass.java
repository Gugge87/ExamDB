package com.ingenium.examdb.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "classname", length = 10)
    private String name;

    @OneToMany(mappedBy = "schoolclass")
    @JsonIgnore //Vermeidung des Zirkelbezugs beim Umwandlung des Json
    private List<Student> studentList;

}
