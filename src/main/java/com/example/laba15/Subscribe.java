package com.example.laba15;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/subscribe")
public class Subscribe extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (PrintWriter writer = response.getWriter()) {
            String name = request.getParameter("username");
            String email = request.getParameter("email");
            // TODO validate email

            if (name.isEmpty() | email.isEmpty()) {
                writer.println("<p>Please, fill name/e-mail correctly</p>");
                writer.println("<br><a href=\"subscribe.html\">To subscribe</a>");
            }
            else{
                writer.println("<p>" + name + ", you are successfully subscribed!</p>");
                // TODO subscribe
            }
            writer.println("<br><a href=\"index.html\">To start page</a>");

        }
    }
}
