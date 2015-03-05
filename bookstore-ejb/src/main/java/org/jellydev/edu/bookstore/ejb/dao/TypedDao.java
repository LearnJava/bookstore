package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Author;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "authorDao")
public class TypedDao implements Dao {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public Author get(int id) {
        return em.find(Author.class, id);
    }

    @Override
    public List<Author> get() {
        return em.createNamedQuery("Author.GetAll").getResultList();
    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void remove(Object o) {

    }
}
