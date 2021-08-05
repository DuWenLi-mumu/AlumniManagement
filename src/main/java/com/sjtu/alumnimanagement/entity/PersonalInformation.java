package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "personal_information")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class PersonalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_card")
    private String id_card;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "postcode")
    private String postcode;
    @Column(name = "iphone")
    private String iphone;
    @Column(name = "email")
    private String email;
    @Column(name = "native_place")
    private String native_place;
    @Column(name = "work_unit")
    private String work_unit;

}
