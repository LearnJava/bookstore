package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bs_publisher")
@NamedQueries(
        @NamedQuery(name = "Publisher.GetAll", query = "select p from Publisher p")
)
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_publisher_id")
    private int id;

    @Column(name = "bs_publisher_header")
    private String header;

    @Column(name = "bs_publisher_descriptor")
    private String descriptor;

    @Column(name = "bs_publisher_logo")
    private byte[] logo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "publisher")
    private List<ItemBook> books;

    public Publisher() {
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

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public List<ItemBook> getBooks() {
        return books;
    }

    public void setBooks(List<ItemBook> books) {
        this.books = books;
    }

}
