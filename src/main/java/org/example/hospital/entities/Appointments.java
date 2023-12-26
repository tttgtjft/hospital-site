package org.example.hospital.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="appointments")
@Getter @Setter
public class Appointments implements Serializable
{
    @Id
    private long id;

    private Timestamp schedule;

    @OneToMany
    @JoinColumn
    private List<Staff> fk_id_staff;

    @OneToMany
    @JoinColumn
    private List<UserData> fk_id_user_data;
}
