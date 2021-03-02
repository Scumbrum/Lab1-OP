package com.example.laba15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Redirect", value = "/Redirect")
public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name.equals("Honcharenko")) {
            response.sendRedirect("person1");
        } else if (name.equals("Dmitrieva")) {
            response.sendRedirect("person3");
        } else if (name.equals("Chorniy")) {
            response.sendRedirect("Chorniy.jsp");
        }else{
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + "Invalid member" + "</h1>");
            out.println("</body></html>");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
