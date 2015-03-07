package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.ItemType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ItemTypeDao implements Dao<ItemType> {

    @PersistenceContext(unitName = "bs")
    EntityManager em;

    @Override
    public ItemType get(int id) {
        return em.find(ItemType.class, id);
    }

    @Override
    public List<ItemType> get() {
        return em.createNamedQuery("ItemType.GetAll").getResultList();
    }

    @Override
    public void remove(ItemType type) {
        em.remove(type);
    }

    @Override
    public void set(ItemType type) {
        if (get().contains(type))
            em.merge(type);
        else
            em.persist(type);
    }
}
