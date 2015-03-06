package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;

@Entity
@Table(name = "bs_item_category")
public class ItemCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_item_category_id")
    private int id;

    @Column(name = "bs_item_category_header")
    private String header;

    @Column(name = "bs_item_category_description")
    private String description;


}
