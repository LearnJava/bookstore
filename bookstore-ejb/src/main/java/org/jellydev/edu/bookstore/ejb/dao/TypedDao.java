package org.jellydev.edu.bookstore.ejb.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TypedDao<Author> implements Dao {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public Object get(int id) {
        return null;
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
