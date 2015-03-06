package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bs_item_book")
@PrimaryKeyJoinColumn(name = "bs_item_id")
public class ItemBook extends Item {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Author author;

    @Column(name = "bs_item_book_isbn")
    private String isbn;

    @Column(name = "bs_item_book_publish_date")
    private Date publishDate;

}
