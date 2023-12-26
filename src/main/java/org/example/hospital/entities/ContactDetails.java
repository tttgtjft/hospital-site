package org.example.hospital.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="contact_details")
@Getter @Setter
public class ContactDetails implements Serializable
{
    @Id
    private long id;

    private String fcs;

    private String phone;

    private int age;
}
