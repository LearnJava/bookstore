package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.ItemCategory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ItemCategoryDao implements Dao<ItemCategory> {

    @PersistenceContext(unitName = "bs")
    EntityManager em;

    @Override
    public ItemCategory get(int id) {
        return em.find(ItemCategory.class, id);
    }

    @Override
    public List<ItemCategory> get() {
        return em.createNamedQuery("ItemCategory.GetAll").getResultList();
    }

    @Override
    public void remove(ItemCategory category) {
        em.remove(category);
    }

    @Override
    public void set(ItemCategory category) {
        if (get().contains(category))
            em.merge(category);
        else
            em.persist(category);
    }
}
