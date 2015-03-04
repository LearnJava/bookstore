package org.jellydev.edu.bookstore.ejb.dao;

import java.util.List;

public interface Dao<T> {

    T get(int id);
    List<T> get();
    void set(T t);
    void remove(T t);

}
