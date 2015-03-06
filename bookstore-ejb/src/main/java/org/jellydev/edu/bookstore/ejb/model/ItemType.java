package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_item_type")
public class ItemType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_item_type_id")
    private int id;

    @Column(name = "bs_item_type_header")
    private String header;

    @Column(name = "bs_item_type_descripion")
    private String description;

}
