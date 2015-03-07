package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Log;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class LogDao implements Dao<Log> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public Log get(int id) {
        return em.find(Log.class, id);
    }

    @Override
    public List<Log> get() {
        return em.createNamedQuery("Log.GetAll").getResultList();
    }

    @Override
    public void remove(Log log) {
        em.remove(log);
    }

    @Override
    public void set(Log log) {
        if (get().contains(log))
            em.merge(log);
        else
            em.persist(log);
    }
}
