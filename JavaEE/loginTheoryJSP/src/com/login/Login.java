package com.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet(name = "/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        if(uname.equals("orkhan") && pass.equals("o")){

            HttpSession session = request.getSession();
            session.setAttribute("username", uname);

            response.sendRedirect("welcome.jsp");
        }
        else
        {
            response.sendRedirect("login.jsp");

        }
    }
}