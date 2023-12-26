package org.example.hospital.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="medical_history")
@Getter @Setter
public class MedicalHistory implements Serializable
{
    @Id
    private long id;

    private Timestamp visit_date;

    private String speciality;

    private String doctor_edits;

    private String complaints;

    @OneToMany
    @JoinColumn
    private List<UserData> fk_id_user_data;
}
