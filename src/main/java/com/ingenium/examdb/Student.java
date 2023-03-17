package com.ingenium.examdb;

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
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String lastname;

    @ManyToOne
    @JoinColumn(name="classname")
    private Schoolclass schoolclass;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="exam")
    private List<Exam> studentsExamList;
}
