package com.kursach.hospitalsite.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="contact_details")
@Getter @Setter
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String fcs;

    private String phone;

    private int age;

}