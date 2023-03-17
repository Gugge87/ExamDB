package com.ingenium.examdb.classes;

import com.ingenium.examdb.classes.Exam;
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
    @Column(name="subject_id")
    private long id;
    private String longname;
    private String shortname;
    private boolean written;

    @OneToMany(mappedBy = "subject")
    private List<Exam> exams;
}
