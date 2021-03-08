package com.example.laba15;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Redirect", value = "/Redirect")
public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name.equals("Honcharenko")) {
            response.sendRedirect("Honcharenko.html");
        } else if (name.equals("Dmitrieva")) {
            response.sendRedirect("Dmitrieva.html");
        } else if (name.equals("Chorniy")) {
            response.sendRedirect("Chorniy.html");
        }else{
            response.sendError(404);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
