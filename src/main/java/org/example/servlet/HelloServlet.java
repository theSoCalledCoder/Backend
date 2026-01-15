package org.example.servlet;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        String user_name = request.getParameter("name");
//        Cookie cookies=new Cookie("username",name);
//        response.addCookie(cookies);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
//        out.println("<h3> <a href=second?name="+user_name+"> want to meet the second servlet? </h3>");

        out.println("<form action='second' method='get'>");
        out.println("<input type='hidden' name='user_name' value= "+ user_name+">");
        out.println("<input type='submit' value='got to the second website'>");
        out.println("</form>");







        out.println("</body></html>");


//        RequestDispatcher rd= request.getRequestDispatcher("second");
//        rd.forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from GET1</h1>");
    }



    public void destroy() {

    }
}