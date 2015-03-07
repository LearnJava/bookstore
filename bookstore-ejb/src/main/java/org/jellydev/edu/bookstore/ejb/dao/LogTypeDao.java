package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.LogType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class LogTypeDao implements Dao<LogType> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public LogType get(int id) {
        return em.find(LogType.class, id);
    }

    @Override
    public List<LogType> get() {
        return em.createNamedQuery("LogType.GetAll").getResultList();
    }

    @Override
    public void remove(LogType type) {
        em.remove(type);
    }

    @Override
    public void set(LogType type) {
        if (get().contains(type))
            em.merge(type);
        else
            em.persist(type);
    }
}
