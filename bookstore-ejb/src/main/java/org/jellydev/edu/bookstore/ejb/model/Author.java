package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_author")
@NamedQueries({
        @NamedQuery(name = "Author.GetAll", query = "select a from Author a")
})
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_author_id")
    private int id;

    @Column(name = "bs_author_first_name")
    private String firstName;

    @Column(name = "bs_author_last_name")
    private String lastName;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "[ id: " + id + ", first_name: " + firstName + ", last_name:" + lastName + " ]";
    }

}
