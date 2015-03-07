package org.jellydev.edu.bookstore.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bs_user_role")
@NamedQueries({
        @NamedQuery(name = "UserRole.GetAll", query = "select ur from UserRole ur")
})
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bs_user_role_id")
    private int id;

    @Column(name = "bs_user_role_header")
    private String header;

    @Column(name = "bs_user_role_description")
    private String description;

    public UserRole() {
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
