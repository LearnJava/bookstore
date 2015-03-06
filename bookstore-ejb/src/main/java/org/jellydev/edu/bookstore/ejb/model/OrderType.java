package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_order_type")
public class OrderType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_order_type_id")
    private int id;

    @Column(name = "bs_order_type_header")
    private String header;

    @Column(name = "bs_order_type_description")
    private String description;

}
