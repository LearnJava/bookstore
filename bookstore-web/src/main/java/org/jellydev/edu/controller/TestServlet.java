package org.jellydev.edu.controller;

import org.jellydev.edu.bookstore.ejb.dao.Dao;
import org.jellydev.edu.bookstore.ejb.model.Author;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "test", urlPatterns = "/test")
public class TestServlet extends javax.servlet.http.HttpServlet {

    @EJB(name = "authorDao")
    Dao<Author> dao;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("authors", dao.get());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
