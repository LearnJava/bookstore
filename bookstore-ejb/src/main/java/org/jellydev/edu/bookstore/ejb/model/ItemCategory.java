package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_item_category")
public class ItemCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_item_category_id")
    private int id;

    @Column(name = "bs_item_category_header")
    private String header;

    @Column(name = "bs_item_category_description")
    private String description;


}