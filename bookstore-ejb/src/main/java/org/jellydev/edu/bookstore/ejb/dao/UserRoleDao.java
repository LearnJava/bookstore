package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.UserRole;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserRoleDao implements Dao<UserRole> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;


    @Override
    public UserRole get(int id) {
        return em.find(UserRole.class, id);
    }

    @Override
    public List<UserRole> get() {
        return em.createNamedQuery("UserRole.GetAll").getResultList();
    }

    @Override
    public void remove(UserRole role) {
        em.remove(role);
    }

    @Override
    public void set(UserRole role) {
        if (get().contains(role))
            em.merge(role);
        else
            em.persist(role);
    }
}
