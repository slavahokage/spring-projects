package com.servlets.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Form extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        StringBuilder form = new StringBuilder();
        form.append("<html>");
        form.append("<form action='/'>");
        form.append("<input name='a'><br>");
        form.append("<input name='b'><br>");
        form.append("<button type='submit'> Calc! </button> <br>");
        form.append("</form>");
        form.append("</html>");
        if (req.getParameter("a") != null && req.getParameter("b") != null) {
            String a = req.getParameter("a");
            String b = req.getParameter("b");
            int answer = Integer.valueOf(b) + Integer.valueOf(a);
            form.append("<br><h1>"+answer+"</h1>");
            resp.getWriter().println(form.toString());
        }else {
            resp.getWriter().println(form.toString());
        }
    }
}
