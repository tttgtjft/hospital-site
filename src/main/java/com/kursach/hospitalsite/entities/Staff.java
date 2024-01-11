package com.kursach.hospitalsite.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="staff")
@Getter @Setter
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String speciality;

    @OneToOne
    @JoinColumn
    private ContactDetails fk_id_contact_details;

}
