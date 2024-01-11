package com.kursach.hospitalsite.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="medical_history")
@Getter @Setter
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Timestamp visit_date;

    private String speciality;

    private String doctor_edits;

    private String complaints;

    @ManyToOne
    @JoinColumn
    private UserData fk_id_user_data;

}
