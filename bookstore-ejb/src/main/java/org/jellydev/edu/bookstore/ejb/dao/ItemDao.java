package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Item;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ItemDao implements Dao<Item> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public Item get(int id) {
        return em.find(Item.class, id);
    }

    @Override
    public List<Item> get() {
        return em.createNamedQuery("Item.GetAll").getResultList();
    }

    @Override
    public void remove(Item item) {
        em.remove(item);
    }

    @Override
    public void set(Item item) {
        if (get().contains(item))
            em.merge(item);
        else
            em.persist(item);
    }
}
