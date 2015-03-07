package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_order_type")
@NamedQueries({
        @NamedQuery(name = "OrderType.GetAll", query = "select ot from OrderType ot")
})
public class OrderType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_order_type_id")
    private int id;

    @Column(name = "bs_order_type_header")
    private String header;

    @Column(name = "bs_order_type_description")
    private String description;

    public OrderType() {
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
