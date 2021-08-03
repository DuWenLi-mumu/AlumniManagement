package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "family_relation")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class FamilyRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "person_id")
    private int person_id;
    @Column(name = "family_id")
    private int family_id;
    @Column(name = "relation")
    private String relation;

}
