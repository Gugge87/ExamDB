package com.ingenium.examdb.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exam {

    @Id
    @Column(name="exam_id")
    private long id;
    @Column(name="dateofexam")
    private LocalDate date;
    private int duration;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="student")
    private Student student;

    @ManyToOne
    @JoinColumn(name="subject")
    private Subject subject;
    
}
