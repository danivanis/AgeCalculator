package com.siit.servlets;

import com.sitt.app.AgeCalc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AgeCalcServlet", urlPatterns = "/myAge")
public class AgeCalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //get printwriter
        PrintWriter out = response.getWriter();
        //generate html
        out.println("<html><body>");
        out.println("<title>Age Calculator</title>");
        out.println("Danut Ivanis was born " + AgeCalc.Calculator() + " days ago!");
        out.println("</body><html>");
    }
}
