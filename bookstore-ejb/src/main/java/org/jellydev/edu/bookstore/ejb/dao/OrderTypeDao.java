package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.OrderType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrderTypeDao implements Dao<OrderType> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public OrderType get(int id) {
        return em.find(OrderType.class, id);
    }

    @Override
    public List<OrderType> get() {
        return em.createNamedQuery("OrderType.GetAll").getResultList();
    }

    @Override
    public void remove(OrderType type) {
        em.remove(type);
    }

    @Override
    public void set(OrderType type) {
        if (get().contains(type))
            em.merge(type);
        else
            em.persist(type);
    }
}
