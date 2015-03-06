package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_log_type")
public class LogType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_log_type_id")
    private int id;

    @Column(name = "bs_log_type_header")
    private String header;

    @Column(name = "bs_log_type_description")
    private String description;

}
