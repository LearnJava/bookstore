package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "bs_log")
public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_log_id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    LogType type;

    @Column(name = "bs_log_datetime")
    private Date datetime;

    @Column(name = "bs_log_header")
    private String header;

    @Column(name = "bs_log_message")
    private String message;

}
