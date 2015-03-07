package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserDao implements Dao<User> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;

    @Override
    public User get(int id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> get() {
        return em.createNamedQuery("User.GetAll").getResultList();
    }

    @Override
    public void remove(User user) {
        em.remove(user);
    }

    @Override
    public void set(User user) {
        if (get().contains(user))
            em.merge(user);
        else
            em.persist(user);
    }
}
