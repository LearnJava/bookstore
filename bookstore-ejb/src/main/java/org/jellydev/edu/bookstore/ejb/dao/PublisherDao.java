package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Publisher;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PublisherDao implements Dao<Publisher> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;


    @Override
    public Publisher get(int id) {
        return em.find(Publisher.class, id);
    }

    @Override
    public List<Publisher> get() {
        return em.createNamedQuery("Publisher.GetAll").getResultList();
    }

    @Override
    public void remove(Publisher publisher) {
        em.remove(publisher);
    }

    @Override
    public void set(Publisher publisher) {
        if (get().contains(publisher))
            em.merge(publisher);
        else
            em.persist(publisher);
    }
}
