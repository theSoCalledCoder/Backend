package org.example.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class second extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("second one is called");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out= response.getWriter();
        out.println("<a href=\"hello\">Hello</a>");
        String name=request.getParameter("user_name");
        out.println("Hello " + name + " welcome back");
//        String name = null;
//        Cookie[] cookies = request.getCookies();
//
//        if (cookies != null) {
//            for (Cookie c : cookies) {
//                if ("username".equals(c.getName())) {
//                    name = c.getValue();
//                    break;
//                }
//            }
//        }
//
//        if (name == null) {
//            out.println("username cookie not found");
//        } else {
//            out.println("Hello " + name + " welcome back");
//        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from GET2</h1>");

        HttpSession hs= request.getSession(false);
        String name=null;
        if(hs!=null){
            name=(String)hs.getAttribute("name");
        }
//        String name=request.getParameter("user_name");
//        String name = null;
//        Cookie[] cookies = request.getCookies();
//
//        if (cookies != null) {
//            for (Cookie c : cookies) {
//                if ("username".equals(c.getName())) {
//                    name = c.getValue();
//                    break;
//                }
//            }
//        }
//
//        if (name == null) {
//            out.println("username cookie not found");
//        } else {
            out.println("Hello " + name + " welcome back");
//        }

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
