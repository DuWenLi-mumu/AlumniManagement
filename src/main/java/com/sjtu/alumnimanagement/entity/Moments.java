package com.sjtu.alumnimanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "moments")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
@Data
public class Moments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private String date;
    @Column(name = "description")
    private String description;
    @Column(name = "address")
    private String address;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "picture")
    private String picture;
}
