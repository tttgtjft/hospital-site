package com.kursach.hospitalsite.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="appointments")
@Getter @Setter
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Timestamp schedule;

    @ManyToOne
    @JoinColumn
    private Staff fk_id_staff;

    @ManyToOne
    @JoinColumn
    private UserData fk_id_user_data;

}