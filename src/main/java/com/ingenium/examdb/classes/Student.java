package com.ingenium.examdb.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ingenium.examdb.classes.Exam;
import com.ingenium.examdb.classes.Schoolclass;
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
@Table(name="student")
public class Student {
    @Id
    @Column(name="student_id")
    private long id;
    private String firstname;
    private String lastname;

    @ManyToOne
    @JoinColumn(name="classname")
    private Schoolclass schoolclass;

    @OneToMany(mappedBy = "student")
    @JsonIgnore
    private List<Exam> exams;
}
