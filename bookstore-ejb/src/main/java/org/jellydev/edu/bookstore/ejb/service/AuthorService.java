package org.jellydev.edu.bookstore.ejb.service;

import org.jellydev.edu.bookstore.ejb.dao.Dao;
import org.jellydev.edu.bookstore.ejb.model.Author;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class AuthorService {

    @EJB
    private Dao<Author> dao;

    public Author get(int id) {
        return dao.get(id);
    }

    public List<Author> get() {
        return dao.get();
    }

    public void set(Author author) {
        dao.set(author);
    }

}
