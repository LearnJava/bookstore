package org.jellydev.edu.bookstore.ejb.dao;

import org.jellydev.edu.bookstore.ejb.model.Comment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CommentDao implements Dao<Comment> {

    @PersistenceContext(unitName = "bs")
    private EntityManager em;


    @Override
    public Comment get(int id) {
        return em.find(Comment.class, id);
    }

    @Override
    public List<Comment> get() {
        return em.createNamedQuery("Comment.GetAll").getResultList();
    }

    @Override
    public void remove(Comment comment) {
        em.remove(comment);
    }

    @Override
    public void set(Comment comment) {
        if (get().contains(comment))
            em.merge(comment);
        else
            em.persist(comment);
    }
}
