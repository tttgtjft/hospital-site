package org.example.hospital.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="staff")
@Getter @Setter
public class Staff implements Serializable
{
    @Id
    private long id;

    private String speciality;

    @OneToOne
    @JoinColumn
    private ContactDetails fk_id_contact_details;
}
