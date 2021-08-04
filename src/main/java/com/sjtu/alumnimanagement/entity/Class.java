package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "class")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "level")
    private int level;
    @Column(name = "level_name")
    private String level_name;

}
