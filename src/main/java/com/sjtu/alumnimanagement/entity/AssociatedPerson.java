package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "associated_person")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class AssociatedPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "person_id")
    private int person_id;
    @Column(name = "associate_id")
    private int associate_id;

}
