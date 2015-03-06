package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "bs_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_user_id")
    private int id;

    @Column(name = "bs_user_registration_date")
    private Date registrationDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private UserRole role;

    @Column(name = "bs_user_firstname")
    private String firstName;

    @Column(name = "bs_user_lastname")
    private String lastName;

    @Column(name = "bs_user_phone")
    private String phone;

    @Column(name = "bs_user_email")
    private String email;

    @Column(name = "bs_user_address")
    private String address;

}
