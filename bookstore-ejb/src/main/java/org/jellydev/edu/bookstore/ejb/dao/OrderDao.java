package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Order;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrderDao implements Dao<Order> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Order get(int id) {
        return em.find(Order.class, id);
    }

    @Override
    public List<Order> get() {
        return em.createNamedQuery("Order.GetAll").getResultList();
    }

    @Override
    public void remove(Order order) {
        em.remove(order);
    }

    @Override
    public void set(Order order) {
        if (get().contains(order))
            em.merge(order);
        else
            em.persist(order);
    }
}
