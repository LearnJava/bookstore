package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_ordered_items")
public class OrderedItems implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Item orderedItem;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Order.class)
    @JoinColumn(name = "bs_order")
    private Order order;

    public OrderedItems() {
    }

    public int getId() {
        return id;
    }

    public Item getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(Item orderedItem) {
        this.orderedItem = orderedItem;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
