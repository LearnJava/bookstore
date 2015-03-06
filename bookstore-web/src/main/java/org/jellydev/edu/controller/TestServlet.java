package org.jellydev.edu.controller;

import org.jellydev.edu.bookstore.ejb.service.AuthorService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "test", urlPatterns = "/test")
public class TestServlet extends javax.servlet.http.HttpServlet {

    @EJB
    AuthorService authorService;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("authors", authorService.get());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
