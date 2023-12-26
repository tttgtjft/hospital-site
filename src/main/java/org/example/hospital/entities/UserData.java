package org.example.hospital.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_data")
@Getter @Setter
public class UserData implements Serializable
{
    @Id
    private long id;

    private String login;

    private String password;

    private String email;

    @OneToOne
    @JoinColumn
    private ContactDetails fk_id_contact_details;
}
