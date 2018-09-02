package com.servlets.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        if (req.getParameter("a") != null && req.getParameter("b") != null) {
            String a = req.getParameter("a");
            String b = req.getParameter("b");
            int answer = Integer.valueOf(b) + Integer.valueOf(a);
            String response1 = "<h1>a+b = ";
            response1 = response1 + answer + "</h1>";
            out.print(response1);
        } else {
            out.print("hello");
        }
    }
}
