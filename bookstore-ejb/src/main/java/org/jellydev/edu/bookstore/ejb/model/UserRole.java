package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_user_role")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_user_role_id")
    private int id;

    @Column(name = "bs_user_role_header")
    private String header;

    @Column(name = "bs_user_role_description")
    private String description;

}
