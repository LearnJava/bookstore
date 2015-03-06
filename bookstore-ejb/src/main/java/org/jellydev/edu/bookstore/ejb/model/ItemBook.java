package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bs_item_book")
@PrimaryKeyJoinColumn(name = "bs_item_id")
public class ItemBook extends Item implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Author author;

    @Column(name = "bs_item_book_isbn")
    private String isbn;

    @Column(name = "bs_item_book_publish_date")
    private Date publishDate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "bs_author_book",
            joinColumns = @JoinColumn(name = "bs_book"),
            inverseJoinColumns = @JoinColumn(name = "bs_author")

    )
    private List<Author> authors;

    public ItemBook() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

}
