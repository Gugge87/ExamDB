package com.ingenium.examdb;

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
    @GeneratedValue
    private long id;
    private LocalDate date;
    private int duration;

    @ManyToOne
    @JoinColumn(name="student")
    private Student student;
    @ManyToOne
    @JoinColumn(name="exam")
    private Exam exam;

}
