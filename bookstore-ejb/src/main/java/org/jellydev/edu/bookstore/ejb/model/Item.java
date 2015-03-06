package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_item_id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private ItemType type;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private ItemCategory category;

    @Column(name = "bs_item_description")
    private String description;

    @Column(name = "price")
    private int price;

}
