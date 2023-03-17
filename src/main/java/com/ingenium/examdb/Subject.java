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
public class Subject {
    @Id
    @GeneratedValue
    private long id;
    private String longname;
    private String shortname;
    private boolean written;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="exams")
    private List<Exam> examList;
}
