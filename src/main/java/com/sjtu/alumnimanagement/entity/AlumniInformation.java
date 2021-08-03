package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "alumni_information")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class AlumniInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "person_id")
    private int person_id;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "person_class")
    private String person_class;
    @Column(name = "institute")
    private String institute;
    @Column(name = "major")
    private String major;
    @Column(name = "student_number")
    private String student_number;
    @Column(name = "tutor_name")
    private String tutor_name;
    @Column(name = "assistant_name")
    private String assistant_name;
    @Column(name = "records_of_honor")
    private String records_of_honor;
}
