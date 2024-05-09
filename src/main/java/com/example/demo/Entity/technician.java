package com.example.demo.Entity;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "technician")
@Getter
@Setter
public class technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID")
    private int TechnicianID;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "Dni")
    private String Dni;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "Age")
    private int Age;

}
