package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_item_type")
@NamedQueries({
        @NamedQuery(name = "ItemType.GetAll", query = "select it from ItemType it")
})
public class ItemType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_item_type_id")
    private int id;

    @Column(name = "bs_item_type_header")
    private String header;

    @Column(name = "bs_item_type_descripion")
    private String description;

    public ItemType() {
    }

    public int getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
