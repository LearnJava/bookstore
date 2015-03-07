package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.ItemBook;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ItemBookDao implements Dao<ItemBook> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public ItemBook get(int id) {
        return em.find(ItemBook.class, id);
    }

    @Override
    public List<ItemBook> get() {
        return em.createNamedQuery("ItemBook.GetAll").getResultList();
    }

    @Override
    public void remove(ItemBook book) {
        em.remove(book);
    }

    @Override
    public void set(ItemBook book) {
        if (get().contains(book))
            em.merge(book);
        else
            em.persist(book);
    }
}
